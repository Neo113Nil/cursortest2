package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wv1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a55(wv1 wv1Var, Continuation continuation) {
        super(2, continuation);
        this.k = wv1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        a55 a55Var = new a55(this.k, continuation);
        a55Var.j = obj;
        return a55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.d, this.k.name());
        return Unit.a;
    }
}
