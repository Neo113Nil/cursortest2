package com.google.common.io;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.math.IntMath$1;
import dagger.internal.Preconditions;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.utils.ColorUtils;
import java.math.RoundingMode;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class BaseEncoding$Alphabet {
    public final int bitsPerChar;
    public final int bytesPerChunk;
    public final char[] chars;
    public final int charsPerChunk;
    public final byte[] decodabet;
    public final boolean ignoreCase;
    public final int mask;
    public final String name;
    public final boolean[] validPadding;

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[LOOP:0: B:11:0x0079->B:13:0x007d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseEncoding$Alphabet(String str, char[] cArr, byte[] bArr, boolean z) {
        int i;
        this.name = str;
        cArr.getClass();
        this.chars = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (IntMath$1.$SwitchMap$java$math$RoundingMode[roundingMode2.ordinal()]) {
                    case 1:
                        ColorUtils.checkRoundingUnnecessary((length > 0) & (((length + (-1)) & length) == 0));
                    case 2:
                    case 3:
                        i = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        i = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                        i = (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - length))) >>> 31);
                        break;
                    default:
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        break;
                }
                this.bitsPerChar = i;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                int i2 = 1 << (3 - numberOfTrailingZeros);
                this.charsPerChunk = i2;
                this.bytesPerChunk = i >> numberOfTrailingZeros;
                this.mask = cArr.length - 1;
                this.decodabet = bArr;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.bytesPerChunk; i3++) {
                    int i4 = this.bitsPerChar;
                    RoundingMode roundingMode3 = RoundingMode.CEILING;
                    zArr[Preconditions.divide(i3 * 8, i4)] = true;
                }
                this.validPadding = zArr;
                this.ignoreCase = z;
            }
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length, "x (", ") must be > 0"));
            i = 0;
            this.bitsPerChar = i;
            int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i);
            int i22 = 1 << (3 - numberOfTrailingZeros2);
            this.charsPerChunk = i22;
            this.bytesPerChunk = i >> numberOfTrailingZeros2;
            this.mask = cArr.length - 1;
            this.decodabet = bArr;
            boolean[] zArr2 = new boolean[i22];
            while (i3 < this.bytesPerChunk) {
            }
            this.validPadding = zArr2;
            this.ignoreCase = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int decode(char c) {
        if (c > 127) {
            throw new BaseEncoding$DecodingException(Recorder$$ExternalSyntheticOutline1.m(c, new StringBuilder("Unrecognized character: 0x")));
        }
        byte b = this.decodabet[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new BaseEncoding$DecodingException(Recorder$$ExternalSyntheticOutline1.m(c, new StringBuilder("Unrecognized character: 0x")));
        }
        throw new BaseEncoding$DecodingException("Unrecognized character: " + c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BaseEncoding$Alphabet)) {
            return false;
        }
        BaseEncoding$Alphabet baseEncoding$Alphabet = (BaseEncoding$Alphabet) obj;
        return this.ignoreCase == baseEncoding$Alphabet.ignoreCase && Arrays.equals(this.chars, baseEncoding$Alphabet.chars);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.chars) + (this.ignoreCase ? 1231 : 1237);
    }

    public final String toString() {
        return this.name;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseEncoding$Alphabet(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
