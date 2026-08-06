package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a5 implements Collection {
    public final /* synthetic */ b5 OOA6hdeuvCS;

    public a5(b5 b5Var) {
        this.OOA6hdeuvCS = b5Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.OOA6hdeuvCS.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.OOA6hdeuvCS.GWasM1elztuh(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new x4(this.OOA6hdeuvCS, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        b5 b5Var = this.OOA6hdeuvCS;
        int GWasM1elztuh = b5Var.GWasM1elztuh(obj);
        if (GWasM1elztuh < 0) {
            return false;
        }
        b5Var.EljAMC1QTz(GWasM1elztuh);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(b5Var.encWxUiV2(i2))) {
                b5Var.EljAMC1QTz(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(b5Var.encWxUiV2(i2))) {
                b5Var.EljAMC1QTz(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.OOA6hdeuvCS.AvO7iQsrTN;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = b5Var.encWxUiV2(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = b5Var.encWxUiV2(i2);
        }
        return objArr;
    }
}
