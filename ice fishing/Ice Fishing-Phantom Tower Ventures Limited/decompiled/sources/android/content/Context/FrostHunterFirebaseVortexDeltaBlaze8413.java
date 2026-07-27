package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirebaseVortexDeltaBlaze8413 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;

    public static long FrostHunterAlphaAnimationNeoCosmos5761(int i, long j) {
        return (Float.floatToRawIntBits((i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public static final float FrostHunterBundlePulseFusionHero2475(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, long j2) {
        return j == j2;
    }

    public static final long FrostHunterLevelListDrawableFusionDragonHero2232(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long FrostHunterLifecycleBlazeGammaElite2889(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String FrostHunterRemoteConfigSpeedSpeed8566(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(Float.intBitsToFloat((int) (j >> 32))) + ", " + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long FrostHunterServiceEliteCelestialThunder1757(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterFirebaseVortexDeltaBlaze8413) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterFirebaseVortexDeltaBlaze8413) obj).FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }
}
