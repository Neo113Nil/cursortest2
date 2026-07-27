package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVVMReduxMVI extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishLiveDataWidget CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVVMReduxMVI(CatchingFishLiveDataWidget catchingFishLiveDataWidget, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishLiveDataWidget;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishMVVMReduxMVI(this.CatchingFishLayout, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishMVVMReduxMVI) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        if (r10 == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        CatchingFishLiveDataWidget catchingFishLiveDataWidget = this.CatchingFishLayout;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            String string = catchingFishLiveDataWidget.CatchingFishSnackbar.CatchingFishParcelableFAB.CatchingFishParcelableFAB.getString("url", "");
            String str = string != null ? string : "";
            if (str.length() <= 0) {
                str = null;
            }
            CatchingFishExoPlayerGlide catchingFishExoPlayerGlide = str != null ? new CatchingFishExoPlayerGlide(str) : null;
            if (catchingFishExoPlayerGlide != null) {
                CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishLiveDataWidget.CatchingFishWorkManager;
                this.CatchingFishViewModelFAB = 1;
                if (catchingFishAsyncTaskDagger.CatchingFishStateFlow(catchingFishExoPlayerGlide, this) != catchingFishXMLLayoutMockk) {
                    return catchingFishRealmContext;
                }
            } else {
                CatchingFishSensorManager catchingFishSensorManager = catchingFishLiveDataWidget.CatchingFishCoroutine;
                this.CatchingFishViewModelFAB = 2;
                obj = catchingFishSensorManager.CatchingFishViewModelFAB(this);
            }
            return catchingFishXMLLayoutMockk;
        }
        if (i == 1) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return catchingFishRealmContext;
        }
        if (i != 2) {
            if (i == 3) {
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                return catchingFishRealmContext;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return catchingFishRealmContext;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        String str2 = (String) obj;
        if (CatchingFishRoomMVVMWidget.CatchingFishSensorManager(str2)) {
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger2 = catchingFishLiveDataWidget.CatchingFishWorkManager;
            this.CatchingFishViewModelFAB = 3;
            if (catchingFishAsyncTaskDagger2.CatchingFishStateFlow(CatchingFishViewModelMVVM.CatchingFishParcelableFAB, this) == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            this.CatchingFishViewModelFAB = 4;
            if (CatchingFishLiveDataWidget.CatchingFishParcelableFAB(catchingFishLiveDataWidget, str2, this) == catchingFishXMLLayoutMockk) {
            }
        }
    }
}
