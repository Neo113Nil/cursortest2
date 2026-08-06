package defpackage;

/* loaded from: classes.dex */
public final class pe1 {
    public final int AARZUJiTa;
    public final int F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.lang.String adDC3e2L;
    public final java.lang.String oh6vYeIP;
    public final boolean r1MBDhnF;
    public final int xiZrDbcSW0;

    public pe1(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = z;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = str3;
        this.xiZrDbcSW0 = i2;
        java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        this.AARZUJiTa = defpackage.rc1.AsxAYCCkb3Hi(upperCase, "INT", false) ? 3 : (defpackage.rc1.AsxAYCCkb3Hi(upperCase, "CHAR", false) || defpackage.rc1.AsxAYCCkb3Hi(upperCase, "CLOB", false) || defpackage.rc1.AsxAYCCkb3Hi(upperCase, "TEXT", false)) ? 2 : defpackage.rc1.AsxAYCCkb3Hi(upperCase, "BLOB", false) ? 5 : (defpackage.rc1.AsxAYCCkb3Hi(upperCase, "REAL", false) || defpackage.rc1.AsxAYCCkb3Hi(upperCase, "FLOA", false) || defpackage.rc1.AsxAYCCkb3Hi(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof defpackage.pe1) {
                boolean z = this.F7NU4MC0GW > 0;
                defpackage.pe1 pe1Var = (defpackage.pe1) obj;
                int i = pe1Var.xiZrDbcSW0;
                if (z == (pe1Var.F7NU4MC0GW > 0) && defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, pe1Var.IHQe1A4L2xu) && this.r1MBDhnF == pe1Var.r1MBDhnF) {
                    java.lang.String str = pe1Var.adDC3e2L;
                    int i2 = this.xiZrDbcSW0;
                    java.lang.String str2 = this.adDC3e2L;
                    if ((i2 != 1 || i != 2 || str2 == null || defpackage.a70.SH1y5HwkJhh(str2, str)) && ((i2 != 2 || i != 1 || str == null || defpackage.a70.SH1y5HwkJhh(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : defpackage.a70.SH1y5HwkJhh(str2, str))) && this.AARZUJiTa == pe1Var.AARZUJiTa))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.IHQe1A4L2xu.hashCode() * 31) + this.AARZUJiTa) * 31) + (this.r1MBDhnF ? 1231 : 1237)) * 31) + this.F7NU4MC0GW;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.IHQe1A4L2xu);
        sb.append("',\n            |   type = '");
        sb.append(this.oh6vYeIP);
        sb.append("',\n            |   affinity = '");
        sb.append(this.AARZUJiTa);
        sb.append("',\n            |   notNull = '");
        sb.append(this.r1MBDhnF);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.F7NU4MC0GW);
        sb.append("',\n            |   defaultValue = '");
        java.lang.String str = this.adDC3e2L;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return defpackage.sc1.QPwENk36pDC(defpackage.sc1.Ye0N2xE9Hc(sb.toString()));
    }
}
