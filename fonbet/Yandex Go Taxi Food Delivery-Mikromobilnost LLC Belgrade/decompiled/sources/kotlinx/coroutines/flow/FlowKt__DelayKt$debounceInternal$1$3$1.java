package kotlinx.coroutines.flow;

import defpackage.jb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements tls {
    final /* synthetic */ vpr $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(vpr vprVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.$downstream = vprVar;
        this.$lastValue = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, continuation, this.$lastValue);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = this.$downstream;
            jb20 jb20Var = vez0.b;
            Object obj2 = this.$lastValue.element;
            if (obj2 == jb20Var) {
                obj2 = null;
            }
            this.label = 1;
            if (vprVar.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$lastValue.element = null;
        return zy11.a;
    }
}
