package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAdRevenue;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishFABStripeAPIMVP implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ AdjustAdRevenue CatchingFishWorkManager;

    public /* synthetic */ CatchingFishFABStripeAPIMVP(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$trackAdRevenue$41(this.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$trackAdRevenue$40(this.CatchingFishWorkManager);
                break;
        }
    }
}
