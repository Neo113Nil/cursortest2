package flex.network.cache.action;

import defpackage.jp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ovw;
import defpackage.p7j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.network.cache.action.InvalidateCacheActionHandler$handle$1", f = "InvalidateCacheAction.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InvalidateCacheActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ovw $action;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidateCacheActionHandler$handle$1(a aVar, ovw ovwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = ovwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InvalidateCacheActionHandler$handle$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InvalidateCacheActionHandler$handle$1 invalidateCacheActionHandler$handle$1 = (InvalidateCacheActionHandler$handle$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        invalidateCacheActionHandler$handle$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        jp50 jp50Var = this.this$0.a;
        ovw ovwVar = this.$action;
        jp50Var.delete(new p7j0(4, ovwVar.a, ovwVar.b));
        return zy11.a;
    }
}
