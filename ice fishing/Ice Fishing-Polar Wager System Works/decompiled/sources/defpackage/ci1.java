package defpackage;

/* loaded from: classes.dex */
public final class ci1 {
    public static final long oh6vYeIP = (java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.5f) & 4294967295L);
    public static final /* synthetic */ int r1MBDhnF = 0;
    public final long IHQe1A4L2xu;

    public static final boolean IHQe1A4L2xu(long j, long j2) {
        return j == j2;
    }

    public static java.lang.String oh6vYeIP(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ci1) {
            return this.IHQe1A4L2xu == ((defpackage.ci1) obj).IHQe1A4L2xu;
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
