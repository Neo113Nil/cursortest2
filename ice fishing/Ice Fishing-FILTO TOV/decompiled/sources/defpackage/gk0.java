package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class gk0 {
    public final rg0 GWasM1elztuh = new rg0(new uj0[16]);
    public final ag0 Yi7zF1RB1 = new ag0(10);

    public boolean GWasM1elztuh(qb0 qb0Var, n50 n50Var, d dVar, boolean z) {
        rg0 rg0Var = this.GWasM1elztuh;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((uj0) objArr[i2]).GWasM1elztuh(qb0Var, n50Var, dVar, z) || z2;
        }
        return z2;
    }

    public void Yi7zF1RB1(d dVar) {
        rg0 rg0Var = this.GWasM1elztuh;
        int i = rg0Var.AvO7iQsrTN;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((uj0) rg0Var.OOA6hdeuvCS[i]).xqGvceK5x.GWasM1elztuh == 0) {
                rg0Var.rQPn8YBR(i);
            }
        }
    }
}
