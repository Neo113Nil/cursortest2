package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInstrumentationVisionHyperionPhantom8490 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;

    public static long FrostHunterAlphaAnimationNeoCosmos5761(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final float FrostHunterBundlePulseFusionHero2475(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        return "(" + FrostHunterConstraintSetCloneMasterUltraRogue2633(j) + ", " + FrostHunterBundlePulseFusionHero2475(j) + ") px/sec";
    }

    public static final long FrostHunterLifecycleBlazeGammaElite2889(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long FrostHunterServiceEliteCelestialThunder1757(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterInstrumentationVisionHyperionPhantom8490) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterInstrumentationVisionHyperionPhantom8490) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }
}
