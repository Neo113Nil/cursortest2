package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterFirestorePixelMaster2427 implements Runnable {
    public final /* synthetic */ AdjustPlayStorePurchase FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ActivityHandler FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterFirestorePixelMaster2427(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = activityHandler;
        this.FrostHunterAlertDialogAuroraDelta3200 = adjustPlayStorePurchase;
        this.FrostHunterKeyframeGammaGamma1197 = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.FrostHunterKeyframeGammaGamma1197;
        AdjustPlayStorePurchase adjustPlayStorePurchase = this.FrostHunterAlertDialogAuroraDelta3200;
        ActivityHandler activityHandler = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.lambda$verifyPlayStorePurchase$44(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                break;
            default:
                activityHandler.lambda$verifyPlayStorePurchase$45(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                break;
        }
    }
}
