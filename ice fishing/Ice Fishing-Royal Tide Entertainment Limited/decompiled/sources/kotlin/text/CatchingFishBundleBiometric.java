package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBundleBiometric {
    public final long CatchingFishParcelableFAB;

    public static final boolean CatchingFishParcelableFAB(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishBundleBiometric) {
            return this.CatchingFishParcelableFAB == ((CatchingFishBundleBiometric) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        long j = this.CatchingFishParcelableFAB;
        return CatchingFishParcelableFAB(j, 0L) ? "Unspecified" : CatchingFishParcelableFAB(j, 4294967296L) ? "Sp" : CatchingFishParcelableFAB(j, 8589934592L) ? "Em" : "Invalid";
    }
}
