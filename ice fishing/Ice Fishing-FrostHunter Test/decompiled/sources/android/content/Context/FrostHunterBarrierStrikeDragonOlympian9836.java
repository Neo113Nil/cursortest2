package android.content.Context;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterBarrierStrikeDragonOlympian9836 implements Serializable, Comparable {
    public static final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterKeyframeGammaGamma1197 = new FrostHunterBarrierStrikeDragonOlympian9836(new byte[0]);
    public transient String FrostHunterAlertDialogAuroraDelta3200;
    public final byte[] FrostHunterCameraXPixelTurboCosmos9814;
    public transient int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterBarrierStrikeDragonOlympian9836(byte[] bArr) {
        bArr.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = bArr;
    }

    public static /* synthetic */ FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return frostHunterBarrierStrikeDragonOlympian9836.FrostHunterScaleAnimationStrikeSpark5059(i, i2);
    }

    public static int FrostHunterKeyframeGammaGamma1197(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836, FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian98362) {
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        frostHunterBarrierStrikeDragonOlympian98362.getClass();
        return frostHunterBarrierStrikeDragonOlympian9836.FrostHunterAlertDialogAuroraDelta3200(frostHunterBarrierStrikeDragonOlympian98362.FrostHunterCameraXPixelTurboCosmos9814());
    }

    public static int FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836, FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian98362) {
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        frostHunterBarrierStrikeDragonOlympian98362.getClass();
        return frostHunterBarrierStrikeDragonOlympian9836.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterBarrierStrikeDragonOlympian98362.FrostHunterCameraXPixelTurboCosmos9814(), 0);
    }

    public int FrostHunterAlertDialogAuroraDelta3200(byte[] bArr) {
        bArr.getClass();
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757();
        byte[] bArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        for (int min = Math.min(FrostHunterServiceEliteCelestialThunder1757, bArr2.length - bArr.length); -1 < min; min--) {
            if (FrostHunterTransitionGammaTitanSpeed7178.FrostHunterCameraXPixelTurboCosmos9814(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public String FrostHunterAlphaAnimationNeoCosmos5761() {
        byte[] bArr = FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761;
        byte[] bArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterBundlePulseFusionHero2475(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.FrostHunterCameraXPixelTurboCosmos9814, 0, FrostHunterServiceEliteCelestialThunder1757());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new FrostHunterBarrierStrikeDragonOlympian9836(digest);
    }

    public byte[] FrostHunterCameraXPixelTurboCosmos9814() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public final String FrostHunterCameraXTurboCelestialHero5430() {
        String str = this.FrostHunterAlertDialogAuroraDelta3200;
        if (str != null) {
            return str;
        }
        byte[] FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814();
        FrostHunterCameraXPixelTurboCosmos9814.getClass();
        String str2 = new String(FrostHunterCameraXPixelTurboCosmos9814, FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761);
        this.FrostHunterAlertDialogAuroraDelta3200 = str2;
        return str2;
    }

    @Override // java.lang.Comparable
    /* renamed from: FrostHunterConstraintSetCloneMasterUltraRogue2633, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836) {
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757();
        int FrostHunterServiceEliteCelestialThunder17572 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757();
        int min = Math.min(FrostHunterServiceEliteCelestialThunder1757, FrostHunterServiceEliteCelestialThunder17572);
        for (int i = 0; i < min; i++) {
            int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(i) & 255;
            int FrostHunterFlowMaxDragonHero58092 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFlowMaxDragonHero5809(i) & 255;
            if (FrostHunterFlowMaxDragonHero5809 != FrostHunterFlowMaxDragonHero58092) {
                return FrostHunterFlowMaxDragonHero5809 < FrostHunterFlowMaxDragonHero58092 ? -1 : 1;
            }
        }
        if (FrostHunterServiceEliteCelestialThunder1757 == FrostHunterServiceEliteCelestialThunder17572) {
            return 0;
        }
        return FrostHunterServiceEliteCelestialThunder1757 < FrostHunterServiceEliteCelestialThunder17572 ? -1 : 1;
    }

    public byte FrostHunterFlowMaxDragonHero5809(int i) {
        return this.FrostHunterCameraXPixelTurboCosmos9814[i];
    }

    public boolean FrostHunterFragmentBetaMegaVortex6025(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && FrostHunterTransitionGammaTitanSpeed7178.FrostHunterCameraXPixelTurboCosmos9814(i, i2, i3, bArr2, bArr);
    }

    public int FrostHunterLevelListDrawableFusionDragonHero2232(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!FrostHunterTransitionGammaTitanSpeed7178.FrostHunterCameraXPixelTurboCosmos9814(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public String FrostHunterLifecycleBlazeGammaElite2889() {
        byte[] bArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = FrostHunterExecutorSolarPhoenix3849.FrostHunterAlphaAnimationNeoCosmos5761;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public String FrostHunterLightSensorForceFusion4241(Charset charset) {
        charset.getClass();
        return new String(this.FrostHunterCameraXPixelTurboCosmos9814, charset);
    }

    public FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterLintTitanVortexQuantum9911() {
        int i = 0;
        while (true) {
            byte[] bArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new FrostHunterBarrierStrikeDragonOlympian9836(copyOf);
            }
            i++;
        }
    }

    public void FrostHunterResourcesTitanHyperVision5823(FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246, int i) {
        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterBillingClientFusionVortex9008(this.FrostHunterCameraXPixelTurboCosmos9814, i);
    }

    public FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterScaleAnimationStrikeSpark5059(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = FrostHunterServiceEliteCelestialThunder1757();
        }
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 > bArr.length) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterAlertDialogAuroraDelta3200("endIndex > length(", bArr.length, 41);
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new FrostHunterBarrierStrikeDragonOlympian9836(FrostHunterContextSolarMegaPhantom7469.FrostHunterPlaceholderLegendForceNebula9869(bArr, i, i2));
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("endIndex < beginIndex");
        return null;
    }

    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719(int i, FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836, int i2) {
        frostHunterBarrierStrikeDragonOlympian9836.getClass();
        return frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFragmentBetaMegaVortex6025(0, i, i2, this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public int FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FrostHunterBarrierStrikeDragonOlympian9836) {
            FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = (FrostHunterBarrierStrikeDragonOlympian9836) obj;
            int FrostHunterServiceEliteCelestialThunder1757 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757();
            byte[] bArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (FrostHunterServiceEliteCelestialThunder1757 == bArr.length && frostHunterBarrierStrikeDragonOlympian9836.FrostHunterFragmentBetaMegaVortex6025(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.FrostHunterCameraXPixelTurboCosmos9814);
        this.FrostHunterFlowMaxDragonHero5809 = hashCode;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = this;
        byte[] bArr = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterCameraXPixelTurboCosmos9814;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String FrostHunterCameraXTurboCelestialHero5430 = frostHunterBarrierStrikeDragonOlympian9836.FrostHunterCameraXTurboCelestialHero5430();
            String FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterCameraXTurboCelestialHero5430.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= FrostHunterCameraXTurboCelestialHero5430.length()) {
                return "[text=" + FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + ']';
            }
            return "[size=" + bArr.length + " text=" + FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + frostHunterBarrierStrikeDragonOlympian9836.FrostHunterLifecycleBlazeGammaElite2889() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterAlertDialogAuroraDelta3200("endIndex > length(", bArr.length, 41);
            return null;
        }
        if (64 != bArr.length) {
            frostHunterBarrierStrikeDragonOlympian9836 = new FrostHunterBarrierStrikeDragonOlympian9836(FrostHunterContextSolarMegaPhantom7469.FrostHunterPlaceholderLegendForceNebula9869(bArr, 0, 64));
        }
        sb.append(frostHunterBarrierStrikeDragonOlympian9836.FrostHunterLifecycleBlazeGammaElite2889());
        sb.append("…]");
        return sb.toString();
    }
}
