package com.google.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = new ProtobufArrayList<>(new Object[0], 0, false);

    /* renamed from: array, reason: collision with root package name */
    private E[] f1025array;
    private int size;

    public ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            Path$$ExternalSyntheticBUOutline0.m(makeOutOfBoundsExceptionMessage(i));
            return;
        }
        E[] eArr = this.f1025array;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) createArray(Boxes$$ExternalSyntheticOutline1.m$2(i2, 3, 2, 1));
            System.arraycopy(this.f1025array, 0, eArr2, 0, i);
            System.arraycopy(this.f1025array, i, eArr2, i + 1, this.size - i);
            this.f1025array = eArr2;
        }
        this.f1025array[i] = e;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ensureIndexInRange(i);
        return this.f1025array[i];
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.f1025array, i), this.size, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        E[] eArr = this.f1025array;
        E e = eArr[i];
        if (i < this.size - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ensureIsMutable();
        ensureIndexInRange(i);
        E[] eArr = this.f1025array;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i, boolean z) {
        super(z);
        this.f1025array = eArr;
        this.size = i;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ensureIsMutable();
        int i = this.size;
        E[] eArr = this.f1025array;
        if (i == eArr.length) {
            this.f1025array = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f1025array;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
