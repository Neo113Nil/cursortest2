package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxManifest implements CatchingFishMVPStripeAPI {
    public static final CatchingFishReduxManifest CatchingFishParcelableFAB = new CatchingFishReduxManifest();
    public static final CatchingFishViewPagerJUnit CatchingFishSnackbar = new CatchingFishViewPagerJUnit("currentCacheSizeBytes", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(1))));
    public static final CatchingFishViewPagerJUnit CatchingFishCoroutine = new CatchingFishViewPagerJUnit("maxCacheSizeBytes", CatchingFishMVPLiveData.CatchingFishNavigation(CatchingFishMVPLiveData.CatchingFishRoomDatabase(CatchingFishGradleHilt.class, new CatchingFishViewModelKtor(2))));

    @Override // kotlin.text.CatchingFishViewKtor
    public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
        CatchingFishDaggerMVVM catchingFishDaggerMVVM = (CatchingFishDaggerMVVM) obj;
        CatchingFishSnackbarWidget catchingFishSnackbarWidget = (CatchingFishSnackbarWidget) obj2;
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishSnackbar, catchingFishDaggerMVVM.CatchingFishParcelableFAB);
        catchingFishSnackbarWidget.CatchingFishReduxKtor(CatchingFishCoroutine, catchingFishDaggerMVVM.CatchingFishSnackbar);
    }
}
