package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRoomOkHttpJUnit extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishIntentManifest CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishGlideMoshi CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRoomOkHttpJUnit(CatchingFishGlideMoshi catchingFishGlideMoshi, CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishGlideMoshi;
        this.CatchingFishCloudMessaging = catchingFishIntentManifest;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishRoomOkHttpJUnit catchingFishRoomOkHttpJUnit = new CatchingFishRoomOkHttpJUnit(this.CatchingFishFragmentHandler, this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
        catchingFishRoomOkHttpJUnit.CatchingFishLayout = obj;
        return catchingFishRoomOkHttpJUnit;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishRoomOkHttpJUnit) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishToastLayout catchingFishToastLayout = (CatchingFishToastLayout) this.CatchingFishLayout;
            CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps = new CatchingFishRoomGoogleMaps();
            CatchingFishGlideMoshi catchingFishGlideMoshi = this.CatchingFishFragmentHandler;
            CatchingFishLayoutViewPager catchingFishLayoutViewPager = catchingFishGlideMoshi.CatchingFishViewModelScope;
            CatchingFishMVIHandler catchingFishMVIHandler = new CatchingFishMVIHandler(catchingFishRoomGoogleMaps, catchingFishToastLayout, catchingFishGlideMoshi, this.CatchingFishCloudMessaging);
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishCoroutine = catchingFishLayoutViewPager.CatchingFishCoroutine(catchingFishMVIHandler, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (CatchingFishCoroutine == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
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
