package com.gamericefishpro.space.qh;

import com.gamericefishpro.space.f1.a0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.ph.k implements List, RandomAccess, Serializable {
    private static final c v = new c(null);
    public static final d w;
    public Object[] d;
    public int e;
    public boolean i;

    static {
        d dVar = new d(0);
        dVar.i = true;
        w = dVar;
    }

    public d() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i = this.e;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.d[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        int size = elements.size();
        f(this.e, elements, size);
        return size > 0;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final int b() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final Object c(int i) {
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.a(i, i2);
        return m(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        n(0, this.e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.e;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.a(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.d[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.a(i, i2);
        return this.d[i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.d[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.d;
        int i = this.e;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.e; i++) {
            if (Intrinsics.a(this.d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void l(int i, int i2) {
        int i3 = this.e + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.d;
        if (i3 > objArr.length) {
            com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
            int length = objArr.length;
            cVar.getClass();
            int iD = com.gamericefishpro.space.ph.c.d(length, i3);
            Object[] objArr2 = this.d;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iD);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.d = objArrCopyOf;
        }
        Object[] objArr3 = this.d;
        u.d(i + i2, i, this.e, objArr3, objArr3);
        this.e += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.e - 1; i >= 0; i--) {
            if (Intrinsics.a(this.d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.d;
        Object obj = objArr[i];
        u.d(i, i + 1, this.e, objArr, objArr);
        Object[] objArr2 = this.d;
        int i2 = this.e - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i2] = null;
        this.e--;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.d;
        u.d(i, i + i2, this.e, objArr, objArr);
        Object[] objArr2 = this.d;
        int i3 = this.e;
        y3.K(objArr2, i3 - i2, i3);
        this.e -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.d[i5]) == z) {
                Object[] objArr = this.d;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.d;
        u.d(i + i4, i2 + i, this.e, objArr2, objArr2);
        Object[] objArr3 = this.d;
        int i7 = this.e;
        y3.K(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.e -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        return o(0, this.e, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        return o(0, this.e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.a(i, i2);
        Object[] objArr = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i3 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.c(i, i2, i3);
        return new b(this.d, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.d, 0, i, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        u.d(0, 0, i, this.d, array);
        int i2 = this.e;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return y3.k(this.d, 0, this.e, this);
    }

    public /* synthetic */ d(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.b(i, i2);
        return new a0(this, i);
    }

    public d(int i) {
        if (i >= 0) {
            this.d = new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.b(i, i2);
        int size = elements.size();
        f(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.e;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.b(i, i2);
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.d[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return u.h(this.d, 0, this.e);
    }
}
