package app.cash.sqldelight.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class FlowQuery$mapToList$$inlined$map$1 implements Flow {
    public final /* synthetic */ CoroutineContext $context$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public /* synthetic */ FlowQuery$mapToList$$inlined$map$1(Flow flow, CoroutineContext coroutineContext, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$context$inlined = coroutineContext;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        CoroutineContext coroutineContext = this.$context$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new FlowQuery$mapToOne$$inlined$map$1$2(flowCollector, coroutineContext, 1), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flow.collect(new FlowQuery$mapToOne$$inlined$map$1$2(flowCollector, coroutineContext, 2), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = flow.collect(new FlowQuery$mapToOne$$inlined$map$1$2(flowCollector, coroutineContext, 3), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
