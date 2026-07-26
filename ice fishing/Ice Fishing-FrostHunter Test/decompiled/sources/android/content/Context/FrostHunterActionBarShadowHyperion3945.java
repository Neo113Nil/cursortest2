package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public interface FrostHunterActionBarShadowHyperion3945 {
    public static final FrostHunterRoomEntityBetaForce7604 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterRoomEntityBetaForce7604.FrostHunterAlphaAnimationNeoCosmos5761;

    default float FrostHunterAlphaAnimationNeoCosmos5761(float f, float f2, float f3) {
        FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
