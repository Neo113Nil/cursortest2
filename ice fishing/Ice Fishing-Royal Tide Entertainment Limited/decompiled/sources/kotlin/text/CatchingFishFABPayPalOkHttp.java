package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABPayPalOkHttp extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishNavigationRedux CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishCardViewView CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFABPayPalOkHttp(CatchingFishCardViewView catchingFishCardViewView, CatchingFishNavigationRedux catchingFishNavigationRedux, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishCardViewView;
        this.CatchingFishCloudMessaging = catchingFishNavigationRedux;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishFABPayPalOkHttp catchingFishFABPayPalOkHttp = new CatchingFishFABPayPalOkHttp(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
        catchingFishFABPayPalOkHttp.CatchingFishLayout = obj;
        return catchingFishFABPayPalOkHttp;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishFABPayPalOkHttp) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishToastLayout catchingFishToastLayout = (CatchingFishToastLayout) this.CatchingFishLayout;
        this.CatchingFishViewModelFAB = 1;
        this.CatchingFishFragmentHandler.CatchingFishReduxKtor(catchingFishToastLayout, this.CatchingFishCloudMessaging, this);
        return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }
}
