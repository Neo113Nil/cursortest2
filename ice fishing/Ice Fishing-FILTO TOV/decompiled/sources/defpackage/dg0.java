package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dg0 implements s40, Set, q40 {
    public final bg0 EljAMC1QTz;
    public final bg0 OOA6hdeuvCS;

    public dg0(bg0 bg0Var) {
        bg0Var.getClass();
        this.OOA6hdeuvCS = bg0Var;
        this.EljAMC1QTz = bg0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.EljAMC1QTz.GWasM1elztuh(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        bg0 bg0Var = this.EljAMC1QTz;
        bg0Var.getClass();
        int i = bg0Var.AvO7iQsrTN;
        for (Object obj : collection) {
            int xqGvceK5x = bg0Var.xqGvceK5x(obj);
            bg0Var.Yi7zF1RB1[xqGvceK5x] = obj;
            long[] jArr = bg0Var.X1lG3V04pd;
            int i2 = bg0Var.xqGvceK5x;
            jArr[xqGvceK5x] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((xqGvceK5x & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            bg0Var.xqGvceK5x = xqGvceK5x;
            if (bg0Var.OOA6hdeuvCS == Integer.MAX_VALUE) {
                bg0Var.OOA6hdeuvCS = xqGvceK5x;
            }
        }
        return i != bg0Var.AvO7iQsrTN;
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
        if (obj == null || dg0.class != obj.getClass()) {
            return false;
        }
        return o30.rQPn8YBR(this.OOA6hdeuvCS, ((dg0) obj).OOA6hdeuvCS);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.AvO7iQsrTN == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new cy(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.EljAMC1QTz.AvO7iQsrTN(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        bg0 bg0Var = this.EljAMC1QTz;
        bg0Var.getClass();
        int i3 = bg0Var.AvO7iQsrTN;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = bg0Var.EljAMC1QTz;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = bg0Var.GWasM1elztuh;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (o30.rQPn8YBR(bg0Var.Yi7zF1RB1[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                bg0Var.encWxUiV2(i2);
            }
        }
        return i3 != bg0Var.AvO7iQsrTN;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.EljAMC1QTz.mOu10nynGul(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.OOA6hdeuvCS.AvO7iQsrTN;
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
