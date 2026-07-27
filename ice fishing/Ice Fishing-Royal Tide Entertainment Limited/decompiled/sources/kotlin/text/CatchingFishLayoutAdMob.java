package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLayoutAdMob {
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public CatchingFishLayoutAdMob(float f, float f2) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishLayoutAdMob)) {
            return false;
        }
        CatchingFishLayoutAdMob catchingFishLayoutAdMob = (CatchingFishLayoutAdMob) obj;
        return this.CatchingFishParcelableFAB == catchingFishLayoutAdMob.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishLayoutAdMob.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishSnackbar) + (Float.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", skewX=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishSnackbar, ')');
    }
}
