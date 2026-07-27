package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGradleAsyncTask extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishIntentManifest CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGradleAsyncTask(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishIntentManifest;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishGradleAsyncTask catchingFishGradleAsyncTask = new CatchingFishGradleAsyncTask(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishGradleAsyncTask.CatchingFishLayout = obj;
        return catchingFishGradleAsyncTask;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishGradleAsyncTask) CatchingFishCloudMessaging(obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            Object obj2 = this.CatchingFishLayout;
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishLayout = this.CatchingFishFragmentHandler.CatchingFishLayout(obj2, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (CatchingFishLayout == catchingFishXMLLayoutMockk) {
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
