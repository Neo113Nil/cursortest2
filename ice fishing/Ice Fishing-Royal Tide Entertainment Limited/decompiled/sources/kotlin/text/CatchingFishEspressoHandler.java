package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishEspressoHandler implements CatchingFishMVPStripeAPI {
    public static final CatchingFishEspressoHandler CatchingFishParcelableFAB = new CatchingFishEspressoHandler();
    public static final CatchingFishViewPagerJUnit CatchingFishSnackbar = new CatchingFishViewPagerJUnit("logSource", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(1))));
    public static final CatchingFishViewPagerJUnit CatchingFishCoroutine = new CatchingFishViewPagerJUnit("logEventDropped", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(2))));

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        CatchingFishManifestMoshi catchingFishManifestMoshi = (CatchingFishManifestMoshi) obj;
        CatchingFishSnackbarWidget catchingFishSnackbarWidget = (CatchingFishSnackbarWidget) obj2;
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishSnackbar, catchingFishManifestMoshi.CatchingFishParcelableFAB);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishCoroutine, catchingFishManifestMoshi.CatchingFishSnackbar);
    }
}
