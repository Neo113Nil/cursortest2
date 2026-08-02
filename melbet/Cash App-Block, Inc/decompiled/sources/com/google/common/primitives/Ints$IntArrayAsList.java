package com.google.common.primitives;

import androidx.tracing.Trace;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes4.dex */
public final class Ints$IntArrayAsList extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: array, reason: collision with root package name */
    public final int[] f1001array;
    public final int end;
    public final int start;

    public Ints$IntArrayAsList(int i, int i2, int[] iArr) {
        this.f1001array = iArr;
        this.start = i;
        this.end = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.start;
        while (true) {
            if (i >= this.end) {
                i = -1;
                break;
            }
            if (this.f1001array[i] == intValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ints$IntArrayAsList)) {
            return super.equals(obj);
        }
        Ints$IntArrayAsList ints$IntArrayAsList = (Ints$IntArrayAsList) obj;
        int size = size();
        if (ints$IntArrayAsList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f1001array[this.start + i] != ints$IntArrayAsList.f1001array[ints$IntArrayAsList.start + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Trace.checkElementIndex(i, size());
        return Integer.valueOf(this.f1001array[this.start + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + Integer.hashCode(this.f1001array[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.start;
            int i2 = i;
            while (true) {
                if (i2 >= this.end) {
                    i2 = -1;
                    break;
                }
                if (this.f1001array[i2] == intValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.end;
            while (true) {
                i2--;
                i = this.start;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.f1001array[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        Trace.checkElementIndex(i, size());
        int i2 = this.start + i;
        int[] iArr = this.f1001array;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.end - this.start;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f1001array, this.start, this.end, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        Trace.checkPositionIndexes(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.start;
        return new Ints$IntArrayAsList(i + i3, i3 + i2, this.f1001array);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f1001array;
        int i = this.start;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.end) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
