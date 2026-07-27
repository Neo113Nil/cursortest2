package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMockkNavigation extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ Long CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishXMLLayoutRedux CatchingFishLayout;
    public /* synthetic */ Object CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMockkNavigation(CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, Long l, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishXMLLayoutRedux;
        this.CatchingFishFragmentHandler = l;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishMockkNavigation catchingFishMockkNavigation = new CatchingFishMockkNavigation(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishMockkNavigation.CatchingFishViewModelFAB = obj;
        return catchingFishMockkNavigation;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        CatchingFishMockkNavigation catchingFishMockkNavigation = (CatchingFishMockkNavigation) CatchingFishCloudMessaging((CatchingFishDaggerHiltMVI) obj, (CatchingFishWebsocketGradle) obj2);
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        catchingFishMockkNavigation.CatchingFishOkHttp(catchingFishRealmContext);
        return catchingFishRealmContext;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        ((CatchingFishDaggerHiltMVI) this.CatchingFishViewModelFAB).CatchingFishReduxKtor(this.CatchingFishLayout, this.CatchingFishFragmentHandler);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
