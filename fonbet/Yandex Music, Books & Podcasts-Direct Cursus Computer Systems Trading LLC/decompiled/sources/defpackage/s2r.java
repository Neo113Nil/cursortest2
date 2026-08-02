package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s2r implements mer, List, RandomAccess, l9f {
    public r2r a;

    public s2r() {
        sxq sxqVar = sxq.c;
        b2r k = g2r.k();
        r2r r2rVar = new r2r(k.g(), sxqVar);
        if (!(k instanceof emd)) {
            r2rVar.b = new r2r(1, sxqVar);
        }
        this.a = r2rVar;
    }

    public static boolean o(r2r r2rVar, int i, m8 m8Var, boolean z) {
        boolean z2;
        synchronized (fgq.g) {
            try {
                int i2 = r2rVar.d;
                if (i2 == i) {
                    r2rVar.c = m8Var;
                    z2 = true;
                    if (z) {
                        r2rVar.e++;
                    }
                    r2rVar.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.b = this.a;
        this.a = (r2r) perVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        m8 m8Var;
        b2r k;
        boolean o;
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            m8 g = m8Var.g(obj);
            if (g.equals(m8Var)) {
                return false;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i, g, true);
            }
            g2r.n(k, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        m8 m8Var;
        b2r k;
        boolean o;
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            m8 o2 = m8Var.o(collection);
            if (Intrinsics.d(o2, m8Var)) {
                return false;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i, o2, true);
            }
            g2r.n(k, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        b2r k;
        r2r r2rVar = this.a;
        r2rVar.getClass();
        synchronized (g2r.b) {
            k = g2r.k();
            r2r r2rVar2 = (r2r) g2r.w(r2rVar, this, k);
            synchronized (fgq.g) {
                r2rVar2.c = sxq.c;
                r2rVar2.d++;
                r2rVar2.e++;
            }
        }
        g2r.n(k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q().c.containsAll(collection);
    }

    @Override // defpackage.mer
    public final per g() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return q().c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ezd(this, 0);
    }

    public final r2r q() {
        r2r r2rVar = this.a;
        r2rVar.getClass();
        return (r2r) g2r.t(r2rVar, this);
    }

    public final int r() {
        r2r r2rVar = this.a;
        r2rVar.getClass();
        return ((r2r) g2r.i(r2rVar)).e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        m8 m8Var;
        b2r k;
        boolean o;
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            int indexOf = m8Var.indexOf(obj);
            m8 s = indexOf != -1 ? m8Var.s(indexOf) : m8Var;
            if (s.equals(m8Var)) {
                return false;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i, s, true);
            }
            g2r.n(k, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        m8 m8Var;
        b2r k;
        boolean o;
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            m8 r = m8Var.r(new l8(0, collection));
            if (Intrinsics.d(r, m8Var)) {
                return false;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i, r, true);
            }
            g2r.n(k, this);
        } while (!o);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return s(new l8(3, collection));
    }

    public final boolean s(Function1 function1) {
        int i;
        m8 m8Var;
        Object invoke;
        b2r k;
        boolean o;
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            hmk q = m8Var.q();
            invoke = function1.invoke(q);
            m8 g = q.g();
            if (Intrinsics.d(g, m8Var)) {
                break;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i, g, true);
            }
            g2r.n(k, this);
        } while (!o);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        m8 m8Var;
        b2r k;
        boolean o;
        Object obj2 = get(i);
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i2 = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            m8 t = m8Var.t(i, obj);
            if (t.equals(m8Var)) {
                break;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i2, t, false);
            }
            g2r.n(k, this);
        } while (!o);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q().c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            llm.a("fromIndex or toIndex are out of bounds");
        }
        return new smr(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return hld.K(this);
    }

    public final String toString() {
        r2r r2rVar = this.a;
        r2rVar.getClass();
        return "SnapshotStateList(value=" + ((r2r) g2r.i(r2rVar)).c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hld.L(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ezd(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m8 m8Var;
        b2r k;
        boolean o;
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i2 = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            m8 a = m8Var.a(i, obj);
            if (a.equals(m8Var)) {
                return;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i2, a, true);
            }
            g2r.n(k, this);
        } while (!o);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return s(new wk8(i, collection, 6));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        m8 m8Var;
        b2r k;
        boolean o;
        Object obj = get(i);
        do {
            synchronized (fgq.g) {
                r2r r2rVar = this.a;
                r2rVar.getClass();
                r2r r2rVar2 = (r2r) g2r.i(r2rVar);
                i2 = r2rVar2.d;
                m8Var = r2rVar2.c;
            }
            m8Var.getClass();
            m8 s = m8Var.s(i);
            if (s.equals(m8Var)) {
                break;
            }
            r2r r2rVar3 = this.a;
            r2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                o = o((r2r) g2r.w(r2rVar3, this, k), i2, s, true);
            }
            g2r.n(k, this);
        } while (!o);
        return obj;
    }
}
