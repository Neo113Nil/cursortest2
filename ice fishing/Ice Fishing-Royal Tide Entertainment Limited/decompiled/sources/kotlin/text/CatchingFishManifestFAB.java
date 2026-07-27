package kotlin.text;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishManifestFAB extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishMVIBundle CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishKtorView CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishManifestFAB(CatchingFishKtorView catchingFishKtorView, CatchingFishMockkView catchingFishMockkView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishKtorView;
        this.CatchingFishCloudMessaging = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishManifestFAB catchingFishManifestFAB = new CatchingFishManifestFAB(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
        catchingFishManifestFAB.CatchingFishLayout = obj;
        return catchingFishManifestFAB;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishManifestFAB) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return obj;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishToastLayout catchingFishToastLayout = (CatchingFishToastLayout) this.CatchingFishLayout;
        CatchingFishCustomViewAdMob CatchingFishCoroutine = CatchingFishRobolectricHilt.CatchingFishCoroutine();
        CatchingFishKtorView catchingFishKtorView = this.CatchingFishFragmentHandler;
        CatchingFishOkHttpDataStore catchingFishOkHttpDataStore = new CatchingFishOkHttpDataStore(this.CatchingFishCloudMessaging, CatchingFishCoroutine, catchingFishKtorView.CatchingFishCloudMessaging.CatchingFishLayout(), catchingFishToastLayout.CatchingFishParcelableFAB());
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishKtorView.CatchingFishAnimationMockk;
        Object CatchingFish = ((CatchingFishPicassoCameraX) catchingFishFluxFluxBundle.CatchingFishWorkManager).CatchingFish(catchingFishOkHttpDataStore);
        if (CatchingFish instanceof CatchingFishStateFlowOkHttp) {
            CatchingFishStateFlowOkHttp catchingFishStateFlowOkHttp = (CatchingFishStateFlowOkHttp) CatchingFish;
            if (catchingFishStateFlowOkHttp == null) {
                catchingFishStateFlowOkHttp = null;
            }
            Throwable th = catchingFishStateFlowOkHttp != null ? catchingFishStateFlowOkHttp.CatchingFishParcelableFAB : null;
            if (th == null) {
                throw new CatchingFishRealmStripeAPI("Channel was closed normally");
            }
            throw th;
        }
        if (CatchingFish instanceof CatchingFishLiveDataGson) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((CatchingFishServiceHilt) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishDaggerWebsocket).getAndIncrement() == 0) {
            CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat((CatchingFishToastLayout) catchingFishFluxFluxBundle.CatchingFishReduxKtor, null, new CatchingFishLayoutHilt(catchingFishFluxFluxBundle, null), 3);
        }
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishNavigationGson = CatchingFishCoroutine.CatchingFishNavigationGson(this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        return CatchingFishNavigationGson == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : CatchingFishNavigationGson;
    }
}
