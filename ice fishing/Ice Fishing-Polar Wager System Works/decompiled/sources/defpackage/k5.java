package defpackage;

/* loaded from: classes.dex */
public final class k5 {
    public final java.lang.String F7NU4MC0GW;
    public final java.lang.Object IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public k5(java.lang.Object obj, int i, int i2, java.lang.String str) {
        this.IHQe1A4L2xu = obj;
        this.oh6vYeIP = i;
        this.r1MBDhnF = i2;
        this.F7NU4MC0GW = str;
        if (i <= i2) {
            return;
        }
        defpackage.y50.IHQe1A4L2xu("Reversed range is not supported");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.k5)) {
            return false;
        }
        defpackage.k5 k5Var = (defpackage.k5) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, k5Var.IHQe1A4L2xu) && this.oh6vYeIP == k5Var.oh6vYeIP && this.r1MBDhnF == k5Var.r1MBDhnF && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, k5Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        java.lang.Object obj = this.IHQe1A4L2xu;
        return this.F7NU4MC0GW.hashCode() + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "Range(item=" + this.IHQe1A4L2xu + ", start=" + this.oh6vYeIP + ", end=" + this.r1MBDhnF + ", tag=" + this.F7NU4MC0GW + ')';
    }

    public k5(int i, int i2, java.lang.Object obj) {
        this(obj, i, i2, "");
    }
}
