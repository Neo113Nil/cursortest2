package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxNavigation {
    public final int CatchingFishCoroutine;
    public final Object CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    public CatchingFishFluxNavigation(Object obj, int i, int i2, String str) {
        this.CatchingFishParcelableFAB = obj;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = str;
        if (i <= i2) {
            return;
        }
        CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFluxNavigation)) {
            return false;
        }
        CatchingFishFluxNavigation catchingFishFluxNavigation = (CatchingFishFluxNavigation) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishFluxNavigation.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishFluxNavigation.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishFluxNavigation.CatchingFishCoroutine && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishFluxNavigation.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        Object obj = this.CatchingFishParcelableFAB;
        return this.CatchingFishReduxKtor.hashCode() + CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishSnackbar, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.CatchingFishParcelableFAB + ", start=" + this.CatchingFishSnackbar + ", end=" + this.CatchingFishCoroutine + ", tag=" + this.CatchingFishReduxKtor + ')';
    }
}
