package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class t0l implements f4q {
    public final f7l a;
    public final uol b;
    public final t1f c;
    public final g4l d;
    public final tuk e;
    public final AtomicReference f;
    public final qvk g;

    public t0l(dn9 dn9Var, f7l f7lVar, uol uolVar, t1f t1fVar, g4l g4lVar, suk sukVar, tuk tukVar, List list) {
        this.a = f7lVar;
        this.b = uolVar;
        this.c = t1fVar;
        this.d = g4lVar;
        this.e = tukVar;
        o5g.a = uolVar;
        this.f = new AtomicReference(null);
        this.g = new qvk(sukVar, dn9Var, list, tukVar);
    }

    @Override // defpackage.f4q
    public final void a(mm6 mm6Var) {
        mm6Var.getClass();
        ox6.B(this.a.e, mm6Var, new s0l(this, 0));
        msa msaVar = nsa.b;
        long M = yd5.M(2, ssa.SECONDS);
        t1f t1fVar = this.c;
        ox6.B(zsd.b0(zsd.u0(new kvh(t1fVar.F(((f7l) t1fVar.b).c, M), 27), new kvh(this.b.i, 28))), mm6Var, new s0l(this, 1));
    }
}
