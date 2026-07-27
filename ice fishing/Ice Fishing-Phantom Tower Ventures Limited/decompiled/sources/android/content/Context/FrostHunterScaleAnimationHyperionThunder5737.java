package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScaleAnimationHyperionThunder5737 implements FrostHunterWithContextAlphaAuroraDelta1469 {
    public final float[] FrostHunterAlphaAnimationNeoCosmos5761;
    public final float[] FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterScaleAnimationHyperionThunder5737(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Array lengths must match and be nonzero");
            throw null;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = fArr;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = fArr2;
    }

    @Override // android.content.Context.FrostHunterWithContextAlphaAuroraDelta1469
    public final float FrostHunterAlphaAnimationNeoCosmos5761(float f) {
        return FrostHunterMagnetometerInfernoDragon1607.FrostHunterScaleAnimationStrikeSpark5059(f, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    @Override // android.content.Context.FrostHunterWithContextAlphaAuroraDelta1469
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633(float f) {
        return FrostHunterMagnetometerInfernoDragon1607.FrostHunterScaleAnimationStrikeSpark5059(f, this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FrostHunterScaleAnimationHyperionThunder5737)) {
            return false;
        }
        FrostHunterScaleAnimationHyperionThunder5737 frostHunterScaleAnimationHyperionThunder5737 = (FrostHunterScaleAnimationHyperionThunder5737) obj;
        return Arrays.equals(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterScaleAnimationHyperionThunder5737.FrostHunterAlphaAnimationNeoCosmos5761) && Arrays.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterScaleAnimationHyperionThunder5737.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (Arrays.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.FrostHunterAlphaAnimationNeoCosmos5761);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
