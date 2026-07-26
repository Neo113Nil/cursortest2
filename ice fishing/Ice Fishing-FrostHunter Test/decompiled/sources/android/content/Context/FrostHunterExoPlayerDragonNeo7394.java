package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterExoPlayerDragonNeo7394 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ long FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterExoPlayerDragonNeo7394(Object obj, long j, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = j;
    }

    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterHandlerOlympianNebulaVision5814 frostHunterHandlerOlympianNebulaVision5814;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((FrostHunterSoundPoolThunderTurboNeo7086) ((FrostHunterCardViewHyperionAurora3829) this.FrostHunterAlertDialogAuroraDelta3200)).FrostHunterNestedScrollViewPixelPhantom8605(this.FrostHunterFlowMaxDragonHero5809);
            default:
                FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber5302 = (FrostHunterMagnetometerTitaniumCyber5302) this.FrostHunterAlertDialogAuroraDelta3200;
                long j = this.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterMagnetometerTitaniumCyber5302) {
                    try {
                        if (!frostHunterMagnetometerTitaniumCyber5302.FrostHunterLooperThreadBetaHyperionMax1000 && (frostHunterHandlerOlympianNebulaVision5814 = frostHunterMagnetometerTitaniumCyber5302.FrostHunterKeyframeGammaGamma1197) != null) {
                            int i = frostHunterMagnetometerTitaniumCyber5302.FrostHunterBitmapTurboDeltaNebula8743 ? frostHunterMagnetometerTitaniumCyber5302.FrostHunterMotionSceneAuroraMega2271 : -1;
                            frostHunterMagnetometerTitaniumCyber5302.FrostHunterMotionSceneAuroraMega2271++;
                            frostHunterMagnetometerTitaniumCyber5302.FrostHunterBitmapTurboDeltaNebula8743 = true;
                            if (i != -1) {
                                FrostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475(frostHunterMagnetometerTitaniumCyber5302, new SocketTimeoutException("sent ping but didn't receive pong within " + frostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475 + "ms (after " + (i - 1) + " successful ping/pongs)"), 2);
                            } else {
                                try {
                                    FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
                                    frostHunterBarrierStrikeDragonOlympian9836.getClass();
                                    frostHunterHandlerOlympianNebulaVision5814.FrostHunterAlphaAnimationNeoCosmos5761(9, frostHunterBarrierStrikeDragonOlympian9836);
                                } catch (IOException e) {
                                    FrostHunterMagnetometerTitaniumCyber5302.FrostHunterBundlePulseFusionHero2475(frostHunterMagnetometerTitaniumCyber5302, e, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
        }
    }
}
