package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAdRevenue;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterContentResolverAlphaVision9810 implements Runnable {
    public final /* synthetic */ AdjustAdRevenue FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityHandler FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterContentResolverAlphaVision9810(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = activityHandler;
        this.FrostHunterAlertDialogAuroraDelta3200 = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        AdjustAdRevenue adjustAdRevenue = this.FrostHunterAlertDialogAuroraDelta3200;
        ActivityHandler activityHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$trackAdRevenue$41(adjustAdRevenue);
                break;
            default:
                activityHandler.lambda$trackAdRevenue$40(adjustAdRevenue);
                break;
        }
    }
}
