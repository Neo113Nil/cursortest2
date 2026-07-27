package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishServiceMVVMView extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishRetrofitRoom CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishServiceMVVMView(CatchingFishRetrofitRoom catchingFishRetrofitRoom, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishRetrofitRoom;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishServiceMVVMView(this.CatchingFishLayout, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishServiceMVVMView) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return catchingFishRealmContext;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishLayout.CatchingFishReduxKtor;
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishCloudMessaging = catchingFishGradleCameraX.CatchingFishDaggerHiltFAB.CatchingFishCloudMessaging(this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (CatchingFishCloudMessaging != catchingFishXMLLayoutMockk) {
            CatchingFishCloudMessaging = catchingFishRealmContext;
        }
        return CatchingFishCloudMessaging == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : catchingFishRealmContext;
    }
}
