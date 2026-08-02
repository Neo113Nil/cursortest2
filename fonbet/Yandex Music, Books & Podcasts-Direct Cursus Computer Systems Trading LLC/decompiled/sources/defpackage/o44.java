package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o44 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p44 k;
    public final /* synthetic */ f24 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o44(p44 p44Var, f24 f24Var, Continuation continuation) {
        super(2, continuation);
        this.k = p44Var;
        this.l = f24Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        o44 o44Var = new o44(this.k, this.l, continuation);
        o44Var.j = obj;
        return o44Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o44) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.f(p44.c(this.l));
        return Unit.a;
    }
}
