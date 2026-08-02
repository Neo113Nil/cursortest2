package kotlinx.coroutines.flow;

import defpackage.mvg;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loi9;", "", "value", "Lzy11;", "<anonymous>", "(Loi9;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend", v = 1)
/* loaded from: classes9.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(vpr vprVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(2, continuation);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = vprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$downstream, continuation, this.$lastValue);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = ((oi9) obj).a;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new oi9(((oi9) obj).a), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, jb20] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        ?? r0 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ref$ObjectRef = this.$lastValue;
            boolean z = r0 instanceof ni9;
            if (!z) {
                ref$ObjectRef.element = r0;
            }
            vpr vprVar = this.$downstream;
            if (z) {
                Throwable a = oi9.a(r0);
                if (a != null) {
                    throw a;
                }
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    if (obj2 == vez0.b) {
                        obj2 = null;
                    }
                    this.L$0 = null;
                    this.L$1 = r0;
                    this.L$2 = ref$ObjectRef;
                    this.L$3 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (vprVar.emit(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.element = vez0.d;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
        kotlin.b.b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = vez0.d;
        return zy11.a;
    }
}
