package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m60 implements p61, dd0 {
    public final /* synthetic */ v60 EljAMC1QTz;
    public final /* synthetic */ p60 OOA6hdeuvCS;

    public m60(v60 v60Var) {
        this.EljAMC1QTz = v60Var;
        this.OOA6hdeuvCS = v60Var.E7jCp8Ls;
    }

    @Override // defpackage.el
    public final float AEn1Rrio(long j) {
        return this.OOA6hdeuvCS.AEn1Rrio(j);
    }

    @Override // defpackage.el
    public final long CMh55RymNfS(long j) {
        return this.OOA6hdeuvCS.CMh55RymNfS(j);
    }

    @Override // defpackage.p61
    public final List EXrPz3p7hFb(lv lvVar, Object obj) {
        v60 v60Var = this.EljAMC1QTz;
        g60 g60Var = v60Var.OOA6hdeuvCS;
        hg0 hg0Var = v60Var.rQPn8YBR;
        g60 g60Var2 = (g60) hg0Var.AvO7iQsrTN(obj);
        if (g60Var2 != null && ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.mOu10nynGul(g60Var2) < v60Var.encWxUiV2) {
            return g60Var2.XnEVoBF0td1l();
        }
        hg0 hg0Var2 = v60Var.WIEu4Ya2g8;
        hg0 hg0Var3 = v60Var.uFEq9NpZ;
        rg0 rg0Var = v60Var.YmKjaVtbfp5Z;
        if (rg0Var.AvO7iQsrTN < v60Var.mOu10nynGul) {
            t10.GWasM1elztuh("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        g60 g60Var3 = (g60) hg0Var.AvO7iQsrTN(obj);
        int i = rg0Var.AvO7iQsrTN;
        int i2 = v60Var.mOu10nynGul;
        if (i == i2) {
            rg0Var.Yi7zF1RB1(obj);
        } else {
            Object[] objArr = rg0Var.OOA6hdeuvCS;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        v60Var.mOu10nynGul++;
        boolean Yi7zF1RB1 = hg0Var3.Yi7zF1RB1(obj);
        if (Yi7zF1RB1 || g60Var3 != null) {
            if (!Yi7zF1RB1 && g60Var3 != null) {
                v60Var.JFJ3QoxA(((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.mOu10nynGul(g60Var3), ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN);
                v60Var.mE4lRynR++;
                hg0Var.rQPn8YBR(obj);
                hg0Var3.XnEVoBF0td1l(obj, g60Var3);
                hg0Var2.XnEVoBF0td1l(obj, v60Var.EljAMC1QTz(obj));
                if (g60Var.eUH21U3apd()) {
                    v60Var.encWxUiV2();
                }
            }
            g60 g60Var4 = (g60) hg0Var3.AvO7iQsrTN(obj);
            n60 n60Var = g60Var4 != null ? (n60) v60Var.JFJ3QoxA.AvO7iQsrTN(g60Var4) : null;
            if (n60Var != null && n60Var.xqGvceK5x) {
                v60Var.XnEVoBF0td1l(g60Var4, obj, false, lvVar);
            }
            if ((n60Var != null ? n60Var.EljAMC1QTz : null) != null) {
                v60Var.xqGvceK5x(n60Var, true);
            }
        } else {
            v60Var.rQPn8YBR(obj, lvVar, false);
            hg0Var2.XnEVoBF0td1l(obj, v60Var.EljAMC1QTz(obj));
        }
        g60 g60Var5 = (g60) hg0Var3.AvO7iQsrTN(obj);
        if (g60Var5 == null) {
            return xp.OOA6hdeuvCS;
        }
        List nXl1EmE5 = g60Var5.MZhzXH72.WIEu4Ya2g8.nXl1EmE5();
        og0 og0Var = (og0) nXl1EmE5;
        int i3 = og0Var.OOA6hdeuvCS.AvO7iQsrTN;
        for (int i4 = 0; i4 < i3; i4++) {
            ((ad0) og0Var.get(i4)).JFJ3QoxA.Yi7zF1RB1 = true;
        }
        return nXl1EmE5;
    }

    @Override // defpackage.dd0
    public final cd0 HFYAaqMd6(int i, int i2, Map map, hv hvVar, hv hvVar2) {
        return this.OOA6hdeuvCS.HFYAaqMd6(i, i2, map, hvVar, hvVar2);
    }

    @Override // defpackage.el
    public final float K0ReC6MK(int i) {
        return this.OOA6hdeuvCS.K0ReC6MK(i);
    }

    @Override // defpackage.el
    public final float MItybXapHX(long j) {
        return this.OOA6hdeuvCS.MItybXapHX(j);
    }

    @Override // defpackage.el
    public final long Mjvvu5DE(long j) {
        return this.OOA6hdeuvCS.Mjvvu5DE(j);
    }

    @Override // defpackage.dd0
    public final cd0 MjxSquD6Av(int i, int i2, Map map, hv hvVar) {
        return this.OOA6hdeuvCS.HFYAaqMd6(i, i2, map, null, hvVar);
    }

    @Override // defpackage.el
    public final long NyNgffpi(float f) {
        return this.OOA6hdeuvCS.NyNgffpi(f);
    }

    @Override // defpackage.k30
    public final boolean XnEVoBF0td1l() {
        return this.OOA6hdeuvCS.XnEVoBF0td1l();
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.OOA6hdeuvCS.EljAMC1QTz;
    }

    @Override // defpackage.el
    public final long YmKjaVtbfp5Z(float f) {
        return this.OOA6hdeuvCS.YmKjaVtbfp5Z(f);
    }

    @Override // defpackage.k30
    public final p50 getLayoutDirection() {
        return this.OOA6hdeuvCS.OOA6hdeuvCS;
    }

    @Override // defpackage.el
    public final float jivtDDk9H(float f) {
        return this.OOA6hdeuvCS.Yi7zF1RB1() * f;
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.OOA6hdeuvCS.AvO7iQsrTN;
    }

    @Override // defpackage.el
    public final float rASgSCrgZkT7(float f) {
        return f / this.OOA6hdeuvCS.Yi7zF1RB1();
    }

    @Override // defpackage.el
    public final int rezfBrjOrqK(float f) {
        return this.OOA6hdeuvCS.rezfBrjOrqK(f);
    }
}
