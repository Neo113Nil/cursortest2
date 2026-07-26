package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterDisplayMetricsElitePhoenix7396 implements IRunActivityHandler {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ AdjustThirdPartySharing FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterDisplayMetricsElitePhoenix7396(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        AdjustThirdPartySharing adjustThirdPartySharing = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
        }
    }
}
