package kotlin.text;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishSpannableMVI implements IRunActivityHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ boolean CatchingFishSnackbar;

    public /* synthetic */ CatchingFishSpannableMVI(int i, boolean z) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = z;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackMeasurementConsentI(this.CatchingFishSnackbar);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(this.CatchingFishSnackbar);
                break;
        }
    }
}
