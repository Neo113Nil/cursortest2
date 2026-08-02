package androidx.media3.common.util;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LongArray {
    public final /* synthetic */ int $r8$classId;
    public int size;
    public long[] values;

    public LongArray() {
        this.$r8$classId = 1;
        this.values = new long[2];
    }

    public final void add(long j) {
        switch (this.$r8$classId) {
            case 0:
                int i = this.size;
                long[] jArr = this.values;
                if (i == jArr.length) {
                    this.values = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.values;
                int i2 = this.size;
                this.size = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!contains(j)) {
                    int i3 = this.size;
                    long[] jArr3 = this.values;
                    if (i3 >= jArr3.length) {
                        jArr3 = Arrays.copyOf(jArr3, Math.max(i3 + 1, jArr3.length * 2));
                        this.values = jArr3;
                    }
                    jArr3[i3] = j;
                    if (i3 >= this.size) {
                        this.size = i3 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public void addAll(long[] jArr) {
        int length = this.size + jArr.length;
        long[] jArr2 = this.values;
        if (length > jArr2.length) {
            this.values = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.values, this.size, jArr.length);
        this.size = length;
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(long j) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long get(int i) {
        if (i >= 0 && i < this.size) {
            return this.values[i];
        }
        Path$$ExternalSyntheticBUOutline0.m(this.size, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Invalid index ", ", size is "));
        return 0L;
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public long m1140get_I2yYro(int i) {
        return this.values[i];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void remove(long j) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.values[i2]) {
                int i3 = this.size - 1;
                while (i2 < i3) {
                    long[] jArr = this.values;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return;
            }
            i2++;
        }
    }

    public void removeAt(int i) {
        int i2 = this.size;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = this.values;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.size--;
        }
    }

    public LongArray(int i) {
        this.$r8$classId = 0;
        this.values = new long[i];
    }
}
