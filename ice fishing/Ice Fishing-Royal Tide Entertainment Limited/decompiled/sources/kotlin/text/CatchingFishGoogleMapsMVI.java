package kotlin.text;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsMVI extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishAdMobRoom CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishKtorView CatchingFishEspressoTesting;
    public /* synthetic */ Object CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final /* synthetic */ Object CatchingFishOkHttp;
    public final /* synthetic */ boolean CatchingFishUnitTesting;
    public CatchingFishAdMobRoom CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGoogleMapsMVI(CatchingFishAdMobRoom catchingFishAdMobRoom, CatchingFishKtorView catchingFishKtorView, Object obj, boolean z, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishAdMobRoom;
        this.CatchingFishEspressoTesting = catchingFishKtorView;
        this.CatchingFishOkHttp = obj;
        this.CatchingFishUnitTesting = z;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishGoogleMapsMVI catchingFishGoogleMapsMVI = new CatchingFishGoogleMapsMVI(this.CatchingFishCloudMessaging, this.CatchingFishEspressoTesting, this.CatchingFishOkHttp, this.CatchingFishUnitTesting, catchingFishWebsocketGradle);
        catchingFishGoogleMapsMVI.CatchingFishFragmentHandler = obj;
        return catchingFishGoogleMapsMVI;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishGoogleMapsMVI) CatchingFishCloudMessaging((CatchingFishGraphQLHandler) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.CatchingFishSnackbar(r1, r7) == r6) goto L16;
     */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishGraphQLHandler catchingFishGraphQLHandler;
        CatchingFishAdMobRoom catchingFishAdMobRoom;
        int i = this.CatchingFishLayout;
        Object obj2 = this.CatchingFishOkHttp;
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishEspressoTesting;
        CatchingFishAdMobRoom catchingFishAdMobRoom2 = this.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishGraphQLHandler catchingFishGraphQLHandler2 = (CatchingFishGraphQLHandler) this.CatchingFishFragmentHandler;
            CatchingFishServiceJUnit CatchingFishViewModelFAB = catchingFishKtorView.CatchingFishViewModelFAB();
            this.CatchingFishFragmentHandler = catchingFishGraphQLHandler2;
            this.CatchingFishViewModelFAB = catchingFishAdMobRoom2;
            this.CatchingFishLayout = 1;
            Integer num = new Integer(((AtomicInteger) CatchingFishViewModelFAB.CatchingFishSnackbar.CatchingFishDaggerWebsocket).incrementAndGet());
            if (num != catchingFishXMLLayoutMockk) {
                catchingFishGraphQLHandler = catchingFishGraphQLHandler2;
                obj = num;
                catchingFishAdMobRoom = catchingFishAdMobRoom2;
            }
            return catchingFishXMLLayoutMockk;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            if (this.CatchingFishUnitTesting) {
                catchingFishKtorView.CatchingFishCloudMessaging.CatchingFishParcelableFlux(new CatchingFishMockkStripeAPI(obj2 != null ? obj2.hashCode() : 0, catchingFishAdMobRoom2.CatchingFishReduxKtor, obj2));
            }
            return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
        catchingFishAdMobRoom = this.CatchingFishViewModelFAB;
        catchingFishGraphQLHandler = (CatchingFishGraphQLHandler) this.CatchingFishFragmentHandler;
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        catchingFishAdMobRoom.CatchingFishReduxKtor = ((Number) obj).intValue();
        this.CatchingFishFragmentHandler = null;
        this.CatchingFishViewModelFAB = null;
        this.CatchingFishLayout = 2;
    }
}
