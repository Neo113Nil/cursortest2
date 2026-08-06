package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kg0 implements s40, Set, q40 {
    public final ig0 EljAMC1QTz;
    public final ig0 OOA6hdeuvCS;

    public kg0(ig0 ig0Var) {
        this.OOA6hdeuvCS = ig0Var;
        this.EljAMC1QTz = ig0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.EljAMC1QTz.GWasM1elztuh(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        ig0 ig0Var = this.EljAMC1QTz;
        int i = ig0Var.xqGvceK5x;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ig0Var.rQPn8YBR(it.next());
        }
        return i != ig0Var.xqGvceK5x;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.EljAMC1QTz.Yi7zF1RB1();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OOA6hdeuvCS.X1lG3V04pd(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.OOA6hdeuvCS.X1lG3V04pd(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kg0.class != obj.getClass()) {
            return false;
        }
        return this.OOA6hdeuvCS.equals(((kg0) obj).OOA6hdeuvCS);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.AvO7iQsrTN();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new cy(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.EljAMC1QTz.E7jCp8Ls(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        ig0 ig0Var = this.EljAMC1QTz;
        int i = ig0Var.xqGvceK5x;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ig0Var.mOu10nynGul(it.next());
        }
        return i != ig0Var.xqGvceK5x;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        ig0 ig0Var = this.EljAMC1QTz;
        Object[] objArr = ig0Var.Yi7zF1RB1;
        int i = ig0Var.xqGvceK5x;
        long[] jArr = ig0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!rb.JB4pnjMK(collection, objArr[i5])) {
                                ig0Var.XnEVoBF0td1l(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != ig0Var.xqGvceK5x;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.OOA6hdeuvCS.xqGvceK5x;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return fb1.c4eaifQP(this, objArr);
    }

    public final String toString() {
        return this.OOA6hdeuvCS.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return fb1.Fm8W7vP7q(this);
    }
}
