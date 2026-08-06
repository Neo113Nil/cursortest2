package defpackage;

/* loaded from: classes.dex */
public final class xv {
    public final float IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final long r1MBDhnF;

    public xv(float f, float f2, long j) {
        this.IHQe1A4L2xu = f;
        this.oh6vYeIP = f2;
        this.r1MBDhnF = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xv)) {
            return false;
        }
        defpackage.xv xvVar = (defpackage.xv) obj;
        return java.lang.Float.compare(this.IHQe1A4L2xu, xvVar.IHQe1A4L2xu) == 0 && java.lang.Float.compare(this.oh6vYeIP, xvVar.oh6vYeIP) == 0 && this.r1MBDhnF == xvVar.r1MBDhnF;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.r1MBDhnF) + defpackage.fx0.IHQe1A4L2xu(this.oh6vYeIP, java.lang.Float.hashCode(this.IHQe1A4L2xu) * 31, 31);
    }

    public final java.lang.String toString() {
        return "FlingInfo(initialVelocity=" + this.IHQe1A4L2xu + ", distance=" + this.oh6vYeIP + ", duration=" + this.r1MBDhnF + ')';
    }
}
