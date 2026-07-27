package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseIntent extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishKtorView CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFirebaseIntent(CatchingFishKtorView catchingFishKtorView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishKtorView;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishFirebaseIntent(this.CatchingFishLayout, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishFirebaseIntent) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.CatchingFishLayout(r6) == r5) goto L22;
     */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishLayout;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishKtorView.CatchingFishCloudMessaging;
        int i = this.CatchingFishViewModelFAB;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        try {
            if (i == 0) {
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                if (catchingFishViewPagerMockk.CatchingFishLayout() instanceof CatchingFishCardViewMockk) {
                    return catchingFishViewPagerMockk.CatchingFishLayout();
                }
                this.CatchingFishViewModelFAB = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    return (CatchingFishMVVMAndroidX) obj;
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            }
            this.CatchingFishViewModelFAB = 2;
            obj = CatchingFishKtorView.CatchingFishWorkManager(catchingFishKtorView, false, this);
        } catch (Throwable th) {
            return new CatchingFishBiometricMoshi(th, -1);
        }
    }
}
