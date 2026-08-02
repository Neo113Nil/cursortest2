package androidx.paging;

import androidx.compose.material3.SliderState$drag$2;
import androidx.paging.FlowExtKt$simpleScan$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowExtKt$simpleRunningReduce$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function3 $operation;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_simpleRunningReduce;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$simpleRunningReduce$1(Flow flow, Function3 function3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_simpleRunningReduce = flow;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function3 function3 = this.$operation;
        Flow flow = this.$this_simpleRunningReduce;
        switch (i) {
            case 0:
                FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(flow, function3, continuation, 0);
                flowExtKt$simpleRunningReduce$1.L$0 = obj;
                return flowExtKt$simpleRunningReduce$1;
            default:
                FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$12 = new FlowExtKt$simpleRunningReduce$1(flow, function3, continuation, 1);
                flowExtKt$simpleRunningReduce$12.L$0 = obj;
                return flowExtKt$simpleRunningReduce$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((FlowExtKt$simpleRunningReduce$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((FlowExtKt$simpleRunningReduce$1) create((SimpleProducerScopeImpl) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function3 function3 = this.$operation;
        Flow flow = this.$this_simpleRunningReduce;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = FlowExtKt.NULL;
                    FlowExtKt$simpleScan$1.AnonymousClass1 anonymousClass1 = new FlowExtKt$simpleScan$1.AnonymousClass1(ref$ObjectRef, function3, flowCollector, i2);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2(function3, new ChannelFlowCollector((SimpleProducerScopeImpl) this.L$0), continuation, 9);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, sliderState$drag$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
