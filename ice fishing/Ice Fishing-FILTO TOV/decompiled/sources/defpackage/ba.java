package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ba implements wv {
    public final l8 AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final gh OOA6hdeuvCS;

    public ba(gh ghVar, int i, l8 l8Var) {
        this.OOA6hdeuvCS = ghVar;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = l8Var;
    }

    public z9 AvO7iQsrTN(ph phVar) {
        int i = this.EljAMC1QTz;
        if (i == -3) {
            i = -2;
        }
        lv xqgvcek5x = new xqGvceK5x(this, null, 4);
        n8 Yi7zF1RB1 = fb1.Yi7zF1RB1(i, this.AvO7iQsrTN, 4);
        gh lv06NcmrQ = o30.lv06NcmrQ(phVar.EljAMC1QTz(), this.OOA6hdeuvCS, true);
        pk pkVar = mm.GWasM1elztuh;
        if (lv06NcmrQ != pkVar && lv06NcmrQ.E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB) == null) {
            lv06NcmrQ = lv06NcmrQ.mOu10nynGul(pkVar);
        }
        ds0 ds0Var = new ds0(lv06NcmrQ, Yi7zF1RB1);
        ds0Var.rASgSCrgZkT7(sh.AvO7iQsrTN, ds0Var, xqgvcek5x);
        return ds0Var;
    }

    public ls EljAMC1QTz() {
        return null;
    }

    @Override // defpackage.ls
    public Object GWasM1elztuh(ms msVar, vg vgVar) {
        Object mE4lRynR = fb1.mE4lRynR(new EljAMC1QTz(msVar, this, null, 3), vgVar);
        return mE4lRynR == qh.OOA6hdeuvCS ? mE4lRynR : kc1.GWasM1elztuh;
    }

    public abstract ba OOA6hdeuvCS(gh ghVar, int i, l8 l8Var);

    public String X1lG3V04pd() {
        return null;
    }

    @Override // defpackage.wv
    public final ls Yi7zF1RB1(gh ghVar, int i, l8 l8Var) {
        gh ghVar2 = this.OOA6hdeuvCS;
        gh mOu10nynGul = ghVar.mOu10nynGul(ghVar2);
        l8 l8Var2 = l8.OOA6hdeuvCS;
        l8 l8Var3 = this.AvO7iQsrTN;
        int i2 = this.EljAMC1QTz;
        if (l8Var == l8Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            l8Var = l8Var3;
        }
        return (o30.rQPn8YBR(mOu10nynGul, ghVar2) && i == i2 && l8Var == l8Var3) ? this : OOA6hdeuvCS(mOu10nynGul, i, l8Var);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String X1lG3V04pd = X1lG3V04pd();
        if (X1lG3V04pd != null) {
            arrayList.add(X1lG3V04pd);
        }
        vp vpVar = vp.OOA6hdeuvCS;
        gh ghVar = this.OOA6hdeuvCS;
        if (ghVar != vpVar) {
            arrayList.add("context=" + ghVar);
        }
        int i = this.EljAMC1QTz;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        l8 l8Var = l8.OOA6hdeuvCS;
        l8 l8Var2 = this.AvO7iQsrTN;
        if (l8Var2 != l8Var) {
            arrayList.add("onBufferOverflow=" + l8Var2);
        }
        return getClass().getSimpleName() + '[' + rb.WkXHDbKiD(arrayList, ", ", null, null, null, 62) + ']';
    }

    public abstract Object xqGvceK5x(ds0 ds0Var, vg vgVar);
}
