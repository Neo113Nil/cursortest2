package w7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import v7.AbstractC5124e;
import v7.AbstractC5128i;

/* renamed from: w7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5156c extends AbstractC5124e implements RandomAccess, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final C5156c f41666w;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f41667n;

    /* renamed from: u, reason: collision with root package name */
    public int f41668u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41669v;

    static {
        C5156c c5156c = new C5156c(0);
        c5156c.f41669v = true;
        f41666w = c5156c;
    }

    public C5156c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f41667n = new Object[i];
    }

    @Override // v7.AbstractC5124e
    public final int a() {
        return this.f41668u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.f41668u;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f41667n[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int size = elements.size();
        e(this.f41668u, elements, size);
        return size > 0;
    }

    @Override // v7.AbstractC5124e
    public final Object c(int i) {
        g();
        int i6 = this.f41668u;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return i(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f41668u);
    }

    public final void e(int i, Collection collection, int i6) {
        ((AbstractList) this).modCount++;
        h(i, i6);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i6; i9++) {
            this.f41667n[i + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (com.bumptech.glide.d.a(this.f41667n, 0, this.f41668u, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f41667n[i] = obj;
    }

    public final void g() {
        if (this.f41669v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i6 = this.f41668u;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return this.f41667n[i];
    }

    public final void h(int i, int i6) {
        int i9 = this.f41668u + i6;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f41667n;
        if (i9 > objArr.length) {
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                i10 = i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f41667n = copyOf;
        }
        Object[] objArr2 = this.f41667n;
        AbstractC5128i.r(i + i6, i, this.f41668u, objArr2, objArr2);
        this.f41668u += i6;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f41667n;
        int i = this.f41668u;
        int i6 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            i6 = (i6 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i6;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f41667n;
        Object obj = objArr[i];
        AbstractC5128i.r(i, i + 1, this.f41668u, objArr, objArr);
        Object[] objArr2 = this.f41667n;
        int i6 = this.f41668u - 1;
        kotlin.jvm.internal.h.e(objArr2, "<this>");
        objArr2[i6] = null;
        this.f41668u--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f41668u; i++) {
            if (kotlin.jvm.internal.h.a(this.f41667n[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f41668u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i6) {
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f41667n;
        AbstractC5128i.r(i, i + i6, this.f41668u, objArr, objArr);
        Object[] objArr2 = this.f41667n;
        int i9 = this.f41668u;
        com.bumptech.glide.d.i(objArr2, i9 - i6, i9);
        this.f41668u -= i6;
    }

    public final int k(int i, int i6, Collection collection, boolean z3) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i6) {
            int i11 = i + i9;
            if (collection.contains(this.f41667n[i11]) == z3) {
                Object[] objArr = this.f41667n;
                i9++;
                objArr[i10 + i] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i6 - i10;
        Object[] objArr2 = this.f41667n;
        AbstractC5128i.r(i + i10, i6 + i, this.f41668u, objArr2, objArr2);
        Object[] objArr3 = this.f41667n;
        int i13 = this.f41668u;
        com.bumptech.glide.d.i(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f41668u -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f41668u - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.h.a(this.f41667n[i], obj)) {
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
        return k(0, this.f41668u, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        return k(0, this.f41668u, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i6 = this.f41668u;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        Object[] objArr = this.f41667n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i6) {
        com.bumptech.glide.g.c(i, i6, this.f41668u);
        return new C5155b(this.f41667n, i, i6 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i = this.f41668u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f41667n, 0, i, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC5128i.r(0, 0, i, this.f41667n, array);
        int i6 = this.f41668u;
        if (i6 < array.length) {
            array[i6] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return com.bumptech.glide.d.b(this.f41667n, 0, this.f41668u, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i6 = this.f41668u;
        if (i < 0 || i > i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        return new C5154a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int i6 = this.f41668u;
        if (i >= 0 && i <= i6) {
            int size = elements.size();
            e(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i6 = this.f41668u;
        if (i >= 0 && i <= i6) {
            ((AbstractList) this).modCount++;
            h(i, 1);
            this.f41667n[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC5128i.u(this.f41667n, 0, this.f41668u);
    }
}
