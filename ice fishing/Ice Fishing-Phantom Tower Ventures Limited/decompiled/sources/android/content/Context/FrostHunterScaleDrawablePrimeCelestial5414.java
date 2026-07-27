package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScaleDrawablePrimeCelestial5414 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterJobSchedulerPixelAurora5672 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final boolean[] FrostHunterLifecycleBlazeGammaElite2889;
    public final int[] FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(0);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(1);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(3);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(4);
    }

    public FrostHunterScaleDrawablePrimeCelestial5414(FrostHunterJobSchedulerPixelAurora5672 frostHunterJobSchedulerPixelAurora5672, boolean z, int[] iArr, boolean[] zArr) {
        int i = frostHunterJobSchedulerPixelAurora5672.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        boolean z2 = false;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i == iArr.length && i == zArr.length);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterJobSchedulerPixelAurora5672;
        if (z && i > 1) {
            z2 = true;
        }
        this.FrostHunterBundlePulseFusionHero2475 = z2;
        this.FrostHunterServiceEliteCelestialThunder1757 = (int[]) iArr.clone();
        this.FrostHunterLifecycleBlazeGammaElite2889 = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterScaleDrawablePrimeCelestial5414.class == obj.getClass()) {
            FrostHunterScaleDrawablePrimeCelestial5414 frostHunterScaleDrawablePrimeCelestial5414 = (FrostHunterScaleDrawablePrimeCelestial5414) obj;
            if (this.FrostHunterBundlePulseFusionHero2475 == frostHunterScaleDrawablePrimeCelestial5414.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterScaleDrawablePrimeCelestial5414.FrostHunterConstraintSetCloneMasterUltraRogue2633) && Arrays.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterScaleDrawablePrimeCelestial5414.FrostHunterServiceEliteCelestialThunder1757) && Arrays.equals(this.FrostHunterLifecycleBlazeGammaElite2889, frostHunterScaleDrawablePrimeCelestial5414.FrostHunterLifecycleBlazeGammaElite2889)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.FrostHunterLifecycleBlazeGammaElite2889) + ((Arrays.hashCode(this.FrostHunterServiceEliteCelestialThunder1757) + (((this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() * 31) + (this.FrostHunterBundlePulseFusionHero2475 ? 1 : 0)) * 31)) * 31);
    }
}
