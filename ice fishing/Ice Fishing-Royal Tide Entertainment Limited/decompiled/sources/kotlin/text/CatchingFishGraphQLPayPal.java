package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLPayPal extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishFluxMVI CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGraphQLPayPal(CatchingFishFluxMVI catchingFishFluxMVI, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishFluxMVI;
        this.CatchingFishFragmentHandler = catchingFishServiceHandler;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishGraphQLPayPal(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishGraphQLPayPal) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishFluxMVI catchingFishFluxMVI = this.CatchingFishLayout;
        ThreadLocal threadLocal = catchingFishFluxMVI.CatchingFishSnackbar;
        int i = this.CatchingFishViewModelFAB;
        try {
            if (i == 0) {
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                threadLocal.set(bool);
                CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishFluxMVI.CatchingFishCoroutine;
                CatchingFishBiometricMVVM catchingFishBiometricMVVM = new CatchingFishBiometricMVVM(this.CatchingFishFragmentHandler, null);
                this.CatchingFishViewModelFAB = 1;
                obj = catchingFishViewPagerMockk.CatchingFishParcelableFAB(new CatchingFishRoomDatabaseFAB(catchingFishBiometricMVVM, null), this);
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (obj == catchingFishXMLLayoutMockk) {
                    return catchingFishXMLLayoutMockk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            }
            return (CatchingFishDaggerHiltMVI) obj;
        } finally {
            threadLocal.set(Boolean.FALSE);
        }
    }
}
