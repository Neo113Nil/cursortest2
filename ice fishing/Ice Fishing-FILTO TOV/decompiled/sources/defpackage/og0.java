package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class og0 implements List, q40 {
    public final rg0 OOA6hdeuvCS;

    public og0(rg0 rg0Var) {
        this.OOA6hdeuvCS = rg0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.OOA6hdeuvCS.Yi7zF1RB1(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        rg0 rg0Var = this.OOA6hdeuvCS;
        return rg0Var.OOA6hdeuvCS(rg0Var.AvO7iQsrTN, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.OOA6hdeuvCS.AvO7iQsrTN();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OOA6hdeuvCS.encWxUiV2(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.OOA6hdeuvCS.encWxUiV2(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sg0.GWasM1elztuh(i, this);
        return this.OOA6hdeuvCS.OOA6hdeuvCS[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.OOA6hdeuvCS.mOu10nynGul(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.AvO7iQsrTN == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qg0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        rg0 rg0Var = this.OOA6hdeuvCS;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        for (int i = rg0Var.AvO7iQsrTN - 1; i >= 0; i--) {
            if (o30.rQPn8YBR(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new qg0(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        sg0.GWasM1elztuh(i, this);
        return this.OOA6hdeuvCS.rQPn8YBR(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        rg0 rg0Var = this.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rg0Var.JFJ3QoxA(it.next());
        }
        return i != rg0Var.AvO7iQsrTN;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        rg0 rg0Var = this.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(rg0Var.OOA6hdeuvCS[i2])) {
                rg0Var.rQPn8YBR(i2);
            }
        }
        return i != rg0Var.AvO7iQsrTN;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        sg0.GWasM1elztuh(i, this);
        Object[] objArr = this.OOA6hdeuvCS.OOA6hdeuvCS;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.OOA6hdeuvCS.AvO7iQsrTN;
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
    public final void add(int i, Object obj) {
        this.OOA6hdeuvCS.GWasM1elztuh(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new qg0(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.OOA6hdeuvCS.OOA6hdeuvCS(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.OOA6hdeuvCS.JFJ3QoxA(obj);
    }
}
