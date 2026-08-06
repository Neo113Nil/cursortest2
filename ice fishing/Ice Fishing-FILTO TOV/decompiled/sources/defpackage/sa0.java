package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sa0 extends pog2g9KITJA implements RandomAccess, Serializable {
    public int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public Object[] OOA6hdeuvCS;
    public final sa0 encWxUiV2;
    public final ta0 mOu10nynGul;

    public sa0(Object[] objArr, int i, int i2, sa0 sa0Var, ta0 ta0Var) {
        int i3;
        objArr.getClass();
        ta0Var.getClass();
        this.OOA6hdeuvCS = objArr;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
        this.encWxUiV2 = sa0Var;
        this.mOu10nynGul = ta0Var;
        i3 = ((AbstractList) ta0Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    public final void AvO7iQsrTN() {
        int i;
        i = ((AbstractList) this.mOu10nynGul).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void EljAMC1QTz(int i, Object obj) {
        ((AbstractList) this).modCount++;
        ta0 ta0Var = this.mOu10nynGul;
        sa0 sa0Var = this.encWxUiV2;
        if (sa0Var != null) {
            sa0Var.EljAMC1QTz(i, obj);
        } else {
            ta0 ta0Var2 = ta0.encWxUiV2;
            ta0Var.EljAMC1QTz(i, obj);
        }
        this.OOA6hdeuvCS = ta0Var.OOA6hdeuvCS;
        this.AvO7iQsrTN++;
    }

    @Override // defpackage.pog2g9KITJA
    public final int GWasM1elztuh() {
        AvO7iQsrTN();
        return this.AvO7iQsrTN;
    }

    public final void JFJ3QoxA(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        sa0 sa0Var = this.encWxUiV2;
        if (sa0Var != null) {
            sa0Var.JFJ3QoxA(i, i2);
        } else {
            ta0 ta0Var = ta0.encWxUiV2;
            this.mOu10nynGul.JFJ3QoxA(i, i2);
        }
        this.AvO7iQsrTN -= i2;
    }

    public final void OOA6hdeuvCS(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        ta0 ta0Var = this.mOu10nynGul;
        sa0 sa0Var = this.encWxUiV2;
        if (sa0Var != null) {
            sa0Var.OOA6hdeuvCS(i, collection, i2);
        } else {
            ta0 ta0Var2 = ta0.encWxUiV2;
            ta0Var.OOA6hdeuvCS(i, collection, i2);
        }
        this.OOA6hdeuvCS = ta0Var.OOA6hdeuvCS;
        this.AvO7iQsrTN += i2;
    }

    @Override // defpackage.pog2g9KITJA
    public final Object Yi7zF1RB1(int i) {
        encWxUiV2();
        AvO7iQsrTN();
        int i2 = this.AvO7iQsrTN;
        if (i >= 0 && i < i2) {
            return mOu10nynGul(this.EljAMC1QTz + i);
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        encWxUiV2();
        AvO7iQsrTN();
        int i2 = this.AvO7iQsrTN;
        if (i < 0 || i > i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        } else {
            EljAMC1QTz(this.EljAMC1QTz + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        encWxUiV2();
        AvO7iQsrTN();
        int i2 = this.AvO7iQsrTN;
        if (i < 0 || i > i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        OOA6hdeuvCS(this.EljAMC1QTz + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        encWxUiV2();
        AvO7iQsrTN();
        JFJ3QoxA(this.EljAMC1QTz, this.AvO7iQsrTN);
    }

    public final void encWxUiV2() {
        if (this.mOu10nynGul.AvO7iQsrTN) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        AvO7iQsrTN();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.OOA6hdeuvCS;
            int i = this.AvO7iQsrTN;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (o30.rQPn8YBR(objArr[this.EljAMC1QTz + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AvO7iQsrTN();
        int i2 = this.AvO7iQsrTN;
        if (i >= 0 && i < i2) {
            return this.OOA6hdeuvCS[this.EljAMC1QTz + i];
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        AvO7iQsrTN();
        Object[] objArr = this.OOA6hdeuvCS;
        int i = this.AvO7iQsrTN;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.EljAMC1QTz + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        AvO7iQsrTN();
        for (int i = 0; i < this.AvO7iQsrTN; i++) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS[this.EljAMC1QTz + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        AvO7iQsrTN();
        return this.AvO7iQsrTN == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        AvO7iQsrTN();
        for (int i = this.AvO7iQsrTN - 1; i >= 0; i--) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS[this.EljAMC1QTz + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AvO7iQsrTN();
        int i2 = this.AvO7iQsrTN;
        if (i >= 0 && i <= i2) {
            return new lz(this, i);
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object mOu10nynGul(int i) {
        Object mOu10nynGul;
        ((AbstractList) this).modCount++;
        sa0 sa0Var = this.encWxUiV2;
        if (sa0Var != null) {
            mOu10nynGul = sa0Var.mOu10nynGul(i);
        } else {
            ta0 ta0Var = ta0.encWxUiV2;
            mOu10nynGul = this.mOu10nynGul.mOu10nynGul(i);
        }
        this.AvO7iQsrTN--;
        return mOu10nynGul;
    }

    public final int rQPn8YBR(int i, int i2, Collection collection, boolean z) {
        int rQPn8YBR;
        sa0 sa0Var = this.encWxUiV2;
        if (sa0Var != null) {
            rQPn8YBR = sa0Var.rQPn8YBR(i, i2, collection, z);
        } else {
            ta0 ta0Var = ta0.encWxUiV2;
            rQPn8YBR = this.mOu10nynGul.rQPn8YBR(i, i2, collection, z);
        }
        if (rQPn8YBR > 0) {
            ((AbstractList) this).modCount++;
        }
        this.AvO7iQsrTN -= rQPn8YBR;
        return rQPn8YBR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        encWxUiV2();
        AvO7iQsrTN();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            Yi7zF1RB1(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        encWxUiV2();
        AvO7iQsrTN();
        return rQPn8YBR(this.EljAMC1QTz, this.AvO7iQsrTN, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        encWxUiV2();
        AvO7iQsrTN();
        return rQPn8YBR(this.EljAMC1QTz, this.AvO7iQsrTN, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        encWxUiV2();
        AvO7iQsrTN();
        int i2 = this.AvO7iQsrTN;
        if (i < 0 || i >= i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.OOA6hdeuvCS;
        int i3 = this.EljAMC1QTz;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        qj.rQPn8YBR(i, i2, this.AvO7iQsrTN);
        return new sa0(this.OOA6hdeuvCS, this.EljAMC1QTz + i, i2 - i, this, this.mOu10nynGul);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        AvO7iQsrTN();
        int length = objArr.length;
        int i = this.AvO7iQsrTN;
        Object[] objArr2 = this.OOA6hdeuvCS;
        int i2 = this.EljAMC1QTz;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        d5.Fm8W7vP7q(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.AvO7iQsrTN;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        AvO7iQsrTN();
        return o50.Yi7zF1RB1(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        encWxUiV2();
        AvO7iQsrTN();
        EljAMC1QTz(this.EljAMC1QTz + this.AvO7iQsrTN, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        AvO7iQsrTN();
        Object[] objArr = this.OOA6hdeuvCS;
        int i = this.AvO7iQsrTN;
        int i2 = this.EljAMC1QTz;
        return d5.ZCWXqiC0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        encWxUiV2();
        AvO7iQsrTN();
        int size = collection.size();
        OOA6hdeuvCS(this.EljAMC1QTz + this.AvO7iQsrTN, collection, size);
        return size > 0;
    }
}
