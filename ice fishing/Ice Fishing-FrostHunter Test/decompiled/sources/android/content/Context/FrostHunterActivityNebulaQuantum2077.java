package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActivityNebulaQuantum2077 implements FrostHunterGeocoderHyperionTitan2118 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final long[] FrostHunterBundlePulseFusionHero2475;
    public final int[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final long[] FrostHunterLifecycleBlazeGammaElite2889;
    public final long[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterActivityNebulaQuantum2077(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iArr;
        this.FrostHunterBundlePulseFusionHero2475 = jArr;
        this.FrostHunterServiceEliteCelestialThunder1757 = jArr2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = jArr3;
        int length = iArr.length;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = length;
        if (length <= 0) {
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0L;
        } else {
            int i = length - 1;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = jArr2[i] + jArr3[i];
        }
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return true;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        long[] jArr = this.FrostHunterLifecycleBlazeGammaElite2889;
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(jArr, j, true);
        long j2 = jArr[FrostHunterServiceEliteCelestialThunder1757];
        long[] jArr2 = this.FrostHunterBundlePulseFusionHero2475;
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = new FrostHunterDelayHyperAurora1705(j2, jArr2[FrostHunterServiceEliteCelestialThunder1757]);
        if (j2 >= j || FrostHunterServiceEliteCelestialThunder1757 == this.FrostHunterAlphaAnimationNeoCosmos5761 - 1) {
            return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
        }
        int i = FrostHunterServiceEliteCelestialThunder1757 + 1;
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, new FrostHunterDelayHyperAurora1705(jArr[i], jArr2[i]));
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", sizes=" + Arrays.toString(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + ", offsets=" + Arrays.toString(this.FrostHunterBundlePulseFusionHero2475) + ", timeUs=" + Arrays.toString(this.FrostHunterLifecycleBlazeGammaElite2889) + ", durationsUs=" + Arrays.toString(this.FrostHunterServiceEliteCelestialThunder1757) + ")";
    }
}
