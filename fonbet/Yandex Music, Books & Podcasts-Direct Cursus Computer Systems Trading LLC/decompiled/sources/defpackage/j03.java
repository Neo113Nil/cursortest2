package defpackage;

/* loaded from: classes5.dex */
public final class j03 {
    public final op a;
    public final jeq b;
    public final jtp c;
    public final t28 d;
    public final l9i e;
    public final tbk f;
    public final g0c g;
    public final x60 h;
    public final hos i;
    public final ti4 j;
    public final c13 k;
    public wle l;
    public String m;
    public n20 n;
    public boolean o;
    public boolean p;
    public z9h q;

    public j03(op opVar, jeq jeqVar, jtp jtpVar, t28 t28Var, l9i l9iVar, tbk tbkVar, g0c g0cVar, x60 x60Var, hos hosVar, ti4 ti4Var, c13 c13Var) {
        this.a = opVar;
        this.b = jeqVar;
        this.c = jtpVar;
        this.d = t28Var;
        this.e = l9iVar;
        this.f = tbkVar;
        this.g = g0cVar;
        this.h = x60Var;
        this.i = hosVar;
        this.j = ti4Var;
        this.k = c13Var;
    }

    public static final yop a(j03 j03Var, ihk ihkVar, String str, String str2, oxa oxaVar, jtc jtcVar) {
        if (j03Var.p) {
            return mif.a(j03Var.e.a.C(new x9i(ihkVar.a, str), vsf.A0, p1j.b), new wz2(j03Var, ihkVar, oxaVar, jtcVar, 1), null, 5);
        }
        frr frrVar = new frr(0, j03Var.a.a, ihkVar.a, ihkVar.b, str, str2);
        t28 t28Var = j03Var.d;
        return mif.a(yd5.I("supply_google_pay", t28Var.b, new qs6(14, t28Var, frrVar)), new wz2(j03Var, ihkVar, oxaVar, jtcVar, 2), null, 5);
    }

    public static final yop b(j03 j03Var, String str, wa4 wa4Var, r9i r9iVar) {
        j03Var.getClass();
        h03 h03Var = new h03(j03Var, wa4Var, 0);
        h03 h03Var2 = new h03(j03Var, wa4Var, 1);
        m40 m40Var = new m40(9, wa4Var);
        g0c g0cVar = j03Var.g;
        return j03Var.e(str, new zsn(h03Var, h03Var2, m40Var, g0cVar), new xdh(new g03(r9iVar, 0), new g03(r9iVar, 1), g0cVar));
    }

    public static final yop c(j03 j03Var, String str, ipo ipoVar, jtc jtcVar) {
        bro[] broVarArr = bro.a;
        return j03Var.e(str, new bz2(new s30(8, ipoVar, j03Var)), new xdh(new i03(jtcVar, 0), new i03(jtcVar, 1), j03Var.g));
    }

    public final yop d(String str) {
        jtp d;
        wle wleVar = this.l;
        yop b = mif.b(wleVar == null ? nif.c(new k03(q1c.b, r1c.a, null, null, "Unable to perform payment: payment is not initialized.")) : nif.d(wleVar), rq1.D, null, 5);
        op opVar = this.a;
        if (str == null) {
            str = opVar.b;
        }
        if (ixf.A(str)) {
            d = (this.o || ixf.A(opVar.a)) ? nif.c(new k03(q1c.v, r1c.a, null, null, "Unable to perform payment: email was not provided.")) : nif.d("");
        } else {
            str.getClass();
            d = nif.d(str);
        }
        return mif.b(nif.a(u75.j(b, d)), new vz2(this, 0), null, 5);
    }

    public final yop e(String str, ui4 ui4Var, xdh xdhVar) {
        lhb lhbVar = lhb.z0;
        Long l = this.j.a;
        n20 n20Var = new n20();
        this.n = n20Var;
        Object obj = null;
        if (!this.p) {
            return mif.a(mif.b(mif.a(fxf.V(new c03(this, str, 1), new e03(ui4Var, 0), new xdh(obj, new zfm(), l, n20Var)), new e03(ui4Var, 1), null, 5), new vz2(this, 1), null, 5), lhbVar, new vz2(this, 2), 1).c(new b03(this, 0));
        }
        int i = 0;
        return mif.a(mif.b(mif.a(fxf.V(new c03(this, str, i), new d03(xdhVar, i), new xdh(obj, new zfm(), l, n20Var)), new zyt(xdhVar), null, 5), new vz2(this, 3), null, 5), lhbVar, new vz2(this, 4), 1).c(new b03(this, 1));
    }
}
