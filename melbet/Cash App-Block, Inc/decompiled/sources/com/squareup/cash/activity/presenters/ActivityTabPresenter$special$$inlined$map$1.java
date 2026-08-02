package com.squareup.cash.activity.presenters;

import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes5.dex */
public final class ActivityTabPresenter$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SharedFlowImpl $this_unsafeTransform$inlined;

    public /* synthetic */ ActivityTabPresenter$special$$inlined$map$1(SharedFlowImpl sharedFlowImpl, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = sharedFlowImpl;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        SharedFlowImpl sharedFlowImpl = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                sharedFlowImpl.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, 2), continuation);
                break;
            default:
                sharedFlowImpl.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, 4), continuation);
                break;
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
