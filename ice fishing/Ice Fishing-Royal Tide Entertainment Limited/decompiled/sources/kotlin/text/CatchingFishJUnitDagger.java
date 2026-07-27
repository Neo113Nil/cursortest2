package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishJUnitDagger {
    public final float CatchingFishParcelableFAB;

    public CatchingFishJUnitDagger(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishJUnitDagger) && Float.compare(this.CatchingFishParcelableFAB, ((CatchingFishJUnitDagger) obj).CatchingFishParcelableFAB) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(new StringBuilder("Horizontal(bias="), this.CatchingFishParcelableFAB, ')');
    }
}
