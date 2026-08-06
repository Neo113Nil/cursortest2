package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jt1 {
    public final long ZpBGe2uQfcn8;

    public static final long JhCgjQRTAOCT(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long WDYagTQQm9ns(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static long ZpBGe2uQfcn8(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final float fWTAfUmVKrZq(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float giKS3J6vZuNy(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static java.lang.String oh71FJcDz6S2(long j) {
        return "(" + giKS3J6vZuNy(j) + ", " + fWTAfUmVKrZq(j) + ") px/sec";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.jt1) {
            return this.ZpBGe2uQfcn8 == ((defpackage.jt1) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return oh71FJcDz6S2(this.ZpBGe2uQfcn8);
    }
}
