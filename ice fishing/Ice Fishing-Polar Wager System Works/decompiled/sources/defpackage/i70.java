package defpackage;

/* loaded from: classes.dex */
public final class i70 {
    public final long IHQe1A4L2xu;

    public static final boolean IHQe1A4L2xu(long j, long j2) {
        return j == j2;
    }

    public static java.lang.String oh6vYeIP(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.i70) {
            return this.IHQe1A4L2xu == ((defpackage.i70) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return oh6vYeIP(this.IHQe1A4L2xu);
    }
}
