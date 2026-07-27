package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishPayPalWidget implements CatchingFishGlideGradle {
    public final long CatchingFishCoroutine;
    public final CatchingFishSnackbarAdMob CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishPayPalWidget(CatchingFishSnackbarAdMob catchingFishSnackbarAdMob, int i, long j) {
        this.CatchingFishParcelableFAB = catchingFishSnackbarAdMob;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = j;
    }

    @Override // kotlin.text.CatchingFishGlideGradle
    public final CatchingFishSnackbarFAB CatchingFishParcelableFAB() {
        return new CatchingFishBundleIntent(new CatchingFishEspressoPayPal(this.CatchingFishParcelableFAB.CatchingFishParcelableFAB), this.CatchingFishSnackbar, this.CatchingFishCoroutine);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishPayPalWidget)) {
            return false;
        }
        CatchingFishPayPalWidget catchingFishPayPalWidget = (CatchingFishPayPalWidget) obj;
        return catchingFishPayPalWidget.CatchingFishParcelableFAB.equals(this.CatchingFishParcelableFAB) && catchingFishPayPalWidget.CatchingFishSnackbar == this.CatchingFishSnackbar && catchingFishPayPalWidget.CatchingFishCoroutine == this.CatchingFishCoroutine;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishCoroutine) + ((CatchingFishMVPLiveData.CatchingFishParcelableFlux(this.CatchingFishSnackbar) + (this.CatchingFishParcelableFAB.hashCode() * 31)) * 31);
    }
}
