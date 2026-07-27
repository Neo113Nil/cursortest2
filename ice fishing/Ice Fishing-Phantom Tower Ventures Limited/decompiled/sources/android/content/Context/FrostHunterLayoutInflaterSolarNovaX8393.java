package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutInflaterSolarNovaX8393 extends FrostHunterJobIntentServiceOlympianVortex9856 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    public /* synthetic */ FrostHunterLayoutInflaterSolarNovaX8393(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    @Override // android.content.Context.FrostHunterJobIntentServiceOlympianVortex9856
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int FrostHunterLevelListDrawableFusionDragonHero2232(String str, byte[] bArr, int i, int i2) {
        int i3;
        char charAt;
        int i4;
        char charAt2;
        char c = 2048;
        char c2 = 55296;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = str.length();
                int i5 = i2 + i;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = i6 + i;
                    if (i7 < i5 && (charAt = str.charAt(i6)) < 128) {
                        bArr[i7] = (byte) charAt;
                        i6++;
                    }
                    if (i6 != length) {
                        return i + length;
                    }
                    int i8 = i + i6;
                    while (i6 < length) {
                        char charAt3 = str.charAt(i6);
                        if (charAt3 < 128 && i8 < i5) {
                            bArr[i8] = (byte) charAt3;
                            i8++;
                        } else if (charAt3 < 2048 && i8 <= i5 - 2) {
                            int i9 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                            i8 += 2;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else {
                            if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i5 - 3) {
                                if (i8 > i5 - 4) {
                                    if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                        throw new FrostHunterLocationListenerLegendEpic8978(i6, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i8);
                                }
                                int i10 = i6 + 1;
                                if (i10 != str.length()) {
                                    char charAt4 = str.charAt(i10);
                                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i11 = i8 + 3;
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i8 += 4;
                                        bArr[i11] = (byte) ((codePoint & 63) | 128);
                                        i6 = i10;
                                    } else {
                                        i6 = i10;
                                    }
                                }
                                throw new FrostHunterLocationListenerLegendEpic8978(i6 - 1, length);
                            }
                            bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                            int i12 = i8 + 2;
                            bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i8 += 3;
                            bArr[i12] = (byte) ((charAt3 & '?') | 128);
                        }
                        i6++;
                    }
                    return i8;
                }
                if (i6 != length) {
                }
                break;
            default:
                long j = i;
                long j2 = i2 + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                    FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j, (byte) charAt2);
                    i13++;
                    j++;
                }
                if (i13 != length2) {
                    while (i13 < length2) {
                        char charAt5 = str.charAt(i13);
                        if (charAt5 < 128 && j < j2) {
                            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j, (byte) charAt5);
                            j++;
                        } else if (charAt5 >= c || j > j2 - 2) {
                            int i14 = i13;
                            if ((charAt5 >= c2 && 57343 >= charAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i4 = i14 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i4)))) {
                                        throw new FrostHunterLocationListenerLegendEpic8978(i14, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j);
                                }
                                i13 = i14 + 1;
                                if (i13 != length2) {
                                    char charAt6 = str.charAt(i13);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i13 = i14;
                                }
                                throw new FrostHunterLocationListenerLegendEpic8978(i13 - 1, length2);
                            }
                            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j, (byte) ((charAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j += 3;
                            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j4, (byte) ((charAt5 & '?') | 128));
                            i13 = i14;
                        } else {
                            long j5 = j + 1;
                            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j, (byte) ((charAt5 >>> 6) | 960));
                            j += 2;
                            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlertDialogAuroraDelta3200(bArr, j5, (byte) ((charAt5 & '?') | 128));
                            i13 = i13;
                        }
                        i13++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // android.content.Context.FrostHunterJobIntentServiceOlympianVortex9856
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String FrostHunterLifecycleBlazeGammaElite2889(byte[] bArr, int i, int i2) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterCameraXPixelTurboCosmos9814(b4)) {
                                    throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterCameraXPixelTurboCosmos9814(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterCameraXPixelTurboCosmos9814(b6) && !FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterCameraXPixelTurboCosmos9814(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                                }
                                if (i5 >= i3 - 1) {
                                    throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterCameraXPixelTurboCosmos9814(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterCameraXPixelTurboCosmos9814(b9)))) {
                                    throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = FrostHunterExoPlayerBetaAlpha8415.FrostHunterAlphaAnimationNeoCosmos5761;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw FrostHunterKaptFusionMax3663.FrostHunterAlphaAnimationNeoCosmos5761();
                }
                return str;
        }
    }
}
