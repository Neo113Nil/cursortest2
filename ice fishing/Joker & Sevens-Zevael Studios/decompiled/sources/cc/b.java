package cc;

import bc.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends bc.g implements RandomAccess, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public Object[] f1298g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1299h;

    /* renamed from: i, reason: collision with root package name */
    public int f1300i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1301j;

    /* renamed from: k, reason: collision with root package name */
    public final c f1302k;

    public b(Object[] objArr, int i10, int i11, b bVar, c cVar) {
        int i12;
        pc.j.e(objArr, "backing");
        pc.j.e(cVar, "root");
        this.f1298g = objArr;
        this.f1299h = i10;
        this.f1300i = i11;
        this.f1301j = bVar;
        this.f1302k = cVar;
        i12 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i12;
    }

    @Override // bc.g
    public final int a() {
        g();
        return this.f1300i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f1299h + this.f1300i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        pc.j.e(collection, "elements");
        h();
        g();
        int size = collection.size();
        e(this.f1299h + this.f1300i, collection, size);
        return size > 0;
    }

    @Override // bc.g
    public final Object b(int i10) {
        h();
        g();
        int i11 = this.f1300i;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return i(this.f1299h + i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f1299h, this.f1300i);
    }

    public final void e(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1302k;
        b bVar = this.f1301j;
        if (bVar != null) {
            bVar.e(i10, collection, i11);
        } else {
            c cVar2 = c.f1303j;
            cVar.e(i10, collection, i11);
        }
        this.f1298g = cVar.f1304g;
        this.f1300i += i11;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1298g;
            int i10 = this.f1300i;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (pc.j.a(objArr[this.f1299h + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1302k;
        b bVar = this.f1301j;
        if (bVar != null) {
            bVar.f(i10, obj);
        } else {
            c cVar2 = c.f1303j;
            cVar.f(i10, obj);
        }
        this.f1298g = cVar.f1304g;
        this.f1300i++;
    }

    public final void g() {
        int i10;
        i10 = ((AbstractList) this.f1302k).modCount;
        if (i10 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g();
        int i11 = this.f1300i;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return this.f1298g[this.f1299h + i10];
    }

    public final void h() {
        if (this.f1302k.f1306i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f1298g;
        int i10 = this.f1300i;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[this.f1299h + i12];
            i11 = (i11 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i11;
    }

    public final Object i(int i10) {
        Object i11;
        ((AbstractList) this).modCount++;
        b bVar = this.f1301j;
        if (bVar != null) {
            i11 = bVar.i(i10);
        } else {
            c cVar = c.f1303j;
            i11 = this.f1302k.i(i10);
        }
        this.f1300i--;
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f1300i; i10++) {
            if (pc.j.a(this.f1298g[this.f1299h + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f1300i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f1301j;
        if (bVar != null) {
            bVar.j(i10, i11);
        } else {
            c cVar = c.f1303j;
            this.f1302k.j(i10, i11);
        }
        this.f1300i -= i11;
    }

    public final int k(int i10, int i11, Collection collection, boolean z10) {
        int k3;
        b bVar = this.f1301j;
        if (bVar != null) {
            k3 = bVar.k(i10, i11, collection, z10);
        } else {
            c cVar = c.f1303j;
            k3 = this.f1302k.k(i10, i11, collection, z10);
        }
        if (k3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1300i -= k3;
        return k3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i10 = this.f1300i - 1; i10 >= 0; i10--) {
            if (pc.j.a(this.f1298g[this.f1299h + i10], obj)) {
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
        h();
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
        h();
        g();
        return k(this.f1299h, this.f1300i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        pc.j.e(collection, "elements");
        h();
        g();
        return k(this.f1299h, this.f1300i, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        h();
        g();
        int i11 = this.f1300i;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        Object[] objArr = this.f1298g;
        int i12 = this.f1299h;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        x4.f.A(i10, i11, this.f1300i);
        return new b(this.f1298g, this.f1299h + i10, i11 - i10, this, this.f1302k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        pc.j.e(objArr, "array");
        g();
        int length = objArr.length;
        int i10 = this.f1300i;
        int i11 = this.f1299h;
        if (length < i10) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1298g, i11, i10 + i11, objArr.getClass());
            pc.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        l.R(this.f1298g, objArr, 0, i11, i10 + i11);
        int i12 = this.f1300i;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return v6.a.l(this.f1298g, this.f1299h, this.f1300i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g();
        int i11 = this.f1300i;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        h();
        g();
        int i11 = this.f1300i;
        if (i10 >= 0 && i10 <= i11) {
            f(this.f1299h + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        pc.j.e(collection, "elements");
        h();
        g();
        int i11 = this.f1300i;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            e(this.f1299h + i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f1298g;
        int i10 = this.f1300i;
        int i11 = this.f1299h;
        return l.U(objArr, i11, i10 + i11);
    }
}
