package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreToast {
    public final String CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishDataStoreToast(String str, String str2, String str3, String str4) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "advertisingId");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "installReferrer");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str3, "messagingToken");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str4, "adjustId");
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = str3;
        this.CatchingFishReduxKtor = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishDataStoreToast)) {
            return false;
        }
        CatchingFishDataStoreToast catchingFishDataStoreToast = (CatchingFishDataStoreToast) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishDataStoreToast.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishDataStoreToast.CatchingFishSnackbar) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishDataStoreToast.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishDataStoreToast.CatchingFishReduxKtor);
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishCoroutine.hashCode() + ((this.CatchingFishSnackbar.hashCode() + (this.CatchingFishParcelableFAB.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PayloadFieldNames(advertisingId=" + this.CatchingFishParcelableFAB + ", installReferrer=" + this.CatchingFishSnackbar + ", messagingToken=" + this.CatchingFishCoroutine + ", adjustId=" + this.CatchingFishReduxKtor + ")";
    }
}
