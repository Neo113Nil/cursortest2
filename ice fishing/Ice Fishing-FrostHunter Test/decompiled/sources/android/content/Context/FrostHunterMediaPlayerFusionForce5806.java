package android.content.Context;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMediaPlayerFusionForce5806 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterDialogVisionNova2391 FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public boolean FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterAudioManagerNovaNovaXAurora2834 FrostHunterRemoteConfigSpeedSpeed8566;
    public final long[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = new long[2];
    public final ArrayList FrostHunterBundlePulseFusionHero2475 = new ArrayList(2);
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757 = new ArrayList(2);

    public FrostHunterMediaPlayerFusionForce5806(FrostHunterDialogVisionNova2391 frostHunterDialogVisionNova2391, String str) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDialogVisionNova2391;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.FrostHunterBundlePulseFusionHero2475.add(this.FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(sb.toString()));
            sb.append(".tmp");
            this.FrostHunterServiceEliteCelestialThunder1757.add(this.FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(sb.toString()));
            sb.setLength(length);
        }
    }

    public final FrostHunterCamera2PrimeShadow7167 FrostHunterAlphaAnimationNeoCosmos5761() {
        if (!this.FrostHunterLifecycleBlazeGammaElite2889 || this.FrostHunterRemoteConfigSpeedSpeed8566 != null || this.FrostHunterLevelListDrawableFusionDragonHero2232) {
            return null;
        }
        ArrayList arrayList = this.FrostHunterBundlePulseFusionHero2475;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            FrostHunterDialogVisionNova2391 frostHunterDialogVisionNova2391 = this.FrostHunterFlowMaxDragonHero5809;
            if (i >= size) {
                this.FrostHunterCameraXPixelTurboCosmos9814++;
                return new FrostHunterCamera2PrimeShadow7167(frostHunterDialogVisionNova2391, this);
            }
            if (!frostHunterDialogVisionNova2391.FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterAlertDialogAuroraDelta3200((FrostHunterCoroutineScopePrimeSpark1417) arrayList.get(i))) {
                try {
                    frostHunterDialogVisionNova2391.FrostHunterTextViewDragonStormMega4297(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
