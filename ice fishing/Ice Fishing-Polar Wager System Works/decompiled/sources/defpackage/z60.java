package defpackage;

/* loaded from: classes.dex */
public final class z60 {
    public final long IHQe1A4L2xu;

    public static final boolean IHQe1A4L2xu(long j, long j2) {
        return j == j2;
    }

    public static final long oh6vYeIP(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long r1MBDhnF(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.z60) {
            return this.IHQe1A4L2xu == ((defpackage.z60) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        long j = this.IHQe1A4L2xu;
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
