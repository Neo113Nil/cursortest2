package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class os0 extends AbstractList implements RandomAccess, h30 {
    public static final os0 encWxUiV2 = new os0(new Object[0], 0, false);
    public int AvO7iQsrTN;
    public Object[] EljAMC1QTz;
    public boolean OOA6hdeuvCS;

    public os0(Object[] objArr, int i, boolean z) {
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = objArr;
        this.AvO7iQsrTN = i;
    }

    public final void GWasM1elztuh(int i) {
        if (i < 0 || i >= this.AvO7iQsrTN) {
            StringBuilder rQPn8YBR = mr0.rQPn8YBR("Index:", i, ", Size:");
            rQPn8YBR.append(this.AvO7iQsrTN);
            throw new IndexOutOfBoundsException(rQPn8YBR.toString());
        }
    }

    public final os0 X1lG3V04pd(int i) {
        if (i >= this.AvO7iQsrTN) {
            return new os0(Arrays.copyOf(this.EljAMC1QTz, i), this.AvO7iQsrTN, true);
        }
        throw new IllegalArgumentException();
    }

    public final void Yi7zF1RB1() {
        if (!this.OOA6hdeuvCS) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        Yi7zF1RB1();
        if (i < 0 || i > (i2 = this.AvO7iQsrTN)) {
            StringBuilder rQPn8YBR = mr0.rQPn8YBR("Index:", i, ", Size:");
            rQPn8YBR.append(this.AvO7iQsrTN);
            throw new IndexOutOfBoundsException(rQPn8YBR.toString());
        }
        Object[] objArr = this.EljAMC1QTz;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.EljAMC1QTz, i, objArr2, i + 1, this.AvO7iQsrTN - i);
            this.EljAMC1QTz = objArr2;
        }
        this.EljAMC1QTz[i] = obj;
        this.AvO7iQsrTN++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Yi7zF1RB1();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Yi7zF1RB1();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        GWasM1elztuh(i);
        return this.EljAMC1QTz[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Yi7zF1RB1();
        GWasM1elztuh(i);
        Object[] objArr = this.EljAMC1QTz;
        Object obj = objArr[i];
        if (i < this.AvO7iQsrTN - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.AvO7iQsrTN--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Yi7zF1RB1();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Yi7zF1RB1();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Yi7zF1RB1();
        GWasM1elztuh(i);
        Object[] objArr = this.EljAMC1QTz;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.AvO7iQsrTN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Yi7zF1RB1();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        Yi7zF1RB1();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        Yi7zF1RB1();
        int i = this.AvO7iQsrTN;
        Object[] objArr = this.EljAMC1QTz;
        if (i == objArr.length) {
            this.EljAMC1QTz = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.EljAMC1QTz;
        int i2 = this.AvO7iQsrTN;
        this.AvO7iQsrTN = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
