package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class e22 extends aur implements Function2 {
    public /* synthetic */ Object j;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e22 e22Var = new e22(2, continuation);
        e22Var.j = obj;
        return e22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e22) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(f22.c, Boolean.FALSE);
        return Unit.a;
    }
}
