package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class y22 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k22 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y22(k22 k22Var, Continuation continuation) {
        super(2, continuation);
        this.k = k22Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        y22 y22Var = new y22(this.k, continuation);
        y22Var.j = obj;
        return y22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y22) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(z22.g, this.k.name());
        return Unit.a;
    }
}
