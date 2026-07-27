package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToolbarFragment extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishRoomToast CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishToolbarFragment(CatchingFishRoomToast catchingFishRoomToast, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishRoomToast;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishToolbarFragment catchingFishToolbarFragment = new CatchingFishToolbarFragment(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishToolbarFragment.CatchingFishLayout = obj;
        return catchingFishToolbarFragment;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishToolbarFragment) CatchingFishCloudMessaging((CatchingFishFluxMVVM) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
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
        CatchingFishFluxMVVM catchingFishFluxMVVM = (CatchingFishFluxMVVM) this.CatchingFishLayout;
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishReduxKtor = this.CatchingFishFragmentHandler.CatchingFishReduxKtor(new CatchingFishMockkXMLLayout(catchingFishFluxMVVM), this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (CatchingFishReduxKtor != catchingFishXMLLayoutMockk) {
            CatchingFishReduxKtor = catchingFishRealmContext;
        }
        return CatchingFishReduxKtor == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : catchingFishRealmContext;
    }
}
