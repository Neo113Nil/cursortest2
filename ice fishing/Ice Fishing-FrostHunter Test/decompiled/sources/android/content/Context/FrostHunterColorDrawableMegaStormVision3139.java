package android.content.Context;

import java.io.Serializable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorDrawableMegaStormVision3139 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public Serializable FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public boolean FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i2;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475[3 - i3];
        int i6 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterServiceEliteCelestialThunder1757[i5];
        this.FrostHunterBundlePulseFusionHero2475 = i6;
        if (i2 == 2) {
            this.FrostHunterBundlePulseFusionHero2475 = i6 / 2;
        } else if (i2 == 0) {
            this.FrostHunterBundlePulseFusionHero2475 = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterLifecycleBlazeGammaElite2889[i4 - 1] : FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterLevelListDrawableFusionDragonHero2232[i4 - 1];
            this.FrostHunterLifecycleBlazeGammaElite2889 = i9;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = (((i9 * 12) / this.FrostHunterBundlePulseFusionHero2475) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigSpeedSpeed8566[i4 - 1] : FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterCameraXPixelTurboCosmos9814[i4 - 1];
                this.FrostHunterLifecycleBlazeGammaElite2889 = i10;
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = ((i10 * 144) / this.FrostHunterBundlePulseFusionHero2475) + i7;
            } else {
                int i11 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFlowMaxDragonHero5809[i4 - 1];
                this.FrostHunterLifecycleBlazeGammaElite2889 = i11;
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = (((i3 == 1 ? 72 : 144) * i11) / this.FrostHunterBundlePulseFusionHero2475) + i7;
            }
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
