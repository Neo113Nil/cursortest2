package com.nimbusds.jose.util;

import com.plaid.internal.EnumC0170g;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes9.dex */
public class Base64 implements Serializable {
    public final String value;

    public Base64(String str) {
        Objects.requireNonNull(str);
        this.value = str;
    }

    public final byte[] decode() {
        char c;
        String str = this.value;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(StandardCharset.UTF_8);
        int length = bytes.length;
        long j = (length * 6) >> 3;
        int i = (int) j;
        if (i != j) {
            throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bytes.length) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < 4 && i2 < length) {
                int i6 = i2 + 1;
                byte b = bytes[i2];
                int tpGT = Base64Codec.tpGT(b, 64) & Base64Codec.tpLT(b, 91);
                int tpGT2 = Base64Codec.tpGT(b, 96) & Base64Codec.tpLT(b, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                int tpGT3 = Base64Codec.tpGT(b, 47) & Base64Codec.tpLT(b, 58);
                int tpEq = Base64Codec.tpEq(b, 45) | Base64Codec.tpEq(b, 43);
                int tpEq2 = Base64Codec.tpEq(b, 47) | Base64Codec.tpEq(b, 95);
                byte[] bArr2 = bytes;
                int tpSelect = Base64Codec.tpSelect(tpGT2, b - 71, 0) | Base64Codec.tpSelect(tpGT, b - 65, 0) | Base64Codec.tpSelect(tpGT3, b + 4, 0) | Base64Codec.tpSelect(tpEq, 62, 0) | Base64Codec.tpSelect(tpEq2, 63, 0) | Base64Codec.tpSelect(tpGT | tpGT2 | tpGT3 | tpEq | tpEq2, 0, -1);
                if (tpSelect >= 0) {
                    i5 |= tpSelect << (18 - (i4 * 6));
                    i4++;
                }
                i2 = i6;
                bytes = bArr2;
            }
            byte[] bArr3 = bytes;
            if (i4 >= 2) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) (i5 >> 16);
                c = 3;
                if (i4 >= 3) {
                    int i8 = i3 + 2;
                    bArr[i7] = (byte) (i5 >> 8);
                    if (i4 >= 4) {
                        i3 += 3;
                        bArr[i8] = (byte) i5;
                    } else {
                        i3 = i8;
                    }
                } else {
                    i3 = i7;
                }
            } else {
                c = 3;
            }
            bytes = bArr3;
        }
        return Arrays.copyOf(bArr, i3);
    }

    public final BigInteger decodeToBigInteger() {
        return new BigInteger(1, decode());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Base64) {
            return this.value.equals(((Base64) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }
}
