package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishServiceOkHttp extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishKtorView CatchingFishCloudMessaging;
    public final /* synthetic */ int CatchingFishEspressoTesting;
    public /* synthetic */ boolean CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public Object CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishServiceOkHttp(CatchingFishKtorView catchingFishKtorView, int i, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishKtorView;
        this.CatchingFishEspressoTesting = i;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishServiceOkHttp catchingFishServiceOkHttp = new CatchingFishServiceOkHttp(this.CatchingFishCloudMessaging, this.CatchingFishEspressoTesting, catchingFishWebsocketGradle);
        catchingFishServiceOkHttp.CatchingFishFragmentHandler = ((Boolean) obj).booleanValue();
        return catchingFishServiceOkHttp;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((CatchingFishServiceOkHttp) CatchingFishCloudMessaging(bool, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        boolean z;
        Object obj2;
        int i;
        int i2 = this.CatchingFishLayout;
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i2 == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            z = this.CatchingFishFragmentHandler;
            this.CatchingFishFragmentHandler = z;
            this.CatchingFishLayout = 1;
            obj = catchingFishKtorView.CatchingFishFragmentHandler(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.CatchingFishViewModelFAB;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                i = ((Number) obj).intValue();
                return new CatchingFishMockkStripeAPI(obj2 != null ? obj2.hashCode() : 0, i, obj2);
            }
            z = this.CatchingFishFragmentHandler;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        if (!z) {
            obj2 = obj;
            i = this.CatchingFishEspressoTesting;
            return new CatchingFishMockkStripeAPI(obj2 != null ? obj2.hashCode() : 0, i, obj2);
        }
        CatchingFishServiceJUnit CatchingFishViewModelFAB = catchingFishKtorView.CatchingFishViewModelFAB();
        this.CatchingFishViewModelFAB = obj;
        this.CatchingFishLayout = 2;
        Integer CatchingFishParcelableFAB = CatchingFishViewModelFAB.CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB != catchingFishXMLLayoutMockk) {
            obj2 = obj;
            obj = CatchingFishParcelableFAB;
            i = ((Number) obj).intValue();
            return new CatchingFishMockkStripeAPI(obj2 != null ? obj2.hashCode() : 0, i, obj2);
        }
        return catchingFishXMLLayoutMockk;
    }
}
