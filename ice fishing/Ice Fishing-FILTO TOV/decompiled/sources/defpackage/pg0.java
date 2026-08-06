package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pg0 implements List, q40 {
    public int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final List OOA6hdeuvCS;

    public pg0(List list, int i, int i2) {
        this.OOA6hdeuvCS = list;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.OOA6hdeuvCS.add(i + this.EljAMC1QTz, obj);
        this.AvO7iQsrTN++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.OOA6hdeuvCS.addAll(i + this.EljAMC1QTz, collection);
        int size = collection.size();
        this.AvO7iQsrTN += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.AvO7iQsrTN - 1;
        int i2 = this.EljAMC1QTz;
        if (i2 <= i) {
            while (true) {
                this.OOA6hdeuvCS.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.AvO7iQsrTN = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.AvO7iQsrTN;
        for (int i2 = this.EljAMC1QTz; i2 < i; i2++) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sg0.GWasM1elztuh(i, this);
        return this.OOA6hdeuvCS.get(i + this.EljAMC1QTz);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.AvO7iQsrTN;
        int i2 = this.EljAMC1QTz;
        for (int i3 = i2; i3 < i; i3++) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.AvO7iQsrTN == this.EljAMC1QTz;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qg0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.AvO7iQsrTN - 1;
        int i2 = this.EljAMC1QTz;
        if (i2 > i) {
            return -1;
        }
        while (!o30.rQPn8YBR(this.OOA6hdeuvCS.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new qg0(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.AvO7iQsrTN;
        for (int i2 = this.EljAMC1QTz; i2 < i; i2++) {
            List list = this.OOA6hdeuvCS;
            if (o30.rQPn8YBR(list.get(i2), obj)) {
                list.remove(i2);
                this.AvO7iQsrTN--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.AvO7iQsrTN;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.AvO7iQsrTN;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.AvO7iQsrTN;
        int i2 = i - 1;
        int i3 = this.EljAMC1QTz;
        if (i3 <= i2) {
            while (true) {
                List list = this.OOA6hdeuvCS;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.AvO7iQsrTN--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.AvO7iQsrTN;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        sg0.GWasM1elztuh(i, this);
        return this.OOA6hdeuvCS.set(i + this.EljAMC1QTz, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.AvO7iQsrTN - this.EljAMC1QTz;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        sg0.Yi7zF1RB1(this, i, i2);
        return new pg0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return fb1.Fm8W7vP7q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fb1.c4eaifQP(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new qg0(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.AvO7iQsrTN;
        this.AvO7iQsrTN = i + 1;
        this.OOA6hdeuvCS.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.OOA6hdeuvCS.addAll(this.AvO7iQsrTN, collection);
        int size = collection.size();
        this.AvO7iQsrTN += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        sg0.GWasM1elztuh(i, this);
        this.AvO7iQsrTN--;
        return this.OOA6hdeuvCS.remove(i + this.EljAMC1QTz);
    }
}
