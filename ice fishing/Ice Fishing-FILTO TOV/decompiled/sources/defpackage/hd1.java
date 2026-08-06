package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hd1 implements Comparable, Serializable {
    public static final hd1 AvO7iQsrTN = new hd1(0, 0);
    public final long EljAMC1QTz;
    public final long OOA6hdeuvCS;

    public hd1(long j, long j2) {
        this.OOA6hdeuvCS = j;
        this.EljAMC1QTz = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        hd1 hd1Var = (hd1) obj;
        hd1Var.getClass();
        long j = hd1Var.OOA6hdeuvCS;
        long j2 = this.OOA6hdeuvCS;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.EljAMC1QTz ^ Long.MIN_VALUE, hd1Var.EljAMC1QTz ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1)) {
            return false;
        }
        hd1 hd1Var = (hd1) obj;
        return this.OOA6hdeuvCS == hd1Var.OOA6hdeuvCS && this.EljAMC1QTz == hd1Var.EljAMC1QTz;
    }

    public final int hashCode() {
        return Long.hashCode(this.OOA6hdeuvCS ^ this.EljAMC1QTz);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        q70.iwATDS1i01k(this.OOA6hdeuvCS, bArr, 0, 0, 4);
        bArr[8] = 45;
        q70.iwATDS1i01k(this.OOA6hdeuvCS, bArr, 9, 4, 6);
        bArr[13] = 45;
        q70.iwATDS1i01k(this.OOA6hdeuvCS, bArr, 14, 6, 8);
        bArr[18] = 45;
        q70.iwATDS1i01k(this.EljAMC1QTz, bArr, 19, 0, 2);
        bArr[23] = 45;
        q70.iwATDS1i01k(this.EljAMC1QTz, bArr, 24, 2, 8);
        return new String(bArr, ma.GWasM1elztuh);
    }
}
