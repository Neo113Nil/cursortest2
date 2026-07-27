package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVVMGoogleMaps {
    public final float CatchingFishParcelableFAB;

    public CatchingFishMVVMGoogleMaps(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishMVVMGoogleMaps) && Float.compare(this.CatchingFishParcelableFAB, ((CatchingFishMVVMGoogleMaps) obj).CatchingFishParcelableFAB) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(new StringBuilder("Vertical(bias="), this.CatchingFishParcelableFAB, ')');
    }
}
