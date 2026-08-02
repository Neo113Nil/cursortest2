package defpackage;

import androidx.core.app.q;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n8g extends h8 implements List, RandomAccess, Serializable {
    public static final n8g d;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        n8g n8gVar = new n8g(0);
        n8gVar.c = true;
        d = n8gVar;
    }

    public n8g(int i) {
        if (i >= 0) {
            this.a = new Object[i];
        } else {
            xq0.x("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() {
        if (this.c) {
            return new cip(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.h8
    public final Object a(int i) {
        r();
        b7 b7Var = a.a;
        int i2 = this.b;
        b7Var.getClass();
        b7.b(i, i2);
        return t(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        r();
        b7 b7Var = a.a;
        int i2 = this.b;
        b7Var.getClass();
        b7.c(i, i2);
        ((AbstractList) this).modCount++;
        s(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        r();
        b7 b7Var = a.a;
        int i2 = this.b;
        b7Var.getClass();
        b7.c(i, i2);
        int size = collection.size();
        o(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        r();
        u(0, this.b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.d(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h8
    public final int f() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b7 b7Var = a.a;
        int i2 = this.b;
        b7Var.getClass();
        b7.b(i, i2);
        return this.a[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (Intrinsics.d(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (Intrinsics.d(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        b7 b7Var = a.a;
        int i2 = this.b;
        b7Var.getClass();
        b7.c(i, i2);
        return new ezd(this, i);
    }

    public final void o(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        s(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    public final void q(int i, Object obj) {
        ((AbstractList) this).modCount++;
        s(i, 1);
        this.a[i] = obj;
    }

    public final void r() {
        if (this.c) {
            q.i();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        r();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            a(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        r();
        return v(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        r();
        return v(0, this.b, collection, true) > 0;
    }

    public final void s(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.a;
        if (i3 > objArr.length) {
            b7 b7Var = a.a;
            int length = objArr.length;
            b7Var.getClass();
            int e = b7.e(length, i3);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            this.a = Arrays.copyOf(objArr2, e);
        }
        Object[] objArr3 = this.a;
        uz0.f(i + i2, i, this.b, objArr3, objArr3);
        this.b += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        r();
        b7 b7Var = a.a;
        int i2 = this.b;
        b7Var.getClass();
        b7.b(i, i2);
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        b7 b7Var = a.a;
        int i3 = this.b;
        b7Var.getClass();
        b7.d(i, i2, i3);
        return new m8g(this.a, i, i2 - i, null, this);
    }

    public final Object t(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        uz0.f(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.b;
        Object[] objArr2 = this.a;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        uz0.f(0, 0, i, objArr2, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o8g.j(this.a, 0, this.b, this);
    }

    public final void u(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.a;
        uz0.f(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        o8g.L(i3 - i2, i3, objArr2);
        this.b -= i2;
    }

    public final int v(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        uz0.f(i + i4, i2 + i, this.b, objArr, objArr);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        o8g.L(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ n8g(Object obj) {
        this(10);
    }

    public n8g() {
        this((Object) null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        r();
        int i = this.b;
        ((AbstractList) this).modCount++;
        s(i, 1);
        this.a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        r();
        int size = collection.size();
        o(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return uz0.k(0, this.b, this.a);
    }
}
