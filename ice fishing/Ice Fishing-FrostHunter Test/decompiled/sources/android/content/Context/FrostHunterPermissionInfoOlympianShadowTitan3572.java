package android.content.Context;

import com.adjust.sdk.AttributionHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPermissionInfoOlympianShadowTitan3572 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ AttributionHandler FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterPermissionInfoOlympianShadowTitan3572(AttributionHandler attributionHandler, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        AttributionHandler attributionHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                attributionHandler.sendAttributionRequest();
                break;
            case 1:
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                attributionHandler.sendAttributionRequestI();
                break;
        }
    }
}
