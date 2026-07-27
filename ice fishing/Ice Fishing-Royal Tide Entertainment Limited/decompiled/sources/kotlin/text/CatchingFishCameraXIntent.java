package kotlin.text;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCameraXIntent implements CatchingFishMVPViewService {
    public final /* synthetic */ ComponentActivity CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishFluxCameraX CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishCameraXIntent(CatchingFishFluxCameraX catchingFishFluxCameraX, ComponentActivity componentActivity) {
        this.CatchingFishReduxKtor = catchingFishFluxCameraX;
        this.CatchingFishDaggerWebsocket = componentActivity;
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = ComponentActivity.CatchingFishParcelableFlux;
        if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_CREATE) {
            onBackInvokedDispatcher = this.CatchingFishDaggerWebsocket.getOnBackInvokedDispatcher();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.CatchingFishReduxKtor.CatchingFishCoroutine(onBackInvokedDispatcher);
        }
    }
}
