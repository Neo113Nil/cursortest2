package kotlinx.coroutines.flow;

import defpackage.mi9;
import defpackage.mvg;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Loi9;", "value", "", "<anonymous>", "(Loi9;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $downStream;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(vpr vprVar, Continuation continuation) {
        super(2, continuation);
        this.$downStream = vprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = ((oi9) obj).a;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new oi9(((oi9) obj).a), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = this.$downStream;
            if (!(obj2 instanceof ni9)) {
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (vprVar.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            kotlin.b.b(obj);
        }
        if (!(obj2 instanceof mi9)) {
            return Boolean.TRUE;
        }
        Throwable a = oi9.a(obj2);
        if (a == null) {
            return Boolean.FALSE;
        }
        throw a;
    }
}
