package com.gamericefishpro.space.h2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements List, com.gamericefishpro.space.fi.a {
    public final com.gamericefishpro.space.t.d0 d = new com.gamericefishpro.space.t.d0(16);
    public final com.gamericefishpro.space.t.y e = new com.gamericefishpro.space.t.y(16);
    public int i = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jA = k.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.i + 1;
        int iE = com.gamericefishpro.space.ph.x.e(this);
        if (i > iE) {
            return jA;
        }
        while (true) {
            com.gamericefishpro.space.t.y yVar = this.e;
            if (i < 0) {
                yVar.getClass();
                break;
            }
            if (i >= yVar.b) {
                break;
            }
            long j = yVar.a[i];
            if (k.g(j, jA) < 0) {
                jA = j;
            }
            if ((k.i(jA) < 0.0f && k.n(jA)) || i == iE) {
                return jA;
            }
            i++;
        }
        com.gamericefishpro.space.u.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.d.l(i, i2);
        com.gamericefishpro.space.t.y yVar = this.e;
        if (i >= 0) {
            int i3 = yVar.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    com.gamericefishpro.space.u.a.c("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = yVar.a;
                        com.gamericefishpro.space.ph.u.e(jArr, jArr, i, i2, i3);
                    }
                    yVar.b -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            yVar.getClass();
        }
        com.gamericefishpro.space.u.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.i = -1;
        this.d.d();
        this.e.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof com.gamericefishpro.space.h1.l) && indexOf((com.gamericefishpro.space.h1.l) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((com.gamericefishpro.space.h1.l) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objF = this.d.f(i);
        Intrinsics.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (com.gamericefishpro.space.h1.l) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof com.gamericefishpro.space.h1.l)) {
            return -1;
        }
        com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) obj;
        int iE = com.gamericefishpro.space.ph.x.e(this);
        if (iE >= 0) {
            int i = 0;
            while (!Intrinsics.a(this.d.f(i), lVar)) {
                if (i != iE) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new com.gamericefishpro.space.f1.a0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof com.gamericefishpro.space.h1.l)) {
            return -1;
        }
        com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) obj;
        for (int iE = com.gamericefishpro.space.ph.x.e(this); -1 < iE; iE--) {
            if (Intrinsics.a(this.d.f(iE), lVar)) {
                return iE;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new com.gamericefishpro.space.f1.a0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new n(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return com.gamericefishpro.space.ei.k.b(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new com.gamericefishpro.space.f1.a0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return com.gamericefishpro.space.ei.k.c(this, objArr);
    }
}
