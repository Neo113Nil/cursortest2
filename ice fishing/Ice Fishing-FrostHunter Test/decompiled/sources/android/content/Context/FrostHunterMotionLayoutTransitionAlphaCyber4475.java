package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterMotionLayoutTransitionAlphaCyber4475 {
    public static final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
        FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterChipSpeedTitan5326.FrostHunterScaleAnimationStrikeSpark5059("xn--");
    }

    public static int FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }
}
