package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import coil3.size.DimensionKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.Strings;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public abstract class Utf8 {
    public static final DimensionKt processor;

    public final class SafeProcessor extends DimensionKt {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ SafeProcessor(int i) {
            this.$r8$classId = i;
        }

        public static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                DimensionKt dimensionKt = Utf8.processor;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            Path$$ExternalSyntheticBUOutline0.m$2();
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        @Override // coil3.size.DimensionKt
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String decodeUtf8(byte[] bArr, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                        return null;
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
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                    i += 2;
                                    byte b4 = bArr[i5];
                                    int i7 = i4 + 1;
                                    if (b2 < -62 || Strings.isNotTrailingByte(b4)) {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                    cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                    i4 = i7;
                                } else {
                                    if (b2 >= -16) {
                                        if (i5 >= i3 - 2) {
                                            throw InvalidProtocolBufferException.invalidUtf8();
                                        }
                                        byte b5 = bArr[i5];
                                        int i8 = i + 3;
                                        byte b6 = bArr[i + 2];
                                        i += 4;
                                        byte b7 = bArr[i8];
                                        int i9 = i4 + 1;
                                        if (!Strings.isNotTrailingByte(b5)) {
                                            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !Strings.isNotTrailingByte(b6) && !Strings.isNotTrailingByte(b7)) {
                                                int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                                cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                                cArr[i9] = (char) ((i10 & IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2) + 56320);
                                                i4 += 2;
                                            }
                                        }
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                    if (i5 >= i3 - 1) {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                    int i11 = i + 2;
                                    byte b8 = bArr[i5];
                                    i += 3;
                                    byte b9 = bArr[i11];
                                    int i12 = i4 + 1;
                                    if (Strings.isNotTrailingByte(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || Strings.isNotTrailingByte(b9)))) {
                                        throw InvalidProtocolBufferException.invalidUtf8();
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
                    Charset charset = Internal.UTF_8;
                    String str = new String(bArr, i, i2, charset);
                    if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    return str;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
        @Override // coil3.size.DimensionKt
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int encodeUtf8(String str, byte[] bArr, int i, int i2) {
            int i3;
            char charAt;
            long j;
            long j2;
            int i4;
            char charAt2;
            char c = 2048;
            char c2 = 57343;
            switch (this.$r8$classId) {
                case 0:
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
                                            throw new UnpairedSurrogateException(i6, length);
                                        }
                                        OptionalProvider$$ExternalSyntheticLambda0.m(charAt3, i8);
                                        return 0;
                                    }
                                    int i10 = i6 + 1;
                                    if (i10 != str.length()) {
                                        char charAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                                            bArr[i8] = (byte) ((codePoint >>> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
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
                                    throw new UnpairedSurrogateException(i6 - 1, length);
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
                    long j3 = i;
                    long j4 = i2 + j3;
                    int length2 = str.length();
                    if (length2 <= i2 && bArr.length - i2 >= i) {
                        int i13 = 0;
                        while (true) {
                            j = 1;
                            if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                                UnsafeUtil.putByte(bArr, j3, (byte) charAt2);
                                i13++;
                                j3 = 1 + j3;
                            }
                        }
                        if (i13 != length2) {
                            while (i13 < length2) {
                                char charAt5 = str.charAt(i13);
                                if (charAt5 < 128 && j3 < j4) {
                                    UnsafeUtil.putByte(bArr, j3, (byte) charAt5);
                                    j2 = j;
                                    j3 += j;
                                } else if (charAt5 >= c || j3 > j4 - 2) {
                                    j2 = j;
                                    if ((charAt5 < 55296 || c2 < charAt5) && j3 <= j4 - 3) {
                                        UnsafeUtil.putByte(bArr, j3, (byte) ((charAt5 >>> '\f') | 480));
                                        long j5 = j3 + 2;
                                        UnsafeUtil.putByte(bArr, j3 + j2, (byte) (((charAt5 >>> 6) & 63) | 128));
                                        j3 += 3;
                                        UnsafeUtil.putByte(bArr, j5, (byte) ((charAt5 & '?') | 128));
                                    } else {
                                        if (j3 <= j4 - 4) {
                                            int i14 = i13 + 1;
                                            if (i14 != length2) {
                                                char charAt6 = str.charAt(i14);
                                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                                    UnsafeUtil.putByte(bArr, j3, (byte) ((codePoint2 >>> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                                    UnsafeUtil.putByte(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    long j6 = j3 + 3;
                                                    UnsafeUtil.putByte(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    j3 += 4;
                                                    UnsafeUtil.putByte(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                    i13 = i14;
                                                } else {
                                                    i13 = i14;
                                                }
                                            }
                                            throw new UnpairedSurrogateException(i13 - 1, length2);
                                        }
                                        if (55296 <= charAt5 && charAt5 <= 57343 && ((i4 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i4)))) {
                                            throw new UnpairedSurrogateException(i13, length2);
                                        }
                                        JWK$$ExternalSyntheticBUOutline0.m(charAt5, j3);
                                    }
                                } else {
                                    j2 = j;
                                    long j7 = j3 + j2;
                                    UnsafeUtil.putByte(bArr, j3, (byte) ((charAt5 >>> 6) | 960));
                                    j3 += 2;
                                    UnsafeUtil.putByte(bArr, j7, (byte) ((charAt5 & '?') | 128));
                                }
                                i13++;
                                j = j2;
                                c = 2048;
                                c2 = 57343;
                            }
                        }
                        return (int) j3;
                    }
                    JWK$$ExternalSyntheticBUOutline0.m((int) str.charAt(length2 - 1), i + i2);
                    return 0;
            }
        }

        @Override // coil3.size.DimensionKt
        public final int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            long j;
            int i3;
            int i4 = i;
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    if ((i4 | i2 | (bArr.length - i2)) >= 0) {
                        long j2 = i4;
                        int i5 = (int) (i2 - j2);
                        if (i5 < 16) {
                            j = 1;
                            i3 = 0;
                        } else {
                            int i6 = 8 - (((int) j2) & 7);
                            long j3 = j2;
                            j = 1;
                            i3 = 0;
                            while (true) {
                                if (i3 < i6) {
                                    long j4 = j3 + 1;
                                    if (UnsafeUtil.getByte(bArr, j3) >= 0) {
                                        i3++;
                                        j3 = j4;
                                    }
                                } else {
                                    while (true) {
                                        int i7 = i3 + 8;
                                        if (i7 <= i5) {
                                            if ((UnsafeUtil.MEMORY_ACCESSOR.getLong(bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j3) & (-9187201950435737472L)) == 0) {
                                                j3 += 8;
                                                i3 = i7;
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (i3 < i5) {
                                            long j5 = j3 + 1;
                                            if (UnsafeUtil.getByte(bArr, j3) >= 0) {
                                                i3++;
                                                j3 = j5;
                                            }
                                        } else {
                                            i3 = i5;
                                        }
                                    }
                                }
                            }
                        }
                        int i8 = i5 - i3;
                        long j6 = j2 + i3;
                        while (true) {
                            byte b = 0;
                            while (true) {
                                if (i8 > 0) {
                                    long j7 = j6 + j;
                                    b = UnsafeUtil.getByte(bArr, j6);
                                    if (b >= 0) {
                                        i8--;
                                        j6 = j7;
                                    } else {
                                        j6 = j7;
                                    }
                                }
                            }
                            if (i8 != 0) {
                                int i9 = i8 - 1;
                                if (b < -32) {
                                    if (i9 == 0) {
                                        return b;
                                    }
                                    i8 -= 2;
                                    if (b >= -62) {
                                        long j8 = j6 + j;
                                        if (UnsafeUtil.getByte(bArr, j6) <= -65) {
                                            j6 = j8;
                                        }
                                    }
                                } else if (b < -16) {
                                    if (i9 < 2) {
                                        return unsafeIncompleteStateFor(bArr, b, j6, i9);
                                    }
                                    i8 -= 3;
                                    long j9 = j6 + j;
                                    byte b2 = UnsafeUtil.getByte(bArr, j6);
                                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                        j6 += 2;
                                        if (UnsafeUtil.getByte(bArr, j9) > -65) {
                                        }
                                    }
                                } else {
                                    if (i9 < 3) {
                                        return unsafeIncompleteStateFor(bArr, b, j6, i9);
                                    }
                                    i8 -= 4;
                                    long j10 = j6 + j;
                                    byte b3 = UnsafeUtil.getByte(bArr, j6);
                                    if (b3 <= -65) {
                                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                            long j11 = 2 + j6;
                                            if (UnsafeUtil.getByte(bArr, j10) <= -65) {
                                                j6 += 3;
                                                if (UnsafeUtil.getByte(bArr, j11) > -65) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)});
                    return 0;
            }
            while (i4 < i2 && bArr[i4] >= 0) {
                i4++;
            }
            if (i4 < i2) {
                while (i4 < i2) {
                    int i10 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (b4 < 0) {
                        if (b4 < -32) {
                            if (i10 >= i2) {
                                return b4;
                            }
                            if (b4 >= -62) {
                                i4 += 2;
                                if (bArr[i10] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b4 < -16) {
                            if (i10 >= i2 - 1) {
                                return Utf8.access$1100(bArr, i10, i2);
                            }
                            int i11 = i4 + 2;
                            byte b5 = bArr[i10];
                            if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                                i4 += 3;
                                if (bArr[i11] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (i10 >= i2 - 2) {
                            return Utf8.access$1100(bArr, i10, i2);
                        }
                        int i12 = i4 + 2;
                        byte b6 = bArr[i10];
                        if (b6 <= -65) {
                            if ((((b6 + 112) + (b4 << 28)) >> 30) == 0) {
                                int i13 = i4 + 3;
                                if (bArr[i12] <= -65) {
                                    i4 += 4;
                                    if (bArr[i13] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i4 = i10;
                }
            }
            return 0;
        }
    }

    final class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(Recorder$$ExternalSyntheticOutline2.m("Unpaired surrogate at index ", i, i2, " of "));
        }
    }

    static {
        processor = (UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS && UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS && !Android.isOnAndroidDevice()) ? new SafeProcessor(1) : new SafeProcessor(0);
    }

    public static int access$1100(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b, bArr[i], bArr[i + 1]);
        }
        Path$$ExternalSyntheticBUOutline0.m$2();
        return 0;
    }

    public static int encodedLength(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new UnpairedSurrogateException(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m(i2 + 4294967296L);
        return 0;
    }

    public static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
