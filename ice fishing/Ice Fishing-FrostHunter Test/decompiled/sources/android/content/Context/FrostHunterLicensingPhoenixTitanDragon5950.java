package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLicensingPhoenixTitanDragon5950 {
    public final FrostHunterFirestoreLegendNova6138 FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterBillingClientRogueThunder4597 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final Object FrostHunterLifecycleBlazeGammaElite2889;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterLicensingPhoenixTitanDragon5950(FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova6138, FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597, int i, int i2, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirestoreLegendNova6138;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterBillingClientRogueThunder4597;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterLicensingPhoenixTitanDragon5950)) {
            return false;
        }
        FrostHunterLicensingPhoenixTitanDragon5950 frostHunterLicensingPhoenixTitanDragon5950 = (FrostHunterLicensingPhoenixTitanDragon5950) obj;
        return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingPhoenixTitanDragon5950.FrostHunterAlphaAnimationNeoCosmos5761) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterLicensingPhoenixTitanDragon5950.FrostHunterConstraintSetCloneMasterUltraRogue2633) && this.FrostHunterBundlePulseFusionHero2475 == frostHunterLicensingPhoenixTitanDragon5950.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterServiceEliteCelestialThunder1757 == frostHunterLicensingPhoenixTitanDragon5950.FrostHunterServiceEliteCelestialThunder1757 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterLifecycleBlazeGammaElite2889, frostHunterLicensingPhoenixTitanDragon5950.FrostHunterLifecycleBlazeGammaElite2889);
    }

    public final int hashCode() {
        FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova6138 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int FrostHunterBundlePulseFusionHero2475 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterBundlePulseFusionHero2475(this.FrostHunterServiceEliteCelestialThunder1757, FrostHunterKeyEventNovaXAlpha1220.FrostHunterBundlePulseFusionHero2475(this.FrostHunterBundlePulseFusionHero2475, (((frostHunterFirestoreLegendNova6138 == null ? 0 : frostHunterFirestoreLegendNova6138.hashCode()) * 31) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814) * 31, 31), 31);
        Object obj = this.FrostHunterLifecycleBlazeGammaElite2889;
        return FrostHunterBundlePulseFusionHero2475 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", fontWeight=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.FrostHunterBundlePulseFusionHero2475;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.FrostHunterLifecycleBlazeGammaElite2889);
        sb.append(')');
        return sb.toString();
    }
}
