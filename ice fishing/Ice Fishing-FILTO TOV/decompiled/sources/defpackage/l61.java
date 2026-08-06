package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l61 implements List, q40 {
    public int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final p41 OOA6hdeuvCS;
    public int encWxUiV2;

    public l61(p41 p41Var, int i, int i2) {
        this.OOA6hdeuvCS = p41Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
        this.encWxUiV2 = i2 - i;
    }

    public final void GWasM1elztuh() {
        if (qj.EXrPz3p7hFb(this.OOA6hdeuvCS) != this.AvO7iQsrTN) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        GWasM1elztuh();
        int i = this.EljAMC1QTz + this.encWxUiV2;
        p41 p41Var = this.OOA6hdeuvCS;
        p41Var.add(i, obj);
        this.encWxUiV2++;
        this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        GWasM1elztuh();
        int i2 = i + this.EljAMC1QTz;
        p41 p41Var = this.OOA6hdeuvCS;
        boolean addAll = p41Var.addAll(i2, collection);
        if (addAll) {
            this.encWxUiV2 = collection.size() + this.encWxUiV2;
            this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.encWxUiV2 > 0) {
            GWasM1elztuh();
            int i = this.encWxUiV2;
            int i2 = this.EljAMC1QTz;
            p41 p41Var = this.OOA6hdeuvCS;
            p41Var.OOA6hdeuvCS(i2, i + i2);
            this.encWxUiV2 = 0;
            this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
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
        GWasM1elztuh();
        qj.EljAMC1QTz(i, this.encWxUiV2);
        return this.OOA6hdeuvCS.get(this.EljAMC1QTz + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        GWasM1elztuh();
        int i = this.encWxUiV2;
        int i2 = this.EljAMC1QTz;
        Iterator it = o50.MZhzXH72(i2, i + i2).iterator();
        while (((w20) it).AvO7iQsrTN) {
            int nextInt = ((q20) it).nextInt();
            if (o30.rQPn8YBR(obj, this.OOA6hdeuvCS.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.encWxUiV2 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        GWasM1elztuh();
        int i = this.encWxUiV2;
        int i2 = this.EljAMC1QTz;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (o30.rQPn8YBR(obj, this.OOA6hdeuvCS.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        GWasM1elztuh();
        pt0 pt0Var = new pt0();
        pt0Var.OOA6hdeuvCS = i - 1;
        return new zu0(pt0Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        GWasM1elztuh();
        int i2 = this.EljAMC1QTz + i;
        p41 p41Var = this.OOA6hdeuvCS;
        Object remove = p41Var.remove(i2);
        this.encWxUiV2--;
        this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
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
        EXrPz3p7hFb eXrPz3p7hFb;
        y31 JFJ3QoxA;
        boolean JFJ3QoxA2;
        GWasM1elztuh();
        p41 p41Var = this.OOA6hdeuvCS;
        int i2 = this.EljAMC1QTz;
        int i3 = this.encWxUiV2 + i2;
        int size = p41Var.size();
        do {
            synchronized (qj.YmKjaVtbfp5Z) {
                r51 r51Var = p41Var.OOA6hdeuvCS;
                r51Var.getClass();
                r51 r51Var2 = (r51) e41.encWxUiV2(r51Var);
                i = r51Var2.xqGvceK5x;
                eXrPz3p7hFb = r51Var2.X1lG3V04pd;
            }
            eXrPz3p7hFb.getClass();
            op0 EljAMC1QTz = eXrPz3p7hFb.EljAMC1QTz();
            EljAMC1QTz.subList(i2, i3).retainAll(collection);
            EXrPz3p7hFb X1lG3V04pd = EljAMC1QTz.X1lG3V04pd();
            if (o30.rQPn8YBR(X1lG3V04pd, eXrPz3p7hFb)) {
                break;
            }
            r51 r51Var3 = p41Var.OOA6hdeuvCS;
            r51Var3.getClass();
            synchronized (e41.X1lG3V04pd) {
                JFJ3QoxA = e41.JFJ3QoxA();
                JFJ3QoxA2 = qj.JFJ3QoxA((r51) e41.lv06NcmrQ(r51Var3, p41Var, JFJ3QoxA), i, X1lG3V04pd, true);
            }
            e41.uFEq9NpZ(JFJ3QoxA, p41Var);
        } while (!JFJ3QoxA2);
        int size2 = size - p41Var.size();
        if (size2 > 0) {
            this.AvO7iQsrTN = qj.EXrPz3p7hFb(this.OOA6hdeuvCS);
            this.encWxUiV2 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        qj.EljAMC1QTz(i, this.encWxUiV2);
        GWasM1elztuh();
        int i2 = i + this.EljAMC1QTz;
        p41 p41Var = this.OOA6hdeuvCS;
        Object obj2 = p41Var.set(i2, obj);
        this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.encWxUiV2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.encWxUiV2) {
            tq0.GWasM1elztuh("fromIndex or toIndex are out of bounds");
        }
        GWasM1elztuh();
        int i3 = this.EljAMC1QTz;
        return new l61(this.OOA6hdeuvCS, i + i3, i2 + i3);
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
        GWasM1elztuh();
        int i2 = this.EljAMC1QTz + i;
        p41 p41Var = this.OOA6hdeuvCS;
        p41Var.add(i2, obj);
        this.encWxUiV2++;
        this.AvO7iQsrTN = qj.EXrPz3p7hFb(p41Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.encWxUiV2, collection);
    }
}
