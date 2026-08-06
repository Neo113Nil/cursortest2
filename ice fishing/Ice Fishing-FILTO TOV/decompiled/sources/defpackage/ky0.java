package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class ky0 implements wu {
    public final /* synthetic */ oy0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ ky0(oy0 oy0Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = oy0Var;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        int i = this.OOA6hdeuvCS;
        oy0 oy0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                return Boolean.valueOf(oy0Var.Mjvvu5DE);
            default:
                rt rtVar = oy0Var.qugwajBSa59j;
                if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
                    return null;
                }
                qt bfDgRvRIg = rtVar.bfDgRvRIg();
                int ordinal = bfDgRvRIg.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    o4.xqGvceK5x();
                    return null;
                }
                if (bfDgRvRIg.GWasM1elztuh()) {
                    return rtVar.Hc2GqxcqBiX(null);
                }
                rt EljAMC1QTz = ((nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner()).EljAMC1QTz();
                if (EljAMC1QTz != null) {
                    return EljAMC1QTz.Hc2GqxcqBiX(vc0.YZjbz8VdP5(rtVar));
                }
                return null;
        }
    }
}
