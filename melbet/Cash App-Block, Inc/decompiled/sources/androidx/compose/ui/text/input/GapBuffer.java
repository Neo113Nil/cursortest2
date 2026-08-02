package androidx.compose.ui.text.input;

import androidx.compose.foundation.text.input.internal.MathUtilsKt;

/* loaded from: classes3.dex */
public final class GapBuffer {
    public final /* synthetic */ int $r8$classId = 0;
    public char[] buffer;
    public int capacity;
    public int gapEnd;
    public int gapStart;

    public GapBuffer(char[] cArr, int i, int i2) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    public void append(StringBuilder sb) {
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        sb.append(cArr, i, this.capacity - i);
    }

    public final int gapLength() {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                i = this.gapEnd;
                i2 = this.gapStart;
                break;
            default:
                i = this.gapEnd;
                i2 = this.gapStart;
                break;
        }
        return i - i2;
    }

    public char get(int i) {
        int i2 = this.gapStart;
        char[] cArr = this.buffer;
        return i < i2 ? cArr[i] : cArr[(i - i2) + this.gapEnd];
    }

    public int length() {
        return this.capacity - gapLength();
    }

    public void replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        int i5 = i4 - i3;
        int i6 = i5 - (i2 - i);
        if (i6 > gapLength()) {
            int gapLength = i6 - gapLength();
            int i7 = this.capacity;
            do {
                i7 *= 2;
            } while (i7 - this.capacity < gapLength);
            char[] cArr = new char[i7];
            System.arraycopy(this.buffer, 0, cArr, 0, this.gapStart);
            int i8 = this.capacity;
            int i9 = this.gapEnd;
            int i10 = i8 - i9;
            int i11 = i7 - i10;
            System.arraycopy(this.buffer, i9, cArr, i11, (i10 + i9) - i9);
            this.buffer = cArr;
            this.capacity = i7;
            this.gapEnd = i11;
        }
        int i12 = this.gapStart;
        if (i < i12 && i2 <= i12) {
            int i13 = i12 - i2;
            char[] cArr2 = this.buffer;
            System.arraycopy(cArr2, i2, cArr2, this.gapEnd - i13, i13);
            this.gapStart = i;
            this.gapEnd -= i13;
        } else if (i >= i12 || i2 < i12) {
            int gapLength2 = gapLength() + i;
            int gapLength3 = gapLength() + i2;
            int i14 = this.gapEnd;
            int i15 = gapLength2 - i14;
            char[] cArr3 = this.buffer;
            System.arraycopy(cArr3, i14, cArr3, this.gapStart, i15);
            this.gapStart += i15;
            this.gapEnd = gapLength3;
        } else {
            this.gapEnd = gapLength() + i2;
            this.gapStart = i;
        }
        MathUtilsKt.toCharArray(charSequence, this.buffer, this.gapStart, i3, i4);
        this.gapStart += i5;
    }

    public final String toString() {
        switch (this.$r8$classId) {
        }
        return "";
    }

    public /* synthetic */ GapBuffer() {
    }
}
