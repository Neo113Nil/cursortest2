package android.content.Context;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterChipGroupSpeedNeo5611 {
    public static final int FrostHunterAlphaAnimationNeoCosmos5761(ArrayList arrayList, int i, int i2) {
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(arrayList, i, i2);
        return FrostHunterServiceEliteCelestialThunder1757 >= 0 ? FrostHunterServiceEliteCelestialThunder1757 : -(FrostHunterServiceEliteCelestialThunder1757 + 1);
    }

    public static final void FrostHunterBundlePulseFusionHero2475(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void FrostHunterLifecycleBlazeGammaElite2889() {
        throw new ConcurrentModificationException();
    }

    public static final int FrostHunterServiceEliteCelestialThunder1757(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((FrostHunterLinearLayoutForceDragonHyper4990) arrayList.get(i4)).FrostHunterAlphaAnimationNeoCosmos5761;
            if (i5 < 0) {
                i5 += i2;
            }
            int FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLooperThreadBetaHyperionMax1000(i5, i);
            if (FrostHunterLooperThreadBetaHyperionMax1000 < 0) {
                i3 = i4 + 1;
            } else {
                if (FrostHunterLooperThreadBetaHyperionMax1000 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
