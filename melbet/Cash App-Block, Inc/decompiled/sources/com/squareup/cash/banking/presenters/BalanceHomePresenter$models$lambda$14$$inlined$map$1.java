package com.squareup.cash.banking.presenters;

import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class BalanceHomePresenter$models$lambda$14$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealFeatureFlagManager$values$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ BalanceHomePresenter$models$lambda$14$$inlined$map$1(RealFeatureFlagManager$values$$inlined$map$1 realFeatureFlagManager$values$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realFeatureFlagManager$values$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealFeatureFlagManager$values$$inlined$map$1 realFeatureFlagManager$values$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realFeatureFlagManager$values$$inlined$map$1.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, 29), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = realFeatureFlagManager$values$$inlined$map$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 25), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
