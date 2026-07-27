package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGsonViewModel extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ Object CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishIntentManifest CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishGlideMoshi CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGsonViewModel(CatchingFishGlideMoshi catchingFishGlideMoshi, CatchingFishIntentManifest catchingFishIntentManifest, Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishGlideMoshi;
        this.CatchingFishFragmentHandler = catchingFishIntentManifest;
        this.CatchingFishCloudMessaging = obj;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishGsonViewModel(this.CatchingFishLayout, this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishGsonViewModel) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.text.CatchingFishJobSchedulerMVP, kotlin.text.CatchingFishMVIBundle] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            ?? r3 = this.CatchingFishLayout.CatchingFishViewModelFAB;
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishReduxKtor = r3.CatchingFishReduxKtor(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, this);
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
