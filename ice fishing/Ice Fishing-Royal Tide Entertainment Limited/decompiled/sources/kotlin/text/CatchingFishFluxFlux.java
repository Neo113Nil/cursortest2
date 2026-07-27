package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxFlux extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishNavigationRoom CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishReduxMVI CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFluxFlux(CatchingFishReduxMVI catchingFishReduxMVI, CatchingFishNavigationRoom catchingFishNavigationRoom, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishReduxMVI;
        this.CatchingFishFragmentHandler = catchingFishNavigationRoom;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishFluxFlux(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        ((CatchingFishFluxFlux) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
        return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishCameraXRedux catchingFishCameraXRedux = new CatchingFishCameraXRedux(3, this.CatchingFishFragmentHandler);
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishCoroutine = this.CatchingFishLayout.CatchingFishCoroutine(catchingFishCameraXRedux, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (CatchingFishCoroutine == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        throw new CatchingFishBiometricView();
    }
}
