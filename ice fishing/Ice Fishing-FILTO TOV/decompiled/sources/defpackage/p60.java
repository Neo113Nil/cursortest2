package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p60 implements p61 {
    public float AvO7iQsrTN;
    public float EljAMC1QTz;
    public p50 OOA6hdeuvCS = p50.EljAMC1QTz;
    public final /* synthetic */ v60 encWxUiV2;

    public p60(v60 v60Var) {
        this.encWxUiV2 = v60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // defpackage.p61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List EXrPz3p7hFb(lv lvVar, Object obj) {
        Object obj2;
        v60 v60Var = this.encWxUiV2;
        v60Var.encWxUiV2();
        g60 g60Var = v60Var.OOA6hdeuvCS;
        c60 c60Var = g60Var.MZhzXH72.xqGvceK5x;
        c60 c60Var2 = c60.AvO7iQsrTN;
        c60 c60Var3 = c60.OOA6hdeuvCS;
        if (c60Var != c60Var3 && c60Var != c60Var2 && c60Var != c60.EljAMC1QTz && c60Var != c60.encWxUiV2) {
            t10.Yi7zF1RB1("subcompose can only be used inside the measure or layout blocks");
        }
        hg0 hg0Var = v60Var.rQPn8YBR;
        Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(obj);
        if (AvO7iQsrTN == null) {
            AvO7iQsrTN = (g60) v60Var.uFEq9NpZ.rQPn8YBR(obj);
            if (AvO7iQsrTN != null) {
                if (v60Var.mE4lRynR <= 0) {
                    t10.Yi7zF1RB1("Check failed.");
                }
                v60Var.mE4lRynR--;
            } else {
                AvO7iQsrTN = v60Var.uFEq9NpZ(obj);
                if (AvO7iQsrTN == null) {
                    int i = v60Var.encWxUiV2;
                    g60 g60Var2 = new g60(2);
                    g60Var.jivtDDk9H = true;
                    g60Var.M3K9sHhK(i, g60Var2);
                    g60Var.jivtDDk9H = false;
                    AvO7iQsrTN = g60Var2;
                }
            }
            hg0Var.XnEVoBF0td1l(obj, AvO7iQsrTN);
        }
        g60 g60Var3 = (g60) AvO7iQsrTN;
        List iwATDS1i01k = g60Var.iwATDS1i01k();
        int i2 = v60Var.encWxUiV2;
        if (i2 >= 0) {
            og0 og0Var = (og0) iwATDS1i01k;
            if (i2 < og0Var.OOA6hdeuvCS.AvO7iQsrTN) {
                obj2 = og0Var.get(i2);
                if (obj2 != g60Var3) {
                    int mOu10nynGul = ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.mOu10nynGul(g60Var3);
                    if (mOu10nynGul < v60Var.encWxUiV2) {
                        t10.GWasM1elztuh("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i3 = v60Var.encWxUiV2;
                    if (i3 != mOu10nynGul) {
                        v60Var.JFJ3QoxA(mOu10nynGul, i3);
                    }
                }
                v60Var.encWxUiV2++;
                v60Var.XnEVoBF0td1l(g60Var3, obj, false, lvVar);
                return (c60Var != c60Var3 || c60Var == c60Var2) ? g60Var3.XnEVoBF0td1l() : g60Var3.E7jCp8Ls();
            }
        }
        obj2 = null;
        if (obj2 != g60Var3) {
        }
        v60Var.encWxUiV2++;
        v60Var.XnEVoBF0td1l(g60Var3, obj, false, lvVar);
        if (c60Var != c60Var3) {
        }
    }

    @Override // defpackage.dd0
    public final cd0 HFYAaqMd6(int i, int i2, Map map, hv hvVar, hv hvVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            t10.Yi7zF1RB1("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new o60(i, i2, map, hvVar, this, this.encWxUiV2, hvVar2);
    }

    @Override // defpackage.k30
    public final boolean XnEVoBF0td1l() {
        c60 c60Var = this.encWxUiV2.OOA6hdeuvCS.MZhzXH72.xqGvceK5x;
        return c60Var == c60.encWxUiV2 || c60Var == c60.EljAMC1QTz;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.k30
    public final p50 getLayoutDirection() {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.AvO7iQsrTN;
    }
}
