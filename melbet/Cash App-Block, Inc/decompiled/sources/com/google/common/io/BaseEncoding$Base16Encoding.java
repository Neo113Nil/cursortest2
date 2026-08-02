package com.google.common.io;

import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class BaseEncoding$Base16Encoding extends BaseEncoding$StandardBaseEncoding {

    /* renamed from: encoding, reason: collision with root package name */
    public final char[] f999encoding;

    public BaseEncoding$Base16Encoding(BaseEncoding$Alphabet baseEncoding$Alphabet) {
        super(baseEncoding$Alphabet, (Character) null);
        this.f999encoding = new char[512];
        char[] cArr = baseEncoding$Alphabet.chars;
        Trace.checkArgument(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f999encoding;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final int decodeTo(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
            bArr[i2] = (byte) ((baseEncoding$Alphabet.decode(charAt) << 4) | baseEncoding$Alphabet.decode(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.common.io.BaseEncoding$StandardBaseEncoding
    public final void encodeTo(StringBuilder sb, byte[] bArr, int i) {
        Trace.checkPositionIndexes(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f999encoding;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
