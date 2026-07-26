package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterAdapterSolarHeroUltra2999 implements IRunActivityHandler {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterAdapterSolarHeroUltra2999(int i, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackMeasurementConsentI(z);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(z);
                break;
        }
    }
}
