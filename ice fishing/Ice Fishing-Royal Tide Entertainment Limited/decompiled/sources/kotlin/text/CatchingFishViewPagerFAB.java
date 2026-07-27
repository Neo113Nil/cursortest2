package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerFAB {
    public final int CatchingFishParcelableFAB;

    public static String CatchingFishParcelableFAB(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishViewPagerFAB) {
            return this.CatchingFishParcelableFAB == ((CatchingFishViewPagerFAB) obj).CatchingFishParcelableFAB;
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
