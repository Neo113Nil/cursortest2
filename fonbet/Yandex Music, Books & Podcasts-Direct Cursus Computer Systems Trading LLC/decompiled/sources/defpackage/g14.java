package defpackage;

/* loaded from: classes4.dex */
public final class g14 implements f14 {
    public final l14 a;
    public final kxi b;
    public final e14 c;
    public final xdr d;

    public g14(l14 l14Var, kxi kxiVar, e14 e14Var) {
        kxiVar.getClass();
        e14Var.getClass();
        this.a = l14Var;
        this.b = kxiVar;
        this.c = e14Var;
        this.d = l14Var.j;
    }

    @Override // defpackage.f14
    public final xdr a() {
        return this.a.d.c;
    }

    @Override // defpackage.f14
    public final void c() {
        String a;
        l14 l14Var = this.a;
        r04 r04Var = l14Var.i;
        o43 b = r04Var.b();
        if (b == null || (a = b.a()) == null) {
            return;
        }
        r04Var.getClass();
        this.c.a(a);
        l14Var.f.d(-1, -1, a);
    }

    @Override // defpackage.f14
    public final void d(c24 c24Var, int i) {
        c24Var.getClass();
        aab a = c24Var.a();
        if (a == null) {
            return;
        }
        this.c.j(a);
        this.a.f.e(ox6.M(a, i, ""), null);
    }

    @Override // defpackage.f14
    public final owu e(dou douVar, mm6 mm6Var, k6l k6lVar, uwu uwuVar, qwu qwuVar, int i, zy7 zy7Var) {
        mm6Var.getClass();
        return wyf.S(mm6Var, this.b, k6lVar, null, null, qwuVar, uwuVar, o8g.R(douVar.b), new de(this, douVar, i, 5), null);
    }

    @Override // defpackage.f14
    public final void f(boolean z, aab aabVar, int i, String str) {
        str.getClass();
        this.a.f.h(ox6.M(aabVar, i, str), z);
    }

    @Override // defpackage.f14
    public final void g(c24 c24Var, int i) {
        c24Var.getClass();
        this.c.p(c24Var);
    }

    @Override // defpackage.f14
    public final vdr getState() {
        return this.d;
    }
}
