package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishParcelableMoshi implements CatchingFishMVPStripeAPI {
    public static final CatchingFishParcelableMoshi CatchingFishParcelableFAB = new CatchingFishParcelableMoshi();
    public static final CatchingFishViewPagerJUnit CatchingFishSnackbar = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("eventTimeMs");
    public static final CatchingFishViewPagerJUnit CatchingFishCoroutine = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("eventCode");
    public static final CatchingFishViewPagerJUnit CatchingFishReduxKtor = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("eventUptimeMs");
    public static final CatchingFishViewPagerJUnit CatchingFishDaggerWebsocket = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("sourceExtension");
    public static final CatchingFishViewPagerJUnit CatchingFishWorkManager = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("sourceExtensionJsonProto3");
    public static final CatchingFishViewPagerJUnit CatchingFishViewModelScope = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("timezoneOffsetSeconds");
    public static final CatchingFishViewPagerJUnit CatchingFishViewModelFAB = CatchingFishViewPagerJUnit.CatchingFishParcelableFAB("networkConnectionInfo");

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        CatchingFishSnackbarWidget catchingFishSnackbarWidget = (CatchingFishSnackbarWidget) obj2;
        CatchingFishPicassoRedux catchingFishPicassoRedux = (CatchingFishPicassoRedux) ((CatchingFishParcelableGson) obj);
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishSnackbar, catchingFishPicassoRedux.CatchingFishParcelableFAB);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishCoroutine, catchingFishPicassoRedux.CatchingFishSnackbar);
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishReduxKtor, catchingFishPicassoRedux.CatchingFishCoroutine);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishDaggerWebsocket, catchingFishPicassoRedux.CatchingFishReduxKtor);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishWorkManager, catchingFishPicassoRedux.CatchingFishDaggerWebsocket);
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishViewModelScope, catchingFishPicassoRedux.CatchingFishWorkManager);
        catchingFishSnackbarWidget.CatchingFishDaggerWebsocket(CatchingFishViewModelFAB, catchingFishPicassoRedux.CatchingFishViewModelScope);
    }
}
