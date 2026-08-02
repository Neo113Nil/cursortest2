package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class i22 extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j22 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i22(j22 j22Var, Continuation continuation) {
        super(2, continuation);
        this.k = j22Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        i22 i22Var = new i22(this.k, continuation);
        i22Var.j = obj;
        return i22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i22) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = j22.d;
        Integer num = (Integer) lpiVar.a(aVar);
        lpiVar.h(aVar, new Integer((num != null ? num.intValue() : 0) + 1));
        lpiVar.g(j22.c, new Long(this.k.a.b()));
        return Unit.a;
    }
}
