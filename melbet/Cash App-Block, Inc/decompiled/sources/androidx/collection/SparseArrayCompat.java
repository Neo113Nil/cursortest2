package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* loaded from: classes.dex */
public final class SparseArrayCompat implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.keys = new int[i5];
        this.values = new Object[i5];
    }

    public final void append(int i, Object obj) {
        int i2 = this.size;
        if (i2 != 0 && i <= this.keys[i2 - 1]) {
            put(i, obj);
            return;
        }
        if (this.garbage && i2 >= this.keys.length) {
            SieveCacheKt.access$gc(this);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.keys = Arrays.copyOf(this.keys, i7);
            this.values = Arrays.copyOf(this.values, i7);
        }
        this.keys[i3] = i;
        this.values[i3] = obj;
        this.size = i3 + 1;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final SparseArrayCompat m129clone() {
        Object clone = super.clone();
        clone.getClass();
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public final int keyAt(int i) {
        if (this.garbage) {
            SieveCacheKt.access$gc(this);
        }
        if (i >= this.size || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.keys[i];
    }

    public final void put(int i, Object obj) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.size, i, this.keys);
        if (binarySearch >= 0) {
            this.values[binarySearch] = obj;
            return;
        }
        int i2 = ~binarySearch;
        int i3 = this.size;
        if (i2 < i3) {
            Object[] objArr = this.values;
            if (objArr[i2] == SieveCacheKt.DELETED$1) {
                this.keys[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.garbage && i3 >= this.keys.length) {
            SieveCacheKt.access$gc(this);
            i2 = ~ContainerHelpersKt.binarySearch(this.size, i, this.keys);
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.keys = Arrays.copyOf(this.keys, i8);
            this.values = Arrays.copyOf(this.values, i8);
        }
        int i9 = this.size;
        if (i9 - i2 != 0) {
            int[] iArr = this.keys;
            int i10 = i2 + 1;
            ArraysKt___ArraysJvmKt.copyInto(i10, iArr, i2, i9, iArr);
            Object[] objArr2 = this.values;
            ArraysKt___ArraysJvmKt.copyInto(i10, i2, this.size, objArr2, objArr2);
        }
        this.keys[i2] = i;
        this.values[i2] = obj;
        this.size++;
    }

    public final int size() {
        if (this.garbage) {
            SieveCacheKt.access$gc(this);
        }
        return this.size;
    }

    public final String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            Object valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object valueAt(int i) {
        if (this.garbage) {
            SieveCacheKt.access$gc(this);
        }
        if (i >= this.size || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.values[i];
    }

    public /* synthetic */ SparseArrayCompat(Object obj) {
        this(10);
    }
}
