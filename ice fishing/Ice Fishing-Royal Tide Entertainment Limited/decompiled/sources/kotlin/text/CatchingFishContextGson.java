package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishContextGson extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishKtorView CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishContextGson(CatchingFishKtorView catchingFishKtorView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishKtorView;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishContextGson(this.CatchingFishLayout, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishContextGson) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r7 == r5) goto L19;
     */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishLayout;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishKtorView.CatchingFishEspressoTesting;
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishNavigationGson = ((CatchingFishCustomViewAdMob) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).CatchingFishNavigationGson(this);
            if (CatchingFishNavigationGson != catchingFishXMLLayoutMockk) {
                CatchingFishNavigationGson = catchingFishRealmContext;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                return catchingFishRealmContext;
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        CatchingFishLayoutViewPager CatchingFishWorkManager = CatchingFishBiometricBundle.CatchingFishWorkManager(catchingFishKtorView.CatchingFishViewModelFAB().CatchingFishCoroutine, -1);
        CatchingFishCameraXRedux catchingFishCameraXRedux = new CatchingFishCameraXRedux(1, catchingFishKtorView);
        this.CatchingFishViewModelFAB = 2;
        return CatchingFishWorkManager.CatchingFishCoroutine(catchingFishCameraXRedux, this) == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : catchingFishRealmContext;
    }
}
