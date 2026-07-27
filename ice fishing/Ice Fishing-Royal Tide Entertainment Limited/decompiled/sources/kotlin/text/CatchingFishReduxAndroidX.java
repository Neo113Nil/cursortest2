package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxAndroidX {
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public CatchingFishReduxAndroidX(float f, float f2) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
    }

    public final long CatchingFishParcelableFAB(long j, long j2, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
        float f3 = this.CatchingFishParcelableFAB;
        if (catchingFishGradleMVPKtor != catchingFishGradleMVPKtor2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 + this.CatchingFishSnackbar) * f2;
        return (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishReduxAndroidX)) {
            return false;
        }
        CatchingFishReduxAndroidX catchingFishReduxAndroidX = (CatchingFishReduxAndroidX) obj;
        return Float.compare(this.CatchingFishParcelableFAB, catchingFishReduxAndroidX.CatchingFishParcelableFAB) == 0 && Float.compare(this.CatchingFishSnackbar, catchingFishReduxAndroidX.CatchingFishSnackbar) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.CatchingFishSnackbar) + (Float.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", verticalBias=");
        return CatchingFishMVPLiveData.CatchingFishUnitTesting(sb, this.CatchingFishSnackbar, ')');
    }
}
