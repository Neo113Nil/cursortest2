package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLightSensorStrikeSpark4316 {
    public float FrostHunterAlphaAnimationNeoCosmos5761;
    public double FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public final long FrostHunterAlphaAnimationNeoCosmos5761(float f, float f2, long j) {
        float f3 = f - this.FrostHunterAlphaAnimationNeoCosmos5761;
        double d = j / 1000.0d;
        double d2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        double d3 = f3;
        double d4 = (d2 * d3) + f2;
        double d5 = (-d2) * d;
        double d6 = (d * d4) + d3;
        double exp = Math.exp(d5) * d6;
        double exp2 = (Math.exp(d5) * d4) + (Math.exp(d5) * d6 * (-this.FrostHunterConstraintSetCloneMasterUltraRogue2633));
        return (Float.floatToRawIntBits((float) exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.FrostHunterAlphaAnimationNeoCosmos5761)) << 32);
    }
}
