package com.squareup.cash.history.presenters;

import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.runtime.MutableState;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.persistence.ShadowedSyncEntityStore;
import com.squareup.cash.clientsync.readers.AndroidSyncEntitySpecs$Payment$1;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.presenters.RealBitcoinPaymentManager;
import com.squareup.cash.permissions.AndroidPermissionChecker;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.StatementType;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.CombineKt;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes6.dex */
public final class RealActivityInvitePresenter implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final Object appConfig;
    public final Object flowStarter;
    public final Object navigator;

    public RealActivityInvitePresenter(AppConfigManager appConfigManager, Analytics analytics, FlowStarter flowStarter, Navigator navigator) {
        this.$r8$classId = 0;
        navigator.getClass();
        this.appConfig = appConfigManager;
        this.flowStarter = flowStarter;
        this.navigator = navigator;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 2;
        int i4 = 9;
        int i5 = 8;
        int i6 = 0;
        int i7 = 10;
        int i8 = 1;
        Object obj = this.navigator;
        Object obj2 = this.flowStarter;
        Object obj3 = this.appConfig;
        switch (i) {
            case 0:
                Object collect = ((RealAppConfigManager) ((AppConfigManager) obj3)).invitationConfig().collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (collect != coroutineSingletons) {
                    collect = Unit.INSTANCE;
                }
                if (collect != coroutineSingletons) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((FlowQuery$mapToList$$inlined$map$1) obj3).collect(new AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2(flowCollector, (String) obj2, (AccountDocumentsPresenter) obj, i8), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((RealBadger2$scheduleBadgeClearingWork$$inlined$map$1) obj3).collect(new SwipeableState$animateTo$2(i5, flowCollector, (String) obj2, (StatementType) obj), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((ChannelFlowTransformLatest) obj3).collect(new AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2(flowCollector, (String) obj2, (AccountDocumentsPresenter) obj, i6), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((Flow) obj3).collect(new SwipeableState$animateTo$2(26, flowCollector, (RealBitcoinGraphModelProvider) obj2, (HistoricalRange) obj), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj3).collect(new RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2(flowCollector, (RealBoostProvider) obj2, (List) obj, i6), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((FlowQuery$mapToList$$inlined$map$1) obj3).collect(new RealBoostProvider$getBoostSlots$lambda$0$0$$inlined$map$1$2(flowCollector, (RealBoostProvider) obj2, (List) obj, i8), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((Flow) obj3).collect(new RealBlockersHelper$collectBlockersActions$2(i5, flowCollector, (ShadowedSyncEntityStore) obj2, (SyncEntityType) obj), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((Flow) obj3).collect(new RealBlockersHelper$collectBlockersActions$2(i4, flowCollector, (ShadowedSyncEntityStore) obj2, (SyncValueType) obj), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((Flow) obj3).collect(new RealBlockersHelper$collectBlockersActions$2(i7, flowCollector, (AndroidSyncEntitySpecs$Payment$1) obj2, (RealSyncEntityReader) obj), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((Flow) obj3).collect(new RealBlockersHelper$collectBlockersActions$2(i2, flowCollector, (DateFilter) obj2, (EarningsTimeFrame) obj), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Flow[] flowArr = (Flow[]) obj3;
                Object combineInternal = CombineKt.combineInternal(continuation, new CardModelView$textures$$inlined$combine$1.AnonymousClass2(flowArr, i3), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, (List) obj2, (RealFamilyAppletTileRepository) obj, i7), flowCollector, flowArr);
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect12 = ((Flow) obj3).collect(new RealBlockersHelper$collectBlockersActions$2(23, flowCollector, (String) obj2, (SponsorshipTier) obj), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect13 = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(i8, flowCollector, (RealInvestingActivitiesManager) obj2, (ChronoUnit) obj), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect14 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(i3, flowCollector, (PaymentActionHandler) obj2, (PaymentAction.ReverseDepositAction) obj), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect15 = ((FlowQuery$mapToList$$inlined$map$1) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(3, flowCollector, (PaymentActionHandler) obj2, (PaymentAction.ShowProfile) obj), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect16 = ((FormCashtag$8$invokeSuspend$$inlined$map$1) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(7, flowCollector, (PersistentHistoricalDataCache) obj2, (HistoricalRange) obj), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect17 = ((Flow) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(i5, flowCollector, (RealEntityPriceRefresher) obj2, (List) obj), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect18 = ((Flow) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(i4, flowCollector, (RealInvestingHistoricalData) obj2, (GetHistoricalExchangeDataRequest) obj), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect19 = ((Flow) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(i7, flowCollector, (GetInvestmentEntityHistoricalDataResponse) obj2, (RealInvestingHistoricalData) obj), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect20 = ((Flow) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(12, flowCollector, (Map) obj2, (RealDependentInvestmentEntities) obj), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect21 = ((FlowQuery$mapToList$$inlined$map$1) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(19, flowCollector, (InvestingStockDetailsPresenter) obj2, (StockDetails) obj), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect22 = ((ReadonlySharedFlow) obj3).$$delegate_0.collect(new MusicPresenter$models$1$1.AnonymousClass2(22, flowCollector, (RealChatManager) obj2, (String) obj), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect23 = ((NullStateSwipeConfigProvider) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(flowCollector, (MoneybotHomePresenter) obj2, (MutableState) obj, 25), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect24 = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj3).collect(new MusicPresenter$models$1$1.AnonymousClass2(28, flowCollector, (RealAndroidNotificationSettingsChecker) obj2, (NotificationChannelId) obj), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect25 = ((Flow) obj3).collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(i7, flowCollector, (RealBitcoinPaymentManager) obj2, (CryptoPaymentOrigin) obj), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect26 = ((Flow) obj3).collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(11, flowCollector, (AssetPublicSuffixList) obj2, (CryptoPaymentOrigin) obj), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect27 = ((Flow) obj3).collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(i6, flowCollector, (String[]) obj2, (AndroidPermissionChecker) obj), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect28 = ((Flow) obj3).collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(29, flowCollector, (ShareTarget.Instagram) obj2, (StuckPlayerDetector) obj), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect29 = ((Flow) obj3).collect(new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector, (ShareTarget.SaveToPhotos) obj2, (StuckPlayerDetector) obj, i8), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealActivityInvitePresenter(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.appConfig = obj;
        this.flowStarter = obj2;
        this.navigator = obj3;
    }
}
