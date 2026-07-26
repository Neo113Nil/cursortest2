package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionLayoutBlazePhoenix5062 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;

    public static final boolean FrostHunterAlphaAnimationNeoCosmos5761(long j, long j2) {
        return j == j2;
    }

    public static final float FrostHunterBundlePulseFusionHero2475(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(Float.intBitsToFloat((int) (j >> 32))) + ", " + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final boolean FrostHunterLifecycleBlazeGammaElite2889(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float FrostHunterServiceEliteCelestialThunder1757(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterMotionLayoutBlazePhoenix5062) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterMotionLayoutBlazePhoenix5062) obj).FrostHunterAlphaAnimationNeoCosmos5761;
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
