package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGsonWidget implements CatchingFishMVPViewService, AutoCloseable {
    public final CatchingFishSnackbarRedux CatchingFishDaggerWebsocket;
    public final String CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    public CatchingFishGsonWidget(String str, CatchingFishSnackbarRedux catchingFishSnackbarRedux) {
        this.CatchingFishReduxKtor = str;
        this.CatchingFishDaggerWebsocket = catchingFishSnackbarRedux;
    }

    public final void CatchingFishLayout(CatchingFishToolbarToast catchingFishToolbarToast, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewModelIntent, "registry");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarToast, "lifecycle");
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.CatchingFishWorkManager = true;
        catchingFishToolbarToast.CatchingFishParcelableFAB(this);
        catchingFishViewModelIntent.CatchingFishCardViewRealm(this.CatchingFishReduxKtor, (CatchingFishViewCardView) this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishViewModelFAB);
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_DESTROY) {
            this.CatchingFishWorkManager = false;
            catchingFishToastFlux.CatchingFishDaggerWebsocket().CatchingFishWorkManager(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
