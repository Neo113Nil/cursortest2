package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPViewHilt {
    public final int CatchingFishParcelableFAB;

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishMVPViewHilt) {
            return this.CatchingFishParcelableFAB == ((CatchingFishMVPViewHilt) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        int i = this.CatchingFishParcelableFAB;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
