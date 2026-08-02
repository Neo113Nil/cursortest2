package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ lha k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m55(lha lhaVar, Continuation continuation) {
        super(2, continuation);
        this.k = lhaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        m55 m55Var = new m55(this.k, continuation);
        m55Var.j = obj;
        return m55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.t, this.k.name());
        return Unit.a;
    }
}
