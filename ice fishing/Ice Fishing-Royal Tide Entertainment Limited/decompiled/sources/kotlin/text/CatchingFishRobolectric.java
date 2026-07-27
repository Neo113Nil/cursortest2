package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishRobolectric implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishRobolectric(ActivityHandler activityHandler, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                this.CatchingFishDaggerWebsocket.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                this.CatchingFishDaggerWebsocket.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                this.CatchingFishDaggerWebsocket.lambda$sendReftagReferrer$17();
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                this.CatchingFishDaggerWebsocket.lambda$removeGlobalCallbackParameters$29();
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                this.CatchingFishDaggerWebsocket.lambda$gdprForgetMe$34();
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                this.CatchingFishDaggerWebsocket.lambda$gdprForgetMe$35();
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
