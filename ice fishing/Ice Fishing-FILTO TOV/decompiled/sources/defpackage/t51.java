package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class t51 implements s51 {
    public final i5 OOA6hdeuvCS = new i5(0);

    public final void EljAMC1QTz(int i) {
        i5 i5Var;
        int i2;
        do {
            i5Var = this.OOA6hdeuvCS;
            i2 = i5Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!i5Var.compareAndSet(i2, i2 | i));
    }

    public final boolean OOA6hdeuvCS(int i) {
        return (this.OOA6hdeuvCS.get() & i) != 0;
    }
}
