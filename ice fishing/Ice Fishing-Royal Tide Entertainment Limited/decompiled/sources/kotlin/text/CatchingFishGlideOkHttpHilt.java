package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGlideOkHttpHilt {
    public final int CatchingFishParcelableFAB;

    public static String CatchingFishParcelableFAB(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishGlideOkHttpHilt) {
            return this.CatchingFishParcelableFAB == ((CatchingFishGlideOkHttpHilt) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishParcelableFAB(this.CatchingFishParcelableFAB);
    }
}
