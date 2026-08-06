package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mf0 extends le {
    public final el0 EljAMC1QTz;
    public final hg0 OOA6hdeuvCS;
    public final ArrayList X1lG3V04pd;
    public final hg0 Yi7zF1RB1;
    public final ig0 xqGvceK5x;

    public mf0() {
        super(1);
        this.Yi7zF1RB1 = b70.WIEu4Ya2g8();
        this.X1lG3V04pd = new ArrayList();
        ig0 ig0Var = lx0.GWasM1elztuh;
        this.xqGvceK5x = new ig0();
        this.OOA6hdeuvCS = new hg0();
        k4 k4Var = new k4(7, this);
        e41.OOA6hdeuvCS(e41.GWasM1elztuh);
        synchronized (e41.X1lG3V04pd) {
            e41.encWxUiV2 = rb.gHe2tSmr6w(e41.encWxUiV2, k4Var);
        }
        this.EljAMC1QTz = new el0(k4Var);
    }

    @Override // defpackage.le
    public final void OOA6hdeuvCS() {
        this.EljAMC1QTz.GWasM1elztuh();
        this.X1lG3V04pd.clear();
        this.OOA6hdeuvCS.GWasM1elztuh();
        synchronized (this.GWasM1elztuh) {
            this.Yi7zF1RB1.GWasM1elztuh();
        }
    }

    @Override // defpackage.le
    public final void X1lG3V04pd(t01 t01Var) {
        this.X1lG3V04pd.add(new kf0(t01Var));
    }

    @Override // defpackage.le
    public final hv encWxUiV2(t01 t01Var) {
        hg0 hg0Var = this.OOA6hdeuvCS;
        hv hvVar = (hv) hg0Var.AvO7iQsrTN(t01Var);
        if (hvVar == null) {
            hvVar = new X1lG3V04pd(14, this, t01Var);
            int EljAMC1QTz = hg0Var.EljAMC1QTz(t01Var);
            if (EljAMC1QTz < 0) {
                EljAMC1QTz = ~EljAMC1QTz;
            }
            Object[] objArr = hg0Var.X1lG3V04pd;
            Object obj = objArr[EljAMC1QTz];
            hg0Var.Yi7zF1RB1[EljAMC1QTz] = t01Var;
            objArr[EljAMC1QTz] = hvVar;
        }
        return hvVar;
    }

    @Override // defpackage.le
    public final void mOu10nynGul(z9 z9Var) {
        this.OOA6hdeuvCS.rQPn8YBR(z9Var);
        X1lG3V04pd(z9Var);
        xqGvceK5x();
    }

    @Override // defpackage.le
    public final void xqGvceK5x() {
        synchronized (this.GWasM1elztuh) {
            try {
                ArrayList arrayList = this.X1lG3V04pd;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    lf0 lf0Var = (lf0) arrayList.get(i);
                    if (lf0Var instanceof jf0) {
                        b70.E7jCp8Ls(this.Yi7zF1RB1, ((jf0) lf0Var).GWasM1elztuh, ((jf0) lf0Var).Yi7zF1RB1);
                    } else {
                        if (!(lf0Var instanceof kf0)) {
                            throw new vc();
                        }
                        b70.AEn1Rrio(this.Yi7zF1RB1, ((kf0) lf0Var).GWasM1elztuh);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.X1lG3V04pd.clear();
    }
}
