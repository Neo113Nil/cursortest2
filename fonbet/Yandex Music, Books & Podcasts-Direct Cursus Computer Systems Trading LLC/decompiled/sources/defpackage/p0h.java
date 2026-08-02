package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class p0h extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c1h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0h(c1h c1hVar, Continuation continuation) {
        super(2, continuation);
        this.k = c1hVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        p0h p0hVar = new p0h(this.k, continuation);
        p0hVar.j = obj;
        return p0hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0h) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        c1h c1hVar = this.k;
        ec7.d(lpiVar, "born", c1hVar.a);
        y0h y0hVar = c1hVar.b;
        if (y0hVar != null) {
            ec7.e(lpiVar, "light_uri", y0hVar.a);
            ec7.e(lpiVar, "dark_uri", y0hVar.b);
        } else {
            lpiVar.f(new hmm.a("light_uri"));
            lpiVar.f(new hmm.a("dark_uri"));
        }
        return Unit.a;
    }
}
