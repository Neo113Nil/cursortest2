package defpackage;

/* loaded from: classes.dex */
public final class e70 {
    public static final defpackage.e70 adDC3e2L = new defpackage.e70(0, 0, 0, 0);
    public final int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public e70(int i, int i2, int i3, int i4) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = i3;
        this.F7NU4MC0GW = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.e70)) {
            return false;
        }
        defpackage.e70 e70Var = (defpackage.e70) obj;
        return this.IHQe1A4L2xu == e70Var.IHQe1A4L2xu && this.oh6vYeIP == e70Var.oh6vYeIP && this.r1MBDhnF == e70Var.r1MBDhnF && this.F7NU4MC0GW == e70Var.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.F7NU4MC0GW) + defpackage.fx0.oh6vYeIP(this.r1MBDhnF, defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "IntRect.fromLTRB(" + this.IHQe1A4L2xu + ", " + this.oh6vYeIP + ", " + this.r1MBDhnF + ", " + this.F7NU4MC0GW + ')';
    }
}
