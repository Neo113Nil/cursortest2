package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVVMCustomView {
    public static final CatchingFishMVVMCustomView CatchingFishCoroutine = new CatchingFishMVVMCustomView(0.0f, new CatchingFishManifestIntent(0.0f, 0.0f));
    public final float CatchingFishParcelableFAB;
    public final CatchingFishManifestIntent CatchingFishSnackbar;

    public CatchingFishMVVMCustomView(float f, CatchingFishManifestIntent catchingFishManifestIntent) {
        this.CatchingFishParcelableFAB = f;
        this.CatchingFishSnackbar = catchingFishManifestIntent;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishMVVMCustomView)) {
            return false;
        }
        CatchingFishMVVMCustomView catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) obj;
        return this.CatchingFishParcelableFAB == catchingFishMVVMCustomView.CatchingFishParcelableFAB && this.CatchingFishSnackbar.equals(catchingFishMVVMCustomView.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return (this.CatchingFishSnackbar.hashCode() + (Float.hashCode(this.CatchingFishParcelableFAB) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.CatchingFishParcelableFAB + ", range=" + this.CatchingFishSnackbar + ", steps=0)";
    }
}
