package androidx.lifecycle.compose;

import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Lifecycle.State $minActiveState;
    public final /* synthetic */ Flow $this_collectAsStateWithLifecycle;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$context = coroutineContext;
        this.$this_collectAsStateWithLifecycle = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, continuation);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2(this.$context, this.$this_collectAsStateWithLifecycle, (ProduceStateScope) this.L$0, null, 5);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, sliderState$drag$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
