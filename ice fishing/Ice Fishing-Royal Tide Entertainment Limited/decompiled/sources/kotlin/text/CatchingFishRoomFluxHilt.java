package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishRoomFluxHilt extends CatchingFishWorkManagerMVVM {
    public final /* synthetic */ int CatchingFishParcelableFAB = 1;
    public CatchingFishMockkRedux CatchingFishSnackbar;

    public /* synthetic */ CatchingFishRoomFluxHilt() {
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishCoroutine(CatchingFishMockkRedux catchingFishMockkRedux) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishSnackbar.CatchingFishCardViewRealm();
                catchingFishMockkRedux.CatchingFishParcelableFlux(this);
                break;
            default:
                CatchingFishWebSocketView catchingFishWebSocketView = (CatchingFishWebSocketView) this.CatchingFishSnackbar;
                int i = catchingFishWebSocketView.CatchingFishMutableLiveData - 1;
                catchingFishWebSocketView.CatchingFishMutableLiveData = i;
                if (i == 0) {
                    catchingFishWebSocketView.CatchingFishJobScheduler = false;
                    catchingFishWebSocketView.CatchingFishOkHttp();
                }
                catchingFishMockkRedux.CatchingFishParcelableFlux(this);
                break;
        }
    }

    @Override // kotlin.text.CatchingFishWorkManagerMVVM, kotlin.text.CatchingFishRetrofitView
    public void CatchingFishDaggerWebsocket(CatchingFishMockkRedux catchingFishMockkRedux) {
        switch (this.CatchingFishParcelableFAB) {
            case 1:
                CatchingFishWebSocketView catchingFishWebSocketView = (CatchingFishWebSocketView) this.CatchingFishSnackbar;
                if (!catchingFishWebSocketView.CatchingFishJobScheduler) {
                    catchingFishWebSocketView.CatchingFishJobScheduler();
                    catchingFishWebSocketView.CatchingFishJobScheduler = true;
                    break;
                }
                break;
        }
    }

    public CatchingFishRoomFluxHilt(CatchingFishMockkRedux catchingFishMockkRedux) {
        this.CatchingFishSnackbar = catchingFishMockkRedux;
    }
}
