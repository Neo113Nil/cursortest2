package android.content.Context;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLicensingSpectraPulse8868 {
    public byte[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final char[] FrostHunterServiceEliteCelestialThunder1757 = {'\r', '\n'};
    public static final char[] FrostHunterLifecycleBlazeGammaElite2889 = {'\n'};
    public static final FrostHunterDialogVortexMega8716 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterDialogVortexMega8716.FrostHunterAlertDialogAuroraDelta3200(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean FrostHunterRemoteConfigSpeedSpeed8566 = new AtomicBoolean();

    public FrostHunterLicensingSpectraPulse8868(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new byte[i];
        this.FrostHunterBundlePulseFusionHero2475 = i;
    }

    public static int FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return FrostHunterRemoteConfigPhantomDelta1739.FrostHunterLooperHyperionForce4133((byte) 0, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlphaAnimationNeoCosmos5761(((i & 7) << 2) | ((i2 & 48) >> 4)), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlphaAnimationNeoCosmos5761(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlphaAnimationNeoCosmos5761(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    public static boolean FrostHunterLifecycleBlazeGammaElite2889(byte b) {
        return (b & 192) == 128;
    }

    public static int FrostHunterServiceEliteCelestialThunder1757(Charset charset) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271(FrostHunterLevelListDrawableFusionDragonHero2232.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public final int FrostHunterAlertDialogAuroraDelta3200() {
        FrostHunterLevelListDrawableFusionDragonHero2232(1);
        return this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633] & 255;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return Math.max(this.FrostHunterBundlePulseFusionHero2475 - this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0);
    }

    public final int FrostHunterBillingClientFusionVortex9008() {
        FrostHunterLevelListDrawableFusionDragonHero2232(2);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final short FrostHunterBitmapTurboDeltaNebula8743() {
        FrostHunterLevelListDrawableFusionDragonHero2232(2);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i) {
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i > bArr.length) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = Arrays.copyOf(bArr, i);
        }
    }

    public final int FrostHunterCameraXPixelTurboCosmos9814(Charset charset) {
        int i;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271(FrostHunterLevelListDrawableFusionDragonHero2232.contains(charset), "Unsupported charset: %s", charset);
        if (FrostHunterAlphaAnimationNeoCosmos5761() < FrostHunterServiceEliteCelestialThunder1757(charset)) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterAlertDialogAuroraDelta3200(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633];
            if ((b & 128) == 0) {
                i = b & 255;
                return (i << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633];
            int i3 = (b2 & 128) == 0 ? 1 : ((b2 & 224) == 192 && FrostHunterAlphaAnimationNeoCosmos5761() >= 2 && FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 1])) ? 2 : ((this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633] & 240) == 224 && FrostHunterAlphaAnimationNeoCosmos5761() >= 3 && FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 1]) && FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 2])) ? 3 : ((this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633] & 248) == 240 && FrostHunterAlphaAnimationNeoCosmos5761() >= 4 && FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 1]) && FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 2]) && FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + 3])) ? 4 : 0;
            if (i3 == 1) {
                i = this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633] & 255;
            } else if (i3 == 2) {
                byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int i4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                i = FrostHunterConstraintSetCloneMasterUltraRogue2633(0, 0, bArr[i4], bArr[i4 + 1]);
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        byte[] bArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                        int i5 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        i = FrostHunterConstraintSetCloneMasterUltraRogue2633(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int i6 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                i = FrostHunterConstraintSetCloneMasterUltraRogue2633(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
            }
            i2 = i3;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterRemoteConfigSpeedSpeed8566(0, byteOrder);
            if (!Character.isHighSurrogate(FrostHunterRemoteConfigSpeedSpeed85662) || FrostHunterAlphaAnimationNeoCosmos5761() < 4) {
                i = FrostHunterRemoteConfigSpeedSpeed85662;
                i2 = 2;
            } else {
                i = Character.toCodePoint(FrostHunterRemoteConfigSpeedSpeed85662, FrostHunterRemoteConfigSpeedSpeed8566(2, byteOrder));
                i2 = 4;
            }
        }
        return (i << 8) | i2;
    }

    public final int FrostHunterCameraXTurboCelestialHero5430() {
        int FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterScaleAnimationStrikeSpark5059();
        if (FrostHunterScaleAnimationStrikeSpark5059 >= 0) {
            return FrostHunterScaleAnimationStrikeSpark5059;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Top bit not zero: ", FrostHunterScaleAnimationStrikeSpark5059));
        return 0;
    }

    public final int FrostHunterCardViewSpectraCyber7714() {
        int FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719();
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719 >= 0) {
            return FrostHunterServiceConnectionTurboPhoenixOmega6719;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Top bit not zero: ", FrostHunterServiceConnectionTurboPhoenixOmega6719));
        return 0;
    }

    public final int FrostHunterDatabaseEliteShadowUltra2452() {
        FrostHunterLevelListDrawableFusionDragonHero2232(3);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public final String FrostHunterDialogFragmentTurboPhoenixDragon7627(int i, Charset charset) {
        FrostHunterLevelListDrawableFusionDragonHero2232(i);
        String str = new String(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, i, charset);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 += i;
        return str;
    }

    public final long FrostHunterEditTextPulseHyperion1262() {
        FrostHunterLevelListDrawableFusionDragonHero2232(4);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r3] & 255) << 16) | ((bArr[r8] & 255) << 8);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        return (bArr[r5] & 255) | j;
    }

    public final void FrostHunterFCMDeltaQuantumHero8364(int i) {
        FrostHunterR8MasterNebulaSpark7247(this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i);
    }

    public final long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        FrostHunterLevelListDrawableFusionDragonHero2232(8);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 24);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 32);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 40);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 48);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 8;
        return ((bArr[r5] & 255) << 56) | j5;
    }

    public final int FrostHunterFlowMaxDragonHero5809() {
        if (FrostHunterAlphaAnimationNeoCosmos5761() < 4) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterAlertDialogAuroraDelta3200(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
            return 0;
        }
        int FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 -= 4;
        return FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    public final char FrostHunterFragmentBetaMegaVortex6025(Charset charset, char[] cArr) {
        int FrostHunterCameraXPixelTurboCosmos9814;
        if (FrostHunterAlphaAnimationNeoCosmos5761() >= FrostHunterServiceEliteCelestialThunder1757(charset) && (FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(charset)) != 0) {
            long j = FrostHunterCameraXPixelTurboCosmos9814 >>> 8;
            FrostHunterCanvasInfernoVortex4700.FrostHunterLooperThreadBetaHyperionMax1000((j >> 32) == 0, "out of range: %s", j);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                FrostHunterCanvasInfernoVortex4700.FrostHunterLooperThreadBetaHyperionMax1000(((long) c) == j2, "Out of range: %s", j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(FrostHunterCameraXPixelTurboCosmos9814 & 255) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final void FrostHunterKeyframeGammaGamma1197(byte[] bArr, int i, int i2) {
        FrostHunterLevelListDrawableFusionDragonHero2232(i2);
        System.arraycopy(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, bArr, i, i2);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 += i2;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        if (!FrostHunterRemoteConfigSpeedSpeed8566.get() || FrostHunterAlphaAnimationNeoCosmos5761() >= i) {
            return;
        }
        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("bytesNeeded= ", i, ", bytesLeft=");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(FrostHunterAlphaAnimationNeoCosmos5761());
        throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
    }

    public final String FrostHunterLightSensorForceFusion4241(Charset charset) {
        int i;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271(FrostHunterLevelListDrawableFusionDragonHero2232.contains(charset), "Unsupported charset: %s", charset);
        if (FrostHunterAlphaAnimationNeoCosmos5761() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            FrostHunterTranslateAnimationCyberSolarUltra7101();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterCameraXPixelTurboCosmos9814(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (true) {
            int i3 = this.FrostHunterBundlePulseFusionHero2475;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b = this.FrostHunterAlphaAnimationNeoCosmos5761[i2];
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                if (b != 10) {
                    if (b == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if (bArr[i2] == 0) {
                    byte b2 = bArr[i2 + 1];
                    String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (b2 != 10) {
                        if (b2 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if (bArr2[i2 + 1] == 0) {
                    byte b3 = bArr2[i2];
                    String str3 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (b3 == 10 || b3 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i2 += i;
        }
        String FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterDialogFragmentTurboPhoenixDragon7627(i2 - this.FrostHunterConstraintSetCloneMasterUltraRogue2633, charset);
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != this.FrostHunterBundlePulseFusionHero2475 && FrostHunterFragmentBetaMegaVortex6025(charset, FrostHunterServiceEliteCelestialThunder1757) == '\r') {
            FrostHunterFragmentBetaMegaVortex6025(charset, FrostHunterLifecycleBlazeGammaElite2889);
        }
        return FrostHunterDialogFragmentTurboPhoenixDragon7627;
    }

    public final long FrostHunterLintTitanVortexQuantum9911() {
        FrostHunterLevelListDrawableFusionDragonHero2232(4);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        return ((bArr[r5] & 255) << 24) | j;
    }

    public final int FrostHunterLooperHyperionForce4133() {
        return FrostHunterMeteringPointBetaCyber9571() | (FrostHunterMeteringPointBetaCyber9571() << 21) | (FrostHunterMeteringPointBetaCyber9571() << 14) | (FrostHunterMeteringPointBetaCyber9571() << 7);
    }

    public final String FrostHunterLooperThreadBetaHyperionMax1000() {
        if (FrostHunterAlphaAnimationNeoCosmos5761() == 0) {
            return null;
        }
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (i < this.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterAlphaAnimationNeoCosmos5761[i] != 0) {
            i++;
        }
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        if (i < this.FrostHunterBundlePulseFusionHero2475) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        }
        return str2;
    }

    public final void FrostHunterMagnetometerFusionTitanium8202(byte[] bArr, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
    }

    public final long FrostHunterMediaPlayerCelestialBetaTitan3868() {
        int i;
        FrostHunterLevelListDrawableFusionDragonHero2232(1);
        long j = this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r6 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("Invalid UTF-8 sequence first byte: ", j));
        }
        FrostHunterLevelListDrawableFusionDragonHero2232(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.FrostHunterAlphaAnimationNeoCosmos5761[this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i3] & 192) != 128) {
                throw new NumberFormatException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r4 & 63);
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 += i;
        return j;
    }

    public final int FrostHunterMeteringPointBetaCyber9571() {
        FrostHunterLevelListDrawableFusionDragonHero2232(1);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        return bArr[i] & 255;
    }

    public final long FrostHunterMeteringPointMegaCyber7955() {
        long FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297();
        if (FrostHunterTextViewDragonStormMega4297 >= 0) {
            return FrostHunterTextViewDragonStormMega4297;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("Top bit not zero: ", FrostHunterTextViewDragonStormMega4297));
        return 0L;
    }

    public final String FrostHunterMotionSceneAuroraMega2271(int i) {
        FrostHunterLevelListDrawableFusionDragonHero2232(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.FrostHunterBundlePulseFusionHero2475 || this.FrostHunterAlphaAnimationNeoCosmos5761[i3] != 0) ? i : i - 1;
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 += i;
        return str2;
    }

    public final void FrostHunterPagingDataTurboTitanium7332(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i >= 0 && i <= this.FrostHunterAlphaAnimationNeoCosmos5761.length);
        this.FrostHunterBundlePulseFusionHero2475 = i;
    }

    public final void FrostHunterR8MasterNebulaSpark7247(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i >= 0 && i <= this.FrostHunterBundlePulseFusionHero2475);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
    }

    public final char FrostHunterRemoteConfigSpeedSpeed8566(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        FrostHunterLevelListDrawableFusionDragonHero2232(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            b = bArr[i3];
            b2 = bArr[i3 + 1];
        } else {
            int i4 = i2 + i;
            b = bArr[i4 + 1];
            b2 = bArr[i4];
        }
        return (char) ((b2 & 255) | (b << 8));
    }

    public final int FrostHunterResourcesTitanHyperVision5823() {
        FrostHunterLevelListDrawableFusionDragonHero2232(2);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = bArr[i] & 255;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int FrostHunterScaleAnimationStrikeSpark5059() {
        FrostHunterLevelListDrawableFusionDragonHero2232(4);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public final int FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        FrostHunterLevelListDrawableFusionDragonHero2232(4);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final int FrostHunterServiceInfoHyperionSparkMax9966() {
        FrostHunterLevelListDrawableFusionDragonHero2232(4);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        return i4;
    }

    public final void FrostHunterStateCelestialNovaPixel8414(int i) {
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        FrostHunterMagnetometerFusionTitanium8202(bArr, i);
    }

    public final long FrostHunterTextViewDragonStormMega4297() {
        FrostHunterLevelListDrawableFusionDragonHero2232(8);
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 2;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r3] & 255) << 48) | ((bArr[r8] & 255) << 40);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 32);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 24);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 16);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 8);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 8;
        return (bArr[r5] & 255) | j5;
    }

    public final Charset FrostHunterTranslateAnimationCyberSolarUltra7101() {
        if (FrostHunterAlphaAnimationNeoCosmos5761() >= 3) {
            byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (FrostHunterAlphaAnimationNeoCosmos5761() < 2) {
            return null;
        }
        byte[] bArr2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final int FrostHunterViewPhantomNeo1634() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == this.FrostHunterBundlePulseFusionHero2475) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Attempting to read a byte over the limit.");
                return 0;
            }
            long FrostHunterMeteringPointBetaCyber9571 = FrostHunterMeteringPointBetaCyber9571();
            j |= (127 & FrostHunterMeteringPointBetaCyber9571) << (i * 7);
            if ((FrostHunterMeteringPointBetaCyber9571 & 128) == 0) {
                break;
            }
        }
        return FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(j);
    }

    public FrostHunterLicensingSpectraPulse8868() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public FrostHunterLicensingSpectraPulse8868(byte[] bArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = bArr.length;
    }

    public FrostHunterLicensingSpectraPulse8868(byte[] bArr, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = bArr;
        this.FrostHunterBundlePulseFusionHero2475 = i;
    }
}
