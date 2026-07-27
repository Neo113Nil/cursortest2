package kotlin.text;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRoomRetrofit implements CatchingFishMVPViewService {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishRoomRetrofit(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        Window window;
        View peekDecorView;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity componentActivity = (ComponentActivity) this.CatchingFishDaggerWebsocket;
                int i = ComponentActivity.CatchingFishParcelableFlux;
                if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity componentActivity2 = (ComponentActivity) this.CatchingFishDaggerWebsocket;
                int i2 = ComponentActivity.CatchingFishParcelableFlux;
                if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_DESTROY) {
                    componentActivity2.CatchingFishDaggerWebsocket.CatchingFishSnackbar = null;
                    if (!componentActivity2.isChangingConfigurations()) {
                        componentActivity2.CatchingFishReduxKtor().CatchingFishParcelableFAB();
                    }
                    CatchingFishAndroidXRoom catchingFishAndroidXRoom = componentActivity2.CatchingFishLayout;
                    ComponentActivity componentActivity3 = catchingFishAndroidXRoom.CatchingFishViewModelScope;
                    componentActivity3.getWindow().getDecorView().removeCallbacks(catchingFishAndroidXRoom);
                    componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(catchingFishAndroidXRoom);
                    break;
                }
                break;
            default:
                CatchingFishMoshiBundle catchingFishMoshiBundle = (CatchingFishMoshiBundle) this.CatchingFishDaggerWebsocket;
                if (catchingFishToolbarLiveData != CatchingFishToolbarLiveData.ON_START) {
                    if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_STOP) {
                        catchingFishMoshiBundle.CatchingFishViewModelFAB = false;
                        break;
                    }
                } else {
                    catchingFishMoshiBundle.CatchingFishViewModelFAB = true;
                    break;
                }
                break;
        }
    }
}
