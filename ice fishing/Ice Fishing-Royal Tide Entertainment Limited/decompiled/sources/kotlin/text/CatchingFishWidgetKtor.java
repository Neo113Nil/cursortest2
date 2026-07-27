package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishWidgetKtor extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishMVVMAndroidX CatchingFishLayout;
    public /* synthetic */ Object CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishWidgetKtor(CatchingFishMVVMAndroidX catchingFishMVVMAndroidX, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishMVVMAndroidX;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishWidgetKtor catchingFishWidgetKtor = new CatchingFishWidgetKtor(this.CatchingFishLayout, catchingFishWebsocketGradle);
        catchingFishWidgetKtor.CatchingFishViewModelFAB = obj;
        return catchingFishWidgetKtor;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishWidgetKtor) CatchingFishCloudMessaging((CatchingFishMVVMAndroidX) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishMVVMAndroidX catchingFishMVVMAndroidX = (CatchingFishMVVMAndroidX) this.CatchingFishViewModelFAB;
        return Boolean.valueOf((catchingFishMVVMAndroidX instanceof CatchingFishMockkStripeAPI) && catchingFishMVVMAndroidX.CatchingFishParcelableFAB <= this.CatchingFishLayout.CatchingFishParcelableFAB);
    }
}
