package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRotateDrawableCosmosHyper6619 {
    public static final FrostHunterRotateDrawableCosmosHyper6619 FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterRotateDrawableCosmosHyper6619(0, new int[0], new Object[0], false);
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public Object[] FrostHunterBundlePulseFusionHero2475;
    public int[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757 = -1;

    public FrostHunterRotateDrawableCosmosHyper6619(int i, int[] iArr, Object[] objArr, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iArr;
        this.FrostHunterBundlePulseFusionHero2475 = objArr;
        this.FrostHunterLifecycleBlazeGammaElite2889 = z;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i > iArr.length) {
            int i2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Arrays.copyOf(iArr, i);
            this.FrostHunterBundlePulseFusionHero2475 = Arrays.copyOf(this.FrostHunterBundlePulseFusionHero2475, i);
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, Object obj) {
        if (!this.FrostHunterLifecycleBlazeGammaElite2889) {
            throw new UnsupportedOperationException();
        }
        FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAlphaAnimationNeoCosmos5761 + 1);
        int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        iArr[i2] = i;
        this.FrostHunterBundlePulseFusionHero2475[i2] = obj;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i2 + 1;
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int FrostHunterCameraXPixelTurboCosmos9814;
        int FrostHunterAlertDialogAuroraDelta3200;
        int FrostHunterCameraXPixelTurboCosmos98142;
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.FrostHunterAlphaAnimationNeoCosmos5761; i3++) {
            int i4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.FrostHunterBundlePulseFusionHero2475[i3]).getClass();
                    FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterWorkManagerQuantumBeta5298.FrostHunterCameraXPixelTurboCosmos9814(i5) + 8;
                } else if (i6 == 2) {
                    FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterWorkManagerQuantumBeta5298.FrostHunterLevelListDrawableFusionDragonHero2232(i5, (FrostHunterManifestEclipseGammaTitanium1788) this.FrostHunterBundlePulseFusionHero2475[i3]);
                } else if (i6 == 3) {
                    FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterWorkManagerQuantumBeta5298.FrostHunterCameraXPixelTurboCosmos9814(i5) * 2;
                    FrostHunterAlertDialogAuroraDelta3200 = ((FrostHunterRotateDrawableCosmosHyper6619) this.FrostHunterBundlePulseFusionHero2475[i3]).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(FrostHunterKaptFusionMax3663.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                    }
                    ((Integer) this.FrostHunterBundlePulseFusionHero2475[i3]).getClass();
                    FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterWorkManagerQuantumBeta5298.FrostHunterCameraXPixelTurboCosmos9814(i5) + 4;
                }
                i2 = FrostHunterCameraXPixelTurboCosmos98142 + i2;
            } else {
                long longValue = ((Long) this.FrostHunterBundlePulseFusionHero2475[i3]).longValue();
                FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterWorkManagerQuantumBeta5298.FrostHunterCameraXPixelTurboCosmos9814(i5);
                FrostHunterAlertDialogAuroraDelta3200 = FrostHunterWorkManagerQuantumBeta5298.FrostHunterAlertDialogAuroraDelta3200(longValue);
            }
            i2 = FrostHunterAlertDialogAuroraDelta3200 + FrostHunterCameraXPixelTurboCosmos9814 + i2;
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        return i2;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832) {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
            return;
        }
        frostHunterLayoutInflaterTurboHyperion3832.getClass();
        FrostHunterWorkManagerQuantumBeta5298 frostHunterWorkManagerQuantumBeta5298 = (FrostHunterWorkManagerQuantumBeta5298) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809;
        for (int i = 0; i < this.FrostHunterAlphaAnimationNeoCosmos5761; i++) {
            int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i];
            Object obj = this.FrostHunterBundlePulseFusionHero2475[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                frostHunterWorkManagerQuantumBeta5298.FrostHunterViewPhantomNeo1634(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                frostHunterWorkManagerQuantumBeta5298.FrostHunterTextViewDragonStormMega4297(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                frostHunterWorkManagerQuantumBeta5298.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(i3, (FrostHunterManifestEclipseGammaTitanium1788) obj);
            } else if (i4 == 3) {
                frostHunterWorkManagerQuantumBeta5298.FrostHunterEditTextPulseHyperion1262(i3, 3);
                ((FrostHunterRotateDrawableCosmosHyper6619) obj).FrostHunterServiceEliteCelestialThunder1757(frostHunterLayoutInflaterTurboHyperion3832);
                frostHunterWorkManagerQuantumBeta5298.FrostHunterEditTextPulseHyperion1262(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(FrostHunterKaptFusionMax3663.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                }
                frostHunterWorkManagerQuantumBeta5298.FrostHunterCameraXTurboCelestialHero5430(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FrostHunterRotateDrawableCosmosHyper6619)) {
            return false;
        }
        FrostHunterRotateDrawableCosmosHyper6619 frostHunterRotateDrawableCosmosHyper6619 = (FrostHunterRotateDrawableCosmosHyper6619) obj;
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i == frostHunterRotateDrawableCosmosHyper6619.FrostHunterAlphaAnimationNeoCosmos5761) {
            int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int[] iArr2 = frostHunterRotateDrawableCosmosHyper6619.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.FrostHunterBundlePulseFusionHero2475;
                    Object[] objArr2 = frostHunterRotateDrawableCosmosHyper6619.FrostHunterBundlePulseFusionHero2475;
                    int i3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = (527 + i) * 31;
        int[] iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.FrostHunterBundlePulseFusionHero2475;
        int i7 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
