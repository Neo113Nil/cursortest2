package defpackage;

/* loaded from: classes.dex */
public final class j30 {
    public final defpackage.a01 F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final java.lang.String oh6vYeIP;
    public final java.lang.String r1MBDhnF;

    public j30(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.a01 a01Var) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
        this.r1MBDhnF = str3;
        this.F7NU4MC0GW = a01Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.j30)) {
            return false;
        }
        defpackage.j30 j30Var = (defpackage.j30) obj;
        return this.IHQe1A4L2xu.equals(j30Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(j30Var.oh6vYeIP) && this.r1MBDhnF.equals(j30Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, j30Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        int F7NU4MC0GW = defpackage.fx0.F7NU4MC0GW(defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF);
        defpackage.a01 a01Var = this.F7NU4MC0GW;
        return F7NU4MC0GW + (a01Var == null ? 0 : a01Var.hashCode());
    }

    public final java.lang.String toString() {
        return "HaulEntry(key=" + this.IHQe1A4L2xu + ", title=" + this.oh6vYeIP + ", detail=" + this.r1MBDhnF + ", relic=" + this.F7NU4MC0GW + ")";
    }
}
