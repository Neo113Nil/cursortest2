package android.content.Context;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAlphaAnimationTurboTitanium9413 {
    public final ColorFilter FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAlphaAnimationTurboTitanium9413(long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            FrostHunterLifecycleSpeedNovaXDragon6777.FrostHunterLifecycleBlazeGammaElite2889();
            porterDuffColorFilter = FrostHunterLifecycleSpeedNovaXDragon6777.FrostHunterServiceEliteCelestialThunder1757(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(j), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterTransitionListenerPulseVortexCosmos7949(5));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(j), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRemoteConfigThunderShadow4435(5));
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = porterDuffColorFilter;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
        this.FrostHunterBundlePulseFusionHero2475 = 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterAlphaAnimationTurboTitanium9413)) {
            return false;
        }
        FrostHunterAlphaAnimationTurboTitanium9413 frostHunterAlphaAnimationTurboTitanium9413 = (FrostHunterAlphaAnimationTurboTitanium9413) obj;
        return FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAlphaAnimationTurboTitanium9413.FrostHunterConstraintSetCloneMasterUltraRogue2633) && this.FrostHunterBundlePulseFusionHero2475 == frostHunterAlphaAnimationTurboTitanium9413.FrostHunterBundlePulseFusionHero2475;
    }

    public final int hashCode() {
        int i = FrostHunterViewModelScopeLegendAurora8732.FrostHunterCameraXPixelTurboCosmos9814;
        return Integer.hashCode(this.FrostHunterBundlePulseFusionHero2475) + (Long.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        FrostHunterKeyEventNovaXAlpha1220.FrostHunterResourcesTitanHyperVision5823(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, sb, ", blendMode=");
        sb.append((Object) FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterAnnotationProcessorSparkEclipse8710(this.FrostHunterBundlePulseFusionHero2475));
        sb.append(')');
        return sb.toString();
    }
}
