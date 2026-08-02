package androidx.compose.runtime;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.TextRange;
import coil3.size.SizeKt;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class IntStack {
    public int[] slots;
    public int tos;

    public IntStack(int i, boolean z) {
        switch (i) {
            case 1:
                this.slots = new int[30];
                break;
            default:
                this.slots = new int[10];
                break;
        }
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    public static long m572mapStepC6uMEY(boolean z, int i, int i2, int i3, int i4) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        if (i < i2) {
            return SizeKt.TextRange(i, i);
        }
        if (i == i2) {
            return i5 == 0 ? SizeKt.TextRange(i2, i3 + i2) : SizeKt.TextRange(i2, i2);
        }
        if (i < i2 + i5) {
            return i3 == 0 ? SizeKt.TextRange(i2, i2) : SizeKt.TextRange(i2, i3 + i2);
        }
        int i6 = (i - i5) + i3;
        return SizeKt.TextRange(i6, i6);
    }

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    public long m573mapfzxv0v0(int i, boolean z) {
        int i2;
        int[] iArr = this.slots;
        int i3 = this.tos;
        if (i3 < 0) {
            i2 = i;
        } else if (z) {
            i2 = i;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i4 * 3;
                int i6 = iArr[i5];
                int i7 = iArr[i5 + 1];
                int i8 = iArr[i5 + 2];
                long m572mapStepC6uMEY = m572mapStepC6uMEY(z, i, i6, i7, i8);
                long m572mapStepC6uMEY2 = m572mapStepC6uMEY(z, i2, i6, i7, i8);
                int i9 = TextRange.$r8$clinit;
                i = Math.min((int) (m572mapStepC6uMEY >> 32), (int) (m572mapStepC6uMEY2 >> 32));
                i2 = Math.max((int) (m572mapStepC6uMEY & BodyPartID.bodyIdMax), (int) (m572mapStepC6uMEY2 & BodyPartID.bodyIdMax));
            }
        } else {
            i2 = i;
            for (int i10 = i3 - 1; -1 < i10; i10--) {
                int i11 = i10 * 3;
                int i12 = iArr[i11];
                int i13 = iArr[i11 + 1];
                int i14 = iArr[i11 + 2];
                long m572mapStepC6uMEY3 = m572mapStepC6uMEY(z, i, i12, i13, i14);
                long m572mapStepC6uMEY4 = m572mapStepC6uMEY(z, i2, i12, i13, i14);
                int i15 = TextRange.$r8$clinit;
                i = Math.min((int) (m572mapStepC6uMEY3 >> 32), (int) (m572mapStepC6uMEY4 >> 32));
                i2 = Math.max((int) (m572mapStepC6uMEY3 & BodyPartID.bodyIdMax), (int) (m572mapStepC6uMEY4 & BodyPartID.bodyIdMax));
            }
        }
        return SizeKt.TextRange(i, i2);
    }

    public int peekOr(int i) {
        int i2 = this.tos - 1;
        return i2 >= 0 ? this.slots[i2] : i;
    }

    public int pop() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public void push(int i) {
        int[] iArr = this.slots;
        if (this.tos >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.slots = iArr;
        }
        int i2 = this.tos;
        this.tos = i2 + 1;
        iArr[i2] = i;
    }

    public void pushDiagonal(int i, int i2, int i3) {
        int i4 = this.tos;
        int[] iArr = this.slots;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.slots = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.tos = i5;
    }

    public void pushRange(int i, int i2, int i3, int i4) {
        int i5 = this.tos;
        int[] iArr = this.slots;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.slots = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.tos = i6;
    }

    public void quickSort(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.slots;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    swapDiagonal(i3, i4);
                }
            }
            swapDiagonal(i3 + 3, i2);
            quickSort(i, i3);
            quickSort(i3 + 6, i2);
        }
    }

    public void recordEditOperation(int i, int i2, int i3) {
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + i3);
        }
        int min = Math.min(i, i2);
        int max = Math.max(min, i2) - min;
        if (max >= 2 || max != i3) {
            int i4 = this.tos + 1;
            int[] iArr = this.slots;
            if (i4 > iArr.length / 3) {
                this.slots = Arrays.copyOf(this.slots, Math.max(i4 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.slots;
            int i5 = this.tos * 3;
            iArr2[i5] = min;
            iArr2[i5 + 1] = max;
            iArr2[i5 + 2] = i3;
            this.tos = i4;
        }
    }

    public void swapDiagonal(int i, int i2) {
        int[] iArr = this.slots;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public IntStack(int i) {
        this.slots = new int[i];
    }
}
