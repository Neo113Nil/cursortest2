package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterHandlerThreadNeoPhantom4370 implements FrostHunterFlingGestureDeltaCelestialPulse7817 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterHandlerThreadNeoPhantom4370(float f) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        if (f < 0.0f || f > 100.0f) {
            FrostHunterGradlePluginHeroBetaThunder1341.FrostHunterAlphaAnimationNeoCosmos5761("The percent should be in the range of [0, 100]");
        }
    }

    @Override // android.content.Context.FrostHunterFlingGestureDeltaCelestialPulse7817
    public final float FrostHunterAlphaAnimationNeoCosmos5761(long j, FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562) {
        return (this.FrostHunterAlphaAnimationNeoCosmos5761 / 100.0f) * FrostHunterMotionLayoutBlazePhoenix5062.FrostHunterBundlePulseFusionHero2475(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrostHunterHandlerThreadNeoPhantom4370) && Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, ((FrostHunterHandlerThreadNeoPhantom4370) obj).FrostHunterAlphaAnimationNeoCosmos5761) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return "CornerSize(size = " + this.FrostHunterAlphaAnimationNeoCosmos5761 + "%)";
    }
}
