package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTranslateAnimationShadowHyper6586 implements FrostHunterWithContextVisionPixelCosmos6861 {
    public static final FrostHunterFirebaseOlympianMax4818 FrostHunterCameraXPixelTurboCosmos9814;
    public static final FrostHunterFirebaseOlympianMax4818 FrostHunterRemoteConfigSpeedSpeed8566;
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final byte[] FrostHunterLifecycleBlazeGammaElite2889;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterCamera2EpicNovaX6250 frostHunterCamera2EpicNovaX6250 = new FrostHunterCamera2EpicNovaX6250();
        frostHunterCamera2EpicNovaX6250.FrostHunterLightSensorForceFusion4241 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197("application/id3");
        FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterFirebaseOlympianMax4818(frostHunterCamera2EpicNovaX6250);
        FrostHunterCamera2EpicNovaX6250 frostHunterCamera2EpicNovaX62502 = new FrostHunterCamera2EpicNovaX6250();
        frostHunterCamera2EpicNovaX62502.FrostHunterLightSensorForceFusion4241 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197("application/x-scte35");
        FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterFirebaseOlympianMax4818(frostHunterCamera2EpicNovaX62502);
    }

    public FrostHunterTranslateAnimationShadowHyper6586(String str, String str2, long j, long j2, byte[] bArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str2;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.FrostHunterServiceEliteCelestialThunder1757 = j2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = bArr;
    }

    @Override // android.content.Context.FrostHunterWithContextVisionPixelCosmos6861
    public final FrostHunterFirebaseOlympianMax4818 FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case "urn:scte:scte35:2014:bin":
                return FrostHunterCameraXPixelTurboCosmos9814;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return FrostHunterRemoteConfigSpeedSpeed8566;
            default:
                return null;
        }
    }

    @Override // android.content.Context.FrostHunterWithContextVisionPixelCosmos6861
    public final byte[] FrostHunterBundlePulseFusionHero2475() {
        if (FrostHunterAlphaAnimationNeoCosmos5761() != null) {
            return this.FrostHunterLifecycleBlazeGammaElite2889;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FrostHunterTranslateAnimationShadowHyper6586.class != obj.getClass()) {
            return false;
        }
        FrostHunterTranslateAnimationShadowHyper6586 frostHunterTranslateAnimationShadowHyper6586 = (FrostHunterTranslateAnimationShadowHyper6586) obj;
        return this.FrostHunterBundlePulseFusionHero2475 == frostHunterTranslateAnimationShadowHyper6586.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterServiceEliteCelestialThunder1757 == frostHunterTranslateAnimationShadowHyper6586.FrostHunterServiceEliteCelestialThunder1757 && this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterTranslateAnimationShadowHyper6586.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterTranslateAnimationShadowHyper6586.FrostHunterConstraintSetCloneMasterUltraRogue2633) && Arrays.equals(this.FrostHunterLifecycleBlazeGammaElite2889, frostHunterTranslateAnimationShadowHyper6586.FrostHunterLifecycleBlazeGammaElite2889);
    }

    public final int hashCode() {
        if (this.FrostHunterLevelListDrawableFusionDragonHero2232 == 0) {
            int FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761, 527, 31), 31);
            long j = this.FrostHunterBundlePulseFusionHero2475;
            int i = (FrostHunterLifecycleBlazeGammaElite2889 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.FrostHunterServiceEliteCelestialThunder1757;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = Arrays.hashCode(this.FrostHunterLifecycleBlazeGammaElite2889) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", id=" + this.FrostHunterServiceEliteCelestialThunder1757 + ", durationMs=" + this.FrostHunterBundlePulseFusionHero2475 + ", value=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
