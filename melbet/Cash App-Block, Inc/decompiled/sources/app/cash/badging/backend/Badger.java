package app.cash.badging.backend;

import androidx.room.TransactorKt;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.api.Badger2;
import app.cash.local.primitives.MarketingMessageBadging;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$1$2$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2$2$1;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appmessages.AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.blockers.analytics.RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.clientrouting.routers.account.RoutableAccount;
import com.squareup.cash.clientrouting.routers.account.RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.persistence.RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewEvent;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1;
import com.squareup.cash.core.presenters.MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1;
import com.squareup.cash.crypto.amount.BitcoinAmount;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1;
import com.squareup.cash.data.SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1;
import com.squareup.cash.data.SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.ContactsSyncState;
import com.squareup.cash.data.contacts.RealContactRepository$recents$$inlined$mapItems$1$2$1;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.db2.entities.Sync_entity;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.onboarding.backend.OnboardingFlowTokenManager$FlowToken;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.protos.cash.aegis.sync_values.Dependent;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.util.android.layout.LayoutHelpersKt;
import com.squareup.workflow1.ui.CompatibleKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Badger implements Flow {
    public final Instrument$Adapter accountInstrumentsBadger;
    public final Flow activityAppMessagesCount;
    public final Badger2 badger2;
    public final Flow balanceTabAppMessagesCount;
    public final Flow bankingTabBadgeCount;
    public final Flow bitcoinAppMessagesCount;
    public final Flow cardTabAppMessagesCount;
    public final WireAdapter chatBadger;
    public final Flow finishSetupTileBadgeCount;
    public final Flow identityVerificationBadger;
    public final Flow investingAppMessagesCount;
    public final Flow limitsPageletBadger;
    public final Flow offersTabAppMessagesCount;
    public final Flow paymentPadAppMessagesCount;
    public final Flow profilePersonalMessagesCount;

    public final class MetroFactory implements Factory {
        public final RealKeyStoreProvider.MetroFactory accountInstrumentsBadger;
        public final LocalViewFactory.MetroFactory activityAppMessagesCount;
        public final Provider badger2;
        public final LocalViewFactory.MetroFactory balanceTabAppMessagesCount;
        public final ArcadeModule$ProvideHapticVibratorMetroFactory bankingTabBadgeCount;
        public final LocalViewFactory.MetroFactory bitcoinAppMessagesCount;
        public final LocalViewFactory.MetroFactory cardTabAppMessagesCount;
        public final BreadcrumbListener.MetroFactory chatBadger;
        public final BorrowUiFactory.MetroFactory finishSetupTileBadgeCount;
        public final FillrInitializer.MetroFactory identityVerificationBadger;
        public final LocalViewFactory.MetroFactory investingAppMessagesCount;
        public final AttestedKeyMetrics$MetroFactory limitsPageletBadger;
        public final LocalViewFactory.MetroFactory offersTabAppMessagesCount;
        public final LocalViewFactory.MetroFactory paymentPadAppMessagesCount;
        public final RealTrifleService.MetroFactory profilePersonalMessagesCount;

        public MetroFactory(LocalViewFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, LocalViewFactory.MetroFactory metroFactory2, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, LocalViewFactory.MetroFactory metroFactory3, LocalViewFactory.MetroFactory metroFactory4, LocalViewFactory.MetroFactory metroFactory5, FillrInitializer.MetroFactory metroFactory6, LocalViewFactory.MetroFactory metroFactory7, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, LocalViewFactory.MetroFactory metroFactory8, RealTrifleService.MetroFactory metroFactory9, BreadcrumbListener.MetroFactory metroFactory10, RealKeyStoreProvider.MetroFactory metroFactory11, BorrowUiFactory.MetroFactory metroFactory12) {
            this.activityAppMessagesCount = metroFactory;
            this.badger2 = doubleCheck;
            this.balanceTabAppMessagesCount = metroFactory2;
            this.bankingTabBadgeCount = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.bitcoinAppMessagesCount = metroFactory3;
            this.cardTabAppMessagesCount = metroFactory4;
            this.offersTabAppMessagesCount = metroFactory5;
            this.identityVerificationBadger = metroFactory6;
            this.investingAppMessagesCount = metroFactory7;
            this.limitsPageletBadger = attestedKeyMetrics$MetroFactory;
            this.paymentPadAppMessagesCount = metroFactory8;
            this.profilePersonalMessagesCount = metroFactory9;
            this.chatBadger = metroFactory10;
            this.accountInstrumentsBadger = metroFactory11;
            this.finishSetupTileBadgeCount = metroFactory12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Flow flow = (Flow) this.activityAppMessagesCount.invoke();
            Badger2 badger2 = (Badger2) this.badger2.invoke();
            Flow flow2 = (Flow) this.balanceTabAppMessagesCount.invoke();
            Flow flow3 = (Flow) this.bankingTabBadgeCount.invoke();
            Flow flow4 = (Flow) this.bitcoinAppMessagesCount.invoke();
            Flow flow5 = (Flow) this.cardTabAppMessagesCount.invoke();
            Flow flow6 = (Flow) this.offersTabAppMessagesCount.invoke();
            Flow flow7 = (Flow) this.identityVerificationBadger.invoke();
            Flow flow8 = (Flow) this.investingAppMessagesCount.invoke();
            Flow flow9 = (Flow) this.limitsPageletBadger.invoke();
            Flow flow10 = (Flow) this.paymentPadAppMessagesCount.invoke();
            Flow flow11 = (Flow) this.profilePersonalMessagesCount.invoke();
            WireAdapter wireAdapter = (WireAdapter) this.chatBadger.invoke();
            Instrument$Adapter instrument$Adapter = (Instrument$Adapter) this.accountInstrumentsBadger.invoke();
            Flow flow12 = (Flow) this.finishSetupTileBadgeCount.invoke();
            badger2.getClass();
            return new Badger(flow, badger2, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, wireAdapter, instrument$Adapter, flow12);
        }
    }

    public Badger(Flow flow, Badger2 badger2, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Flow flow6, Flow flow7, Flow flow8, Flow flow9, Flow flow10, Flow flow11, WireAdapter wireAdapter, Instrument$Adapter instrument$Adapter, Flow flow12) {
        this.activityAppMessagesCount = flow;
        this.badger2 = badger2;
        this.balanceTabAppMessagesCount = flow2;
        this.bankingTabBadgeCount = flow3;
        this.bitcoinAppMessagesCount = flow4;
        this.cardTabAppMessagesCount = flow5;
        this.offersTabAppMessagesCount = flow6;
        this.identityVerificationBadger = flow7;
        this.investingAppMessagesCount = flow8;
        this.limitsPageletBadger = flow9;
        this.paymentPadAppMessagesCount = flow10;
        this.profilePersonalMessagesCount = flow11;
        this.chatBadger = wireAdapter;
        this.accountInstrumentsBadger = instrument$Adapter;
        this.finishSetupTileBadgeCount = flow12;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        RealBadger2 realBadger2 = (RealBadger2) this.badger2;
        final FlowUtil$createFlow$$inlined$map$1 countFor = realBadger2.countFor("ACTIVITY");
        final int i = 0;
        Continuation continuation2 = null;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.activityAppMessagesCount, new Flow() { // from class: app.cash.badging.backend.Badger$collect$$inlined$map$1

            /* renamed from: app.cash.badging.backend.Badger$collect$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2 implements FlowCollector {
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* renamed from: app.cash.badging.backend.Badger$collect$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= PKIFailureInfo.systemUnavail;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
                    this.$r8$classId = i;
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x01ca  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x01d4  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x021d  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x0227  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x0269  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x0273  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x02c9  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x02d3  */
                /* JADX WARN: Removed duplicated region for block: B:237:0x0331  */
                /* JADX WARN: Removed duplicated region for block: B:243:0x033b  */
                /* JADX WARN: Removed duplicated region for block: B:255:0x0373  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x037d  */
                /* JADX WARN: Removed duplicated region for block: B:273:0x03b3  */
                /* JADX WARN: Removed duplicated region for block: B:279:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:293:0x03f2  */
                /* JADX WARN: Removed duplicated region for block: B:299:0x03fc  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:311:0x0430  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x043a  */
                /* JADX WARN: Removed duplicated region for block: B:331:0x046c  */
                /* JADX WARN: Removed duplicated region for block: B:337:0x0476  */
                /* JADX WARN: Removed duplicated region for block: B:349:0x04aa  */
                /* JADX WARN: Removed duplicated region for block: B:355:0x04b4  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:369:0x04e6  */
                /* JADX WARN: Removed duplicated region for block: B:375:0x04f0  */
                /* JADX WARN: Removed duplicated region for block: B:390:0x0529  */
                /* JADX WARN: Removed duplicated region for block: B:396:0x0533  */
                /* JADX WARN: Removed duplicated region for block: B:413:0x0586  */
                /* JADX WARN: Removed duplicated region for block: B:419:0x0590  */
                /* JADX WARN: Removed duplicated region for block: B:447:0x060a  */
                /* JADX WARN: Removed duplicated region for block: B:453:0x0614  */
                /* JADX WARN: Removed duplicated region for block: B:467:0x0649  */
                /* JADX WARN: Removed duplicated region for block: B:473:0x0653  */
                /* JADX WARN: Removed duplicated region for block: B:490:0x0694  */
                /* JADX WARN: Removed duplicated region for block: B:496:0x069e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:510:0x06d3  */
                /* JADX WARN: Removed duplicated region for block: B:516:0x06dd  */
                /* JADX WARN: Removed duplicated region for block: B:528:0x0715  */
                /* JADX WARN: Removed duplicated region for block: B:534:0x071f  */
                /* JADX WARN: Removed duplicated region for block: B:546:0x0757  */
                /* JADX WARN: Removed duplicated region for block: B:552:0x0761  */
                /* JADX WARN: Removed duplicated region for block: B:568:0x07a1  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:574:0x07ab  */
                /* JADX WARN: Removed duplicated region for block: B:590:0x07f0  */
                /* JADX WARN: Removed duplicated region for block: B:596:0x07fa  */
                /* JADX WARN: Removed duplicated region for block: B:615:0x083c  */
                /* JADX WARN: Removed duplicated region for block: B:621:0x0846  */
                /* JADX WARN: Removed duplicated region for block: B:633:0x0880  */
                /* JADX WARN: Removed duplicated region for block: B:639:0x088a  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0157  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Badger$collect$lambda$1$$inlined$map$1$2$1 badger$collect$lambda$1$$inlined$map$1$2$1;
                    int i2;
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1;
                    int i3;
                    AppLockMonitor$special$$inlined$map$1$2$1 appLockMonitor$special$$inlined$map$1$2$1;
                    int i4;
                    AppLockMonitor$special$$inlined$map$2$2$1 appLockMonitor$special$$inlined$map$2$2$1;
                    int i5;
                    AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1 appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1;
                    int i6;
                    AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1 appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1;
                    int i7;
                    AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1 appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1;
                    int i8;
                    DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1 deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1;
                    int i9;
                    RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1 realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1;
                    int i10;
                    RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1 routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
                    int i11;
                    RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1;
                    int i12;
                    MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1;
                    int i13;
                    MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1;
                    int i14;
                    MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1;
                    int i15;
                    MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1;
                    int i16;
                    MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1;
                    int i17;
                    MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1 mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1;
                    int i18;
                    MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1;
                    int i19;
                    CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1 cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1;
                    int i20;
                    RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1 realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1;
                    int i21;
                    RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1 realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1;
                    int i22;
                    Long l;
                    RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1 realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1;
                    int i23;
                    RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1 realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1;
                    int i24;
                    SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1 sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1;
                    int i25;
                    SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1 sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1;
                    int i26;
                    RealContactRepository$recents$$inlined$mapItems$1$2$1 realContactRepository$recents$$inlined$mapItems$1$2$1;
                    int i27;
                    RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1;
                    int i28;
                    RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1 realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1;
                    int i29;
                    RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1 realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1;
                    int i30;
                    int i31 = this.$r8$classId;
                    long j = 0;
                    FlowCollector flowCollector = this.$this_unsafeFlow;
                    switch (i31) {
                        case 0:
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i32 = anonymousClass1.label;
                                if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                                    anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                                    Object obj2 = anonymousClass1.result;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        SafeTrace.throwOnFailure(obj2);
                                        Long l2 = new Long(((Number) obj).intValue());
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(l2, anonymousClass1) == coroutineSingletons) {
                                            break;
                                        }
                                    } else if (i != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj2);
                                    }
                                    break;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                        case 1:
                            if (continuation instanceof Badger$collect$lambda$1$$inlined$map$1$2$1) {
                                badger$collect$lambda$1$$inlined$map$1$2$1 = (Badger$collect$lambda$1$$inlined$map$1$2$1) continuation;
                                int i33 = badger$collect$lambda$1$$inlined$map$1$2$1.label;
                                if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                                    badger$collect$lambda$1$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                                    Object obj3 = badger$collect$lambda$1$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i2 = badger$collect$lambda$1$$inlined$map$1$2$1.label;
                                    if (i2 != 0) {
                                        SafeTrace.throwOnFailure(obj3);
                                        Long l3 = new Long(((Number) obj).intValue());
                                        badger$collect$lambda$1$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(l3, badger$collect$lambda$1$$inlined$map$1$2$1) == coroutineSingletons3) {
                                            break;
                                        }
                                    } else if (i2 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj3);
                                    }
                                    break;
                                }
                            }
                            badger$collect$lambda$1$$inlined$map$1$2$1 = new Badger$collect$lambda$1$$inlined$map$1$2$1(this, continuation);
                            Object obj32 = badger$collect$lambda$1$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = badger$collect$lambda$1$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                            }
                        case 2:
                            if (continuation instanceof RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1) {
                                realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1 = (RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                                int i34 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                                if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                                    realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                                    Object obj4 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i3 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                                    if (i3 != 0) {
                                        SafeTrace.throwOnFailure(obj4);
                                        SessionState sessionState = (SessionState) obj;
                                        SessionState.Authenticated authenticated = sessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState : null;
                                        r9 = authenticated != null ? ((AuthenticatedState) authenticated).getAccountToken() : null;
                                        if (r9 != null) {
                                            realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                            if (flowCollector.emit(r9, realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons4) {
                                                break;
                                            }
                                        }
                                    } else if (i3 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj4);
                                    }
                                    break;
                                }
                            }
                            realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                            Object obj42 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                            if (i3 != 0) {
                            }
                        case 3:
                            if (continuation instanceof AppLockMonitor$special$$inlined$map$1$2$1) {
                                appLockMonitor$special$$inlined$map$1$2$1 = (AppLockMonitor$special$$inlined$map$1$2$1) continuation;
                                int i35 = appLockMonitor$special$$inlined$map$1$2$1.label;
                                if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                                    appLockMonitor$special$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                                    Object obj5 = appLockMonitor$special$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i4 = appLockMonitor$special$$inlined$map$1$2$1.label;
                                    if (i4 != 0) {
                                        SafeTrace.throwOnFailure(obj5);
                                        Duration timeout = TransactorKt.timeout((FeatureFlag$StringFeatureFlag$Value) obj);
                                        RealAppLockState.AppLockEvent.FeatureFlagChanged featureFlagChanged = new RealAppLockState.AppLockEvent.FeatureFlagChanged(timeout != null ? new RealAppLockState.FeatureFlagState.Enabled(timeout.rawValue) : RealAppLockState.FeatureFlagState.Disabled.INSTANCE);
                                        appLockMonitor$special$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(featureFlagChanged, appLockMonitor$special$$inlined$map$1$2$1) == coroutineSingletons5) {
                                            break;
                                        }
                                    } else if (i4 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj5);
                                    }
                                    break;
                                }
                            }
                            appLockMonitor$special$$inlined$map$1$2$1 = new AppLockMonitor$special$$inlined$map$1$2$1(this, continuation);
                            Object obj52 = appLockMonitor$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = appLockMonitor$special$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                            }
                        case 4:
                            if (continuation instanceof AppLockMonitor$special$$inlined$map$2$2$1) {
                                appLockMonitor$special$$inlined$map$2$2$1 = (AppLockMonitor$special$$inlined$map$2$2$1) continuation;
                                int i36 = appLockMonitor$special$$inlined$map$2$2$1.label;
                                if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                                    appLockMonitor$special$$inlined$map$2$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                                    Object obj6 = appLockMonitor$special$$inlined$map$2$2$1.result;
                                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i5 = appLockMonitor$special$$inlined$map$2$2$1.label;
                                    if (i5 != 0) {
                                        SafeTrace.throwOnFailure(obj6);
                                        RealAppLockState.AppLockEvent.SyncValueChanged syncValueChanged = new RealAppLockState.AppLockEvent.SyncValueChanged(((PasscodeSettings) obj).getAppLockActivated() ? RealAppLockState.SyncValueState.Enabled.INSTANCE : RealAppLockState.SyncValueState.Disabled.INSTANCE);
                                        appLockMonitor$special$$inlined$map$2$2$1.label = 1;
                                        if (flowCollector.emit(syncValueChanged, appLockMonitor$special$$inlined$map$2$2$1) == coroutineSingletons6) {
                                            break;
                                        }
                                    } else if (i5 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj6);
                                    }
                                    break;
                                }
                            }
                            appLockMonitor$special$$inlined$map$2$2$1 = new AppLockMonitor$special$$inlined$map$2$2$1(this, continuation);
                            Object obj62 = appLockMonitor$special$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = appLockMonitor$special$$inlined$map$2$2$1.label;
                            if (i5 != 0) {
                            }
                        case 5:
                            if (continuation instanceof AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1) {
                                appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1 = (AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1) continuation;
                                int i37 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label;
                                if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                                    appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                                    Object obj7 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i6 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label;
                                    if (i6 != 0) {
                                        SafeTrace.throwOnFailure(obj7);
                                        Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj).enabled());
                                        appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(valueOf, appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1) == coroutineSingletons7) {
                                            break;
                                        }
                                    } else if (i6 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj7);
                                    }
                                    break;
                                }
                            }
                            appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1 = new AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1(this, continuation);
                            Object obj72 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                            }
                        case 6:
                            if (continuation instanceof AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1) {
                                appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1 = (AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1) continuation;
                                int i38 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label;
                                if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                                    appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                                    Object obj8 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.result;
                                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i7 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label;
                                    if (i7 != 0) {
                                        SafeTrace.throwOnFailure(obj8);
                                        Boolean valueOf2 = Boolean.valueOf(((RealAppLockState.InternalState) obj).getFeatureIsEnabled());
                                        appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label = 1;
                                        if (flowCollector.emit(valueOf2, appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1) == coroutineSingletons8) {
                                            break;
                                        }
                                    } else if (i7 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj8);
                                    }
                                    break;
                                }
                            }
                            appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1 = new AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1(this, continuation);
                            Object obj82 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label;
                            if (i7 != 0) {
                            }
                        case 7:
                            if (continuation instanceof AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1) {
                                appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1 = (AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                                int i39 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label;
                                if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                                    appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                                    Object obj9 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i8 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label;
                                    if (i8 != 0) {
                                        SafeTrace.throwOnFailure(obj9);
                                        if (((ActivityEvent) obj) == ActivityEvent.START) {
                                            appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons9) {
                                                break;
                                            }
                                        }
                                    } else if (i8 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj9);
                                    }
                                    break;
                                }
                            }
                            appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1 = new AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                            Object obj92 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label;
                            if (i8 != 0) {
                            }
                        case 8:
                            if (continuation instanceof DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1) {
                                deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1 = (DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                                int i40 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                                if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                                    deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                                    Object obj10 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i9 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                                    if (i9 != 0) {
                                        SafeTrace.throwOnFailure(obj10);
                                        Pair pair = (Pair) obj;
                                        DeepLink deepLink = (DeepLink) pair.first;
                                        OnboardingFlowTokenManager$FlowToken onboardingFlowTokenManager$FlowToken = (OnboardingFlowTokenManager$FlowToken) pair.second;
                                        if ((deepLink != null ? deepLink.payload : null) != null && onboardingFlowTokenManager$FlowToken != null) {
                                            deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons10) {
                                                break;
                                            }
                                        }
                                    } else if (i9 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj10);
                                    }
                                    break;
                                }
                            }
                            deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1 = new DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                            Object obj102 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                            if (i9 != 0) {
                            }
                        case 9:
                            if (continuation instanceof RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1) {
                                realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1 = (RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                                int i41 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label;
                                if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                                    realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                                    Object obj11 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i10 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label;
                                    if (i10 != 0) {
                                        SafeTrace.throwOnFailure(obj11);
                                        if (((AppForegroundState) obj) == AppForegroundState.BACKGROUND) {
                                            realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons11) {
                                                break;
                                            }
                                        }
                                    } else if (i10 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj11);
                                    }
                                    break;
                                }
                            }
                            realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1 = new RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                            Object obj112 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label;
                            if (i10 != 0) {
                            }
                        case 10:
                            if (continuation instanceof RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1) {
                                routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = (RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                                int i42 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                                if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                                    routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                                    Object obj12 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i11 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                                    if (i11 != 0) {
                                        SafeTrace.throwOnFailure(obj12);
                                        ArrayList filterNotNull = CollectionsKt.filterNotNull((List) obj);
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = filterNotNull.iterator();
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            if (((Dependent) next).sponsorship_tier == SponsorshipTier.MANAGED_ACCOUNT) {
                                                arrayList.add(next);
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            Dependent dependent = (Dependent) it2.next();
                                            RoutableAccount.Dependent.m3472constructorimpl(dependent);
                                            arrayList2.add(RoutableAccount.Dependent.m3471boximpl(dependent));
                                        }
                                        routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(arrayList2, routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons12) {
                                            break;
                                        }
                                    } else if (i11 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj12);
                                    }
                                    break;
                                }
                            }
                            routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = new RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                            Object obj122 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                            }
                        case 11:
                            if (continuation instanceof RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) {
                                realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = (RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) continuation;
                                int i43 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                                if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                                    realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                                    Object obj13 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i12 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                                    if (i12 != 0) {
                                        SafeTrace.throwOnFailure(obj13);
                                        List list = (List) obj;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(LayoutHelpersKt.access$toMultiplatform((Sync_entity) it3.next()));
                                        }
                                        realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(arrayList3, realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) == coroutineSingletons13) {
                                            break;
                                        }
                                    } else if (i12 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj13);
                                    }
                                    break;
                                }
                            }
                            realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = new RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1(this, continuation);
                            Object obj132 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                            }
                        case 12:
                            if (continuation instanceof MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1) {
                                mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                                int i44 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                                if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                                    Object obj14 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i13 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                                    if (i13 != 0) {
                                        SafeTrace.throwOnFailure(obj14);
                                        Boolean valueOf3 = Boolean.valueOf(((SignedInState) obj) == SignedInState.SIGNED_IN);
                                        mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(valueOf3, mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons14) {
                                            break;
                                        }
                                    } else if (i13 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj14);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                            Object obj142 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                            }
                        case 13:
                            if (continuation instanceof MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) {
                                mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 = (MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) continuation;
                                int i45 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                                if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                                    Object obj15 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i14 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                                    if (i14 != 0) {
                                        SafeTrace.throwOnFailure(obj15);
                                        if (obj instanceof MainScreensViewEvent.InAppNotificationEvent) {
                                            mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) == coroutineSingletons15) {
                                                break;
                                            }
                                        }
                                    } else if (i14 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj15);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 = new MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1(this, continuation);
                            Object obj152 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                            if (i14 != 0) {
                            }
                        case 14:
                            if (continuation instanceof MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1) {
                                mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1) continuation;
                                int i46 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                                if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                                    Object obj16 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i15 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                                    if (i15 != 0) {
                                        SafeTrace.throwOnFailure(obj16);
                                        AppMessageViewEvent event = ((MainScreensViewEvent.InAppNotificationEvent) obj).getEvent();
                                        mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(event, mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1) == coroutineSingletons16) {
                                            break;
                                        }
                                    } else if (i15 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj16);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1(this, continuation);
                            Object obj162 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                            }
                        case 15:
                            if (continuation instanceof MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) {
                                mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 = (MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) continuation;
                                int i47 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                                if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                                    Object obj17 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i16 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                                    if (i16 != 0) {
                                        SafeTrace.throwOnFailure(obj17);
                                        if (obj instanceof MainScreensViewEvent.TooltipAppMessageEvent) {
                                            mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) == coroutineSingletons17) {
                                                break;
                                            }
                                        }
                                    } else if (i16 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj17);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 = new MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1(this, continuation);
                            Object obj172 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.result;
                            CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                            if (i16 != 0) {
                            }
                        case 16:
                            if (continuation instanceof MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1) {
                                mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1) continuation;
                                int i48 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label;
                                if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                                    Object obj18 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i17 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label;
                                    if (i17 != 0) {
                                        SafeTrace.throwOnFailure(obj18);
                                        TooltipAppMessageViewEvent event2 = ((MainScreensViewEvent.TooltipAppMessageEvent) obj).getEvent();
                                        mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(event2, mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1) == coroutineSingletons18) {
                                            break;
                                        }
                                    } else if (i17 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj18);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1(this, continuation);
                            Object obj182 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label;
                            if (i17 != 0) {
                            }
                        case 17:
                            if (continuation instanceof MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1) {
                                mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1 = (MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1) continuation;
                                int i49 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label;
                                if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                                    Object obj19 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i18 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label;
                                    if (i18 != 0) {
                                        SafeTrace.throwOnFailure(obj19);
                                        if (((SignedInState) obj) == SignedInState.SIGNED_IN) {
                                            mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1) == coroutineSingletons19) {
                                                break;
                                            }
                                        }
                                    } else if (i18 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj19);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1 = new MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1(this, continuation);
                            Object obj192 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label;
                            if (i18 != 0) {
                            }
                        case 18:
                            if (continuation instanceof MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1) {
                                mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                                int i50 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                                if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                                    mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                                    Object obj20 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i19 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                                    if (i19 != 0) {
                                        SafeTrace.throwOnFailure(obj20);
                                        String valueOf4 = String.valueOf(((IndexedValue) obj).index);
                                        mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(valueOf4, mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1) == coroutineSingletons20) {
                                            break;
                                        }
                                    } else if (i19 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj20);
                                    }
                                    break;
                                }
                            }
                            mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                            Object obj202 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                            if (i19 != 0) {
                            }
                        case 19:
                            if (continuation instanceof CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1) {
                                cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1 = (CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1) continuation;
                                int i51 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label;
                                if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                                    cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                                    Object obj21 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i20 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label;
                                    if (i20 != 0) {
                                        SafeTrace.throwOnFailure(obj21);
                                        Money money = CompatibleKt.toMoney(((CryptoBalance$BitcoinBalance) obj).getAmount());
                                        cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(money, cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1) == coroutineSingletons21) {
                                            break;
                                        }
                                    } else if (i20 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj21);
                                    }
                                    break;
                                }
                            }
                            cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1 = new CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1(this, continuation);
                            Object obj212 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                            }
                        case 20:
                            if (continuation instanceof RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1) {
                                realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1 = (RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1) continuation;
                                int i52 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label;
                                if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                                    realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                                    Object obj23 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i21 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label;
                                    if (i21 != 0) {
                                        SafeTrace.throwOnFailure(obj23);
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj24 : (List) obj) {
                                            BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj24;
                                            if (balanceSnapshot.f1396type != BalanceSnapshot.Type.SECONDARY) {
                                                Money money2 = balanceSnapshot.balance;
                                                if ((money2 != null ? money2.currency_code : null) == CurrencyCode.BTC) {
                                                    arrayList4.add(obj24);
                                                }
                                            }
                                        }
                                        realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(arrayList4, realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1) == coroutineSingletons22) {
                                            break;
                                        }
                                    } else if (i21 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj23);
                                    }
                                    break;
                                }
                            }
                            realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1 = new RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1(this, continuation);
                            Object obj232 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label;
                            if (i21 != 0) {
                            }
                        case 21:
                            if (continuation instanceof RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1) {
                                realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1 = (RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1) continuation;
                                int i53 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label;
                                if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                                    realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                                    Object obj25 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.result;
                                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i22 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label;
                                    if (i22 != 0) {
                                        SafeTrace.throwOnFailure(obj25);
                                        BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) CollectionsKt.firstOrNull((List) obj);
                                        if (balanceSnapshot2 != null) {
                                            Money money3 = balanceSnapshot2.balance;
                                            if (money3 != null && (l = money3.amount) != null) {
                                                j = l.longValue();
                                            }
                                            BitcoinAmount bitcoinAmount = new BitcoinAmount(j);
                                            String str = balanceSnapshot2.instrument_token;
                                            str.getClass();
                                            r9 = new CryptoBalance$BitcoinBalance(bitcoinAmount, str, balanceSnapshot2.version);
                                        }
                                        realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label = 1;
                                        if (flowCollector.emit(r9, realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1) == coroutineSingletons23) {
                                            break;
                                        }
                                    } else if (i22 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj25);
                                    }
                                    break;
                                }
                            }
                            realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1 = new RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1(this, continuation);
                            Object obj252 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label;
                            if (i22 != 0) {
                            }
                            break;
                        case 22:
                            if (continuation instanceof RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1) {
                                realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1 = (RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1) continuation;
                                int i54 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label;
                                if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                                    realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                                    Object obj26 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i23 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label;
                                    if (i23 != 0) {
                                        SafeTrace.throwOnFailure(obj26);
                                        Long l4 = ((Money) obj).amount;
                                        l4.getClass();
                                        Boolean valueOf5 = Boolean.valueOf(l4.longValue() > 0);
                                        realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(valueOf5, realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1) == coroutineSingletons24) {
                                            break;
                                        }
                                    } else if (i23 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj26);
                                    }
                                    break;
                                }
                            }
                            realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1 = new RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1(this, continuation);
                            Object obj262 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label;
                            if (i23 != 0) {
                            }
                        case 23:
                            if (continuation instanceof RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1) {
                                realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1 = (RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1) continuation;
                                int i55 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label;
                                if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                                    realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                                    Object obj27 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i24 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label;
                                    if (i24 != 0) {
                                        SafeTrace.throwOnFailure(obj27);
                                        Pair pair2 = (Pair) obj;
                                        Boolean valueOf6 = Boolean.valueOf(((Boolean) pair2.first).booleanValue() || ((Boolean) pair2.second).booleanValue());
                                        realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(valueOf6, realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1) == coroutineSingletons25) {
                                            break;
                                        }
                                    } else if (i24 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj27);
                                    }
                                    break;
                                }
                            }
                            realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1 = new RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1(this, continuation);
                            Object obj272 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                            }
                        case 24:
                            if (continuation instanceof SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1) {
                                sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1 = (SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1) continuation;
                                int i56 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label;
                                if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                                    sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                                    Object obj28 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i25 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label;
                                    if (i25 != 0) {
                                        SafeTrace.throwOnFailure(obj28);
                                        if (((Versioned) obj).value == SignedInState.SIGNED_OUT) {
                                            sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1) == coroutineSingletons26) {
                                                break;
                                            }
                                        }
                                    } else if (i25 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj28);
                                    }
                                    break;
                                }
                            }
                            sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1 = new SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1(this, continuation);
                            Object obj282 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label;
                            if (i25 != 0) {
                            }
                        case 25:
                            if (continuation instanceof SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1) {
                                sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1 = (SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1) continuation;
                                int i57 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label;
                                if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                                    sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                                    Object obj29 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i26 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label;
                                    if (i26 != 0) {
                                        SafeTrace.throwOnFailure(obj29);
                                        Unit unit = Unit.INSTANCE;
                                        sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(unit, sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1) == coroutineSingletons27) {
                                            break;
                                        }
                                    } else if (i26 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj29);
                                    }
                                    break;
                                }
                            }
                            sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1 = new SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1(this, continuation);
                            Object obj292 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label;
                            if (i26 != 0) {
                            }
                        case 26:
                            if (continuation instanceof RealContactRepository$recents$$inlined$mapItems$1$2$1) {
                                realContactRepository$recents$$inlined$mapItems$1$2$1 = (RealContactRepository$recents$$inlined$mapItems$1$2$1) continuation;
                                int i58 = realContactRepository$recents$$inlined$mapItems$1$2$1.label;
                                if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                                    realContactRepository$recents$$inlined$mapItems$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                                    Object obj30 = realContactRepository$recents$$inlined$mapItems$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i27 = realContactRepository$recents$$inlined$mapItems$1$2$1.label;
                                    if (i27 != 0) {
                                        SafeTrace.throwOnFailure(obj30);
                                        List list2 = (List) obj;
                                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                        Iterator it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            arrayList5.add(RecipientUtil.createRecipient((ActivityRecipient) it4.next(), true));
                                        }
                                        realContactRepository$recents$$inlined$mapItems$1$2$1.label = 1;
                                        if (flowCollector.emit(arrayList5, realContactRepository$recents$$inlined$mapItems$1$2$1) == coroutineSingletons28) {
                                            break;
                                        }
                                    } else if (i27 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj30);
                                    }
                                    break;
                                }
                            }
                            realContactRepository$recents$$inlined$mapItems$1$2$1 = new RealContactRepository$recents$$inlined$mapItems$1$2$1(this, continuation);
                            Object obj302 = realContactRepository$recents$$inlined$mapItems$1$2$1.result;
                            CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realContactRepository$recents$$inlined$mapItems$1$2$1.label;
                            if (i27 != 0) {
                            }
                        case 27:
                            if (continuation instanceof RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                                realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                                int i59 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                                    realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                                    Object obj31 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i28 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                    if (i28 != 0) {
                                        SafeTrace.throwOnFailure(obj31);
                                        if (((Boolean) obj).booleanValue()) {
                                            realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                            if (flowCollector.emit(obj, realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons29) {
                                                break;
                                            }
                                        }
                                    } else if (i28 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj31);
                                    }
                                    break;
                                }
                            }
                            realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                            Object obj312 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i28 != 0) {
                            }
                        case 28:
                            if (continuation instanceof RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1) {
                                realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1 = (RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                                int i60 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                                    realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                                    Object obj33 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i29 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                    if (i29 != 0) {
                                        SafeTrace.throwOnFailure(obj33);
                                        Boolean valueOf7 = Boolean.valueOf(((ContactsSyncState) obj) != ContactsSyncState.OFF);
                                        realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                        if (flowCollector.emit(valueOf7, realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons30) {
                                            break;
                                        }
                                    } else if (i29 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj33);
                                    }
                                    break;
                                }
                            }
                            realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1 = new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                            Object obj332 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i29 != 0) {
                            }
                        default:
                            if (continuation instanceof RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1) {
                                realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = (RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                                int i61 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                                    realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                                    Object obj34 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                                    CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i30 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                    if (i30 != 0) {
                                        SafeTrace.throwOnFailure(obj34);
                                        Boolean bool = Boolean.TRUE;
                                        realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                                        if (flowCollector.emit(bool, realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons31) {
                                            break;
                                        }
                                    } else if (i30 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj34);
                                    }
                                    break;
                                }
                            }
                            realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                            Object obj342 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                            CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                            if (i30 != 0) {
                            }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector2, Continuation continuation3) {
                int i2 = i;
                FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1 = countFor;
                switch (i2) {
                    case 0:
                        Object collect = flowUtil$createFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, 0), continuation3);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object collect2 = flowUtil$createFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, 1), continuation3);
                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Badger$collect$activityCount$2(3, null, 0), i);
        ArrayList arrayList = MarketingMessageBadging.GROUP_NAMES;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            final int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            final FlowUtil$createFlow$$inlined$map$1 countFor2 = realBadger2.countFor((String) it.next());
            arrayList2.add(new Flow() { // from class: app.cash.badging.backend.Badger$collect$$inlined$map$1

                /* renamed from: app.cash.badging.backend.Badger$collect$$inlined$map$1$2, reason: invalid class name */
                public final class AnonymousClass2 implements FlowCollector {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* renamed from: app.cash.badging.backend.Badger$collect$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public int label;
                        public /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= PKIFailureInfo.systemUnavail;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
                        this.$r8$classId = i;
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
                    /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
                    /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x01ca  */
                    /* JADX WARN: Removed duplicated region for block: B:137:0x01d4  */
                    /* JADX WARN: Removed duplicated region for block: B:153:0x021d  */
                    /* JADX WARN: Removed duplicated region for block: B:159:0x0227  */
                    /* JADX WARN: Removed duplicated region for block: B:174:0x0269  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:180:0x0273  */
                    /* JADX WARN: Removed duplicated region for block: B:200:0x02c9  */
                    /* JADX WARN: Removed duplicated region for block: B:206:0x02d3  */
                    /* JADX WARN: Removed duplicated region for block: B:237:0x0331  */
                    /* JADX WARN: Removed duplicated region for block: B:243:0x033b  */
                    /* JADX WARN: Removed duplicated region for block: B:255:0x0373  */
                    /* JADX WARN: Removed duplicated region for block: B:261:0x037d  */
                    /* JADX WARN: Removed duplicated region for block: B:273:0x03b3  */
                    /* JADX WARN: Removed duplicated region for block: B:279:0x03bd  */
                    /* JADX WARN: Removed duplicated region for block: B:293:0x03f2  */
                    /* JADX WARN: Removed duplicated region for block: B:299:0x03fc  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
                    /* JADX WARN: Removed duplicated region for block: B:311:0x0430  */
                    /* JADX WARN: Removed duplicated region for block: B:317:0x043a  */
                    /* JADX WARN: Removed duplicated region for block: B:331:0x046c  */
                    /* JADX WARN: Removed duplicated region for block: B:337:0x0476  */
                    /* JADX WARN: Removed duplicated region for block: B:349:0x04aa  */
                    /* JADX WARN: Removed duplicated region for block: B:355:0x04b4  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
                    /* JADX WARN: Removed duplicated region for block: B:369:0x04e6  */
                    /* JADX WARN: Removed duplicated region for block: B:375:0x04f0  */
                    /* JADX WARN: Removed duplicated region for block: B:390:0x0529  */
                    /* JADX WARN: Removed duplicated region for block: B:396:0x0533  */
                    /* JADX WARN: Removed duplicated region for block: B:413:0x0586  */
                    /* JADX WARN: Removed duplicated region for block: B:419:0x0590  */
                    /* JADX WARN: Removed duplicated region for block: B:447:0x060a  */
                    /* JADX WARN: Removed duplicated region for block: B:453:0x0614  */
                    /* JADX WARN: Removed duplicated region for block: B:467:0x0649  */
                    /* JADX WARN: Removed duplicated region for block: B:473:0x0653  */
                    /* JADX WARN: Removed duplicated region for block: B:490:0x0694  */
                    /* JADX WARN: Removed duplicated region for block: B:496:0x069e  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
                    /* JADX WARN: Removed duplicated region for block: B:510:0x06d3  */
                    /* JADX WARN: Removed duplicated region for block: B:516:0x06dd  */
                    /* JADX WARN: Removed duplicated region for block: B:528:0x0715  */
                    /* JADX WARN: Removed duplicated region for block: B:534:0x071f  */
                    /* JADX WARN: Removed duplicated region for block: B:546:0x0757  */
                    /* JADX WARN: Removed duplicated region for block: B:552:0x0761  */
                    /* JADX WARN: Removed duplicated region for block: B:568:0x07a1  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
                    /* JADX WARN: Removed duplicated region for block: B:574:0x07ab  */
                    /* JADX WARN: Removed duplicated region for block: B:590:0x07f0  */
                    /* JADX WARN: Removed duplicated region for block: B:596:0x07fa  */
                    /* JADX WARN: Removed duplicated region for block: B:615:0x083c  */
                    /* JADX WARN: Removed duplicated region for block: B:621:0x0846  */
                    /* JADX WARN: Removed duplicated region for block: B:633:0x0880  */
                    /* JADX WARN: Removed duplicated region for block: B:639:0x088a  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x0157  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        Badger$collect$lambda$1$$inlined$map$1$2$1 badger$collect$lambda$1$$inlined$map$1$2$1;
                        int i2;
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1;
                        int i3;
                        AppLockMonitor$special$$inlined$map$1$2$1 appLockMonitor$special$$inlined$map$1$2$1;
                        int i4;
                        AppLockMonitor$special$$inlined$map$2$2$1 appLockMonitor$special$$inlined$map$2$2$1;
                        int i5;
                        AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1 appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1;
                        int i6;
                        AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1 appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1;
                        int i7;
                        AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1 appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1;
                        int i8;
                        DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1 deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1;
                        int i9;
                        RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1 realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1;
                        int i10;
                        RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1 routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1;
                        int i11;
                        RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1;
                        int i12;
                        MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1;
                        int i13;
                        MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1;
                        int i14;
                        MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1;
                        int i15;
                        MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1;
                        int i16;
                        MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1;
                        int i17;
                        MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1 mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1;
                        int i18;
                        MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1 mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1;
                        int i19;
                        CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1 cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1;
                        int i20;
                        RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1 realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1;
                        int i21;
                        RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1 realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1;
                        int i22;
                        Long l;
                        RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1 realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1;
                        int i23;
                        RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1 realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1;
                        int i24;
                        SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1 sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1;
                        int i25;
                        SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1 sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1;
                        int i26;
                        RealContactRepository$recents$$inlined$mapItems$1$2$1 realContactRepository$recents$$inlined$mapItems$1$2$1;
                        int i27;
                        RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1;
                        int i28;
                        RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1 realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1;
                        int i29;
                        RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1 realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1;
                        int i30;
                        int i31 = this.$r8$classId;
                        long j = 0;
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        switch (i31) {
                            case 0:
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i32 = anonymousClass1.label;
                                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                                        Object obj22 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            SafeTrace.throwOnFailure(obj22);
                                            Long l2 = new Long(((Number) obj).intValue());
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(l2, anonymousClass1) == coroutineSingletons2) {
                                                break;
                                            }
                                        } else if (i != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj22);
                                        }
                                        break;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj222 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                            case 1:
                                if (continuation instanceof Badger$collect$lambda$1$$inlined$map$1$2$1) {
                                    badger$collect$lambda$1$$inlined$map$1$2$1 = (Badger$collect$lambda$1$$inlined$map$1$2$1) continuation;
                                    int i33 = badger$collect$lambda$1$$inlined$map$1$2$1.label;
                                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                                        badger$collect$lambda$1$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                                        Object obj32 = badger$collect$lambda$1$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = badger$collect$lambda$1$$inlined$map$1$2$1.label;
                                        if (i2 != 0) {
                                            SafeTrace.throwOnFailure(obj32);
                                            Long l3 = new Long(((Number) obj).intValue());
                                            badger$collect$lambda$1$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(l3, badger$collect$lambda$1$$inlined$map$1$2$1) == coroutineSingletons32) {
                                                break;
                                            }
                                        } else if (i2 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj32);
                                        }
                                        break;
                                    }
                                }
                                badger$collect$lambda$1$$inlined$map$1$2$1 = new Badger$collect$lambda$1$$inlined$map$1$2$1(this, continuation);
                                Object obj322 = badger$collect$lambda$1$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = badger$collect$lambda$1$$inlined$map$1$2$1.label;
                                if (i2 != 0) {
                                }
                            case 2:
                                if (continuation instanceof RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1) {
                                    realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1 = (RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                                    int i34 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                                        realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                                        Object obj42 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i3 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                                        if (i3 != 0) {
                                            SafeTrace.throwOnFailure(obj42);
                                            SessionState sessionState = (SessionState) obj;
                                            SessionState.Authenticated authenticated = sessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState : null;
                                            r9 = authenticated != null ? ((AuthenticatedState) authenticated).getAccountToken() : null;
                                            if (r9 != null) {
                                                realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                                if (flowCollector.emit(r9, realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons42) {
                                                    break;
                                                }
                                            }
                                        } else if (i3 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj42);
                                        }
                                        break;
                                    }
                                }
                                realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                                Object obj422 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.result;
                                CoroutineSingletons coroutineSingletons422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1$2$1.label;
                                if (i3 != 0) {
                                }
                            case 3:
                                if (continuation instanceof AppLockMonitor$special$$inlined$map$1$2$1) {
                                    appLockMonitor$special$$inlined$map$1$2$1 = (AppLockMonitor$special$$inlined$map$1$2$1) continuation;
                                    int i35 = appLockMonitor$special$$inlined$map$1$2$1.label;
                                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                                        appLockMonitor$special$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                                        Object obj52 = appLockMonitor$special$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i4 = appLockMonitor$special$$inlined$map$1$2$1.label;
                                        if (i4 != 0) {
                                            SafeTrace.throwOnFailure(obj52);
                                            Duration timeout = TransactorKt.timeout((FeatureFlag$StringFeatureFlag$Value) obj);
                                            RealAppLockState.AppLockEvent.FeatureFlagChanged featureFlagChanged = new RealAppLockState.AppLockEvent.FeatureFlagChanged(timeout != null ? new RealAppLockState.FeatureFlagState.Enabled(timeout.rawValue) : RealAppLockState.FeatureFlagState.Disabled.INSTANCE);
                                            appLockMonitor$special$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(featureFlagChanged, appLockMonitor$special$$inlined$map$1$2$1) == coroutineSingletons52) {
                                                break;
                                            }
                                        } else if (i4 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj52);
                                        }
                                        break;
                                    }
                                }
                                appLockMonitor$special$$inlined$map$1$2$1 = new AppLockMonitor$special$$inlined$map$1$2$1(this, continuation);
                                Object obj522 = appLockMonitor$special$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons522 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i4 = appLockMonitor$special$$inlined$map$1$2$1.label;
                                if (i4 != 0) {
                                }
                            case 4:
                                if (continuation instanceof AppLockMonitor$special$$inlined$map$2$2$1) {
                                    appLockMonitor$special$$inlined$map$2$2$1 = (AppLockMonitor$special$$inlined$map$2$2$1) continuation;
                                    int i36 = appLockMonitor$special$$inlined$map$2$2$1.label;
                                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                                        appLockMonitor$special$$inlined$map$2$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                                        Object obj62 = appLockMonitor$special$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i5 = appLockMonitor$special$$inlined$map$2$2$1.label;
                                        if (i5 != 0) {
                                            SafeTrace.throwOnFailure(obj62);
                                            RealAppLockState.AppLockEvent.SyncValueChanged syncValueChanged = new RealAppLockState.AppLockEvent.SyncValueChanged(((PasscodeSettings) obj).getAppLockActivated() ? RealAppLockState.SyncValueState.Enabled.INSTANCE : RealAppLockState.SyncValueState.Disabled.INSTANCE);
                                            appLockMonitor$special$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(syncValueChanged, appLockMonitor$special$$inlined$map$2$2$1) == coroutineSingletons62) {
                                                break;
                                            }
                                        } else if (i5 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj62);
                                        }
                                        break;
                                    }
                                }
                                appLockMonitor$special$$inlined$map$2$2$1 = new AppLockMonitor$special$$inlined$map$2$2$1(this, continuation);
                                Object obj622 = appLockMonitor$special$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons622 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i5 = appLockMonitor$special$$inlined$map$2$2$1.label;
                                if (i5 != 0) {
                                }
                            case 5:
                                if (continuation instanceof AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1) {
                                    appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1 = (AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1) continuation;
                                    int i37 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label;
                                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                                        appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                                        Object obj72 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i6 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label;
                                        if (i6 != 0) {
                                            SafeTrace.throwOnFailure(obj72);
                                            Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj).enabled());
                                            appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(valueOf, appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1) == coroutineSingletons72) {
                                                break;
                                            }
                                        } else if (i6 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj72);
                                        }
                                        break;
                                    }
                                }
                                appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1 = new AppLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1(this, continuation);
                                Object obj722 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons722 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i6 = appLockRecentScreenshotsDisabler$special$$inlined$map$1$2$1.label;
                                if (i6 != 0) {
                                }
                            case 6:
                                if (continuation instanceof AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1) {
                                    appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1 = (AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1) continuation;
                                    int i38 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label;
                                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                                        appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                                        Object obj82 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i7 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label;
                                        if (i7 != 0) {
                                            SafeTrace.throwOnFailure(obj82);
                                            Boolean valueOf2 = Boolean.valueOf(((RealAppLockState.InternalState) obj).getFeatureIsEnabled());
                                            appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(valueOf2, appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1) == coroutineSingletons82) {
                                                break;
                                            }
                                        } else if (i7 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj82);
                                        }
                                        break;
                                    }
                                }
                                appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1 = new AppLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1(this, continuation);
                                Object obj822 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons822 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i7 = appLockRecentScreenshotsDisabler$special$$inlined$map$2$2$1.label;
                                if (i7 != 0) {
                                }
                            case 7:
                                if (continuation instanceof AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1) {
                                    appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1 = (AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                                    int i39 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label;
                                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                                        appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                                        Object obj92 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i8 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label;
                                        if (i8 != 0) {
                                            SafeTrace.throwOnFailure(obj92);
                                            if (((ActivityEvent) obj) == ActivityEvent.START) {
                                                appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons92) {
                                                    break;
                                                }
                                            }
                                        } else if (i8 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj92);
                                        }
                                        break;
                                    }
                                }
                                appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1 = new AppMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                                Object obj922 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons922 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i8 = appMessageSyncer$setup$lambda$0$$inlined$filter$1$2$1.label;
                                if (i8 != 0) {
                                }
                            case 8:
                                if (continuation instanceof DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1) {
                                    deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1 = (DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                                    int i40 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                                        deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                                        Object obj102 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i9 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                                        if (i9 != 0) {
                                            SafeTrace.throwOnFailure(obj102);
                                            Pair pair = (Pair) obj;
                                            DeepLink deepLink = (DeepLink) pair.first;
                                            OnboardingFlowTokenManager$FlowToken onboardingFlowTokenManager$FlowToken = (OnboardingFlowTokenManager$FlowToken) pair.second;
                                            if ((deepLink != null ? deepLink.payload : null) != null && onboardingFlowTokenManager$FlowToken != null) {
                                                deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons102) {
                                                    break;
                                                }
                                            }
                                        } else if (i9 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj102);
                                        }
                                        break;
                                    }
                                }
                                deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1 = new DeepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                                Object obj1022 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1022 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i9 = deepLinkOnboardingContextWorker$setup$lambda$0$$inlined$filter$1$2$1.label;
                                if (i9 != 0) {
                                }
                            case 9:
                                if (continuation instanceof RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1) {
                                    realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1 = (RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1) continuation;
                                    int i41 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label;
                                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                                        realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                                        Object obj112 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i10 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label;
                                        if (i10 != 0) {
                                            SafeTrace.throwOnFailure(obj112);
                                            if (((AppForegroundState) obj) == AppForegroundState.BACKGROUND) {
                                                realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons112) {
                                                    break;
                                                }
                                            }
                                        } else if (i10 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj112);
                                        }
                                        break;
                                    }
                                }
                                realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1 = new RealBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1(this, continuation);
                                Object obj1122 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i10 = realBlockerFlowAnalytics$setup$lambda$0$$inlined$filter$1$2$1.label;
                                if (i10 != 0) {
                                }
                            case 10:
                                if (continuation instanceof RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1) {
                                    routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = (RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                                    int i42 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                                        routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                                        Object obj122 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i11 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                                        if (i11 != 0) {
                                            SafeTrace.throwOnFailure(obj122);
                                            ArrayList filterNotNull = CollectionsKt.filterNotNull((List) obj);
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it = filterNotNull.iterator();
                                            while (it.hasNext()) {
                                                Object next = it.next();
                                                if (((Dependent) next).sponsorship_tier == SponsorshipTier.MANAGED_ACCOUNT) {
                                                    arrayList.add(next);
                                                }
                                            }
                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                            Iterator it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                Dependent dependent = (Dependent) it2.next();
                                                RoutableAccount.Dependent.m3472constructorimpl(dependent);
                                                arrayList2.add(RoutableAccount.Dependent.m3471boximpl(dependent));
                                            }
                                            routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(arrayList2, routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons122) {
                                                break;
                                            }
                                        } else if (i11 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj122);
                                        }
                                        break;
                                    }
                                }
                                routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1 = new RoutableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                                Object obj1222 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i11 = routableAccountsProvider$setup$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                                if (i11 != 0) {
                                }
                            case 11:
                                if (continuation instanceof RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) {
                                    realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = (RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) continuation;
                                    int i43 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                                        realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                                        Object obj132 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i12 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                                        if (i12 != 0) {
                                            SafeTrace.throwOnFailure(obj132);
                                            List list = (List) obj;
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                            Iterator it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                arrayList3.add(LayoutHelpersKt.access$toMultiplatform((Sync_entity) it3.next()));
                                            }
                                            realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(arrayList3, realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) == coroutineSingletons132) {
                                                break;
                                            }
                                        } else if (i12 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj132);
                                        }
                                        break;
                                    }
                                }
                                realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = new RealSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1(this, continuation);
                                Object obj1322 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i12 = realSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                                if (i12 != 0) {
                                }
                            case 12:
                                if (continuation instanceof MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1) {
                                    mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                                    int i44 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                                        Object obj142 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i13 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                                        if (i13 != 0) {
                                            SafeTrace.throwOnFailure(obj142);
                                            Boolean valueOf3 = Boolean.valueOf(((SignedInState) obj) == SignedInState.SIGNED_IN);
                                            mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(valueOf3, mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons142) {
                                                break;
                                            }
                                        } else if (i13 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj142);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                                Object obj1422 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i13 = mainScreensPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                                if (i13 != 0) {
                                }
                            case 13:
                                if (continuation instanceof MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) {
                                    mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 = (MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) continuation;
                                    int i45 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                                        Object obj152 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i14 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                                        if (i14 != 0) {
                                            SafeTrace.throwOnFailure(obj152);
                                            if (obj instanceof MainScreensViewEvent.InAppNotificationEvent) {
                                                mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1) == coroutineSingletons152) {
                                                    break;
                                                }
                                            }
                                        } else if (i14 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj152);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1 = new MainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1(this, continuation);
                                Object obj1522 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1522 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i14 = mainScreensPresenter$models$lambda$18$$inlined$filterIsInstance$1$2$1.label;
                                if (i14 != 0) {
                                }
                            case 14:
                                if (continuation instanceof MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1) {
                                    mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1) continuation;
                                    int i46 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                                        Object obj162 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i15 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                                        if (i15 != 0) {
                                            SafeTrace.throwOnFailure(obj162);
                                            AppMessageViewEvent event = ((MainScreensViewEvent.InAppNotificationEvent) obj).getEvent();
                                            mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(event, mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1) == coroutineSingletons162) {
                                                break;
                                            }
                                        } else if (i15 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj162);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$18$$inlined$map$1$2$1(this, continuation);
                                Object obj1622 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1622 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i15 = mainScreensPresenter$models$lambda$18$$inlined$map$1$2$1.label;
                                if (i15 != 0) {
                                }
                            case 15:
                                if (continuation instanceof MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) {
                                    mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 = (MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) continuation;
                                    int i47 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                                        Object obj172 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i16 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                                        if (i16 != 0) {
                                            SafeTrace.throwOnFailure(obj172);
                                            if (obj instanceof MainScreensViewEvent.TooltipAppMessageEvent) {
                                                mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1) == coroutineSingletons172) {
                                                    break;
                                                }
                                            }
                                        } else if (i16 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj172);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1 = new MainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1(this, continuation);
                                Object obj1722 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1722 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i16 = mainScreensPresenter$models$lambda$19$$inlined$filterIsInstance$1$2$1.label;
                                if (i16 != 0) {
                                }
                            case 16:
                                if (continuation instanceof MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1) {
                                    mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1) continuation;
                                    int i48 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label;
                                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                                        Object obj182 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i17 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label;
                                        if (i17 != 0) {
                                            SafeTrace.throwOnFailure(obj182);
                                            TooltipAppMessageViewEvent event2 = ((MainScreensViewEvent.TooltipAppMessageEvent) obj).getEvent();
                                            mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(event2, mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1) == coroutineSingletons182) {
                                                break;
                                            }
                                        } else if (i17 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj182);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$19$$inlined$map$1$2$1(this, continuation);
                                Object obj1822 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1822 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i17 = mainScreensPresenter$models$lambda$19$$inlined$map$1$2$1.label;
                                if (i17 != 0) {
                                }
                            case 17:
                                if (continuation instanceof MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1) {
                                    mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1 = (MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1) continuation;
                                    int i49 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label;
                                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                                        Object obj192 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i18 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label;
                                        if (i18 != 0) {
                                            SafeTrace.throwOnFailure(obj192);
                                            if (((SignedInState) obj) == SignedInState.SIGNED_IN) {
                                                mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1) == coroutineSingletons192) {
                                                    break;
                                                }
                                            }
                                        } else if (i18 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj192);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1 = new MainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1(this, continuation);
                                Object obj1922 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons1922 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i18 = mainScreensPresenter$models$lambda$5$$inlined$filter$1$2$1.label;
                                if (i18 != 0) {
                                }
                            case 18:
                                if (continuation instanceof MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1) {
                                    mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1 = (MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1) continuation;
                                    int i50 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                                        mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                                        Object obj202 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i19 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                                        if (i19 != 0) {
                                            SafeTrace.throwOnFailure(obj202);
                                            String valueOf4 = String.valueOf(((IndexedValue) obj).index);
                                            mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(valueOf4, mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1) == coroutineSingletons202) {
                                                break;
                                            }
                                        } else if (i19 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj202);
                                        }
                                        break;
                                    }
                                }
                                mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1 = new MainScreensPresenter$models$lambda$5$$inlined$map$1$2$1(this, continuation);
                                Object obj2022 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2022 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i19 = mainScreensPresenter$models$lambda$5$$inlined$map$1$2$1.label;
                                if (i19 != 0) {
                                }
                            case 19:
                                if (continuation instanceof CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1) {
                                    cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1 = (CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1) continuation;
                                    int i51 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label;
                                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                                        cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                                        Object obj212 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i20 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label;
                                        if (i20 != 0) {
                                            SafeTrace.throwOnFailure(obj212);
                                            Money money = CompatibleKt.toMoney(((CryptoBalance$BitcoinBalance) obj).getAmount());
                                            cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(money, cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1) == coroutineSingletons212) {
                                                break;
                                            }
                                        } else if (i20 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj212);
                                        }
                                        break;
                                    }
                                }
                                cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1 = new CryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1(this, continuation);
                                Object obj2122 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i20 = cryptoBalanceRepoKt$asMoney$$inlined$map$1$2$1.label;
                                if (i20 != 0) {
                                }
                            case 20:
                                if (continuation instanceof RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1) {
                                    realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1 = (RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1) continuation;
                                    int i52 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label;
                                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                                        realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                                        Object obj232 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i21 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label;
                                        if (i21 != 0) {
                                            SafeTrace.throwOnFailure(obj232);
                                            ArrayList arrayList4 = new ArrayList();
                                            for (Object obj24 : (List) obj) {
                                                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj24;
                                                if (balanceSnapshot.f1396type != BalanceSnapshot.Type.SECONDARY) {
                                                    Money money2 = balanceSnapshot.balance;
                                                    if ((money2 != null ? money2.currency_code : null) == CurrencyCode.BTC) {
                                                        arrayList4.add(obj24);
                                                    }
                                                }
                                            }
                                            realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(arrayList4, realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1) == coroutineSingletons222) {
                                                break;
                                            }
                                        } else if (i21 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj232);
                                        }
                                        break;
                                    }
                                }
                                realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1 = new RealCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1(this, continuation);
                                Object obj2322 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i21 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$1$2$1.label;
                                if (i21 != 0) {
                                }
                            case 21:
                                if (continuation instanceof RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1) {
                                    realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1 = (RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1) continuation;
                                    int i53 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label;
                                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                                        realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                                        Object obj252 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i22 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label;
                                        if (i22 != 0) {
                                            SafeTrace.throwOnFailure(obj252);
                                            BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) CollectionsKt.firstOrNull((List) obj);
                                            if (balanceSnapshot2 != null) {
                                                Money money3 = balanceSnapshot2.balance;
                                                if (money3 != null && (l = money3.amount) != null) {
                                                    j = l.longValue();
                                                }
                                                BitcoinAmount bitcoinAmount = new BitcoinAmount(j);
                                                String str = balanceSnapshot2.instrument_token;
                                                str.getClass();
                                                r9 = new CryptoBalance$BitcoinBalance(bitcoinAmount, str, balanceSnapshot2.version);
                                            }
                                            realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(r9, realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1) == coroutineSingletons232) {
                                                break;
                                            }
                                        } else if (i22 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj252);
                                        }
                                        break;
                                    }
                                }
                                realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1 = new RealCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1(this, continuation);
                                Object obj2522 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons2322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i22 = realCryptoBalanceRepo$syncValueBalance$$inlined$map$2$2$1.label;
                                if (i22 != 0) {
                                }
                                break;
                            case 22:
                                if (continuation instanceof RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1) {
                                    realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1 = (RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1) continuation;
                                    int i54 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label;
                                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                                        realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                                        Object obj262 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i23 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label;
                                        if (i23 != 0) {
                                            SafeTrace.throwOnFailure(obj262);
                                            Long l4 = ((Money) obj).amount;
                                            l4.getClass();
                                            Boolean valueOf5 = Boolean.valueOf(l4.longValue() > 0);
                                            realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(valueOf5, realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1) == coroutineSingletons242) {
                                                break;
                                            }
                                        } else if (i23 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj262);
                                        }
                                        break;
                                    }
                                }
                                realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1 = new RealBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1(this, continuation);
                                Object obj2622 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i23 = realBitcoinActivityProvider$hasBitcoin$$inlined$map$1$2$1.label;
                                if (i23 != 0) {
                                }
                            case 23:
                                if (continuation instanceof RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1) {
                                    realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1 = (RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1) continuation;
                                    int i55 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label;
                                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                                        realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                                        Object obj272 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i24 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label;
                                        if (i24 != 0) {
                                            SafeTrace.throwOnFailure(obj272);
                                            Pair pair2 = (Pair) obj;
                                            Boolean valueOf6 = Boolean.valueOf(((Boolean) pair2.first).booleanValue() || ((Boolean) pair2.second).booleanValue());
                                            realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(valueOf6, realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1) == coroutineSingletons252) {
                                                break;
                                            }
                                        } else if (i24 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj272);
                                        }
                                        break;
                                    }
                                }
                                realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1 = new RealBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1(this, continuation);
                                Object obj2722 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2522 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i24 = realBitcoinActivityProvider$hasBitcoinActivity$$inlined$map$1$2$1.label;
                                if (i24 != 0) {
                                }
                            case 24:
                                if (continuation instanceof SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1) {
                                    sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1 = (SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1) continuation;
                                    int i56 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label;
                                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                                        sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                                        Object obj282 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i25 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label;
                                        if (i25 != 0) {
                                            SafeTrace.throwOnFailure(obj282);
                                            if (((Versioned) obj).value == SignedInState.SIGNED_OUT) {
                                                sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1) == coroutineSingletons262) {
                                                    break;
                                                }
                                            }
                                        } else if (i25 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj282);
                                        }
                                        break;
                                    }
                                }
                                sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1 = new SandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1(this, continuation);
                                Object obj2822 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2622 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i25 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$filter$1$2$1.label;
                                if (i25 != 0) {
                                }
                            case 25:
                                if (continuation instanceof SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1) {
                                    sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1 = (SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1) continuation;
                                    int i57 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label;
                                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                                        sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                                        Object obj292 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i26 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label;
                                        if (i26 != 0) {
                                            SafeTrace.throwOnFailure(obj292);
                                            Unit unit = Unit.INSTANCE;
                                            sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(unit, sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1) == coroutineSingletons272) {
                                                break;
                                            }
                                        } else if (i26 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj292);
                                        }
                                        break;
                                    }
                                }
                                sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1 = new SandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1(this, continuation);
                                Object obj2922 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2722 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i26 = sandboxedDataModule$Companion$provideSignOutFlow$$inlined$map$1$2$1.label;
                                if (i26 != 0) {
                                }
                            case 26:
                                if (continuation instanceof RealContactRepository$recents$$inlined$mapItems$1$2$1) {
                                    realContactRepository$recents$$inlined$mapItems$1$2$1 = (RealContactRepository$recents$$inlined$mapItems$1$2$1) continuation;
                                    int i58 = realContactRepository$recents$$inlined$mapItems$1$2$1.label;
                                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                                        realContactRepository$recents$$inlined$mapItems$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                                        Object obj302 = realContactRepository$recents$$inlined$mapItems$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i27 = realContactRepository$recents$$inlined$mapItems$1$2$1.label;
                                        if (i27 != 0) {
                                            SafeTrace.throwOnFailure(obj302);
                                            List list2 = (List) obj;
                                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                            Iterator it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                arrayList5.add(RecipientUtil.createRecipient((ActivityRecipient) it4.next(), true));
                                            }
                                            realContactRepository$recents$$inlined$mapItems$1$2$1.label = 1;
                                            if (flowCollector.emit(arrayList5, realContactRepository$recents$$inlined$mapItems$1$2$1) == coroutineSingletons282) {
                                                break;
                                            }
                                        } else if (i27 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj302);
                                        }
                                        break;
                                    }
                                }
                                realContactRepository$recents$$inlined$mapItems$1$2$1 = new RealContactRepository$recents$$inlined$mapItems$1$2$1(this, continuation);
                                Object obj3022 = realContactRepository$recents$$inlined$mapItems$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2822 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i27 = realContactRepository$recents$$inlined$mapItems$1$2$1.label;
                                if (i27 != 0) {
                                }
                            case 27:
                                if (continuation instanceof RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                                    realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                                    int i59 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                                        realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                                        Object obj312 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i28 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                        if (i28 != 0) {
                                            SafeTrace.throwOnFailure(obj312);
                                            if (((Boolean) obj).booleanValue()) {
                                                realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                                if (flowCollector.emit(obj, realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons292) {
                                                    break;
                                                }
                                            }
                                        } else if (i28 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj312);
                                        }
                                        break;
                                    }
                                }
                                realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RealContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                                Object obj3122 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons2922 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i28 = realContactSync$setup$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                if (i28 != 0) {
                                }
                            case 28:
                                if (continuation instanceof RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1) {
                                    realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1 = (RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                                    int i60 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                                        realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                                        Object obj332 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i29 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                        if (i29 != 0) {
                                            SafeTrace.throwOnFailure(obj332);
                                            Boolean valueOf7 = Boolean.valueOf(((ContactsSyncState) obj) != ContactsSyncState.OFF);
                                            realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(valueOf7, realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons302) {
                                                break;
                                            }
                                        } else if (i29 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj332);
                                        }
                                        break;
                                    }
                                }
                                realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1 = new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                                Object obj3322 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons3022 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i29 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                if (i29 != 0) {
                                }
                            default:
                                if (continuation instanceof RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1) {
                                    realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = (RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                                    int i61 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                                        realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                                        Object obj342 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                                        CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i30 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                        if (i30 != 0) {
                                            SafeTrace.throwOnFailure(obj342);
                                            Boolean bool = Boolean.TRUE;
                                            realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                                            if (flowCollector.emit(bool, realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons312) {
                                                break;
                                            }
                                        } else if (i30 != 1) {
                                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                            break;
                                        } else {
                                            SafeTrace.throwOnFailure(obj342);
                                        }
                                        break;
                                    }
                                }
                                realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1 = new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                                Object obj3422 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons3122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i30 = realContactSync$setup$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                if (i30 != 0) {
                                }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation3) {
                    int i22 = i2;
                    FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1 = countFor2;
                    switch (i22) {
                        case 0:
                            Object collect = flowUtil$createFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, 0), continuation3);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object collect2 = flowUtil$createFlow$$inlined$map$1.collect(new AnonymousClass2(flowCollector2, 1), continuation3);
                            if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        Badger$collect$$inlined$combine$1 badger$collect$$inlined$combine$1 = new Badger$collect$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]), 0);
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
        SafeFlow safeFlow = new SafeFlow(new RealBoostSelector.AnonymousClass1(this.accountInstrumentsBadger, continuation2, 18));
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        Object collect = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new Badger$collect$3(2, null, 0), new FinishSetupTileBadgeCounter(1, new Flow[]{flowKt__ZipKt$combine$$inlined$unsafeFlow$1, this.balanceTabAppMessagesCount, this.bankingTabBadgeCount, this.bitcoinAppMessagesCount, this.cardTabAppMessagesCount, badger$collect$$inlined$combine$1, this.offersTabAppMessagesCount, this.investingAppMessagesCount, this.paymentPadAppMessagesCount, this.profilePersonalMessagesCount, appLockMonitor$special$$inlined$map$2, this.identityVerificationBadger, this.limitsPageletBadger, FlowKt.flowOn(safeFlow, DefaultIoScheduler.INSTANCE), ((SupportConversationPersistence) this.chatBadger.adapter).hasUnreadMessages(), this.finishSetupTileBadgeCount}, this)).collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }
}
