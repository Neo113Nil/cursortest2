package app.cash.passcode.backend;

import android.net.Uri;
import android.telephony.TelephonyManager;
import androidx.compose.ui.draw.AlphaKt;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.TransactorKt;
import app.cash.broadway.navigation.ScreenOverrideRule;
import app.cash.cdp.backend.jvm.FlushStrategyCoordinator;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import coil3.memory.MemoryCacheService;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.backend.RealAccountSwitchAnalytics;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelCache;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.CashAppLiteBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.DefaultBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.applet.news.BitcoinNewsWidgetPlugin;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientrouting.routers.account.RoutableAccountsProvider;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrity;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AppScreenLock;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.intent.RealIntentHandler;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.overrides.DenylistScreenOverrideRule;
import com.squareup.cash.overrides.HomeScreenOverrideRule;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.support.backend.real.RealSearchPlaceholderProvider;
import com.squareup.cash.tax.views.TaxViewFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.AndroidToaster;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealAppLockState {
    public final StateFlowImpl stateFlow;

    public interface AppLockEvent {

        public final class AppStateChanged implements AppLockEvent {
            public final AppState appState;

            public AppStateChanged(AppState appState) {
                this.appState = appState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AppStateChanged) && this.appState.equals(((AppStateChanged) obj).appState);
            }

            public final int hashCode() {
                return this.appState.hashCode();
            }

            public final String toString() {
                return "AppStateChanged(appState=" + this.appState + ")";
            }
        }

        /* loaded from: classes3.dex */
        public final class AppUnlocked implements AppLockEvent {
            public static final AppUnlocked INSTANCE = new AppUnlocked();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AppUnlocked);
            }

            public final int hashCode() {
                return 1017326451;
            }

            public final String toString() {
                return "AppUnlocked";
            }
        }

        public final class FeatureFlagChanged implements AppLockEvent {
            public final FeatureFlagState featureFlagState;

            public FeatureFlagChanged(FeatureFlagState featureFlagState) {
                this.featureFlagState = featureFlagState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FeatureFlagChanged) && this.featureFlagState.equals(((FeatureFlagChanged) obj).featureFlagState);
            }

            public final int hashCode() {
                return this.featureFlagState.hashCode();
            }

            public final String toString() {
                return "FeatureFlagChanged(featureFlagState=" + this.featureFlagState + ")";
            }
        }

        public final class SyncValueChanged implements AppLockEvent {
            public final SyncValueState syncValueState;

            public SyncValueChanged(SyncValueState syncValueState) {
                this.syncValueState = syncValueState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SyncValueChanged) && this.syncValueState.equals(((SyncValueChanged) obj).syncValueState);
            }

            public final int hashCode() {
                return this.syncValueState.hashCode();
            }

            public final String toString() {
                return "SyncValueChanged(syncValueState=" + this.syncValueState + ")";
            }
        }
    }

    public interface AppState {

        public final class Background implements AppState {
            public final long elapsedRealtime;

            public Background(long j) {
                this.elapsedRealtime = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Background) && Duration.m4166equalsimpl0(this.elapsedRealtime, ((Background) obj).elapsedRealtime);
            }

            @Override // app.cash.passcode.backend.RealAppLockState.AppState
            /* renamed from: getElapsedRealtime-UwyO8pc */
            public final long mo1345getElapsedRealtimeUwyO8pc() {
                return this.elapsedRealtime;
            }

            public final int hashCode() {
                Duration.Companion companion = Duration.Companion;
                return Long.hashCode(this.elapsedRealtime);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Background(elapsedRealtime=", Duration.m4177toStringimpl(this.elapsedRealtime), ")");
            }
        }

        public final class Foreground implements AppState {
            public final long elapsedRealtime;

            public Foreground(long j) {
                this.elapsedRealtime = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Foreground) && Duration.m4166equalsimpl0(this.elapsedRealtime, ((Foreground) obj).elapsedRealtime);
            }

            @Override // app.cash.passcode.backend.RealAppLockState.AppState
            /* renamed from: getElapsedRealtime-UwyO8pc */
            public final long mo1345getElapsedRealtimeUwyO8pc() {
                return this.elapsedRealtime;
            }

            public final int hashCode() {
                Duration.Companion companion = Duration.Companion;
                return Long.hashCode(this.elapsedRealtime);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Foreground(elapsedRealtime=", Duration.m4177toStringimpl(this.elapsedRealtime), ")");
            }
        }

        /* renamed from: getElapsedRealtime-UwyO8pc, reason: not valid java name */
        long mo1345getElapsedRealtimeUwyO8pc();
    }

    public interface FeatureFlagState {

        public final class Disabled implements FeatureFlagState {
            public static final Disabled INSTANCE = new Disabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public final int hashCode() {
                return 517558028;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        public final class Enabled implements FeatureFlagState {
            public final long timeoutDuration;

            public Enabled(long j) {
                this.timeoutDuration = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Enabled) && Duration.m4166equalsimpl0(this.timeoutDuration, ((Enabled) obj).timeoutDuration);
            }

            public final int hashCode() {
                Duration.Companion companion = Duration.Companion;
                return Long.hashCode(this.timeoutDuration);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Enabled(timeoutDuration=", Duration.m4177toStringimpl(this.timeoutDuration), ")");
            }
        }
    }

    public final class InternalState {
        public final AppState appState;
        public final FeatureFlagState featureFlagState;
        public final long lastActiveElapsedRealtime;
        public final LockState lockState;
        public final SyncValueState syncValueState;

        public InternalState(LockState lockState, AppState appState, FeatureFlagState featureFlagState, SyncValueState syncValueState, long j) {
            this.lockState = lockState;
            this.appState = appState;
            this.featureFlagState = featureFlagState;
            this.syncValueState = syncValueState;
            this.lastActiveElapsedRealtime = j;
        }

        /* renamed from: copy-9VgGkz4$default, reason: not valid java name */
        public static InternalState m1346copy9VgGkz4$default(InternalState internalState, LockState lockState, AppState appState, FeatureFlagState featureFlagState, SyncValueState syncValueState, long j, int i) {
            if ((i & 1) != 0) {
                lockState = internalState.lockState;
            }
            LockState lockState2 = lockState;
            if ((i & 2) != 0) {
                appState = internalState.appState;
            }
            AppState appState2 = appState;
            if ((i & 4) != 0) {
                featureFlagState = internalState.featureFlagState;
            }
            FeatureFlagState featureFlagState2 = featureFlagState;
            if ((i & 8) != 0) {
                syncValueState = internalState.syncValueState;
            }
            SyncValueState syncValueState2 = syncValueState;
            if ((i & 16) != 0) {
                j = internalState.lastActiveElapsedRealtime;
            }
            return new InternalState(lockState2, appState2, featureFlagState2, syncValueState2, j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalState)) {
                return false;
            }
            InternalState internalState = (InternalState) obj;
            return this.lockState.equals(internalState.lockState) && this.appState.equals(internalState.appState) && this.featureFlagState.equals(internalState.featureFlagState) && this.syncValueState.equals(internalState.syncValueState) && Duration.m4166equalsimpl0(this.lastActiveElapsedRealtime, internalState.lastActiveElapsedRealtime);
        }

        /* renamed from: expired-LRDsOJo, reason: not valid java name */
        public final boolean m1347expiredLRDsOJo(long j) {
            LockState lockState = this.lockState;
            if (lockState instanceof LockState.Unlocked) {
                return false;
            }
            if (lockState instanceof LockState.Locked) {
                return true;
            }
            if (getFeatureIsEnabled()) {
                return Duration.m4164compareToLRDsOJo(Duration.m4172minusLRDsOJo(j, this.lastActiveElapsedRealtime), ((FeatureFlagState.Enabled) this.featureFlagState).timeoutDuration) > 0;
            }
            return false;
        }

        public final boolean getFeatureIsEnabled() {
            return (this.featureFlagState instanceof FeatureFlagState.Enabled) && (this.syncValueState instanceof SyncValueState.Enabled);
        }

        public final int hashCode() {
            int hashCode = (this.syncValueState.hashCode() + ((this.featureFlagState.hashCode() + ((this.appState.hashCode() + (this.lockState.hashCode() * 31)) * 31)) * 31)) * 31;
            Duration.Companion companion = Duration.Companion;
            return Long.hashCode(this.lastActiveElapsedRealtime) + hashCode;
        }

        public final InternalState nextState(AppLockEvent appLockEvent) {
            appLockEvent.getClass();
            if (appLockEvent instanceof AppLockEvent.FeatureFlagChanged) {
                return m1346copy9VgGkz4$default(this, null, null, ((AppLockEvent.FeatureFlagChanged) appLockEvent).featureFlagState, null, 0L, 27);
            }
            boolean z = appLockEvent instanceof AppLockEvent.SyncValueChanged;
            AppState appState = this.appState;
            SyncValueState syncValueState = this.syncValueState;
            if (z) {
                SyncValueState syncValueState2 = ((AppLockEvent.SyncValueChanged) appLockEvent).syncValueState;
                InternalState m1346copy9VgGkz4$default = m1346copy9VgGkz4$default(this, null, null, null, syncValueState2, 0L, 23);
                return ((syncValueState instanceof SyncValueState.Default) && !(syncValueState2 instanceof SyncValueState.Default) && (appState instanceof AppState.Foreground)) ? m1346copy9VgGkz4$default.nextState(new AppLockEvent.AppStateChanged(appState)) : m1346copy9VgGkz4$default;
            }
            boolean z2 = appLockEvent instanceof AppLockEvent.AppStateChanged;
            LockState lockState = this.lockState;
            LockState.Locked locked = LockState.Locked.INSTANCE;
            LockState.Idle idle = LockState.Idle.INSTANCE;
            LockState.Unlocked unlocked = LockState.Unlocked.INSTANCE;
            if (!z2) {
                if (!(appLockEvent instanceof AppLockEvent.AppUnlocked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (lockState.equals(locked)) {
                    return m1346copy9VgGkz4$default(this, unlocked, null, null, null, appState.mo1345getElapsedRealtimeUwyO8pc(), 14);
                }
                if (lockState.equals(unlocked)) {
                    return this;
                }
                if (lockState.equals(idle)) {
                    Timber.Forest.e("AppUnlocked received while in Idle state (background). Ignoring.", new Object[0]);
                    return this;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AppState appState2 = ((AppLockEvent.AppStateChanged) appLockEvent).appState;
            if (appState2 instanceof AppState.Background) {
                if (lockState.equals(unlocked)) {
                    return m1346copy9VgGkz4$default(this, idle, appState2, null, null, ((AppState.Background) appState2).elapsedRealtime, 12);
                }
                if (lockState.equals(locked)) {
                    return m1346copy9VgGkz4$default(this, idle, appState2, null, null, this.lastActiveElapsedRealtime, 12);
                }
                if (lockState.equals(idle)) {
                    return m1346copy9VgGkz4$default(this, null, appState2, null, null, 0L, 29);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (!(appState2 instanceof AppState.Foreground)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (syncValueState instanceof SyncValueState.Default) {
                return m1346copy9VgGkz4$default(this, idle, (AppState.Foreground) appState2, null, null, 0L, 28);
            }
            boolean featureIsEnabled = getFeatureIsEnabled();
            AppState.Foreground foreground = (AppState.Foreground) appState2;
            return !featureIsEnabled ? m1346copy9VgGkz4$default(this, unlocked, foreground, null, null, foreground.elapsedRealtime, 12) : (featureIsEnabled && m1347expiredLRDsOJo(foreground.elapsedRealtime)) ? m1346copy9VgGkz4$default(this, locked, foreground, null, null, this.lastActiveElapsedRealtime, 12) : m1346copy9VgGkz4$default(this, unlocked, foreground, null, null, foreground.elapsedRealtime, 12);
        }

        public final String toString() {
            String m4177toStringimpl = Duration.m4177toStringimpl(this.lastActiveElapsedRealtime);
            StringBuilder sb = new StringBuilder("InternalState(lockState=");
            sb.append(this.lockState);
            sb.append(", appState=");
            sb.append(this.appState);
            sb.append(", featureFlagState=");
            sb.append(this.featureFlagState);
            sb.append(", syncValueState=");
            sb.append(this.syncValueState);
            sb.append(", lastActiveElapsedRealtime=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m4177toStringimpl, ")");
        }
    }

    public interface LockState {

        public final class Idle implements LockState {
            public static final Idle INSTANCE = new Idle();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public final int hashCode() {
                return 206989259;
            }

            public final String toString() {
                return "Idle";
            }
        }

        public final class Locked implements LockState {
            public static final Locked INSTANCE = new Locked();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Locked);
            }

            public final int hashCode() {
                return 1443969345;
            }

            public final String toString() {
                return "Locked";
            }
        }

        public final class Unlocked implements LockState {
            public static final Unlocked INSTANCE = new Unlocked();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unlocked);
            }

            public final int hashCode() {
                return -1740669094;
            }

            public final String toString() {
                return "Unlocked";
            }
        }
    }

    public interface SyncValueState {

        public final class Default implements SyncValueState {
            public static final Default INSTANCE = new Default();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Default);
            }

            public final int hashCode() {
                return -1863906339;
            }

            public final String toString() {
                return "Default";
            }
        }

        public final class Disabled implements SyncValueState {
            public static final Disabled INSTANCE = new Disabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public final int hashCode() {
                return 1975105632;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        /* loaded from: classes3.dex */
        public final class Enabled implements SyncValueState {
            public static final Enabled INSTANCE = new Enabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Enabled);
            }

            public final int hashCode() {
                return -723336995;
            }

            public final String toString() {
                return "Enabled";
            }
        }
    }

    public RealAppLockState(FeatureFlagManager featureFlagManager, StateFlow stateFlow) {
        Duration timeout = TransactorKt.timeout((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AppScreenLock.INSTANCE));
        PasscodeSettings passcodeSettings = (PasscodeSettings) stateFlow.getValue();
        Duration.Companion.getClass();
        this.stateFlow = FlowKt.MutableStateFlow(new InternalState(LockState.Idle.INSTANCE, new AppState.Background(0L), timeout != null ? new FeatureFlagState.Enabled(timeout.rawValue) : FeatureFlagState.Disabled.INSTANCE, passcodeSettings instanceof PasscodeSettings.Default ? SyncValueState.Default.INSTANCE : passcodeSettings.getAppLockActivated() ? SyncValueState.Enabled.INSTANCE : SyncValueState.Disabled.INSTANCE, 0L));
    }

    public final void sendEvent(AppLockEvent appLockEvent) {
        StateFlowImpl stateFlowImpl;
        Object value;
        InternalState nextState;
        appLockEvent.getClass();
        do {
            stateFlowImpl = this.stateFlow;
            value = stateFlowImpl.getValue();
            InternalState internalState = (InternalState) value;
            nextState = internalState.nextState(appLockEvent);
            Timber.Forest forest = Timber.Forest;
            forest.i("Event " + appLockEvent, new Object[0]);
            if (internalState.equals(nextState)) {
                forest.i("** no state transition", new Object[0]);
            } else {
                forest.i("** transitioning from: " + internalState, new Object[0]);
                forest.i("**                 to: " + nextState, new Object[0]);
            }
        } while (!stateFlowImpl.compareAndSet(value, nextState));
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider featureFlagManager;
        public final Provider passcodeSettings;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.featureFlagManager = provider;
            this.passcodeSettings = provider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 1;
            int i3 = 2;
            int i4 = 0;
            Provider provider = this.passcodeSettings;
            Provider provider2 = this.featureFlagManager;
            switch (i) {
                case 0:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    StateFlow stateFlow = (StateFlow) ((RealContactDetailsSyncState.MetroFactory) provider).invoke();
                    featureFlagManager.getClass();
                    return new RealAppLockState(featureFlagManager, stateFlow);
                case 1:
                    List list = (List) ((RealPasscodeFlowStarter.MetroFactory) provider2).invoke();
                    MemoryCacheService memoryCacheService = (MemoryCacheService) ((RealPasscodeFlowStarter.MetroFactory) provider).invoke();
                    list.getClass();
                    return new FlushStrategyCoordinator(list, memoryCacheService);
                case 2:
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new ScreenOverrideRule[]{(DenylistScreenOverrideRule) ((MusicViewFactory$MetroFactory) provider2).invoke(), (HomeScreenOverrideRule) ((WalletUiFactory$MetroFactory) provider).invoke()});
                case 3:
                    RealAccountSwitchAnalytics realAccountSwitchAnalytics = (RealAccountSwitchAnalytics) ((TreehouseFlows.MetroFactory) provider).invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    syncValueReader.getClass();
                    return new RealAccountholderAccountRepository(realAccountSwitchAnalytics, syncValueReader);
                case 4:
                    OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) ((AndroidToaster.MetroFactory) provider2).invoke();
                    ((PermissionChecker) ((DoubleCheck) provider).getValue()).getClass();
                    StringBuilder sb = new StringBuilder();
                    TelephonyManager telephonyManager = (TelephonyManager) anonymousClass1.val$callback;
                    sb.append(Uri.encode(telephonyManager != null ? telephonyManager.getSimCountryIso() : null));
                    sb.append("; ");
                    sb.append(Uri.encode(telephonyManager != null ? telephonyManager.getSimOperator() : null));
                    sb.append("; ");
                    sb.append(Uri.encode(telephonyManager != null ? telephonyManager.getSimOperatorName() : null, " "));
                    sb.append("; no_permission");
                    return sb.toString();
                case 5:
                    Reward$Adapter reward$Adapter = (Reward$Adapter) ((RealFilamentSupportProvider.MetroFactory) provider).invoke();
                    RealBitcoinGraphModelCache realBitcoinGraphModelCache = (RealBitcoinGraphModelCache) provider2.invoke();
                    realBitcoinGraphModelCache.getClass();
                    return new RealBitcoinGraphModelProvider(reward$Adapter, realBitcoinGraphModelCache);
                case 6:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider2.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                    return AlphaKt.provideBitcoinFeatureAvailabilityProvider((ArcadeModule$ProvideHapticVibratorMetroFactory) provider, cashAppLiteReleaseModule$$ExternalSyntheticLambda0);
                case 7:
                    DefaultBitcoinWidgetAllowlistProvider defaultBitcoinWidgetAllowlistProvider = (DefaultBitcoinWidgetAllowlistProvider) DefaultBitcoinWidgetAllowlistProvider.MetroFactory.INSTANCE.invoke();
                    CashAppLiteBitcoinWidgetAllowlistProvider cashAppLiteBitcoinWidgetAllowlistProvider = (CashAppLiteBitcoinWidgetAllowlistProvider) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider).invoke();
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda02 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider2.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda02.getClass();
                    return AlphaKt.provideBitcoinWidgetAllowlistProvider(defaultBitcoinWidgetAllowlistProvider, cashAppLiteBitcoinWidgetAllowlistProvider, cashAppLiteReleaseModule$$ExternalSyntheticLambda02);
                case 8:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider2.invoke();
                    StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) ((RealReferralManager.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider, stuckPlayerDetector, i2);
                case 9:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    n nVar = (n) ((TreehouseFlows.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider2.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider2, nVar, i3);
                case 10:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider3 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    StuckPlayerDetector stuckPlayerDetector2 = (StuckPlayerDetector) ((TaxViewFactory.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider3.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider3, stuckPlayerDetector2, 3);
                case 11:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider4 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    BinaryBitmap binaryBitmap = (BinaryBitmap) ((BorrowUiFactory.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider4.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider4, binaryBitmap, 4);
                case 12:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider5 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    Result result = (Result) ((BorrowUiFactory.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider5.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider5, result, 5);
                case 13:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider6 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    HCaptcha hCaptcha = (HCaptcha) ((RealFamilyAppletTileRepository.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider6.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider6, hCaptcha, 6);
                case 14:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider7 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    zzr zzrVar = (zzr) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider7.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider7, zzrVar, 7);
                case 15:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider8 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    n nVar2 = (n) ((TreehouseFlows.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider8.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider8, nVar2, 8);
                case 16:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider9 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    n nVar3 = (n) ((TreehouseFlows.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider9.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider9, nVar3, i4);
                case 17:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider10 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealBugReportSenderFactory realBugReportSenderFactory = (RealBugReportSenderFactory) ((RealRecipientRepository.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider10.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider10, realBugReportSenderFactory, 9);
                case 18:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider11 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    n nVar4 = (n) ((TreehouseFlows.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider11.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider11, nVar4, 10);
                case 19:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider12 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter = (BitcoinStackingToolsPresenter) ((RealIntentHandler.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider12.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider12, bitcoinStackingToolsPresenter, 11);
                case 20:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider13 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    StuckPlayerDetector stuckPlayerDetector3 = (StuckPlayerDetector) ((TaxViewFactory.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider13.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider13, stuckPlayerDetector3, 12);
                case 21:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider14 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealSearchPlaceholderProvider realSearchPlaceholderProvider = (RealSearchPlaceholderProvider) ((BorrowUiFactory.MetroFactory) provider).invoke();
                    realBitcoinCapabilityProvider14.getClass();
                    return new BitcoinNewsWidgetPlugin(realBitcoinCapabilityProvider14, realSearchPlaceholderProvider, 13);
                case 22:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) provider2).getValue();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) provider).invoke();
                    featureFlagManager2.getClass();
                    realProfileManager.getClass();
                    return new BinaryBitmap(17, featureFlagManager2, realProfileManager);
                case 23:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider2.invoke();
                    KeyValue keyValue = (KeyValue) ((BorrowUiFactory.MetroFactory) provider).invoke();
                    syncValueReader2.getClass();
                    return new RoutableAccountsProvider(syncValueReader2, keyValue);
                case 24:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda03 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider2.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda03.getClass();
                    return SnapshotParcelsKt.provideCryptoIdvStatusRepo$real((RealTrifleService.MetroFactory) provider, cashAppLiteReleaseModule$$ExternalSyntheticLambda03);
                case 25:
                    RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) provider2.invoke();
                    RealInvestmentActivity realInvestmentActivity = (RealInvestmentActivity) ((WalletUiFactory$MetroFactory) provider).invoke();
                    realCryptoBalanceRepo.getClass();
                    return new RealBitcoinActivityProvider(realCryptoBalanceRepo, realInvestmentActivity);
                case 26:
                    RealBitcoinConfigRepo realBitcoinConfigRepo = (RealBitcoinConfigRepo) ((TemporaryStorage.MetroFactory) provider).invoke();
                    FlowStarter flowStarter = (FlowStarter) provider2.invoke();
                    flowStarter.getClass();
                    return new RealCryptoFlowStarter(realBitcoinConfigRepo, flowStarter);
                case 27:
                    BinaryBitmap binaryBitmap2 = (BinaryBitmap) ((TemporaryStorage.MetroFactory) provider).invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider2.invoke();
                    featureFlagManager3.getClass();
                    return new Result(25, binaryBitmap2, featureFlagManager3);
                case 28:
                    Flow flow = (Flow) ((LocalViewFactory.MetroFactory) provider).invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider2.invoke();
                    syncValueReader3.getClass();
                    return new KeysetHandle(27, flow, syncValueReader3);
                default:
                    RealDeviceIntegrity realDeviceIntegrity = (RealDeviceIntegrity) provider2.invoke();
                    Instrument$Adapter instrument$Adapter = (Instrument$Adapter) ((RealKeyStoreProvider.MetroFactory) provider).invoke();
                    realDeviceIntegrity.getClass();
                    return new RealDeviceIntegrityAttester(realDeviceIntegrity, instrument$Adapter);
            }
        }

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, int i) {
            this.$r8$classId = i;
            this.passcodeSettings = factory;
            this.featureFlagManager = provider;
        }
    }
}
