package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class smr implements List, l9f {
    public final s2r a;
    public final int b;
    public int c;
    public int d;

    public smr(s2r s2rVar, int i, int i2) {
        this.a = s2rVar;
        this.b = i;
        this.c = s2rVar.r();
        this.d = i2 - i;
    }

    public final void a() {
        if (this.a.r() == this.c) {
            return;
        }
        xq0.i();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.d;
        s2r s2rVar = this.a;
        s2rVar.add(i, obj);
        this.d++;
        this.c = s2rVar.r();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        s2r s2rVar = this.a;
        boolean addAll = s2rVar.addAll(i2, collection);
        if (addAll) {
            this.d = collection.size() + this.d;
            this.c = s2rVar.r();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        m8 m8Var;
        b2r k;
        boolean o;
        if (this.d > 0) {
            a();
            s2r s2rVar = this.a;
            int i2 = this.b;
            int i3 = this.d + i2;
            do {
                synchronized (fgq.g) {
                    r2r r2rVar = s2rVar.a;
                    r2rVar.getClass();
                    r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                    i = r2rVar2.d;
                    m8Var = r2rVar2.c;
                }
                m8Var.getClass();
                hmk q = m8Var.q();
                q.subList(i2, i3).clear();
                m8 g = q.g();
                if (Intrinsics.d(g, m8Var)) {
                    break;
                }
                r2r r2rVar3 = s2rVar.a;
                r2rVar3.getClass();
                synchronized (g2r.b) {
                    k = g2r.k();
                    o = s2r.o((r2r) g2r.w(r2rVar3, s2rVar, k), i, g, true);
                }
                g2r.n(k, s2rVar);
            } while (!o);
            this.d = 0;
            this.c = this.a.r();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        fgq.r(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        ype it = yhn.m(i2, i + i2).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (Intrinsics.d(obj, this.a.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.d(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        vqn vqnVar = new vqn();
        vqnVar.a = i - 1;
        return new jdo(vqnVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        s2r s2rVar = this.a;
        Object remove = s2rVar.remove(i2);
        this.d--;
        this.c = s2rVar.r();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        m8 m8Var;
        b2r k;
        boolean o;
        a();
        s2r s2rVar = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = s2rVar.size();
        do {
            synchronized (fgq.g) {
                r2r r2rVar = s2rVar.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            hmk q = m8Var.q();
            q.subList(i2, i3).retainAll(collection);
            m8 g = q.g();
            if (Intrinsics.d(g, m8Var)) {
                break;
            }
            r2r r2rVar3 = s2rVar.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = s2r.o((r2r) g2r.w(r2rVar3, s2rVar, k), i, g, true);
            }
            g2r.n(k, s2rVar);
        } while (!o);
        int size2 = size - s2rVar.size();
        if (size2 > 0) {
            this.c = this.a.r();
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        fgq.r(i, this.d);
        a();
        int i2 = i + this.b;
        s2r s2rVar = this.a;
        Object obj2 = s2rVar.set(i2, obj);
        this.c = s2rVar.r();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            llm.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new smr(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return hld.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hld.L(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        s2r s2rVar = this.a;
        s2rVar.add(i2, obj);
        this.d++;
        this.c = s2rVar.r();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
