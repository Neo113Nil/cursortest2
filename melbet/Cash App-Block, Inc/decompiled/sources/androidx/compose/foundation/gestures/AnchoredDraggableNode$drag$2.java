package androidx.compose.foundation.gestures;

import androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder;
import androidx.camera.viewfinder.core.impl.RefCounted;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.paging.HintHandler;
import androidx.paging.MulticastedPagingData;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import androidx.paging.PageFetcher;
import androidx.paging.PageFetcher$flow$1;
import androidx.paging.PagingData;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.fillr.featuretoggle.UnleashContext;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.BinaryBitmap;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostProvider$getAllBoosts$$inlined$map$1$2;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.boost.db.SelectableRewardQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.SelectableRewardQueries$rewardsExcept$2;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.borrow.backend.RealBorrowDataManager$borrowHomeEntryPoint$1$1;
import com.squareup.cash.borrow.backend.RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.clipboard.RealClipboardObserver$observeClipboard$3;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.contacts.CustomerQueries$forIds$2;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.education.stories.backend.api.GetStoriesResult;
import com.squareup.cash.education.stories.backend.api.UnknownEducationStoryError;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.applets.data.RealAllowanceAppletTileRepository;
import com.squareup.cash.family.applets.data.RealApprovedContactsAppletTileRepository;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountControlPresenter;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.favorites.data.RealFavoritesRepository;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository$models$5;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$rawHoldings$2;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersRepositoryService;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$2;
import com.squareup.util.coroutines.TakeUntil;
import com.squareup.util.coroutines.TakeUntilKt;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.CombineKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements Function3 {
    public /* synthetic */ Object $forEachDelta;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(RealEducationStoryRepository realEducationStoryRepository, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 14;
        this.this$0 = realEducationStoryRepository;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2((DragGestureNode$startListeningForEvents$1) this.$forEachDelta, (AnchoredDraggableNode) obj4, (Continuation) obj3, 0);
                anchoredDraggableNode$drag$2.L$0 = (AnchoredDraggableState$anchoredDragScope$1) obj;
                return anchoredDraggableNode$drag$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$22 = new AnchoredDraggableNode$drag$2((ViewfinderInitScopeImpl) this.$forEachDelta, (MutableState) obj4, (Continuation) obj3, 1);
                anchoredDraggableNode$drag$22.L$0 = (ViewfinderExternalSurfaceHolder) obj2;
                return anchoredDraggableNode$drag$22.invokeSuspend(Unit.INSTANCE);
            case 2:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$23 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (CoroutineScope) obj4, 2);
                anchoredDraggableNode$drag$23.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$23.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$23.invokeSuspend(Unit.INSTANCE);
            case 3:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$24 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (PageFetcher) obj4, 3);
                anchoredDraggableNode$drag$24.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$24.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$24.invokeSuspend(Unit.INSTANCE);
            case 4:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$25 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealAgentsRepository) obj4, 4);
                anchoredDraggableNode$drag$25.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$25.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$25.invokeSuspend(Unit.INSTANCE);
            case 5:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$26 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (NonCustodialBitcoinLimitsProvider) obj4, 5);
                anchoredDraggableNode$drag$26.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$26.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$26.invokeSuspend(Unit.INSTANCE);
            case 6:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$27 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (BinaryBitmap) obj4, 6);
                anchoredDraggableNode$drag$27.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$27.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$27.invokeSuspend(Unit.INSTANCE);
            case 7:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$28 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealBoostProvider) obj4, 7);
                anchoredDraggableNode$drag$28.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$28.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$28.invokeSuspend(Unit.INSTANCE);
            case 8:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$29 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RewardSlotQueries$$ExternalSyntheticLambda0) obj4, 8);
                anchoredDraggableNode$drag$29.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$29.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$29.invokeSuspend(Unit.INSTANCE);
            case 9:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$210 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealBorrowDataManager) obj4, 9);
                anchoredDraggableNode$drag$210.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$210.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$210.invokeSuspend(Unit.INSTANCE);
            case 10:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$211 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealClipboardObserver) obj4, 10);
                anchoredDraggableNode$drag$211.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$211.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$211.invokeSuspend(Unit.INSTANCE);
            case 11:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$212 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealCryptoBalanceRepo) obj4, 11);
                anchoredDraggableNode$drag$212.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$212.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$212.invokeSuspend(Unit.INSTANCE);
            case 12:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$213 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealCryptoValueRepo) obj4, 12);
                anchoredDraggableNode$drag$213.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$213.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$213.invokeSuspend(Unit.INSTANCE);
            case 13:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$214 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealProfileNotificationsRepository) obj4, 13);
                anchoredDraggableNode$drag$214.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$214.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$214.invokeSuspend(Unit.INSTANCE);
            case 14:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$215 = new AnchoredDraggableNode$drag$2((RealEducationStoryRepository) obj4, (Continuation) obj3);
                anchoredDraggableNode$drag$215.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$215.$forEachDelta = (Throwable) obj2;
                return anchoredDraggableNode$drag$215.invokeSuspend(Unit.INSTANCE);
            case 15:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$216 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealAllowanceAppletTileRepository) obj4, 15);
                anchoredDraggableNode$drag$216.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$216.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$216.invokeSuspend(Unit.INSTANCE);
            case 16:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$217 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealApprovedContactsAppletTileRepository) obj4, 16);
                anchoredDraggableNode$drag$217.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$217.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$217.invokeSuspend(Unit.INSTANCE);
            case 17:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$218 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (ManagedAccountControlPresenter) obj4, 17);
                anchoredDraggableNode$drag$218.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$218.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$218.invokeSuspend(Unit.INSTANCE);
            case 18:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$219 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (SelectSponsorPresenter) obj4, 18);
                anchoredDraggableNode$drag$219.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$219.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$219.invokeSuspend(Unit.INSTANCE);
            case 19:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$220 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealFavoritesRepository) obj4, 19);
                anchoredDraggableNode$drag$220.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$220.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$220.invokeSuspend(Unit.INSTANCE);
            case 20:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$221 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (FormCashtagPresenter) obj4, 20);
                anchoredDraggableNode$drag$221.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$221.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$221.invokeSuspend(Unit.INSTANCE);
            case 21:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$222 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (PaymentActionHandler) obj4, 21);
                anchoredDraggableNode$drag$222.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$222.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$222.invokeSuspend(Unit.INSTANCE);
            case 22:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$223 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealStocksAppletTilePriceMovementRepository) obj4, 22);
                anchoredDraggableNode$drag$223.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$223.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$223.invokeSuspend(Unit.INSTANCE);
            case 23:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$224 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealStocksAppletTileRepository) obj4, 23);
                anchoredDraggableNode$drag$224.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$224.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$224.invokeSuspend(Unit.INSTANCE);
            case 24:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$225 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealCategoryBackend) obj4, 24);
                anchoredDraggableNode$drag$225.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$225.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$225.invokeSuspend(Unit.INSTANCE);
            case 25:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$226 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (EglCore) obj4, 25);
                anchoredDraggableNode$drag$226.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$226.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$226.invokeSuspend(Unit.INSTANCE);
            case 26:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$227 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (InvestingPortfolioPresenter) obj4, 26);
                anchoredDraggableNode$drag$227.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$227.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$227.invokeSuspend(Unit.INSTANCE);
            case 27:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$228 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) obj4, 27);
                anchoredDraggableNode$drag$228.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$228.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$228.invokeSuspend(Unit.INSTANCE);
            case 28:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$229 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealChatSessionManager) obj4, 28);
                anchoredDraggableNode$drag$229.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$229.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$229.invokeSuspend(Unit.INSTANCE);
            default:
                AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$230 = new AnchoredDraggableNode$drag$2((Continuation) obj3, (RealOffersRepositoryService) obj4, 29);
                anchoredDraggableNode$drag$230.L$0 = (FlowCollector) obj;
                anchoredDraggableNode$drag$230.$forEachDelta = obj2;
                return anchoredDraggableNode$drag$230.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v82, types: [kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RefCounted refCounted;
        FlowQuery$mapToList$$inlined$map$1 mapToList;
        Flow appLockMonitor$special$$inlined$map$2;
        Object obj2;
        Flow distinctUntilChanged;
        Pair pair;
        Continuation continuation;
        Flow flow;
        Continuation continuation2;
        Flow safeFlow;
        Flow cardModelView$textures$$inlined$combine$1;
        Object obj3;
        Flow allowance;
        Flow safeFlow2;
        Flow realGooglePayer$createWallet$$inlined$filter$1;
        Flow flow2;
        SharedFlow sharedFlow;
        Flow distinctUntilChanged2;
        ChannelFlowBuilder channelFlow;
        Flow flow3;
        Flow realActivityInvitePresenter;
        int i = 10;
        int i2 = 22;
        int i3 = 17;
        int i4 = 3;
        int i5 = 0;
        int i6 = 19;
        int i7 = 2;
        int i8 = 1;
        Continuation continuation3 = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (AnchoredDraggableState$anchoredDragScope$1) this.L$0;
                    DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = (DragGestureNode$startListeningForEvents$1) this.$forEachDelta;
                    ClickableKt$$ExternalSyntheticLambda0 clickableKt$$ExternalSyntheticLambda0 = new ClickableKt$$ExternalSyntheticLambda0(15, (AnchoredDraggableNode) this.this$0, anchoredDraggableState$anchoredDragScope$1);
                    this.label = 1;
                    if (dragGestureNode$startListeningForEvents$1.invoke(clickableKt$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = (ViewfinderExternalSurfaceHolder) this.L$0;
                    ((MutableState) this.this$0).setValue(Boolean.TRUE);
                    ViewfinderInitScopeImpl viewfinderInitScopeImpl = (ViewfinderInitScopeImpl) this.$forEachDelta;
                    switch (viewfinderExternalSurfaceHolder.$r8$classId) {
                        case 0:
                            refCounted = viewfinderExternalSurfaceHolder.refCountedSurface;
                            break;
                        default:
                            refCounted = viewfinderExternalSurfaceHolder.refCountedSurface;
                            break;
                    }
                    this.label = 1;
                    if (viewfinderInitScopeImpl.dispatchOnSurfaceSession(refCounted, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    MulticastedPagingData multicastedPagingData = new MulticastedPagingData((CoroutineScope) this.this$0, (PagingData) this.$forEachDelta);
                    this.label = 1;
                    if (flowCollector.emit(multicastedPagingData, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                PageFetcher pageFetcher = (PageFetcher) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    PageFetcher.GenerationInfo generationInfo = (PageFetcher.GenerationInfo) this.$forEachDelta;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(generationInfo.snapshot.pageEventFlow, new DataStoreImpl$data$1.AnonymousClass2(2, null, 6), 3);
                    AndroidSvg androidSvg = pageFetcher.retryEvents;
                    CallResult callResult = new CallResult();
                    androidSvg.getClass();
                    callResult.serviceNames = pageFetcher;
                    callResult.result = androidSvg;
                    PagingData pagingData = new PagingData(flowKt__MergeKt$flatMapConcat$$inlined$map$1, callResult, new HintHandler(generationInfo.snapshot), PagingData.AnonymousClass1.INSTANCE);
                    this.label = 1;
                    if (flowCollector2.emit(pagingData, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                Object obj4 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow3 = new SafeFlow(new BenefitsHubPresenter$models$1$1((SessionState) obj4, (RealAgentsRepository) this.this$0, (Continuation) null, 7));
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, safeFlow3, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                NonCustodialBitcoinLimitsProvider nonCustodialBitcoinLimitsProvider = (NonCustodialBitcoinLimitsProvider) this.this$0;
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                Object obj5 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert = WebViewGlueCommunicator.convert(Countries.asMoney(nonCustodialBitcoinLimitsProvider.cryptoBalanceRepo.getBitcoinBalance()), ((RealCurrencyConverter.Factory) nonCustodialBitcoinLimitsProvider.currencyConverterFactory).get((CurrencyCode) obj5));
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector4, convert, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                Object obj6 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) obj6).booleanValue();
                    BinaryBitmap binaryBitmap = (BinaryBitmap) this.this$0;
                    CardModelView$lighting$$inlined$map$1 cardModelView$lighting$$inlined$map$1 = booleanValue ? new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealCryptoBalanceRepo) binaryBitmap.matrix).getStablecoinBalance(), 24), i8) : new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealBalanceSnapshotManager) binaryBitmap.binarizer).select(), 24), 2);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector5, cardModelView$lighting$$inlined$map$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                RealBoostProvider realBoostProvider = (RealBoostProvider) this.this$0;
                CoroutineContext coroutineContext = realBoostProvider.ioDispatcher;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                Object obj7 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = (String) obj7;
                    RewardQueries rewardQueries = realBoostProvider.selectableRewardQueries;
                    if (str == null) {
                        mapToList = DBUtil.mapToList(DBUtil.toFlow(rewardQueries.rewards()), coroutineContext);
                    } else {
                        rewardQueries.getClass();
                        SelectableRewardQueries$rewardsExcept$2 selectableRewardQueries$rewardsExcept$2 = SelectableRewardQueries$rewardsExcept$2.INSTANCE;
                        mapToList = DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardQueries, str, new SelectableRewardQueries$$ExternalSyntheticLambda3(rewardQueries, i5))), coroutineContext);
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector6);
                    Object collect = mapToList.collect(new RealBoostProvider$getAllBoosts$$inlined$map$1$2(flowCollector6, realBoostProvider, i8), this);
                    if (collect != coroutineSingletons8) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons8) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                Object obj8 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 != 0) {
                    if (i17 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Slots slots = (Slots) CollectionsKt.firstOrNull((List) obj8);
                int ordinal = (slots != null ? slots.state : RewardSlotState.EMPTY).ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    obj2 = null;
                    appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(obj2, i6);
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda0 = (RewardSlotQueries$$ExternalSyntheticLambda0) this.this$0;
                    slots.getClass();
                    appLockMonitor$special$$inlined$map$2 = (Flow) rewardSlotQueries$$ExternalSyntheticLambda0.invoke(slots);
                    obj2 = null;
                }
                this.L$0 = obj2;
                this.$forEachDelta = obj2;
                this.label = 1;
                if (FlowKt.emitAll(flowCollector7, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons9) {
                    return coroutineSingletons9;
                }
                return Unit.INSTANCE;
            case 9:
                RealBorrowDataManager realBorrowDataManager = (RealBorrowDataManager) this.this$0;
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                Object obj9 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue2 = ((Boolean) obj9).booleanValue();
                    if (booleanValue2) {
                        distinctUntilChanged = new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, i6);
                    } else {
                        n nVar = realBorrowDataManager.borrowGlobalEntryPointGate;
                        distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(new FinishSetupTileBadgeCounter(i, ((RealFeatureEligibilityRepository) nVar.c).currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.MONEY_GLOBAL_BORROW_APPLET}), new RealBorrowGlobalEntryPointGate$hasValidAddress$$inlined$flatMapLatest$1(i8, nVar, null)));
                    }
                    SyncValueReader syncValueReader = realBorrowDataManager.syncValueReader;
                    if (booleanValue2) {
                        StateFlow singleValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.BorrowData);
                        pair = new Pair(singleValue, new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1(singleValue, i5));
                    } else {
                        StateFlow singleValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.GlobalBorrowData);
                        pair = new Pair(singleValue2, new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1(singleValue2, 2));
                    }
                    FinishSetupTileBadgeCounter combine = FlowKt.combine((Flow) pair.first, (Flow) pair.second, distinctUntilChanged, new RealBorrowDataManager$borrowHomeEntryPoint$1$1(realBorrowDataManager, null));
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector8, combine, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                RealClipboardObserver realClipboardObserver = (RealClipboardObserver) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                    if (((ActivityEvent) this.$forEachDelta) == ActivityEvent.RESUME) {
                        Duration.Companion companion = Duration.Companion;
                        continuation = null;
                        flow = FlowKt.merge(FlowKt.flowOn(new RealTransferManager$addCash$$inlined$map$1(TickerKt.m3996tickerFlowQTBD994$default(DurationKt.toDuration(1, DurationUnit.SECONDS)), realClipboardObserver, 15), realClipboardObserver.computationDispatcher), FlowKt.callbackFlow(new RealClipboardObserver$observeClipboard$3(realClipboardObserver, continuation, i8)));
                    } else {
                        continuation = null;
                        flow = EmptyFlow.INSTANCE;
                    }
                    this.L$0 = continuation;
                    this.$forEachDelta = continuation;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector9, flow, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) this.this$0;
                FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                Object obj10 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj10).booleanValue()) {
                        safeFlow = Trace.selectClientSyncValues(realCryptoBalanceRepo.featureFlagManager, SyncValueType.BALANCE_SNAPSHOT, FlowKt.distinctUntilChanged(new CardModelView$iconTexture$$inlined$map$1(realCryptoBalanceRepo.balanceForCurrency(CurrencyCode.XUS), 27)), FlowKt.distinctUntilChanged(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new CardModelView$iconTexture$$inlined$map$1(realCryptoBalanceRepo.syncValueReader.getAllValues(AndroidSyncValueSpecs.BalanceSnapshot), 28), 24)));
                        continuation2 = null;
                    } else {
                        continuation2 = null;
                        safeFlow = new SafeFlow(new PageFetcher$flow$1.AnonymousClass1(2, continuation2, 18));
                    }
                    this.L$0 = continuation2;
                    this.$forEachDelta = continuation2;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector10, safeFlow, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                Object obj11 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert2 = WebViewGlueCommunicator.convert(new AppLockMonitor$special$$inlined$map$2(new Money(new Long(100000000L), CurrencyCode.BTC, 4), i6), ((RealCurrencyConverter.Factory) ((RealCryptoValueRepo) this.this$0).currencyConverterFactory).get((CurrencyCode) obj11));
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector11, convert2, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) this.this$0;
                NotificationSettingsChecker notificationSettingsChecker = realProfileNotificationsRepository.notificationSettingsChecker;
                FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                Object obj12 = this.$forEachDelta;
                Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) obj12;
                    Flow flow4 = ((RealAndroidNotificationSettingsChecker) notificationSettingsChecker).notificationState;
                    List<UiCategoryNotificationPreference> list = uiNotificationSettings.category_preferences;
                    ArrayList arrayList = new ArrayList();
                    for (UiCategoryNotificationPreference uiCategoryNotificationPreference : list) {
                        Iterator it = NotificationChannelId.$ENTRIES.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                String str2 = ((NotificationChannelId) obj3).id;
                                NotificationCategory notificationCategory = uiCategoryNotificationPreference.category;
                                if (str2.equals(notificationCategory != null ? notificationCategory.name() : continuation3)) {
                                }
                            } else {
                                obj3 = continuation3;
                            }
                        }
                        NotificationChannelId notificationChannelId = (NotificationChannelId) obj3;
                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = notificationChannelId != null ? new RealTransferManager$addCash$$inlined$map$1(((RealAndroidNotificationSettingsChecker) notificationSettingsChecker).notificationChannelState(notificationChannelId), notificationChannelId, 24) : null;
                        if (realTransferManager$addCash$$inlined$map$1 != null) {
                            arrayList.add(realTransferManager$addCash$$inlined$map$1);
                        }
                        continuation3 = null;
                    }
                    if (arrayList.isEmpty()) {
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        cardModelView$textures$$inlined$combine$1 = new AppLockMonitor$special$$inlined$map$2(emptyMap, i6);
                    } else {
                        cardModelView$textures$$inlined$combine$1 = new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), i8);
                    }
                    Continuation continuation4 = null;
                    FlowExtensionsKt$doOnFirst$2 flowExtensionsKt$doOnFirst$2 = new FlowExtensionsKt$doOnFirst$2(realProfileNotificationsRepository, uiNotificationSettings, continuation4, 3);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector12);
                    Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(flowExtensionsKt$doOnFirst$2, continuation4, i5), flowCollector12, new Flow[]{flow4, cardModelView$textures$$inlined$combine$1});
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        combineInternal = Unit.INSTANCE;
                    }
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        combineInternal = Unit.INSTANCE;
                    }
                    if (combineInternal == obj13) {
                        return obj13;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) this.this$0;
                FlowCollector flowCollector13 = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.$forEachDelta;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realEducationStoryRepository.errorReporter.report(new UnknownEducationStoryError(realEducationStoryRepository.storyService.getClass().getSimpleName(), th), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    GetStoriesResult.UnknownFailure unknownFailure = new GetStoriesResult.UnknownFailure(th);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (flowCollector13.emit(unknownFailure, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                FlowCollector flowCollector14 = (FlowCollector) this.L$0;
                Object obj14 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = (String) obj14;
                    if (str3 == null) {
                        allowance = new AppLockMonitor$special$$inlined$map$2(RecurringPayments.NotLoaded.INSTANCE, i6);
                    } else {
                        RealAllowanceAppletTileRepository realAllowanceAppletTileRepository = (RealAllowanceAppletTileRepository) this.this$0;
                        allowance = realAllowanceAppletTileRepository.dependentAllowanceManager.getAllowance(str3, PlatformKt.activeAccountToken(realAllowanceAppletTileRepository.sessionManager));
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector14, allowance, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                FlowCollector flowCollector15 = (FlowCollector) this.L$0;
                Object obj15 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FamilyProfile familyProfile = (FamilyProfile) obj15;
                    if (Intrinsics.areEqual(familyProfile, FamilyProfile.Standard.INSTANCE)) {
                        safeFlow2 = new AppLockMonitor$special$$inlined$map$2(AppletAvailabilityState.UNAVAILABLE, i6);
                    } else {
                        if (!(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        safeFlow2 = new SafeFlow(new FormCashtag.AnonymousClass8.AnonymousClass2((RealApprovedContactsAppletTileRepository) this.this$0, continuation3, i4));
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector15, safeFlow2, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                FlowCollector flowCollector16 = (FlowCollector) this.L$0;
                Object obj16 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FamilyProfile familyProfile2 = (FamilyProfile) obj16;
                    if (familyProfile2 instanceof FamilyProfile.ManagedAccount) {
                        String str4 = ((FamilyProfile.ManagedAccount) familyProfile2).firstName;
                        if (str4 == null) {
                            str4 = "";
                        }
                        realGooglePayer$createWallet$$inlined$filter$1 = new AppLockMonitor$special$$inlined$map$2(str4, i6);
                    } else {
                        ManagedAccountControlPresenter managedAccountControlPresenter = (ManagedAccountControlPresenter) this.this$0;
                        realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(managedAccountControlPresenter.deps.customerStore.getCustomerForId(((DependentControlScreen.ManagedAccount) managedAccountControlPresenter.args).dependentCustomerToken), 20);
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector16, realGooglePayer$createWallet$$inlined$filter$1, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                FlowCollector flowCollector17 = (FlowCollector) this.L$0;
                Object obj17 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow search$default = RealRecipientRepository.search$default(((SelectSponsorPresenter) this.this$0).recipientRepository, (String) obj17, null, null, null, null, 16382);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector17, search$default, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                RealFavoritesRepository realFavoritesRepository = (RealFavoritesRepository) this.this$0;
                FlowCollector flowCollector18 = (FlowCollector) this.L$0;
                Object obj18 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RewardSlotQueries rewardSlotQueries = realFavoritesRepository.customerQueries;
                    List list2 = (List) obj18;
                    rewardSlotQueries.getClass();
                    list2.getClass();
                    CustomerQueries$forIds$2 customerQueries$forIds$2 = CustomerQueries$forIds$2.INSTANCE;
                    FlowQuery$mapToList$$inlined$map$1 mapToList2 = DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardSlotQueries, list2, new CustomerQueries$$ExternalSyntheticLambda7(rewardSlotQueries, i4))), realFavoritesRepository.ioDispatcher);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector18);
                    Object collect2 = mapToList2.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector18, 28), this);
                    if (collect2 != coroutineSingletons19) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons19) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                FlowCollector flowCollector19 = (FlowCollector) this.L$0;
                Object obj19 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow4 = new SafeFlow(new AnimationsKt$takeUntil$1$1.AnonymousClass1((FormCashtagPresenter) this.this$0, (String) obj19, continuation3, 16));
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector19, safeFlow4, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                FlowCollector flowCollector20 = (FlowCollector) this.L$0;
                Object obj20 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentAction.HasPaymentToken hasPaymentToken = (PaymentAction.HasPaymentToken) obj20;
                    PaymentManager paymentManager = ((PaymentActionHandler) this.this$0).paymentManager;
                    String paymentToken = hasPaymentToken.getPaymentToken();
                    paymentToken.getClass();
                    Boolean valueOf = Boolean.valueOf(((RealPaymentManager) paymentManager).pendingPaymentTokens.contains(paymentToken));
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector20);
                    Object emit = new Camera$special$$inlined$map$1.AnonymousClass2(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(27, flowCollector20, hasPaymentToken), i3).emit(valueOf, this);
                    if (emit != coroutineSingletons21) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit != coroutineSingletons21) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit != coroutineSingletons21) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit != coroutineSingletons21) {
                        emit = Unit.INSTANCE;
                    }
                    if (emit == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                FlowCollector flowCollector21 = (FlowCollector) this.L$0;
                Object obj21 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj21).booleanValue()) {
                        RealHistoricalPriceTickRefresher realHistoricalPriceTickRefresher = ((RealStocksAppletTilePriceMovementRepository) this.this$0).historicalPriceTickRefresher;
                        HistoricalRange historicalRange = RealStocksAppletTilePriceMovementRepository.STOCKS_RANGE;
                        historicalRange.getClass();
                        synchronized (realHistoricalPriceTickRefresher.polledStockFlows) {
                            try {
                                LinkedHashMap linkedHashMap = realHistoricalPriceTickRefresher.polledStockFlows;
                                Object obj22 = linkedHashMap.get(historicalRange);
                                if (obj22 == null) {
                                    obj22 = FlowKt.shareIn(FlowKt.channelFlow(new InvestingHomeView$onScrollFlow$1(realHistoricalPriceTickRefresher, historicalRange, continuation3, i8)), realHistoricalPriceTickRefresher.scope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                                    linkedHashMap.put(historicalRange, obj22);
                                }
                                sharedFlow = (SharedFlow) obj22;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (sharedFlow.getReplayCache().isEmpty()) {
                            sharedFlow = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i7, continuation3, 20), sharedFlow);
                        }
                        flow2 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealProfileManager$profileOrNull$2((RealStocksAppletTilePriceMovementRepository) this.this$0, continuation3, 26), sharedFlow), new MulticastedPagingData$asPagingData$2((RealStocksAppletTilePriceMovementRepository) this.this$0, continuation3, 6));
                    } else {
                        flow2 = EmptyFlow.INSTANCE;
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector21, flow2, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                RealStocksAppletTileRepository realStocksAppletTileRepository = (RealStocksAppletTileRepository) this.this$0;
                FlowCollector flowCollector22 = (FlowCollector) this.L$0;
                Object obj23 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal2 = ((RealStocksAppletTileRepository.StocksActivity) obj23).ordinal();
                    if (ordinal2 == 0) {
                        RealStocksAppletTilePriceMovementRepository realStocksAppletTilePriceMovementRepository = (RealStocksAppletTilePriceMovementRepository) realStocksAppletTileRepository.priceMovementRepository;
                        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1(realStocksAppletTilePriceMovementRepository.activityLifecycleStates, i4)), new AnchoredDraggableNode$drag$2(continuation3, realStocksAppletTilePriceMovementRepository, i2));
                        RealInvestmentEntities realInvestmentEntities = realStocksAppletTilePriceMovementRepository.investmentEntities;
                        InvestmentEntityQueries investmentEntityQueries = realInvestmentEntities.cashDatabase.investmentHoldingQueries;
                        investmentEntityQueries.getClass();
                        InvestmentHoldingQueries$rawHoldings$2 investmentHoldingQueries$rawHoldings$2 = InvestmentHoldingQueries$rawHoldings$2.INSTANCE;
                        SqlDriver sqlDriver = investmentEntityQueries.driver;
                        InvestmentHoldingQueries$$ExternalSyntheticLambda5 investmentHoldingQueries$$ExternalSyntheticLambda5 = new InvestmentHoldingQueries$$ExternalSyntheticLambda5(investmentEntityQueries, i5);
                        sqlDriver.getClass();
                        distinctUntilChanged2 = FlowKt.distinctUntilChanged(new Transform$special$$inlined$map$1(FlowKt.combine(transformLatest, FlowKt.transformLatest(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-1230128829, new String[]{"investment_holding"}, sqlDriver, "InvestmentHolding.sq", "rawHoldings", "SELECT investment_holding.token, investment_holding.units, investment_holding.invested_amount, investment_holding.currency, investment_holding.state, investment_holding.daily_gain_params, investment_holding.average_cost\nFROM investment_holding\nWHERE state = \"OWNED\"\nORDER BY invested_amount DESC", investmentHoldingQueries$$ExternalSyntheticLambda5)), realInvestmentEntities.ioDispatcher), new RealInvestmentEntities$ownedStocks$$inlined$flatMapLatest$1(continuation3, realInvestmentEntities, i7)), realStocksAppletTilePriceMovementRepository.investmentActivity.isFirstDayOfTrading(), RealStocksAppletTilePriceMovementRepository$models$5.INSTANCE), realStocksAppletTilePriceMovementRepository, 23));
                    } else if (ordinal2 == 1) {
                        distinctUntilChanged2 = new AppLockMonitor$special$$inlined$map$2(RealStocksAppletTileRepository.StocksModel.Uninstalled.INSTANCE, i6);
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        distinctUntilChanged2 = new AppLockMonitor$special$$inlined$map$2(realStocksAppletTileRepository.zeroBalanceModel(), i6);
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector22, distinctUntilChanged2, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                FlowCollector flowCollector23 = (FlowCollector) this.L$0;
                Object obj24 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list3 = (List) obj24;
                    RealEntityPriceRefresher realEntityPriceRefresher = ((RealCategoryBackend) this.this$0).entityPriceRefresher;
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new InvestmentEntityToken(((Investment_entity) it2.next()).token));
                    }
                    Flow observe = realEntityPriceRefresher.observe(arrayList2);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector23);
                    Object collect3 = observe.collect(new RealCustomerStore$getCustomersForIds$$inlined$map$1.AnonymousClass2(flowCollector23, list3, 5), this);
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (collect3 != coroutineSingletons25) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 != coroutineSingletons25) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                EglCore eglCore = (EglCore) this.this$0;
                FlowCollector flowCollector24 = (FlowCollector) this.L$0;
                Object obj25 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TakeUntil takeUntil = TakeUntilKt.takeUntil(new SafeFlow(new CheckStatusPresenter.AnonymousClass1(eglCore, continuation3, 14)), (SharedFlowImpl) eglCore.eglConfig);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector24, takeUntil, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                InvestingPortfolioPresenter investingPortfolioPresenter = (InvestingPortfolioPresenter) this.this$0;
                FlowCollector flowCollector25 = (FlowCollector) this.L$0;
                Object obj26 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair2 = (Pair) obj26;
                    HistoricalRange historicalRange2 = (HistoricalRange) pair2.first;
                    boolean booleanValue3 = ((Boolean) pair2.second).booleanValue();
                    int i36 = InvestingPortfolioPresenter.$r8$clinit;
                    boolean isDependentPortfolio = investingPortfolioPresenter.isDependentPortfolio();
                    RealInvestingHistoricalData realInvestingHistoricalData = investingPortfolioPresenter.historicalData;
                    Continuation continuation5 = null;
                    if (isDependentPortfolio) {
                        if (booleanValue3) {
                            historicalRange2 = HistoricalRange.DAY;
                        }
                        HistoricalRange historicalRange3 = historicalRange2;
                        String str5 = investingPortfolioPresenter.screen.dependentCustomerToken;
                        historicalRange3.getClass();
                        channelFlow = FlowKt.channelFlow(new GLThread$start$2(realInvestingHistoricalData, historicalRange3, str5, continuation5, 15));
                    } else {
                        historicalRange2.getClass();
                        channelFlow = FlowKt.channelFlow(new GLThread$start$2(realInvestingHistoricalData, historicalRange2, continuation5, continuation5, 15));
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector25, channelFlow, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                FlowCollector flowCollector26 = (FlowCollector) this.L$0;
                Object obj27 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityEvent activityEvent = (ActivityEvent) obj27;
                    int ordinal3 = activityEvent.ordinal();
                    if (ordinal3 == 1) {
                        flow3 = (FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) this.this$0;
                    } else {
                        if (ordinal3 != 4) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(activityEvent, "Unexpected event: ");
                            return null;
                        }
                        flow3 = EmptyFlow.INSTANCE;
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector26, flow3, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                FlowCollector flowCollector27 = (FlowCollector) this.L$0;
                Object obj28 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str6 = (String) obj28;
                    RealChatManager realChatManager = (RealChatManager) ((RealChatSessionManager) this.this$0).chatManager;
                    if (str6 == null) {
                        realActivityInvitePresenter = new SafeFlow(new PageFetcher$flow$1.AnonymousClass1(i7, continuation3, 29));
                    } else {
                        UnleashContext unleashContext = realChatManager.messagesStreamingSubscriber;
                        realActivityInvitePresenter = new RealActivityInvitePresenter(i2, FlowKt.shareIn(FlowKt.channelFlow(new CashMapPresenter$models$3$1(unleashContext, str6, continuation3, i3)), (CoroutineScope) unleashContext.remoteAddress, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1), realChatManager, str6);
                    }
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector27, realActivityInvitePresenter, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                FlowCollector flowCollector28 = (FlowCollector) this.L$0;
                Object obj29 = this.$forEachDelta;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RewardWithSelection rewardWithSelection = (RewardWithSelection) obj29;
                    Flow merchantTokensForReward = rewardWithSelection != null ? ((RealOffersRepositoryService) this.this$0).boostRepository.getMerchantTokensForReward(rewardWithSelection.token) : new AppLockMonitor$special$$inlined$map$2(continuation3, i6);
                    this.L$0 = null;
                    this.$forEachDelta = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector28, merchantTokensForReward, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchoredDraggableNode$drag$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$forEachDelta = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchoredDraggableNode$drag$2(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
