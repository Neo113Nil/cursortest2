package android.content.Context;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMergeSpeedHyperionBlaze4246 implements FrostHunterJobSchedulerEpicAuroraNebula9616, FrostHunterCameraViewPhantomUltraHyperion8580, Cloneable, ByteChannel {
    public FrostHunterMaterialCardViewTitanMax3245 FrostHunterCameraXPixelTurboCosmos9814;
    public long FrostHunterFlowMaxDragonHero5809;

    public final long FrostHunterAlertDialogAuroraDelta3200(byte b, long j, long j2) {
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.FrostHunterFlowMaxDragonHero5809 + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                j4 -= frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            while (j4 < j2) {
                byte[] bArr = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
                int min = (int) Math.min(frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475, (frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j2) - j4);
                for (int i = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j4;
                    }
                }
                j4 += frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j3;
            if (j5 > j) {
                break;
            }
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
            int min2 = (int) Math.min(frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475, (frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j2) - j3);
            for (int i2 = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j3;
                }
            }
            j3 += frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            j = j3;
        }
        return -1L;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        skip(this.FrostHunterFlowMaxDragonHero5809);
    }

    public final void FrostHunterBillingClientFusionVortex9008(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(1);
            int min = Math.min(i - i2, 8192 - FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475);
            int i3 = i2 + min;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475, i2, i3, bArr, FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761);
            FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += min;
            i2 = i3;
        }
        this.FrostHunterFlowMaxDragonHero5809 += j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long FrostHunterBitmapTurboDeltaNebula8743() {
        int i;
        if (this.FrostHunterFlowMaxDragonHero5809 == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            byte[] bArr = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
            int i3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i4 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = FrostHunterExecutorSolarPhoenix3849.FrostHunterAlphaAnimationNeoCosmos5761;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
                        FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
                    } else {
                        frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterMagnetometerFusionTitanium8202(j);
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterTranslateAnimationCyberSolarUltra7101(b);
                    throw new NumberFormatException("Number too large: ".concat(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterDatabaseEliteShadowUltra2452()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.FrostHunterCameraXPixelTurboCosmos9814 != null);
        this.FrostHunterFlowMaxDragonHero5809 -= i2;
        return j;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return FrostHunterAdMobBlazeEclipseGamma6684.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final boolean FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterFlowMaxDragonHero5809 == 0;
    }

    public final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterCardViewSpectraCyber7714(int i) {
        if (i == 0) {
            return FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(this.FrostHunterFlowMaxDragonHero5809, 0L, i);
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            frostHunterMaterialCardViewTitanMax3245.getClass();
            int i5 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
            int i6 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i7 = 0;
        while (i2 < i) {
            frostHunterMaterialCardViewTitanMax32452.getClass();
            bArr[i7] = frostHunterMaterialCardViewTitanMax32452.FrostHunterAlphaAnimationNeoCosmos5761;
            i2 += frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterMaterialCardViewTitanMax32452.FrostHunterServiceEliteCelestialThunder1757 = true;
            i7++;
            frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax32452.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        return new FrostHunterDrawableCompatNovaSpeed1659(bArr, iArr);
    }

    public final String FrostHunterDatabaseEliteShadowUltra2452() {
        return FrostHunterMeteringPointBetaCyber9571(this.FrostHunterFlowMaxDragonHero5809, FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final short FrostHunterDialogFragmentTurboPhoenixDragon7627() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580
    public final /* bridge */ /* synthetic */ FrostHunterCameraViewPhantomUltraHyperion8580 FrostHunterEditTextPulseHyperion1262(String str) {
        FrostHunterFCMDeltaQuantumHero8364(str);
        return this;
    }

    public final void FrostHunterFCMDeltaQuantumHero8364(String str) {
        str.getClass();
        FrostHunterRewardedAdMasterStrike9463(str, 0, str.length());
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580
    public final /* bridge */ /* synthetic */ FrostHunterCameraViewPhantomUltraHyperion8580 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836) {
        FrostHunterMeteringPointMegaCyber7955(frostHunterBarrierStrikeDragonOlympian9836);
        return this;
    }

    public final byte FrostHunterFlowMaxDragonHero5809(long j) {
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(this.FrostHunterFlowMaxDragonHero5809, j, 1L);
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        long j2 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 - j < j) {
            while (j2 > j) {
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                j2 -= frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            return frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761[(int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
            int i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761[(int) ((i2 + j) - j3)];
            }
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            j3 = j4;
        }
    }

    public final boolean FrostHunterFragmentBetaMegaVortex6025(long j, FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836) {
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245;
        long j2;
        long j3;
        long j4 = j;
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        int FrostHunterServiceEliteCelestialThunder1757 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757();
        if (FrostHunterServiceEliteCelestialThunder1757 >= 0 && j4 >= 0) {
            long j5 = FrostHunterServiceEliteCelestialThunder1757;
            if (j4 + j5 <= this.FrostHunterFlowMaxDragonHero5809 && FrostHunterServiceEliteCelestialThunder1757 <= frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757()) {
                if (FrostHunterServiceEliteCelestialThunder1757 == 0) {
                    return true;
                }
                byte[] bArr = FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761;
                long j6 = j4 + 1;
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757(), 0L, j5);
                if (FrostHunterServiceEliteCelestialThunder1757 <= 0) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("byteCount == 0");
                    return false;
                }
                if (j4 < 0) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("fromIndex < 0: ", j4));
                    return false;
                }
                if (j4 > j6) {
                    throw new IllegalArgumentException(("fromIndex > toIndex: " + j4 + " > " + j6).toString());
                }
                long j7 = this.FrostHunterFlowMaxDragonHero5809;
                if (j6 > j7) {
                    j6 = j7;
                }
                if (j4 == j6 || (frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814) == null) {
                    j3 = -1;
                    j2 = -1;
                } else if (j7 - j4 < j4) {
                    while (j7 > j4) {
                        frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
                        frostHunterMaterialCardViewTitanMax3245.getClass();
                        j7 -= frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    }
                    j2 = -1;
                    byte[] FrostHunterCameraXPixelTurboCosmos9814 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterCameraXPixelTurboCosmos9814();
                    byte b = FrostHunterCameraXPixelTurboCosmos9814[0];
                    long min = Math.min(j6, (this.FrostHunterFlowMaxDragonHero5809 - j5) + 1);
                    loop1: while (j7 < min) {
                        byte[] bArr2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
                        int min2 = (int) Math.min(frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475, (frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min) - j7);
                        for (int i = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j4) - j7); i < min2; i++) {
                            if (bArr2[i] == b && FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245, i + 1, FrostHunterCameraXPixelTurboCosmos9814, 1, FrostHunterServiceEliteCelestialThunder1757)) {
                                j3 = (i - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j7;
                                break loop1;
                            }
                        }
                        j7 += frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                        frostHunterMaterialCardViewTitanMax3245.getClass();
                        j4 = j7;
                    }
                    j3 = j2;
                } else {
                    j2 = -1;
                    long j8 = 0;
                    while (true) {
                        long j9 = j8 + (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        if (j9 > j4) {
                            break;
                        }
                        frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                        frostHunterMaterialCardViewTitanMax3245.getClass();
                        j8 = j9;
                    }
                    byte[] FrostHunterCameraXPixelTurboCosmos98142 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterCameraXPixelTurboCosmos9814();
                    byte b2 = FrostHunterCameraXPixelTurboCosmos98142[0];
                    long min3 = Math.min(j6, (this.FrostHunterFlowMaxDragonHero5809 - j5) + 1);
                    loop4: while (j8 < min3) {
                        byte[] bArr3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
                        int min4 = (int) Math.min(frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475, (frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min3) - j8);
                        for (int i2 = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j4) - j8); i2 < min4; i2++) {
                            if (bArr3[i2] == b2 && FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245, i2 + 1, FrostHunterCameraXPixelTurboCosmos98142, 1, FrostHunterServiceEliteCelestialThunder1757)) {
                                j3 = (i2 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j8;
                                break loop4;
                            }
                        }
                        j8 += frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                        frostHunterMaterialCardViewTitanMax3245.getClass();
                        j4 = j8;
                    }
                    j3 = j2;
                }
                return j3 != j2;
            }
        }
        return false;
    }

    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836) {
        int i;
        int i2;
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMaterialCardViewTitanMax3245 == null) {
            return -1L;
        }
        long j = this.FrostHunterFlowMaxDragonHero5809;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                j -= frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            if (frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757() == 2) {
                byte FrostHunterFlowMaxDragonHero5809 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(0);
                byte FrostHunterFlowMaxDragonHero58092 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(1);
                while (j < this.FrostHunterFlowMaxDragonHero5809) {
                    byte[] bArr = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
                    i = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j2) - j);
                    int i3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b != FrostHunterFlowMaxDragonHero5809 && b != FrostHunterFlowMaxDragonHero58092) {
                            i++;
                        }
                        i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    }
                    j2 = (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j;
                    frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                    frostHunterMaterialCardViewTitanMax3245.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] FrostHunterCameraXPixelTurboCosmos9814 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterCameraXPixelTurboCosmos9814();
            while (j < this.FrostHunterFlowMaxDragonHero5809) {
                byte[] bArr2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
                i = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j2) - j);
                int i4 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : FrostHunterCameraXPixelTurboCosmos9814) {
                        if (b2 == b3) {
                            i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        }
                    }
                    i++;
                }
                j2 = (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j;
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j;
            if (j3 > 0) {
                break;
            }
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            j = j3;
        }
        if (frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757() == 2) {
            byte FrostHunterFlowMaxDragonHero58093 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(0);
            byte FrostHunterFlowMaxDragonHero58094 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(1);
            while (j < this.FrostHunterFlowMaxDragonHero5809) {
                byte[] bArr3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
                i = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j2) - j);
                int i5 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 != FrostHunterFlowMaxDragonHero58093 && b4 != FrostHunterFlowMaxDragonHero58094) {
                        i++;
                    }
                    i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                }
                j2 = (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j;
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] FrostHunterCameraXPixelTurboCosmos98142 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterCameraXPixelTurboCosmos9814();
        while (j < this.FrostHunterFlowMaxDragonHero5809) {
            byte[] bArr4 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
            i = (int) ((frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + j2) - j);
            int i6 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : FrostHunterCameraXPixelTurboCosmos98142) {
                    if (b5 == b6) {
                        i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    }
                }
                i++;
            }
            j2 = (frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j;
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246, long j, long j2) {
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        long j3 = j;
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(this.FrostHunterFlowMaxDragonHero5809, j3, j2);
        if (j2 == 0) {
            return;
        }
        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 += j2;
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        while (true) {
            frostHunterMaterialCardViewTitanMax3245.getClass();
            long j4 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        long j5 = j2;
        while (j5 > 0) {
            frostHunterMaterialCardViewTitanMax3245.getClass();
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterBundlePulseFusionHero2475 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475();
            int i = FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ((int) j3);
            FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
            FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475 = Math.min(i + ((int) j5), FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475);
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
            if (frostHunterMaterialCardViewTitanMax32452 == null) {
                FrostHunterBundlePulseFusionHero2475.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterBundlePulseFusionHero2475;
                FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterBundlePulseFusionHero2475;
                frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterBundlePulseFusionHero2475;
            } else {
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32453 = frostHunterMaterialCardViewTitanMax32452.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax32453.getClass();
                frostHunterMaterialCardViewTitanMax32453.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero2475);
            }
            j5 -= FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475 - FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            j3 = 0;
        }
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        if (j < 0 || j > 2147483647L) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount: ", j));
            return null;
        }
        if (this.FrostHunterFlowMaxDragonHero5809 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new FrostHunterBarrierStrikeDragonOlympian9836(FrostHunterTextViewDragonStormMega4297(j));
        }
        FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterCardViewSpectraCyber7714 = FrostHunterCardViewSpectraCyber7714((int) j);
        skip(j);
        return FrostHunterCardViewSpectraCyber7714;
    }

    public final FrostHunterValueAnimatorShadowInferno2629 FrostHunterLightSensorForceFusion4241(FrostHunterValueAnimatorShadowInferno2629 frostHunterValueAnimatorShadowInferno2629) {
        frostHunterValueAnimatorShadowInferno2629.getClass();
        byte[] bArr = FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterValueAnimatorShadowInferno2629 == FrostHunterTransitionGammaTitanSpeed7178.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            frostHunterValueAnimatorShadowInferno2629 = new FrostHunterValueAnimatorShadowInferno2629();
        }
        if (frostHunterValueAnimatorShadowInferno2629.FrostHunterCameraXPixelTurboCosmos9814 != null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("already attached to a buffer");
            return null;
        }
        frostHunterValueAnimatorShadowInferno2629.FrostHunterCameraXPixelTurboCosmos9814 = this;
        frostHunterValueAnimatorShadowInferno2629.FrostHunterFlowMaxDragonHero5809 = true;
        return frostHunterValueAnimatorShadowInferno2629;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final String FrostHunterLooperThreadBetaHyperionMax1000(long j) {
        if (j < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200((byte) 10, 0L, j2);
        if (FrostHunterAlertDialogAuroraDelta3200 != -1) {
            return FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAlertDialogAuroraDelta3200, this);
        }
        if (j2 < this.FrostHunterFlowMaxDragonHero5809 && FrostHunterFlowMaxDragonHero5809(j2 - 1) == 13 && FrostHunterFlowMaxDragonHero5809(j2) == 10) {
            return FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, this);
        }
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
        FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterMergeSpeedHyperionBlaze4246, 0L, Math.min(32L, this.FrostHunterFlowMaxDragonHero5809));
        throw new EOFException("\\n not found: limit=" + Math.min(this.FrostHunterFlowMaxDragonHero5809, j) + " content=" + frostHunterMergeSpeedHyperionBlaze4246.FrostHunterLifecycleBlazeGammaElite2889(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809).FrostHunterLifecycleBlazeGammaElite2889() + (char) 8230);
    }

    public final void FrostHunterMagnetometerFusionTitanium8202(long j) {
        if (j == 0) {
            FrostHunterTranslateAnimationCyberSolarUltra7101(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(i);
        byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761[(int) (15 & j)];
            j >>>= 4;
        }
        FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += i;
        this.FrostHunterFlowMaxDragonHero5809 += i;
    }

    public final void FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterFontFamilySolarSpeedCelestial8941 frostHunterFontFamilySolarSpeedCelestial8941) {
        frostHunterFontFamilySolarSpeedCelestial8941.getClass();
        while (frostHunterFontFamilySolarSpeedCelestial8941.FrostHunterResourcesTitanHyperVision5823(8192L, this) != -1) {
        }
    }

    public final String FrostHunterMeteringPointBetaCyber9571(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount: ", j));
            return null;
        }
        if (this.FrostHunterFlowMaxDragonHero5809 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i + j > frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
            return new String(FrostHunterTextViewDragonStormMega4297(j), charset);
        }
        int i2 = (int) j;
        String str = new String(frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761, i, i2, charset);
        int i3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i2;
        frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i3;
        this.FrostHunterFlowMaxDragonHero5809 -= j;
        if (i3 == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        }
        return str;
    }

    public final void FrostHunterMeteringPointMegaCyber7955(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836) {
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        frostHunterBarrierStrikeDragonOlympian9836.FrostHunterResourcesTitanHyperVision5823(this, frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757());
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final void FrostHunterMotionSceneAuroraMega2271(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        long j2 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 >= j) {
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterServiceConnectionTurboPhoenixOmega6719(j, this);
        } else {
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterServiceConnectionTurboPhoenixOmega6719(j2, this);
            throw new EOFException();
        }
    }

    public final void FrostHunterPagingDataTurboTitanium7332(int i) {
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(4);
        byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 = i2 + 4;
        this.FrostHunterFlowMaxDragonHero5809 += 4;
    }

    public final void FrostHunterPermissionInfoAlphaDelta6279(int i) {
        if (i < 128) {
            FrostHunterTranslateAnimationCyberSolarUltra7101(i);
            return;
        }
        if (i < 2048) {
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(2);
            byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
            int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 = i2 + 2;
            this.FrostHunterFlowMaxDragonHero5809 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            FrostHunterTranslateAnimationCyberSolarUltra7101(63);
            return;
        }
        if (i < 65536) {
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo16342 = FrostHunterViewPhantomNeo1634(3);
            byte[] bArr2 = FrostHunterViewPhantomNeo16342.FrostHunterAlphaAnimationNeoCosmos5761;
            int i3 = FrostHunterViewPhantomNeo16342.FrostHunterBundlePulseFusionHero2475;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            FrostHunterViewPhantomNeo16342.FrostHunterBundlePulseFusionHero2475 = i3 + 3;
            this.FrostHunterFlowMaxDragonHero5809 += 3;
            return;
        }
        if (i > 1114111) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Unexpected code point: 0x".concat(FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorStateListInflaterNovaQuantum4229(i)));
            return;
        }
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo16343 = FrostHunterViewPhantomNeo1634(4);
        byte[] bArr3 = FrostHunterViewPhantomNeo16343.FrostHunterAlphaAnimationNeoCosmos5761;
        int i4 = FrostHunterViewPhantomNeo16343.FrostHunterBundlePulseFusionHero2475;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        FrostHunterViewPhantomNeo16343.FrostHunterBundlePulseFusionHero2475 = i4 + 4;
        this.FrostHunterFlowMaxDragonHero5809 += 4;
    }

    public final void FrostHunterR8MasterNebulaSpark7247(int i) {
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(2);
        byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 = i2 + 2;
        this.FrostHunterFlowMaxDragonHero5809 += 2;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566(long j) {
        return this.FrostHunterFlowMaxDragonHero5809 >= j;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (j < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterServiceConnectionTurboPhoenixOmega6719(j, this);
        return j;
    }

    public final void FrostHunterRewardedAdMasterStrike9463(String str, int i, int i2) {
        char charAt;
        str.getClass();
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("endIndex > string.length: ", i2, " > ");
            FrostHunterServiceConnectionTurboPhoenixOmega6719.append(str.length());
            throw new IllegalArgumentException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(1);
                byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
                int i3 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
                int i6 = (i3 + i) - i5;
                FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 = i5 + i6;
                this.FrostHunterFlowMaxDragonHero5809 += i6;
            } else {
                if (charAt2 < 2048) {
                    FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo16342 = FrostHunterViewPhantomNeo1634(2);
                    byte[] bArr2 = FrostHunterViewPhantomNeo16342.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i7 = FrostHunterViewPhantomNeo16342.FrostHunterBundlePulseFusionHero2475;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    FrostHunterViewPhantomNeo16342.FrostHunterBundlePulseFusionHero2475 = i7 + 2;
                    this.FrostHunterFlowMaxDragonHero5809 += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo16343 = FrostHunterViewPhantomNeo1634(3);
                    byte[] bArr3 = FrostHunterViewPhantomNeo16343.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i8 = FrostHunterViewPhantomNeo16343.FrostHunterBundlePulseFusionHero2475;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    FrostHunterViewPhantomNeo16343.FrostHunterBundlePulseFusionHero2475 = i8 + 3;
                    this.FrostHunterFlowMaxDragonHero5809 += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        FrostHunterTranslateAnimationCyberSolarUltra7101(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo16344 = FrostHunterViewPhantomNeo1634(4);
                        byte[] bArr4 = FrostHunterViewPhantomNeo16344.FrostHunterAlphaAnimationNeoCosmos5761;
                        int i11 = FrostHunterViewPhantomNeo16344.FrostHunterBundlePulseFusionHero2475;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        FrostHunterViewPhantomNeo16344.FrostHunterBundlePulseFusionHero2475 = i11 + 4;
                        this.FrostHunterFlowMaxDragonHero5809 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final long FrostHunterScaleAnimationStrikeSpark5059(FrostHunterCameraViewPhantomUltraHyperion8580 frostHunterCameraViewPhantomUltraHyperion8580) {
        long j = this.FrostHunterFlowMaxDragonHero5809;
        if (j > 0) {
            frostHunterCameraViewPhantomUltraHyperion8580.FrostHunterServiceConnectionTurboPhoenixOmega6719(j, this);
        }
        return j;
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (frostHunterMergeSpeedHyperionBlaze4246 == this) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("source == this");
            return;
        }
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809, 0L, j);
        while (j > 0) {
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterMaterialCardViewTitanMax32452.getClass();
            long j2 = i - frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i2 = 0;
            if (j < j2) {
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32453 = this.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32454 = frostHunterMaterialCardViewTitanMax32453 != null ? frostHunterMaterialCardViewTitanMax32453.FrostHunterRemoteConfigSpeedSpeed8566 : null;
                if (frostHunterMaterialCardViewTitanMax32454 != null && frostHunterMaterialCardViewTitanMax32454.FrostHunterLifecycleBlazeGammaElite2889) {
                    if ((frostHunterMaterialCardViewTitanMax32454.FrostHunterBundlePulseFusionHero2475 + j) - (frostHunterMaterialCardViewTitanMax32454.FrostHunterServiceEliteCelestialThunder1757 ? 0 : frostHunterMaterialCardViewTitanMax32454.FrostHunterConstraintSetCloneMasterUltraRogue2633) <= 8192) {
                        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32455 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
                        frostHunterMaterialCardViewTitanMax32455.getClass();
                        frostHunterMaterialCardViewTitanMax32455.FrostHunterServiceEliteCelestialThunder1757(frostHunterMaterialCardViewTitanMax32454, (int) j);
                        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 -= j;
                        this.FrostHunterFlowMaxDragonHero5809 += j;
                        return;
                    }
                }
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32456 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterMaterialCardViewTitanMax32456.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > frostHunterMaterialCardViewTitanMax32456.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax32456.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMaterialCardViewTitanMax32456.FrostHunterBundlePulseFusionHero2475();
                } else {
                    FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterLayoutNeoCyberMega2992.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    byte[] bArr = frostHunterMaterialCardViewTitanMax32456.FrostHunterAlphaAnimationNeoCosmos5761;
                    byte[] bArr2 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i4 = frostHunterMaterialCardViewTitanMax32456.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewThunderNovaX6772(0, i4, i4 + i3, bArr, bArr2);
                }
                FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i3;
                frostHunterMaterialCardViewTitanMax32456.FrostHunterConstraintSetCloneMasterUltraRogue2633 += i3;
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32457 = frostHunterMaterialCardViewTitanMax32456.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax32457.getClass();
                frostHunterMaterialCardViewTitanMax32457.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterConstraintSetCloneMasterUltraRogue2633);
                frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32458 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterMaterialCardViewTitanMax32458.getClass();
            long j3 = frostHunterMaterialCardViewTitanMax32458.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax32458.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax32458.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32459 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (frostHunterMaterialCardViewTitanMax32459 == null) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax32458;
                frostHunterMaterialCardViewTitanMax32458.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterMaterialCardViewTitanMax32458;
                frostHunterMaterialCardViewTitanMax32458.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterMaterialCardViewTitanMax32458;
            } else {
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax324510 = frostHunterMaterialCardViewTitanMax32459.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax324510.getClass();
                frostHunterMaterialCardViewTitanMax324510.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterMaterialCardViewTitanMax32458);
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax324511 = frostHunterMaterialCardViewTitanMax32458.FrostHunterRemoteConfigSpeedSpeed8566;
                if (frostHunterMaterialCardViewTitanMax324511 == frostHunterMaterialCardViewTitanMax32458) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("cannot compact");
                    return;
                }
                frostHunterMaterialCardViewTitanMax324511.getClass();
                if (frostHunterMaterialCardViewTitanMax324511.FrostHunterLifecycleBlazeGammaElite2889) {
                    int i5 = frostHunterMaterialCardViewTitanMax32458.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax32458.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax324512 = frostHunterMaterialCardViewTitanMax32458.FrostHunterRemoteConfigSpeedSpeed8566;
                    frostHunterMaterialCardViewTitanMax324512.getClass();
                    int i6 = 8192 - frostHunterMaterialCardViewTitanMax324512.FrostHunterBundlePulseFusionHero2475;
                    FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax324513 = frostHunterMaterialCardViewTitanMax32458.FrostHunterRemoteConfigSpeedSpeed8566;
                    frostHunterMaterialCardViewTitanMax324513.getClass();
                    if (!frostHunterMaterialCardViewTitanMax324513.FrostHunterServiceEliteCelestialThunder1757) {
                        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax324514 = frostHunterMaterialCardViewTitanMax32458.FrostHunterRemoteConfigSpeedSpeed8566;
                        frostHunterMaterialCardViewTitanMax324514.getClass();
                        i2 = frostHunterMaterialCardViewTitanMax324514.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    }
                    if (i5 <= i6 + i2) {
                        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax324515 = frostHunterMaterialCardViewTitanMax32458.FrostHunterRemoteConfigSpeedSpeed8566;
                        frostHunterMaterialCardViewTitanMax324515.getClass();
                        frostHunterMaterialCardViewTitanMax32458.FrostHunterServiceEliteCelestialThunder1757(frostHunterMaterialCardViewTitanMax324515, i5);
                        frostHunterMaterialCardViewTitanMax32458.FrostHunterAlphaAnimationNeoCosmos5761();
                        FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax32458);
                    }
                }
            }
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 -= j3;
            this.FrostHunterFlowMaxDragonHero5809 += j3;
            j -= j3;
        }
    }

    public final long FrostHunterServiceEliteCelestialThunder1757() {
        long j = this.FrostHunterFlowMaxDragonHero5809;
        if (j == 0) {
            return 0L;
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
        frostHunterMaterialCardViewTitanMax32452.getClass();
        return (frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 >= 8192 || !frostHunterMaterialCardViewTitanMax32452.FrostHunterLifecycleBlazeGammaElite2889) ? j : j - (r2 - frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final void FrostHunterServiceInfoHyperionSparkMax9966(long j) {
        if (this.FrostHunterFlowMaxDragonHero5809 < j) {
            throw new EOFException();
        }
    }

    public final void FrostHunterStateCelestialNovaPixel8414(long j) {
        boolean z;
        if (j == 0) {
            FrostHunterTranslateAnimationCyberSolarUltra7101(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                FrostHunterFCMDeltaQuantumHero8364("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(i);
        byte[] bArr2 = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += i;
        this.FrostHunterFlowMaxDragonHero5809 += i;
    }

    public final byte[] FrostHunterTextViewDragonStormMega4297(long j) {
        if (j < 0 || j > 2147483647L) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount: ", j));
            return null;
        }
        if (this.FrostHunterFlowMaxDragonHero5809 < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final void FrostHunterTranslateAnimationCyberSolarUltra7101(int i) {
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(1);
        byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
        FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 = i2 + 1;
        bArr[i2] = (byte) i;
        this.FrostHunterFlowMaxDragonHero5809++;
    }

    public final FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634(int i) {
        if (i < 1 || i > 8192) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("unexpected capacity");
            return null;
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMaterialCardViewTitanMax3245 == null) {
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterLayoutNeoCyberMega2992.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            return FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
        frostHunterMaterialCardViewTitanMax32452.getClass();
        if (frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 + i <= 8192 && frostHunterMaterialCardViewTitanMax32452.FrostHunterLifecycleBlazeGammaElite2889) {
            return frostHunterMaterialCardViewTitanMax32452;
        }
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterLayoutNeoCyberMega2992.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterConstraintSetCloneMasterUltraRogue26332);
        return FrostHunterConstraintSetCloneMasterUltraRogue26332;
    }

    public final Object clone() {
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
        if (this.FrostHunterFlowMaxDragonHero5809 == 0) {
            return frostHunterMergeSpeedHyperionBlaze4246;
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        FrostHunterMaterialCardViewTitanMax3245 FrostHunterBundlePulseFusionHero2475 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475();
        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterBundlePulseFusionHero2475;
        FrostHunterBundlePulseFusionHero2475.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterBundlePulseFusionHero2475;
        FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterBundlePulseFusionHero2475;
        for (FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232; frostHunterMaterialCardViewTitanMax32452 != frostHunterMaterialCardViewTitanMax3245; frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax32452.FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32453 = FrostHunterBundlePulseFusionHero2475.FrostHunterRemoteConfigSpeedSpeed8566;
            frostHunterMaterialCardViewTitanMax32453.getClass();
            frostHunterMaterialCardViewTitanMax32452.getClass();
            frostHunterMaterialCardViewTitanMax32453.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475());
        }
        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 = this.FrostHunterFlowMaxDragonHero5809;
        return frostHunterMergeSpeedHyperionBlaze4246;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterMergeSpeedHyperionBlaze4246)) {
            return false;
        }
        long j = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = (FrostHunterMergeSpeedHyperionBlaze4246) obj;
        if (j != frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax32452.getClass();
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j2 = 0;
        while (j2 < this.FrostHunterFlowMaxDragonHero5809) {
            long min = Math.min(frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - i, frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761[i] != frostHunterMaterialCardViewTitanMax32452.FrostHunterAlphaAnimationNeoCosmos5761[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
                frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            if (i2 == frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475) {
                frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax32452.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterMaterialCardViewTitanMax32452.getClass();
                i2 = frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMaterialCardViewTitanMax3245 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
            for (int i3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633; i3 < i2; i3++) {
                i = (i * 31) + frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761[i3];
            }
            frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterMaterialCardViewTitanMax3245.getClass();
        } while (frostHunterMaterialCardViewTitanMax3245 != this.FrostHunterCameraXPixelTurboCosmos9814);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(bArr.length, i, i2);
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMaterialCardViewTitanMax3245 == null) {
            return -1;
        }
        int min = Math.min(i2, frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        byte[] bArr2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewThunderNovaX6772(i, i3, i3 + min, bArr2, bArr);
        int i4 = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min;
        frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
        this.FrostHunterFlowMaxDragonHero5809 -= min;
        if (i4 == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        }
        return min;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final byte readByte() {
        if (this.FrostHunterFlowMaxDragonHero5809 == 0) {
            throw new EOFException();
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
        int i3 = i + 1;
        byte b = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761[i];
        this.FrostHunterFlowMaxDragonHero5809--;
        if (i3 != i2) {
            frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i3;
            return b;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        return b;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final int readInt() {
        if (this.FrostHunterFlowMaxDragonHero5809 < 4) {
            throw new EOFException();
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.FrostHunterFlowMaxDragonHero5809 -= 4;
        if (i5 != i2) {
            frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i5;
            return i6;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        return i6;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final long readLong() {
        if (this.FrostHunterFlowMaxDragonHero5809 < 8) {
            throw new EOFException();
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.FrostHunterFlowMaxDragonHero5809 -= 8;
        if (i4 != i2) {
            frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
            return j2;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        return j2;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final short readShort() {
        if (this.FrostHunterFlowMaxDragonHero5809 < 2) {
            throw new EOFException();
        }
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterMaterialCardViewTitanMax3245.getClass();
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.FrostHunterFlowMaxDragonHero5809 -= 2;
        if (i5 == i2) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        } else {
            frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i5;
        }
        return (short) i6;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final void skip(long j) {
        while (j > 0) {
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (frostHunterMaterialCardViewTitanMax3245 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            long j2 = min;
            this.FrostHunterFlowMaxDragonHero5809 -= j2;
            j -= j2;
            int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min;
            frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
            if (i == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
            }
        }
    }

    public final String toString() {
        long j = this.FrostHunterFlowMaxDragonHero5809;
        if (j <= 2147483647L) {
            return FrostHunterCardViewSpectraCyber7714((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.FrostHunterFlowMaxDragonHero5809).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(1);
            int min = Math.min(i, 8192 - FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475);
            byteBuffer.get(FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475, min);
            i -= min;
            FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += min;
        }
        this.FrostHunterFlowMaxDragonHero5809 += remaining;
        return remaining;
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580
    public final /* bridge */ /* synthetic */ FrostHunterCameraViewPhantomUltraHyperion8580 writeByte(int i) {
        FrostHunterTranslateAnimationCyberSolarUltra7101(i);
        return this;
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580
    public final /* bridge */ /* synthetic */ FrostHunterCameraViewPhantomUltraHyperion8580 writeInt(int i) {
        FrostHunterPagingDataTurboTitanium7332(i);
        return this;
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580
    public final /* bridge */ /* synthetic */ FrostHunterCameraViewPhantomUltraHyperion8580 writeShort(int i) {
        FrostHunterR8MasterNebulaSpark7247(i);
        return this;
    }

    @Override // android.content.Context.FrostHunterJobSchedulerEpicAuroraNebula9616
    public final FrostHunterMergeSpeedHyperionBlaze4246 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final void close() {
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580, android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Flushable
    public final void flush() {
    }

    @Override // android.content.Context.FrostHunterCameraViewPhantomUltraHyperion8580
    public final FrostHunterCameraViewPhantomUltraHyperion8580 write(byte[] bArr) {
        FrostHunterBillingClientFusionVortex9008(bArr, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMaterialCardViewTitanMax3245 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        byteBuffer.put(frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633, min);
        int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min;
        frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterFlowMaxDragonHero5809 -= min;
        if (i == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
        }
        return min;
    }
}
