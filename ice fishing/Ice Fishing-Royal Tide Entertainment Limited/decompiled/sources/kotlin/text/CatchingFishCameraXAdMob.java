package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.play.PlayActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCameraXAdMob implements CatchingFishJUnitGlide {
    public final /* synthetic */ PlayActivity CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishCameraXAdMob(PlayActivity playActivity, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = playActivity;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        int i = this.CatchingFishReduxKtor;
        PlayActivity playActivity = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = PlayActivity.CatchingFishMVVMAppCompat;
                return CatchingFishAdMobFAB.CatchingFishGsonAppCompat(playActivity);
            default:
                int i3 = PlayActivity.CatchingFishMVVMAppCompat;
                return Boolean.valueOf(playActivity.isFinishing() || playActivity.isDestroyed());
        }
    }
}
