package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishFluxJUnitAdMob extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ List CatchingFishFragmentHandler;
    public /* synthetic */ Object CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFluxJUnitAdMob(List list, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = list;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishFluxJUnitAdMob catchingFishFluxJUnitAdMob = new CatchingFishFluxJUnitAdMob(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
        catchingFishFluxJUnitAdMob.CatchingFishLayout = obj;
        return catchingFishFluxJUnitAdMob;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishFluxJUnitAdMob) CatchingFishCloudMessaging((CatchingFishAdMobWebSocket) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            CatchingFishAdMobWebSocket catchingFishAdMobWebSocket = (CatchingFishAdMobWebSocket) this.CatchingFishLayout;
            this.CatchingFishViewModelFAB = 1;
            Object CatchingFishDaggerWebsocket = CatchingFishLayoutRoomFAB.CatchingFishDaggerWebsocket(this.CatchingFishFragmentHandler, catchingFishAdMobWebSocket, this);
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            if (CatchingFishDaggerWebsocket == catchingFishXMLLayoutMockk) {
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
