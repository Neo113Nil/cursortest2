package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class j2e {
    public final xqq a;
    public final e2e b;
    public final nha c;
    public final qec d;
    public final vdr e;
    public final vdr f;
    public final fkn g;
    public final fkn h;
    public final vdr i;
    public final ail j;

    public j2e(qyf qyfVar, xqq xqqVar, e2e e2eVar, nha nhaVar, qec qecVar) {
        xqqVar.getClass();
        this.a = xqqVar;
        this.b = e2eVar;
        this.c = nhaVar;
        this.d = qecVar;
        this.e = xqqVar.M();
        this.f = xqqVar.O();
        int i = 3;
        Continuation continuation = null;
        u21 u21Var = new u21(10, xqqVar.N(), xqqVar.G(), new o1e(i, 2, continuation));
        k2s a = l2s.a(null);
        t7l t7lVar = lbq.a;
        this.g = zsd.F0(u21Var, qyfVar, t7lVar, a);
        this.h = zsd.F0(new u21(10, xqqVar.N(), xqqVar.G(), new o1e(i, 1, continuation)), qyfVar, t7lVar, null);
        this.i = xqqVar.P();
        this.j = s7g.A(xqqVar);
        x97.y(qyfVar, null, null, new jmd(this, continuation, 2), 3);
    }

    public final void a(int i) {
        xqq xqqVar = this.a;
        v2s v2sVar = (v2s) xqqVar.N().getValue();
        if (v2sVar == null) {
            return;
        }
        v2sVar.g(i);
        xqqVar.U(0);
    }
}
