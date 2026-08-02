package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class xl6 extends cw7 implements ofp {
    public l7t q;
    public ybs r;
    public axf s;
    public boolean t;
    public mnj u;
    public qbs v;
    public ide w;
    public yoc x;

    public static final void V0(xl6 xl6Var, axf axfVar, String str, boolean z) {
        if (z) {
            pcs pcsVar = axfVar.e;
            nl6 nl6Var = axfVar.v;
            Unit unit = null;
            if (pcsVar != null) {
                ybs l = axfVar.d.l(u75.h(new xw7(), new vb5(str, 1)));
                pcsVar.a(null, l);
                nl6Var.invoke(l);
                unit = Unit.a;
            }
            if (unit == null) {
                int length = str.length();
                nl6Var.invoke(new ybs(str, y5g.P(length, length), 4));
            }
        }
    }

    @Override // defpackage.ofp
    public final boolean E0() {
        return true;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        mn0 mn0Var = this.r.a;
        s9f[] s9fVarArr = wfp.a;
        xfp xfpVar = ufp.C;
        s9f[] s9fVarArr2 = wfp.a;
        s9f s9fVar = s9fVarArr2[16];
        xfpVar.getClass();
        jfpVar.o(xfpVar, mn0Var);
        mn0 mn0Var2 = this.q.a;
        xfp xfpVar2 = ufp.D;
        s9f s9fVar2 = s9fVarArr2[17];
        xfpVar2.getClass();
        jfpVar.o(xfpVar2, mn0Var2);
        long j = this.r.b;
        xfp xfpVar3 = ufp.E;
        s9f s9fVar3 = s9fVarArr2[18];
        rds rdsVar = new rds(j);
        xfpVar3.getClass();
        jfpVar.o(xfpVar3, rdsVar);
        uf0 uf0Var = hs4.f;
        xfp xfpVar4 = ufp.q;
        s9f s9fVar4 = s9fVarArr2[8];
        xfpVar4.getClass();
        jfpVar.o(xfpVar4, uf0Var);
        jfpVar.o(hfp.g, new sa(null, new wl6(this, 0)));
        if (!this.t) {
            wfp.c(jfpVar);
        }
        boolean z = this.t;
        xfp xfpVar5 = ufp.L;
        s9f s9fVar5 = s9fVarArr2[24];
        Boolean valueOf = Boolean.valueOf(z);
        xfpVar5.getClass();
        jfpVar.o(xfpVar5, valueOf);
        wfp.d(jfpVar, new wl6(this, 1));
        int i = 2;
        if (z) {
            jfpVar.o(hfp.j, new sa(null, new wl6(this, i)));
            jfpVar.o(hfp.n, new sa(null, new wl6(this, jfpVar)));
        }
        jfpVar.o(hfp.i, new sa(null, new wk0(1, this)));
        int i2 = this.w.e;
        vl6 vl6Var = new vl6(this, 3);
        jfpVar.o(ufp.F, new hde(i2));
        jfpVar.o(hfp.o, new sa(null, vl6Var));
        wfp.h(jfpVar, new vl6(this, 4));
        jfpVar.o(hfp.c, new sa(null, new vl6(this, 5)));
        if (!rds.b(this.r.b)) {
            jfpVar.o(hfp.p, new sa(null, new vl6(this, 6)));
            if (this.t) {
                jfpVar.o(hfp.q, new sa(null, new vl6(this, 1)));
            }
        }
        if (this.t) {
            jfpVar.o(hfp.r, new sa(null, new vl6(this, 2)));
        }
    }
}
