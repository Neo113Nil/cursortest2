package s7;

import a.AbstractC0415a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r7.AbstractC4974e;
import r7.AbstractC4978i;
import t0.AbstractC5051n;

/* renamed from: s7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5003c extends AbstractC4974e implements RandomAccess, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final C5003c f40498w;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f40499n;

    /* renamed from: u, reason: collision with root package name */
    public int f40500u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40501v;

    static {
        C5003c c5003c = new C5003c(0);
        c5003c.f40501v = true;
        f40498w = c5003c;
    }

    public C5003c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f40499n = new Object[i];
    }

    @Override // r7.AbstractC4974e
    public final int a() {
        return this.f40500u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.f40500u;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f40499n[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int size = elements.size();
        e(this.f40500u, elements, size);
        return size > 0;
    }

    @Override // r7.AbstractC4974e
    public final Object c(int i) {
        g();
        int i4 = this.f40500u;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return i(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f40500u);
    }

    public final void e(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        h(i, i4);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i4; i9++) {
            this.f40499n[i + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (AbstractC0415a.c(this.f40499n, 0, this.f40500u, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f40499n[i] = obj;
    }

    public final void g() {
        if (this.f40501v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i4 = this.f40500u;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return this.f40499n[i];
    }

    public final void h(int i, int i4) {
        int i9 = this.f40500u + i4;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f40499n;
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
            this.f40499n = copyOf;
        }
        Object[] objArr2 = this.f40499n;
        AbstractC4978i.I(i + i4, i, this.f40500u, objArr2, objArr2);
        this.f40500u += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f40499n;
        int i = this.f40500u;
        int i4 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f40499n;
        Object obj = objArr[i];
        AbstractC4978i.I(i, i + 1, this.f40500u, objArr, objArr);
        Object[] objArr2 = this.f40499n;
        int i4 = this.f40500u - 1;
        kotlin.jvm.internal.h.e(objArr2, "<this>");
        objArr2[i4] = null;
        this.f40500u--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f40500u; i++) {
            if (kotlin.jvm.internal.h.a(this.f40499n[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f40500u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f40499n;
        AbstractC4978i.I(i, i + i4, this.f40500u, objArr, objArr);
        Object[] objArr2 = this.f40499n;
        int i9 = this.f40500u;
        AbstractC0415a.y(objArr2, i9 - i4, i9);
        this.f40500u -= i4;
    }

    public final int k(int i, int i4, Collection collection, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i4) {
            int i11 = i + i9;
            if (collection.contains(this.f40499n[i11]) == z8) {
                Object[] objArr = this.f40499n;
                i9++;
                objArr[i10 + i] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i4 - i10;
        Object[] objArr2 = this.f40499n;
        AbstractC4978i.I(i + i10, i4 + i, this.f40500u, objArr2, objArr2);
        Object[] objArr3 = this.f40499n;
        int i13 = this.f40500u;
        AbstractC0415a.y(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f40500u -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f40500u - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.h.a(this.f40499n[i], obj)) {
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
        return k(0, this.f40500u, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        return k(0, this.f40500u, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i4 = this.f40500u;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f40499n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        com.bumptech.glide.g.D(i, i4, this.f40500u);
        return new C5002b(this.f40499n, i, i4 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i = this.f40500u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f40499n, 0, i, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC4978i.I(0, 0, i, this.f40499n, array);
        int i4 = this.f40500u;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0415a.d(this.f40499n, 0, this.f40500u, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i4 = this.f40500u;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return new C5001a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        g();
        int i4 = this.f40500u;
        if (i >= 0 && i <= i4) {
            int size = elements.size();
            e(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i4 = this.f40500u;
        if (i >= 0 && i <= i4) {
            ((AbstractList) this).modCount++;
            h(i, 1);
            this.f40499n[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC4978i.L(this.f40499n, 0, this.f40500u);
    }
}
