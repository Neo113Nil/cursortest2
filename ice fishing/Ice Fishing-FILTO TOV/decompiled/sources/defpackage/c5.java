package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c5 implements Collection, Set, q40, s40 {
    public int AvO7iQsrTN;
    public int[] OOA6hdeuvCS = fb1.Yi7zF1RB1;
    public Object[] EljAMC1QTz = fb1.xqGvceK5x;

    public final Object GWasM1elztuh(int i) {
        int i2 = this.AvO7iQsrTN;
        Object[] objArr = this.EljAMC1QTz;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.OOA6hdeuvCS;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                d5.MjxSquD6Av(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.EljAMC1QTz;
                d5.Fm8W7vP7q(objArr2, objArr2, i, i4, i2);
            }
            this.EljAMC1QTz[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.OOA6hdeuvCS = iArr2;
            this.EljAMC1QTz = new Object[i5];
            if (i > 0) {
                d5.c4eaifQP(iArr, iArr2, 0, i, 6);
                d5.mqNvfisv7(objArr, this.EljAMC1QTz, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                d5.MjxSquD6Av(iArr, this.OOA6hdeuvCS, i, i6, i2);
                d5.Fm8W7vP7q(objArr, this.EljAMC1QTz, i, i6, i2);
            }
        }
        if (i2 != this.AvO7iQsrTN) {
            throw new ConcurrentModificationException();
        }
        this.AvO7iQsrTN = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int AEn1Rrio;
        int i2 = this.AvO7iQsrTN;
        if (obj == null) {
            AEn1Rrio = n30.AEn1Rrio(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            AEn1Rrio = n30.AEn1Rrio(this, obj, hashCode);
        }
        if (AEn1Rrio >= 0) {
            return false;
        }
        int i3 = ~AEn1Rrio;
        int[] iArr = this.OOA6hdeuvCS;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.EljAMC1QTz;
            int[] iArr2 = new int[i4];
            this.OOA6hdeuvCS = iArr2;
            this.EljAMC1QTz = new Object[i4];
            if (i2 != this.AvO7iQsrTN) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                d5.c4eaifQP(iArr, iArr2, 0, iArr.length, 6);
                d5.mqNvfisv7(objArr, this.EljAMC1QTz, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.OOA6hdeuvCS;
            int i5 = i3 + 1;
            d5.MjxSquD6Av(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.EljAMC1QTz;
            d5.Fm8W7vP7q(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.AvO7iQsrTN;
        if (i2 == i6) {
            int[] iArr4 = this.OOA6hdeuvCS;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.EljAMC1QTz[i3] = obj;
                this.AvO7iQsrTN = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.AvO7iQsrTN;
        int i = this.AvO7iQsrTN;
        int[] iArr = this.OOA6hdeuvCS;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.EljAMC1QTz;
            int[] iArr2 = new int[size];
            this.OOA6hdeuvCS = iArr2;
            this.EljAMC1QTz = new Object[size];
            if (i > 0) {
                d5.c4eaifQP(iArr, iArr2, 0, i, 6);
                d5.mqNvfisv7(objArr, this.EljAMC1QTz, 0, this.AvO7iQsrTN, 6);
            }
        }
        if (this.AvO7iQsrTN != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.AvO7iQsrTN != 0) {
            this.OOA6hdeuvCS = fb1.Yi7zF1RB1;
            this.EljAMC1QTz = fb1.xqGvceK5x;
            this.AvO7iQsrTN = 0;
        }
        if (this.AvO7iQsrTN != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? n30.AEn1Rrio(this, null, 0) : n30.AEn1Rrio(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.AvO7iQsrTN != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.AvO7iQsrTN;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.EljAMC1QTz[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.OOA6hdeuvCS;
        int i = this.AvO7iQsrTN;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.AvO7iQsrTN <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new x4(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int AEn1Rrio = obj == null ? n30.AEn1Rrio(this, null, 0) : n30.AEn1Rrio(this, obj, obj.hashCode());
        if (AEn1Rrio < 0) {
            return false;
        }
        GWasM1elztuh(AEn1Rrio);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.AvO7iQsrTN - 1; -1 < i; i--) {
            if (!rb.JB4pnjMK(collection, this.EljAMC1QTz[i])) {
                GWasM1elztuh(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.AvO7iQsrTN;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.AvO7iQsrTN;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        d5.Fm8W7vP7q(this.EljAMC1QTz, objArr, 0, 0, this.AvO7iQsrTN);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.AvO7iQsrTN * 14);
        sb.append('{');
        int i = this.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.EljAMC1QTz[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return d5.ZCWXqiC0(this.EljAMC1QTz, 0, this.AvO7iQsrTN);
    }
}
