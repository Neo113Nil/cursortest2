package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerView implements IRunActivityHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ String CatchingFishSnackbar;

    public /* synthetic */ CatchingFishViewPagerView(String str, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.removeGlobalCallbackParameterI(this.CatchingFishSnackbar);
                break;
            default:
                activityHandler.removeGlobalPartnerParameterI(this.CatchingFishSnackbar);
                break;
        }
    }
}
