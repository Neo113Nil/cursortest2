package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScaleAnimationOmegaTitan6238 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterScaleAnimationOmegaTitan6238(float f, float f2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
    }

    public final long FrostHunterAlphaAnimationNeoCosmos5761(long j, long j2, FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta96302 = FrostHunterViewLegendStormDelta9630.FrostHunterCameraXPixelTurboCosmos9814;
        float f3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterViewLegendStormDelta9630 != frostHunterViewLegendStormDelta96302) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterScaleAnimationOmegaTitan6238)) {
            return false;
        }
        FrostHunterScaleAnimationOmegaTitan6238 frostHunterScaleAnimationOmegaTitan6238 = (FrostHunterScaleAnimationOmegaTitan6238) obj;
        return Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterScaleAnimationOmegaTitan6238.FrostHunterAlphaAnimationNeoCosmos5761) == 0 && Float.compare(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterScaleAnimationOmegaTitan6238.FrostHunterConstraintSetCloneMasterUltraRogue2633) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", verticalBias=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ')';
    }
}
