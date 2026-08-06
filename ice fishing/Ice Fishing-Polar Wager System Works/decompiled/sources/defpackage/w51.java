package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w51 implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.a61 xiZrDbcSW0;

    public /* synthetic */ w51(defpackage.a61 a61Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = a61Var;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        defpackage.a61 a61Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return java.lang.Boolean.valueOf(a61Var.kd6TUFXn);
            default:
                defpackage.gy gyVar = a61Var.Ye0N2xE9Hc;
                if (!gyVar.adDC3e2L.kd6TUFXn) {
                    return null;
                }
                defpackage.fy fzubgBFo = gyVar.fzubgBFo();
                int ordinal = fzubgBFo.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    defpackage.db.F7NU4MC0GW();
                    return null;
                }
                if (fzubgBFo.IHQe1A4L2xu()) {
                    return gyVar.WnQbjbWuMR(null);
                }
                defpackage.gy xiZrDbcSW0 = ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner()).xiZrDbcSW0();
                if (xiZrDbcSW0 != null) {
                    return xiZrDbcSW0.WnQbjbWuMR(defpackage.w70.v5iciZok(gyVar));
                }
                return null;
        }
    }
}
