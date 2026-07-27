package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMockk implements IRunActivityHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishMockk(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.removeGlobalCallbackParametersI();
                break;
            default:
                activityHandler.removeGlobalPartnerParametersI();
                break;
        }
    }
}
