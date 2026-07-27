package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpRealm extends CatchingFishMVIBundle implements CatchingFishJobSchedulerMVP {
    public final /* synthetic */ CatchingFishAsyncTaskMVVM CatchingFishCloudMessaging;
    public /* synthetic */ Object CatchingFishFragmentHandler;
    public /* synthetic */ CatchingFishIntentManifest CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishOkHttpRealm(CatchingFishAsyncTaskMVVM catchingFishAsyncTaskMVVM, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(3, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishAsyncTaskMVVM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.CatchingFishLayout(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r3) goto L15;
     */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishIntentManifest catchingFishIntentManifest;
        int i = this.CatchingFishViewModelFAB;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            catchingFishIntentManifest = this.CatchingFishLayout;
            Object obj2 = this.CatchingFishFragmentHandler;
            this.CatchingFishLayout = catchingFishIntentManifest;
            this.CatchingFishViewModelFAB = 1;
            obj = this.CatchingFishCloudMessaging.CatchingFishDaggerWebsocket(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
            catchingFishIntentManifest = this.CatchingFishLayout;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        this.CatchingFishLayout = null;
        this.CatchingFishViewModelFAB = 2;
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        CatchingFishOkHttpRealm catchingFishOkHttpRealm = new CatchingFishOkHttpRealm(this.CatchingFishCloudMessaging, (CatchingFishWebsocketGradle) obj3);
        catchingFishOkHttpRealm.CatchingFishLayout = (CatchingFishIntentManifest) obj;
        catchingFishOkHttpRealm.CatchingFishFragmentHandler = obj2;
        return catchingFishOkHttpRealm.CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }
}
