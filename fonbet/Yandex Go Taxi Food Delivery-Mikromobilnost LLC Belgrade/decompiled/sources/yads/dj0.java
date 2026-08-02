package yads;

import defpackage.e471;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class dj0 extends SuspendLambda implements wls {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ e471 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(List list, e471 e471Var, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.d = e471Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        dj0 dj0Var = new dj0(this.c, this.d, continuation);
        dj0Var.b = obj;
        return dj0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        dj0 dj0Var = (dj0) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dj0Var.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        tse tseVar = (tse) this.b;
        List list = this.c;
        e471 e471Var = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tje.N(tseVar, null, null, new cj0(e471Var, (String) it.next(), null), 3);
        }
        return zy11.a;
    }
}
