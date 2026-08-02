package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class wx5 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ox5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx5(ox5 ox5Var, Continuation continuation) {
        super(2, continuation);
        this.k = ox5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        wx5 wx5Var = new wx5(this.k, continuation);
        wx5Var.j = obj;
        return wx5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wx5) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = xx5.c;
        ox5 ox5Var = this.k;
        lpiVar.g(aVar, String.valueOf(ox5Var.a.a));
        lpiVar.g(xx5.d, ox5Var.a.b);
        return Unit.a;
    }
}
