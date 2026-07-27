package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishWorkManagerHilt implements CatchingFishServiceHandler {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishWorkManagerHilt(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        long j;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishReduxSpannable catchingFishReduxSpannable = (CatchingFishReduxSpannable) obj;
                synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                    j = CatchingFishIntentBundle.CatchingFishDaggerWebsocket;
                    CatchingFishIntentBundle.CatchingFishDaggerWebsocket = 1 + j;
                }
                return new CatchingFishMockkAnimation(j, catchingFishReduxSpannable, (CatchingFishServiceHandler) this.CatchingFishDaggerWebsocket, (CatchingFishServiceHandler) this.CatchingFishWorkManager);
            default:
                CatchingFishWebsocketRoom catchingFishWebsocketRoom = (CatchingFishWebsocketRoom) this.CatchingFishDaggerWebsocket;
                Object obj2 = catchingFishWebsocketRoom.CatchingFishSnackbar;
                CatchingFishKtorMockk catchingFishKtorMockk = (CatchingFishKtorMockk) this.CatchingFishWorkManager;
                synchronized (obj2) {
                    ((ArrayList) catchingFishWebsocketRoom.CatchingFishCoroutine).remove(catchingFishKtorMockk);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
