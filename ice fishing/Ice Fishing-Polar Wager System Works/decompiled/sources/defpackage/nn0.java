package defpackage;

/* loaded from: classes.dex */
public final class nn0 {
    public java.lang.String F7NU4MC0GW;
    public final defpackage.kn0 IHQe1A4L2xu;
    public java.lang.String adDC3e2L;
    public final defpackage.qb1 oh6vYeIP = new defpackage.qb1();
    public int r1MBDhnF;

    public nn0(defpackage.kn0 kn0Var) {
        this.IHQe1A4L2xu = kn0Var;
    }

    public final defpackage.fn0 F7NU4MC0GW(defpackage.fn0 fn0Var, defpackage.v5 v5Var, boolean z, defpackage.gn0 gn0Var) {
        defpackage.fn0 fn0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.kn0 kn0Var = this.IHQe1A4L2xu;
        java.util.Iterator it = kn0Var.iterator();
        while (true) {
            defpackage.mn0 mn0Var = (defpackage.mn0) it;
            if (!mn0Var.hasNext()) {
                break;
            }
            defpackage.gn0 gn0Var2 = (defpackage.gn0) mn0Var.next();
            fn0Var2 = defpackage.x70.QoRHpC4k(gn0Var2, gn0Var) ? null : gn0Var2.r1MBDhnF(v5Var);
            if (fn0Var2 != null) {
                arrayList.add(fn0Var2);
            }
        }
        defpackage.fn0 fn0Var3 = (defpackage.fn0) defpackage.td.dOmtpLcqqI1y(arrayList);
        defpackage.kn0 kn0Var2 = kn0Var.AARZUJiTa;
        if (kn0Var2 != null && z && !kn0Var2.equals(gn0Var)) {
            fn0Var2 = kn0Var2.adDC3e2L(v5Var, kn0Var);
        }
        return (defpackage.fn0) defpackage.td.dOmtpLcqqI1y(defpackage.t6.CGXpA9s3RjIa(new defpackage.fn0[]{fn0Var, fn0Var3, fn0Var2}));
    }

    public final defpackage.gn0 IHQe1A4L2xu(int i) {
        return r1MBDhnF(i, this.IHQe1A4L2xu, null, false);
    }

    public final defpackage.gn0 oh6vYeIP(java.lang.String str, boolean z) {
        java.lang.Object obj;
        defpackage.kn0 kn0Var;
        str.getClass();
        defpackage.qb1 qb1Var = this.oh6vYeIP;
        qb1Var.getClass();
        java.util.Iterator it = defpackage.a81.p4kuH6PDtgom(new defpackage.kNAkVymC(2, qb1Var)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            defpackage.gn0 gn0Var = (defpackage.gn0) obj;
            java.lang.String str2 = (java.lang.String) gn0Var.xiZrDbcSW0.adDC3e2L;
            if ((str2 == null ? str == null : str2.equals(str)) || gn0Var.xiZrDbcSW0.IHQe1A4L2xu(str) != null) {
                break;
            }
        }
        defpackage.gn0 gn0Var2 = (defpackage.gn0) obj;
        if (gn0Var2 != null) {
            return gn0Var2;
        }
        if (!z || (kn0Var = this.IHQe1A4L2xu.AARZUJiTa) == null) {
            return null;
        }
        defpackage.nn0 nn0Var = kn0Var.SH1y5HwkJhh;
        nn0Var.getClass();
        if (defpackage.rc1.AQHddgaEX(str)) {
            return null;
        }
        return nn0Var.oh6vYeIP(str, true);
    }

    public final defpackage.gn0 r1MBDhnF(int i, defpackage.gn0 gn0Var, defpackage.gn0 gn0Var2, boolean z) {
        defpackage.qb1 qb1Var = this.oh6vYeIP;
        defpackage.gn0 gn0Var3 = (defpackage.gn0) qb1Var.oh6vYeIP(i);
        if (gn0Var2 != null) {
            if (defpackage.x70.QoRHpC4k(gn0Var3, gn0Var2) && defpackage.x70.QoRHpC4k(gn0Var3.AARZUJiTa, gn0Var2.AARZUJiTa)) {
                return gn0Var3;
            }
            gn0Var3 = null;
        } else if (gn0Var3 != null) {
            return gn0Var3;
        }
        defpackage.kn0 kn0Var = this.IHQe1A4L2xu;
        if (z) {
            java.util.Iterator it = defpackage.a81.p4kuH6PDtgom(new defpackage.kNAkVymC(2, qb1Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    gn0Var3 = null;
                    break;
                }
                defpackage.gn0 gn0Var4 = (defpackage.gn0) it.next();
                gn0Var3 = (!(gn0Var4 instanceof defpackage.kn0) || gn0Var4.equals(gn0Var)) ? null : ((defpackage.kn0) gn0Var4).SH1y5HwkJhh.r1MBDhnF(i, kn0Var, gn0Var2, true);
                if (gn0Var3 != null) {
                    break;
                }
            }
        }
        if (gn0Var3 != null) {
            return gn0Var3;
        }
        defpackage.kn0 kn0Var2 = kn0Var.AARZUJiTa;
        if (kn0Var2 == null || kn0Var2.equals(gn0Var)) {
            return null;
        }
        defpackage.kn0 kn0Var3 = kn0Var.AARZUJiTa;
        kn0Var3.getClass();
        return kn0Var3.SH1y5HwkJhh.r1MBDhnF(i, kn0Var, gn0Var2, z);
    }
}
