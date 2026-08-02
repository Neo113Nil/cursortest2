package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.input.GapBuffer;

/* loaded from: classes.dex */
public final class PartialGapBuffer implements CharSequence {
    public int bufEnd;
    public int bufStart;
    public GapBuffer buffer;
    public CharSequence text;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null && i >= this.bufStart) {
            int length = gapBuffer.length();
            int i2 = this.bufStart;
            return i < length + i2 ? gapBuffer.get(i - i2) : this.text.charAt(i - ((length - this.bufEnd) + i2));
        }
        return this.text.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        GapBuffer gapBuffer = this.buffer;
        CharSequence charSequence = this.text;
        if (gapBuffer == null) {
            return charSequence.length();
        }
        return gapBuffer.length() + (charSequence.length() - (this.bufEnd - this.bufStart));
    }

    public final void replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was " + i3);
        }
        GapBuffer gapBuffer = this.buffer;
        int i5 = i4 - i3;
        if (gapBuffer != null) {
            int i6 = this.bufStart;
            int i7 = i - i6;
            int i8 = i2 - i6;
            if (i7 >= 0 && i8 <= gapBuffer.length()) {
                gapBuffer.replace(i7, i8, charSequence, i3, i4);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i, i2, charSequence, i3, i4);
            return;
        }
        int max = Math.max(255, i5 + 128);
        char[] cArr = new char[max];
        int min = Math.min(i, 64);
        int min2 = Math.min(this.text.length() - i2, 64);
        int i9 = i - min;
        MathUtilsKt.toCharArray(this.text, cArr, 0, i9, i);
        int i10 = max - min2;
        int i11 = min2 + i2;
        MathUtilsKt.toCharArray(this.text, cArr, i10, i2, i11);
        MathUtilsKt.toCharArray(charSequence, cArr, min, i3, i4);
        this.buffer = new GapBuffer(cArr, min + i5, i10);
        this.bufStart = i9;
        this.bufEnd = i11;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        GapBuffer gapBuffer = this.buffer;
        CharSequence charSequence = this.text;
        if (gapBuffer == null) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, this.bufStart);
        gapBuffer.append(sb);
        CharSequence charSequence2 = this.text;
        sb.append(charSequence2, this.bufEnd, charSequence2.length());
        return sb.toString();
    }
}
