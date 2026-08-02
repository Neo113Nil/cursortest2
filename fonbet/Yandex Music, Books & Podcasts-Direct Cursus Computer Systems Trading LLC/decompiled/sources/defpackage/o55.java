package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ aeb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o55(aeb aebVar, Continuation continuation) {
        super(2, continuation);
        this.k = aebVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        o55 o55Var = new o55(this.k, continuation);
        o55Var.j = obj;
        return o55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.f, this.k.name());
        return Unit.a;
    }
}
