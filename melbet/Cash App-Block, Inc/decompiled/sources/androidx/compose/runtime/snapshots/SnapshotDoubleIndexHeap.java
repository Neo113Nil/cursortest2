package androidx.compose.runtime.snapshots;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public int firstFreeHandle;
    public int[] handles;
    public int[] index;
    public int size;
    public long[] values;

    public final int add(long j) {
        int i = this.size + 1;
        long[] jArr = this.values;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            ArraysKt___ArraysJvmKt.copyInto$default(0, jArr, 0, jArr2, 12);
            ArraysKt___ArraysJvmKt.copyInto$default(0, this.index, 0, 14, iArr);
            this.values = jArr2;
            this.index = iArr;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        int length2 = this.handles.length;
        if (this.firstFreeHandle >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(0, this.handles, 0, 14, iArr2);
            this.handles = iArr2;
        }
        int i7 = this.firstFreeHandle;
        int[] iArr3 = this.handles;
        this.firstFreeHandle = iArr3[i7];
        long[] jArr3 = this.values;
        jArr3[i3] = j;
        this.index[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr3[i8], j) <= 0) {
                break;
            }
            swap(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void swap(int i, int i2) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
