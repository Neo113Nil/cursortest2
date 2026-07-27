package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.OnIsEnabledListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRetrofit implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ OnIsEnabledListener CatchingFishWorkManager;

    public /* synthetic */ CatchingFishRetrofit(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$isEnabled$9(this.CatchingFishWorkManager);
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.lambda$isEnabled$11(this.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$isEnabled$10(this.CatchingFishWorkManager);
                break;
        }
    }
}
