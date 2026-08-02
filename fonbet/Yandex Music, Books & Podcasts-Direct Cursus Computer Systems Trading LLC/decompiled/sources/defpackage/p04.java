package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p04 implements rnq, wmm {
    public final hz3 a;
    public final rmb b;
    public final c04 c;
    public final jp1 d;
    public ArrayList e;
    public boolean f;
    public rar g;
    public kzp h;
    public final xdr i;
    public final fkn j;
    public final by7 k;
    public final x6k l;

    public p04(hz3 hz3Var, rmb rmbVar, c04 c04Var, jp1 jp1Var) {
        hz3Var.getClass();
        jp1Var.getClass();
        this.a = hz3Var;
        this.b = rmbVar;
        this.c = c04Var;
        this.d = jp1Var;
        int i = hz3Var.c;
        xdr a = ydr.a(i == 0 ? k04.a : new l04(i));
        this.i = a;
        this.j = new fkn(a);
        this.k = asq.K(a, new zj3(28));
        this.l = szf.g0(Boolean.valueOf(hz3Var.d));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Collection:Skeleton:FavoriteArtistsBlock", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        rar rarVar = this.g;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.g = null;
        this.f = false;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Collection:Skeleton:FavoriteArtistsBlock", vz1.p("Block reload[", this.a.a.a, "]: ready=", this.i.getValue() instanceof m04), null);
        cancel();
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.h = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        if (this.f) {
            return;
        }
        ssg.a(3, "Collection:Skeleton:FavoriteArtistsBlock", vz1.p("Block load[", this.a.a.a, "]: ready=", this.i.getValue() instanceof m04), null);
        rar rarVar = this.g;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.g = ox6.B(zsd.b0(this.c.c()), mm6Var, new ri(28, this));
    }
}
