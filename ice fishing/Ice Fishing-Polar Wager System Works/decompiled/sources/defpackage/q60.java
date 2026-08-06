package defpackage;

/* loaded from: classes.dex */
public final class q60 {
    public final int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final int r1MBDhnF;

    public q60(int i, int i2, int i3, int i4) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = i3;
        this.F7NU4MC0GW = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.q60)) {
            return false;
        }
        defpackage.q60 q60Var = (defpackage.q60) obj;
        return this.IHQe1A4L2xu == q60Var.IHQe1A4L2xu && this.oh6vYeIP == q60Var.oh6vYeIP && this.r1MBDhnF == q60Var.r1MBDhnF && this.F7NU4MC0GW == q60Var.F7NU4MC0GW;
    }

    public final int hashCode() {
        return (((((this.IHQe1A4L2xu * 31) + this.oh6vYeIP) * 31) + this.r1MBDhnF) * 31) + this.F7NU4MC0GW;
    }

    public final java.lang.String toString() {
        return "InsetsValues(left=" + this.IHQe1A4L2xu + ", top=" + this.oh6vYeIP + ", right=" + this.r1MBDhnF + ", bottom=" + this.F7NU4MC0GW + ')';
    }
}
