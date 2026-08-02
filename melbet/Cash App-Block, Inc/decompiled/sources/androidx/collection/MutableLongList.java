package androidx.collection;

import java.util.Arrays;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public final class MutableLongList {
    public int _size;
    public long[] content;

    public MutableLongList(int i) {
        this.content = i == 0 ? LongSetKt.EmptyLongArray : new long[i];
    }

    public final void add(long j) {
        int i = this._size + 1;
        long[] jArr = this.content;
        if (jArr.length < i) {
            this.content = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.content;
        int i2 = this._size;
        jArr2[i2] = j;
        this._size = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutableLongList) {
            MutableLongList mutableLongList = (MutableLongList) obj;
            int i = mutableLongList._size;
            int i2 = this._size;
            if (i == i2) {
                long[] jArr = this.content;
                long[] jArr2 = mutableLongList.content;
                IntRange until = RangesKt___RangesKt.until(0, i2);
                int i3 = until.first;
                int i4 = until.last;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ MutableLongList() {
        this(16);
    }
}
