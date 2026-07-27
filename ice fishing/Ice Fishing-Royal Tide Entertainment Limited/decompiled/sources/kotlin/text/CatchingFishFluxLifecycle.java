package kotlin.text;

import android.widget.GridLayout;
import android.widget.Toast;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.play.PlayActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishFluxLifecycle implements Runnable {
    public final /* synthetic */ PlayActivity CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFluxLifecycle(PlayActivity playActivity, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = playActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.CatchingFishReduxKtor;
        PlayActivity playActivity = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = PlayActivity.CatchingFishMVVMAppCompat;
                playActivity.CatchingFishAnimationMockk();
                return;
            default:
                if (playActivity.CatchingFishHandler.CatchingFishReduxKtor) {
                    return;
                }
                CatchingFishRealmDaggerHilt catchingFishRealmDaggerHilt = CatchingFishPicassoMVVM.CatchingFishReduxKtor;
                if (CatchingFishPicassoMVVM.CatchingFishReduxKtor.CatchingFishReduxKtor().nextFloat() < 0.3f) {
                    CatchingFishCameraXCameraX.CatchingFishAndroidX(playActivity.CatchingFishJUnitRealm, CatchingFishHiltMVPToast.CatchingFishParcelableFAB(System.currentTimeMillis()));
                    GridLayout gridLayout = playActivity.CatchingFishJobScheduler;
                    if (gridLayout == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("gridLayout");
                        throw null;
                    }
                    gridLayout.removeAllViews();
                    playActivity.CatchingFishAnimationMockk();
                    Toast.makeText(playActivity, "Tiles shuffled!", 0).show();
                    return;
                }
                return;
        }
    }
}
