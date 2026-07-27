package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAuthNovaPulse2006 {
    public int[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAuthNovaPulse2006(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i == 0 ? FrostHunterChipCyberThunder9742.FrostHunterAlphaAnimationNeoCosmos5761 : new int[i];
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 1;
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (iArr.length < i2) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        iArr2[i3] = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i3 + 1;
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i, i + 1, i2, iArr, iArr);
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633--;
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        if (i >= 0 && i < this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761[i];
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889("Index must be between 0 and size");
        return 0;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(int i, int i2) {
        if (i < 0 || i >= this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterAuthNovaPulse2006) {
            FrostHunterAuthNovaPulse2006 frostHunterAuthNovaPulse2006 = (FrostHunterAuthNovaPulse2006) obj;
            int i = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i == i2) {
                int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int[] iArr2 = frostHunterAuthNovaPulse2006.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, i2);
                int i3 = FrostHunterRunnableCosmosCelestial4235.FrostHunterCameraXPixelTurboCosmos9814;
                int i4 = FrostHunterRunnableCosmosCelestial4235.FrostHunterFlowMaxDragonHero5809;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ FrostHunterAuthNovaPulse2006() {
        this(16);
    }
}
