package android.content.Context;

import com.adjust.sdk.PurchaseVerificationHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPoseDetectionPulseOmega6352 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ PurchaseVerificationHandler FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterPoseDetectionPulseOmega6352(PurchaseVerificationHandler purchaseVerificationHandler, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        PurchaseVerificationHandler purchaseVerificationHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                purchaseVerificationHandler.sendNextPurchaseVerificationPackageI();
                break;
            default:
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}
