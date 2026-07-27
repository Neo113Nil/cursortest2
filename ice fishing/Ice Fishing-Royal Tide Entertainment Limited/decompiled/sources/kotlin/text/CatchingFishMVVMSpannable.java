package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVVMSpannable extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ Long CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishXMLLayoutRedux CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishFluxMVI CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVVMSpannable(CatchingFishFluxMVI catchingFishFluxMVI, CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, Long l, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishFluxMVI;
        this.CatchingFishFragmentHandler = catchingFishXMLLayoutRedux;
        this.CatchingFishCloudMessaging = l;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishMVVMSpannable(this.CatchingFishLayout, this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishMVVMSpannable) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

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
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishLayout.CatchingFishCoroutine;
        CatchingFishMockkNavigation catchingFishMockkNavigation = new CatchingFishMockkNavigation(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, null);
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishParcelableFAB = catchingFishViewPagerMockk.CatchingFishParcelableFAB(new CatchingFishRoomDatabaseFAB(catchingFishMockkNavigation, null), this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        return CatchingFishParcelableFAB == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : CatchingFishParcelableFAB;
    }
}
