package com.nimbusds.jose.util;

/* loaded from: classes5.dex */
public final class Base64URL extends Base64 {
    public static Base64URL encode(byte[] bArr) {
        int i;
        String str;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            str = "";
        } else {
            int i2 = length / 3;
            int i3 = i2 * 3;
            if (length == 0) {
                i = 0;
            } else {
                i = i2 << 2;
                int i4 = length % 3;
                if (i4 != 0) {
                    i = i + i4 + 1;
                }
            }
            byte[] bArr2 = new byte[i];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                int i7 = i5 + 2;
                int i8 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
                i5 += 3;
                int i9 = i8 | (bArr[i7] & 255);
                bArr2[i6] = Base64Codec.encodeDigitBase64URL((i9 >>> 18) & 63);
                bArr2[i6 + 1] = Base64Codec.encodeDigitBase64URL((i9 >>> 12) & 63);
                int i10 = i6 + 3;
                bArr2[i6 + 2] = Base64Codec.encodeDigitBase64URL((i9 >>> 6) & 63);
                i6 += 4;
                bArr2[i10] = Base64Codec.encodeDigitBase64URL(i9 & 63);
            }
            int i11 = length - i3;
            if (i11 > 0) {
                int i12 = ((bArr[i3] & 255) << 10) | (i11 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
                if (i11 == 2) {
                    bArr2[i - 3] = Base64Codec.encodeDigitBase64URL(i12 >> 12);
                    bArr2[i - 2] = Base64Codec.encodeDigitBase64URL((i12 >>> 6) & 63);
                    bArr2[i - 1] = Base64Codec.encodeDigitBase64URL(i12 & 63);
                } else {
                    bArr2[i - 2] = Base64Codec.encodeDigitBase64URL(i12 >> 12);
                    bArr2[i - 1] = Base64Codec.encodeDigitBase64URL((i12 >>> 6) & 63);
                }
            }
            str = new String(bArr2, StandardCharset.UTF_8);
        }
        return new Base64URL(str);
    }

    public static Base64URL from(String str) {
        if (str == null) {
            return null;
        }
        return new Base64URL(str);
    }

    @Override // com.nimbusds.jose.util.Base64
    public final boolean equals(Object obj) {
        if (obj instanceof Base64URL) {
            return this.value.equals(((Base64) obj).value);
        }
        return false;
    }
}
