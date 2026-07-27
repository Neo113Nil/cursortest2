package android.content.Context;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterChipGroupDragonElite7468 {
    public static final Pattern FrostHunterServiceEliteCelestialThunder1757 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterChipGroupDragonElite7468(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !FrostHunterServiceEliteCelestialThunder1757.matcher(substring).matches()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = substring;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterChipGroupDragonElite7468)) {
            return false;
        }
        FrostHunterChipGroupDragonElite7468 frostHunterChipGroupDragonElite7468 = (FrostHunterChipGroupDragonElite7468) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterChipGroupDragonElite7468.FrostHunterAlphaAnimationNeoCosmos5761) && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterChipGroupDragonElite7468.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterAlphaAnimationNeoCosmos5761});
    }
}
