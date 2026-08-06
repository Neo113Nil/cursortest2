package defpackage;

/* loaded from: classes.dex */
public final class bg1 {
    public final java.lang.String IHQe1A4L2xu;
    public java.lang.String oh6vYeIP;
    public boolean r1MBDhnF = false;
    public defpackage.jt0 F7NU4MC0GW = null;

    public bg1(java.lang.String str, java.lang.String str2) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bg1)) {
            return false;
        }
        defpackage.bg1 bg1Var = (defpackage.bg1) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, bg1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, bg1Var.oh6vYeIP) && this.r1MBDhnF == bg1Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, bg1Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        int adDC3e2L = defpackage.fx0.adDC3e2L(defpackage.fx0.F7NU4MC0GW(this.IHQe1A4L2xu.hashCode() * 31, 31, this.oh6vYeIP), 31, this.r1MBDhnF);
        defpackage.jt0 jt0Var = this.F7NU4MC0GW;
        return adDC3e2L + (jt0Var == null ? 0 : jt0Var.hashCode());
    }

    public final java.lang.String toString() {
        return "TextSubstitution(layoutCache=" + this.F7NU4MC0GW + ", isShowingSubstitution=" + this.r1MBDhnF + ')';
    }
}
