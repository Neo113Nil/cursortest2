package com.google.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.protobuf.Internal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = new IntArrayList(new int[0], 0, false);

    /* renamed from: array, reason: collision with root package name */
    private int[] f1022array;
    private int size;

    public IntArrayList() {
        this(new int[10], 0, true);
    }

    private void addInt(int i, int i2) {
        int i3;
        ensureIsMutable();
        if (i < 0 || i > (i3 = this.size)) {
            Path$$ExternalSyntheticBUOutline0.m(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        int[] iArr = this.f1022array;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[Boxes$$ExternalSyntheticOutline1.m$2(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f1022array, i, iArr2, i + 1, this.size - i);
            this.f1022array = iArr2;
        }
        this.f1022array[i] = i2;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            Path$$ExternalSyntheticBUOutline0.m(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index:", ", Size:");
        m2m.append(this.size);
        return m2m.toString();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i = intArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f1022array;
        if (i3 > iArr.length) {
            this.f1022array = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(intArrayList.f1022array, 0, this.f1022array, this.size, intArrayList.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.f1022array;
        for (int i = 0; i < this.size; i++) {
            if (this.f1022array[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i) {
        ensureIndexInRange(i);
        return this.f1022array[i];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.f1022array[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1022array[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.f1022array, i), this.size, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.f1022array;
        int i2 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f1022array;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i, int i2) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.f1022array;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i, boolean z) {
        super(z);
        this.f1022array = iArr;
        this.size = i;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, Integer num) {
        addInt(i, num.intValue());
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i) {
        ensureIsMutable();
        int i2 = this.size;
        int[] iArr = this.f1022array;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[Boxes$$ExternalSyntheticOutline1.m$2(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f1022array = iArr2;
        }
        int[] iArr3 = this.f1022array;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }
}
