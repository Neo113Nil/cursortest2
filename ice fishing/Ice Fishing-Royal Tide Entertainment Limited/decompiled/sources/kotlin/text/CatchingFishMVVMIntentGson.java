package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVVMIntentGson {
    public final String CatchingFishCoroutine;
    public final CatchingFishDataStoreToast CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishMVVMIntentGson(String str, String str2, String str3, String str4, CatchingFishDataStoreToast catchingFishDataStoreToast) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "zeroAdvertisingId");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "postbackAddress");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str3, "encryptionPassword");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str4, "adjustApplicationToken");
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = str3;
        this.CatchingFishReduxKtor = str4;
        this.CatchingFishDaggerWebsocket = catchingFishDataStoreToast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishMVVMIntentGson)) {
            return false;
        }
        CatchingFishMVVMIntentGson catchingFishMVVMIntentGson = (CatchingFishMVVMIntentGson) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishMVVMIntentGson.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishMVVMIntentGson.CatchingFishSnackbar) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishMVVMIntentGson.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishMVVMIntentGson.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishMVVMIntentGson.CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        return this.CatchingFishDaggerWebsocket.hashCode() + ((this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishCoroutine.hashCode() + ((this.CatchingFishSnackbar.hashCode() + (this.CatchingFishParcelableFAB.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RuntimeConfiguration(zeroAdvertisingId=" + this.CatchingFishParcelableFAB + ", postbackAddress=" + this.CatchingFishSnackbar + ", encryptionPassword=" + this.CatchingFishCoroutine + ", adjustApplicationToken=" + this.CatchingFishReduxKtor + ", payloadFields=" + this.CatchingFishDaggerWebsocket + ")";
    }
}
