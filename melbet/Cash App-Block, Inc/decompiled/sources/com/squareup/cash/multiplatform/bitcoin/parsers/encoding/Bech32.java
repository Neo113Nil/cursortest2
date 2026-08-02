package com.squareup.cash.multiplatform.bitcoin.parsers.encoding;

import com.fillr.n;
import com.squareup.cash.multiplatform.bitcoin.parsers.encoding.AddressFormatException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Bech32 {
    public static final byte[] CHARSET_REV = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, 10, 17, 21, 20, 26, 30, 7, 5, -1, -1, -1, -1, -1, -1, -1, 29, -1, 24, 13, 25, 9, 8, 23, -1, 18, 22, 31, 27, 19, -1, 1, 0, 3, 16, 11, 28, 12, 14, 6, 4, 2, -1, -1, -1, -1, -1, -1, 29, -1, 24, 13, 25, 9, 8, 23, -1, 18, 22, 31, 27, 19, -1, 1, 0, 3, 16, 11, 28, 12, 14, 6, 4, 2, -1, -1, -1, -1, -1};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Encoding {
        public static final /* synthetic */ Encoding[] $VALUES;
        public static final Encoding BECH32;
        public static final Encoding BECH32M;

        static {
            Encoding encoding2 = new Encoding("BECH32", 0);
            BECH32 = encoding2;
            Encoding encoding3 = new Encoding("BECH32M", 1);
            BECH32M = encoding3;
            $VALUES = new Encoding[]{encoding2, encoding3};
        }

        public static Encoding valueOf(String str) {
            return (Encoding) Enum.valueOf(Encoding.class, str);
        }

        public static Encoding[] values() {
            return (Encoding[]) $VALUES.clone();
        }
    }

    public static final n.a decode(String str, boolean z) {
        str.getClass();
        if (str.length() < 8) {
            throw new AddressFormatException.InvalidDataLength(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(str.length(), "Input too short: "));
        }
        if (z && str.length() > 90) {
            throw new AddressFormatException.InvalidDataLength(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(str.length(), "Input too long: "));
        }
        int length = str.length();
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new AddressFormatException.InvalidCharacter(charAt, i);
            }
            if ('a' <= charAt && charAt < '{') {
                if (z2) {
                    throw new AddressFormatException.InvalidCharacter(charAt, i);
                }
                z3 = true;
            }
            if ('A' <= charAt && charAt < '[') {
                if (z3) {
                    throw new AddressFormatException.InvalidCharacter(charAt, i);
                }
                z2 = true;
            }
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default('1', 0, 6, (CharSequence) str);
        if (lastIndexOf$default < 1) {
            throw new AddressFormatException.InvalidPrefix("Missing human-readable part");
        }
        int length2 = (str.length() - 1) - lastIndexOf$default;
        if (length2 < 6) {
            throw new AddressFormatException.InvalidDataLength(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length2, "Data part too short: "));
        }
        byte[] bArr = new byte[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = i2 + lastIndexOf$default + 1;
            char charAt2 = str.charAt(i3);
            byte b = CHARSET_REV[charAt2];
            if (b == -1) {
                throw new AddressFormatException.InvalidCharacter(charAt2, i3);
            }
            bArr[i2] = b;
        }
        String lowerCase = str.substring(0, lastIndexOf$default).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int length3 = lowerCase.length();
        int i4 = (length3 * 2) + 1;
        byte[] bArr2 = new byte[i4];
        for (int i5 = 0; i5 < length3; i5++) {
            char charAt3 = lowerCase.charAt(i5);
            bArr2[i5] = (byte) (((charAt3 & 127) >>> 5) & 7);
            bArr2[i5 + length3 + 1] = (byte) (charAt3 & 31);
        }
        bArr2[length3] = 0;
        int i6 = i4 + length2;
        byte[] bArr3 = new byte[i6];
        ArraysKt___ArraysJvmKt.copyInto$default(bArr2, bArr3, 0, 0, 0, 14);
        ArraysKt___ArraysJvmKt.copyInto(i4, bArr, 0, bArr3, length2);
        int i7 = 1;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = i7 >>> 25;
            i7 = ((i7 & 33554431) << 5) ^ (bArr3[i8] & 255);
            if ((i9 & 1) != 0) {
                i7 ^= 996825010;
            }
            if ((i9 & 2) != 0) {
                i7 ^= 642813549;
            }
            if ((i9 & 4) != 0) {
                i7 ^= 513874426;
            }
            if ((i9 & 8) != 0) {
                i7 ^= 1027748829;
            }
            if ((i9 & 16) != 0) {
                i7 ^= 705979059;
            }
        }
        if ((i7 != 1 ? i7 != 734539939 ? null : Encoding.BECH32M : Encoding.BECH32) == null) {
            throw new AddressFormatException.InvalidChecksum();
        }
        ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, length2 - 6).getClass();
        n.a aVar = new n.a();
        aVar.b = lowerCase;
        return aVar;
    }
}
