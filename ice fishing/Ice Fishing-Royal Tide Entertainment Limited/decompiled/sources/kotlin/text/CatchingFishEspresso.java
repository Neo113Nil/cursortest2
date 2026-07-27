package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishEspresso implements Runnable {
    public final /* synthetic */ ActivityHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ boolean CatchingFishWorkManager;

    public /* synthetic */ CatchingFishEspresso(ActivityHandler activityHandler, boolean z, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = activityHandler;
        this.CatchingFishWorkManager = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.lambda$onActivityLifecycle$0(this.CatchingFishWorkManager);
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.lambda$trackMeasurementConsent$39(this.CatchingFishWorkManager);
                break;
            case 2:
                this.CatchingFishDaggerWebsocket.lambda$setCoppaComplianceInDelay$49(this.CatchingFishWorkManager);
                break;
            case 3:
                this.CatchingFishDaggerWebsocket.lambda$setOfflineMode$7(this.CatchingFishWorkManager);
                break;
            case 4:
                this.CatchingFishDaggerWebsocket.lambda$setOfflineMode$8(this.CatchingFishWorkManager);
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                this.CatchingFishDaggerWebsocket.lambda$setEnabled$6(this.CatchingFishWorkManager);
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                this.CatchingFishDaggerWebsocket.lambda$setPlayStoreKidsComplianceInDelay$50(this.CatchingFishWorkManager);
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                this.CatchingFishDaggerWebsocket.lambda$setEnabled$5(this.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishDaggerWebsocket.lambda$onActivityLifecycle$1(this.CatchingFishWorkManager);
                break;
        }
    }
}
