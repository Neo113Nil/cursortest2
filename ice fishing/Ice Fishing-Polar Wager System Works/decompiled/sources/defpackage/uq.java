package defpackage;

/* loaded from: classes.dex */
public final class uq implements java.lang.Comparable {
    public final float adDC3e2L;

    public static int IHQe1A4L2xu(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return 0;
        }
        return java.lang.Float.compare(f, f2);
    }

    public static final boolean oh6vYeIP(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    public static java.lang.String r1MBDhnF(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return IHQe1A4L2xu(this.adDC3e2L, ((defpackage.uq) obj).adDC3e2L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.uq) {
            return java.lang.Float.compare(this.adDC3e2L, ((defpackage.uq) obj).adDC3e2L) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.adDC3e2L);
    }

    public final java.lang.String toString() {
        return r1MBDhnF(this.adDC3e2L);
    }
}
