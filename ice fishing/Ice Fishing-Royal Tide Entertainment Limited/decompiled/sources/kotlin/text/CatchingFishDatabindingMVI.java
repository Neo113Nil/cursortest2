package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDatabindingMVI {
    public final int CatchingFishParcelableFAB;

    public static String CatchingFishParcelableFAB(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishDatabindingMVI) {
            return this.CatchingFishParcelableFAB == ((CatchingFishDatabindingMVI) obj).CatchingFishParcelableFAB;
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
