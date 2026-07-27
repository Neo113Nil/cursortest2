package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCameraXFlux {
    public final long CatchingFishParcelableFAB;
    public static final CatchingFishBundleBiometric[] CatchingFishSnackbar = {new CatchingFishBundleBiometric(0), new CatchingFishBundleBiometric(4294967296L), new CatchingFishBundleBiometric(8589934592L)};
    public static final long CatchingFishCoroutine = CatchingFishLayoutRoom.CatchingFishCardViewRealm(0, Float.NaN);

    public static final float CatchingFishCoroutine(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean CatchingFishParcelableFAB(long j, long j2) {
        return j == j2;
    }

    public static String CatchingFishReduxKtor(long j) {
        long CatchingFishSnackbar2 = CatchingFishSnackbar(j);
        if (CatchingFishBundleBiometric.CatchingFishParcelableFAB(CatchingFishSnackbar2, 0L)) {
            return "Unspecified";
        }
        if (CatchingFishBundleBiometric.CatchingFishParcelableFAB(CatchingFishSnackbar2, 4294967296L)) {
            return CatchingFishCoroutine(j) + ".sp";
        }
        if (!CatchingFishBundleBiometric.CatchingFishParcelableFAB(CatchingFishSnackbar2, 8589934592L)) {
            return "Invalid";
        }
        return CatchingFishCoroutine(j) + ".em";
    }

    public static final long CatchingFishSnackbar(long j) {
        return CatchingFishSnackbar[(int) ((j & 1095216660480L) >>> 32)].CatchingFishParcelableFAB;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishCameraXFlux) {
            return this.CatchingFishParcelableFAB == ((CatchingFishCameraXFlux) obj).CatchingFishParcelableFAB;
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
