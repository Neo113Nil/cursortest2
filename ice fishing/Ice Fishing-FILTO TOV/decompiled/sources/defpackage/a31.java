package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a31 implements af, Iterable, q40 {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final z21 OOA6hdeuvCS;

    public a31(z21 z21Var, int i, int i2) {
        this.OOA6hdeuvCS = z21Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a31)) {
            return false;
        }
        a31 a31Var = (a31) obj;
        return a31Var.EljAMC1QTz == this.EljAMC1QTz && a31Var.AvO7iQsrTN == this.AvO7iQsrTN && a31Var.OOA6hdeuvCS == this.OOA6hdeuvCS;
    }

    public final int hashCode() {
        return (this.OOA6hdeuvCS.hashCode() * 31) + this.EljAMC1QTz;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        z21 z21Var = this.OOA6hdeuvCS;
        if (z21Var.E7jCp8Ls != this.AvO7iQsrTN) {
            b31.EljAMC1QTz();
        }
        int i = this.EljAMC1QTz;
        z21Var.AvO7iQsrTN(i);
        return new az(z21Var, i + 1, z21Var.OOA6hdeuvCS[(i * 5) + 3] + i);
    }
}
