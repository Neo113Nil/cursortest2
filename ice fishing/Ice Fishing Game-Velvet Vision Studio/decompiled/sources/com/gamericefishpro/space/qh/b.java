package com.gamericefishpro.space.qh;

import com.gamericefishpro.space.f1.a0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.ph.k implements RandomAccess, Serializable {
    public Object[] d;
    public final int e;
    public int i;
    public final b v;
    public final d w;

    public b(Object[] backing, int i, int i2, b bVar, d root) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.d = backing;
        this.e = i;
        this.i = i2;
        this.v = bVar;
        this.w = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        i();
        h(this.e + this.i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l();
        i();
        int size = elements.size();
        f(this.e + this.i, elements, size);
        return size > 0;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final int b() {
        i();
        return this.i;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final Object c(int i) {
        l();
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.a(i, i2);
        return m(this.e + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        i();
        n(this.e, this.i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.i;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.a(objArr[this.e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        d dVar = this.w;
        b bVar = this.v;
        if (bVar != null) {
            bVar.f(i, collection, i2);
        } else {
            d dVar2 = d.w;
            dVar.f(i, collection, i2);
        }
        this.d = dVar.d;
        this.i += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.a(i, i2);
        return this.d[this.e + i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        d dVar = this.w;
        b bVar = this.v;
        if (bVar != null) {
            bVar.h(i, obj);
        } else {
            d dVar2 = d.w;
            dVar.h(i, obj);
        }
        this.d = dVar.d;
        this.i++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        Object[] objArr = this.d;
        int i = this.i;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.e + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (((AbstractList) this.w).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        i();
        for (int i = 0; i < this.i; i++) {
            if (Intrinsics.a(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        i();
        return this.i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void l() {
        if (this.w.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        for (int i = this.i - 1; i >= 0; i--) {
            if (Intrinsics.a(this.d[this.e + i], obj)) {
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
        Object objM;
        ((AbstractList) this).modCount++;
        b bVar = this.v;
        if (bVar != null) {
            objM = bVar.m(i);
        } else {
            d dVar = d.w;
            objM = this.w.m(i);
        }
        this.i--;
        return objM;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.v;
        if (bVar != null) {
            bVar.n(i, i2);
        } else {
            d dVar = d.w;
            this.w.n(i, i2);
        }
        this.i -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int iO;
        b bVar = this.v;
        if (bVar != null) {
            iO = bVar.o(i, i2, collection, z);
        } else {
            d dVar = d.w;
            iO = this.w.o(i, i2, collection, z);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.i -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
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
        l();
        i();
        return o(this.e, this.i, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l();
        i();
        return o(this.e, this.i, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.a(i, i2);
        Object[] objArr = this.d;
        int i3 = this.e + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i3 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.c(i, i2, i3);
        return new b(this.d, this.e + i, i2 - i, this, this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        i();
        int length = array.length;
        int i = this.i;
        int i2 = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.d, i2, i + i2, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        u.d(0, i2, i + i2, this.d, array);
        int i3 = this.i;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        return y3.k(this.d, this.e, this.i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.b(i, i2);
        return new a0(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.b(i, i2);
        h(this.e + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l();
        i();
        com.gamericefishpro.space.ph.c cVar = com.gamericefishpro.space.ph.f.d;
        int i2 = this.i;
        cVar.getClass();
        com.gamericefishpro.space.ph.c.b(i, i2);
        int size = elements.size();
        f(this.e + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        i();
        Object[] objArr = this.d;
        int i = this.i;
        int i2 = this.e;
        return u.h(objArr, i2, i + i2);
    }
}
