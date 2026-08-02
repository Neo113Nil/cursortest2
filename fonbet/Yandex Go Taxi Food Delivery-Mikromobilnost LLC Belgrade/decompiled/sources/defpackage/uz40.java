package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class uz40 implements List, zfx {
    public final wz40 a;

    public uz40(wz40 wz40Var) {
        this.a = wz40Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        wz40 wz40Var = this.a;
        return wz40Var.e(wz40Var.c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xz40.a(i, this);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new vz40(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        wz40 wz40Var = this.a;
        Object[] objArr = wz40Var.a;
        for (int i = wz40Var.c - 1; i >= 0; i--) {
            if (jl40.l(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new vz40(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        xz40.a(i, this);
        return this.a.k(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        wz40 wz40Var = this.a;
        int i = wz40Var.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            wz40Var.j(it.next());
        }
        return i != wz40Var.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        wz40 wz40Var = this.a;
        int i = wz40Var.c;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(wz40Var.a[i2])) {
                wz40Var.k(i2);
            }
        }
        return i != wz40Var.c;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        xz40.a(i, this);
        Object[] objArr = this.a.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        xz40.b(i, i2, this);
        return new vy40(i, i2, 1, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return vng.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return vng.K(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new vz40(this, i);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.j(obj);
    }
}
