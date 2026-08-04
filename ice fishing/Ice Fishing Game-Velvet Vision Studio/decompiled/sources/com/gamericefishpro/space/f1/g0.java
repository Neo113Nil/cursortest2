package com.gamericefishpro.space.f1;

import com.gamericefishpro.space.ph.j0;
import com.gamericefishpro.space.t0.m1;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements List, com.gamericefishpro.space.fi.c {
    public final u d;
    public final int e;
    public int i;
    public int v;

    public g0(u uVar, int i, int i2) {
        this.d = uVar;
        this.e = i;
        this.i = v.g(uVar);
        this.v = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.e + this.v;
        u uVar = this.d;
        uVar.add(i, obj);
        this.v++;
        this.i = v.g(uVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.v, collection);
    }

    public final void b() {
        if (v.g(this.d) != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.v > 0) {
            b();
            int i = this.v;
            int i2 = this.e;
            u uVar = this.d;
            uVar.f(i2, i + i2);
            this.v = 0;
            this.i = v.g(uVar);
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
        b();
        v.a(i, this.v);
        return this.d.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.v;
        int i2 = this.e;
        Iterator it = com.gamericefishpro.space.ji.f.f(i2, i + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            if (Intrinsics.a(obj, this.d.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.v == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.v;
        int i2 = this.e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.a(obj, this.d.get(i3))) {
                return i3 - i2;
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
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
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
        com.gamericefishpro.space.w0.b bVar;
        g gVarJ;
        boolean zB;
        b();
        u uVar = this.d;
        int i2 = this.e;
        int i3 = this.v + i2;
        int size = uVar.size();
        do {
            synchronized (v.a) {
                b0 b0Var = uVar.d;
                Intrinsics.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                b0 b0Var2 = (b0) p.h(b0Var);
                i = b0Var2.d;
                bVar = b0Var2.c;
                Unit unit = Unit.a;
            }
            Intrinsics.b(bVar);
            com.gamericefishpro.space.x0.e eVarBuilder = bVar.builder();
            eVarBuilder.subList(i2, i3).retainAll(collection);
            com.gamericefishpro.space.w0.b bVarD = eVarBuilder.d();
            if (Intrinsics.a(bVarD, bVar)) {
                break;
            }
            b0 b0Var3 = uVar.d;
            Intrinsics.c(b0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p.c) {
                gVarJ = p.j();
                zB = v.b((b0) p.w(b0Var3, uVar, gVarJ), i, bVarD, true);
            }
            p.n(gVarJ, uVar);
        } while (!zB);
        int size2 = size - uVar.size();
        if (size2 > 0) {
            this.i = v.g(this.d);
            this.v -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        v.a(i, this.v);
        b();
        int i2 = i + this.e;
        u uVar = this.d;
        Object obj2 = uVar.set(i2, obj);
        this.i = v.g(uVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.v;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.v)) {
            m1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.e;
        return new g0(this.d, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.gamericefishpro.space.ei.k.b(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        com.gamericefishpro.space.ei.y yVar = new com.gamericefishpro.space.ei.y();
        yVar.d = i - 1;
        return new f0(yVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return com.gamericefishpro.space.ei.k.c(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.e;
        u uVar = this.d;
        boolean zAddAll = uVar.addAll(i2, collection);
        if (zAddAll) {
            this.v = collection.size() + this.v;
            this.i = v.g(uVar);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.e + i;
        u uVar = this.d;
        Object objRemove = uVar.remove(i2);
        this.v--;
        this.i = v.g(uVar);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.e + i;
        u uVar = this.d;
        uVar.add(i2, obj);
        this.v++;
        this.i = v.g(uVar);
    }
}
