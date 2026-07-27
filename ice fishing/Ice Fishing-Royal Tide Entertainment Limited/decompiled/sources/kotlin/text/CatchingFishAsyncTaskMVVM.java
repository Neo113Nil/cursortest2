package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskMVVM extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishHandlerAndroidX CatchingFishCloudMessaging;
    public final /* synthetic */ Float CatchingFishEspressoTesting;
    public final /* synthetic */ CatchingFishLayoutViewPager CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishAsyncTaskMVVM(CatchingFishLayoutViewPager catchingFishLayoutViewPager, CatchingFishHandlerAndroidX catchingFishHandlerAndroidX, Float f, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishLayoutViewPager;
        this.CatchingFishCloudMessaging = catchingFishHandlerAndroidX;
        this.CatchingFishEspressoTesting = f;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishAsyncTaskMVVM catchingFishAsyncTaskMVVM = new CatchingFishAsyncTaskMVVM(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, this.CatchingFishEspressoTesting, catchingFishWebsocketGradle);
        catchingFishAsyncTaskMVVM.CatchingFishLayout = obj;
        return catchingFishAsyncTaskMVVM;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishAsyncTaskMVVM) CatchingFishCloudMessaging((CatchingFishKtorBundleFAB) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            int ordinal = ((CatchingFishKtorBundleFAB) this.CatchingFishLayout).ordinal();
            CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = this.CatchingFishCloudMessaging;
            if (ordinal == 0) {
                this.CatchingFishViewModelFAB = 1;
                Object CatchingFishCoroutine = this.CatchingFishFragmentHandler.CatchingFishCoroutine(catchingFishHandlerAndroidX, this);
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (CatchingFishCoroutine == catchingFishXMLLayoutMockk) {
                    return catchingFishXMLLayoutMockk;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new CatchingFishBiometricView();
                }
                CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishRobolectricHilt.CatchingFishNavigation;
                Float f = this.CatchingFishEspressoTesting;
                if (f == catchingFishFluxWorkManager) {
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, f);
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
