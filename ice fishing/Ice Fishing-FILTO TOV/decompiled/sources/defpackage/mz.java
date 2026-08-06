package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mz implements List, q40 {
    public final /* synthetic */ nz AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final int OOA6hdeuvCS;

    public mz(nz nzVar, int i, int i2) {
        this.AvO7iQsrTN = nzVar;
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = i2;
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        Object EljAMC1QTz = this.AvO7iQsrTN.OOA6hdeuvCS.EljAMC1QTz(i + this.OOA6hdeuvCS);
        EljAMC1QTz.getClass();
        return (he0) EljAMC1QTz;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof he0)) {
            return -1;
        }
        he0 he0Var = (he0) obj;
        int i = this.OOA6hdeuvCS;
        int i2 = this.EljAMC1QTz;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!o30.rQPn8YBR(this.AvO7iQsrTN.OOA6hdeuvCS.EljAMC1QTz(i3), he0Var)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.OOA6hdeuvCS;
        return new lz(this.AvO7iQsrTN, i, i, this.EljAMC1QTz);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof he0)) {
            return -1;
        }
        he0 he0Var = (he0) obj;
        int i = this.EljAMC1QTz;
        int i2 = this.OOA6hdeuvCS;
        if (i2 > i) {
            return -1;
        }
        while (!o30.rQPn8YBR(this.AvO7iQsrTN.OOA6hdeuvCS.EljAMC1QTz(i), he0Var)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.OOA6hdeuvCS;
        int i3 = this.EljAMC1QTz;
        return new lz(this.AvO7iQsrTN, i + i2, i2, i3);
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
        return this.EljAMC1QTz - this.OOA6hdeuvCS;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.OOA6hdeuvCS;
        return new mz(this.AvO7iQsrTN, i + i3, i3 + i2);
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.OOA6hdeuvCS;
        return new lz(this.AvO7iQsrTN, i, i, this.EljAMC1QTz);
    }
}
