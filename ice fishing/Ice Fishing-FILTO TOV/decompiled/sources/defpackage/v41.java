package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v41 implements af, Iterable, q40 {
    public final wt0 AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final z21 OOA6hdeuvCS;

    public v41(z21 z21Var, int i, sx sxVar, wt0 wt0Var) {
        this.OOA6hdeuvCS = z21Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = wt0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v41)) {
            return false;
        }
        v41 v41Var = (v41) obj;
        return v41Var.EljAMC1QTz == this.EljAMC1QTz && v41Var.OOA6hdeuvCS == this.OOA6hdeuvCS && v41Var.AvO7iQsrTN.equals(this.AvO7iQsrTN);
    }

    public final int hashCode() {
        return this.AvO7iQsrTN.hashCode() + ((this.OOA6hdeuvCS.hashCode() + (this.EljAMC1QTz * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bl(this.OOA6hdeuvCS, this.EljAMC1QTz, null, this.AvO7iQsrTN);
    }
}
