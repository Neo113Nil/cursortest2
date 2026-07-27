package kotlin.text;

import com.adjust.sdk.AttributionHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutGson implements Runnable {
    public final /* synthetic */ AttributionHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishXMLLayoutGson(AttributionHandler attributionHandler, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.sendAttributionRequest();
                break;
            case 1:
                AttributionHandler attributionHandler = this.CatchingFishDaggerWebsocket;
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                this.CatchingFishDaggerWebsocket.sendAttributionRequestI();
                break;
        }
    }
}
