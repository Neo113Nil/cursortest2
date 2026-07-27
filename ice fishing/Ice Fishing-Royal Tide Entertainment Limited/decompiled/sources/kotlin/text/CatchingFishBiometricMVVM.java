package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBiometricMVVM extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishLayout;
    public /* synthetic */ Object CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishBiometricMVVM(CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishServiceHandler;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishBiometricMVVM catchingFishBiometricMVVM = new CatchingFishBiometricMVVM(this.CatchingFishLayout, catchingFishWebsocketGradle);
        catchingFishBiometricMVVM.CatchingFishViewModelFAB = obj;
        return catchingFishBiometricMVVM;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        CatchingFishBiometricMVVM catchingFishBiometricMVVM = (CatchingFishBiometricMVVM) CatchingFishCloudMessaging((CatchingFishDaggerHiltMVI) obj, (CatchingFishWebsocketGradle) obj2);
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        catchingFishBiometricMVVM.CatchingFishOkHttp(catchingFishRealmContext);
        return catchingFishRealmContext;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        this.CatchingFishLayout.CatchingFishFragmentHandler((CatchingFishDaggerHiltMVI) this.CatchingFishViewModelFAB);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
