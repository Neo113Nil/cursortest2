package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishAndroidXFAB implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ String CatchingFishWorkManager;

    public /* synthetic */ CatchingFishAndroidXFAB(ActivityHandler activityHandler, String str, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$setExternalDeviceIdInDelay$51(this.CatchingFishWorkManager);
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.lambda$removeGlobalPartnerParameter$27(this.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$removeGlobalCallbackParameter$25(this.CatchingFishWorkManager);
                break;
        }
    }
}
