package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHandlerGradle extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishKtorView CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHandlerGradle(CatchingFishKtorView catchingFishKtorView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishKtorView;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishHandlerGradle catchingFishHandlerGradle = new CatchingFishHandlerGradle(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishHandlerGradle.CatchingFishLayout = obj;
        return catchingFishHandlerGradle;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishHandlerGradle) CatchingFishCloudMessaging((CatchingFishOkHttpDataStore) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishOkHttpDataStore catchingFishOkHttpDataStore = (CatchingFishOkHttpDataStore) this.CatchingFishLayout;
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishReduxKtor = CatchingFishKtorView.CatchingFishReduxKtor(this.CatchingFishFragmentHandler, catchingFishOkHttpDataStore, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (CatchingFishReduxKtor == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
