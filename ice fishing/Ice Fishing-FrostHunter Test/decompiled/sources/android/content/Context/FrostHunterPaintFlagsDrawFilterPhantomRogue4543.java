package android.content.Context;

import java.math.RoundingMode;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintFlagsDrawFilterPhantomRogue4543 {
    public long FrostHunterAlphaAnimationNeoCosmos5761;
    public long FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final ThreadLocal FrostHunterServiceEliteCelestialThunder1757 = new ThreadLocal();

    public FrostHunterPaintFlagsDrawFilterPhantomRogue4543(long j) {
        FrostHunterLifecycleBlazeGammaElite2889(j);
    }

    public final synchronized long FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != -9223372036854775807L)) {
                    long j3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (j3 == 9223372036854775806L) {
                        Long l = (Long) this.FrostHunterServiceEliteCelestialThunder1757.get();
                        l.getClass();
                        j3 = l.longValue();
                    }
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j3 - j;
                    notifyAll();
                }
                this.FrostHunterBundlePulseFusionHero2475 = j;
                j2 = j + this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long FrostHunterBundlePulseFusionHero2475(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.FrostHunterBundlePulseFusionHero2475;
            if (j2 != -9223372036854775807L) {
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                long FrostHunterTranslateAnimationCyberSolarUltra7101 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = FrostHunterTranslateAnimationCyberSolarUltra7101 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= FrostHunterTranslateAnimationCyberSolarUltra7101 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            return FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.FrostHunterBundlePulseFusionHero2475;
            if (j2 != -9223372036854775807L) {
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                long FrostHunterTranslateAnimationCyberSolarUltra7101 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + FrostHunterTranslateAnimationCyberSolarUltra7101) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - FrostHunterTranslateAnimationCyberSolarUltra7101) < Math.abs(j5 - FrostHunterTranslateAnimationCyberSolarUltra7101) ? j4 : j5;
            }
            long j6 = j;
            String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            return FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void FrostHunterLifecycleBlazeGammaElite2889(long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.FrostHunterBundlePulseFusionHero2475 = -9223372036854775807L;
    }

    public final synchronized long FrostHunterServiceEliteCelestialThunder1757() {
        long j;
        j = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }
}
