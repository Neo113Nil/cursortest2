package kotlin.text;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishRoomDatabaseFAB extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishMVIBundle CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishRoomDatabaseFAB(CatchingFishMockkView catchingFishMockkView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishRoomDatabaseFAB catchingFishRoomDatabaseFAB = new CatchingFishRoomDatabaseFAB(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishRoomDatabaseFAB.CatchingFishLayout = obj;
        return catchingFishRoomDatabaseFAB;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishRoomDatabaseFAB) CatchingFishCloudMessaging((CatchingFishDaggerHiltMVI) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) this.CatchingFishLayout;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            return catchingFishDaggerHiltMVI;
        }
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI2 = new CatchingFishDaggerHiltMVI(new LinkedHashMap(((CatchingFishDaggerHiltMVI) this.CatchingFishLayout).CatchingFishParcelableFAB()), false);
        this.CatchingFishLayout = catchingFishDaggerHiltMVI2;
        this.CatchingFishViewModelFAB = 1;
        Object CatchingFishDaggerWebsocket = this.CatchingFishFragmentHandler.CatchingFishDaggerWebsocket(catchingFishDaggerHiltMVI2, this);
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        return CatchingFishDaggerWebsocket == catchingFishXMLLayoutMockk ? catchingFishXMLLayoutMockk : catchingFishDaggerHiltMVI2;
    }
}
