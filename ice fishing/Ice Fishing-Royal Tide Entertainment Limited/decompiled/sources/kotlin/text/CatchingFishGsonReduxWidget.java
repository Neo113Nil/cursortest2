package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGsonReduxWidget {
    public long CatchingFishCloudMessaging;
    public CatchingFishRealmWidget CatchingFishDaggerWebsocket;
    public long CatchingFishEspressoTesting;
    public CatchingFishLayoutRedux CatchingFishFragmentHandler;
    public CatchingFishLayoutRedux CatchingFishLayout;
    public CatchingFishFluxFluxBundle CatchingFishOkHttp;
    public CatchingFishReduxBundleMVP CatchingFishParcelableFAB;
    public String CatchingFishReduxKtor;
    public CatchingFishServicePicasso CatchingFishSnackbar;
    public CatchingFishLayoutRedux CatchingFishViewModelFAB;
    public CatchingFishGsonLifecycle CatchingFishViewModelScope;
    public int CatchingFishCoroutine = -1;
    public CatchingFishViewPagerMockk CatchingFishWorkManager = new CatchingFishViewPagerMockk(12);

    public static void CatchingFishSnackbar(String str, CatchingFishLayoutRedux catchingFishLayoutRedux) {
        if (catchingFishLayoutRedux.CatchingFishFragmentHandler != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (catchingFishLayoutRedux.CatchingFishCloudMessaging != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (catchingFishLayoutRedux.CatchingFishEspressoTesting != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (catchingFishLayoutRedux.CatchingFishOkHttp != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final CatchingFishLayoutRedux CatchingFishParcelableFAB() {
        if (this.CatchingFishParcelableFAB == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.CatchingFishSnackbar == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.CatchingFishCoroutine >= 0) {
            if (this.CatchingFishReduxKtor != null) {
                return new CatchingFishLayoutRedux(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.CatchingFishCoroutine);
    }
}
