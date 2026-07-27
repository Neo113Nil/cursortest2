package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConstraintSetHyperionNova2613 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterConstraintSetHyperionNova2613(float f, float f2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
    }

    public static boolean FrostHunterAlphaAnimationNeoCosmos5761(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterConstraintSetHyperionNova2613)) {
            return false;
        }
        float f = this.FrostHunterAlphaAnimationNeoCosmos5761;
        float f2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (f > f2) {
            FrostHunterConstraintSetHyperionNova2613 frostHunterConstraintSetHyperionNova2613 = (FrostHunterConstraintSetHyperionNova2613) obj;
            if (frostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761 > frostHunterConstraintSetHyperionNova2613.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                return true;
            }
        }
        FrostHunterConstraintSetHyperionNova2613 frostHunterConstraintSetHyperionNova26132 = (FrostHunterConstraintSetHyperionNova2613) obj;
        return f == frostHunterConstraintSetHyperionNova26132.FrostHunterAlphaAnimationNeoCosmos5761 && f2 == frostHunterConstraintSetHyperionNova26132.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final int hashCode() {
        float f = this.FrostHunterAlphaAnimationNeoCosmos5761;
        float f2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761 + ".." + this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
