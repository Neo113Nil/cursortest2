package com.squareup.cash.recipients.data;

import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class RealCustomerStore$getCustomerForId$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ RealCustomerStore$getCustomerForId$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 18;
        int i4 = 15;
        int i5 = 3;
        int i6 = 26;
        int i7 = 14;
        int i8 = 13;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowQuery$mapToList$$inlined$map$1.collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 2), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowQuery$mapToList$$inlined$map$1.collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flowQuery$mapToList$$inlined$map$1.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = flowQuery$mapToList$$inlined$map$1.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 23), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flowQuery$mapToList$$inlined$map$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 28), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = flowQuery$mapToList$$inlined$map$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = flowQuery$mapToList$$inlined$map$1.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, i6), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = flowQuery$mapToList$$inlined$map$1.collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = flowQuery$mapToList$$inlined$map$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = flowQuery$mapToList$$inlined$map$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 19), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = flowQuery$mapToList$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 5), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = flowQuery$mapToList$$inlined$map$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, 6), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = flowQuery$mapToList$$inlined$map$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = flowQuery$mapToList$$inlined$map$1.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = flowQuery$mapToList$$inlined$map$1.collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = flowQuery$mapToList$$inlined$map$1.collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, 4), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = flowQuery$mapToList$$inlined$map$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = flowQuery$mapToList$$inlined$map$1.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i8), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect24 = flowQuery$mapToList$$inlined$map$1.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i7), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
