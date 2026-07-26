package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInputMethodManagerHyperOlympian5297 {
    public static final FrostHunterInputMethodManagerHyperOlympian5297 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterInputMethodManagerHyperOlympian5297(-3, -9223372036854775807L, -1);
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 1;
    public long FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterInputMethodManagerHyperOlympian5297(int i, long j, long j2) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.FrostHunterServiceEliteCelestialThunder1757 = j2;
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterInputMethodManagerHyperOlympian5297 frostHunterInputMethodManagerHyperOlympian5297, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (frostHunterInputMethodManagerHyperOlympian5297) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = frostHunterInputMethodManagerHyperOlympian5297.FrostHunterBundlePulseFusionHero2475 + j;
                frostHunterInputMethodManagerHyperOlympian5297.FrostHunterBundlePulseFusionHero2475 = j3;
                long j4 = frostHunterInputMethodManagerHyperOlympian5297.FrostHunterServiceEliteCelestialThunder1757 + j2;
                frostHunterInputMethodManagerHyperOlympian5297.FrostHunterServiceEliteCelestialThunder1757 = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized long FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterBundlePulseFusionHero2475 - this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public String toString() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case 1:
                return "WindowCounter(streamId=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", total=" + this.FrostHunterBundlePulseFusionHero2475 + ", acknowledged=" + this.FrostHunterServiceEliteCelestialThunder1757 + ", unacknowledged=" + FrostHunterAlphaAnimationNeoCosmos5761() + ')';
            default:
                return super.toString();
        }
    }

    public FrostHunterInputMethodManagerHyperOlympian5297(int i) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
    }
}
