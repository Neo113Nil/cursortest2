package defpackage;

import android.app.Activity;
import androidx.fragment.app.t;

/* loaded from: classes3.dex */
public final class g41 implements d41 {
    public final Activity a;
    public final i41 b;
    public final tmb c;
    public final rmb d;
    public final jyr e;
    public final jyr f;
    public boolean g;
    public final fkn h;

    public g41(t tVar, u41 u41Var, i41 i41Var, tmb tmbVar, rmb rmbVar) {
        tVar.getClass();
        i41Var.getClass();
        this.a = tVar;
        this.b = i41Var;
        this.c = tmbVar;
        this.d = rmbVar;
        bdt I = hag.I(fw5.class);
        l18 l18Var = l18.b;
        this.e = l18Var.b(I, true);
        this.f = l18Var.b(hag.I(nmj.class), true);
        fkn fknVar = u41Var.o;
        this.h = lg3.u0(new ub7(12, fknVar, new qi(null, this)), ot0.F(u41Var), fknVar.a.getValue());
    }

    @Override // defpackage.d41
    public final boolean b() {
        gs4 gs4Var = ((fw5) this.e.getValue()).a;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((q36) ((byb) qdcVar.C(I)).b(q36.class)).h();
    }

    @Override // defpackage.d41
    public final void c() {
        this.b.a.finish();
    }

    @Override // defpackage.d41
    public final void d(us5 us5Var, int i, boolean z, String str) {
        str.getClass();
        String str2 = us5Var.a;
        str2.getClass();
        thj thjVar = new thj(pkb.Concert, str2, 1, i + 1, "");
        rmb rmbVar = this.d;
        if (z) {
            rmbVar.l(null, thjVar, str);
        } else {
            rmbVar.f(thjVar, null);
        }
    }

    @Override // defpackage.d41
    public final jmj e(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(707573832);
        nmj nmjVar = (nmj) this.f.getValue();
        boolean h = oq5Var.h(this);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new e41(this);
            oq5Var.k0(K);
        }
        jmj b = nmjVar.b((dmj) K, this.a, this.c, 1, oq5Var, 36352);
        oq5Var.p(false);
        return b;
    }

    @Override // defpackage.d41
    public final nw5 f(r21 r21Var, int i) {
        r21Var.getClass();
        String str = r21Var.a.a;
        str.getClass();
        thj thjVar = new thj(pkb.Concert, str, 1, i + 1, "");
        fw5 fw5Var = (fw5) this.e.getValue();
        us5 us5Var = r21Var.a;
        f41 f41Var = new f41(this, thjVar, r21Var, 0);
        f41 f41Var2 = new f41(this, thjVar, r21Var, 1);
        fw5Var.getClass();
        gs4 gs4Var = fw5Var.a;
        s26 s26Var = new s26(ocg.E(us5Var, ((gw5) gs4Var.a).a), us5Var.e);
        wy5 wy5Var = (wy5) gs4Var.b;
        uu5 a = fw5Var.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return new ow5(s26Var, wy5Var, a, f41Var, f41Var2, ((q36) ((byb) qdcVar.C(I)).b(q36.class)).h());
    }

    @Override // defpackage.d41
    public final vdr getState() {
        return this.h;
    }
}
