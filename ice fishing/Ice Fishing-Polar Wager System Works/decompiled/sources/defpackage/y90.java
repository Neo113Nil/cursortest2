package defpackage;

/* loaded from: classes.dex */
public final class y90 {
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final boolean r1MBDhnF;

    public y90(int i, int i2, boolean z) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.y90)) {
            return false;
        }
        defpackage.y90 y90Var = (defpackage.y90) obj;
        return this.IHQe1A4L2xu == y90Var.IHQe1A4L2xu && this.oh6vYeIP == y90Var.oh6vYeIP && this.r1MBDhnF == y90Var.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.r1MBDhnF) + defpackage.fx0.oh6vYeIP(this.oh6vYeIP, java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31);
    }

    public final java.lang.String toString() {
        return "BidiRun(start=" + this.IHQe1A4L2xu + ", end=" + this.oh6vYeIP + ", isRtl=" + this.r1MBDhnF + ')';
    }
}
