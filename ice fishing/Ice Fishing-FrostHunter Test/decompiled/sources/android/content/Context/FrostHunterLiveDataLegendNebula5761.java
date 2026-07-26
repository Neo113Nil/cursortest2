package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLiveDataLegendNebula5761 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLiveDataLegendNebula5761(int i, long j, String str) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
        this.FrostHunterBundlePulseFusionHero2475 = i;
    }

    public static FrostHunterActivityInfoMaxOlympian4796 FrostHunterAlphaAnimationNeoCosmos5761() {
        byte b = 0;
        FrostHunterActivityInfoMaxOlympian4796 frostHunterActivityInfoMaxOlympian4796 = new FrostHunterActivityInfoMaxOlympian4796(b, b);
        frostHunterActivityInfoMaxOlympian4796.FrostHunterKeyframeGammaGamma1197 = 0L;
        return frostHunterActivityInfoMaxOlympian4796;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterLiveDataLegendNebula5761)) {
            return false;
        }
        FrostHunterLiveDataLegendNebula5761 frostHunterLiveDataLegendNebula5761 = (FrostHunterLiveDataLegendNebula5761) obj;
        String str = frostHunterLiveDataLegendNebula5761.FrostHunterAlphaAnimationNeoCosmos5761;
        String str2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != frostHunterLiveDataLegendNebula5761.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return false;
        }
        int i = frostHunterLiveDataLegendNebula5761.FrostHunterBundlePulseFusionHero2475;
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        return i2 == 0 ? i == 0 : FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlphaAnimationNeoCosmos5761(i2, i);
    }

    public final int hashCode() {
        String str = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.FrostHunterBundlePulseFusionHero2475;
        return i ^ (i2 != 0 ? FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperHyperionForce4133(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        sb.append(", responseCode=");
        int i = this.FrostHunterBundlePulseFusionHero2475;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
