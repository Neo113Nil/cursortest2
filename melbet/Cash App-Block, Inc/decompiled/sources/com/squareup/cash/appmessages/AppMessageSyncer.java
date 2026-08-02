package com.squareup.cash.appmessages;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.molecule.GatedFrameClock;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.activity.backend.contacts.RealQuickAccessBarStore;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdDownloader;
import com.squareup.cash.appmessages.holders.PendingInlineMessageHolder;
import com.squareup.cash.appmessages.holders.PendingPopupMessageHolder$CardTabPlacementHolder;
import com.squareup.cash.autofillweb.real.RealCashFillJsStore;
import com.squareup.cash.bitcoin.applets.presenters.BitcoinAppletTilePresenter$Factory$Impl;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinAppletTileRepository;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.moneybot.components.plugins.ActionCardPlugin;
import com.squareup.cash.moneybot.components.plugins.BriefPlugin;
import com.squareup.cash.moneybot.components.plugins.CellActionCardPlugin;
import com.squareup.cash.moneybot.components.plugins.NavigationCardPlugin;
import com.squareup.cash.moneybot.components.plugins.PromptButtonListPlugin;
import com.squareup.cash.moneybot.components.plugins.TextCardPlugin;
import com.squareup.cash.moneybot.presenters.plugins.ActionCardPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.plugins.BriefPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.plugins.CellActionCardPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.plugins.PromptButtonListPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.plugins.TextCardPresenter$Factory$Impl;
import com.squareup.cash.nearby.backend.RealNearbyPermissionStateProvider;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealDatadogClient;
import com.squareup.cash.observability.backend.real.RealErrorReporter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.observability.types.ThrowableScribe;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.profile.views.ProfilePhotoResolver;
import com.squareup.cash.profile.views.ProfilePhotoUrlRegistry;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.clientsync.service.ClientSyncAppApiService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class AppMessageSyncer implements UiActivitySetupTeardown {
    public final Flow activityEvents;
    public final RealAppMessageManager appMessageManager;
    public final SessionManager sessionManager;

    public AppMessageSyncer(RealAppMessageManager realAppMessageManager, Flow flow, SessionManager sessionManager) {
        this.appMessageManager = realAppMessageManager;
        this.activityEvents = flow;
        this.sessionManager = sessionManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new GatedFrameClock.AnonymousClass1((Continuation) null, this, 26), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory activityEvents;
        public final Provider appMessageManager;
        public final Provider sessionManager;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.appMessageManager = provider;
            this.sessionManager = provider2;
            this.activityEvents = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.sessionManager;
            Provider provider2 = this.appMessageManager;
            InstanceFactory instanceFactory = this.activityEvents;
            switch (i) {
                case 0:
                    RealAppMessageManager realAppMessageManager = (RealAppMessageManager) provider2.invoke();
                    Flow flow = (Flow) instanceFactory.value;
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    realAppMessageManager.getClass();
                    flow.getClass();
                    sessionManager.getClass();
                    return new AppMessageSyncer(realAppMessageManager, flow, sessionManager);
                case 1:
                    Activity activity = (Activity) instanceFactory.value;
                    RealAppLockState realAppLockState = (RealAppLockState) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    activity.getClass();
                    realAppLockState.getClass();
                    featureFlagManager.getClass();
                    return new AppLockRecentScreenshotsDisabler(activity, realAppLockState, featureFlagManager);
                case 2:
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    coroutineScope.getClass();
                    coroutineContext.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new RealQuickAccessBarStore(cashAccountDatabaseImpl, coroutineContext, coroutineScope);
                case 3:
                    RealFileDownloader realFileDownloader = (RealFileDownloader) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    realFileDownloader.getClass();
                    coroutineContext2.getClass();
                    coroutineScope2.getClass();
                    return new RealFullscreenAdDownloader(realFileDownloader, coroutineContext2, coroutineScope2);
                case 4:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext3.getClass();
                    coroutineScope3.getClass();
                    return new WorkReviewTermsBanner$configFlow$$inlined$map$1(cashAccountDatabaseImpl2, coroutineContext3, coroutineScope3, 1);
                case 5:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl3.getClass();
                    coroutineContext4.getClass();
                    coroutineScope4.getClass();
                    return new PendingInlineMessageHolder.ActivityPlacementHolder(cashAccountDatabaseImpl3, coroutineContext4, coroutineScope4);
                case 6:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl4.getClass();
                    coroutineContext5.getClass();
                    coroutineScope5.getClass();
                    return new PendingInlineMessageHolder.ProfilePlacementHolder(cashAccountDatabaseImpl4, coroutineContext5, coroutineScope5);
                case 7:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl5.getClass();
                    coroutineContext6.getClass();
                    coroutineScope6.getClass();
                    return new WorkReviewTermsBanner$configFlow$$inlined$map$1(cashAccountDatabaseImpl5, coroutineContext6, coroutineScope6, 2);
                case 8:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl6 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl6.getClass();
                    coroutineContext7.getClass();
                    coroutineScope7.getClass();
                    return new PendingPopupMessageHolder$CardTabPlacementHolder(cashAccountDatabaseImpl6, coroutineContext7, coroutineScope7, 1);
                case 9:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl7 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext8 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope8 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl7.getClass();
                    coroutineContext8.getClass();
                    coroutineScope8.getClass();
                    return new PendingPopupMessageHolder$CardTabPlacementHolder(cashAccountDatabaseImpl7, coroutineContext8, coroutineScope8, 2);
                case 10:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl8 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext9 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope9 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl8.getClass();
                    coroutineContext9.getClass();
                    coroutineScope9.getClass();
                    return new PendingPopupMessageHolder$CardTabPlacementHolder(cashAccountDatabaseImpl8, coroutineContext9, coroutineScope9, 0);
                case 11:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl9 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext10 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope10 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl9.getClass();
                    coroutineContext10.getClass();
                    coroutineScope10.getClass();
                    return new PendingPopupMessageHolder$CardTabPlacementHolder(cashAccountDatabaseImpl9, coroutineContext10, coroutineScope10, 3);
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl10 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext11 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope11 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl10.getClass();
                    coroutineContext11.getClass();
                    coroutineScope11.getClass();
                    return new PendingPopupMessageHolder$CardTabPlacementHolder(cashAccountDatabaseImpl10, coroutineContext11, coroutineScope11, 4);
                case 13:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl11 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext12 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope12 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl11.getClass();
                    coroutineContext12.getClass();
                    coroutineScope12.getClass();
                    return new PendingPopupMessageHolder$CardTabPlacementHolder(cashAccountDatabaseImpl11, coroutineContext12, coroutineScope12, 5);
                case 14:
                    RealCashFillJsStore realCashFillJsStore = (RealCashFillJsStore) provider2.invoke();
                    Moshi moshi = (Moshi) provider.invoke();
                    CoroutineScope coroutineScope13 = (CoroutineScope) instanceFactory.value;
                    realCashFillJsStore.getClass();
                    moshi.getClass();
                    coroutineScope13.getClass();
                    return new StuckPlayerDetector(realCashFillJsStore, moshi, coroutineScope13);
                case 15:
                    BitcoinAppletTileRepository bitcoinAppletTileRepository = (BitcoinAppletTileRepository) provider2.invoke();
                    BitcoinAppletTilePresenter$Factory$Impl bitcoinAppletTilePresenter$Factory$Impl = (BitcoinAppletTilePresenter$Factory$Impl) provider.invoke();
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) instanceFactory.value;
                    bitcoinAppletTileRepository.getClass();
                    bitcoinAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner.getClass();
                    return ListSaverKt.bitcoinApplet(bitcoinAppletTileRepository, bitcoinAppletTilePresenter$Factory$Impl, lifecycleOwner);
                case 16:
                    BitcoinAppletTileRepository bitcoinAppletTileRepository2 = (BitcoinAppletTileRepository) provider2.invoke();
                    BitcoinAppletTilePresenter$Factory$Impl bitcoinAppletTilePresenter$Factory$Impl2 = (BitcoinAppletTilePresenter$Factory$Impl) provider.invoke();
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) instanceFactory.value;
                    bitcoinAppletTileRepository2.getClass();
                    bitcoinAppletTilePresenter$Factory$Impl2.getClass();
                    lifecycleOwner2.getClass();
                    return ListSaverKt.liteBitcoinApplet(bitcoinAppletTileRepository2, bitcoinAppletTilePresenter$Factory$Impl2, lifecycleOwner2);
                case 17:
                    RealClipboardManager realClipboardManager = (RealClipboardManager) provider2.invoke();
                    Flow flow2 = (Flow) instanceFactory.value;
                    CoroutineContext coroutineContext13 = (CoroutineContext) provider.invoke();
                    realClipboardManager.getClass();
                    flow2.getClass();
                    coroutineContext13.getClass();
                    return new RealClipboardObserver(realClipboardManager, flow2, coroutineContext13);
                case 18:
                    ClientSyncAppApiService clientSyncAppApiService = (ClientSyncAppApiService) provider2.invoke();
                    Flow flow3 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope14 = (CoroutineScope) instanceFactory.value;
                    clientSyncAppApiService.getClass();
                    flow3.getClass();
                    coroutineScope14.getClass();
                    return new RealTargetEntityManager(clientSyncAppApiService, flow3, coroutineScope14);
                case 19:
                    ActionCardPresenter$Factory$Impl actionCardPresenter$Factory$Impl = (ActionCardPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    actionCardPresenter$Factory$Impl.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    return new ActionCardPlugin(actionCardPresenter$Factory$Impl, errorReporter, sampleStrategy);
                case 20:
                    BriefPresenter$Factory$Impl briefPresenter$Factory$Impl = (BriefPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter2 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) provider.invoke();
                    briefPresenter$Factory$Impl.getClass();
                    errorReporter2.getClass();
                    sampleStrategy2.getClass();
                    return new BriefPlugin(briefPresenter$Factory$Impl, errorReporter2, sampleStrategy2);
                case 21:
                    CellActionCardPresenter$Factory$Impl cellActionCardPresenter$Factory$Impl = (CellActionCardPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter3 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy3 = (SampleStrategy) provider.invoke();
                    cellActionCardPresenter$Factory$Impl.getClass();
                    errorReporter3.getClass();
                    sampleStrategy3.getClass();
                    return new CellActionCardPlugin(cellActionCardPresenter$Factory$Impl, errorReporter3, sampleStrategy3);
                case 22:
                    NavigationCardPresenter$Factory$Impl navigationCardPresenter$Factory$Impl = (NavigationCardPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter4 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy4 = (SampleStrategy) provider.invoke();
                    navigationCardPresenter$Factory$Impl.getClass();
                    errorReporter4.getClass();
                    sampleStrategy4.getClass();
                    return new NavigationCardPlugin(navigationCardPresenter$Factory$Impl, errorReporter4, sampleStrategy4);
                case 23:
                    PromptButtonListPresenter$Factory$Impl promptButtonListPresenter$Factory$Impl = (PromptButtonListPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter5 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy5 = (SampleStrategy) provider.invoke();
                    promptButtonListPresenter$Factory$Impl.getClass();
                    errorReporter5.getClass();
                    sampleStrategy5.getClass();
                    return new PromptButtonListPlugin(promptButtonListPresenter$Factory$Impl, errorReporter5, sampleStrategy5);
                case 24:
                    TextCardPresenter$Factory$Impl textCardPresenter$Factory$Impl = (TextCardPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter6 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy6 = (SampleStrategy) provider.invoke();
                    textCardPresenter$Factory$Impl.getClass();
                    errorReporter6.getClass();
                    sampleStrategy6.getClass();
                    return new TextCardPlugin(textCardPresenter$Factory$Impl, errorReporter6, sampleStrategy6);
                case 25:
                    RealBleManager realBleManager = (RealBleManager) provider2.invoke();
                    PermissionChecker permissionChecker = (PermissionChecker) provider.invoke();
                    Activity activity2 = (Activity) instanceFactory.value;
                    realBleManager.getClass();
                    permissionChecker.getClass();
                    activity2.getClass();
                    return new RealNearbyPermissionStateProvider(realBleManager, permissionChecker, activity2);
                case 26:
                    RealDatadogClient realDatadogClient = (RealDatadogClient) provider2.invoke();
                    BugsnagClient bugsnagClient = (BugsnagClient) instanceFactory.value;
                    ThrowableScribe throwableScribe = (ThrowableScribe) provider.invoke();
                    realDatadogClient.getClass();
                    bugsnagClient.getClass();
                    throwableScribe.getClass();
                    return new RealErrorReporter(realDatadogClient, bugsnagClient, throwableScribe);
                case 27:
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    CoroutineScope coroutineScope15 = (CoroutineScope) instanceFactory.value;
                    syncValueReader.getClass();
                    featureFlagManager2.getClass();
                    coroutineScope15.getClass();
                    return new RealAllowlistRepository(syncValueReader, featureFlagManager2, coroutineScope15);
                case 28:
                    PermissionChecker permissionChecker2 = (PermissionChecker) provider2.invoke();
                    Activity activity3 = (Activity) instanceFactory.value;
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    permissionChecker2.getClass();
                    activity3.getClass();
                    androidClock.getClass();
                    return new AndroidPermissionManager(permissionChecker2, activity3, androidClock);
                default:
                    Context context = (Context) instanceFactory.value;
                    PermissionChecker permissionChecker3 = (PermissionChecker) provider2.invoke();
                    ProfilePhotoUrlRegistry profilePhotoUrlRegistry = (ProfilePhotoUrlRegistry) provider.invoke();
                    context.getClass();
                    permissionChecker3.getClass();
                    profilePhotoUrlRegistry.getClass();
                    return new ProfilePhotoResolver(context, permissionChecker3, profilePhotoUrlRegistry);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, InstanceFactory instanceFactory, Provider provider2, int i) {
            this.$r8$classId = i;
            this.appMessageManager = provider;
            this.activityEvents = instanceFactory;
            this.sessionManager = provider2;
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.activityEvents = instanceFactory;
            this.appMessageManager = provider;
            this.sessionManager = provider2;
        }
    }
}
