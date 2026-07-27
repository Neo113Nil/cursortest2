package android.content.Context;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterWorkManagerQuantumBeta5298 {
    public static final Logger FrostHunterLevelListDrawableFusionDragonHero2232 = Logger.getLogger(FrostHunterWorkManagerQuantumBeta5298.class.getName());
    public static final boolean FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterLightSensorCosmosStorm9710.FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final byte[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterTextWatcherCelestialMegaShadow4624 FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterWorkManagerQuantumBeta5298(FrostHunterTextWatcherCelestialMegaShadow4624 frostHunterTextWatcherCelestialMegaShadow4624, int i) {
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new byte[max];
        this.FrostHunterBundlePulseFusionHero2475 = max;
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterTextWatcherCelestialMegaShadow4624;
    }

    public static int FrostHunterAlertDialogAuroraDelta3200(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int FrostHunterCameraXPixelTurboCosmos9814(int i) {
        return FrostHunterFlowMaxDragonHero5809(i << 3);
    }

    public static int FrostHunterFlowMaxDragonHero5809(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int FrostHunterLevelListDrawableFusionDragonHero2232(int i, FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788) {
        int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(i);
        int size = frostHunterManifestEclipseGammaTitanium1788.size();
        return FrostHunterFlowMaxDragonHero5809(size) + size + FrostHunterCameraXPixelTurboCosmos9814;
    }

    public static int FrostHunterRemoteConfigSpeedSpeed8566(String str) {
        int length;
        try {
            length = FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761(str);
        } catch (FrostHunterLocationListenerLegendEpic8978 unused) {
            length = str.getBytes(FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761).length;
        }
        return FrostHunterFlowMaxDragonHero5809(length) + length;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = i2 + 1;
        this.FrostHunterServiceEliteCelestialThunder1757 = i3;
        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.FrostHunterServiceEliteCelestialThunder1757 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.FrostHunterServiceEliteCelestialThunder1757 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.FrostHunterServiceEliteCelestialThunder1757 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void FrostHunterBitmapTurboDeltaNebula8743(int i) {
        if (i >= 0) {
            FrostHunterCardViewSpectraCyber7714(i);
        } else {
            FrostHunterMeteringPointMegaCyber7955(i);
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, int i2) {
        FrostHunterServiceEliteCelestialThunder1757((i << 3) | i2);
    }

    public final void FrostHunterCameraXTurboCelestialHero5430(int i, int i2) {
        FrostHunterFragmentBetaMegaVortex6025(14);
        FrostHunterBundlePulseFusionHero2475(i, 5);
        FrostHunterAlphaAnimationNeoCosmos5761(i2);
    }

    public final void FrostHunterCardViewSpectraCyber7714(int i) {
        FrostHunterFragmentBetaMegaVortex6025(5);
        FrostHunterServiceEliteCelestialThunder1757(i);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        int i2 = i + 1;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.FrostHunterServiceEliteCelestialThunder1757 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.FrostHunterServiceEliteCelestialThunder1757 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.FrostHunterServiceEliteCelestialThunder1757 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.FrostHunterServiceEliteCelestialThunder1757 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.FrostHunterServiceEliteCelestialThunder1757 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.FrostHunterServiceEliteCelestialThunder1757 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.FrostHunterServiceEliteCelestialThunder1757 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void FrostHunterDatabaseEliteShadowUltra2452(int i, int i2) {
        FrostHunterFragmentBetaMegaVortex6025(20);
        FrostHunterBundlePulseFusionHero2475(i, 0);
        FrostHunterServiceEliteCelestialThunder1757(i2);
    }

    public final void FrostHunterDialogFragmentTurboPhoenixDragon7627(byte[] bArr, int i, int i2) {
        FrostHunterLightSensorForceFusion4241(bArr, i, i2);
    }

    public final void FrostHunterEditTextPulseHyperion1262(int i, int i2) {
        FrostHunterCardViewSpectraCyber7714((i << 3) | i2);
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(int i, FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788) {
        FrostHunterEditTextPulseHyperion1262(i, 2);
        FrostHunterLintTitanVortexQuantum9911(frostHunterManifestEclipseGammaTitanium1788);
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(int i) {
        if (this.FrostHunterBundlePulseFusionHero2475 - this.FrostHunterServiceEliteCelestialThunder1757 < i) {
            FrostHunterKeyframeGammaGamma1197();
        }
    }

    public final void FrostHunterKeyframeGammaGamma1197() {
        this.FrostHunterLifecycleBlazeGammaElite2889.write(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0, this.FrostHunterServiceEliteCelestialThunder1757);
        this.FrostHunterServiceEliteCelestialThunder1757 = 0;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(long j) {
        boolean z = FrostHunterRemoteConfigSpeedSpeed8566;
        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.FrostHunterServiceEliteCelestialThunder1757;
                if (j2 == 0) {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i + 1;
                    FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, i, (byte) j);
                    return;
                } else {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i + 1;
                    FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
                if (j3 == 0) {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void FrostHunterLightSensorForceFusion4241(byte[] bArr, int i, int i2) {
        int i3 = this.FrostHunterServiceEliteCelestialThunder1757;
        int i4 = this.FrostHunterBundlePulseFusionHero2475;
        int i5 = i4 - i3;
        byte[] bArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.FrostHunterServiceEliteCelestialThunder1757 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.FrostHunterServiceEliteCelestialThunder1757 = i4;
        FrostHunterKeyframeGammaGamma1197();
        if (i7 > i4) {
            this.FrostHunterLifecycleBlazeGammaElite2889.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.FrostHunterServiceEliteCelestialThunder1757 = i7;
        }
    }

    public final void FrostHunterLintTitanVortexQuantum9911(FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788) {
        FrostHunterCardViewSpectraCyber7714(frostHunterManifestEclipseGammaTitanium1788.size());
        FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterManifestEclipseGammaTitanium1788.FrostHunterFlowMaxDragonHero5809, frostHunterManifestEclipseGammaTitanium1788.FrostHunterLevelListDrawableFusionDragonHero2232(), frostHunterManifestEclipseGammaTitanium1788.size());
    }

    public final void FrostHunterLooperHyperionForce4133(int i, FrostHunterStateNeoCyberShadow9514 frostHunterStateNeoCyberShadow9514, FrostHunterDiffUtilStrikeDragonStorm3770 frostHunterDiffUtilStrikeDragonStorm3770) {
        FrostHunterEditTextPulseHyperion1262(i, 2);
        FrostHunterCardViewSpectraCyber7714(frostHunterStateNeoCyberShadow9514.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDiffUtilStrikeDragonStorm3770));
        frostHunterDiffUtilStrikeDragonStorm3770.FrostHunterLifecycleBlazeGammaElite2889(frostHunterStateNeoCyberShadow9514, this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final void FrostHunterLooperThreadBetaHyperionMax1000(long j) {
        FrostHunterFragmentBetaMegaVortex6025(8);
        FrostHunterConstraintSetCloneMasterUltraRogue2633(j);
    }

    public final void FrostHunterMeteringPointBetaCyber9571(String str, int i) {
        FrostHunterEditTextPulseHyperion1262(i, 2);
        FrostHunterServiceInfoHyperionSparkMax9966(str);
    }

    public final void FrostHunterMeteringPointMegaCyber7955(long j) {
        FrostHunterFragmentBetaMegaVortex6025(10);
        FrostHunterLifecycleBlazeGammaElite2889(j);
    }

    public final void FrostHunterMotionSceneAuroraMega2271(int i, int i2) {
        FrostHunterFragmentBetaMegaVortex6025(20);
        FrostHunterBundlePulseFusionHero2475(i, 0);
        if (i2 >= 0) {
            FrostHunterServiceEliteCelestialThunder1757(i2);
        } else {
            FrostHunterLifecycleBlazeGammaElite2889(i2);
        }
    }

    public final void FrostHunterResourcesTitanHyperVision5823(int i) {
        FrostHunterFragmentBetaMegaVortex6025(4);
        FrostHunterAlphaAnimationNeoCosmos5761(i);
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059(int i, boolean z) {
        FrostHunterFragmentBetaMegaVortex6025(11);
        FrostHunterBundlePulseFusionHero2475(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2 + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i2] = b;
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(byte b) {
        if (this.FrostHunterServiceEliteCelestialThunder1757 == this.FrostHunterBundlePulseFusionHero2475) {
            FrostHunterKeyframeGammaGamma1197();
        }
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterServiceEliteCelestialThunder1757 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633[i] = b;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(int i) {
        boolean z = FrostHunterRemoteConfigSpeedSpeed8566;
        byte[] bArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.FrostHunterServiceEliteCelestialThunder1757;
                if (i2 == 0) {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i3 + 1;
                    FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, i3, (byte) i);
                    return;
                } else {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i3 + 1;
                    FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.FrostHunterServiceEliteCelestialThunder1757;
                if (i4 == 0) {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void FrostHunterServiceInfoHyperionSparkMax9966(String str) {
        try {
            int length = str.length() * 3;
            int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(length);
            int i = FrostHunterFlowMaxDragonHero5809 + length;
            int i2 = this.FrostHunterBundlePulseFusionHero2475;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(str, bArr, 0, length);
                FrostHunterCardViewSpectraCyber7714(FrostHunterLevelListDrawableFusionDragonHero22322);
                FrostHunterLightSensorForceFusion4241(bArr, 0, FrostHunterLevelListDrawableFusionDragonHero22322);
                return;
            }
            if (i > i2 - this.FrostHunterServiceEliteCelestialThunder1757) {
                FrostHunterKeyframeGammaGamma1197();
            }
            int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809(str.length());
            int i3 = this.FrostHunterServiceEliteCelestialThunder1757;
            byte[] bArr2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            try {
                try {
                    if (FrostHunterFlowMaxDragonHero58092 == FrostHunterFlowMaxDragonHero5809) {
                        int i4 = i3 + FrostHunterFlowMaxDragonHero58092;
                        this.FrostHunterServiceEliteCelestialThunder1757 = i4;
                        int FrostHunterLevelListDrawableFusionDragonHero22323 = FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(str, bArr2, i4, i2 - i4);
                        this.FrostHunterServiceEliteCelestialThunder1757 = i3;
                        FrostHunterServiceEliteCelestialThunder1757((FrostHunterLevelListDrawableFusionDragonHero22323 - i3) - FrostHunterFlowMaxDragonHero58092);
                        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterLevelListDrawableFusionDragonHero22323;
                    } else {
                        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761(str);
                        FrostHunterServiceEliteCelestialThunder1757(FrostHunterAlphaAnimationNeoCosmos5761);
                        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(str, bArr2, this.FrostHunterServiceEliteCelestialThunder1757, FrostHunterAlphaAnimationNeoCosmos5761);
                    }
                } catch (FrostHunterLocationListenerLegendEpic8978 e) {
                    this.FrostHunterServiceEliteCelestialThunder1757 = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new FrostHunterTextInputLayoutCelestialNovaXQuantum6471(e2);
            }
        } catch (FrostHunterLocationListenerLegendEpic8978 e3) {
            FrostHunterLevelListDrawableFusionDragonHero2232.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761);
            try {
                FrostHunterCardViewSpectraCyber7714(bytes.length);
                FrostHunterDialogFragmentTurboPhoenixDragon7627(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new FrostHunterTextInputLayoutCelestialNovaXQuantum6471(e4);
            }
        }
    }

    public final void FrostHunterTextViewDragonStormMega4297(int i, long j) {
        FrostHunterFragmentBetaMegaVortex6025(18);
        FrostHunterBundlePulseFusionHero2475(i, 1);
        FrostHunterConstraintSetCloneMasterUltraRogue2633(j);
    }

    public final void FrostHunterViewPhantomNeo1634(int i, long j) {
        FrostHunterFragmentBetaMegaVortex6025(20);
        FrostHunterBundlePulseFusionHero2475(i, 0);
        FrostHunterLifecycleBlazeGammaElite2889(j);
    }
}
