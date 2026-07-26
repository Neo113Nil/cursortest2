package android.content.Context;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewModelPixelOlympian1270 extends FrostHunterToastMasterCelestialAurora2505 {
    public final FileInputStream FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public final byte[] FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterLightSensorForceFusion4241;
    public int FrostHunterLintTitanVortexQuantum9911 = Integer.MAX_VALUE;
    public int FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterViewModelPixelOlympian1270(FileInputStream fileInputStream) {
        Charset charset = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterAlertDialogAuroraDelta3200 = fileInputStream;
        this.FrostHunterKeyframeGammaGamma1197 = new byte[4096];
        this.FrostHunterFragmentBetaMegaVortex6025 = 0;
        this.FrostHunterLightSensorForceFusion4241 = 0;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterAlertDialogAuroraDelta3200(int i) {
        if (i < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + this.FrostHunterLightSensorForceFusion4241 + i;
        if (i2 < 0) {
            throw new FrostHunterKaptFusionMax3663("Failed to parse the message.");
        }
        int i3 = this.FrostHunterLintTitanVortexQuantum9911;
        if (i2 > i3) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        this.FrostHunterLintTitanVortexQuantum9911 = i2;
        FrostHunterR8MasterNebulaSpark7247();
        return i3;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (this.FrostHunterScaleAnimationStrikeSpark5059 != i) {
            throw new FrostHunterKaptFusionMax3663("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final ArrayList FrostHunterBillingClientFusionVortex9008(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.FrostHunterAlertDialogAuroraDelta3200.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
                }
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterBitmapTurboDeltaNebula8743() {
        long FrostHunterMagnetometerFusionTitanium8202 = FrostHunterMagnetometerFusionTitanium8202();
        return (-(FrostHunterMagnetometerFusionTitanium8202 & 1)) ^ (FrostHunterMagnetometerFusionTitanium8202 >>> 1);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterCameraXTurboCelestialHero5430() {
        return FrostHunterStateCelestialNovaPixel8414();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + this.FrostHunterLightSensorForceFusion4241;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final boolean FrostHunterDatabaseEliteShadowUltra2452(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                FrostHunterRewardedAdMasterStrike9463(8);
                return true;
            }
            if (i2 == 2) {
                FrostHunterRewardedAdMasterStrike9463(FrostHunterStateCelestialNovaPixel8414());
                return true;
            }
            if (i2 == 3) {
                FrostHunterCardViewSpectraCyber7714();
                FrostHunterAlphaAnimationNeoCosmos5761(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw FrostHunterKaptFusionMax3663.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            FrostHunterRewardedAdMasterStrike9463(4);
            return true;
        }
        int i4 = this.FrostHunterFragmentBetaMegaVortex6025 - this.FrostHunterLightSensorForceFusion4241;
        byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.FrostHunterLightSensorForceFusion4241;
                this.FrostHunterLightSensorForceFusion4241 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw FrostHunterKaptFusionMax3663.FrostHunterBundlePulseFusionHero2475();
        }
        while (i3 < 10) {
            if (this.FrostHunterLightSensorForceFusion4241 == this.FrostHunterFragmentBetaMegaVortex6025) {
                FrostHunterFCMDeltaQuantumHero8364(1);
            }
            int i6 = this.FrostHunterLightSensorForceFusion4241;
            this.FrostHunterLightSensorForceFusion4241 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterBundlePulseFusionHero2475();
        return true;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final String FrostHunterDialogFragmentTurboPhoenixDragon7627() {
        int FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414();
        byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
        if (FrostHunterStateCelestialNovaPixel8414 > 0) {
            int i = this.FrostHunterFragmentBetaMegaVortex6025;
            int i2 = this.FrostHunterLightSensorForceFusion4241;
            if (FrostHunterStateCelestialNovaPixel8414 <= i - i2) {
                String str = new String(bArr, i2, FrostHunterStateCelestialNovaPixel8414, FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761);
                this.FrostHunterLightSensorForceFusion4241 += FrostHunterStateCelestialNovaPixel8414;
                return str;
            }
        }
        if (FrostHunterStateCelestialNovaPixel8414 == 0) {
            return "";
        }
        if (FrostHunterStateCelestialNovaPixel8414 < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        if (FrostHunterStateCelestialNovaPixel8414 > this.FrostHunterFragmentBetaMegaVortex6025) {
            return new String(FrostHunterViewPhantomNeo1634(FrostHunterStateCelestialNovaPixel8414), FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        FrostHunterFCMDeltaQuantumHero8364(FrostHunterStateCelestialNovaPixel8414);
        String str2 = new String(bArr, this.FrostHunterLightSensorForceFusion4241, FrostHunterStateCelestialNovaPixel8414, FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761);
        this.FrostHunterLightSensorForceFusion4241 += FrostHunterStateCelestialNovaPixel8414;
        return str2;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterEditTextPulseHyperion1262() {
        return FrostHunterMagnetometerFusionTitanium8202();
    }

    public final void FrostHunterFCMDeltaQuantumHero8364(int i) {
        if (FrostHunterPermissionInfoAlphaDelta6279(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) - this.FrostHunterLightSensorForceFusion4241) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        throw new FrostHunterKaptFusionMax3663("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        return FrostHunterTranslateAnimationCyberSolarUltra7101();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final void FrostHunterFlowMaxDragonHero5809(int i) {
        this.FrostHunterLintTitanVortexQuantum9911 = i;
        FrostHunterR8MasterNebulaSpark7247();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final FrostHunterManifestEclipseGammaTitanium1788 FrostHunterFragmentBetaMegaVortex6025() {
        int FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414();
        int i = this.FrostHunterFragmentBetaMegaVortex6025;
        int i2 = this.FrostHunterLightSensorForceFusion4241;
        int i3 = i - i2;
        byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
        if (FrostHunterStateCelestialNovaPixel8414 <= i3 && FrostHunterStateCelestialNovaPixel8414 > 0) {
            FrostHunterManifestEclipseGammaTitanium1788 FrostHunterServiceEliteCelestialThunder1757 = FrostHunterManifestEclipseGammaTitanium1788.FrostHunterServiceEliteCelestialThunder1757(bArr, i2, FrostHunterStateCelestialNovaPixel8414);
            this.FrostHunterLightSensorForceFusion4241 += FrostHunterStateCelestialNovaPixel8414;
            return FrostHunterServiceEliteCelestialThunder1757;
        }
        if (FrostHunterStateCelestialNovaPixel8414 == 0) {
            return FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200;
        }
        if (FrostHunterStateCelestialNovaPixel8414 < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        byte[] FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(FrostHunterStateCelestialNovaPixel8414);
        if (FrostHunterMeteringPointMegaCyber7955 != null) {
            return FrostHunterManifestEclipseGammaTitanium1788.FrostHunterServiceEliteCelestialThunder1757(FrostHunterMeteringPointMegaCyber7955, 0, FrostHunterMeteringPointMegaCyber7955.length);
        }
        int i4 = this.FrostHunterLightSensorForceFusion4241;
        int i5 = this.FrostHunterFragmentBetaMegaVortex6025;
        int i6 = i5 - i4;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += i5;
        this.FrostHunterLightSensorForceFusion4241 = 0;
        this.FrostHunterFragmentBetaMegaVortex6025 = 0;
        ArrayList FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(FrostHunterStateCelestialNovaPixel8414 - i6);
        byte[] bArr2 = new byte[FrostHunterStateCelestialNovaPixel8414];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = FrostHunterBillingClientFusionVortex9008.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = FrostHunterBillingClientFusionVortex9008.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788 = FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200;
        return new FrostHunterManifestEclipseGammaTitanium1788(bArr2);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final boolean FrostHunterKeyframeGammaGamma1197() {
        return FrostHunterMagnetometerFusionTitanium8202() != 0;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterLightSensorForceFusion4241() {
        return FrostHunterStateCelestialNovaPixel8414();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final float FrostHunterLintTitanVortexQuantum9911() {
        return Float.intBitsToFloat(FrostHunterMediaPlayerCelestialBetaTitan3868());
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final String FrostHunterLooperHyperionForce4133() {
        int FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414();
        int i = this.FrostHunterLightSensorForceFusion4241;
        int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
        int i3 = i2 - i;
        byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
        if (FrostHunterStateCelestialNovaPixel8414 <= i3 && FrostHunterStateCelestialNovaPixel8414 > 0) {
            this.FrostHunterLightSensorForceFusion4241 = i + FrostHunterStateCelestialNovaPixel8414;
        } else {
            if (FrostHunterStateCelestialNovaPixel8414 == 0) {
                return "";
            }
            if (FrostHunterStateCelestialNovaPixel8414 < 0) {
                throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
            }
            i = 0;
            if (FrostHunterStateCelestialNovaPixel8414 <= i2) {
                FrostHunterFCMDeltaQuantumHero8364(FrostHunterStateCelestialNovaPixel8414);
                this.FrostHunterLightSensorForceFusion4241 = FrostHunterStateCelestialNovaPixel8414;
            } else {
                bArr = FrostHunterViewPhantomNeo1634(FrostHunterStateCelestialNovaPixel8414);
            }
        }
        return FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889(bArr, i, FrostHunterStateCelestialNovaPixel8414);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterLooperThreadBetaHyperionMax1000() {
        return FrostHunterTranslateAnimationCyberSolarUltra7101();
    }

    public final long FrostHunterMagnetometerFusionTitanium8202() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.FrostHunterLightSensorForceFusion4241;
        int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
            byte b = bArr[i];
            if (b >= 0) {
                this.FrostHunterLightSensorForceFusion4241 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.FrostHunterLightSensorForceFusion4241 = i4;
                return j;
            }
        }
        return FrostHunterPagingDataTurboTitanium7332();
    }

    public final int FrostHunterMediaPlayerCelestialBetaTitan3868() {
        int i = this.FrostHunterLightSensorForceFusion4241;
        if (this.FrostHunterFragmentBetaMegaVortex6025 - i < 4) {
            FrostHunterFCMDeltaQuantumHero8364(4);
            i = this.FrostHunterLightSensorForceFusion4241;
        }
        this.FrostHunterLightSensorForceFusion4241 = i + 4;
        byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterMeteringPointBetaCyber9571() {
        if (FrostHunterServiceEliteCelestialThunder1757()) {
            this.FrostHunterScaleAnimationStrikeSpark5059 = 0;
            return 0;
        }
        int FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414();
        this.FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterStateCelestialNovaPixel8414;
        if ((FrostHunterStateCelestialNovaPixel8414 >>> 3) != 0) {
            return FrostHunterStateCelestialNovaPixel8414;
        }
        throw new FrostHunterKaptFusionMax3663("Protocol message contained an invalid tag (zero).");
    }

    public final byte[] FrostHunterMeteringPointMegaCyber7955(int i) {
        if (i == 0) {
            return FrostHunterExoPlayerBetaAlpha8415.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        if (i < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        int i3 = this.FrostHunterLightSensorForceFusion4241;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new FrostHunterKaptFusionMax3663("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.FrostHunterLintTitanVortexQuantum9911;
        if (i4 > i5) {
            FrostHunterRewardedAdMasterStrike9463((i5 - i2) - i3);
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        int i6 = this.FrostHunterFragmentBetaMegaVortex6025 - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (FrostHunterKaptFusionMax3663 e) {
                e.FrostHunterCameraXPixelTurboCosmos9814 = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterLightSensorForceFusion4241, bArr, 0, i6);
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += this.FrostHunterFragmentBetaMegaVortex6025;
        this.FrostHunterLightSensorForceFusion4241 = 0;
        this.FrostHunterFragmentBetaMegaVortex6025 = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
                }
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += read;
                i6 += read;
            } catch (FrostHunterKaptFusionMax3663 e2) {
                e2.FrostHunterCameraXPixelTurboCosmos9814 = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterMotionSceneAuroraMega2271() {
        int FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414();
        return (-(FrostHunterStateCelestialNovaPixel8414 & 1)) ^ (FrostHunterStateCelestialNovaPixel8414 >>> 1);
    }

    public final long FrostHunterPagingDataTurboTitanium7332() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.FrostHunterLightSensorForceFusion4241 == this.FrostHunterFragmentBetaMegaVortex6025) {
                FrostHunterFCMDeltaQuantumHero8364(1);
            }
            int i2 = this.FrostHunterLightSensorForceFusion4241;
            this.FrostHunterLightSensorForceFusion4241 = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.FrostHunterKeyframeGammaGamma1197[i2] & 128) == 0) {
                return j;
            }
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterBundlePulseFusionHero2475();
    }

    public final boolean FrostHunterPermissionInfoAlphaDelta6279(int i) {
        FileInputStream fileInputStream = this.FrostHunterAlertDialogAuroraDelta3200;
        int i2 = this.FrostHunterLightSensorForceFusion4241;
        int i3 = i2 + i;
        int i4 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (i3 <= i4) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.FrostHunterLintTitanVortexQuantum9911) {
            byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += i2;
                this.FrostHunterFragmentBetaMegaVortex6025 -= i2;
                this.FrostHunterLightSensorForceFusion4241 = 0;
            }
            int i6 = this.FrostHunterFragmentBetaMegaVortex6025;
            try {
                int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.FrostHunterFragmentBetaMegaVortex6025 += read;
                    FrostHunterR8MasterNebulaSpark7247();
                    if (this.FrostHunterFragmentBetaMegaVortex6025 >= i) {
                        return true;
                    }
                    return FrostHunterPermissionInfoAlphaDelta6279(i);
                }
            } catch (FrostHunterKaptFusionMax3663 e) {
                e.FrostHunterCameraXPixelTurboCosmos9814 = true;
                throw e;
            }
        }
        return false;
    }

    public final void FrostHunterR8MasterNebulaSpark7247() {
        int i = this.FrostHunterFragmentBetaMegaVortex6025 + this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
        int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + i;
        int i3 = this.FrostHunterLintTitanVortexQuantum9911;
        if (i2 <= i3) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i4;
        this.FrostHunterFragmentBetaMegaVortex6025 = i - i4;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterResourcesTitanHyperVision5823() {
        return FrostHunterMagnetometerFusionTitanium8202();
    }

    public final void FrostHunterRewardedAdMasterStrike9463(int i) {
        int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
        int i3 = this.FrostHunterLightSensorForceFusion4241;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.FrostHunterLightSensorForceFusion4241 = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        int i5 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.FrostHunterLintTitanVortexQuantum9911;
        if (i7 > i8) {
            FrostHunterRewardedAdMasterStrike9463((i8 - i5) - i3);
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i6;
        this.FrostHunterFragmentBetaMegaVortex6025 = 0;
        this.FrostHunterLightSensorForceFusion4241 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (FrostHunterKaptFusionMax3663 e) {
                    e.FrostHunterCameraXPixelTurboCosmos9814 = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += i4;
                FrostHunterR8MasterNebulaSpark7247();
                throw th;
            }
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += i4;
        FrostHunterR8MasterNebulaSpark7247();
        if (i4 >= i) {
            return;
        }
        int i9 = this.FrostHunterFragmentBetaMegaVortex6025;
        int i10 = i9 - this.FrostHunterLightSensorForceFusion4241;
        this.FrostHunterLightSensorForceFusion4241 = i9;
        FrostHunterFCMDeltaQuantumHero8364(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.FrostHunterFragmentBetaMegaVortex6025;
            if (i11 <= i12) {
                this.FrostHunterLightSensorForceFusion4241 = i11;
                return;
            } else {
                i10 += i12;
                this.FrostHunterLightSensorForceFusion4241 = i12;
                FrostHunterFCMDeltaQuantumHero8364(1);
            }
        }
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterScaleAnimationStrikeSpark5059() {
        return FrostHunterMediaPlayerCelestialBetaTitan3868();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final double FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        return Double.longBitsToDouble(FrostHunterTranslateAnimationCyberSolarUltra7101());
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final boolean FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterLightSensorForceFusion4241 == this.FrostHunterFragmentBetaMegaVortex6025 && !FrostHunterPermissionInfoAlphaDelta6279(1);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterServiceInfoHyperionSparkMax9966() {
        return FrostHunterStateCelestialNovaPixel8414();
    }

    public final int FrostHunterStateCelestialNovaPixel8414() {
        int i;
        int i2 = this.FrostHunterLightSensorForceFusion4241;
        int i3 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
            byte b = bArr[i2];
            if (b >= 0) {
                this.FrostHunterLightSensorForceFusion4241 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.FrostHunterLightSensorForceFusion4241 = i5;
                return i;
            }
        }
        return (int) FrostHunterPagingDataTurboTitanium7332();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterTextViewDragonStormMega4297() {
        return FrostHunterMediaPlayerCelestialBetaTitan3868();
    }

    public final long FrostHunterTranslateAnimationCyberSolarUltra7101() {
        int i = this.FrostHunterLightSensorForceFusion4241;
        if (this.FrostHunterFragmentBetaMegaVortex6025 - i < 8) {
            FrostHunterFCMDeltaQuantumHero8364(8);
            i = this.FrostHunterLightSensorForceFusion4241;
        }
        this.FrostHunterLightSensorForceFusion4241 = i + 8;
        byte[] bArr = this.FrostHunterKeyframeGammaGamma1197;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final byte[] FrostHunterViewPhantomNeo1634(int i) {
        byte[] FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(i);
        if (FrostHunterMeteringPointMegaCyber7955 != null) {
            return FrostHunterMeteringPointMegaCyber7955;
        }
        int i2 = this.FrostHunterLightSensorForceFusion4241;
        int i3 = this.FrostHunterFragmentBetaMegaVortex6025;
        int i4 = i3 - i2;
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 += i3;
        this.FrostHunterLightSensorForceFusion4241 = 0;
        this.FrostHunterFragmentBetaMegaVortex6025 = 0;
        ArrayList FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.FrostHunterKeyframeGammaGamma1197, i2, bArr, 0, i4);
        int size = FrostHunterBillingClientFusionVortex9008.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = FrostHunterBillingClientFusionVortex9008.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }
}
