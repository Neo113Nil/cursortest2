package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXMVP {
    public final int CatchingFishParcelableFAB;

    public static String CatchingFishParcelableFAB(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishAndroidXMVP) {
            return this.CatchingFishParcelableFAB == ((CatchingFishAndroidXMVP) obj).CatchingFishParcelableFAB;
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
