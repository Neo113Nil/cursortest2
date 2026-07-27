package android.content.Context;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterThreadTitanTitanAlpha9435 extends FrostHunterLightSensorQuantumAurora4373 {
    public FrostHunterCountDownTimerStormPulseFusion5949 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterGyroscopeThunderSpark1963[] FrostHunterFragmentBetaMegaVortex6025;
    public final int FrostHunterKeyframeGammaGamma1197;
    public List FrostHunterLightSensorForceFusion4241;
    public int FrostHunterLintTitanVortexQuantum9911;
    public List FrostHunterScaleAnimationStrikeSpark5059;
    public FrostHunterGyroscopeThunderSpark1963 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterLicensingSpectraPulse8868();
    public final FrostHunterCountDownTimerStormPulseFusion5949 FrostHunterFlowMaxDragonHero5809 = new FrostHunterCountDownTimerStormPulseFusion5949();
    public int FrostHunterAlertDialogAuroraDelta3200 = -1;

    public FrostHunterThreadTitanTitanAlpha9435(int i, List list) {
        this.FrostHunterKeyframeGammaGamma1197 = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = FrostHunterTraceVisionNova3975.FrostHunterAlphaAnimationNeoCosmos5761;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterGyroscopeThunderSpark1963[8];
        int i2 = 0;
        while (true) {
            FrostHunterGyroscopeThunderSpark1963[] frostHunterGyroscopeThunderSpark1963Arr = this.FrostHunterFragmentBetaMegaVortex6025;
            if (i2 >= 8) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterGyroscopeThunderSpark1963Arr[0];
                return;
            } else {
                frostHunterGyroscopeThunderSpark1963Arr[i2] = new FrostHunterGyroscopeThunderSpark1963();
                i2++;
            }
        }
    }

    @Override // android.content.Context.FrostHunterLightSensorQuantumAurora4373
    public final boolean FrostHunterAlertDialogAuroraDelta3200() {
        return this.FrostHunterLightSensorForceFusion4241 != this.FrostHunterScaleAnimationStrikeSpark5059;
    }

    @Override // android.content.Context.FrostHunterLightSensorQuantumAurora4373
    public final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterJavaQuantumTitanPrime5258 frostHunterJavaQuantumTitanPrime5258) {
        ByteBuffer byteBuffer = frostHunterJavaQuantumTitanPrime5258.FrostHunterFragmentBetaMegaVortex6025;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(array, limit);
        while (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() >= 3) {
            int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
            int i = FrostHunterMeteringPointBetaCyber9571 & 3;
            boolean z = (FrostHunterMeteringPointBetaCyber9571 & 4) == 4;
            byte FrostHunterMeteringPointBetaCyber95712 = (byte) frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
            byte FrostHunterMeteringPointBetaCyber95713 = (byte) frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        FrostHunterKeyframeGammaGamma1197();
                        int i2 = (FrostHunterMeteringPointBetaCyber95712 & 192) >> 6;
                        int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            FrostHunterServiceConnectionTurboPhoenixOmega6719();
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Sequence number discontinuity. previous=" + this.FrostHunterAlertDialogAuroraDelta3200 + " current=" + i2);
                        }
                        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
                        int i4 = FrostHunterMeteringPointBetaCyber95712 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949 = new FrostHunterCountDownTimerStormPulseFusion5949(i2, i4);
                        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterCountDownTimerStormPulseFusion5949;
                        byte[] bArr = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterCountDownTimerStormPulseFusion5949.FrostHunterLifecycleBlazeGammaElite2889 = 1;
                        bArr[0] = FrostHunterMeteringPointBetaCyber95713;
                    } else {
                        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i == 2);
                        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion59492 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                        if (frostHunterCountDownTimerStormPulseFusion59492 == null) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterEditTextPulseHyperion1262("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = frostHunterCountDownTimerStormPulseFusion59492.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            int i5 = frostHunterCountDownTimerStormPulseFusion59492.FrostHunterLifecycleBlazeGammaElite2889;
                            int i6 = i5 + 1;
                            frostHunterCountDownTimerStormPulseFusion59492.FrostHunterLifecycleBlazeGammaElite2889 = i6;
                            bArr2[i5] = FrostHunterMeteringPointBetaCyber95712;
                            frostHunterCountDownTimerStormPulseFusion59492.FrostHunterLifecycleBlazeGammaElite2889 = i5 + 2;
                            bArr2[i6] = FrostHunterMeteringPointBetaCyber95713;
                        }
                    }
                    FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion59493 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLifecycleBlazeGammaElite2889 == (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterServiceEliteCelestialThunder1757 * 2) - 1) {
                        FrostHunterKeyframeGammaGamma1197();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List FrostHunterFragmentBetaMegaVortex6025() {
        FrostHunterThreadSolarDragonRogue5343 frostHunterThreadSolarDragonRogue5343;
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 8; i4++) {
            FrostHunterGyroscopeThunderSpark1963[] frostHunterGyroscopeThunderSpark1963Arr = this.FrostHunterFragmentBetaMegaVortex6025;
            FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark1963 = frostHunterGyroscopeThunderSpark1963Arr[i4];
            if (frostHunterGyroscopeThunderSpark1963.FrostHunterBundlePulseFusionHero2475 && (!frostHunterGyroscopeThunderSpark1963.FrostHunterAlphaAnimationNeoCosmos5761.isEmpty() || frostHunterGyroscopeThunderSpark1963.FrostHunterConstraintSetCloneMasterUltraRogue2633.length() != 0)) {
                FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark19632 = frostHunterGyroscopeThunderSpark1963Arr[i4];
                if (frostHunterGyroscopeThunderSpark19632.FrostHunterServiceEliteCelestialThunder1757) {
                    ArrayList arrayList2 = frostHunterGyroscopeThunderSpark19632.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (!frostHunterGyroscopeThunderSpark19632.FrostHunterBundlePulseFusionHero2475 || (arrayList2.isEmpty() && frostHunterGyroscopeThunderSpark19632.FrostHunterConstraintSetCloneMasterUltraRogue2633.length() == 0)) {
                        frostHunterThreadSolarDragonRogue5343 = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i5));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) frostHunterGyroscopeThunderSpark19632.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                        int i6 = frostHunterGyroscopeThunderSpark19632.FrostHunterKeyframeGammaGamma1197;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i6 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i6 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + frostHunterGyroscopeThunderSpark19632.FrostHunterKeyframeGammaGamma1197);
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = frostHunterGyroscopeThunderSpark19632.FrostHunterLevelListDrawableFusionDragonHero2232;
                            int i7 = frostHunterGyroscopeThunderSpark19632.FrostHunterCameraXPixelTurboCosmos9814;
                            int i8 = frostHunterGyroscopeThunderSpark19632.FrostHunterRemoteConfigSpeedSpeed8566;
                            if (z) {
                                f = i7 / 209.0f;
                                f2 = i8 / 74.0f;
                            } else {
                                f = i7 / 99.0f;
                                f2 = i8 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i9 = frostHunterGyroscopeThunderSpark19632.FrostHunterFlowMaxDragonHero5809;
                            i = i9 / 3;
                            if (i != 0) {
                                i2 = i9;
                                i3 = 0;
                            } else if (i == 1) {
                                i2 = i9;
                                i3 = 1;
                            } else {
                                i2 = i9;
                                i3 = 2;
                            }
                            int i10 = i2 % 3;
                            int i11 = i10 != 0 ? 0 : i10 == 1 ? 1 : 2;
                            int i12 = frostHunterGyroscopeThunderSpark19632.FrostHunterLightSensorForceFusion4241;
                            frostHunterThreadSolarDragonRogue5343 = new FrostHunterThreadSolarDragonRogue5343(spannableStringBuilder, alignment2, f4, i3, f3, i11, i12 == FrostHunterGyroscopeThunderSpark1963.FrostHunterBitmapTurboDeltaNebula8743, i12, frostHunterGyroscopeThunderSpark19632.FrostHunterLifecycleBlazeGammaElite2889);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = frostHunterGyroscopeThunderSpark19632.FrostHunterLevelListDrawableFusionDragonHero2232;
                        int i72 = frostHunterGyroscopeThunderSpark19632.FrostHunterCameraXPixelTurboCosmos9814;
                        int i82 = frostHunterGyroscopeThunderSpark19632.FrostHunterRemoteConfigSpeedSpeed8566;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i92 = frostHunterGyroscopeThunderSpark19632.FrostHunterFlowMaxDragonHero5809;
                        i = i92 / 3;
                        if (i != 0) {
                        }
                        int i102 = i2 % 3;
                        if (i102 != 0) {
                        }
                        int i122 = frostHunterGyroscopeThunderSpark19632.FrostHunterLightSensorForceFusion4241;
                        frostHunterThreadSolarDragonRogue5343 = new FrostHunterThreadSolarDragonRogue5343(spannableStringBuilder, alignment22, f42, i3, f32, i11, i122 == FrostHunterGyroscopeThunderSpark1963.FrostHunterBitmapTurboDeltaNebula8743, i122, frostHunterGyroscopeThunderSpark19632.FrostHunterLifecycleBlazeGammaElite2889);
                    }
                    if (frostHunterThreadSolarDragonRogue5343 != null) {
                        arrayList.add(frostHunterThreadSolarDragonRogue5343);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, FrostHunterThreadSolarDragonRogue5343.FrostHunterBundlePulseFusionHero2475);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList3.add(((FrostHunterThreadSolarDragonRogue5343) arrayList.get(i13)).FrostHunterAlphaAnimationNeoCosmos5761);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void FrostHunterKeyframeGammaGamma1197() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c;
        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (frostHunterCountDownTimerStormPulseFusion5949 == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (frostHunterCountDownTimerStormPulseFusion5949.FrostHunterLifecycleBlazeGammaElite2889 != (frostHunterCountDownTimerStormPulseFusion5949.FrostHunterServiceEliteCelestialThunder1757 * 2) - 1) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointBetaCyber9571("DtvCcPacket ended prematurely; size is " + ((this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterServiceEliteCelestialThunder1757 * 2) - 1) + ", but current index is " + this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889 + " (sequence number " + this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475 + ");");
        }
        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion59492 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        byte[] bArr = frostHunterCountDownTimerStormPulseFusion59492.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i5 = frostHunterCountDownTimerStormPulseFusion59492.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion59493 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterFragmentBetaMegaVortex6025(bArr, i5);
        boolean z3 = false;
        while (true) {
            if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterConstraintSetCloneMasterUltraRogue2633() > 0) {
                int i6 = 3;
                int FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(3);
                int FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(5);
                int i7 = 7;
                if (FrostHunterRemoteConfigSpeedSpeed8566 == 7) {
                    frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(i4);
                    FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(6);
                    if (FrostHunterRemoteConfigSpeedSpeed8566 < 7) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid extended service number: ", FrostHunterRemoteConfigSpeedSpeed8566);
                    }
                }
                if (FrostHunterRemoteConfigSpeedSpeed85662 == 0) {
                    if (FrostHunterRemoteConfigSpeedSpeed8566 != 0) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("serviceNumber is non-zero (" + FrostHunterRemoteConfigSpeedSpeed8566 + ") when blockSize is 0");
                    }
                } else if (FrostHunterRemoteConfigSpeedSpeed8566 != this.FrostHunterKeyframeGammaGamma1197) {
                    frostHunterCountDownTimerStormPulseFusion59493.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterRemoteConfigSpeedSpeed85662);
                } else {
                    int FrostHunterLifecycleBlazeGammaElite2889 = (FrostHunterRemoteConfigSpeedSpeed85662 * 8) + frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLifecycleBlazeGammaElite2889();
                    while (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLifecycleBlazeGammaElite2889() < FrostHunterLifecycleBlazeGammaElite2889) {
                        int FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(8);
                        if (FrostHunterRemoteConfigSpeedSpeed85663 != 16) {
                            if (FrostHunterRemoteConfigSpeedSpeed85663 <= 31) {
                                if (FrostHunterRemoteConfigSpeedSpeed85663 != 0) {
                                    if (FrostHunterRemoteConfigSpeedSpeed85663 == i6) {
                                        this.FrostHunterLightSensorForceFusion4241 = FrostHunterFragmentBetaMegaVortex6025();
                                    } else if (FrostHunterRemoteConfigSpeedSpeed85663 != 8) {
                                        switch (FrostHunterRemoteConfigSpeedSpeed85663) {
                                            case 12:
                                                FrostHunterServiceConnectionTurboPhoenixOmega6719();
                                                break;
                                            case 13:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (FrostHunterRemoteConfigSpeedSpeed85663 < 17 || FrostHunterRemoteConfigSpeedSpeed85663 > 23) {
                                                    if (FrostHunterRemoteConfigSpeedSpeed85663 < 24 || FrostHunterRemoteConfigSpeedSpeed85663 > 31) {
                                                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid C0 command: ", FrostHunterRemoteConfigSpeedSpeed85663);
                                                        break;
                                                    } else {
                                                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Currently unsupported COMMAND_P16 Command: " + FrostHunterRemoteConfigSpeedSpeed85663);
                                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(16);
                                                        break;
                                                    }
                                                } else {
                                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Currently unsupported COMMAND_EXT1 Command: " + FrostHunterRemoteConfigSpeedSpeed85663);
                                                    frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                            } else if (FrostHunterRemoteConfigSpeedSpeed85663 <= 127) {
                                FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark1963 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                if (FrostHunterRemoteConfigSpeedSpeed85663 == 127) {
                                    frostHunterGyroscopeThunderSpark1963.FrostHunterAlphaAnimationNeoCosmos5761((char) 9835);
                                } else {
                                    frostHunterGyroscopeThunderSpark1963.FrostHunterAlphaAnimationNeoCosmos5761((char) (FrostHunterRemoteConfigSpeedSpeed85663 & 255));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i7;
                                z3 = true;
                            } else {
                                if (FrostHunterRemoteConfigSpeedSpeed85663 <= 159) {
                                    FrostHunterGyroscopeThunderSpark1963[] frostHunterGyroscopeThunderSpark1963Arr = this.FrostHunterFragmentBetaMegaVortex6025;
                                    switch (FrostHunterRemoteConfigSpeedSpeed85663) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i6;
                                            z = true;
                                            int i8 = FrostHunterRemoteConfigSpeedSpeed85663 - 128;
                                            if (this.FrostHunterLintTitanVortexQuantum9911 != i8) {
                                                this.FrostHunterLintTitanVortexQuantum9911 = i8;
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterGyroscopeThunderSpark1963Arr[i8];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i = i6;
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                    FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark19632 = frostHunterGyroscopeThunderSpark1963Arr[8 - i9];
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterAlphaAnimationNeoCosmos5761.clear();
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterConstraintSetCloneMasterUltraRogue2633.clear();
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterScaleAnimationStrikeSpark5059 = -1;
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = -1;
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterLintTitanVortexQuantum9911 = -1;
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterResourcesTitanHyperVision5823 = -1;
                                                    frostHunterGyroscopeThunderSpark19632.FrostHunterLooperThreadBetaHyperionMax1000 = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i6;
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                    frostHunterGyroscopeThunderSpark1963Arr[8 - i10].FrostHunterServiceEliteCelestialThunder1757 = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i6;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                    frostHunterGyroscopeThunderSpark1963Arr[8 - i11].FrostHunterServiceEliteCelestialThunder1757 = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                    frostHunterGyroscopeThunderSpark1963Arr[8 - i12].FrostHunterServiceEliteCelestialThunder1757 = !r1.FrostHunterServiceEliteCelestialThunder1757;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                    frostHunterGyroscopeThunderSpark1963Arr[8 - i13].FrostHunterServiceEliteCelestialThunder1757();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            FrostHunterServiceConnectionTurboPhoenixOmega6719();
                                            z = true;
                                            break;
                                        case 144:
                                            int i14 = i4;
                                            if (!this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475) {
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(4);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(i14);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(i14);
                                                boolean FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232();
                                                boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232();
                                                i = 3;
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(3);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(3);
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterLevelListDrawableFusionDragonHero22322);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475) {
                                                int FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeThunderSpark1963.FrostHunterBundlePulseFusionHero2475(frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2));
                                                int FrostHunterBundlePulseFusionHero24752 = FrostHunterGyroscopeThunderSpark1963.FrostHunterBundlePulseFusionHero2475(frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2));
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(2);
                                                FrostHunterGyroscopeThunderSpark1963.FrostHunterBundlePulseFusionHero2475(frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), 0);
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterBundlePulseFusionHero2475, FrostHunterBundlePulseFusionHero24752);
                                            } else {
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475) {
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(4);
                                                int FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(4);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(2);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(6);
                                                FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark19633 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                                if (frostHunterGyroscopeThunderSpark19633.FrostHunterLooperThreadBetaHyperionMax1000 != FrostHunterRemoteConfigSpeedSpeed85664) {
                                                    frostHunterGyroscopeThunderSpark19633.FrostHunterAlphaAnimationNeoCosmos5761('\n');
                                                }
                                                frostHunterGyroscopeThunderSpark19633.FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterRemoteConfigSpeedSpeed85664;
                                            } else {
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid C1 command: ", FrostHunterRemoteConfigSpeedSpeed85663);
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475) {
                                                int FrostHunterBundlePulseFusionHero24753 = FrostHunterGyroscopeThunderSpark1963.FrostHunterBundlePulseFusionHero2475(frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2));
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2);
                                                FrostHunterGyroscopeThunderSpark1963.FrostHunterBundlePulseFusionHero2475(frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2), 0);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232();
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232();
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2);
                                                int FrostHunterRemoteConfigSpeedSpeed85665 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(2);
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(8);
                                                FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark19634 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                                frostHunterGyroscopeThunderSpark19634.FrostHunterLightSensorForceFusion4241 = FrostHunterBundlePulseFusionHero24753;
                                                frostHunterGyroscopeThunderSpark19634.FrostHunterKeyframeGammaGamma1197 = FrostHunterRemoteConfigSpeedSpeed85665;
                                            } else {
                                                frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(32);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i15 = FrostHunterRemoteConfigSpeedSpeed85663 - 152;
                                            FrostHunterGyroscopeThunderSpark1963 frostHunterGyroscopeThunderSpark19635 = frostHunterGyroscopeThunderSpark1963Arr[i15];
                                            frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(i4);
                                            boolean FrostHunterLevelListDrawableFusionDragonHero22323 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232();
                                            frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(i4);
                                            int FrostHunterRemoteConfigSpeedSpeed85666 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(i6);
                                            boolean FrostHunterLevelListDrawableFusionDragonHero22324 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterLevelListDrawableFusionDragonHero2232();
                                            int FrostHunterRemoteConfigSpeedSpeed85667 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(i7);
                                            int FrostHunterRemoteConfigSpeedSpeed85668 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(8);
                                            int FrostHunterRemoteConfigSpeedSpeed85669 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(4);
                                            int FrostHunterRemoteConfigSpeedSpeed856610 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(4);
                                            frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(i4);
                                            frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(6);
                                            frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(i4);
                                            int FrostHunterRemoteConfigSpeedSpeed856611 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(i6);
                                            int FrostHunterRemoteConfigSpeedSpeed856612 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(i6);
                                            ArrayList arrayList = frostHunterGyroscopeThunderSpark19635.FrostHunterAlphaAnimationNeoCosmos5761;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterBundlePulseFusionHero2475 = true;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterLevelListDrawableFusionDragonHero22323;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterRemoteConfigSpeedSpeed85666;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero22324;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed85667;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterRemoteConfigSpeedSpeed85668;
                                            frostHunterGyroscopeThunderSpark19635.FrostHunterFlowMaxDragonHero5809 = FrostHunterRemoteConfigSpeedSpeed85669;
                                            int i16 = FrostHunterRemoteConfigSpeedSpeed856610 + 1;
                                            if (frostHunterGyroscopeThunderSpark19635.FrostHunterAlertDialogAuroraDelta3200 != i16) {
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterAlertDialogAuroraDelta3200 = i16;
                                                while (true) {
                                                    if (arrayList.size() >= frostHunterGyroscopeThunderSpark19635.FrostHunterAlertDialogAuroraDelta3200 || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (FrostHunterRemoteConfigSpeedSpeed856611 != 0 && frostHunterGyroscopeThunderSpark19635.FrostHunterFragmentBetaMegaVortex6025 != FrostHunterRemoteConfigSpeedSpeed856611) {
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterRemoteConfigSpeedSpeed856611;
                                                int i17 = FrostHunterRemoteConfigSpeedSpeed856611 - 1;
                                                int i18 = FrostHunterGyroscopeThunderSpark1963.FrostHunterEditTextPulseHyperion1262[i17];
                                                boolean z4 = FrostHunterGyroscopeThunderSpark1963.FrostHunterServiceInfoHyperionSparkMax9966[i17];
                                                int i19 = FrostHunterGyroscopeThunderSpark1963.FrostHunterLooperHyperionForce4133[i17];
                                                int i20 = FrostHunterGyroscopeThunderSpark1963.FrostHunterMeteringPointBetaCyber9571[i17];
                                                int i21 = FrostHunterGyroscopeThunderSpark1963.FrostHunterDialogFragmentTurboPhoenixDragon7627[i17];
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterLightSensorForceFusion4241 = i18;
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterKeyframeGammaGamma1197 = i21;
                                            }
                                            if (FrostHunterRemoteConfigSpeedSpeed856612 != 0 && frostHunterGyroscopeThunderSpark19635.FrostHunterServiceConnectionTurboPhoenixOmega6719 != FrostHunterRemoteConfigSpeedSpeed856612) {
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterRemoteConfigSpeedSpeed856612;
                                                int i22 = FrostHunterRemoteConfigSpeedSpeed856612 - 1;
                                                int i23 = FrostHunterGyroscopeThunderSpark1963.FrostHunterCardViewSpectraCyber7714[i22];
                                                int i24 = FrostHunterGyroscopeThunderSpark1963.FrostHunterDatabaseEliteShadowUltra2452[i22];
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterLifecycleBlazeGammaElite2889(false, false);
                                                frostHunterGyroscopeThunderSpark19635.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterGyroscopeThunderSpark1963.FrostHunterMotionSceneAuroraMega2271, FrostHunterGyroscopeThunderSpark1963.FrostHunterViewPhantomNeo1634[i22]);
                                            }
                                            if (this.FrostHunterLintTitanVortexQuantum9911 != i15) {
                                                this.FrostHunterLintTitanVortexQuantum9911 = i15;
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterGyroscopeThunderSpark1963Arr[i15];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (FrostHunterRemoteConfigSpeedSpeed85663 <= 255) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) (FrostHunterRemoteConfigSpeedSpeed85663 & 255));
                                    } else {
                                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid base command: ", FrostHunterRemoteConfigSpeedSpeed85663);
                                        i3 = 2;
                                        i2 = 7;
                                    }
                                }
                                z3 = z;
                                i3 = 2;
                                i2 = 7;
                            }
                            z = true;
                        } else {
                            i = i6;
                            z = true;
                            int FrostHunterRemoteConfigSpeedSpeed856613 = frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(8);
                            if (FrostHunterRemoteConfigSpeedSpeed856613 <= 31) {
                                i2 = 7;
                                if (FrostHunterRemoteConfigSpeedSpeed856613 > 7) {
                                    if (FrostHunterRemoteConfigSpeedSpeed856613 <= 15) {
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(8);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 <= 23) {
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(16);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 <= 31) {
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(24);
                                    }
                                }
                            } else {
                                i2 = 7;
                                if (FrostHunterRemoteConfigSpeedSpeed856613 <= 127) {
                                    if (FrostHunterRemoteConfigSpeedSpeed856613 == 32) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761(' ');
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 33) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 160);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 37) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8230);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 42) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 352);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 44) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 338);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 63) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 376);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 57) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8482);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 58) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 353);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 == 60) {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 339);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 != 61) {
                                        switch (FrostHunterRemoteConfigSpeedSpeed856613) {
                                            case 48:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9608);
                                                break;
                                            case 49:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8216);
                                                break;
                                            case 50:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8217);
                                                break;
                                            case 51:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8220);
                                                break;
                                            case 52:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8221);
                                                break;
                                            case 53:
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8226);
                                                break;
                                            default:
                                                switch (FrostHunterRemoteConfigSpeedSpeed856613) {
                                                    case 118:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 9484);
                                                        break;
                                                    default:
                                                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid G2 character: ", FrostHunterRemoteConfigSpeedSpeed856613);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (FrostHunterRemoteConfigSpeedSpeed856613 > 159) {
                                        i3 = 2;
                                        c = 6;
                                        if (FrostHunterRemoteConfigSpeedSpeed856613 <= 255) {
                                            if (FrostHunterRemoteConfigSpeedSpeed856613 == 160) {
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761((char) 13252);
                                            } else {
                                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid G3 character: ", FrostHunterRemoteConfigSpeedSpeed856613);
                                                this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761('_');
                                            }
                                            z3 = true;
                                        } else {
                                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Invalid extended command: ", FrostHunterRemoteConfigSpeedSpeed856613);
                                        }
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 <= 135) {
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(32);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 <= 143) {
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(40);
                                    } else if (FrostHunterRemoteConfigSpeedSpeed856613 <= 159) {
                                        i3 = 2;
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(2);
                                        c = 6;
                                        frostHunterCountDownTimerStormPulseFusion59493.FrostHunterScaleAnimationStrikeSpark5059(frostHunterCountDownTimerStormPulseFusion59493.FrostHunterRemoteConfigSpeedSpeed8566(6) * 8);
                                    }
                                    boolean z5 = z;
                                    i6 = i;
                                    i4 = i3;
                                    z2 = z5;
                                    i7 = i2;
                                }
                            }
                            i3 = 2;
                        }
                        c = 6;
                        boolean z52 = z;
                        i6 = i;
                        i4 = i3;
                        z2 = z52;
                        i7 = i2;
                    }
                }
            }
        }
        if (z3) {
            this.FrostHunterLightSensorForceFusion4241 = FrostHunterFragmentBetaMegaVortex6025();
        }
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = null;
    }

    @Override // android.content.Context.FrostHunterLightSensorQuantumAurora4373
    public final FrostHunterContentObserverCelestialAuroraBlaze7297 FrostHunterRemoteConfigSpeedSpeed8566() {
        List list = this.FrostHunterLightSensorForceFusion4241;
        this.FrostHunterScaleAnimationStrikeSpark5059 = list;
        list.getClass();
        return new FrostHunterContentObserverCelestialAuroraBlaze7297(list);
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        for (int i = 0; i < 8; i++) {
            this.FrostHunterFragmentBetaMegaVortex6025[i].FrostHunterServiceEliteCelestialThunder1757();
        }
    }

    @Override // android.content.Context.FrostHunterLightSensorQuantumAurora4373, android.content.Context.FrostHunterCameraSelectorQuantumAlphaNebula4212
    public final void flush() {
        super.flush();
        this.FrostHunterLightSensorForceFusion4241 = null;
        this.FrostHunterScaleAnimationStrikeSpark5059 = null;
        this.FrostHunterLintTitanVortexQuantum9911 = 0;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = this.FrostHunterFragmentBetaMegaVortex6025[0];
        FrostHunterServiceConnectionTurboPhoenixOmega6719();
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = null;
    }
}
