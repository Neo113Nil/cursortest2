package defpackage;

/* loaded from: classes.dex */
public final class u60 {
    public final long IHQe1A4L2xu;

    public static long IHQe1A4L2xu(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.u60) {
            return this.IHQe1A4L2xu == ((defpackage.u60) obj).IHQe1A4L2xu;
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
