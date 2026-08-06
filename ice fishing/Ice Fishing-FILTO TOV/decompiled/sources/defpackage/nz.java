package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nz implements List, q40 {
    public final ag0 OOA6hdeuvCS = new ag0(16);
    public final uf0 EljAMC1QTz = new uf0(16);
    public int AvO7iQsrTN = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long GWasM1elztuh() {
        long Yi7zF1RB1 = n30.Yi7zF1RB1(Float.POSITIVE_INFINITY, false, false);
        int i = this.AvO7iQsrTN + 1;
        int i2 = this.OOA6hdeuvCS.Yi7zF1RB1 - 1;
        if (i > i2) {
            return Yi7zF1RB1;
        }
        while (true) {
            uf0 uf0Var = this.EljAMC1QTz;
            if (i < 0) {
                uf0Var.getClass();
                break;
            }
            if (i >= uf0Var.Yi7zF1RB1) {
                break;
            }
            long j = uf0Var.GWasM1elztuh[i];
            if (n30.YmKjaVtbfp5Z(j, Yi7zF1RB1) < 0) {
                Yi7zF1RB1 = j;
            }
            if ((n30.pog2g9KITJA(Yi7zF1RB1) >= 0.0f || !n30.eUH21U3apd(Yi7zF1RB1)) && i != i2) {
                i++;
            }
        }
        o4.uFEq9NpZ("Index must be between 0 and size");
        return 0L;
    }

    public final void Yi7zF1RB1(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.OOA6hdeuvCS.E7jCp8Ls(i, i2);
        uf0 uf0Var = this.EljAMC1QTz;
        if (i >= 0) {
            int i3 = uf0Var.Yi7zF1RB1;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    o4.mE4lRynR("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = uf0Var.GWasM1elztuh;
                            d5.Uxq83abb04(jArr, jArr, i, i2, i3);
                        }
                        uf0Var.Yi7zF1RB1 -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            uf0Var.getClass();
        }
        o4.uFEq9NpZ("Index must be between 0 and size");
    }

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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.AvO7iQsrTN = -1;
        this.OOA6hdeuvCS.xqGvceK5x();
        this.EljAMC1QTz.Yi7zF1RB1 = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof he0) && indexOf((he0) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((he0) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object EljAMC1QTz = this.OOA6hdeuvCS.EljAMC1QTz(i);
        EljAMC1QTz.getClass();
        return (he0) EljAMC1QTz;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof he0)) {
            return -1;
        }
        he0 he0Var = (he0) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!o30.rQPn8YBR(this.OOA6hdeuvCS.EljAMC1QTz(i), he0Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.encWxUiV2();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lz(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof he0)) {
            return -1;
        }
        he0 he0Var = (he0) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS.EljAMC1QTz(size), he0Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new lz(this, 0, 7);
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
        return this.OOA6hdeuvCS.Yi7zF1RB1;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new mz(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fb1.Fm8W7vP7q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fb1.c4eaifQP(this, objArr);
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
        return new lz(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
