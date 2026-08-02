package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class tx5 extends aur implements Function2 {
    public /* synthetic */ Object j;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        tx5 tx5Var = new tx5(2, continuation);
        tx5Var.j = obj;
        return tx5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tx5) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.f(xx5.c);
        lpiVar.f(xx5.d);
        return Unit.a;
    }
}
