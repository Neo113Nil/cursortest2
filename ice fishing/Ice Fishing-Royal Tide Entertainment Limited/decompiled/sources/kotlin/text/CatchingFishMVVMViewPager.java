package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVVMViewPager {
    public final int CatchingFishParcelableFAB;

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishMVVMViewPager) {
            return this.CatchingFishParcelableFAB == ((CatchingFishMVVMViewPager) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        int i = this.CatchingFishParcelableFAB;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
