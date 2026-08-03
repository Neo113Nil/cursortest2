package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import pc.i;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements List, qc.c {

    /* renamed from: g, reason: collision with root package name */
    public final e f5128g;

    public b(e eVar) {
        this.f5128g = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f5128g.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f5128g;
        return eVar.e(eVar.f5136i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5128g.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5128g.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f5128g;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f5128g.f5134g[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f5128g.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5128g.f5136i == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f5128g;
        Object[] objArr = eVar.f5134g;
        for (int i10 = eVar.f5136i - 1; i10 >= 0; i10--) {
            if (j.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5128g.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f5128g;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = eVar.f5136i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.j(it.next());
        }
        return i10 != eVar.f5136i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f5128g;
        int i10 = eVar.f5136i;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(eVar.f5134g[i11])) {
                eVar.k(i11);
            }
        }
        return i10 != eVar.f5136i;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        Object[] objArr = this.f5128g.f5134g;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5128g.f5136i;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        f.b(this, i10, i11);
        return new c(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f5128g.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        return this.f5128g.k(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f5128g.e(i10, collection);
    }
}
