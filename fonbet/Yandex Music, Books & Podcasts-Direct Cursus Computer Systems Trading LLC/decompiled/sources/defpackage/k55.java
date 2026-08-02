package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k55 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ tga k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k55(tga tgaVar, Continuation continuation) {
        super(2, continuation);
        this.k = tgaVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        k55 k55Var = new k55(this.k, continuation);
        k55Var.j = obj;
        return k55Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k55) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(v55.o, this.k.name());
        return Unit.a;
    }
}
