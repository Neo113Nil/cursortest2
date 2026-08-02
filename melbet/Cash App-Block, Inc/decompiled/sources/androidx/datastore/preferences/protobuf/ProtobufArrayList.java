package androidx.datastore.preferences.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ProtobufArrayList extends AbstractProtobufList implements RandomAccess {
    public static final ProtobufArrayList EMPTY_LIST = new ProtobufArrayList(new Object[0], 0, false);

    /* renamed from: array, reason: collision with root package name */
    public Object[] f864array;
    public int size;

    public ProtobufArrayList(Object[] objArr, int i, boolean z) {
        this.isMutable = z;
        this.f864array = objArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            Path$$ExternalSyntheticBUOutline0.m(this.size, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.f864array;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[Boxes$$ExternalSyntheticOutline1.m$2(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f864array, i, objArr2, i + 1, this.size - i);
            this.f864array = objArr2;
        }
        this.f864array[i] = obj;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public final void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            Path$$ExternalSyntheticBUOutline0.m(this.size, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ensureIndexInRange(i);
        return this.f864array[i];
    }

    public final ProtobufArrayList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new ProtobufArrayList(Arrays.copyOf(this.f864array, i), this.size, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.f864array;
        Object obj = objArr[i];
        if (i < this.size - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.f864array;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i = this.size;
        Object[] objArr = this.f864array;
        if (i == objArr.length) {
            this.f864array = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f864array;
        int i2 = this.size;
        this.size = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
