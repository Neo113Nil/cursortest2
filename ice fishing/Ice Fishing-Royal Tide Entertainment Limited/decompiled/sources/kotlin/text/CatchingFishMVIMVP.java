package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVIMVP extends CatchingFishMVIBundle implements CatchingFishJobSchedulerMVP {
    public final /* synthetic */ CatchingFishRealmParcelable CatchingFishCloudMessaging;
    public /* synthetic */ int CatchingFishFragmentHandler;
    public /* synthetic */ CatchingFishIntentManifest CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVIMVP(CatchingFishRealmParcelable catchingFishRealmParcelable, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(3, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishRealmParcelable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r0.CatchingFishLayout(kotlin.text.CatchingFishKtorBundleFAB.CatchingFishWorkManager, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (kotlin.text.CatchingFishRobolectricHilt.CatchingFishStateLiveData(Long.MAX_VALUE, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.CatchingFishLayout(kotlin.text.CatchingFishKtorBundleFAB.CatchingFishDaggerWebsocket, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.CatchingFishLayout(kotlin.text.CatchingFishKtorBundleFAB.CatchingFishReduxKtor, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (kotlin.text.CatchingFishRobolectricHilt.CatchingFishStateLiveData(0, r7) == r6) goto L32;
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
            if (this.CatchingFishFragmentHandler > 0) {
                this.CatchingFishViewModelFAB = 1;
            } else {
                this.CatchingFishLayout = catchingFishIntentManifest;
                this.CatchingFishViewModelFAB = 2;
            }
            return catchingFishXMLLayoutMockk;
        }
        if (i != 1) {
            if (i == 2) {
                catchingFishIntentManifest = this.CatchingFishLayout;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                this.CatchingFishLayout = catchingFishIntentManifest;
                this.CatchingFishViewModelFAB = 3;
            } else if (i == 3) {
                catchingFishIntentManifest = this.CatchingFishLayout;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                this.CatchingFishLayout = catchingFishIntentManifest;
                this.CatchingFishViewModelFAB = 4;
            } else if (i == 4) {
                catchingFishIntentManifest = this.CatchingFishLayout;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                this.CatchingFishLayout = null;
                this.CatchingFishViewModelFAB = 5;
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        CatchingFishMVIMVP catchingFishMVIMVP = new CatchingFishMVIMVP(this.CatchingFishCloudMessaging, (CatchingFishWebsocketGradle) obj3);
        catchingFishMVIMVP.CatchingFishLayout = (CatchingFishIntentManifest) obj;
        catchingFishMVIMVP.CatchingFishFragmentHandler = intValue;
        return catchingFishMVIMVP.CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }
}
