package defpackage;

/* loaded from: classes.dex */
public class kn0 extends defpackage.gn0 implements java.lang.Iterable, defpackage.g90 {
    public static final /* synthetic */ int ez2rX8ReCYw = 0;
    public final defpackage.nn0 SH1y5HwkJhh;

    public kn0(defpackage.pn0 pn0Var) {
        super(pn0Var);
        this.SH1y5HwkJhh = new defpackage.nn0(this);
    }

    public final defpackage.fn0 adDC3e2L(defpackage.v5 v5Var, defpackage.gn0 gn0Var) {
        return this.SH1y5HwkJhh.F7NU4MC0GW(super.r1MBDhnF(v5Var), v5Var, true, gn0Var);
    }

    @Override // defpackage.gn0
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.kn0) || !super.equals(obj)) {
            return false;
        }
        defpackage.nn0 nn0Var = this.SH1y5HwkJhh;
        int adDC3e2L = nn0Var.oh6vYeIP.adDC3e2L();
        defpackage.nn0 nn0Var2 = ((defpackage.kn0) obj).SH1y5HwkJhh;
        if (adDC3e2L != nn0Var2.oh6vYeIP.adDC3e2L() || nn0Var.r1MBDhnF != nn0Var2.r1MBDhnF) {
            return false;
        }
        defpackage.qb1 qb1Var = nn0Var.oh6vYeIP;
        qb1Var.getClass();
        for (defpackage.gn0 gn0Var : defpackage.a81.p4kuH6PDtgom(new defpackage.kNAkVymC(2, qb1Var))) {
            if (!gn0Var.equals(nn0Var2.oh6vYeIP.oh6vYeIP(gn0Var.xiZrDbcSW0.IHQe1A4L2xu))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.gn0
    public final int hashCode() {
        defpackage.nn0 nn0Var = this.SH1y5HwkJhh;
        int i = nn0Var.r1MBDhnF;
        defpackage.qb1 qb1Var = nn0Var.oh6vYeIP;
        int adDC3e2L = qb1Var.adDC3e2L();
        for (int i2 = 0; i2 < adDC3e2L; i2++) {
            i = (((i * 31) + qb1Var.r1MBDhnF(i2)) * 31) + ((defpackage.gn0) qb1Var.xiZrDbcSW0(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.nn0 nn0Var = this.SH1y5HwkJhh;
        nn0Var.getClass();
        return new defpackage.mn0(nn0Var);
    }

    @Override // defpackage.gn0
    public final defpackage.fn0 r1MBDhnF(defpackage.v5 v5Var) {
        defpackage.fn0 r1MBDhnF = super.r1MBDhnF(v5Var);
        defpackage.nn0 nn0Var = this.SH1y5HwkJhh;
        nn0Var.getClass();
        return nn0Var.F7NU4MC0GW(r1MBDhnF, v5Var, false, nn0Var.IHQe1A4L2xu);
    }

    @Override // defpackage.gn0
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        defpackage.nn0 nn0Var = this.SH1y5HwkJhh;
        java.lang.String str = nn0Var.adDC3e2L;
        nn0Var.getClass();
        defpackage.gn0 oh6vYeIP = (str == null || defpackage.rc1.AQHddgaEX(str)) ? null : nn0Var.oh6vYeIP(str, true);
        if (oh6vYeIP == null) {
            oh6vYeIP = nn0Var.IHQe1A4L2xu(nn0Var.r1MBDhnF);
        }
        sb.append(" startDestination=");
        if (oh6vYeIP == null) {
            java.lang.String str2 = nn0Var.adDC3e2L;
            if (str2 != null) {
                sb.append(str2);
            } else {
                java.lang.String str3 = nn0Var.F7NU4MC0GW;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + java.lang.Integer.toHexString(nn0Var.r1MBDhnF));
                }
            }
        } else {
            sb.append("{");
            sb.append(oh6vYeIP.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    public final defpackage.fn0 xiZrDbcSW0(java.lang.String str, boolean z, defpackage.gn0 gn0Var) {
        defpackage.fn0 fn0Var;
        defpackage.nn0 nn0Var = this.SH1y5HwkJhh;
        nn0Var.getClass();
        defpackage.kn0 kn0Var = nn0Var.IHQe1A4L2xu;
        defpackage.fn0 IHQe1A4L2xu = kn0Var.xiZrDbcSW0.IHQe1A4L2xu(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = kn0Var.iterator();
        while (true) {
            defpackage.mn0 mn0Var = (defpackage.mn0) it;
            fn0Var = null;
            if (!mn0Var.hasNext()) {
                break;
            }
            defpackage.gn0 gn0Var2 = (defpackage.gn0) mn0Var.next();
            if (!defpackage.x70.QoRHpC4k(gn0Var2, gn0Var)) {
                if (gn0Var2 instanceof defpackage.kn0) {
                    fn0Var = ((defpackage.kn0) gn0Var2).xiZrDbcSW0(str, false, kn0Var);
                } else {
                    gn0Var2.getClass();
                    fn0Var = gn0Var2.xiZrDbcSW0.IHQe1A4L2xu(str);
                }
            }
            if (fn0Var != null) {
                arrayList.add(fn0Var);
            }
        }
        defpackage.fn0 fn0Var2 = (defpackage.fn0) defpackage.td.dOmtpLcqqI1y(arrayList);
        defpackage.kn0 kn0Var2 = kn0Var.AARZUJiTa;
        if (kn0Var2 != null && z && !kn0Var2.equals(gn0Var)) {
            fn0Var = kn0Var2.xiZrDbcSW0(str, true, kn0Var);
        }
        return (defpackage.fn0) defpackage.td.dOmtpLcqqI1y(defpackage.t6.CGXpA9s3RjIa(new defpackage.fn0[]{IHQe1A4L2xu, fn0Var2, fn0Var}));
    }
}
