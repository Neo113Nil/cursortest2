package android.content.Context;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedPreferencesRoguePixel5539 {
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterRemoteConfigSpeedSpeed8566;
    public FrostHunterSQLiteMasterUltra9956 FrostHunterServiceEliteCelestialThunder1757;
    public final byte[] FrostHunterAlphaAnimationNeoCosmos5761 = new byte[8];
    public final ArrayDeque FrostHunterConstraintSetCloneMasterUltraRogue2633 = new ArrayDeque();
    public final FrostHunterGradlePulseOlympianTurbo1196 FrostHunterBundlePulseFusionHero2475 = new FrostHunterGradlePulseOlympianTurbo1196(1);

    public final long FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393, int i) {
        frostHunterPreviewNeoBeta3393.readFully(this.FrostHunterAlphaAnimationNeoCosmos5761, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
