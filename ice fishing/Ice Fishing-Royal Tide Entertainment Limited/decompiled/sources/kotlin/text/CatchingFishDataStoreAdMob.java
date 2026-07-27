package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreAdMob {
    public static final CatchingFishDataStoreAdMob CatchingFishCoroutine = new CatchingFishDataStoreAdMob(2, false);
    public static final CatchingFishDataStoreAdMob CatchingFishReduxKtor = new CatchingFishDataStoreAdMob(1, true);
    public final int CatchingFishParcelableFAB;
    public final boolean CatchingFishSnackbar;

    public CatchingFishDataStoreAdMob(int i, boolean z) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishDataStoreAdMob)) {
            return false;
        }
        CatchingFishDataStoreAdMob catchingFishDataStoreAdMob = (CatchingFishDataStoreAdMob) obj;
        return this.CatchingFishParcelableFAB == catchingFishDataStoreAdMob.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishDataStoreAdMob.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.CatchingFishSnackbar) + (Integer.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        return equals(CatchingFishCoroutine) ? "TextMotion.Static" : equals(CatchingFishReduxKtor) ? "TextMotion.Animated" : "Invalid";
    }
}
