package w7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import v7.AbstractC5114e;
import v7.AbstractC5118i;
import w.AbstractC5128c;

/* renamed from: w7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5155c extends AbstractC5114e implements RandomAccess, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final C5155c f41723w;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f41724n;

    /* renamed from: u, reason: collision with root package name */
    public int f41725u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41726v;

    static {
        C5155c c5155c = new C5155c(0);
        c5155c.f41726v = true;
        f41723w = c5155c;
    }

    public C5155c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f41724n = new Object[i];
    }

    @Override // v7.AbstractC5114e
    public final int a() {
        return this.f41725u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.f41725u;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f41724n[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int size = elements.size();
        e(this.f41725u, elements, size);
        return size > 0;
    }

    @Override // v7.AbstractC5114e
    public final Object c(int i) {
        g();
        int i4 = this.f41725u;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return i(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f41725u);
    }

    public final void e(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        h(i, i4);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i4; i6++) {
            this.f41724n[i + i6] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (Z2.d.e(this.f41724n, 0, this.f41725u, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f41724n[i] = obj;
    }

    public final void g() {
        if (this.f41726v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i4 = this.f41725u;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return this.f41724n[i];
    }

    public final void h(int i, int i4) {
        int i6 = this.f41725u + i4;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f41724n;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i9 = length + (length >> 1);
            if (i9 - i6 < 0) {
                i9 = i6;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i9);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f41724n = copyOf;
        }
        Object[] objArr2 = this.f41724n;
        AbstractC5118i.u(i + i4, i, this.f41725u, objArr2, objArr2);
        this.f41725u += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f41724n;
        int i = this.f41725u;
        int i4 = 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f41724n;
        Object obj = objArr[i];
        AbstractC5118i.u(i, i + 1, this.f41725u, objArr, objArr);
        Object[] objArr2 = this.f41724n;
        int i4 = this.f41725u - 1;
        kotlin.jvm.internal.h.e(objArr2, "<this>");
        objArr2[i4] = null;
        this.f41725u--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f41725u; i++) {
            if (kotlin.jvm.internal.h.a(this.f41724n[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f41725u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f41724n;
        AbstractC5118i.u(i, i + i4, this.f41725u, objArr, objArr);
        Object[] objArr2 = this.f41724n;
        int i6 = this.f41725u;
        Z2.d.p(objArr2, i6 - i4, i6);
        this.f41725u -= i4;
    }

    public final int k(int i, int i4, Collection collection, boolean z6) {
        int i6 = 0;
        int i9 = 0;
        while (i6 < i4) {
            int i10 = i + i6;
            if (collection.contains(this.f41724n[i10]) == z6) {
                Object[] objArr = this.f41724n;
                i6++;
                objArr[i9 + i] = objArr[i10];
                i9++;
            } else {
                i6++;
            }
        }
        int i11 = i4 - i9;
        Object[] objArr2 = this.f41724n;
        AbstractC5118i.u(i + i9, i4 + i, this.f41725u, objArr2, objArr2);
        Object[] objArr3 = this.f41724n;
        int i12 = this.f41725u;
        Z2.d.p(objArr3, i12 - i11, i12);
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f41725u -= i11;
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f41725u - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.h.a(this.f41724n[i], obj)) {
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
        g();
        return k(0, this.f41725u, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        return k(0, this.f41725u, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i4 = this.f41725u;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f41724n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        S0.f.c(i, i4, this.f41725u);
        return new C5154b(this.f41724n, i, i4 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i = this.f41725u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f41724n, 0, i, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC5118i.u(0, 0, i, this.f41724n, array);
        int i4 = this.f41725u;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Z2.d.f(this.f41724n, 0, this.f41725u, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i4 = this.f41725u;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        return new C5153a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int i4 = this.f41725u;
        if (i >= 0 && i <= i4) {
            int size = elements.size();
            e(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i4 = this.f41725u;
        if (i >= 0 && i <= i4) {
            ((AbstractList) this).modCount++;
            h(i, 1);
            this.f41724n[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC5118i.x(this.f41724n, 0, this.f41725u);
    }
}
