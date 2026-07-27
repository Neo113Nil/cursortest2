package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterZipGammaStrike4615 {
    public static final long FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(Float.NaN, Float.NaN);
    public static final /* synthetic */ int FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;

    public static long FrostHunterAlphaAnimationNeoCosmos5761(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
