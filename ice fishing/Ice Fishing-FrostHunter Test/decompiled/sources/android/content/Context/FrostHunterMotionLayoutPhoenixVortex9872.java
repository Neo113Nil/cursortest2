package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionLayoutPhoenixVortex9872 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterLiveDataLegendNebula5761 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterMotionLayoutPhoenixVortex9872(String str, String str2, String str3, FrostHunterLiveDataLegendNebula5761 frostHunterLiveDataLegendNebula5761, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str2;
        this.FrostHunterBundlePulseFusionHero2475 = str3;
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterLiveDataLegendNebula5761;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterMotionLayoutPhoenixVortex9872)) {
            return false;
        }
        FrostHunterMotionLayoutPhoenixVortex9872 frostHunterMotionLayoutPhoenixVortex9872 = (FrostHunterMotionLayoutPhoenixVortex9872) obj;
        String str = frostHunterMotionLayoutPhoenixVortex9872.FrostHunterAlphaAnimationNeoCosmos5761;
        String str2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = frostHunterMotionLayoutPhoenixVortex9872.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String str4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = frostHunterMotionLayoutPhoenixVortex9872.FrostHunterBundlePulseFusionHero2475;
        String str6 = this.FrostHunterBundlePulseFusionHero2475;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        FrostHunterLiveDataLegendNebula5761 frostHunterLiveDataLegendNebula5761 = frostHunterMotionLayoutPhoenixVortex9872.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLiveDataLegendNebula5761 frostHunterLiveDataLegendNebula57612 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterLiveDataLegendNebula57612 == null) {
            if (frostHunterLiveDataLegendNebula5761 != null) {
                return false;
            }
        } else if (!frostHunterLiveDataLegendNebula57612.equals(frostHunterLiveDataLegendNebula5761)) {
            return false;
        }
        int i = frostHunterMotionLayoutPhoenixVortex9872.FrostHunterLifecycleBlazeGammaElite2889;
        int i2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        return i2 == 0 ? i == 0 : FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlphaAnimationNeoCosmos5761(i2, i);
    }

    public final int hashCode() {
        String str = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.FrostHunterBundlePulseFusionHero2475;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        FrostHunterLiveDataLegendNebula5761 frostHunterLiveDataLegendNebula5761 = this.FrostHunterServiceEliteCelestialThunder1757;
        int hashCode4 = (hashCode3 ^ (frostHunterLiveDataLegendNebula5761 == null ? 0 : frostHunterLiveDataLegendNebula5761.hashCode())) * 1000003;
        int i = this.FrostHunterLifecycleBlazeGammaElite2889;
        return hashCode4 ^ (i != 0 ? FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperHyperionForce4133(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", fid=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(", refreshToken=");
        sb.append(this.FrostHunterBundlePulseFusionHero2475);
        sb.append(", authToken=");
        sb.append(this.FrostHunterServiceEliteCelestialThunder1757);
        sb.append(", responseCode=");
        int i = this.FrostHunterLifecycleBlazeGammaElite2889;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
