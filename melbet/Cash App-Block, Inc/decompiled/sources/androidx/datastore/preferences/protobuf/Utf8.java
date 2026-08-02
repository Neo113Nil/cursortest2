package androidx.datastore.preferences.protobuf;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import coil3.size.SizeKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public abstract class Utf8 {
    public static final BundleKt processor;

    public final class SafeProcessor extends BundleKt {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ SafeProcessor(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        @Override // androidx.core.os.BundleKt
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
                                    if (b2 < -62 || SizeKt.isNotTrailingByte(b4)) {
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
                                        if (!SizeKt.isNotTrailingByte(b5)) {
                                            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !SizeKt.isNotTrailingByte(b6) && !SizeKt.isNotTrailingByte(b7)) {
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
                                    if (SizeKt.isNotTrailingByte(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || SizeKt.isNotTrailingByte(b9)))) {
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
        @Override // androidx.core.os.BundleKt
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
    }

    final class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(Recorder$$ExternalSyntheticOutline2.m("Unpaired surrogate at index ", i, i2, " of "));
        }
    }

    static {
        processor = (UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS && UnsafeUtil.HAS_UNSAFE_BYTEBUFFER_OPERATIONS && !Android.isOnAndroidDevice()) ? new SafeProcessor(1) : new SafeProcessor(0);
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
}
