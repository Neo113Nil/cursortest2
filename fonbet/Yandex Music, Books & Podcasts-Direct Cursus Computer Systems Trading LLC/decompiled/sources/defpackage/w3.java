package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class w3 extends bnc {
    public final vjg d;
    public final y2 e;
    public final pyc f;
    public final d3 g;
    public final oq7 h;
    public final xdr i;
    public final fkn j;

    public w3(vjg vjgVar, y2 y2Var, pyc pycVar, d3 d3Var, oq7 oq7Var) {
        vjgVar.getClass();
        y2Var.getClass();
        d3Var.getClass();
        oq7Var.getClass();
        this.d = vjgVar;
        this.e = y2Var;
        this.f = pycVar;
        this.g = d3Var;
        this.h = oq7Var;
        xdr a = ydr.a(m3.a);
        this.i = a;
        this.j = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        k10 k10Var;
        String str;
        n7q n7qVar;
        mm6Var.getClass();
        d6l x = p6g.x((e6l) this.h.a.c.getValue());
        Continuation continuation = null;
        mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
        if (b == null) {
            return new fs(15, new c73(a()));
        }
        mqs a = b.a();
        return (a == null || (k10Var = a.d) == null || (str = k10Var.a) == null) ? new fs(15, new c73(a())) : new eno(new v3(this, str, b, continuation, 0));
    }
}
