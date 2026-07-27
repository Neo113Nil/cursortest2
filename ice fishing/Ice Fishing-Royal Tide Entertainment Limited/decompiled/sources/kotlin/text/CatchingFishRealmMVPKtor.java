package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRealmMVPKtor {
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public CatchingFishRealmMVPKtor(float f, float f2) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
    }

    public final float[] CatchingFishParcelableFAB() {
        float f = this.CatchingFishParcelableFAB;
        float f2 = this.CatchingFishSnackbar;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishRealmMVPKtor)) {
            return false;
        }
        CatchingFishRealmMVPKtor catchingFishRealmMVPKtor = (CatchingFishRealmMVPKtor) obj;
        return Float.compare(this.CatchingFishParcelableFAB, catchingFishRealmMVPKtor.CatchingFishParcelableFAB) == 0 && Float.compare(this.CatchingFishSnackbar, catchingFishRealmMVPKtor.CatchingFishSnackbar) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishSnackbar) + (Float.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", y=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishSnackbar, ')');
    }
}
