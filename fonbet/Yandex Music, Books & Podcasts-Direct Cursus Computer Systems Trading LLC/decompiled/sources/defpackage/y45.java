package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class y45 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y45(i10 i10Var, Continuation continuation) {
        super(2, continuation);
        this.k = i10Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        y45 y45Var = new y45(this.k, continuation);
        y45Var.j = obj;
        return y45Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y45) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.c, this.k.name());
        return Unit.a;
    }
}
