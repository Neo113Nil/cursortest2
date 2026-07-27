package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitHilt implements CatchingFishMVPStripeAPI {
    public static final CatchingFishRetrofitHilt CatchingFishParcelableFAB = new CatchingFishRetrofitHilt();
    public static final CatchingFishViewPagerJUnit CatchingFishSnackbar = new CatchingFishViewPagerJUnit("window", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(1))));
    public static final CatchingFishViewPagerJUnit CatchingFishCoroutine = new CatchingFishViewPagerJUnit("logSourceMetrics", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(2))));
    public static final CatchingFishViewPagerJUnit CatchingFishReduxKtor = new CatchingFishViewPagerJUnit("globalMetrics", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(3))));
    public static final CatchingFishViewPagerJUnit CatchingFishDaggerWebsocket = new CatchingFishViewPagerJUnit("appNamespace", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(4))));

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        CatchingFishEspressoOkHttp catchingFishEspressoOkHttp = (CatchingFishEspressoOkHttp) obj;
        CatchingFishSnackbarWidget catchingFishSnackbarWidget = (CatchingFishSnackbarWidget) obj2;
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishSnackbar, catchingFishEspressoOkHttp.CatchingFishParcelableFAB);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishCoroutine, catchingFishEspressoOkHttp.CatchingFishSnackbar);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishReduxKtor, catchingFishEspressoOkHttp.CatchingFishCoroutine);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishDaggerWebsocket, catchingFishEspressoOkHttp.CatchingFishReduxKtor);
    }
}
