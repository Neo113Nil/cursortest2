package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class bgf implements lke {
    public final yff a;
    public final String b;
    public final lm4 c;
    public final xdr d;
    public final List e;

    public bgf(yff yffVar) {
        this.a = yffVar;
        jyr b = btf.b(new v1e(19, this));
        this.b = "kids_tab_visibility_informer";
        this.c = ern.a(bgf.class);
        this.d = ((ggf) b.getValue()).e;
        this.e = t75.c(vke.a);
    }

    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-266200689);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yff yffVar = this.a;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                e00 e00Var = yffVar.a;
                Object obj = e00Var.b;
                fq1 fq1Var = new fq1();
                bdt I = hag.I(ggf.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                K = new dgf(fq1Var, (ggf) qdcVar.C(I));
                oq5Var.k0(K);
            }
            sk3.k((dgf) K, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 12);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        float f = 9 + 11 + 4;
        cma cmaVar = new cma(jx7Var.p(v7g.z(20)) + jx7Var.p(v7g.z(16)));
        cma cmaVar2 = new cma(40);
        if (cmaVar.compareTo(cmaVar2) < 0) {
            cmaVar = cmaVar2;
        }
        return f + cmaVar.a;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.e;
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.c;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return this.b;
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return this.d;
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
    }
}
