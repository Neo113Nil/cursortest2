package defpackage;

import androidx.core.app.q;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
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
public final class m8g extends h8 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final m8g d;
    public final n8g e;

    public m8g(Object[] objArr, int i, int i2, m8g m8gVar, n8g n8gVar) {
        int i3;
        objArr.getClass();
        n8gVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = m8gVar;
        this.e = n8gVar;
        i3 = ((AbstractList) n8gVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.e.c) {
            return new cip(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.h8
    public final Object a(int i) {
        s();
        r();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.b(i, i2);
        return t(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        s();
        r();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.c(i, i2);
        q(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        s();
        r();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.c(i, i2);
        int size = collection.size();
        o(this.b + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        s();
        r();
        u(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        r();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.d(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h8
    public final int f() {
        r();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        r();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.b(i, i2);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        r();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        r();
        for (int i = 0; i < this.c; i++) {
            if (Intrinsics.d(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        r();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        r();
        for (int i = this.c - 1; i >= 0; i--) {
            if (Intrinsics.d(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        r();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.c(i, i2);
        return new ezd(this, i);
    }

    public final void o(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        n8g n8gVar = this.e;
        m8g m8gVar = this.d;
        if (m8gVar != null) {
            m8gVar.o(i, collection, i2);
        } else {
            n8g n8gVar2 = n8g.d;
            n8gVar.o(i, collection, i2);
        }
        this.a = n8gVar.a;
        this.c += i2;
    }

    public final void q(int i, Object obj) {
        ((AbstractList) this).modCount++;
        n8g n8gVar = this.e;
        m8g m8gVar = this.d;
        if (m8gVar != null) {
            m8gVar.q(i, obj);
        } else {
            n8g n8gVar2 = n8g.d;
            n8gVar.q(i, obj);
        }
        this.a = n8gVar.a;
        this.c++;
    }

    public final void r() {
        int i;
        i = ((AbstractList) this.e).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        xq0.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        s();
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
        s();
        r();
        return v(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        s();
        r();
        return v(this.b, this.c, collection, true) > 0;
    }

    public final void s() {
        if (this.e.c) {
            q.i();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        s();
        r();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.b(i, i2);
        Object[] objArr = this.a;
        int i3 = this.b + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        b7 b7Var = a.a;
        int i3 = this.c;
        b7Var.getClass();
        b7.d(i, i2, i3);
        return new m8g(this.a, this.b + i, i2 - i, this, this.e);
    }

    public final Object t(int i) {
        Object t;
        ((AbstractList) this).modCount++;
        m8g m8gVar = this.d;
        if (m8gVar != null) {
            t = m8gVar.t(i);
        } else {
            n8g n8gVar = n8g.d;
            t = this.e.t(i);
        }
        this.c--;
        return t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        r();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        uz0.f(0, i2, i + i2, objArr2, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        r();
        return o8g.j(this.a, this.b, this.c, this);
    }

    public final void u(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        m8g m8gVar = this.d;
        if (m8gVar != null) {
            m8gVar.u(i, i2);
        } else {
            n8g n8gVar = n8g.d;
            this.e.u(i, i2);
        }
        this.c -= i2;
    }

    public final int v(int i, int i2, Collection collection, boolean z) {
        int v;
        m8g m8gVar = this.d;
        if (m8gVar != null) {
            v = m8gVar.v(i, i2, collection, z);
        } else {
            n8g n8gVar = n8g.d;
            v = this.e.v(i, i2, collection, z);
        }
        if (v > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= v;
        return v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s();
        r();
        q(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        s();
        r();
        int size = collection.size();
        o(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        r();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return uz0.k(i2, i + i2, objArr);
    }
}
