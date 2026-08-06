package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ae1 {
    public final long ZpBGe2uQfcn8;

    public /* synthetic */ ae1(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    public static java.lang.String JhCgjQRTAOCT(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final boolean ZpBGe2uQfcn8(long j, long j2) {
        return j == j2;
    }

    public static final boolean fWTAfUmVKrZq(long j) {
        return (j == 9205357640488583168L) | (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float giKS3J6vZuNy(long j) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ae1) {
            return this.ZpBGe2uQfcn8 == ((defpackage.ae1) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return JhCgjQRTAOCT(this.ZpBGe2uQfcn8);
    }
}
