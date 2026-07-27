package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPCameraX {
    public final long CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishMVPCameraX(long j) {
        this.CatchingFishParcelableFAB = j;
    }

    public static final float CatchingFishCoroutine(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean CatchingFishParcelableFAB(long j, long j2) {
        return j == j2;
    }

    public static String CatchingFishReduxKtor(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat((int) (j >> 32))) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final float CatchingFishSnackbar(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishMVPCameraX) {
            return this.CatchingFishParcelableFAB == ((CatchingFishMVPCameraX) obj).CatchingFishParcelableFAB;
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
