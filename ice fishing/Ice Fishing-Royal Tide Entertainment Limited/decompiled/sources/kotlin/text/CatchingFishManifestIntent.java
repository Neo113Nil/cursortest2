package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishManifestIntent {
    public final float CatchingFishParcelableFAB;
    public final float CatchingFishSnackbar;

    public CatchingFishManifestIntent(float f, float f2) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = f2;
    }

    public static boolean CatchingFishParcelableFAB(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishManifestIntent)) {
            return false;
        }
        float f = this.CatchingFishParcelableFAB;
        float f2 = this.CatchingFishSnackbar;
        if (f > f2) {
            CatchingFishManifestIntent catchingFishManifestIntent = (CatchingFishManifestIntent) obj;
            if (catchingFishManifestIntent.CatchingFishParcelableFAB > catchingFishManifestIntent.CatchingFishSnackbar) {
                return true;
            }
        }
        CatchingFishManifestIntent catchingFishManifestIntent2 = (CatchingFishManifestIntent) obj;
        return f == catchingFishManifestIntent2.CatchingFishParcelableFAB && f2 == catchingFishManifestIntent2.CatchingFishSnackbar;
    }

    public final int hashCode() {
        float f = this.CatchingFishParcelableFAB;
        float f2 = this.CatchingFishSnackbar;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.CatchingFishParcelableFAB + ".." + this.CatchingFishSnackbar;
    }
}
