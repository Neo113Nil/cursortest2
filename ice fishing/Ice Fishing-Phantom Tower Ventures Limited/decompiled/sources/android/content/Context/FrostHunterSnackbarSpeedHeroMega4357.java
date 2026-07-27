package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterSnackbarSpeedHeroMega4357 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterEventShadowStrike2576 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterSnackbarSpeedHeroMega4357(FrostHunterEventShadowStrike2576 frostHunterEventShadowStrike2576, Object obj, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterEventShadowStrike2576;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterEventShadowStrike2576 frostHunterEventShadowStrike2576 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (frostHunterEventShadowStrike2576.FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
                    frostHunterEventShadowStrike2576.FrostHunterLifecycleBlazeGammaElite2889(obj);
                    break;
                }
                break;
            default:
                int i2 = frostHunterEventShadowStrike2576.FrostHunterAlphaAnimationNeoCosmos5761 - 1;
                frostHunterEventShadowStrike2576.FrostHunterAlphaAnimationNeoCosmos5761 = i2;
                if (i2 == 0) {
                    frostHunterEventShadowStrike2576.FrostHunterLifecycleBlazeGammaElite2889(obj);
                    break;
                }
                break;
        }
    }
}
