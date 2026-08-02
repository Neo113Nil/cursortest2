package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class jx2 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ lx2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx2(lx2 lx2Var, Continuation continuation) {
        super(2, continuation);
        this.k = lx2Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        jx2 jx2Var = new jx2(this.k, continuation);
        jx2Var.j = obj;
        return jx2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jx2) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(this.k.b, new Long(System.currentTimeMillis()));
        return Unit.a;
    }
}
