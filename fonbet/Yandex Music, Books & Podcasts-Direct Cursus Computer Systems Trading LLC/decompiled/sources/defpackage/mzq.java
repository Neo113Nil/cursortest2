package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class mzq extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gzq k;
    public final /* synthetic */ nzq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzq(gzq gzqVar, nzq nzqVar, Continuation continuation) {
        super(2, continuation);
        this.k = gzqVar;
        this.l = nzqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        mzq mzqVar = new mzq(this.k, this.l, continuation);
        mzqVar.j = obj;
        return mzqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mzq) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm.a aVar = nzq.c;
        gzq gzqVar = this.k;
        lpiVar.g(aVar, gzqVar.a);
        lpiVar.g(nzq.d, this.l.a.j(gzqVar.b));
        lpiVar.g(nzq.h, gzqVar.c);
        lpiVar.g(nzq.i, gzqVar.d);
        lpiVar.g(nzq.g, new Long(gzqVar.e));
        lpiVar.g(nzq.f, new Long(gzqVar.f));
        return Unit.a;
    }
}
