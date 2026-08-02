package com.google.common.io;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import dagger.internal.Preconditions;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class BaseEncoding$StandardBaseEncoding {
    public static final BaseEncoding$Base16Encoding BASE16;
    public static final BaseEncoding$Base64Encoding BASE64 = new BaseEncoding$Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final BaseEncoding$Base64Encoding BASE64_URL = new BaseEncoding$Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public final BaseEncoding$Alphabet alphabet;
    public volatile BaseEncoding$StandardBaseEncoding lowerCase;
    public final Character paddingChar;

    static {
        new BaseEncoding$StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new BaseEncoding$StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        BASE16 = new BaseEncoding$Base16Encoding(new BaseEncoding$Alphabet("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public BaseEncoding$StandardBaseEncoding(BaseEncoding$Alphabet baseEncoding$Alphabet, Character ch) {
        boolean z;
        baseEncoding$Alphabet.getClass();
        this.alphabet = baseEncoding$Alphabet;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = baseEncoding$Alphabet.decodabet;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                Trace.checkArgument("Padding character %s was already in alphabet", ch, z);
                this.paddingChar = ch;
            }
        }
        z = true;
        Trace.checkArgument("Padding character %s was already in alphabet", ch, z);
        this.paddingChar = ch;
    }

    public final byte[] decode(String str) {
        try {
            int length = (int) (((this.alphabet.bitsPerChar * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int decodeTo = decodeTo(bArr, trimTrailingPadding(str));
            if (decodeTo == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[decodeTo];
            System.arraycopy(bArr, 0, bArr2, 0, decodeTo);
            return bArr2;
        } catch (BaseEncoding$DecodingException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public int decodeTo(byte[] bArr, CharSequence charSequence) {
        CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
        int length = trimTrailingPadding.length();
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        boolean[] zArr = baseEncoding$Alphabet.validPadding;
        int i = baseEncoding$Alphabet.bitsPerChar;
        int i2 = baseEncoding$Alphabet.charsPerChunk;
        if (!zArr[length % i2]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + trimTrailingPadding.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < trimTrailingPadding.length(); i4 += i2) {
            long j = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j <<= i;
                if (i4 + i6 < trimTrailingPadding.length()) {
                    j |= baseEncoding$Alphabet.decode(trimTrailingPadding.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = baseEncoding$Alphabet.bytesPerChunk;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((j >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public final String encode(byte[] bArr) {
        int length = bArr.length;
        Trace.checkPositionIndexes(0, length, bArr.length);
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        int i = baseEncoding$Alphabet.charsPerChunk;
        int i2 = baseEncoding$Alphabet.bytesPerChunk;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(Preconditions.divide(length, i2) * i);
        try {
            encodeTo(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    public final void encodeChunkTo(StringBuilder sb, byte[] bArr, int i, int i2) {
        Trace.checkPositionIndexes(i, i + i2, bArr.length);
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        int i3 = baseEncoding$Alphabet.bytesPerChunk;
        int i4 = baseEncoding$Alphabet.bitsPerChar;
        int i5 = 0;
        Trace.checkArgument(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(baseEncoding$Alphabet.chars[((int) (j >>> (i7 - i5))) & baseEncoding$Alphabet.mask]);
            i5 += i4;
        }
        Character ch = this.paddingChar;
        if (ch != null) {
            while (i5 < baseEncoding$Alphabet.bytesPerChunk * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void encodeTo(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        Trace.checkPositionIndexes(0, i, bArr.length);
        while (i2 < i) {
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
            encodeChunkTo(sb, bArr, i2, Math.min(baseEncoding$Alphabet.bytesPerChunk, i - i2));
            i2 += baseEncoding$Alphabet.bytesPerChunk;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BaseEncoding$StandardBaseEncoding) {
            BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncoding = (BaseEncoding$StandardBaseEncoding) obj;
            if (this.alphabet.equals(baseEncoding$StandardBaseEncoding.alphabet) && Objects.equals(this.paddingChar, baseEncoding$StandardBaseEncoding.paddingChar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.paddingChar) ^ this.alphabet.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        BaseEncoding$Alphabet baseEncoding$Alphabet = this.alphabet;
        sb.append(baseEncoding$Alphabet);
        if (8 % baseEncoding$Alphabet.bitsPerChar != 0) {
            Character ch = this.paddingChar;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final CharSequence trimTrailingPadding(CharSequence charSequence) {
        Character ch = this.paddingChar;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public BaseEncoding$StandardBaseEncoding(String str, String str2) {
        this(new BaseEncoding$Alphabet(str, str2.toCharArray()), (Character) '=');
    }
}
