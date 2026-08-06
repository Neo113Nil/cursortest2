package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y4 implements Set {
    public final /* synthetic */ b5 OOA6hdeuvCS;

    public y4(b5 b5Var) {
        this.OOA6hdeuvCS = b5Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.OOA6hdeuvCS.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OOA6hdeuvCS.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.OOA6hdeuvCS.mOu10nynGul(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        b5 b5Var = this.OOA6hdeuvCS;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (b5Var.AvO7iQsrTN == set.size()) {
                return b5Var.mOu10nynGul(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = 0;
        for (int i2 = b5Var.AvO7iQsrTN - 1; i2 >= 0; i2--) {
            Object OOA6hdeuvCS = b5Var.OOA6hdeuvCS(i2);
            i += OOA6hdeuvCS == null ? 0 : OOA6hdeuvCS.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new x4(this.OOA6hdeuvCS, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        b5 b5Var = this.OOA6hdeuvCS;
        int X1lG3V04pd = b5Var.X1lG3V04pd(obj);
        if (X1lG3V04pd < 0) {
            return false;
        }
        b5Var.EljAMC1QTz(X1lG3V04pd);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.OOA6hdeuvCS.JFJ3QoxA(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(b5Var.OOA6hdeuvCS(i2))) {
                b5Var.EljAMC1QTz(i2);
            }
        }
        return i != b5Var.AvO7iQsrTN;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.OOA6hdeuvCS.AvO7iQsrTN;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = b5Var.OOA6hdeuvCS(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        b5 b5Var = this.OOA6hdeuvCS;
        int i = b5Var.AvO7iQsrTN;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = b5Var.OOA6hdeuvCS(i2);
        }
        return objArr;
    }
}
