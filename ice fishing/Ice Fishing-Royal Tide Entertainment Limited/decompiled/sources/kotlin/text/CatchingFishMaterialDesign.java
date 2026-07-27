package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMaterialDesign implements IRunActivityHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ AdjustThirdPartySharing CatchingFishSnackbar;

    public /* synthetic */ CatchingFishMaterialDesign(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackThirdPartySharingI(this.CatchingFishSnackbar);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(this.CatchingFishSnackbar);
                break;
        }
    }
}
