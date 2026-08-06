package defpackage;

/* loaded from: classes.dex */
public final class wq {
    public final long IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.wq) {
            return this.IHQe1A4L2xu == ((defpackage.wq) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        long j = this.IHQe1A4L2xu;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((java.lang.Object) defpackage.uq.r1MBDhnF(java.lang.Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((java.lang.Object) defpackage.uq.r1MBDhnF(java.lang.Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
