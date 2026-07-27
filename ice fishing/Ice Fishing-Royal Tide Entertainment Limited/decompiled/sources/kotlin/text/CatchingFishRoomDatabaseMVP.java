package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRoomDatabaseMVP implements CatchingFishMVPStripeAPI {
    public static final CatchingFishRoomDatabaseMVP CatchingFishParcelableFAB = new CatchingFishRoomDatabaseMVP();
    public static final CatchingFishViewPagerJUnit CatchingFishSnackbar = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("requestTimeMs");
    public static final CatchingFishViewPagerJUnit CatchingFishCoroutine = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("requestUptimeMs");
    public static final CatchingFishViewPagerJUnit CatchingFishReduxKtor = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("clientInfo");
    public static final CatchingFishViewPagerJUnit CatchingFishDaggerWebsocket = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("logSource");
    public static final CatchingFishViewPagerJUnit CatchingFishWorkManager = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("logSourceName");
    public static final CatchingFishViewPagerJUnit CatchingFishViewModelScope = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("logEvent");
    public static final CatchingFishViewPagerJUnit CatchingFishViewModelFAB = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("qosTier");

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        CatchingFishSnackbarWidget catchingFishSnackbarWidget = (CatchingFishSnackbarWidget) obj2;
        CatchingFishExoPlayerIntent catchingFishExoPlayerIntent = (CatchingFishExoPlayerIntent) ((CatchingFishViewModelRoom) obj);
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishSnackbar, catchingFishExoPlayerIntent.CatchingFishParcelableFAB);
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishCoroutine, catchingFishExoPlayerIntent.CatchingFishSnackbar);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishReduxKtor, catchingFishExoPlayerIntent.CatchingFishCoroutine);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishDaggerWebsocket, catchingFishExoPlayerIntent.CatchingFishReduxKtor);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishWorkManager, catchingFishExoPlayerIntent.CatchingFishDaggerWebsocket);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, catchingFishExoPlayerIntent.CatchingFishWorkManager);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishViewModelFAB, CatchingFishJUnitWidget.CatchingFishReduxKtor);
    }
}
