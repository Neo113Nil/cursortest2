package kotlin.text;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class CatchingFishMVVMRealm extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishMVIBundle CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishMVVMRealm(CatchingFishMockkView catchingFishMockkView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishMVVMRealm catchingFishMVVMRealm = new CatchingFishMVVMRealm(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishMVVMRealm.CatchingFishLayout = obj;
        return catchingFishMVVMRealm;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishMVVMRealm) CatchingFishCloudMessaging((CatchingFishDaggerHiltMVI) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) this.CatchingFishLayout;
            this.CatchingFishViewModelFAB = 1;
            obj = this.CatchingFishFragmentHandler.CatchingFishDaggerWebsocket(catchingFishDaggerHiltMVI, this);
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
        CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI2 = (CatchingFishDaggerHiltMVI) obj;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishDaggerHiltMVI2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) catchingFishDaggerHiltMVI2.CatchingFishSnackbar.CatchingFishDaggerWebsocket).set(true);
        return catchingFishDaggerHiltMVI2;
    }
}
