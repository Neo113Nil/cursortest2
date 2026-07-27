package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarToast {
    public final String CatchingFishParcelableFAB;
    public final CatchingFishIntentAnimation CatchingFishSnackbar;

    public CatchingFishSnackbarToast(String str, CatchingFishIntentAnimation catchingFishIntentAnimation) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = catchingFishIntentAnimation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishSnackbarToast)) {
            return false;
        }
        CatchingFishSnackbarToast catchingFishSnackbarToast = (CatchingFishSnackbarToast) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishSnackbarToast.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishSnackbarToast.CatchingFishSnackbar);
    }

    public final int hashCode() {
        String str = this.CatchingFishParcelableFAB;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        CatchingFishIntentAnimation catchingFishIntentAnimation = this.CatchingFishSnackbar;
        return hashCode + (catchingFishIntentAnimation != null ? catchingFishIntentAnimation.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.CatchingFishParcelableFAB + ", action=" + this.CatchingFishSnackbar + ')';
    }
}
