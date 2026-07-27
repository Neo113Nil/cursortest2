package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToolbarMVIMVVM {
    public final long CatchingFishParcelableFAB;

    public static final long CatchingFishCoroutine(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final boolean CatchingFishParcelableFAB(long j, long j2) {
        return j == j2;
    }

    public static String CatchingFishReduxKtor(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat((int) (j >> 32))) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long CatchingFishSnackbar(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishToolbarMVIMVVM) {
            return this.CatchingFishParcelableFAB == ((CatchingFishToolbarMVIMVVM) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishReduxKtor(this.CatchingFishParcelableFAB);
    }
}
