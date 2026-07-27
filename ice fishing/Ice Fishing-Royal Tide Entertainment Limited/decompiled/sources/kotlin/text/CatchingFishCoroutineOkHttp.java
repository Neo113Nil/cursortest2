package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineOkHttp implements Runnable {
    public final /* synthetic */ OnAttributionReadListener CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ ActivityHandler CatchingFishWorkManager;

    public /* synthetic */ CatchingFishCoroutineOkHttp(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishWorkManager = activityHandler;
        this.CatchingFishDaggerWebsocket = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdjustAttribution adjustAttribution;
        AdjustAttribution adjustAttribution2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                adjustAttribution = this.CatchingFishWorkManager.attribution;
                this.CatchingFishDaggerWebsocket.onAttributionRead(adjustAttribution);
                break;
            default:
                adjustAttribution2 = this.CatchingFishWorkManager.attribution;
                this.CatchingFishDaggerWebsocket.onAttributionRead(adjustAttribution2);
                break;
        }
    }
}
