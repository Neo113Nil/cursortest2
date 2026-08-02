package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class x7 extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final x7 c;
    public final Collection d;
    public final /* synthetic */ y7 e;
    public final /* synthetic */ y7 f;

    public x7(y7 y7Var, Object obj, List list, x7 x7Var) {
        this.f = y7Var;
        this.e = y7Var;
        this.a = obj;
        this.b = list;
        this.c = x7Var;
        this.d = x7Var == null ? null : x7Var.b;
    }

    public final void a() {
        x7 x7Var = this.c;
        if (x7Var != null) {
            x7Var.a();
        } else {
            this.e.d.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.e.e++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            this.f.e += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.e -= size;
        m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        g();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        g();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        g();
        return this.b.equals(obj);
    }

    public final void g() {
        Collection collection;
        x7 x7Var = this.c;
        if (x7Var != null) {
            x7Var.g();
            if (x7Var.b == this.d) {
                return;
            }
            xq0.i();
            return;
        }
        if (!this.b.isEmpty() || (collection = (Collection) this.e.d.get(this.a)) == null) {
            return;
        }
        this.b = collection;
    }

    @Override // java.util.List
    public final Object get(int i) {
        g();
        return ((List) this.b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        g();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        g();
        return new o7(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        g();
        return new w7(this);
    }

    public final void m() {
        x7 x7Var = this.c;
        if (x7Var != null) {
            x7Var.m();
        } else if (this.b.isEmpty()) {
            this.e.d.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        boolean remove = this.b.remove(obj);
        if (remove) {
            y7 y7Var = this.e;
            y7Var.e--;
            m();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.e.e += this.b.size() - size;
            m();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.e.e += this.b.size() - size;
            m();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        g();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        g();
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        g();
        List subList = ((List) this.b).subList(i, i2);
        x7 x7Var = this.c;
        if (x7Var == null) {
            x7Var = this;
        }
        boolean z = subList instanceof RandomAccess;
        y7 y7Var = this.f;
        Object obj = this.a;
        return z ? new t7(y7Var, obj, subList, x7Var) : new x7(y7Var, obj, subList, x7Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return this.b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        g();
        return new w7(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        g();
        Object remove = ((List) this.b).remove(i);
        y7 y7Var = this.f;
        y7Var.e--;
        m();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        g();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.e++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            this.e.e += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
