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
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST = new LongArrayList(new long[0], 0, false);

    /* renamed from: array, reason: collision with root package name */
    private long[] f1024array;
    private int size;

    public LongArrayList() {
        this(new long[10], 0, true);
    }

    private void addLong(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            Path$$ExternalSyntheticBUOutline0.m(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        long[] jArr = this.f1024array;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[Boxes$$ExternalSyntheticOutline1.m$2(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f1024array, i, jArr2, i + 1, this.size - i);
            this.f1024array = jArr2;
        }
        this.f1024array[i] = j;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static LongArrayList emptyList() {
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
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i = longArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f1024array;
        if (i3 > jArr.length) {
            this.f1024array = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(longArrayList.f1024array, 0, this.f1024array, this.size, longArrayList.size);
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
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.f1024array;
        for (int i = 0; i < this.size; i++) {
            if (this.f1024array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.f1024array[i];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashLong(this.f1024array[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1024array[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.f1024array, i), this.size, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.f1024array;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f1024array;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.f1024array;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i, boolean z) {
        super(z);
        this.f1024array = jArr;
        this.size = i;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        addLong(i, l.longValue());
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.f1024array;
        if (i == jArr.length) {
            long[] jArr2 = new long[Boxes$$ExternalSyntheticOutline1.m$2(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f1024array = jArr2;
        }
        long[] jArr3 = this.f1024array;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }
}
