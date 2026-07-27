package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltIntent {
    public final CatchingFishSpannableView CatchingFishCoroutine;
    public final long CatchingFishParcelableFAB;
    public final CatchingFishBundleMVIHilt CatchingFishSnackbar;

    public CatchingFishHiltIntent(long j, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, CatchingFishSpannableView catchingFishSpannableView) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = catchingFishBundleMVIHilt;
        this.CatchingFishCoroutine = catchingFishSpannableView;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishHiltIntent) {
            CatchingFishHiltIntent catchingFishHiltIntent = (CatchingFishHiltIntent) obj;
            if (this.CatchingFishParcelableFAB == catchingFishHiltIntent.CatchingFishParcelableFAB && this.CatchingFishSnackbar.equals(catchingFishHiltIntent.CatchingFishSnackbar) && this.CatchingFishCoroutine.equals(catchingFishHiltIntent.CatchingFishCoroutine)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar.hashCode()) * 1000003) ^ this.CatchingFishCoroutine.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.CatchingFishParcelableFAB + ", transportContext=" + this.CatchingFishSnackbar + ", event=" + this.CatchingFishCoroutine + "}";
    }
}
