package android.content.Context;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimationVortexHyperBeta8509 {
    public static final FrostHunterAnimationVortexHyperBeta8509 FrostHunterServiceEliteCelestialThunder1757;
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterDialogVortexMega8716 FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        FrostHunterAnimationVortexHyperBeta8509 frostHunterAnimationVortexHyperBeta8509;
        if (Build.VERSION.SDK_INT >= 33) {
            FrostHunterObjectDetectionTitaniumHyperion7464 frostHunterObjectDetectionTitaniumHyperion7464 = new FrostHunterObjectDetectionTitaniumHyperion7464(4);
            for (int i = 1; i <= 10; i++) {
                frostHunterObjectDetectionTitaniumHyperion7464.FrostHunterConstraintSetCloneMasterUltraRogue2633(Integer.valueOf(FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceConnectionTurboPhoenixOmega6719(i)));
            }
            frostHunterAnimationVortexHyperBeta8509 = new FrostHunterAnimationVortexHyperBeta8509(2, frostHunterObjectDetectionTitaniumHyperion7464.FrostHunterRemoteConfigSpeedSpeed8566());
        } else {
            frostHunterAnimationVortexHyperBeta8509 = new FrostHunterAnimationVortexHyperBeta8509(2, 10);
        }
        FrostHunterServiceEliteCelestialThunder1757 = frostHunterAnimationVortexHyperBeta8509;
    }

    public FrostHunterAnimationVortexHyperBeta8509(int i, Set set) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        FrostHunterDialogVortexMega8716 FrostHunterKeyframeGammaGamma1197 = FrostHunterDialogVortexMega8716.FrostHunterKeyframeGammaGamma1197(set);
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterKeyframeGammaGamma1197;
        FrostHunterMaterialButtonShadowStrikeOlympian8282 it = FrostHunterKeyframeGammaGamma1197.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterAnimationVortexHyperBeta8509)) {
            return false;
        }
        FrostHunterAnimationVortexHyperBeta8509 frostHunterAnimationVortexHyperBeta8509 = (FrostHunterAnimationVortexHyperBeta8509) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterAnimationVortexHyperBeta8509.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterAnimationVortexHyperBeta8509.FrostHunterConstraintSetCloneMasterUltraRogue2633 && Objects.equals(this.FrostHunterBundlePulseFusionHero2475, frostHunterAnimationVortexHyperBeta8509.FrostHunterBundlePulseFusionHero2475);
    }

    public final int hashCode() {
        int i = ((this.FrostHunterAlphaAnimationNeoCosmos5761 * 31) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 31;
        FrostHunterDialogVortexMega8716 frostHunterDialogVortexMega8716 = this.FrostHunterBundlePulseFusionHero2475;
        return i + (frostHunterDialogVortexMega8716 == null ? 0 : frostHunterDialogVortexMega8716.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", maxChannelCount=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", channelMasks=" + this.FrostHunterBundlePulseFusionHero2475 + "]";
    }

    public FrostHunterAnimationVortexHyperBeta8509(int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = null;
    }
}
