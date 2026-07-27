package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishMVPViewAdMob extends CatchingFishDaggerBiometric {
    public final /* synthetic */ int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMVPViewAdMob(int i) {
        this.CatchingFishWorkManager = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // kotlin.text.CatchingFishDaggerBiometric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CatchingFishStateLiveData(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        long j;
        char c;
        long j2;
        long j3;
        char c2;
        int i5;
        char charAt2;
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (charAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) charAt;
                    i7++;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char charAt3 = str.charAt(i7);
                    if (charAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) charAt3;
                        i8++;
                    } else if (charAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                    throw new CatchingFishIntentRoom(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
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
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new CatchingFishIntentRoom(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((charAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j4 = i;
                long j5 = i2 + j4;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j4, (byte) charAt2);
                        i13++;
                        j4 = 1 + j4;
                    }
                }
                if (i13 == length2) {
                    return (int) j4;
                }
                while (i13 < length2) {
                    char charAt5 = str.charAt(i13);
                    if (charAt5 < c && j4 < j5) {
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j4, (byte) charAt5);
                        c2 = c;
                        j2 = j;
                        j3 = j4 + j;
                    } else if (charAt5 >= 2048 || j4 > j5 - 2) {
                        j2 = j;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j4 > j5 - 3) {
                            long j6 = j4;
                            if (j6 > j5 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                    throw new CatchingFishIntentRoom(i13, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j6);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length2) {
                                char charAt6 = str.charAt(i14);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j6, (byte) ((codePoint2 >>> 18) | 240));
                                    c2 = 128;
                                    CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j6 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j6 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j6 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j3 = j6 + 4;
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new CatchingFishIntentRoom(i13 - 1, length2);
                        }
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j4, (byte) ((charAt5 >>> '\f') | 480));
                        long j7 = j4;
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j4 + j2, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j3 = j7 + 3;
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j7 + 2, (byte) ((charAt5 & '?') | 128));
                        c2 = 128;
                    } else {
                        j2 = j;
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j4, (byte) ((charAt5 >>> 6) | 960));
                        CatchingFishGradleViewModel.CatchingFishFragmentHandler(bArr, j4 + j2, (byte) ((charAt5 & '?') | c));
                        j3 = j4 + 2;
                        c2 = c;
                    }
                    i13++;
                    c = c2;
                    j4 = j3;
                    j = j2;
                }
                return (int) j4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // kotlin.text.CatchingFishDaggerBiometric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String CatchingFishUnitTesting(byte[] bArr, int i, int i2) {
        switch (this.CatchingFishWorkManager) {
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
                                    throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || CatchingFishViewMVIMVVM.CatchingFishStateLiveData(b4)) {
                                    throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!CatchingFishViewMVIMVVM.CatchingFishStateLiveData(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !CatchingFishViewMVIMVVM.CatchingFishStateLiveData(b6) && !CatchingFishViewMVIMVVM.CatchingFishStateLiveData(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
                                }
                                if (i5 >= i3 - 1) {
                                    throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (CatchingFishViewMVIMVVM.CatchingFishStateLiveData(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || CatchingFishViewMVIMVVM.CatchingFishStateLiveData(b9)))) {
                                    throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
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
                Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw CatchingFishKtorMVPAndroidX.CatchingFishParcelableFAB();
                }
                return str;
        }
    }
}
