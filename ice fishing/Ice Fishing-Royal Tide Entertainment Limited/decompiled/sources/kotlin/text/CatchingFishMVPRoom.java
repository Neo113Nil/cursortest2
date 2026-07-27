package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVPRoom extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ String CatchingFishLayout;
    public final /* synthetic */ CatchingFishLiveDataWidget CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVPRoom(CatchingFishLiveDataWidget catchingFishLiveDataWidget, String str, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishViewModelFAB = catchingFishLiveDataWidget;
        this.CatchingFishLayout = str;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishMVPRoom(this.CatchingFishViewModelFAB, this.CatchingFishLayout, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishMVPRoom) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        Object CatchingFishViewModelFAB;
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishLiveDataWidget catchingFishLiveDataWidget = this.CatchingFishViewModelFAB;
        CatchingFishHiltManifest catchingFishHiltManifest = catchingFishLiveDataWidget.CatchingFishDaggerWebsocket;
        String str = this.CatchingFishLayout;
        int i = 0;
        int i2 = 2;
        int i3 = 0;
        CatchingFishPayPalToast catchingFishPayPalToast = new CatchingFishPayPalToast(1, catchingFishLiveDataWidget, CatchingFishLiveDataWidget.class, "acceptDestination", "acceptDestination(Ljava/lang/String;)V", i3, i, i2);
        CatchingFishCustomViewKtor catchingFishCustomViewKtor = new CatchingFishCustomViewKtor(0, catchingFishLiveDataWidget, CatchingFishLiveDataWidget.class, "acceptFailure", "acceptFailure()V", i3, i, i2);
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "payload");
        try {
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle(16);
            catchingFishFluxFluxBundle.CatchingFishPayPalService(catchingFishHiltManifest.CatchingFishParcelableFAB);
            CatchingFishReduxBundleMVP CatchingFishDaggerWebsocket = catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket();
            CatchingFishFluxPicasso catchingFishFluxPicasso = new CatchingFishFluxPicasso(2, catchingFishHiltManifest);
            CatchingFishFirebaseDagger.CatchingFishNavigation(str, "payload");
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = new CatchingFishFluxFluxBundle();
            catchingFishFluxFluxBundle2.CatchingFishReduxKtor = str;
            catchingFishFluxFluxBundle2.CatchingFishDaggerWebsocket = catchingFishPayPalToast;
            catchingFishFluxFluxBundle2.CatchingFishWorkManager = catchingFishCustomViewKtor;
            catchingFishFluxFluxBundle2.CatchingFishViewModelScope = catchingFishFluxPicasso;
            catchingFishHiltManifest.CatchingFishCoroutine = ((CatchingFishMoshiMVP) catchingFishHiltManifest.CatchingFishSnackbar).CatchingFishParcelableFAB(CatchingFishDaggerWebsocket, catchingFishFluxFluxBundle2);
            CatchingFishViewModelFAB = Boolean.TRUE;
        } catch (Throwable th) {
            CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        Object obj2 = Boolean.FALSE;
        if (CatchingFishViewModelFAB instanceof CatchingFishLiveDataToolbar) {
            CatchingFishViewModelFAB = obj2;
        }
        return (Boolean) CatchingFishViewModelFAB;
    }
}
