package com.squareup.cash.graphics.swampgl.components;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.boost.backend.RealBoostRepository$getBoostsForTokens$$inlined$map$1$2;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.formview.components.arcade.TextInputValidator;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager$syncValueBased$$inlined$map$1;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$2$1;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$1;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class Transform$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ Transform$special$$inlined$map$1(Flow flow, Object obj, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 7;
        int i4 = 2;
        int i5 = 3;
        int i6 = 13;
        int i7 = 16;
        int i8 = 1;
        Object obj = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((ChannelFlowBuilder) flow).collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(25, flowCollector, (Transform) obj), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1(flowCollector, (Function2) obj), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((Transform$special$$inlined$map$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, 5), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flow.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(9, flowCollector, (RealFamilyAccountsManager) obj), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((RealCustomerStore$getCustomersForIds$$inlined$map$1) flow).collect(new RealCustomerStore$getCustomersForIds$$inlined$map$1.AnonymousClass2(flowCollector, (List) obj, i8), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((RealCustomerStore$getCustomersForIds$$inlined$map$1) flow).collect(new RealBoostRepository$getBoostsForTokens$$inlined$map$1$2(flowCollector, (ArrayList) obj, 1), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flow.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(i6, flowCollector, (ProfilePresenter) obj), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((RealGooglePayer$createWallet$$inlined$filter$1) flow).collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(i7, flowCollector, (LocalEditorialPresenter) obj), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((ChannelFlowTransformLatest) flow).collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(18, flowCollector, (RealFavoritesManager) obj), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = flow.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(19, flowCollector, (LocalHomePresenter) obj), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, 6), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = flow.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(23, flowCollector, (TextInputValidator) obj), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, 7), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2(flowCollector, (ZiplineHistoryDataJavaScripter) obj, 1), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(26, flowCollector, (PaymentAction.CancelInvestmentOrderAction) obj), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i8, flowCollector, (LocalHomePresenter) obj), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i4, flowCollector, (LocalHomePresenter) obj), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i5, flowCollector, (LocalPosCheckInPresenter) obj), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = ((RealInstrumentManager$syncValueBased$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i2, flowCollector, (CashInstrumentType) obj), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = ((RealInstrumentManager$syncValueBased$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i3, flowCollector, (CashInstrumentType[]) obj), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = ((RealInstrumentManager$syncValueBased$$inlined$map$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, 8), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = ((RealInstrumentManager$syncValueBased$$inlined$map$1) flow).collect(new AndroidPermissionChecker$granted$$inlined$map$1.AnonymousClass2(flowCollector, (String[]) obj, 2), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = ((ChannelFlowTransformLatest) flow).collect(new AndroidPermissionChecker$granted$$inlined$map$1.AnonymousClass2(flowCollector, (String[]) obj, 3), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = ((FinishSetupTileBadgeCounter) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(11, flowCollector, (RealStocksAppletTilePriceMovementRepository) obj), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = ((ChannelFlowBuilder) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(12, flowCollector, (PersistentHistoricalDataCache) obj), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = ((ChannelFlowBuilder) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i6, flowCollector, (HashSet) obj), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = flow.collect(new RepeatClicksOnLongPress$attachTo$2$1(14, flowCollector, (InvestmentEntityToken) obj), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = ((RealDrawerOpener$getDrawerScreen$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(15, flowCollector, (ScheduledTransactionPreference.Type) obj), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = flow.collect(new RepeatClicksOnLongPress$attachTo$2$1(i7, flowCollector, (Map) obj), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(17, flowCollector, (SyncInvestmentHolding) obj), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
