package androidx.lifecycle.compose;

import androidx.compose.runtime.ProduceStateScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProduceStateScope $$this$produceState;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_collectAsStateWithLifecycle;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(Flow flow, ProduceStateScope produceStateScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_collectAsStateWithLifecycle = flow;
        this.$$this$produceState = produceStateScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, continuation, 0);
            default:
                return new FlowExtKt$collectAsStateWithLifecycle$1$1$1$2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProduceStateScope produceStateScope = this.$$this$produceState;
        Flow flow = this.$this_collectAsStateWithLifecycle;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, 2);
                    this.label = 1;
                    if (flow.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$12 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, 1);
                    this.label = 1;
                    if (flow.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
