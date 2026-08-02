package yads;

import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class pr2 extends SuspendLambda implements wls {
    public /* synthetic */ Object b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        pr2 pr2Var = new pr2(2, continuation);
        pr2Var.b = obj;
        return pr2Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        pr2 pr2Var = new pr2(2, (Continuation) obj2);
        pr2Var.b = (sr2) obj;
        return pr2Var.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        return (sr2) this.b;
    }
}
