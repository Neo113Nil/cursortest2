package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class r77 {
    public final p77 a;
    public final rzm b;
    public final rzm c;
    public final ps2 d;
    public final e13 e;
    public final r79 f;
    public final qp2 g;
    public final o9h h;
    public final rzm i;
    public final rzm j;
    public final sl2 k;

    public r77(p77 p77Var, ybl yblVar, cic cicVar) {
        this.a = p77Var;
        this.b = t8a.b(new os2(15, cicVar));
        rzm b = t8a.b(new os2(23, yblVar));
        this.c = b;
        this.d = new ps2(b);
        rzm rzmVar = p77Var.k;
        this.e = new e13(b, rzmVar);
        this.f = new r79(p77Var.C, p77Var.D, p77Var.h);
        this.g = new qp2(rzmVar, 13);
        int i = o9h.b;
        awc awcVar = new awc(12);
        awcVar.w(mhc.a, this.d);
        awcVar.w(mhc.b, this.e);
        awcVar.w(mhc.c, this.f);
        awcVar.w(mhc.d, this.g);
        awcVar.z(mhc.e, hyf.u(kg5.h));
        this.h = new o9h((LinkedHashMap) awcVar.a);
        this.i = t8a.b(new dic(cicVar, p77Var.b, p77Var.k, p77Var.f, p77Var.p, p77Var.o, 0));
        rzm b2 = t8a.b(ot0.j);
        this.j = b2;
        this.k = new sl2(this.b, this.h, p77Var.k, t8a.b(new eic(cicVar, p77Var.p, p77Var.u, p77Var.f, p77Var.k, p77Var.d, this.i, p77Var.b, b2)), new qp2(cicVar, p77Var.b, 10));
    }
}
