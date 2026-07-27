package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMockkWidgetView {
    public CatchingFishMockkFirebase CatchingFishParcelableFAB;
    public CatchingFishMVPViewService CatchingFishSnackbar;

    public final void CatchingFishParcelableFAB(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        CatchingFishMockkFirebase CatchingFishParcelableFAB = catchingFishToolbarLiveData.CatchingFishParcelableFAB();
        CatchingFishMockkFirebase catchingFishMockkFirebase = this.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkFirebase, "state1");
        if (CatchingFishParcelableFAB.compareTo(catchingFishMockkFirebase) < 0) {
            catchingFishMockkFirebase = CatchingFishParcelableFAB;
        }
        this.CatchingFishParcelableFAB = catchingFishMockkFirebase;
        this.CatchingFishSnackbar.CatchingFishSnackbar(catchingFishToastFlux, catchingFishToolbarLiveData);
        this.CatchingFishParcelableFAB = CatchingFishParcelableFAB;
    }
}
