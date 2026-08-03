package cc;

import bc.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends bc.g implements RandomAccess, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final c f1303j;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f1304g;

    /* renamed from: h, reason: collision with root package name */
    public int f1305h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1306i;

    static {
        c cVar = new c(0);
        cVar.f1306i = true;
        f1303j = cVar;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f1304g = new Object[i10];
    }

    @Override // bc.g
    public final int a() {
        return this.f1305h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i10 = this.f1305h;
        ((AbstractList) this).modCount++;
        h(i10, 1);
        this.f1304g[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        pc.j.e(collection, "elements");
        g();
        int size = collection.size();
        e(this.f1305h, collection, size);
        return size > 0;
    }

    @Override // bc.g
    public final Object b(int i10) {
        g();
        int i11 = this.f1305h;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return i(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f1305h);
    }

    public final void e(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        h(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1304g[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1304g;
            int i10 = this.f1305h;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (pc.j.a(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        h(i10, 1);
        this.f1304g[i10] = obj;
    }

    public final void g() {
        if (this.f1306i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f1305h;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return this.f1304g[i10];
    }

    public final void h(int i10, int i11) {
        int i12 = this.f1305h + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f1304g;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i13);
            pc.j.d(copyOf, "copyOf(...)");
            this.f1304g = copyOf;
        }
        Object[] objArr2 = this.f1304g;
        l.R(objArr2, objArr2, i10 + i11, i10, this.f1305h);
        this.f1305h += i11;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f1304g;
        int i10 = this.f1305h;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            i11 = (i11 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i11;
    }

    public final Object i(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f1304g;
        Object obj = objArr[i10];
        l.R(objArr, objArr, i10, i10 + 1, this.f1305h);
        Object[] objArr2 = this.f1304g;
        int i11 = this.f1305h - 1;
        pc.j.e(objArr2, "<this>");
        objArr2[i11] = null;
        this.f1305h--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f1305h; i10++) {
            if (pc.j.a(this.f1304g[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1305h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f1304g;
        l.R(objArr, objArr, i10, i10 + i11, this.f1305h);
        Object[] objArr2 = this.f1304g;
        int i12 = this.f1305h;
        v6.a.Q(objArr2, i12 - i11, i12);
        this.f1305h -= i11;
    }

    public final int k(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f1304g[i14]) == z10) {
                Object[] objArr = this.f1304g;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f1304g;
        l.R(objArr2, objArr2, i10 + i13, i11 + i10, this.f1305h);
        Object[] objArr3 = this.f1304g;
        int i16 = this.f1305h;
        v6.a.Q(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1305h -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f1305h - 1; i10 >= 0; i10--) {
            if (pc.j.a(this.f1304g[i10], obj)) {
                return i10;
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
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        pc.j.e(collection, "elements");
        g();
        return k(0, this.f1305h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        pc.j.e(collection, "elements");
        g();
        return k(0, this.f1305h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        g();
        int i11 = this.f1305h;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        Object[] objArr = this.f1304g;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        x4.f.A(i10, i11, this.f1305h);
        return new b(this.f1304g, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        pc.j.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f1305h;
        if (length < i10) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1304g, 0, i10, objArr.getClass());
            pc.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        l.R(this.f1304g, objArr, 0, 0, i10);
        int i11 = this.f1305h;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return v6.a.l(this.f1304g, 0, this.f1305h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f1305h;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        pc.j.e(collection, "elements");
        g();
        int i11 = this.f1305h;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            e(i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        g();
        int i11 = this.f1305h;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            h(i10, 1);
            this.f1304g[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return l.U(this.f1304g, 0, this.f1305h);
    }
}
