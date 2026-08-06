package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class wb0 extends ub0 implements wc0 {
    public final zf0 WdrkLMV3xh;
    public LinkedHashMap Y6hRI1cF8;
    public cd0 lv06NcmrQ;
    public final bk0 mE4lRynR;
    public long jivtDDk9H = 0;
    public final xb0 cilMamHF = new xb0(this);

    public wb0(bk0 bk0Var) {
        this.mE4lRynR = bk0Var;
        zf0 zf0Var = pk0.GWasM1elztuh;
        this.WdrkLMV3xh = new zf0();
    }

    public static final void sb9fmtV8A(wb0 wb0Var, cd0 cd0Var) {
        LinkedHashMap linkedHashMap;
        if (cd0Var != null) {
            wb0Var.dcDmLGVhzWm((cd0Var.X1lG3V04pd() & 4294967295L) | (cd0Var.OOA6hdeuvCS() << 32));
        } else {
            wb0Var.dcDmLGVhzWm(0L);
        }
        if (!o30.rQPn8YBR(wb0Var.lv06NcmrQ, cd0Var) && cd0Var != null && ((((linkedHashMap = wb0Var.Y6hRI1cF8) != null && !linkedHashMap.isEmpty()) || !cd0Var.GWasM1elztuh().isEmpty()) && !o30.rQPn8YBR(cd0Var.GWasM1elztuh(), wb0Var.Y6hRI1cF8))) {
            ac0 ac0Var = wb0Var.mE4lRynR.mE4lRynR.MZhzXH72.YmKjaVtbfp5Z;
            ac0Var.getClass();
            ac0Var.cilMamHF.EljAMC1QTz();
            LinkedHashMap linkedHashMap2 = wb0Var.Y6hRI1cF8;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                wb0Var.Y6hRI1cF8 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(cd0Var.GWasM1elztuh());
        }
        wb0Var.lv06NcmrQ = cd0Var;
    }

    @Override // defpackage.up0
    public final void EDwNPVYuViP0(long j, float f, hv hvVar) {
        Hc2GqxcqBiX(j);
        if (this.uFEq9NpZ) {
            return;
        }
        XmVeRDAr();
    }

    public final void Hc2GqxcqBiX(long j) {
        if (!u20.GWasM1elztuh(this.jivtDDk9H, j)) {
            this.jivtDDk9H = j;
            bk0 bk0Var = this.mE4lRynR;
            ac0 ac0Var = bk0Var.mE4lRynR.MZhzXH72.YmKjaVtbfp5Z;
            if (ac0Var != null) {
                ac0Var.UjhVk5crk();
            }
            ub0.j6IIN2O8eOU(bk0Var);
        }
        if (this.iwATDS1i01k) {
            return;
        }
        UjhVk5crk(gHe2tSmr6w());
    }

    public final long OGdJP42E(wb0 wb0Var, boolean z) {
        long j = 0;
        while (!this.equals(wb0Var)) {
            if (!this.XnEVoBF0td1l || !z) {
                j = u20.X1lG3V04pd(j, this.jivtDDk9H);
            }
            bk0 bk0Var = this.mE4lRynR.Y6hRI1cF8;
            bk0Var.getClass();
            this = bk0Var.P4U4zqyW7wx();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.ub0
    public final ub0 WkXHDbKiD() {
        bk0 bk0Var = this.mE4lRynR.jivtDDk9H;
        if (bk0Var != null) {
            return bk0Var.P4U4zqyW7wx();
        }
        return null;
    }

    public void XmVeRDAr() {
        gHe2tSmr6w().Yi7zF1RB1();
    }

    @Override // defpackage.ub0, defpackage.k30
    public final boolean XnEVoBF0td1l() {
        return true;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.mE4lRynR.Yi7zF1RB1();
    }

    @Override // defpackage.ub0
    public final g60 bCsSzSHkbaQ() {
        return this.mE4lRynR.mE4lRynR;
    }

    @Override // defpackage.ub0
    public final boolean cTIXpaxc() {
        return this.lv06NcmrQ != null;
    }

    @Override // defpackage.up0, defpackage.wc0
    public final Object encWxUiV2() {
        return this.mE4lRynR.encWxUiV2();
    }

    @Override // defpackage.ub0
    public final cd0 gHe2tSmr6w() {
        cd0 cd0Var = this.lv06NcmrQ;
        if (cd0Var != null) {
            return cd0Var;
        }
        throw mr0.EljAMC1QTz("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.k30
    public final p50 getLayoutDirection() {
        return this.mE4lRynR.mE4lRynR.k8h8IjolWQ;
    }

    @Override // defpackage.ub0
    public final void gqMuANyCes() {
        EDwNPVYuViP0(this.jivtDDk9H, 0.0f, null);
    }

    @Override // defpackage.ub0
    public final ub0 hOpoc9RpANL() {
        bk0 bk0Var = this.mE4lRynR.Y6hRI1cF8;
        if (bk0Var != null) {
            return bk0Var.P4U4zqyW7wx();
        }
        return null;
    }

    @Override // defpackage.ub0
    public final long kbVzROOfKK() {
        return this.jivtDDk9H;
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.mE4lRynR.mOu10nynGul();
    }

    @Override // defpackage.ub0
    public final n50 vaTCmWUgXF() {
        return this.cilMamHF;
    }
}
