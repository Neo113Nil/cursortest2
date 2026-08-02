package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class uy40 implements List, zfx {
    public final xy40 a;

    public uy40(xy40 xy40Var) {
        this.a = xy40Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        xy40 xy40Var = this.a;
        if (i < 0 || i > (i2 = xy40Var.b)) {
            StringBuilder t = b64.t(i, "Index ", " must be in 0..");
            t.append(xy40Var.b);
            xva1.d(t.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = xy40Var.a;
        if (objArr.length < i3) {
            xy40Var.o(i3, objArr);
        }
        Object[] objArr2 = xy40Var.a;
        int i4 = xy40Var.b;
        if (i != i4) {
            f73.g(objArr2, i + 1, objArr2, i, i4);
        }
        objArr2[i] = obj;
        xy40Var.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        xy40 xy40Var = this.a;
        if (i < 0 || i > xy40Var.b) {
            StringBuilder t = b64.t(i, "Index ", " must be in 0..");
            t.append(xy40Var.b);
            xva1.d(t.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + xy40Var.b;
        Object[] objArr = xy40Var.a;
        if (objArr.length < size) {
            xy40Var.o(size, objArr);
        }
        Object[] objArr2 = xy40Var.a;
        if (i != xy40Var.b) {
            f73.g(objArr2, collection.size() + i, objArr2, i, xy40Var.b);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        xy40Var.b = collection.size() + xy40Var.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.j();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.a.c(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        np60.a(i, this);
        return this.a.b(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ry40(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        xy40 xy40Var = this.a;
        Object[] objArr = xy40Var.a;
        int i = xy40Var.b;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ry40(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        np60.a(i, this);
        return this.a.m(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        xy40 xy40Var = this.a;
        int i = xy40Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xy40Var.l(it.next());
        }
        return i != xy40Var.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        xy40 xy40Var = this.a;
        int i = xy40Var.b;
        Object[] objArr = xy40Var.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                xy40Var.m(i2);
            }
        }
        return i != xy40Var.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        np60.a(i, this);
        return this.a.p(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        np60.b(i, i2, this);
        return new vy40(i, i2, 0, this);
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
    public final ListIterator listIterator(int i) {
        return new ry40(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.g(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        xy40 xy40Var = this.a;
        int i = xy40Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xy40Var.g(it.next());
        }
        return i != xy40Var.b;
    }
}
