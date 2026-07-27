package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltMVVMHandler {
    public static final /* synthetic */ int CatchingFishSnackbar = 0;
    public final float CatchingFishParcelableFAB;

    static {
        float f = CatchingFishMVIMVVMManifest.CatchingFishSnackbar;
    }

    public CatchingFishHiltMVVMHandler(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishHiltMVVMHandler)) {
            return false;
        }
        float f = ((CatchingFishHiltMVVMHandler) obj).CatchingFishParcelableFAB;
        float f2 = CatchingFishMVIMVVMManifest.CatchingFishSnackbar;
        return Float.compare(this.CatchingFishParcelableFAB, f) == 0;
    }

    public final int hashCode() {
        float f = CatchingFishMVIMVVMManifest.CatchingFishSnackbar;
        return Integer.hashCode(0) + CatchingFishMVPLiveData.CatchingFishViewModelScope(0, Float.hashCode(this.CatchingFishParcelableFAB) * 31, 31);
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) CatchingFishMVIMVVMManifest.CatchingFishSnackbar(this.CatchingFishParcelableFAB)) + ", trim=LineHeightStyle.Trim.None,mode=Mode(value=0))";
    }
}
