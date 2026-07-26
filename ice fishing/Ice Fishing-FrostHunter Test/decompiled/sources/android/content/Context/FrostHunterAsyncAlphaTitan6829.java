package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAsyncAlphaTitan6829 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAsyncAlphaTitan6829(float f, float f2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
    }

    public final float[] FrostHunterAlphaAnimationNeoCosmos5761() {
        float f = this.FrostHunterAlphaAnimationNeoCosmos5761;
        float f2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterAsyncAlphaTitan6829)) {
            return false;
        }
        FrostHunterAsyncAlphaTitan6829 frostHunterAsyncAlphaTitan6829 = (FrostHunterAsyncAlphaTitan6829) obj;
        return Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterAsyncAlphaTitan6829.FrostHunterAlphaAnimationNeoCosmos5761) == 0 && Float.compare(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAsyncAlphaTitan6829.FrostHunterConstraintSetCloneMasterUltraRogue2633) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", y=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ')';
    }
}
