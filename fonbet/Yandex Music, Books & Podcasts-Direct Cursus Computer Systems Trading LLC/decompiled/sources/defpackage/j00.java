package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class j00 {
    public final cvo a;
    public final kxi b;
    public final e10 c;
    public final dy d;
    public final hy e;
    public final mt f;
    public final f00 g;
    public final tmb h;
    public final g0l i;
    public final pt0 j;
    public final fkn k;
    public final xdr l;
    public final xdr m;
    public final vdr n;
    public final by7 o;
    public final j0q p;
    public final j0q q;
    public final j0q r;

    public j00(cvo cvoVar, kxi kxiVar, e10 e10Var, dy dyVar, hy hyVar, mt mtVar, f00 f00Var, tmb tmbVar, g0l g0lVar, pt0 pt0Var) {
        cvoVar.getClass();
        e10Var.getClass();
        dyVar.getClass();
        f00Var.getClass();
        tmbVar.getClass();
        this.a = cvoVar;
        this.b = kxiVar;
        this.c = e10Var;
        this.d = dyVar;
        this.e = hyVar;
        this.f = mtVar;
        this.g = f00Var;
        this.h = tmbVar;
        this.i = g0lVar;
        this.j = pt0Var;
        this.k = e10Var.Z;
        this.l = e10Var.z0;
        this.m = e10Var.A0;
        this.n = e10Var.w0;
        this.o = e10Var.x0;
        this.p = e10Var.C0;
        this.q = e10Var.X;
        this.r = e10Var.y0;
    }

    public final void a(jab jabVar) {
        e10 e10Var = this.c;
        e10Var.getClass();
        LinkedHashMap linkedHashMap = e10Var.B0;
        Boolean bool = (Boolean) linkedHashMap.get(jabVar);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        linkedHashMap.put(jabVar, Boolean.TRUE);
        rmb.h(e10Var.l.a(jabVar, null), 0, 3);
    }

    public final void b(nab nabVar, thj thjVar, String str, boolean z) {
        nabVar.getClass();
        thjVar.getClass();
        str.getClass();
        rmb a = this.h.a(nabVar, null);
        if (z) {
            a.l(null, thjVar, str);
        } else {
            a.f(thjVar, null);
        }
    }

    public final void c(jab jabVar, thj thjVar) {
        rmb.j(this.h.a(jabVar, null), wjb.BottomsheetScreen, thjVar, null, 12);
        this.g.a(new hz(this.f.a));
    }
}
