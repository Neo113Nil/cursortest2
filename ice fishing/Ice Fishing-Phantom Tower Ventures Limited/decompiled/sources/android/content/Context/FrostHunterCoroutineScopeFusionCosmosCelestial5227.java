package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterCoroutineScopeFusionCosmosCelestial5227 implements Runnable {
    public final /* synthetic */ String FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityHandler FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterCoroutineScopeFusionCosmosCelestial5227(ActivityHandler activityHandler, String str, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = activityHandler;
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        String str = this.FrostHunterAlertDialogAuroraDelta3200;
        ActivityHandler activityHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$setExternalDeviceIdInDelay$51(str);
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameter$27(str);
                break;
            default:
                activityHandler.lambda$removeGlobalCallbackParameter$25(str);
                break;
        }
    }
}
