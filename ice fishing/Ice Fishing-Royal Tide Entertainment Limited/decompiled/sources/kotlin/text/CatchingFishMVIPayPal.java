package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMVIPayPal implements Runnable {
    public final /* synthetic */ CatchingFishAndroidXService CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVIPayPal(CatchingFishAndroidXService catchingFishAndroidXService, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishAndroidXService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = this.CatchingFishDaggerWebsocket.CatchingFishWorkManager;
                if (catchingFishCameraXOkHttp != null) {
                    catchingFishCameraXOkHttp.setListSelectionHidden(true);
                    catchingFishCameraXOkHttp.requestLayout();
                    break;
                }
                break;
            default:
                CatchingFishAndroidXService catchingFishAndroidXService = this.CatchingFishDaggerWebsocket;
                CatchingFishCameraXOkHttp catchingFishCameraXOkHttp2 = catchingFishAndroidXService.CatchingFishWorkManager;
                if (catchingFishCameraXOkHttp2 != null && catchingFishCameraXOkHttp2.isAttachedToWindow() && catchingFishAndroidXService.CatchingFishWorkManager.getCount() > catchingFishAndroidXService.CatchingFishWorkManager.getChildCount() && catchingFishAndroidXService.CatchingFishWorkManager.getChildCount() <= catchingFishAndroidXService.CatchingFishStateLiveData) {
                    catchingFishAndroidXService.CatchingFishMVPRobolectric.setInputMethodMode(2);
                    catchingFishAndroidXService.CatchingFishReduxKtor();
                    break;
                }
                break;
        }
    }
}
