package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConstraintLayoutFusionCelestial7759 extends FrostHunterToastMasterCelestialAurora2505 {
    public final byte[] FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = Integer.MAX_VALUE;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;
    public final int FrostHunterLightSensorForceFusion4241;
    public int FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterConstraintLayoutFusionCelestial7759(byte[] bArr, int i, int i2, boolean z) {
        this.FrostHunterAlertDialogAuroraDelta3200 = bArr;
        this.FrostHunterKeyframeGammaGamma1197 = i2 + i;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i;
        this.FrostHunterLightSensorForceFusion4241 = i;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterAlertDialogAuroraDelta3200(int i) {
        if (i < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633() + i;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 < 0) {
            throw new FrostHunterKaptFusionMax3663("Failed to parse the message.");
        }
        int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 > i2) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterStateCelestialNovaPixel8414();
        return i2;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (this.FrostHunterScaleAnimationStrikeSpark5059 != i) {
            throw new FrostHunterKaptFusionMax3663("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int FrostHunterBillingClientFusionVortex9008() {
        int i;
        int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int i3 = this.FrostHunterKeyframeGammaGamma1197;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.FrostHunterAlertDialogAuroraDelta3200;
            byte b = bArr[i2];
            if (b >= 0) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i4;
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
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5;
                return i;
            }
        }
        return (int) FrostHunterTranslateAnimationCyberSolarUltra7101();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterBitmapTurboDeltaNebula8743() {
        long FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterMediaPlayerCelestialBetaTitan3868();
        return (-(FrostHunterMediaPlayerCelestialBetaTitan3868 & 1)) ^ (FrostHunterMediaPlayerCelestialBetaTitan3868 >>> 1);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterCameraXTurboCelestialHero5430() {
        return FrostHunterBillingClientFusionVortex9008();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719 - this.FrostHunterLightSensorForceFusion4241;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final boolean FrostHunterDatabaseEliteShadowUltra2452(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                FrostHunterMagnetometerFusionTitanium8202(8);
                return true;
            }
            if (i2 == 2) {
                FrostHunterMagnetometerFusionTitanium8202(FrostHunterBillingClientFusionVortex9008());
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
            FrostHunterMagnetometerFusionTitanium8202(4);
            return true;
        }
        int i4 = this.FrostHunterKeyframeGammaGamma1197 - this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        byte[] bArr = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw FrostHunterKaptFusionMax3663.FrostHunterBundlePulseFusionHero2475();
        }
        while (i3 < 10) {
            int i6 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (i6 == this.FrostHunterKeyframeGammaGamma1197) {
                throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
            }
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterBundlePulseFusionHero2475();
        return true;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final String FrostHunterDialogFragmentTurboPhoenixDragon7627() {
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008();
        if (FrostHunterBillingClientFusionVortex9008 > 0) {
            int i = this.FrostHunterKeyframeGammaGamma1197;
            int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (FrostHunterBillingClientFusionVortex9008 <= i - i2) {
                String str = new String(this.FrostHunterAlertDialogAuroraDelta3200, i2, FrostHunterBillingClientFusionVortex9008, FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761);
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 += FrostHunterBillingClientFusionVortex9008;
                return str;
            }
        }
        if (FrostHunterBillingClientFusionVortex9008 == 0) {
            return "";
        }
        if (FrostHunterBillingClientFusionVortex9008 < 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterEditTextPulseHyperion1262() {
        return FrostHunterMediaPlayerCelestialBetaTitan3868();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        return FrostHunterMeteringPointMegaCyber7955();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final void FrostHunterFlowMaxDragonHero5809(int i) {
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i;
        FrostHunterStateCelestialNovaPixel8414();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final FrostHunterManifestEclipseGammaTitanium1788 FrostHunterFragmentBetaMegaVortex6025() {
        byte[] bArr;
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008();
        byte[] bArr2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (FrostHunterBillingClientFusionVortex9008 > 0) {
            int i = this.FrostHunterKeyframeGammaGamma1197;
            int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (FrostHunterBillingClientFusionVortex9008 <= i - i2) {
                FrostHunterManifestEclipseGammaTitanium1788 FrostHunterServiceEliteCelestialThunder1757 = FrostHunterManifestEclipseGammaTitanium1788.FrostHunterServiceEliteCelestialThunder1757(bArr2, i2, FrostHunterBillingClientFusionVortex9008);
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 += FrostHunterBillingClientFusionVortex9008;
                return FrostHunterServiceEliteCelestialThunder1757;
            }
        }
        if (FrostHunterBillingClientFusionVortex9008 == 0) {
            return FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200;
        }
        if (FrostHunterBillingClientFusionVortex9008 > 0) {
            int i3 = this.FrostHunterKeyframeGammaGamma1197;
            int i4 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (FrostHunterBillingClientFusionVortex9008 <= i3 - i4) {
                int i5 = FrostHunterBillingClientFusionVortex9008 + i4;
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788 = FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200;
                return new FrostHunterManifestEclipseGammaTitanium1788(bArr);
            }
        }
        if (FrostHunterBillingClientFusionVortex9008 > 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        if (FrostHunterBillingClientFusionVortex9008 != 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        bArr = FrostHunterExoPlayerBetaAlpha8415.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium17882 = FrostHunterManifestEclipseGammaTitanium1788.FrostHunterAlertDialogAuroraDelta3200;
        return new FrostHunterManifestEclipseGammaTitanium1788(bArr);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final boolean FrostHunterKeyframeGammaGamma1197() {
        return FrostHunterMediaPlayerCelestialBetaTitan3868() != 0;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterLightSensorForceFusion4241() {
        return FrostHunterBillingClientFusionVortex9008();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final float FrostHunterLintTitanVortexQuantum9911() {
        return Float.intBitsToFloat(FrostHunterViewPhantomNeo1634());
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final String FrostHunterLooperHyperionForce4133() {
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008();
        if (FrostHunterBillingClientFusionVortex9008 > 0) {
            int i = this.FrostHunterKeyframeGammaGamma1197;
            int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (FrostHunterBillingClientFusionVortex9008 <= i - i2) {
                String FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterEventNeoOlympian4847.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlertDialogAuroraDelta3200, i2, FrostHunterBillingClientFusionVortex9008);
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 += FrostHunterBillingClientFusionVortex9008;
                return FrostHunterLifecycleBlazeGammaElite2889;
            }
        }
        if (FrostHunterBillingClientFusionVortex9008 == 0) {
            return "";
        }
        if (FrostHunterBillingClientFusionVortex9008 <= 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterLooperThreadBetaHyperionMax1000() {
        return FrostHunterMeteringPointMegaCyber7955();
    }

    public final void FrostHunterMagnetometerFusionTitanium8202(int i) {
        if (i >= 0) {
            int i2 = this.FrostHunterKeyframeGammaGamma1197;
            int i3 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (i <= i2 - i3) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterServiceEliteCelestialThunder1757();
    }

    public final long FrostHunterMediaPlayerCelestialBetaTitan3868() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int i2 = this.FrostHunterKeyframeGammaGamma1197;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.FrostHunterAlertDialogAuroraDelta3200;
            byte b = bArr[i];
            if (b >= 0) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i3;
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
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i4;
                return j;
            }
        }
        return FrostHunterTranslateAnimationCyberSolarUltra7101();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterMeteringPointBetaCyber9571() {
        if (FrostHunterServiceEliteCelestialThunder1757()) {
            this.FrostHunterScaleAnimationStrikeSpark5059 = 0;
            return 0;
        }
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008();
        this.FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterBillingClientFusionVortex9008;
        if ((FrostHunterBillingClientFusionVortex9008 >>> 3) != 0) {
            return FrostHunterBillingClientFusionVortex9008;
        }
        throw new FrostHunterKaptFusionMax3663("Protocol message contained an invalid tag (zero).");
    }

    public final long FrostHunterMeteringPointMegaCyber7955() {
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (this.FrostHunterKeyframeGammaGamma1197 - i < 8) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i + 8;
        byte[] bArr = this.FrostHunterAlertDialogAuroraDelta3200;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterMotionSceneAuroraMega2271() {
        int FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008();
        return (-(FrostHunterBillingClientFusionVortex9008 & 1)) ^ (FrostHunterBillingClientFusionVortex9008 >>> 1);
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final long FrostHunterResourcesTitanHyperVision5823() {
        return FrostHunterMediaPlayerCelestialBetaTitan3868();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterScaleAnimationStrikeSpark5059() {
        return FrostHunterViewPhantomNeo1634();
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final double FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        return Double.longBitsToDouble(FrostHunterMeteringPointMegaCyber7955());
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final boolean FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719 == this.FrostHunterKeyframeGammaGamma1197;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterServiceInfoHyperionSparkMax9966() {
        return FrostHunterBillingClientFusionVortex9008();
    }

    public final void FrostHunterStateCelestialNovaPixel8414() {
        int i = this.FrostHunterKeyframeGammaGamma1197 + this.FrostHunterFragmentBetaMegaVortex6025;
        this.FrostHunterKeyframeGammaGamma1197 = i;
        int i2 = i - this.FrostHunterLightSensorForceFusion4241;
        int i3 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (i2 <= i3) {
            this.FrostHunterFragmentBetaMegaVortex6025 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.FrostHunterFragmentBetaMegaVortex6025 = i4;
        this.FrostHunterKeyframeGammaGamma1197 = i - i4;
    }

    @Override // android.content.Context.FrostHunterToastMasterCelestialAurora2505
    public final int FrostHunterTextViewDragonStormMega4297() {
        return FrostHunterViewPhantomNeo1634();
    }

    public final long FrostHunterTranslateAnimationCyberSolarUltra7101() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (i2 == this.FrostHunterKeyframeGammaGamma1197) {
                throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
            }
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.FrostHunterAlertDialogAuroraDelta3200[i2] & 128) == 0) {
                return j;
            }
        }
        throw FrostHunterKaptFusionMax3663.FrostHunterBundlePulseFusionHero2475();
    }

    public final int FrostHunterViewPhantomNeo1634() {
        int i = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (this.FrostHunterKeyframeGammaGamma1197 - i < 4) {
            throw FrostHunterKaptFusionMax3663.FrostHunterLifecycleBlazeGammaElite2889();
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i + 4;
        byte[] bArr = this.FrostHunterAlertDialogAuroraDelta3200;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
