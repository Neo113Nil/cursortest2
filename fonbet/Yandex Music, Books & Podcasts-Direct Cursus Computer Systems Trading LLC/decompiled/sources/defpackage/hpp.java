package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class hpp extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ hmm.a l;
    public final /* synthetic */ ipp m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpp(Object obj, hmm.a aVar, ipp ippVar, Continuation continuation) {
        super(2, continuation);
        this.k = obj;
        this.l = aVar;
        this.m = ippVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        hpp hppVar = new hpp(this.k, this.l, this.m, continuation);
        hppVar.j = obj;
        return hppVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hpp) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpi lpiVar = (lpi) this.j;
        Object obj2 = this.k;
        hmm.a aVar = this.l;
        if (obj2 != null) {
            lpiVar.g(aVar, obj2);
        } else {
            lpiVar.f(aVar);
        }
        ipp.a(this.m, lpiVar);
        return Unit.a;
    }
}
