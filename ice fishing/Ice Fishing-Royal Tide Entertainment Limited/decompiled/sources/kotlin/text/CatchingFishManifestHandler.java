package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishManifestHandler extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishFluxMVI CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishManifestHandler(CatchingFishFluxMVI catchingFishFluxMVI, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishFluxMVI;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishManifestHandler(this.CatchingFishLayout, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishManifestHandler) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishLayoutViewPager CatchingFishSnackbar = ((CatchingFishReduxEspresso) this.CatchingFishLayout.CatchingFishCoroutine.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
            this.CatchingFishViewModelFAB = 1;
            obj = CatchingFishBiometricBundle.CatchingFishRoomDatabase(CatchingFishSnackbar, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (obj == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) obj;
        return catchingFishDaggerHiltMVI != null ? catchingFishDaggerHiltMVI.CatchingFishParcelableFAB() : CatchingFishMVPMoshiGson.CatchingFishReduxKtor;
    }
}
