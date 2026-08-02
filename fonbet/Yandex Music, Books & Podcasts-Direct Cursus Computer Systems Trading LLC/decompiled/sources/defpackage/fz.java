package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fz {
    public final cvo a;
    public final e10 b;
    public final dy c;
    public final kxi d;
    public final hy e;
    public final f00 f;
    public final tmb g;
    public final g0l h;
    public final pt0 i;
    public final boolean j;
    public final fkn k;
    public final vdr l;
    public final xdr m;
    public final xdr n;
    public final xdr o;
    public final xdr p;
    public final xdr q;

    public fz(cvo cvoVar, e10 e10Var, dy dyVar, kxi kxiVar, hy hyVar, mm6 mm6Var, f00 f00Var, tmb tmbVar, g0l g0lVar, pt0 pt0Var, boolean z) {
        cvoVar.getClass();
        e10Var.getClass();
        dyVar.getClass();
        mm6Var.getClass();
        f00Var.getClass();
        tmbVar.getClass();
        this.a = cvoVar;
        this.b = e10Var;
        this.c = dyVar;
        this.d = kxiVar;
        this.e = hyVar;
        this.f = f00Var;
        this.g = tmbVar;
        this.h = g0lVar;
        this.i = pt0Var;
        this.j = z;
        vdr vdrVar = e10Var.y;
        ox6.B(zsd.b0(new cz(vdrVar, this, 0)), mm6Var, new az(this, 0));
        ox6.B(zsd.b0(new ez(vdrVar, 0)), mm6Var, new az(this, 1));
        ox6.B(e10Var.Y, mm6Var, new az(this, 2));
        this.k = e10Var.A;
        this.l = vdrVar;
        this.m = e10Var.L;
        this.n = e10Var.C;
        this.o = e10Var.E;
        this.p = e10Var.G;
        this.q = e10Var.I;
    }

    public static oq a(r00 r00Var) {
        if (r00Var instanceof o00) {
            return ((o00) r00Var).b.a;
        }
        if (r00Var instanceof p00) {
            return ((p00) r00Var).b.a;
        }
        if (Intrinsics.d(r00Var, k00.a) || Intrinsics.d(r00Var, l00.a) || (r00Var instanceof n00) || (r00Var instanceof q00)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public final void b() {
        r00 r00Var = (r00) this.b.x.getValue();
        oq oqVar = r00Var instanceof o00 ? ((o00) r00Var).b.a : null;
        if (oqVar != null) {
            this.f.a(new hz(oqVar));
        }
    }

    public final void c() {
        r00 r00Var = (r00) this.b.x.getValue();
        oq oqVar = r00Var instanceof o00 ? ((o00) r00Var).b.a : null;
        if (oqVar != null) {
            this.f.a(new lz(oqVar, oqVar.F));
        }
    }
}
