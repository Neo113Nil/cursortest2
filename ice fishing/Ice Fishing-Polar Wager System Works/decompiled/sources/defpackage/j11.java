package defpackage;

/* loaded from: classes.dex */
public final class j11 {
    public final int IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final long r1MBDhnF;

    public j11(int i, long j, long j2) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = j;
        this.r1MBDhnF = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.j11)) {
            return false;
        }
        defpackage.j11 j11Var = (defpackage.j11) obj;
        return this.IHQe1A4L2xu == j11Var.IHQe1A4L2xu && this.oh6vYeIP == j11Var.oh6vYeIP && this.r1MBDhnF == j11Var.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.r1MBDhnF) + defpackage.fx0.r1MBDhnF(java.lang.Integer.hashCode(this.IHQe1A4L2xu) * 31, 31, this.oh6vYeIP);
    }

    public final java.lang.String toString() {
        return "ResolvedEnergy(energy=" + this.IHQe1A4L2xu + ", anchorMs=" + this.oh6vYeIP + ", msToNext=" + this.r1MBDhnF + ")";
    }
}
