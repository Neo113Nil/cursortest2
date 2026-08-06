package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class v20 implements Iterable, q40 {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final int OOA6hdeuvCS;

    public v20(int i, int i2, int i3) {
        if (i3 == 0) {
            o4.mE4lRynR("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            o4.mE4lRynR("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.OOA6hdeuvCS = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                o4.mE4lRynR("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v20)) {
            return false;
        }
        if (isEmpty() && ((v20) obj).isEmpty()) {
            return true;
        }
        v20 v20Var = (v20) obj;
        return this.OOA6hdeuvCS == v20Var.OOA6hdeuvCS && this.EljAMC1QTz == v20Var.EljAMC1QTz && this.AvO7iQsrTN == v20Var.AvO7iQsrTN;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.OOA6hdeuvCS * 31) + this.EljAMC1QTz) * 31) + this.AvO7iQsrTN;
    }

    public boolean isEmpty() {
        int i = this.EljAMC1QTz;
        int i2 = this.AvO7iQsrTN;
        int i3 = this.OOA6hdeuvCS;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w20(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.EljAMC1QTz;
        int i2 = this.AvO7iQsrTN;
        int i3 = this.OOA6hdeuvCS;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
