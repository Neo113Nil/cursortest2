package android.content.Context;

import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedFlowHyperionMasterTurbo3431 extends FrostHunterDelayQuantumFusionHyperion4460 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterSharedPreferencesOmegaSolar4622 FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final ArrayList FrostHunterLevelListDrawableFusionDragonHero2232;
    public final String FrostHunterLifecycleBlazeGammaElite2889;
    public final Integer FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterSharedFlowHyperionMasterTurbo3431(long j, long j2, FrostHunterSharedPreferencesOmegaSolar4622 frostHunterSharedPreferencesOmegaSolar4622, Integer num, String str, ArrayList arrayList) {
        FrostHunterFontFamilyNebulaBetaGamma8784 frostHunterFontFamilyNebulaBetaGamma8784 = FrostHunterFontFamilyNebulaBetaGamma8784.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterSharedPreferencesOmegaSolar4622;
        this.FrostHunterServiceEliteCelestialThunder1757 = num;
        this.FrostHunterLifecycleBlazeGammaElite2889 = str;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterDelayQuantumFusionHyperion4460)) {
            return false;
        }
        FrostHunterSharedFlowHyperionMasterTurbo3431 frostHunterSharedFlowHyperionMasterTurbo3431 = (FrostHunterSharedFlowHyperionMasterTurbo3431) ((FrostHunterDelayQuantumFusionHyperion4460) obj);
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 != frostHunterSharedFlowHyperionMasterTurbo3431.FrostHunterAlphaAnimationNeoCosmos5761 || this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != frostHunterSharedFlowHyperionMasterTurbo3431.FrostHunterConstraintSetCloneMasterUltraRogue2633 || !this.FrostHunterBundlePulseFusionHero2475.equals(frostHunterSharedFlowHyperionMasterTurbo3431.FrostHunterBundlePulseFusionHero2475)) {
            return false;
        }
        Integer num = frostHunterSharedFlowHyperionMasterTurbo3431.FrostHunterServiceEliteCelestialThunder1757;
        Integer num2 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = frostHunterSharedFlowHyperionMasterTurbo3431.FrostHunterLifecycleBlazeGammaElite2889;
        String str2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.FrostHunterLevelListDrawableFusionDragonHero2232.equals(frostHunterSharedFlowHyperionMasterTurbo3431.FrostHunterLevelListDrawableFusionDragonHero2232)) {
            return false;
        }
        Object obj2 = FrostHunterFontFamilyNebulaBetaGamma8784.FrostHunterCameraXPixelTurboCosmos9814;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.FrostHunterAlphaAnimationNeoCosmos5761;
        long j2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.FrostHunterBundlePulseFusionHero2475.hashCode()) * 1000003;
        Integer num = this.FrostHunterServiceEliteCelestialThunder1757;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.FrostHunterLifecycleBlazeGammaElite2889;
        return ((this.FrostHunterLevelListDrawableFusionDragonHero2232.hashCode() ^ ((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ FrostHunterFontFamilyNebulaBetaGamma8784.FrostHunterCameraXPixelTurboCosmos9814.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", requestUptimeMs=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", clientInfo=" + this.FrostHunterBundlePulseFusionHero2475 + ", logSource=" + this.FrostHunterServiceEliteCelestialThunder1757 + ", logSourceName=" + this.FrostHunterLifecycleBlazeGammaElite2889 + ", logEvents=" + this.FrostHunterLevelListDrawableFusionDragonHero2232 + ", qosTier=" + FrostHunterFontFamilyNebulaBetaGamma8784.FrostHunterCameraXPixelTurboCosmos9814 + "}";
    }
}
