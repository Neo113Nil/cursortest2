package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRealmCoroutine extends CatchingFishMVIBundle implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishKtorView CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public Throwable CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRealmCoroutine(CatchingFishKtorView catchingFishKtorView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(1, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishKtorView;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        return new CatchingFishRealmCoroutine(this.CatchingFishFragmentHandler, (CatchingFishWebsocketGradle) obj).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r6 != r4) goto L22;
     */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        Throwable th;
        CatchingFishMVVMAndroidX catchingFishMVVMAndroidX;
        int i = this.CatchingFishLayout;
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishFragmentHandler;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        try {
        } catch (Throwable th2) {
            th = th2;
            CatchingFishServiceJUnit CatchingFishViewModelFAB = catchingFishKtorView.CatchingFishViewModelFAB();
            this.CatchingFishViewModelFAB = th;
            this.CatchingFishLayout = 2;
            obj = CatchingFishViewModelFAB.CatchingFishParcelableFAB();
        }
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            this.CatchingFishLayout = 1;
            obj = CatchingFishKtorView.CatchingFishViewModelScope(catchingFishKtorView, true, this);
            if (obj == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.CatchingFishViewModelFAB;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                catchingFishMVVMAndroidX = new CatchingFishBiometricMoshi(th, ((Number) obj).intValue());
                return new CatchingFishGsonWorkManager(catchingFishMVVMAndroidX, Boolean.TRUE);
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        catchingFishMVVMAndroidX = (CatchingFishMVVMAndroidX) obj;
        return new CatchingFishGsonWorkManager(catchingFishMVVMAndroidX, Boolean.TRUE);
    }
}
