package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCameraViewStrikeMegaTitan3669 {
    public static final FrostHunterCameraViewStrikeMegaTitan3669 FrostHunterBundlePulseFusionHero2475 = new FrostHunterCameraViewStrikeMegaTitan3669(0.0f, new FrostHunterConstraintSetHyperionNova2613(0.0f, 0.0f));
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterConstraintSetHyperionNova2613 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterCameraViewStrikeMegaTitan3669(float f, FrostHunterConstraintSetHyperionNova2613 frostHunterConstraintSetHyperionNova2613) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterConstraintSetHyperionNova2613;
        if (Float.isNaN(f)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterCameraViewStrikeMegaTitan3669)) {
            return false;
        }
        FrostHunterCameraViewStrikeMegaTitan3669 frostHunterCameraViewStrikeMegaTitan3669 = (FrostHunterCameraViewStrikeMegaTitan3669) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterCameraViewStrikeMegaTitan3669.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterCameraViewStrikeMegaTitan3669.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return (this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode() + (Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", range=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", steps=0)";
    }
}
