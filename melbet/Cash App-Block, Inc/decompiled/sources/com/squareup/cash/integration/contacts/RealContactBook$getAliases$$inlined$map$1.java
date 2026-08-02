package com.squareup.cash.integration.contacts;

import com.squareup.util.coroutines.StateFlowKt$combineUndispatched$1$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class RealContactBook$getAliases$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $maxAliases$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public /* synthetic */ RealContactBook$getAliases$$inlined$map$1(Flow flow, int i, int i2) {
        this.$r8$classId = i2;
        this.$this_unsafeTransform$inlined = flow;
        this.$maxAliases$inlined = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = this.$maxAliases$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new StateFlowKt$combineUndispatched$1$1$1$1(flowCollector, i2, 4), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new StateFlowKt$combineUndispatched$1$1$1$1(flowCollector, i2, 3), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
