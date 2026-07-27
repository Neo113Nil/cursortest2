package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataJUnit extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishMockkStripeAPI CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishMVIBundle CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishLiveDataJUnit(CatchingFishMockkView catchingFishMockkView, CatchingFishMockkStripeAPI catchingFishMockkStripeAPI, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = (CatchingFishMVIBundle) catchingFishMockkView;
        this.CatchingFishFragmentHandler = catchingFishMockkStripeAPI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishLiveDataJUnit(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishLiveDataJUnit) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return obj;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        Object obj2 = this.CatchingFishFragmentHandler.CatchingFishSnackbar;
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishDaggerWebsocket = this.CatchingFishLayout.CatchingFishDaggerWebsocket(obj2, this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        return CatchingFishDaggerWebsocket == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : CatchingFishDaggerWebsocket;
    }
}
