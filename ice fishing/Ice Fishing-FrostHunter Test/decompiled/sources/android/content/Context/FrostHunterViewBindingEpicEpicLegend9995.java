package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewBindingEpicEpicLegend9995 {
    public static final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterViewBindingEpicEpicLegend9995(0, 0, new Object[0], null);
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterMagnetometerInfernoDragon1607 FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Object[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterViewBindingEpicEpicLegend9995(int i, int i2, Object[] objArr, FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterMagnetometerInfernoDragon1607;
        this.FrostHunterServiceEliteCelestialThunder1757 = objArr;
    }

    public static FrostHunterViewBindingEpicEpicLegend9995 FrostHunterAlertDialogAuroraDelta3200(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        if (i3 > 30) {
            return new FrostHunterViewBindingEpicEpicLegend9995(0, 0, new Object[]{obj, obj2, obj3, obj4}, frostHunterMagnetometerInfernoDragon1607);
        }
        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i3);
        int FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i2, i3);
        if (FrostHunterRemoteConfigSpeedSpeed8566 != FrostHunterRemoteConfigSpeedSpeed85662) {
            return new FrostHunterViewBindingEpicEpicLegend9995((1 << FrostHunterRemoteConfigSpeedSpeed8566) | (1 << FrostHunterRemoteConfigSpeedSpeed85662), 0, FrostHunterRemoteConfigSpeedSpeed8566 < FrostHunterRemoteConfigSpeedSpeed85662 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, frostHunterMagnetometerInfernoDragon1607);
        }
        return new FrostHunterViewBindingEpicEpicLegend9995(0, 1 << FrostHunterRemoteConfigSpeedSpeed8566, new Object[]{FrostHunterAlertDialogAuroraDelta3200(i, obj, obj2, i2, obj3, obj4, i3 + 5, frostHunterMagnetometerInfernoDragon1607)}, frostHunterMagnetometerInfernoDragon1607);
    }

    public final Object[] FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2, int i3, Object obj, Object obj2, int i4, FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        Object obj3 = this.FrostHunterServiceEliteCelestialThunder1757[i];
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200(obj3 != null ? obj3.hashCode() : 0, obj3, FrostHunterDialogFragmentTurboPhoenixDragon7627(i), i3, obj, obj2, i4 + 5, frostHunterMagnetometerInfernoDragon1607);
        int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(i2);
        int i5 = FrostHunterTextViewDragonStormMega4297 + 1;
        Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
        Object[] objArr2 = new Object[objArr.length - 1];
        FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, i, 6, objArr, objArr2);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + 2, i5, objArr, objArr2);
        objArr2[FrostHunterTextViewDragonStormMega4297 - 1] = FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterTextViewDragonStormMega4297, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterBitmapTurboDeltaNebula8743(int i, int i2, FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995) {
        Object[] objArr = frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757;
        if (objArr.length != 2 || frostHunterViewBindingEpicEpicLegend9995.FrostHunterConstraintSetCloneMasterUltraRogue2633 != 0) {
            Object[] objArr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = frostHunterViewBindingEpicEpicLegend9995;
            return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, copyOf, null);
        }
        if (this.FrostHunterServiceEliteCelestialThunder1757.length == 1) {
            frostHunterViewBindingEpicEpicLegend9995.FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            return frostHunterViewBindingEpicEpicLegend9995;
        }
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(i2);
        Object[] objArr3 = this.FrostHunterServiceEliteCelestialThunder1757;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterLevelListDrawableFusionDragonHero2232 + 2, FrostHunterLevelListDrawableFusionDragonHero2232, i, copyOf2, copyOf2);
        copyOf2[FrostHunterLevelListDrawableFusionDragonHero2232] = obj;
        copyOf2[FrostHunterLevelListDrawableFusionDragonHero2232 + 1] = obj2;
        return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761 ^ i2, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 ^ i2, copyOf2, null);
    }

    public final boolean FrostHunterBundlePulseFusionHero2475(Object obj) {
        FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, this.FrostHunterServiceEliteCelestialThunder1757.length), 2);
        int i = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
        int i3 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean FrostHunterCameraXPixelTurboCosmos9814(int i) {
        return (this.FrostHunterAlphaAnimationNeoCosmos5761 & i) != 0;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterCameraXTurboCelestialHero5430(int i, FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995, FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (objArr.length == 1 && frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757.length == 2 && frostHunterViewBindingEpicEpicLegend9995.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0) {
            frostHunterViewBindingEpicEpicLegend9995.FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            return frostHunterViewBindingEpicEpicLegend9995;
        }
        if (this.FrostHunterBundlePulseFusionHero2475 == frostHunterMagnetometerInfernoDragon1607) {
            objArr[i] = frostHunterViewBindingEpicEpicLegend9995;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = frostHunterViewBindingEpicEpicLegend9995;
        return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, copyOf, frostHunterMagnetometerInfernoDragon1607);
    }

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0) {
            return this.FrostHunterServiceEliteCelestialThunder1757.length / 2;
        }
        int bitCount = Integer.bitCount(this.FrostHunterAlphaAnimationNeoCosmos5761);
        int length = this.FrostHunterServiceEliteCelestialThunder1757.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += FrostHunterResourcesTitanHyperVision5823(i).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        return bitCount;
    }

    public final Object FrostHunterDialogFragmentTurboPhoenixDragon7627(int i) {
        return this.FrostHunterServiceEliteCelestialThunder1757[i + 1];
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(int i, int i2, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        frostHunterPagingSourceOlympianPhantom9099.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025 - 1);
        frostHunterPagingSourceOlympianPhantom9099.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterDialogFragmentTurboPhoenixDragon7627(i);
        Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (objArr.length == 2) {
            return null;
        }
        if (this.FrostHunterBundlePulseFusionHero2475 != frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814) {
            return new FrostHunterViewBindingEpicEpicLegend9995(i2 ^ this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, objArr), frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, objArr);
        this.FrostHunterAlphaAnimationNeoCosmos5761 ^= i2;
        return this;
    }

    public final boolean FrostHunterFlowMaxDragonHero5809(int i) {
        return (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 & i) != 0;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterFragmentBetaMegaVortex6025(int i, Object obj, Object obj2, int i2, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom90992;
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterFragmentBetaMegaVortex6025;
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        boolean FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566);
        FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607 = this.FrostHunterBundlePulseFusionHero2475;
        if (FrostHunterCameraXPixelTurboCosmos9814) {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232])) {
                frostHunterPagingSourceOlympianPhantom9099.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025 + 1);
                FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon16072 = frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814;
                if (frostHunterMagnetometerInfernoDragon1607 != frostHunterMagnetometerInfernoDragon16072) {
                    return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761 ^ FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 | FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterRemoteConfigSpeedSpeed8566, i, obj, obj2, i2, frostHunterMagnetometerInfernoDragon16072), frostHunterMagnetometerInfernoDragon16072);
                }
                this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterRemoteConfigSpeedSpeed8566, i, obj, obj2, i2, frostHunterMagnetometerInfernoDragon16072);
                this.FrostHunterAlphaAnimationNeoCosmos5761 ^= FrostHunterRemoteConfigSpeedSpeed8566;
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 |= FrostHunterRemoteConfigSpeedSpeed8566;
                return this;
            }
            frostHunterPagingSourceOlympianPhantom9099.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero2232);
            if (FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero2232) == obj2) {
                return this;
            }
            if (frostHunterMagnetometerInfernoDragon1607 == frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814) {
                this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232 + 1] = obj2;
                return this;
            }
            frostHunterPagingSourceOlympianPhantom9099.FrostHunterKeyframeGammaGamma1197++;
            Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[FrostHunterLevelListDrawableFusionDragonHero2232 + 1] = obj2;
            return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, copyOf, frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
        }
        if (!FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
            frostHunterPagingSourceOlympianPhantom9099.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025 + 1);
            FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon16073 = frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814;
            int FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            Object[] objArr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            if (frostHunterMagnetometerInfernoDragon1607 != frostHunterMagnetometerInfernoDragon16073) {
                return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761 | FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterAlphaAnimationNeoCosmos5761(objArr2, FrostHunterLevelListDrawableFusionDragonHero22322, obj, obj2), frostHunterMagnetometerInfernoDragon16073);
            }
            this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterAlphaAnimationNeoCosmos5761(objArr2, FrostHunterLevelListDrawableFusionDragonHero22322, obj, obj2);
            this.FrostHunterAlphaAnimationNeoCosmos5761 |= FrostHunterRemoteConfigSpeedSpeed8566;
            return this;
        }
        int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566);
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297);
        if (i2 == 30) {
            FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757.length), 2);
            int i3 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
            int i4 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
            int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                frostHunterPagingSourceOlympianPhantom9099.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterResourcesTitanHyperVision5823.FrostHunterDialogFragmentTurboPhoenixDragon7627(i3);
                if (FrostHunterResourcesTitanHyperVision5823.FrostHunterBundlePulseFusionHero2475 == frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814) {
                    FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i3 + 1] = obj2;
                    FrostHunterFragmentBetaMegaVortex6025 = FrostHunterResourcesTitanHyperVision5823;
                } else {
                    frostHunterPagingSourceOlympianPhantom9099.FrostHunterKeyframeGammaGamma1197++;
                    Object[] objArr3 = FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterViewBindingEpicEpicLegend9995(0, 0, copyOf2, frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
                }
                frostHunterPagingSourceOlympianPhantom90992 = frostHunterPagingSourceOlympianPhantom9099;
            }
            frostHunterPagingSourceOlympianPhantom9099.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025 + 1);
            FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterViewBindingEpicEpicLegend9995(0, 0, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757, 0, obj, obj2), frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
            frostHunterPagingSourceOlympianPhantom90992 = frostHunterPagingSourceOlympianPhantom9099;
        } else {
            frostHunterPagingSourceOlympianPhantom90992 = frostHunterPagingSourceOlympianPhantom9099;
            FrostHunterFragmentBetaMegaVortex6025 = FrostHunterResourcesTitanHyperVision5823.FrostHunterFragmentBetaMegaVortex6025(i, obj, obj2, i2 + 5, frostHunterPagingSourceOlympianPhantom90992);
        }
        return FrostHunterResourcesTitanHyperVision5823 == FrostHunterFragmentBetaMegaVortex6025 ? this : FrostHunterCameraXTurboCelestialHero5430(FrostHunterTextViewDragonStormMega4297, FrostHunterFragmentBetaMegaVortex6025, frostHunterPagingSourceOlympianPhantom90992.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterKeyframeGammaGamma1197(int i, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        frostHunterPagingSourceOlympianPhantom9099.FrostHunterLifecycleBlazeGammaElite2889(frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025 - 1);
        frostHunterPagingSourceOlympianPhantom9099.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterDialogFragmentTurboPhoenixDragon7627(i);
        Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (objArr.length == 2) {
            return null;
        }
        if (this.FrostHunterBundlePulseFusionHero2475 != frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814) {
            return new FrostHunterViewBindingEpicEpicLegend9995(0, 0, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, objArr), frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, objArr);
        return this;
    }

    public final int FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        return Integer.bitCount(this.FrostHunterAlphaAnimationNeoCosmos5761 & (i - 1)) * 2;
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889(FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995) {
        if (this == frostHunterViewBindingEpicEpicLegend9995) {
            return true;
        }
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterViewBindingEpicEpicLegend9995.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterViewBindingEpicEpicLegend9995.FrostHunterAlphaAnimationNeoCosmos5761) {
            int length = this.FrostHunterServiceEliteCelestialThunder1757.length;
            for (int i = 0; i < length; i++) {
                if (this.FrostHunterServiceEliteCelestialThunder1757[i] == frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterLightSensorForceFusion4241(int i, Object obj, int i2, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterLightSensorForceFusion4241;
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566)) {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232])) {
                return FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterRemoteConfigSpeedSpeed8566, frostHunterPagingSourceOlympianPhantom9099);
            }
        } else if (FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
            int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566);
            FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297);
            if (i2 == 30) {
                FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757.length), 2);
                int i3 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
                int i4 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
                int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    FrostHunterLightSensorForceFusion4241 = FrostHunterResourcesTitanHyperVision5823.FrostHunterKeyframeGammaGamma1197(i3, frostHunterPagingSourceOlympianPhantom9099);
                }
                FrostHunterLightSensorForceFusion4241 = FrostHunterResourcesTitanHyperVision5823;
                break;
            }
            FrostHunterLightSensorForceFusion4241 = FrostHunterResourcesTitanHyperVision5823.FrostHunterLightSensorForceFusion4241(i, obj, i2 + 5, frostHunterPagingSourceOlympianPhantom9099);
            return FrostHunterLintTitanVortexQuantum9911(FrostHunterResourcesTitanHyperVision5823, FrostHunterLightSensorForceFusion4241, FrostHunterTextViewDragonStormMega4297, FrostHunterRemoteConfigSpeedSpeed8566, frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
        }
        return this;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterLintTitanVortexQuantum9911(FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995, FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend99952, int i, int i2, FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon16072 = this.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterViewBindingEpicEpicLegend99952 != null) {
            return (frostHunterMagnetometerInfernoDragon16072 == frostHunterMagnetometerInfernoDragon1607 || frostHunterViewBindingEpicEpicLegend9995 != frostHunterViewBindingEpicEpicLegend99952) ? FrostHunterCameraXTurboCelestialHero5430(i, frostHunterViewBindingEpicEpicLegend99952, frostHunterMagnetometerInfernoDragon1607) : this;
        }
        Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (objArr.length == 1) {
            return null;
        }
        if (frostHunterMagnetometerInfernoDragon16072 != frostHunterMagnetometerInfernoDragon1607) {
            return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 ^ i2, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterBundlePulseFusionHero2475(i, objArr), frostHunterMagnetometerInfernoDragon1607);
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterBundlePulseFusionHero2475(i, objArr);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 ^= i2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        r14.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterBitmapTurboDeltaNebula8743(r7, r2, (android.content.Context.FrostHunterViewBindingEpicEpicLegend9995) r14.FrostHunterAlertDialogAuroraDelta3200);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterNestedScrollViewMaxEpicEpic6844 FrostHunterLooperThreadBetaHyperionMax1000(int i, int i2, Object obj, Object obj2) {
        FrostHunterNestedScrollViewMaxEpicEpic6844 FrostHunterLooperThreadBetaHyperionMax1000;
        int i3 = 1;
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        int i4 = 7;
        int i5 = 0;
        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566)) {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232])) {
                return new FrostHunterNestedScrollViewMaxEpicEpic6844(i3, i4, new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761 ^ FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 | FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterRemoteConfigSpeedSpeed8566, i, obj, obj2, i2, null), null));
            }
            if (FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero2232) != obj2) {
                Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[FrostHunterLevelListDrawableFusionDragonHero2232 + 1] = obj2;
                return new FrostHunterNestedScrollViewMaxEpicEpic6844(i5, i4, new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, copyOf, null));
            }
        } else {
            if (!FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
                return new FrostHunterNestedScrollViewMaxEpicEpic6844(i3, i4, new FrostHunterViewBindingEpicEpicLegend9995(FrostHunterRemoteConfigSpeedSpeed8566 | this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757, FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566), obj, obj2), null));
            }
            int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566);
            FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297);
            if (i2 == 30) {
                FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757.length), 2);
                int i6 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
                int i7 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
                int i8 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    if (obj2 == FrostHunterResourcesTitanHyperVision5823.FrostHunterDialogFragmentTurboPhoenixDragon7627(i6)) {
                        FrostHunterLooperThreadBetaHyperionMax1000 = null;
                    } else {
                        Object[] objArr2 = FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i6 + 1] = obj2;
                        FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterNestedScrollViewMaxEpicEpic6844(i5, i4, new FrostHunterViewBindingEpicEpicLegend9995(0, 0, copyOf2, null));
                    }
                }
                FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterNestedScrollViewMaxEpicEpic6844(i3, i4, new FrostHunterViewBindingEpicEpicLegend9995(0, 0, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757, 0, obj, obj2), null));
                break;
            }
            FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterResourcesTitanHyperVision5823.FrostHunterLooperThreadBetaHyperionMax1000(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterMotionSceneAuroraMega2271(int i, int i2, Object obj) {
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterMotionSceneAuroraMega2271;
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566)) {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232])) {
                return this;
            }
            Object[] objArr = this.FrostHunterServiceEliteCelestialThunder1757;
            if (objArr.length != 2) {
                return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761 ^ FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLevelListDrawableFusionDragonHero2232, objArr), null);
            }
        } else {
            if (!FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
                return this;
            }
            int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566);
            FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297);
            if (i2 == 30) {
                FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757.length), 2);
                int i3 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
                int i4 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
                int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757;
                    FrostHunterMotionSceneAuroraMega2271 = objArr2.length == 2 ? null : new FrostHunterViewBindingEpicEpicLegend9995(0, 0, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterConstraintSetCloneMasterUltraRogue2633(i3, objArr2), null);
                }
                FrostHunterMotionSceneAuroraMega2271 = FrostHunterResourcesTitanHyperVision5823;
                break;
            }
            FrostHunterMotionSceneAuroraMega2271 = FrostHunterResourcesTitanHyperVision5823.FrostHunterMotionSceneAuroraMega2271(i, i2 + 5, obj);
            if (FrostHunterMotionSceneAuroraMega2271 != null) {
                return FrostHunterResourcesTitanHyperVision5823 != FrostHunterMotionSceneAuroraMega2271 ? FrostHunterBitmapTurboDeltaNebula8743(FrostHunterTextViewDragonStormMega4297, FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterMotionSceneAuroraMega2271) : this;
            }
            Object[] objArr3 = this.FrostHunterServiceEliteCelestialThunder1757;
            if (objArr3.length != 1) {
                return new FrostHunterViewBindingEpicEpicLegend9995(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 ^ FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterBundlePulseFusionHero2475(FrostHunterTextViewDragonStormMega4297, objArr3), null);
            }
        }
        return null;
    }

    public final Object FrostHunterRemoteConfigSpeedSpeed8566(int i, int i2, Object obj) {
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566)) {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232])) {
                return FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero2232);
            }
            return null;
        }
        if (!FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
            return null;
        }
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566));
        if (i2 != 30) {
            return FrostHunterResourcesTitanHyperVision5823.FrostHunterRemoteConfigSpeedSpeed8566(i, i2 + 5, obj);
        }
        FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757.length), 2);
        int i3 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
        int i4 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
        int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return FrostHunterResourcesTitanHyperVision5823.FrostHunterDialogFragmentTurboPhoenixDragon7627(i3);
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823(int i) {
        Object obj = this.FrostHunterServiceEliteCelestialThunder1757[i];
        obj.getClass();
        return (FrostHunterViewBindingEpicEpicLegend9995) obj;
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterScaleAnimationStrikeSpark5059(int i, Object obj, Object obj2, int i2, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom90992;
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterScaleAnimationStrikeSpark5059;
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566)) {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566);
            return (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232]) && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj2, FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero2232))) ? FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterRemoteConfigSpeedSpeed8566, frostHunterPagingSourceOlympianPhantom9099) : this;
        }
        if (!FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
            return this;
        }
        int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566);
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297);
        if (i2 == 30) {
            FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757.length), 2);
            int i3 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
            int i4 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
            int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757[i3]) || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj2, FrostHunterResourcesTitanHyperVision5823.FrostHunterDialogFragmentTurboPhoenixDragon7627(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterResourcesTitanHyperVision5823.FrostHunterKeyframeGammaGamma1197(i3, frostHunterPagingSourceOlympianPhantom9099);
                        break;
                    }
                }
                frostHunterPagingSourceOlympianPhantom90992 = frostHunterPagingSourceOlympianPhantom9099;
            }
            FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterResourcesTitanHyperVision5823;
            frostHunterPagingSourceOlympianPhantom90992 = frostHunterPagingSourceOlympianPhantom9099;
        } else {
            frostHunterPagingSourceOlympianPhantom90992 = frostHunterPagingSourceOlympianPhantom9099;
            FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterResourcesTitanHyperVision5823.FrostHunterScaleAnimationStrikeSpark5059(i, obj, obj2, i2 + 5, frostHunterPagingSourceOlympianPhantom90992);
        }
        return FrostHunterLintTitanVortexQuantum9911(FrostHunterResourcesTitanHyperVision5823, FrostHunterScaleAnimationStrikeSpark5059, FrostHunterTextViewDragonStormMega4297, FrostHunterRemoteConfigSpeedSpeed8566, frostHunterPagingSourceOlympianPhantom90992.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995, int i, FrostHunterTimerPhoenixVisionPhoenix9610 frostHunterTimerPhoenixVisionPhoenix9610, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        Object[] objArr;
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterAlertDialogAuroraDelta3200;
        if (this == frostHunterViewBindingEpicEpicLegend9995) {
            frostHunterTimerPhoenixVisionPhoenix9610.FrostHunterAlphaAnimationNeoCosmos5761 += FrostHunterConstraintSetCloneMasterUltraRogue2633();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607 = frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814;
            int i3 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Object[] objArr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757.length);
            int length = this.FrostHunterServiceEliteCelestialThunder1757.length;
            FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757.length), 2);
            int i4 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
            int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
            int i6 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (FrostHunterBundlePulseFusionHero2475(frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757[i4])) {
                        frostHunterTimerPhoenixVisionPhoenix9610.FrostHunterAlphaAnimationNeoCosmos5761++;
                    } else {
                        Object[] objArr3 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.FrostHunterServiceEliteCelestialThunder1757.length) {
                return length == frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757.length ? frostHunterViewBindingEpicEpicLegend9995 : length == copyOf.length ? new FrostHunterViewBindingEpicEpicLegend9995(0, 0, copyOf, frostHunterMagnetometerInfernoDragon1607) : new FrostHunterViewBindingEpicEpicLegend9995(0, 0, Arrays.copyOf(copyOf, length), frostHunterMagnetometerInfernoDragon1607);
            }
        } else {
            int i7 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 | frostHunterViewBindingEpicEpicLegend9995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i8 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i9 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterAlphaAnimationNeoCosmos5761;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit)], frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757[frostHunterViewBindingEpicEpicLegend9995.FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                FrostHunterDialogMegaAuroraSpark4718.FrostHunterConstraintSetCloneMasterUltraRogue2633("Check failed.");
            }
            FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend99952 = (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterBundlePulseFusionHero2475, frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814) && this.FrostHunterAlphaAnimationNeoCosmos5761 == i12 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == i7) ? this : new FrostHunterViewBindingEpicEpicLegend9995(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = frostHunterViewBindingEpicEpicLegend99952.FrostHunterServiceEliteCelestialThunder1757;
                int length2 = (objArr4.length - 1) - i14;
                if (FrostHunterFlowMaxDragonHero5809(lowestOneBit2)) {
                    FrostHunterAlertDialogAuroraDelta3200 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297(lowestOneBit2));
                    if (frostHunterViewBindingEpicEpicLegend9995.FrostHunterFlowMaxDragonHero5809(lowestOneBit2)) {
                        FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterViewBindingEpicEpicLegend9995.FrostHunterResourcesTitanHyperVision5823(frostHunterViewBindingEpicEpicLegend9995.FrostHunterTextViewDragonStormMega4297(lowestOneBit2)), i + 5, frostHunterTimerPhoenixVisionPhoenix9610, frostHunterPagingSourceOlympianPhantom9099);
                        objArr = objArr4;
                    } else if (frostHunterViewBindingEpicEpicLegend9995.FrostHunterCameraXPixelTurboCosmos9814(lowestOneBit2)) {
                        int FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit2);
                        Object obj = frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232];
                        Object FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero2232);
                        int i15 = frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025;
                        objArr = objArr4;
                        FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200.FrostHunterFragmentBetaMegaVortex6025(obj != null ? obj.hashCode() : i2, obj, FrostHunterDialogFragmentTurboPhoenixDragon7627, i + 5, frostHunterPagingSourceOlympianPhantom9099);
                        if (frostHunterPagingSourceOlympianPhantom9099.FrostHunterFragmentBetaMegaVortex6025 == i15) {
                            frostHunterTimerPhoenixVisionPhoenix9610.FrostHunterAlphaAnimationNeoCosmos5761++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (frostHunterViewBindingEpicEpicLegend9995.FrostHunterFlowMaxDragonHero5809(lowestOneBit2)) {
                        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterResourcesTitanHyperVision5823(frostHunterViewBindingEpicEpicLegend9995.FrostHunterTextViewDragonStormMega4297(lowestOneBit2));
                        if (FrostHunterCameraXPixelTurboCosmos9814(lowestOneBit2)) {
                            int FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit2);
                            Object obj2 = this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero22322];
                            int i16 = i + 5;
                            if (FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                frostHunterTimerPhoenixVisionPhoenix9610.FrostHunterAlphaAnimationNeoCosmos5761++;
                            } else {
                                FrostHunterAlertDialogAuroraDelta3200 = FrostHunterResourcesTitanHyperVision5823.FrostHunterFragmentBetaMegaVortex6025(obj2 != null ? obj2.hashCode() : 0, obj2, FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero22322), i16, frostHunterPagingSourceOlympianPhantom9099);
                            }
                        }
                        FrostHunterAlertDialogAuroraDelta3200 = FrostHunterResourcesTitanHyperVision5823;
                    } else {
                        int FrostHunterLevelListDrawableFusionDragonHero22323 = FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit2);
                        Object obj3 = this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero22323];
                        Object FrostHunterDialogFragmentTurboPhoenixDragon76272 = FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero22323);
                        int FrostHunterLevelListDrawableFusionDragonHero22324 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit2);
                        Object obj4 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero22324];
                        FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200(obj3 != null ? obj3.hashCode() : 0, obj3, FrostHunterDialogFragmentTurboPhoenixDragon76272, obj4 != null ? obj4.hashCode() : 0, obj4, frostHunterViewBindingEpicEpicLegend9995.FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero22324), i + 5, frostHunterPagingSourceOlympianPhantom9099.FrostHunterCameraXPixelTurboCosmos9814);
                    }
                }
                objArr[length2] = FrostHunterAlertDialogAuroraDelta3200;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (frostHunterViewBindingEpicEpicLegend9995.FrostHunterCameraXPixelTurboCosmos9814(lowestOneBit3)) {
                    int FrostHunterLevelListDrawableFusionDragonHero22325 = frostHunterViewBindingEpicEpicLegend9995.FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit3);
                    Object[] objArr5 = frostHunterViewBindingEpicEpicLegend99952.FrostHunterServiceEliteCelestialThunder1757;
                    objArr5[i18] = frostHunterViewBindingEpicEpicLegend9995.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero22325];
                    objArr5[i18 + 1] = frostHunterViewBindingEpicEpicLegend9995.FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero22325);
                    if (FrostHunterCameraXPixelTurboCosmos9814(lowestOneBit3)) {
                        frostHunterTimerPhoenixVisionPhoenix9610.FrostHunterAlphaAnimationNeoCosmos5761++;
                    }
                } else {
                    int FrostHunterLevelListDrawableFusionDragonHero22326 = FrostHunterLevelListDrawableFusionDragonHero2232(lowestOneBit3);
                    Object[] objArr6 = frostHunterViewBindingEpicEpicLegend99952.FrostHunterServiceEliteCelestialThunder1757;
                    objArr6[i18] = this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero22326];
                    objArr6[i18 + 1] = FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLevelListDrawableFusionDragonHero22326);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!FrostHunterLifecycleBlazeGammaElite2889(frostHunterViewBindingEpicEpicLegend99952)) {
                return frostHunterViewBindingEpicEpicLegend9995.FrostHunterLifecycleBlazeGammaElite2889(frostHunterViewBindingEpicEpicLegend99952) ? frostHunterViewBindingEpicEpicLegend9995 : frostHunterViewBindingEpicEpicLegend99952;
            }
        }
        return this;
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757(int i, int i2, Object obj) {
        int FrostHunterRemoteConfigSpeedSpeed8566 = 1 << FrostHunterJobIntentServiceOlympianVortex9856.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        if (FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566)) {
            return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterServiceEliteCelestialThunder1757[FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterRemoteConfigSpeedSpeed8566)]);
        }
        if (!FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed8566)) {
            return false;
        }
        FrostHunterViewBindingEpicEpicLegend9995 FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(FrostHunterTextViewDragonStormMega4297(FrostHunterRemoteConfigSpeedSpeed8566));
        return i2 == 30 ? FrostHunterResourcesTitanHyperVision5823.FrostHunterBundlePulseFusionHero2475(obj) : FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757(i, i2 + 5, obj);
    }

    public final int FrostHunterTextViewDragonStormMega4297(int i) {
        return (this.FrostHunterServiceEliteCelestialThunder1757.length - 1) - Integer.bitCount(this.FrostHunterConstraintSetCloneMasterUltraRogue2633 & (i - 1));
    }
}
