package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMotionLayoutMVI {
    public final CatchingFishFABDagger CatchingFishParcelableFAB;
    public final boolean CatchingFishSnackbar;

    public CatchingFishMotionLayoutMVI(CatchingFishFABDagger catchingFishFABDagger, boolean z) {
        this.CatchingFishParcelableFAB = catchingFishFABDagger;
        this.CatchingFishSnackbar = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishMotionLayoutMVI) {
            CatchingFishMotionLayoutMVI catchingFishMotionLayoutMVI = (CatchingFishMotionLayoutMVI) obj;
            if (catchingFishMotionLayoutMVI.CatchingFishParcelableFAB.equals(this.CatchingFishParcelableFAB) && catchingFishMotionLayoutMVI.CatchingFishSnackbar == this.CatchingFishSnackbar) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.CatchingFishSnackbar).hashCode();
    }
}
