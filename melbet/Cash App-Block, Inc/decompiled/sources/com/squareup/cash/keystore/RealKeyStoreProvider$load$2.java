package com.squareup.cash.keystore;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.text.selection.SelectionLayoutKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.core.os.BundleKt;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.emoji2.text.MetadataRepo;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.paging.Pager$pageFetcher$2;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.molecule.RecompositionMode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.api.DelayStrategy;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.cdf.stock.StockSelectPresentMyInvestmentsDetails;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.activity.RealPaymentNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.history.treehouse.views.ActivityInviteFriendsView;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.api.CashApiInterceptor;
import com.squareup.cash.investing.backend.api.InvestingPerformanceSyncerKt;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.investing.components.InvestingHomeView;
import com.squareup.cash.investing.components.InvestingHomeView$2$1;
import com.squareup.cash.investing.presenters.settings.InvestingSettingsPresenter;
import com.squareup.cash.investing.presenters.stockdetails.LastSelectedRange;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.applets.sections.PromotedAppletTile;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.booklet.MoneyTabBookletScreen;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.discover.api.app.v2.api.GetMoneyTabAppletsResponse;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutByPaymentTokenRequest;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutByPaymentTokenResponse;
import com.squareup.protos.cash.sup.api.v1.CheckoutService;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import okio.internal.DefaultSocket;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealKeyStoreProvider$load$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$load$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealKeyStoreProvider$load$2((RealKeyStoreProvider) obj2, continuation, 0);
            case 1:
                return new RealKeyStoreProvider$load$2((GLSceneScope) obj2, continuation, 1);
            case 2:
                return new RealKeyStoreProvider$load$2((MusicPresenter) obj2, continuation, 2);
            case 3:
                return new RealKeyStoreProvider$load$2((GrowToolsAutoInvestManager) obj2, continuation, 3);
            case 4:
                return new RealKeyStoreProvider$load$2((RealBugReportSenderFactory) obj2, continuation, 4);
            case 5:
                return new RealKeyStoreProvider$load$2((RealAccountOutboundNavigator) obj2, continuation, 5);
            case 6:
                return new RealKeyStoreProvider$load$2((PaymentActionHandler) obj2, continuation, 6);
            case 7:
                return new RealKeyStoreProvider$load$2((LocalEditorialPresenter) obj2, continuation, 7);
            case 8:
                return new RealKeyStoreProvider$load$2((DisclosurePresenter) obj2, continuation, 8);
            case 9:
                return new RealKeyStoreProvider$load$2((LocalHomePresenter) obj2, continuation, 9);
            case 10:
                return new RealKeyStoreProvider$load$2((LocalHomePresenter) obj2, continuation, 10);
            case 11:
                return new RealKeyStoreProvider$load$2((ActivityInviteFriendsView) obj2, continuation, 11);
            case 12:
                return new RealKeyStoreProvider$load$2((RealColdStartIntegrityChecker) obj2, continuation, 12);
            case 13:
                return new RealKeyStoreProvider$load$2((DisclosurePresenter) obj2, continuation, 13);
            case 14:
                return new RealKeyStoreProvider$load$2((CashApiInterceptor) obj2, continuation, 14);
            case 15:
                return new RealKeyStoreProvider$load$2((RealInvestingHistoricalData) obj2, continuation, 15);
            case 16:
                return new RealKeyStoreProvider$load$2((InvestingHomeView) obj2, continuation, 16);
            case 17:
                return new RealKeyStoreProvider$load$2((ProfilePresenter) obj2, continuation, 17);
            case 18:
                return new RealKeyStoreProvider$load$2((PoolsListPresenter) obj2, continuation, 18);
            case 19:
                return new RealKeyStoreProvider$load$2((LocalEditorialPresenter) obj2, continuation, 19);
            case 20:
                return new RealKeyStoreProvider$load$2((MetadataRepo) obj2, continuation, 20);
            case 21:
                return new RealKeyStoreProvider$load$2((InvestingSettingsPresenter) obj2, continuation, 21);
            case 22:
                return new RealKeyStoreProvider$load$2((LastSelectedRange) obj2, continuation, 22);
            case 23:
                return new RealKeyStoreProvider$load$2((MoneybotHomePresenter) obj2, continuation, 23);
            case 24:
                return new RealKeyStoreProvider$load$2((CashMapPresenter) obj2, continuation, 24);
            case 25:
                return new RealKeyStoreProvider$load$2((ShareSheetPresenter) obj2, continuation, 25);
            case 26:
                return new RealKeyStoreProvider$load$2((RealAppletTileServerRecommendationProvider) obj2, continuation, 26);
            case 27:
                return new RealKeyStoreProvider$load$2((MusicPresenter) obj2, continuation, 27);
            case 28:
                return new RealKeyStoreProvider$load$2((RealChatSessionManager) obj2, continuation, 28);
            default:
                return new RealKeyStoreProvider$load$2((LocalEditorialPresenter) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealKeyStoreProvider$load$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r27) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0468, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r9.ioDispatcher, new com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1(r7, r8, r9, r10, 2), r27) == r1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0471, code lost:
    
        if (com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer.syncPerformance$default(r9, r7, r27) == r1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0565, code lost:
    
        if (com.squareup.cash.card.onboarding.DisclosurePresenter.access$navigateToAddMoneyInstrumentSelection(r14, r2, r3, r1, r27) == r0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x057a, code lost:
    
        if (com.squareup.cash.card.onboarding.DisclosurePresenter.access$navigateToWithdrawInstrumentSelection(r14, r2, r3, r1, r27) == r0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0589, code lost:
    
        if (com.squareup.cash.card.onboarding.DisclosurePresenter.access$navigateToBitcoinBuyInstrumentSelection(r14, (com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy) r1, r27) == r0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x06d5, code lost:
    
        if (r1.awaitInternal(r27) == r3) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x06c2, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r6, r27) == r3) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x067d, code lost:
    
        if (r4 == r3) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ee A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createActiveBitcoinAutomation;
        Object cancelCheckoutByPaymentToken;
        CoroutineSingletons coroutineSingletons;
        Object retryWhenRetryable$default;
        PromotedAppletTile promotedAppletTile;
        AppletId appletId;
        String str;
        String str2;
        Image image;
        String str3;
        LocalizedString localizedString;
        LocalizedString localizedString2;
        Object handleBlockerAction$default;
        Object fetchNextPage;
        int i = this.$r8$classId;
        SyncScope.Global global = SyncScope.Global.INSTANCE;
        int i2 = 11;
        int i3 = 27;
        int i4 = 17;
        int i5 = 26;
        int i6 = 12;
        int i7 = 28;
        int i8 = 5;
        int i9 = 3;
        int i10 = 2;
        Object obj2 = this.this$0;
        int i11 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                RealKeyStoreProvider realKeyStoreProvider = (RealKeyStoreProvider) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Pager$pageFetcher$2 pager$pageFetcher$2 = new Pager$pageFetcher$2(realKeyStoreProvider, null, 12);
                CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(realKeyStoreProvider, (Continuation) null, i8);
                this.label = 1;
                Object runWithRetries = StateFlowKt.runWithRetries(3, 500L, pager$pageFetcher$2, cachedPagingDataKt$cachedIn$2, this);
                return runWithRetries == coroutineSingletons2 ? coroutineSingletons2 : runWithRetries;
            case 1:
                GLSceneScope gLSceneScope = (GLSceneScope) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda1(gLSceneScope, i8));
                    Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$2 = new Hero3DCardViewKt$rotateDragFlow$2(gLSceneScope, null, 6);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, hero3DCardViewKt$rotateDragFlow$2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                GrowToolsManagerScreen growToolsManagerScreen = (GrowToolsManagerScreen) musicPresenter.args;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = (RealGrowToolsManagerViewAppearanceTracker) musicPresenter.musicPlayer;
                    GrowToolsManagerScreen.Origin origin = growToolsManagerScreen.getOrigin();
                    GrowToolsManagerScreen.InvestmentType investmentType = growToolsManagerScreen.f1144type;
                    this.label = 1;
                    if (realGrowToolsManagerViewAppearanceTracker.track(origin, investmentType, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GrowToolsAutoInvestManager growToolsAutoInvestManager = (GrowToolsAutoInvestManager) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator = growToolsAutoInvestManager.navigator;
                    this.label = 1;
                    if (GrowToolsAutoInvestManager.access$navigateToAutoInvestSheet(growToolsAutoInvestManager, screenNavigator, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                RealBugReportSenderFactory realBugReportSenderFactory = (RealBugReportSenderFactory) obj2;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SyncValueReader syncValueReader = (SyncValueReader) realBugReportSenderFactory.bugReportService;
                    this.label = 1;
                    if (syncValueReader.awaitReady(this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((StateFlow) realBugReportSenderFactory.scope).getValue() == null) {
                    ((BetterNavigator.ScreenNavigator) realBugReportSenderFactory.featureEligibilityDumper).goTo(new BitcoinHome(null, null, null, null, 15));
                }
                return Unit.INSTANCE;
            case 5:
                RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) obj2;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) realAccountOutboundNavigator.signedInStateManager;
                    this.label = 1;
                    createActiveBitcoinAutomation = realBitcoinRoundUpsRepo.createActiveBitcoinAutomation(this);
                    if (createActiveBitcoinAutomation == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    createActiveBitcoinAutomation = obj;
                }
                realAccountOutboundNavigator.startChangeDestinationFlow((Automation) createActiveBitcoinAutomation, ColorModel.Bitcoin.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                PaymentActionHandler paymentActionHandler = (PaymentActionHandler) obj2;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileSyncer realProfileSyncer = paymentActionHandler.profileSyncer;
                    this.label = 1;
                    if (realProfileSyncer.refresh(true, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                paymentActionHandler.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, global);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                    PaymentNavigator paymentNavigator = (PaymentNavigator) localEditorialPresenter.installedStore;
                    ClientScenario clientScenario = ClientScenario.ACTIVITY;
                    HistoryScreens.CancelPayment cancelPayment = (HistoryScreens.CancelPayment) localEditorialPresenter.responseContextHandler;
                    String str4 = cancelPayment.flowToken;
                    String str5 = cancelPayment.paymentToken;
                    Money money = cancelPayment.paymentAmount;
                    List list = cancelPayment.paymentGetters;
                    this.label = 1;
                    if (((RealPaymentNavigator) paymentNavigator).cancelPayment(clientScenario, str4, str5, money, list, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                HistoryScreens.CancelPendingSupPaymentScreen cancelPendingSupPaymentScreen = (HistoryScreens.CancelPendingSupPaymentScreen) disclosurePresenter.args;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CheckoutService checkoutService = (CheckoutService) disclosurePresenter.appService;
                    CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest = new CancelCheckoutByPaymentTokenRequest(cancelPendingSupPaymentScreen.paymentToken, ByteString.EMPTY);
                    this.label = 1;
                    cancelCheckoutByPaymentToken = checkoutService.cancelCheckoutByPaymentToken(cancelCheckoutByPaymentTokenRequest, this);
                    break;
                } else if (i20 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    cancelCheckoutByPaymentToken = obj;
                } else {
                    if (i20 != 2) {
                        if (i20 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ((RealActivityUpdatesNotifier) disclosurePresenter.blockersNavigator).notifyItemUpdated(cancelPendingSupPaymentScreen.paymentToken);
                        screenNavigator2.goTo(Back.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl sync = ((RealClientSyncer) disclosurePresenter.launcher).sync(SyncTrigger.BLOCKING_USER_ACTION, global);
                    this.label = 3;
                    break;
                }
                ApiResult apiResult = (ApiResult) cancelCheckoutByPaymentToken;
                if (apiResult instanceof ApiResult.Failure) {
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging((AndroidStringManager) disclosurePresenter.stringManager, (ApiResult.Failure) apiResult, null);
                    screenNavigator2.goTo(new FailureMessageScreen(errorMessaging.title, errorMessaging.message, null, (HistoryScreens.CancelPendingSupPaymentScreen) disclosurePresenter.args, null, 20));
                    return Unit.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Long l = ((CancelCheckoutByPaymentTokenResponse) ((ApiResult.Success) apiResult).response).sleep_duration_ms;
                long longValue = l != null ? l.longValue() : 0L;
                this.label = 2;
                break;
            case 9:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$handleActionClickWithoutUrl((LocalHomePresenter) obj2, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$handleActionClickWithoutUrl$1((LocalHomePresenter) obj2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityInviteFriendsView activityInviteFriendsView = (ActivityInviteFriendsView) obj2;
                    RealActivityInvitePresenter realActivityInvitePresenter = activityInviteFriendsView.presenter;
                    if (realActivityInvitePresenter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                        throw null;
                    }
                    InvestingHomeView$2$1 investingHomeView$2$1 = new InvestingHomeView$2$1(activityInviteFriendsView, 16);
                    this.label = 1;
                    if (realActivityInvitePresenter.collect(investingHomeView$2$1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 != 0) {
                    if (i24 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlow stateFlow = ((RealColdStartIntegrityChecker) obj2).accessSyncValue;
                DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(i10, null, i5);
                this.label = 1;
                Object first = FlowKt.first(stateFlow, anonymousClass2, this);
                return first == coroutineSingletons14 ? coroutineSingletons14 : first;
            case 13:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 != 0) {
                    if (i25 == 1 || i25 == 2 || i25 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj2;
                InstrumentSelectionLoadingScreen.InstrumentSelectionParams instrumentSelectionParams = ((InstrumentSelectionLoadingScreen) disclosurePresenter2.args).instrumentSelectionParams;
                if (!(instrumentSelectionParams instanceof InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney)) {
                    if (!(instrumentSelectionParams instanceof InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw)) {
                        if (!(instrumentSelectionParams instanceof InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        this.label = 3;
                        break;
                    } else {
                        InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw withdraw = (InstrumentSelectionLoadingScreen.InstrumentSelectionParams.Withdraw) instrumentSelectionParams;
                        Money money2 = withdraw.amount;
                        String str6 = withdraw.instrumentToken;
                        DepositPreference depositPreference = withdraw.depositPreference;
                        this.label = 2;
                        break;
                    }
                } else {
                    InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney addMoney = (InstrumentSelectionLoadingScreen.InstrumentSelectionParams.AddMoney) instrumentSelectionParams;
                    Money money3 = addMoney.amount;
                    String str7 = addMoney.instrumentToken;
                    boolean z = addMoney.startInKeypad;
                    this.label = 1;
                    break;
                }
            case 14:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultSocket defaultSocket = ((CashApiInterceptor) obj2).forcedLogoutNotifier;
                    this.label = 1;
                    Object obj3 = ((KeyValue) defaultSocket.sink).set(Boolean.TRUE, this);
                    if (obj3 != coroutineSingletons16) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer = ((RealInvestingHistoricalData) obj2).investmentPerformanceSyncer;
                    InvestmentEntityToken investmentEntityToken = InvestingPerformanceSyncerKt.PORTFOLIO_TOKEN;
                    this.label = 1;
                    if (RealInvestmentPerformanceSyncer.syncPerformance$default(realInvestmentPerformanceSyncer, investmentEntityToken, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView investingHomeView = (InvestingHomeView) obj2;
                    ChannelFlowBuilder channelFlowBuilder = investingHomeView.onScrollFlow;
                    InvestingHomeView$2$1 investingHomeView$2$12 = new InvestingHomeView$2$1(investingHomeView, 0);
                    this.label = 1;
                    if (channelFlowBuilder.collect(investingHomeView$2$12, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfilePresenter profilePresenter = (ProfilePresenter) obj2;
                    Flow flow = (Flow) profilePresenter.externalPaymentId;
                    InvestingHomeView$2$1 investingHomeView$2$13 = new InvestingHomeView$2$1(profilePresenter, i3);
                    this.label = 1;
                    Object collect = flow.collect(new FlowKt__MergeKt$flattenConcat$1$1(investingHomeView$2$13, 16), this);
                    if (collect != coroutineSingletons19) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj2;
                InvestmentEntityToken investmentEntityToken2 = (InvestmentEntityToken) poolsListPresenter.flowToken;
                InvestingScreens.PerformanceScreens performanceScreens = (InvestingScreens.PerformanceScreens) poolsListPresenter.args;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Continuation continuation2 = null;
                    if (performanceScreens instanceof InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen) {
                        ((Analytics) poolsListPresenter.analytics).track(new StockSelectPresentMyInvestmentsDetails(), null);
                    }
                    boolean z2 = performanceScreens instanceof InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen;
                    RealInvestmentPerformanceSyncer realInvestmentPerformanceSyncer2 = (RealInvestmentPerformanceSyncer) poolsListPresenter.sessionManager;
                    if (z2) {
                        String str8 = ((InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen) performanceScreens).customerToken;
                        this.label = 1;
                        break;
                    } else {
                        this.label = 2;
                        break;
                    }
                } else {
                    if (i30 != 1 && i30 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalEditorialPresenter.access$logPresentTypePicker((LocalEditorialPresenter) obj2, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                MetadataRepo metadataRepo = (MetadataRepo) obj2;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 != 0) {
                    if (i32 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RecompositionMode recompositionMode = RecompositionMode.ContextClock;
                InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(new InviteContactsPresenter$filterContacts$$inlined$map$1(BundleKt.moleculeFlow$default(new CashMapViewKt$$ExternalSyntheticLambda5(metadataRepo, i2)), i4), metadataRepo, 7);
                this.label = 1;
                Object first2 = FlowKt.first(inviteContactsPresenter$special$$inlined$map$1, this);
                return first2 == coroutineSingletons22 ? coroutineSingletons22 : first2;
            case 21:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MetadataRepo metadataRepo2 = ((InvestingSettingsPresenter) obj2).inboundNavigator;
                    ScreenSource screenSource = ScreenSource.PORTFOLIO;
                    this.label = 1;
                    if (metadataRepo2.showDripSetting(screenSource, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LastSelectedRange lastSelectedRange = (LastSelectedRange) obj2;
                    Flow flow2 = lastSelectedRange.signOut;
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(lastSelectedRange, 9);
                    this.label = 1;
                    if (flow2.collect(offersDetailsPresenterV2$models$1$1$1, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) obj2;
                    NewsKind newsKind = (NewsKind) moneybotHomePresenter.failedToLoadHome$delegate;
                    if (newsKind instanceof NewsKind.Stock) {
                        RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) moneybotHomePresenter.moneybotPromptManager;
                        this.label = 1;
                        Object withContext = JobKt.withContext(realInvestingSyncer.ioDispatcher, new CheckStatusPresenter.AnonymousClass1(realInvestingSyncer, (NewsKind.Stock) newsKind, null, i2), this);
                        if (withContext != obj4) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj4) {
                            return obj4;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CashMapPresenter cashMapPresenter = (CashMapPresenter) obj2;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new InviteContactsPresenter$special$$inlined$map$1(cashMapPresenter.preciseLocationPermissions.$readonly.denied(), cashMapPresenter, 15), i7);
                    InviteErrorPresenter$models$1$1 inviteErrorPresenter$models$1$1 = new InviteErrorPresenter$models$1$1(cashMapPresenter, null, i9);
                    this.label = 1;
                    if (FlowKt.collectLatest(formCashtag$8$invokeSuspend$$inlined$map$1, inviteErrorPresenter$models$1$1, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 != 0) {
                    if (i37 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj2;
                SharedFlowImpl sharedFlowImpl = ((RealBoostRepository) shareSheetPresenter.analytics).boostSelector.actions;
                OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$12 = new OffersDetailsPresenterV2$models$1$1$1(shareSheetPresenter, i4);
                this.label = 1;
                sharedFlowImpl.collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(offersDetailsPresenterV2$models$1$1$12, 27), this);
                return coroutineSingletons26;
            case 26:
                RealAppletTileServerRecommendationProvider realAppletTileServerRecommendationProvider = (RealAppletTileServerRecommendationProvider) obj2;
                Map map = realAppletTileServerRecommendationProvider.appletIdsByMoneyTabAppletId;
                AtomicLong atomicLong = realAppletTileServerRecommendationProvider.lastRefreshAtMillis;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) realAppletTileServerRecommendationProvider.enabled$delegate.getValue()).booleanValue() && (PlatformKt.getCurrentSessionState(realAppletTileServerRecommendationProvider.sessionManager) instanceof SessionState.Authenticated)) {
                        long elapsedRealtime = realAppletTileServerRecommendationProvider.clock.elapsedRealtime();
                        long j = atomicLong.get();
                        if (j != -1) {
                            coroutineSingletons = coroutineSingletons27;
                            if (elapsedRealtime - j < realAppletTileServerRecommendationProvider.refreshIntervalMillis) {
                                return Unit.INSTANCE;
                            }
                        } else {
                            coroutineSingletons = coroutineSingletons27;
                        }
                        atomicLong.set(elapsedRealtime);
                        Duration.Companion companion = Duration.Companion;
                        DurationUnit durationUnit = DurationUnit.SECONDS;
                        DelayStrategy.Backoff backoff = new DelayStrategy.Backoff(CollectionsKt__CollectionsKt.listOf((Object[]) new Duration[]{new Duration(DurationKt.toDuration(5, durationUnit)), new Duration(DurationKt.toDuration(10, durationUnit))}));
                        Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(realAppletTileServerRecommendationProvider, (Continuation) null, i5);
                        this.label = 1;
                        retryWhenRetryable$default = PlatformKt.retryWhenRetryable$default(backoff, anonymousClass1, this, 1);
                        if (retryWhenRetryable$default == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                retryWhenRetryable$default = obj;
                ApiResult apiResult2 = (ApiResult) retryWhenRetryable$default;
                if (apiResult2 instanceof ApiResult.Success) {
                    GetMoneyTabAppletsResponse getMoneyTabAppletsResponse = (GetMoneyTabAppletsResponse) ((ApiResult.Success) apiResult2).response;
                    AtomicReference atomicReference = realAppletTileServerRecommendationProvider.lastResponseAppletIds;
                    List list2 = getMoneyTabAppletsResponse.applets;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        MoneyTab.Applet.Id id = ((MoneyTab.Applet) it.next()).id;
                        AppletId appletId2 = id != null ? (AppletId) map.get(id) : null;
                        if (appletId2 != null) {
                            arrayList.add(appletId2);
                        }
                    }
                    atomicReference.set(CollectionsKt.toSet(arrayList));
                    List<MoneyTab.Applet> list3 = getMoneyTabAppletsResponse.applets;
                    ArrayList arrayList2 = new ArrayList();
                    for (MoneyTab.Applet applet : list3) {
                        MoneyTab.Applet.Id id2 = applet.id;
                        if (id2 != null && (appletId = (AppletId) map.get(id2)) != null) {
                            MoneyTab.Applet.Banner banner = applet.banner;
                            if (banner == null || (localizedString2 = banner.title) == null || (str = localizedString2.translated_value) == null || StringsKt.isBlank(str)) {
                                str = null;
                            }
                            if (banner == null || (localizedString = banner.body) == null || (str2 = localizedString.translated_value) == null || StringsKt.isBlank(str2)) {
                                str2 = null;
                            }
                            if (banner == null || (image = banner.image) == null || (str3 = image.light_url) == null || !(!StringsKt.isBlank(str3))) {
                                image = null;
                            }
                            if (banner == null || (str == null && str2 == null && image == null)) {
                                promotedAppletTile = new PromotedAppletTile(appletId, null, null, null);
                            } else {
                                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                if (str == null) {
                                    createListBuilder.add("title");
                                }
                                if (str2 == null) {
                                    createListBuilder.add("subtitle");
                                }
                                if (image == null) {
                                    createListBuilder.add("image_url");
                                }
                                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                                if (build.isEmpty()) {
                                    promotedAppletTile = new PromotedAppletTile(appletId, str, str2, image);
                                } else {
                                    realAppletTileServerRecommendationProvider.errorReporter.report(new RealAppletTileServerRecommendationProvider.AppletBannerError(CameraSelector$$ExternalSyntheticOutline0.m("applet banner missing required fields for ", appletId.name(), ": ", CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63))), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                            }
                            if (promotedAppletTile == null) {
                                arrayList2.add(promotedAppletTile);
                            }
                        }
                        promotedAppletTile = null;
                        if (promotedAppletTile == null) {
                        }
                    }
                    RealPromotedAppletTileStore realPromotedAppletTileStore = realAppletTileServerRecommendationProvider.promotedAppletTileStore;
                    realPromotedAppletTileStore.database.promotedAppletTileQueries.transactionWithWrapper(new MusicViewKt$$ExternalSyntheticLambda6(i11, realPromotedAppletTileStore, arrayList2));
                }
                return Unit.INSTANCE;
            case 27:
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter musicPresenter2 = (MusicPresenter) obj2;
                    this.label = 1;
                    MoneyTabBookletScreen moneyTabBookletScreen = (MoneyTabBookletScreen) musicPresenter2.musicRepository;
                    BlockerAction blockerAction = moneyTabBookletScreen.blocker.cta_action;
                    if (blockerAction == null) {
                        handleBlockerAction$default = Unit.INSTANCE;
                    } else {
                        handleBlockerAction$default = BlockersHelper.handleBlockerAction$default((RealBlockersHelper) musicPresenter2.musicPlayer, blockerAction, moneyTabBookletScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (handleBlockerAction$default != obj5) {
                            handleBlockerAction$default = Unit.INSTANCE;
                        }
                    }
                    if (handleBlockerAction$default == obj5) {
                        return obj5;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealChatSessionManager realChatSessionManager = (RealChatSessionManager) obj2;
                    this.label = 1;
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    Object collect2 = StateFlowKt.doOnFirst(FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realChatSessionManager.sessionId, 24), new AnchoredDraggableNode$drag$2(continuation, realChatSessionManager, i7)), new StripePaymentController$$ExternalSyntheticLambda1(23), new SelectionLayoutKt$$ExternalSyntheticLambda0(ref$BooleanRef, i11)).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i6, realChatSessionManager, ref$BooleanRef), this);
                    if (collect2 != coroutineSingletons28) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj2;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) localEditorialPresenter2.responseContextHandler;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealUserSessionPager realUserSessionPager = (RealUserSessionPager) localEditorialPresenter2.service;
                    this.label = 1;
                    fetchNextPage = realUserSessionPager.fetchNextPage(this);
                    break;
                } else {
                    if (i41 != 1) {
                        if (i41 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        parcelableSnapshotMutableState.setValue(null);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    fetchNextPage = obj;
                }
                ((ParcelableSnapshotMutableState) localEditorialPresenter2.stringManager).setValue(Boolean.FALSE);
                if (((ApiResult) fetchNextPage) instanceof ApiResult.Failure) {
                    parcelableSnapshotMutableState.setValue(MoneybotChatHistoryViewModel.Content.Error.LoadingNextPage.INSTANCE);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
        }
    }
}
