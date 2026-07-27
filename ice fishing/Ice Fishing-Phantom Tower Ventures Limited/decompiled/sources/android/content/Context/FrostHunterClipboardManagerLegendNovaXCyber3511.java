package android.content.Context;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterClipboardManagerLegendNovaXCyber3511 {
    public final FrostHunterConstraintLayoutBetaAlphaNebula8582 FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterAlphaAnimationNeoCosmos5761 = 4096;
    public final ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633 = new ArrayList();
    public FrostHunterDataBindingCelestialCyberSpectra3810[] FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterDataBindingCelestialCyberSpectra3810[8];
    public int FrostHunterLifecycleBlazeGammaElite2889 = 7;

    public FrostHunterClipboardManagerLegendNovaXCyber3511(FrostHunterBitmapHyperLegend9603 frostHunterBitmapHyperLegend9603) {
        this.FrostHunterBundlePulseFusionHero2475 = new FrostHunterConstraintLayoutBetaAlphaNebula8582(frostHunterBitmapHyperLegend9603);
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.FrostHunterServiceEliteCelestialThunder1757.length;
            while (true) {
                length--;
                i2 = this.FrostHunterLifecycleBlazeGammaElite2889;
                if (length < i2 || i <= 0) {
                    break;
                }
                FrostHunterDataBindingCelestialCyberSpectra3810 frostHunterDataBindingCelestialCyberSpectra3810 = this.FrostHunterServiceEliteCelestialThunder1757[length];
                frostHunterDataBindingCelestialCyberSpectra3810.getClass();
                int i4 = frostHunterDataBindingCelestialCyberSpectra3810.FrostHunterBundlePulseFusionHero2475;
                i -= i4;
                this.FrostHunterRemoteConfigSpeedSpeed8566 -= i4;
                this.FrostHunterLevelListDrawableFusionDragonHero2232--;
                i3++;
            }
            FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr = this.FrostHunterServiceEliteCelestialThunder1757;
            System.arraycopy(frostHunterDataBindingCelestialCyberSpectra3810Arr, i2 + 1, frostHunterDataBindingCelestialCyberSpectra3810Arr, i2 + 1 + i3, this.FrostHunterLevelListDrawableFusionDragonHero2232);
            this.FrostHunterLifecycleBlazeGammaElite2889 += i3;
        }
        return i3;
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterDataBindingCelestialCyberSpectra3810 frostHunterDataBindingCelestialCyberSpectra3810) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(frostHunterDataBindingCelestialCyberSpectra3810);
        int i = frostHunterDataBindingCelestialCyberSpectra3810.FrostHunterBundlePulseFusionHero2475;
        int i2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i > i2) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(r7, 0, this.FrostHunterServiceEliteCelestialThunder1757.length);
            this.FrostHunterLifecycleBlazeGammaElite2889 = this.FrostHunterServiceEliteCelestialThunder1757.length - 1;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
            this.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
            return;
        }
        FrostHunterAlphaAnimationNeoCosmos5761((this.FrostHunterRemoteConfigSpeedSpeed8566 + i) - i2);
        int i3 = this.FrostHunterLevelListDrawableFusionDragonHero2232 + 1;
        FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i3 > frostHunterDataBindingCelestialCyberSpectra3810Arr.length) {
            FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr2 = new FrostHunterDataBindingCelestialCyberSpectra3810[frostHunterDataBindingCelestialCyberSpectra3810Arr.length * 2];
            System.arraycopy(frostHunterDataBindingCelestialCyberSpectra3810Arr, 0, frostHunterDataBindingCelestialCyberSpectra3810Arr2, frostHunterDataBindingCelestialCyberSpectra3810Arr.length, frostHunterDataBindingCelestialCyberSpectra3810Arr.length);
            this.FrostHunterLifecycleBlazeGammaElite2889 = this.FrostHunterServiceEliteCelestialThunder1757.length - 1;
            this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterDataBindingCelestialCyberSpectra3810Arr2;
        }
        int i4 = this.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i4 - 1;
        this.FrostHunterServiceEliteCelestialThunder1757[i4] = frostHunterDataBindingCelestialCyberSpectra3810;
        this.FrostHunterLevelListDrawableFusionDragonHero2232++;
        this.FrostHunterRemoteConfigSpeedSpeed8566 += i;
    }

    public final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        if (i >= 0) {
            FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr = FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i <= frostHunterDataBindingCelestialCyberSpectra3810Arr.length - 1) {
                return frostHunterDataBindingCelestialCyberSpectra3810Arr[i].FrostHunterAlphaAnimationNeoCosmos5761;
            }
        }
        int length = this.FrostHunterLifecycleBlazeGammaElite2889 + 1 + (i - FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761.length);
        if (length >= 0) {
            FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            if (length < frostHunterDataBindingCelestialCyberSpectra3810Arr2.length) {
                FrostHunterDataBindingCelestialCyberSpectra3810 frostHunterDataBindingCelestialCyberSpectra3810 = frostHunterDataBindingCelestialCyberSpectra3810Arr2[length];
                frostHunterDataBindingCelestialCyberSpectra3810.getClass();
                return frostHunterDataBindingCelestialCyberSpectra3810.FrostHunterAlphaAnimationNeoCosmos5761;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.FrostHunterBundlePulseFusionHero2475.readByte();
            byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }

    public final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582 = this.FrostHunterBundlePulseFusionHero2475;
        byte readByte = frostHunterConstraintLayoutBetaAlphaNebula8582.readByte();
        byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i, 127);
        if (!z) {
            return frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterLifecycleBlazeGammaElite2889);
        }
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
        int[] iArr = FrostHunterAsyncTaskUltraEclipse4106.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterConstraintLayoutBetaAlphaNebula8582.getClass();
        FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo1196 = FrostHunterAsyncTaskUltraEclipse4106.FrostHunterBundlePulseFusionHero2475;
        FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo11962 = frostHunterGradlePulseOlympianTurbo1196;
        int i3 = 0;
        for (long j = 0; j < FrostHunterLifecycleBlazeGammaElite2889; j++) {
            byte readByte2 = frostHunterConstraintLayoutBetaAlphaNebula8582.readByte();
            byte[] bArr2 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                FrostHunterGradlePulseOlympianTurbo1196[] frostHunterGradlePulseOlympianTurbo1196Arr = (FrostHunterGradlePulseOlympianTurbo1196[]) frostHunterGradlePulseOlympianTurbo11962.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterGradlePulseOlympianTurbo1196Arr.getClass();
                frostHunterGradlePulseOlympianTurbo11962 = frostHunterGradlePulseOlympianTurbo1196Arr[(i2 >>> (i3 - 8)) & 255];
                frostHunterGradlePulseOlympianTurbo11962.getClass();
                if (((FrostHunterGradlePulseOlympianTurbo1196[]) frostHunterGradlePulseOlympianTurbo11962.FrostHunterAlertDialogAuroraDelta3200) == null) {
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterGradlePulseOlympianTurbo11962.FrostHunterCameraXPixelTurboCosmos9814);
                    i3 -= frostHunterGradlePulseOlympianTurbo11962.FrostHunterFlowMaxDragonHero5809;
                    frostHunterGradlePulseOlympianTurbo11962 = frostHunterGradlePulseOlympianTurbo1196;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            FrostHunterGradlePulseOlympianTurbo1196[] frostHunterGradlePulseOlympianTurbo1196Arr2 = (FrostHunterGradlePulseOlympianTurbo1196[]) frostHunterGradlePulseOlympianTurbo11962.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterGradlePulseOlympianTurbo1196Arr2.getClass();
            FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo11963 = frostHunterGradlePulseOlympianTurbo1196Arr2[(i2 << (8 - i3)) & 255];
            frostHunterGradlePulseOlympianTurbo11963.getClass();
            int i4 = frostHunterGradlePulseOlympianTurbo11963.FrostHunterFlowMaxDragonHero5809;
            if (((FrostHunterGradlePulseOlympianTurbo1196[]) frostHunterGradlePulseOlympianTurbo11963.FrostHunterAlertDialogAuroraDelta3200) != null || i4 > i3) {
                break;
            }
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterGradlePulseOlympianTurbo11963.FrostHunterCameraXPixelTurboCosmos9814);
            i3 -= i4;
            frostHunterGradlePulseOlympianTurbo11962 = frostHunterGradlePulseOlympianTurbo1196;
        }
        return frostHunterMergeSpeedHyperionBlaze4246.FrostHunterLifecycleBlazeGammaElite2889(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809);
    }
}
