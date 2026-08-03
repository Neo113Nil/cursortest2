package w0;

import bc.b0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m0.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y implements List, qc.c {

    /* renamed from: g, reason: collision with root package name */
    public final q f7622g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7623h;

    /* renamed from: i, reason: collision with root package name */
    public int f7624i;

    /* renamed from: j, reason: collision with root package name */
    public int f7625j;

    public y(q qVar, int i10, int i11) {
        this.f7622g = qVar;
        this.f7623h = i10;
        this.f7624i = r.f(qVar);
        this.f7625j = i11 - i10;
    }

    public final void a() {
        if (r.f(this.f7622g) != this.f7624i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i10 = this.f7623h + this.f7625j;
        q qVar = this.f7622g;
        qVar.add(i10, obj);
        this.f7625j++;
        this.f7624i = r.f(qVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f7625j, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f7625j > 0) {
            a();
            int i10 = this.f7625j;
            int i11 = this.f7623h;
            q qVar = this.f7622g;
            qVar.d(i11, i10 + i11);
            this.f7625j = 0;
            this.f7624i = r.f(qVar);
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
    public final Object get(int i10) {
        a();
        r.a(i10, this.f7625j);
        return this.f7622g.get(this.f7623h + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i10 = this.f7625j;
        int i11 = this.f7623h;
        Iterator it = uc.e.q(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int nextInt = ((uc.c) it).nextInt();
            if (pc.j.a(obj, this.f7622g.get(nextInt))) {
                return nextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7625j == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i10 = this.f7625j;
        int i11 = this.f7623h;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (pc.j.a(obj, this.f7622g.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
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

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        q0.c cVar;
        g k3;
        boolean b2;
        a();
        q qVar = this.f7622g;
        int i11 = this.f7623h;
        int i12 = this.f7625j + i11;
        int size = qVar.size();
        do {
            synchronized (r.f7593a) {
                u uVar = qVar.f7592g;
                pc.j.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                u uVar2 = (u) m.i(uVar);
                i10 = uVar2.f7617d;
                cVar = uVar2.f7616c;
            }
            pc.j.b(cVar);
            q0.f f10 = cVar.f();
            f10.subList(i11, i12).retainAll(collection);
            q0.c d10 = f10.d();
            if (pc.j.a(d10, cVar)) {
                break;
            }
            u uVar3 = qVar.f7592g;
            pc.j.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7580c) {
                k3 = m.k();
                b2 = r.b((u) m.w(uVar3, qVar, k3), i10, d10, true);
            }
            m.n(k3, qVar);
        } while (!b2);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.f7624i = r.f(this.f7622g);
            this.f7625j -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        r.a(i10, this.f7625j);
        a();
        int i11 = i10 + this.f7623h;
        q qVar = this.f7622g;
        Object obj2 = qVar.set(i11, obj);
        this.f7624i = r.f(qVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7625j;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f7625j)) {
            s1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i12 = this.f7623h;
        return new y(this.f7622g, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pc.i.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        a();
        pc.q qVar = new pc.q();
        qVar.f5681g = i10 - 1;
        return new b0(qVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pc.i.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        int i11 = i10 + this.f7623h;
        q qVar = this.f7622g;
        boolean addAll = qVar.addAll(i11, collection);
        if (addAll) {
            this.f7625j = collection.size() + this.f7625j;
            this.f7624i = r.f(qVar);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        a();
        int i11 = this.f7623h + i10;
        q qVar = this.f7622g;
        Object remove = qVar.remove(i11);
        this.f7625j--;
        this.f7624i = r.f(qVar);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        a();
        int i11 = this.f7623h + i10;
        q qVar = this.f7622g;
        qVar.add(i11, obj);
        this.f7625j++;
        this.f7624i = r.f(qVar);
    }
}
