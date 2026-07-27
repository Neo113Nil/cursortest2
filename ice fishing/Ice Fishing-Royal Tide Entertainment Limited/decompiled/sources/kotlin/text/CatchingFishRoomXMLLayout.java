package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRoomXMLLayout extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishKtorView CatchingFishCloudMessaging;
    public final /* synthetic */ int CatchingFishEspressoTesting;
    public /* synthetic */ boolean CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public Throwable CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRoomXMLLayout(CatchingFishKtorView catchingFishKtorView, int i, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishKtorView;
        this.CatchingFishEspressoTesting = i;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishRoomXMLLayout catchingFishRoomXMLLayout = new CatchingFishRoomXMLLayout(this.CatchingFishCloudMessaging, this.CatchingFishEspressoTesting, catchingFishWebsocketGradle);
        catchingFishRoomXMLLayout.CatchingFishFragmentHandler = ((Boolean) obj).booleanValue();
        return catchingFishRoomXMLLayout;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((CatchingFishRoomXMLLayout) CatchingFishCloudMessaging(bool, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        Throwable th;
        int i;
        CatchingFishMVVMAndroidX catchingFishMVVMAndroidX;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = this.CatchingFishLayout;
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                CatchingFishServiceJUnit CatchingFishViewModelFAB = catchingFishKtorView.CatchingFishViewModelFAB();
                this.CatchingFishViewModelFAB = th2;
                this.CatchingFishFragmentHandler = z4;
                this.CatchingFishLayout = 2;
                Integer CatchingFishParcelableFAB = CatchingFishViewModelFAB.CatchingFishParcelableFAB();
                if (CatchingFishParcelableFAB != catchingFishXMLLayoutMockk) {
                    th = th2;
                    obj = CatchingFishParcelableFAB;
                    z3 = z4;
                }
            } else {
                th = th2;
                i = this.CatchingFishEspressoTesting;
                z2 = z4;
            }
        }
        if (z4 == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            boolean z5 = this.CatchingFishFragmentHandler;
            this.CatchingFishFragmentHandler = z5;
            this.CatchingFishLayout = 1;
            obj = CatchingFishKtorView.CatchingFishViewModelScope(catchingFishKtorView, z5, this);
            z4 = z5;
            if (obj == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z6 = this.CatchingFishFragmentHandler;
                th = this.CatchingFishViewModelFAB;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                z3 = z6;
                i = ((Number) obj).intValue();
                z2 = z3;
                catchingFishMVVMAndroidX = new CatchingFishBiometricMoshi(th, i);
                z = z2;
                return new CatchingFishGsonWorkManager(catchingFishMVVMAndroidX, Boolean.valueOf(z));
            }
            boolean z7 = this.CatchingFishFragmentHandler;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            z4 = z7;
        }
        catchingFishMVVMAndroidX = (CatchingFishMVVMAndroidX) obj;
        z = z4;
        return new CatchingFishGsonWorkManager(catchingFishMVVMAndroidX, Boolean.valueOf(z));
    }
}
