package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ca extends ba {
    public final ls encWxUiV2;

    public ca(ls lsVar, gh ghVar, int i, l8 l8Var) {
        super(ghVar, i, l8Var);
        this.encWxUiV2 = lsVar;
    }

    @Override // defpackage.ba, defpackage.ls
    public final Object GWasM1elztuh(ms msVar, vg vgVar) {
        int i = this.EljAMC1QTz;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == -3) {
            gh OOA6hdeuvCS = vgVar.OOA6hdeuvCS();
            Boolean bool = Boolean.FALSE;
            pd pdVar = new pd(17);
            gh ghVar = this.OOA6hdeuvCS;
            gh mOu10nynGul = !((Boolean) ghVar.WIEu4Ya2g8(pdVar, bool)).booleanValue() ? OOA6hdeuvCS.mOu10nynGul(ghVar) : o30.lv06NcmrQ(OOA6hdeuvCS, ghVar, false);
            if (o30.rQPn8YBR(mOu10nynGul, OOA6hdeuvCS)) {
                Object encWxUiV2 = encWxUiV2(msVar, vgVar);
                if (encWxUiV2 == qhVar) {
                    return encWxUiV2;
                }
            } else {
                b9xEq24R1 b9xeq24r1 = b9xEq24R1.arNh8D4Z5gB;
                if (o30.rQPn8YBR(mOu10nynGul.E7jCp8Ls(b9xeq24r1), OOA6hdeuvCS.E7jCp8Ls(b9xeq24r1))) {
                    gh OOA6hdeuvCS2 = vgVar.OOA6hdeuvCS();
                    if (!(msVar instanceof u01) && !(msVar instanceof lk0)) {
                        msVar = new e3(msVar, OOA6hdeuvCS2);
                    }
                    Object rezfBrjOrqK = rj0.rezfBrjOrqK(mOu10nynGul, msVar, p.WRKkgoJXwDn(mOu10nynGul), new xqGvceK5x(this, null, 5), vgVar);
                    if (rezfBrjOrqK == qhVar) {
                        return rezfBrjOrqK;
                    }
                }
            }
            return kc1.GWasM1elztuh;
        }
        Object GWasM1elztuh = super.GWasM1elztuh(msVar, vgVar);
        if (GWasM1elztuh == qhVar) {
            return GWasM1elztuh;
        }
        return kc1.GWasM1elztuh;
    }

    public abstract Object encWxUiV2(ms msVar, vg vgVar);

    @Override // defpackage.ba
    public final String toString() {
        return this.encWxUiV2 + " -> " + super.toString();
    }

    @Override // defpackage.ba
    public final Object xqGvceK5x(ds0 ds0Var, vg vgVar) {
        Object encWxUiV2 = encWxUiV2(new u01(ds0Var), vgVar);
        return encWxUiV2 == qh.OOA6hdeuvCS ? encWxUiV2 : kc1.GWasM1elztuh;
    }
}
