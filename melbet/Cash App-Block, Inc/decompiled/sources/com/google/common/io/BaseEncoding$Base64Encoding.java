package com.google.common.io;

import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class BaseEncoding$Base64Encoding extends BaseEncoding$StandardBaseEncoding {
    public BaseEncoding$Base64Encoding(String str, String str2) {
        this(new BaseEncoding$Alphabet(str, str2.toCharArray()), (Character) '=');
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final int decodeTo(byte[] bArr, CharSequence charSequence) {
        CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
        int length = trimTrailingPadding.length();
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        if (!baseEncoding$Alphabet.validPadding[length % baseEncoding$Alphabet.charsPerChunk]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + trimTrailingPadding.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < trimTrailingPadding.length()) {
            int i3 = i + 2;
            int decode = (baseEncoding$Alphabet.decode(trimTrailingPadding.charAt(i + 1)) << 12) | (baseEncoding$Alphabet.decode(trimTrailingPadding.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (decode >>> 16);
            if (i3 < trimTrailingPadding.length()) {
                int i5 = i + 3;
                int decode2 = decode | (baseEncoding$Alphabet.decode(trimTrailingPadding.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((decode2 >>> 8) & 255);
                if (i5 < trimTrailingPadding.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((decode2 | baseEncoding$Alphabet.decode(trimTrailingPadding.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final void encodeTo(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        Trace.checkPositionIndexes(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
            char[] cArr = baseEncoding$Alphabet.chars;
            char[] cArr2 = baseEncoding$Alphabet.chars;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            encodeChunkTo(sb, bArr, i2, i - i2);
        }
    }

    public BaseEncoding$Base64Encoding(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        super(baseEncoding$Alphabet, ch);
        Trace.checkArgument(baseEncoding$Alphabet.chars.length == 64);
    }
}
