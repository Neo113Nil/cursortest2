package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishPayPalDagger extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishXMLLayoutRedux CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishFluxMVI CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishPayPalDagger(CatchingFishFluxMVI catchingFishFluxMVI, CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishFluxMVI;
        this.CatchingFishFragmentHandler = catchingFishXMLLayoutRedux;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishPayPalDagger(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishPayPalDagger) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishLayoutViewPager CatchingFishSnackbar = ((CatchingFishReduxEspresso) this.CatchingFishLayout.CatchingFishCoroutine.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
            this.CatchingFishViewModelFAB = 1;
            obj = CatchingFishBiometricBundle.CatchingFishRoomDatabase(CatchingFishSnackbar, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (obj == catchingFishXMLLayoutMockk) {
                return catchingFishXMLLayoutMockk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        }
        CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) obj;
        if (catchingFishDaggerHiltMVI != null) {
            CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux = this.CatchingFishFragmentHandler;
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishXMLLayoutRedux, "key");
            Object obj2 = catchingFishDaggerHiltMVI.CatchingFishParcelableFAB.get(catchingFishXMLLayoutRedux);
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                obj2 = Arrays.copyOf(bArr, bArr.length);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(obj2, "copyOf(this, size)");
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        return -1L;
    }
}
