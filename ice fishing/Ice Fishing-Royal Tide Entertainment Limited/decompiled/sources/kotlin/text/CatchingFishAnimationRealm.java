package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAnimationRealm extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishRoomToast CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishAnimationRealm(CatchingFishRoomToast catchingFishRoomToast, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishRoomToast;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishAnimationRealm catchingFishAnimationRealm = new CatchingFishAnimationRealm(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishAnimationRealm.CatchingFishLayout = obj;
        return catchingFishAnimationRealm;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishAnimationRealm) CatchingFishCloudMessaging((CatchingFishIntentManifest) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishIntentManifest catchingFishIntentManifest = (CatchingFishIntentManifest) this.CatchingFishLayout;
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishReduxKtor = this.CatchingFishFragmentHandler.CatchingFishReduxKtor(catchingFishIntentManifest, this);
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
