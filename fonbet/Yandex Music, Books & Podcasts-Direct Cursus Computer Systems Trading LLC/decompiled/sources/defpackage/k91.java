package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k91 extends aur implements Function2 {
    public /* synthetic */ Object j;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        k91 k91Var = new k91(2, continuation);
        k91Var.j = obj;
        return k91Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k91) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(l91.e, Boolean.FALSE);
        return Unit.a;
    }
}
