package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltOkHttp extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishRoomToast CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishIntentManifest CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHiltOkHttp(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishRoomToast catchingFishRoomToast, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishIntentManifest;
        this.CatchingFishCloudMessaging = catchingFishRoomToast;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishHiltOkHttp catchingFishHiltOkHttp = new CatchingFishHiltOkHttp(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
        catchingFishHiltOkHttp.CatchingFishLayout = obj;
        return catchingFishHiltOkHttp;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishHiltOkHttp) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return catchingFishRealmContext;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishToastLayout catchingFishToastLayout = (CatchingFishToastLayout) this.CatchingFishLayout;
        CatchingFishRoomToast catchingFishRoomToast = this.CatchingFishCloudMessaging;
        CatchingFishManifestMockk catchingFishManifestMockk = catchingFishRoomToast.CatchingFishReduxKtor;
        int i2 = catchingFishRoomToast.CatchingFishDaggerWebsocket;
        if (i2 == -3) {
            i2 = -2;
        }
        CatchingFishCoroutineToast catchingFishCoroutineToast = catchingFishRoomToast.CatchingFishWorkManager;
        CatchingFishMockkView catchingFishToolbarFragment = new CatchingFishToolbarFragment(catchingFishRoomToast, null);
        CatchingFishPicassoCameraX CatchingFishParcelableFAB = CatchingFishAdMobFAB.CatchingFishParcelableFAB(i2, catchingFishCoroutineToast, 4);
        CatchingFishManifestMockk CatchingFishJetpackCompose = CatchingFishRobolectricHilt.CatchingFishJetpackCompose(catchingFishToastLayout.CatchingFishParcelableFAB(), catchingFishManifestMockk, true);
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        if (CatchingFishJetpackCompose != catchingFishGlideGson && CatchingFishJetpackCompose.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket) == null) {
            CatchingFishJetpackCompose = CatchingFishJetpackCompose.CatchingFishAnimationMockk(catchingFishGlideGson);
        }
        CatchingFishViewPagerGradle catchingFishViewPagerGradle = new CatchingFishViewPagerGradle(CatchingFishJetpackCompose, CatchingFishParcelableFAB);
        catchingFishViewPagerGradle.CatchingFishCustomViewJUnit(CatchingFishFABManifest.CatchingFishWorkManager, catchingFishViewPagerGradle, catchingFishToolbarFragment);
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishStateLiveData = CatchingFishGsonCardView.CatchingFishStateLiveData(this.CatchingFishFragmentHandler, catchingFishViewPagerGradle, true, this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (CatchingFishStateLiveData != catchingFishXMLLayoutMockk) {
            CatchingFishStateLiveData = catchingFishRealmContext;
        }
        return CatchingFishStateLiveData == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : catchingFishRealmContext;
    }
}
