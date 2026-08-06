package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ws0 {
    public final long ZpBGe2uQfcn8;

    public /* synthetic */ ws0(long j) {
        this.ZpBGe2uQfcn8 = j;
    }

    public static final long JhCgjQRTAOCT(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static java.lang.String QiMR8OkAhezm(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long WDYagTQQm9ns(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static long ZpBGe2uQfcn8(long j, float f, int i) {
        float intBitsToFloat = (i & 1) != 0 ? java.lang.Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L);
    }

    public static final float fWTAfUmVKrZq(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) java.lang.Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final boolean giKS3J6vZuNy(long j, long j2) {
        return j == j2;
    }

    public static final long oh71FJcDz6S2(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ws0) {
            return this.ZpBGe2uQfcn8 == ((defpackage.ws0) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return QiMR8OkAhezm(this.ZpBGe2uQfcn8);
    }
}
