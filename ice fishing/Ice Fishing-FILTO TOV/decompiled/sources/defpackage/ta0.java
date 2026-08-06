package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ta0 extends pog2g9KITJA implements RandomAccess, Serializable {
    public static final ta0 encWxUiV2;
    public boolean AvO7iQsrTN;
    public int EljAMC1QTz;
    public Object[] OOA6hdeuvCS;

    static {
        ta0 ta0Var = new ta0(0);
        ta0Var.AvO7iQsrTN = true;
        encWxUiV2 = ta0Var;
    }

    public ta0(int i) {
        if (i >= 0) {
            this.OOA6hdeuvCS = new Object[i];
        } else {
            o4.mE4lRynR("capacity must be non-negative.");
            throw null;
        }
    }

    public final void AvO7iQsrTN() {
        if (this.AvO7iQsrTN) {
            throw new UnsupportedOperationException();
        }
    }

    public final void EljAMC1QTz(int i, Object obj) {
        ((AbstractList) this).modCount++;
        encWxUiV2(i, 1);
        this.OOA6hdeuvCS[i] = obj;
    }

    @Override // defpackage.pog2g9KITJA
    public final int GWasM1elztuh() {
        return this.EljAMC1QTz;
    }

    public final void JFJ3QoxA(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.OOA6hdeuvCS;
        d5.Fm8W7vP7q(objArr, objArr, i, i + i2, this.EljAMC1QTz);
        Object[] objArr2 = this.OOA6hdeuvCS;
        int i3 = this.EljAMC1QTz;
        o50.ozMwhSAI(objArr2, i3 - i2, i3);
        this.EljAMC1QTz -= i2;
    }

    public final void OOA6hdeuvCS(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        encWxUiV2(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.OOA6hdeuvCS[i + i3] = it.next();
        }
    }

    @Override // defpackage.pog2g9KITJA
    public final Object Yi7zF1RB1(int i) {
        AvO7iQsrTN();
        int i2 = this.EljAMC1QTz;
        if (i >= 0 && i < i2) {
            return mOu10nynGul(i);
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AvO7iQsrTN();
        int i2 = this.EljAMC1QTz;
        if (i < 0 || i > i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return;
        }
        ((AbstractList) this).modCount++;
        encWxUiV2(i, 1);
        this.OOA6hdeuvCS[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        AvO7iQsrTN();
        int i2 = this.EljAMC1QTz;
        if (i < 0 || i > i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        OOA6hdeuvCS(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        AvO7iQsrTN();
        JFJ3QoxA(0, this.EljAMC1QTz);
    }

    public final void encWxUiV2(int i, int i2) {
        int i3 = this.EljAMC1QTz + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.OOA6hdeuvCS;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.OOA6hdeuvCS = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.OOA6hdeuvCS;
        d5.Fm8W7vP7q(objArr2, objArr2, i + i2, i, this.EljAMC1QTz);
        this.EljAMC1QTz += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.OOA6hdeuvCS;
            int i = this.EljAMC1QTz;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (o30.rQPn8YBR(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.EljAMC1QTz;
        if (i >= 0 && i < i2) {
            return this.OOA6hdeuvCS[i];
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.OOA6hdeuvCS;
        int i = this.EljAMC1QTz;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.EljAMC1QTz; i++) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.EljAMC1QTz == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.EljAMC1QTz - 1; i >= 0; i--) {
            if (o30.rQPn8YBR(this.OOA6hdeuvCS[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.EljAMC1QTz;
        if (i >= 0 && i <= i2) {
            return new lz(this, i);
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object mOu10nynGul(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.OOA6hdeuvCS;
        Object obj = objArr[i];
        d5.Fm8W7vP7q(objArr, objArr, i, i + 1, this.EljAMC1QTz);
        Object[] objArr2 = this.OOA6hdeuvCS;
        int i2 = this.EljAMC1QTz - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.EljAMC1QTz--;
        return obj;
    }

    public final int rQPn8YBR(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.OOA6hdeuvCS;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.OOA6hdeuvCS;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        d5.Fm8W7vP7q(objArr, objArr, i + i4, i2 + i, this.EljAMC1QTz);
        Object[] objArr3 = this.OOA6hdeuvCS;
        int i7 = this.EljAMC1QTz;
        o50.ozMwhSAI(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.EljAMC1QTz -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        AvO7iQsrTN();
        return rQPn8YBR(0, this.EljAMC1QTz, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        AvO7iQsrTN();
        return rQPn8YBR(0, this.EljAMC1QTz, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AvO7iQsrTN();
        int i2 = this.EljAMC1QTz;
        if (i < 0 || i >= i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.OOA6hdeuvCS;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        qj.rQPn8YBR(i, i2, this.EljAMC1QTz);
        return new sa0(this.OOA6hdeuvCS, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.EljAMC1QTz;
        Object[] objArr2 = this.OOA6hdeuvCS;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        d5.Fm8W7vP7q(objArr2, objArr, 0, 0, i);
        int i2 = this.EljAMC1QTz;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o50.Yi7zF1RB1(this.OOA6hdeuvCS, 0, this.EljAMC1QTz, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        AvO7iQsrTN();
        int i = this.EljAMC1QTz;
        ((AbstractList) this).modCount++;
        encWxUiV2(i, 1);
        this.OOA6hdeuvCS[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return d5.ZCWXqiC0(this.OOA6hdeuvCS, 0, this.EljAMC1QTz);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        AvO7iQsrTN();
        int size = collection.size();
        OOA6hdeuvCS(this.EljAMC1QTz, collection, size);
        return size > 0;
    }
}
