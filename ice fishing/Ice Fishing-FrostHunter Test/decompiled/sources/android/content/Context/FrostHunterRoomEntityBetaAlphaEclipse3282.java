package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomEntityBetaAlphaEclipse3282 extends FrostHunterInsetDrawableNebulaForcePrime4535 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final Integer FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final String FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterLinearLayoutLegendVortex2341 FrostHunterRemoteConfigSpeedSpeed8566;
    public final byte[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterRoomEntityBetaAlphaEclipse3282(long j, Integer num, long j2, byte[] bArr, String str, long j3, FrostHunterLinearLayoutLegendVortex2341 frostHunterLinearLayoutLegendVortex2341) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = num;
        this.FrostHunterBundlePulseFusionHero2475 = j2;
        this.FrostHunterServiceEliteCelestialThunder1757 = bArr;
        this.FrostHunterLifecycleBlazeGammaElite2889 = str;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = j3;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterLinearLayoutLegendVortex2341;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterInsetDrawableNebulaForcePrime4535) {
            FrostHunterInsetDrawableNebulaForcePrime4535 frostHunterInsetDrawableNebulaForcePrime4535 = (FrostHunterInsetDrawableNebulaForcePrime4535) obj;
            FrostHunterRoomEntityBetaAlphaEclipse3282 frostHunterRoomEntityBetaAlphaEclipse3282 = (FrostHunterRoomEntityBetaAlphaEclipse3282) frostHunterInsetDrawableNebulaForcePrime4535;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterAlphaAnimationNeoCosmos5761) {
                Integer num = frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                Integer num2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.FrostHunterBundlePulseFusionHero2475 == frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterBundlePulseFusionHero2475) {
                        if (Arrays.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterInsetDrawableNebulaForcePrime4535 instanceof FrostHunterRoomEntityBetaAlphaEclipse3282 ? ((FrostHunterRoomEntityBetaAlphaEclipse3282) frostHunterInsetDrawableNebulaForcePrime4535).FrostHunterServiceEliteCelestialThunder1757 : frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterServiceEliteCelestialThunder1757)) {
                            String str = frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterLifecycleBlazeGammaElite2889;
                            String str2 = this.FrostHunterLifecycleBlazeGammaElite2889;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.FrostHunterLevelListDrawableFusionDragonHero2232 == frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterLevelListDrawableFusionDragonHero2232) {
                                    FrostHunterLinearLayoutLegendVortex2341 frostHunterLinearLayoutLegendVortex2341 = frostHunterRoomEntityBetaAlphaEclipse3282.FrostHunterRemoteConfigSpeedSpeed8566;
                                    FrostHunterLinearLayoutLegendVortex2341 frostHunterLinearLayoutLegendVortex23412 = this.FrostHunterRemoteConfigSpeedSpeed8566;
                                    if (frostHunterLinearLayoutLegendVortex23412 != null ? frostHunterLinearLayoutLegendVortex23412.equals(frostHunterLinearLayoutLegendVortex2341) : frostHunterLinearLayoutLegendVortex2341 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.FrostHunterBundlePulseFusionHero2475;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.FrostHunterServiceEliteCelestialThunder1757)) * 1000003;
        String str = this.FrostHunterLifecycleBlazeGammaElite2889;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        FrostHunterLinearLayoutLegendVortex2341 frostHunterLinearLayoutLegendVortex2341 = this.FrostHunterRemoteConfigSpeedSpeed8566;
        return i2 ^ (frostHunterLinearLayoutLegendVortex2341 != null ? frostHunterLinearLayoutLegendVortex2341.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", eventCode=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", eventUptimeMs=" + this.FrostHunterBundlePulseFusionHero2475 + ", sourceExtension=" + Arrays.toString(this.FrostHunterServiceEliteCelestialThunder1757) + ", sourceExtensionJsonProto3=" + this.FrostHunterLifecycleBlazeGammaElite2889 + ", timezoneOffsetSeconds=" + this.FrostHunterLevelListDrawableFusionDragonHero2232 + ", networkConnectionInfo=" + this.FrostHunterRemoteConfigSpeedSpeed8566 + "}";
    }
}
