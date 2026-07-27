package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStoreSubscription;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishToastCardView implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ AdjustPlayStoreSubscription CatchingFishWorkManager;

    public /* synthetic */ CatchingFishToastCardView(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$trackPlayStoreSubscription$42(this.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$trackPlayStoreSubscription$43(this.CatchingFishWorkManager);
                break;
        }
    }
}
