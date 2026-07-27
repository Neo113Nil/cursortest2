package android.content.Context;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradlePluginTitanThunderCosmos3016 implements FrostHunterGeocoderHyperionTitan2118 {
    public final FrostHunterActivityNebulaQuantum2077 FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final SparseArray FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGradlePluginTitanThunderCosmos3016(SparseArray sparseArray, long j, int i, long j2, long j3) {
        FrostHunterActivityNebulaQuantum2077 frostHunterActivityNebulaQuantum2077;
        int i2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = sparseArray;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            frostHunterActivityNebulaQuantum2077 = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                FrostHunterDiffUtilLegendHyperionHero5470 frostHunterDiffUtilLegendHyperionHero5470 = (FrostHunterDiffUtilLegendHyperionHero5470) list.get(i4);
                jArr3[i4] = frostHunterDiffUtilLegendHyperionHero5470.FrostHunterCameraXPixelTurboCosmos9814;
                jArr[i4] = frostHunterDiffUtilLegendHyperionHero5470.FrostHunterFlowMaxDragonHero5809;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            frostHunterActivityNebulaQuantum2077 = new FrostHunterActivityNebulaQuantum2077(iArr, jArr, jArr2, jArr3);
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterActivityNebulaQuantum2077;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        List list = (List) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(this.FrostHunterServiceEliteCelestialThunder1757);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        FrostHunterActivityNebulaQuantum2077 frostHunterActivityNebulaQuantum2077 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterActivityNebulaQuantum2077 != null) {
            return frostHunterActivityNebulaQuantum2077.FrostHunterLifecycleBlazeGammaElite2889(j);
        }
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = FrostHunterDelayHyperAurora1705.FrostHunterBundlePulseFusionHero2475;
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterBundlePulseFusionHero2475;
    }
}
