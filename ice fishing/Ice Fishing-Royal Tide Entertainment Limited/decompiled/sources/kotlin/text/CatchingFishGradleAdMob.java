package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGradleAdMob implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ AdjustEvent CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGradleAdMob(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$trackEvent$3(this.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$trackEvent$4(this.CatchingFishWorkManager);
                break;
        }
    }
}
