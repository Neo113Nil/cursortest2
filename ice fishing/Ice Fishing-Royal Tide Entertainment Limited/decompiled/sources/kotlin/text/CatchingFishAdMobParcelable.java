package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAdMobParcelable extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ long CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishHiltBundle CatchingFishFragmentHandler;
    public final /* synthetic */ boolean CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishAdMobParcelable(boolean z, CatchingFishHiltBundle catchingFishHiltBundle, long j, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = z;
        this.CatchingFishFragmentHandler = catchingFishHiltBundle;
        this.CatchingFishCloudMessaging = j;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishAdMobParcelable(this.CatchingFishLayout, this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishAdMobParcelable) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            boolean z = this.CatchingFishLayout;
            CatchingFishHiltBundle catchingFishHiltBundle = this.CatchingFishFragmentHandler;
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (z) {
                CatchingFishFABBundleView catchingFishFABBundleView = catchingFishHiltBundle.CatchingFishReduxKtor;
                this.CatchingFishViewModelFAB = 2;
                obj = catchingFishFABBundleView.CatchingFishParcelableFAB(this.CatchingFishCloudMessaging, 0L, this);
            } else {
                CatchingFishFABBundleView catchingFishFABBundleView2 = catchingFishHiltBundle.CatchingFishReduxKtor;
                this.CatchingFishViewModelFAB = 1;
                obj = catchingFishFABBundleView2.CatchingFishParcelableFAB(0L, this.CatchingFishCloudMessaging, this);
            }
            return catchingFishXMLLayoutMockk;
        }
        if (i == 1) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            ((CatchingFishOkHttpRoom) obj).getClass();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            ((CatchingFishOkHttpRoom) obj).getClass();
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
