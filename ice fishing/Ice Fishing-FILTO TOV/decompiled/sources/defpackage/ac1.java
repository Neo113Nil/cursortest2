package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ac1 implements m4 {
    public Object AvO7iQsrTN;
    public final ArrayList EljAMC1QTz = new ArrayList();
    public final Object OOA6hdeuvCS;

    public ac1(g60 g60Var) {
        this.OOA6hdeuvCS = g60Var;
        this.AvO7iQsrTN = g60Var;
    }

    @Override // defpackage.m4
    public final void AvO7iQsrTN() {
        gn0 gn0Var = ((g60) this.OOA6hdeuvCS).Mjvvu5DE;
        if (gn0Var != null) {
            ((c) gn0Var).lv06NcmrQ();
        }
    }

    @Override // defpackage.m4
    public final /* bridge */ /* synthetic */ void EljAMC1QTz(int i, Object obj) {
    }

    public final void GWasM1elztuh() {
        this.EljAMC1QTz.clear();
        this.AvO7iQsrTN = this.OOA6hdeuvCS;
        ((g60) this.OOA6hdeuvCS).VeqTn1PQw7();
    }

    @Override // defpackage.m4
    public final void JFJ3QoxA(int i, int i2) {
        ((g60) this.AvO7iQsrTN).z19UFEN2I(i, i2);
    }

    @Override // defpackage.m4
    public final void OOA6hdeuvCS() {
        mt0 rectManager;
        VJUcwvGgb9W vJUcwvGgb9W;
        mt0 rectManager2;
        g60 g60Var = (g60) this.AvO7iQsrTN;
        xj0 xj0Var = g60Var.A1EKNP6CxJ;
        if (!g60Var.eUH21U3apd()) {
            t10.GWasM1elztuh("onReuse is only expected on attached node");
        }
        v60 v60Var = g60Var.DmJncFq5;
        if (v60Var != null) {
            v60Var.mOu10nynGul(false);
        }
        g60Var.lv06NcmrQ = false;
        if (g60Var.YXi2hvwn7WL) {
            g60Var.YXi2hvwn7WL = false;
        } else {
            he0 he0Var = g60Var.A1EKNP6CxJ.OOA6hdeuvCS;
            for (he0 he0Var2 = he0Var; he0Var2 != null; he0Var2 = he0Var2.mOu10nynGul) {
                if (he0Var2.Mjvvu5DE) {
                    he0Var2.hOpoc9RpANL();
                }
            }
            for (he0 he0Var3 = he0Var; he0Var3 != null; he0Var3 = he0Var3.mOu10nynGul) {
                if (he0Var3.Mjvvu5DE) {
                    he0Var3.FhVkB11j();
                }
            }
            while (he0Var != null) {
                if (he0Var.Mjvvu5DE) {
                    he0Var.vaTCmWUgXF();
                }
                he0Var = he0Var.mOu10nynGul;
            }
        }
        int i = g60Var.EljAMC1QTz;
        gn0 gn0Var = g60Var.Mjvvu5DE;
        if (gn0Var != null && (rectManager2 = ((c) gn0Var).getRectManager()) != null) {
            rectManager2.AvO7iQsrTN(g60Var);
        }
        g60Var.EljAMC1QTz = a01.GWasM1elztuh.addAndGet(1);
        gn0 gn0Var2 = g60Var.Mjvvu5DE;
        if (gn0Var2 != null) {
            c cVar = (c) gn0Var2;
            cVar.m9getLayoutNodes().AvO7iQsrTN(i);
            cVar.m9getLayoutNodes().encWxUiV2(g60Var.EljAMC1QTz, g60Var);
        }
        for (he0 he0Var4 = xj0Var.EljAMC1QTz; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
            he0Var4.WkXHDbKiD();
        }
        xj0Var.OOA6hdeuvCS();
        if (xj0Var.xqGvceK5x(8)) {
            g60Var.AEn1Rrio();
        }
        g60.MjxSquD6Av(g60Var);
        gn0 gn0Var3 = g60Var.Mjvvu5DE;
        if (gn0Var3 != null) {
            c cVar2 = (c) gn0Var3;
            if (c.encWxUiV2() && (vJUcwvGgb9W = cVar2.z19UFEN2I) != null) {
                c cVar3 = vJUcwvGgb9W.AvO7iQsrTN;
                j6IIN2O8eOU j6iin2o8eou = vJUcwvGgb9W.OOA6hdeuvCS;
                sf0 sf0Var = vJUcwvGgb9W.rQPn8YBR;
                if (sf0Var.OOA6hdeuvCS(i)) {
                    j6iin2o8eou.uFEq9NpZ(cVar3, i, false);
                }
                zz0 WdrkLMV3xh = g60Var.WdrkLMV3xh();
                if (WdrkLMV3xh != null && WdrkLMV3xh.OOA6hdeuvCS.Yi7zF1RB1(h01.Mjvvu5DE)) {
                    sf0Var.GWasM1elztuh(g60Var.EljAMC1QTz);
                    j6iin2o8eou.uFEq9NpZ(cVar3, g60Var.EljAMC1QTz, true);
                }
            }
        }
        gn0 gn0Var4 = g60Var.Mjvvu5DE;
        if (gn0Var4 == null || (rectManager = ((c) gn0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.EljAMC1QTz(g60Var);
    }

    @Override // defpackage.m4
    public final void X1lG3V04pd(int i, Object obj) {
        ((g60) this.AvO7iQsrTN).M3K9sHhK(i, (g60) obj);
    }

    @Override // defpackage.m4
    public final void YmKjaVtbfp5Z() {
        this.AvO7iQsrTN = this.EljAMC1QTz.remove(r0.size() - 1);
    }

    @Override // defpackage.m4
    public final void encWxUiV2(int i, int i2, int i3) {
        ((g60) this.AvO7iQsrTN).HFYAaqMd6(i, i2, i3);
    }

    @Override // defpackage.m4
    public final Object mOu10nynGul() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.m4
    public final void xqGvceK5x(Object obj) {
        this.EljAMC1QTz.add(this.AvO7iQsrTN);
        this.AvO7iQsrTN = obj;
    }
}
