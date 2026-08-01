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
import v7.AbstractC5124e;
import v7.AbstractC5128i;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5155b extends AbstractC5124e implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public Object[] f41664n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41665u;

    /* renamed from: v, reason: collision with root package name */
    public int f41666v;

    /* renamed from: w, reason: collision with root package name */
    public final C5155b f41667w;

    /* renamed from: x, reason: collision with root package name */
    public final C5156c f41668x;

    public C5155b(Object[] backing, int i, int i6, C5155b c5155b, C5156c root) {
        int i9;
        kotlin.jvm.internal.h.e(backing, "backing");
        kotlin.jvm.internal.h.e(root, "root");
        this.f41664n = backing;
        this.f41665u = i;
        this.f41666v = i6;
        this.f41667w = c5155b;
        this.f41668x = root;
        i9 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i9;
    }

    @Override // v7.AbstractC5124e
    public final int a() {
        g();
        return this.f41666v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f41665u + this.f41666v, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        int size = elements.size();
        e(this.f41665u + this.f41666v, elements, size);
        return size > 0;
    }

    @Override // v7.AbstractC5124e
    public final Object c(int i) {
        h();
        g();
        int i6 = this.f41666v;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return i(this.f41665u + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f41665u, this.f41666v);
    }

    public final void e(int i, Collection collection, int i6) {
        ((AbstractList) this).modCount++;
        C5156c c5156c = this.f41668x;
        C5155b c5155b = this.f41667w;
        if (c5155b != null) {
            c5155b.e(i, collection, i6);
        } else {
            C5156c c5156c2 = C5156c.f41669w;
            c5156c.e(i, collection, i6);
        }
        this.f41664n = c5156c.f41670n;
        this.f41666v += i6;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return com.bumptech.glide.d.a(this.f41664n, this.f41665u, this.f41666v, (List) obj);
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C5156c c5156c = this.f41668x;
        C5155b c5155b = this.f41667w;
        if (c5155b != null) {
            c5155b.f(i, obj);
        } else {
            C5156c c5156c2 = C5156c.f41669w;
            c5156c.f(i, obj);
        }
        this.f41664n = c5156c.f41670n;
        this.f41666v++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.f41668x).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i6 = this.f41666v;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return this.f41664n[this.f41665u + i];
    }

    public final void h() {
        if (this.f41668x.f41672v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f41664n;
        int i = this.f41666v;
        int i6 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[this.f41665u + i9];
            i6 = (i6 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i6;
    }

    public final Object i(int i) {
        Object i6;
        ((AbstractList) this).modCount++;
        C5155b c5155b = this.f41667w;
        if (c5155b != null) {
            i6 = c5155b.i(i);
        } else {
            C5156c c5156c = C5156c.f41669w;
            i6 = this.f41668x.i(i);
        }
        this.f41666v--;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.f41666v; i++) {
            if (kotlin.jvm.internal.h.a(this.f41664n[this.f41665u + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f41666v == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i6) {
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        C5155b c5155b = this.f41667w;
        if (c5155b != null) {
            c5155b.j(i, i6);
        } else {
            C5156c c5156c = C5156c.f41669w;
            this.f41668x.j(i, i6);
        }
        this.f41666v -= i6;
    }

    public final int k(int i, int i6, Collection collection, boolean z3) {
        int k9;
        C5155b c5155b = this.f41667w;
        if (c5155b != null) {
            k9 = c5155b.k(i, i6, collection, z3);
        } else {
            C5156c c5156c = C5156c.f41669w;
            k9 = this.f41668x.k(i, i6, collection, z3);
        }
        if (k9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f41666v -= k9;
        return k9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.f41666v - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.h.a(this.f41664n[this.f41665u + i], obj)) {
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
        return k(this.f41665u, this.f41666v, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        return k(this.f41665u, this.f41666v, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i6 = this.f41666v;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        Object[] objArr = this.f41664n;
        int i9 = this.f41665u;
        Object obj2 = objArr[i9 + i];
        objArr[i9 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i6) {
        com.bumptech.glide.g.c(i, i6, this.f41666v);
        return new C5155b(this.f41664n, this.f41665u + i, i6 - i, this, this.f41668x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        g();
        int length = array.length;
        int i = this.f41666v;
        int i6 = this.f41665u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f41664n, i6, i + i6, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC5128i.r(0, i6, i + i6, this.f41664n, array);
        int i9 = this.f41666v;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return com.bumptech.glide.d.b(this.f41664n, this.f41665u, this.f41666v, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i6 = this.f41666v;
        if (i < 0 || i > i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return new C5154a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i6 = this.f41666v;
        if (i >= 0 && i <= i6) {
            f(this.f41665u + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        int i6 = this.f41666v;
        if (i >= 0 && i <= i6) {
            int size = elements.size();
            e(this.f41665u + i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f41664n;
        int i = this.f41666v;
        int i6 = this.f41665u;
        return AbstractC5128i.u(objArr, i6, i + i6);
    }
}
