package w7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import v7.AbstractC5114e;
import v7.AbstractC5118i;
import w.AbstractC5128c;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5154b extends AbstractC5114e implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public Object[] f41718n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41719u;

    /* renamed from: v, reason: collision with root package name */
    public int f41720v;

    /* renamed from: w, reason: collision with root package name */
    public final C5154b f41721w;

    /* renamed from: x, reason: collision with root package name */
    public final C5155c f41722x;

    public C5154b(Object[] backing, int i, int i4, C5154b c5154b, C5155c root) {
        int i6;
        kotlin.jvm.internal.h.e(backing, "backing");
        kotlin.jvm.internal.h.e(root, "root");
        this.f41718n = backing;
        this.f41719u = i;
        this.f41720v = i4;
        this.f41721w = c5154b;
        this.f41722x = root;
        i6 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i6;
    }

    @Override // v7.AbstractC5114e
    public final int a() {
        g();
        return this.f41720v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f41719u + this.f41720v, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        int size = elements.size();
        e(this.f41719u + this.f41720v, elements, size);
        return size > 0;
    }

    @Override // v7.AbstractC5114e
    public final Object c(int i) {
        h();
        g();
        int i4 = this.f41720v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return i(this.f41719u + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f41719u, this.f41720v);
    }

    public final void e(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        C5155c c5155c = this.f41722x;
        C5154b c5154b = this.f41721w;
        if (c5154b != null) {
            c5154b.e(i, collection, i4);
        } else {
            C5155c c5155c2 = C5155c.f41723w;
            c5155c.e(i, collection, i4);
        }
        this.f41718n = c5155c.f41724n;
        this.f41720v += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Z2.d.e(this.f41718n, this.f41719u, this.f41720v, (List) obj);
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C5155c c5155c = this.f41722x;
        C5154b c5154b = this.f41721w;
        if (c5154b != null) {
            c5154b.f(i, obj);
        } else {
            C5155c c5155c2 = C5155c.f41723w;
            c5155c.f(i, obj);
        }
        this.f41718n = c5155c.f41724n;
        this.f41720v++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.f41722x).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i4 = this.f41720v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return this.f41718n[this.f41719u + i];
    }

    public final void h() {
        if (this.f41722x.f41726v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f41718n;
        int i = this.f41720v;
        int i4 = 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[this.f41719u + i6];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i) {
        Object i4;
        ((AbstractList) this).modCount++;
        C5154b c5154b = this.f41721w;
        if (c5154b != null) {
            i4 = c5154b.i(i);
        } else {
            C5155c c5155c = C5155c.f41723w;
            i4 = this.f41722x.i(i);
        }
        this.f41720v--;
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.f41720v; i++) {
            if (kotlin.jvm.internal.h.a(this.f41718n[this.f41719u + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f41720v == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        C5154b c5154b = this.f41721w;
        if (c5154b != null) {
            c5154b.j(i, i4);
        } else {
            C5155c c5155c = C5155c.f41723w;
            this.f41722x.j(i, i4);
        }
        this.f41720v -= i4;
    }

    public final int k(int i, int i4, Collection collection, boolean z6) {
        int k9;
        C5154b c5154b = this.f41721w;
        if (c5154b != null) {
            k9 = c5154b.k(i, i4, collection, z6);
        } else {
            C5155c c5155c = C5155c.f41723w;
            k9 = this.f41722x.k(i, i4, collection, z6);
        }
        if (k9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f41720v -= k9;
        return k9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.f41720v - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.h.a(this.f41718n[this.f41719u + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        return k(this.f41719u, this.f41720v, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        return k(this.f41719u, this.f41720v, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i4 = this.f41720v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f41718n;
        int i6 = this.f41719u;
        Object obj2 = objArr[i6 + i];
        objArr[i6 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        S0.f.c(i, i4, this.f41720v);
        return new C5154b(this.f41718n, this.f41719u + i, i4 - i, this, this.f41722x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        g();
        int length = array.length;
        int i = this.f41720v;
        int i4 = this.f41719u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f41718n, i4, i + i4, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC5118i.u(0, i4, i + i4, this.f41718n, array);
        int i6 = this.f41720v;
        if (i6 < array.length) {
            array[i6] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return Z2.d.f(this.f41718n, this.f41719u, this.f41720v, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i4 = this.f41720v;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return new C5153a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i4 = this.f41720v;
        if (i >= 0 && i <= i4) {
            f(this.f41719u + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        int i4 = this.f41720v;
        if (i >= 0 && i <= i4) {
            int size = elements.size();
            e(this.f41719u + i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f41718n;
        int i = this.f41720v;
        int i4 = this.f41719u;
        return AbstractC5118i.x(objArr, i4, i + i4);
    }
}
