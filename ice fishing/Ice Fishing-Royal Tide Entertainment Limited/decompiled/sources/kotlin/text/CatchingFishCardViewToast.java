package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCardViewToast {
    public final CatchingFishViewPagerRealm CatchingFishParcelableFAB;
    public final CatchingFishToastFlux CatchingFishSnackbar;

    public CatchingFishCardViewToast(CatchingFishViewPagerRealm catchingFishViewPagerRealm, CatchingFishToastFlux catchingFishToastFlux) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewPagerRealm, "callback");
        this.CatchingFishParcelableFAB = catchingFishViewPagerRealm;
        this.CatchingFishSnackbar = catchingFishToastFlux;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishCardViewToast)) {
            return false;
        }
        CatchingFishCardViewToast catchingFishCardViewToast = (CatchingFishCardViewToast) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishCardViewToast.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishCardViewToast.CatchingFishSnackbar);
    }

    public final int hashCode() {
        int hashCode = this.CatchingFishParcelableFAB.hashCode() * 31;
        CatchingFishToastFlux catchingFishToastFlux = this.CatchingFishSnackbar;
        return hashCode + (catchingFishToastFlux == null ? 0 : catchingFishToastFlux.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.CatchingFishParcelableFAB + ", owner=" + this.CatchingFishSnackbar + ')';
    }
}
