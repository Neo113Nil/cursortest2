package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zv0 implements bd0, wv0 {
    public final r4 GWasM1elztuh;
    public final q6 Yi7zF1RB1;

    public zv0(r4 r4Var, q6 q6Var) {
        this.GWasM1elztuh = r4Var;
        this.Yi7zF1RB1 = q6Var;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        return b70.pog2g9KITJA(this, eg.JFJ3QoxA(j), eg.mOu10nynGul(j), eg.encWxUiV2(j), eg.AvO7iQsrTN(j), dd0Var.rezfBrjOrqK(this.GWasM1elztuh.GWasM1elztuh()), dd0Var, list, new up0[list.size()], list.size());
    }

    @Override // defpackage.wv0
    public final int EljAMC1QTz(up0 up0Var) {
        return up0Var.EljAMC1QTz;
    }

    @Override // defpackage.wv0
    public final cd0 GWasM1elztuh(up0[] up0VarArr, dd0 dd0Var, int[] iArr, int i, int i2) {
        return dd0Var.MjxSquD6Av(i, i2, yp.OOA6hdeuvCS, new d5idzIhj55b(up0VarArr, this, i2, iArr));
    }

    @Override // defpackage.bd0
    public final int JFJ3QoxA(k30 k30Var, List list, int i) {
        int rezfBrjOrqK = k30Var.rezfBrjOrqK(this.GWasM1elztuh.GWasM1elztuh());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            wc0 wc0Var = (wc0) list.get(i4);
            float iwATDS1i01k = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var));
            int dqB83aoLBB = wc0Var.dqB83aoLBB(i);
            if (iwATDS1i01k == 0.0f) {
                i3 += dqB83aoLBB;
            } else if (iwATDS1i01k > 0.0f) {
                f += iwATDS1i01k;
                i2 = Math.max(i2, Math.round(dqB83aoLBB / iwATDS1i01k));
            }
        }
        return ((list.size() - 1) * rezfBrjOrqK) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.wv0
    public final long OOA6hdeuvCS(int i, int i2, int i3, boolean z) {
        return !z ? fg.GWasM1elztuh(i, i2, 0, i3) : fb1.WRKkgoJXwDn(i, i2, 0, i3);
    }

    @Override // defpackage.wv0
    public final void X1lG3V04pd(int i, dd0 dd0Var, int[] iArr, int[] iArr2) {
        this.GWasM1elztuh.EljAMC1QTz(dd0Var, i, iArr, dd0Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.bd0
    public final int Yi7zF1RB1(k30 k30Var, List list, int i) {
        int rezfBrjOrqK = k30Var.rezfBrjOrqK(this.GWasM1elztuh.GWasM1elztuh());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * rezfBrjOrqK, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            wc0 wc0Var = (wc0) list.get(i3);
            float iwATDS1i01k = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var));
            if (iwATDS1i01k == 0.0f) {
                int min2 = Math.min(wc0Var.J3Xc8BaqpN8(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, wc0Var.EljAMC1QTz(min2));
            } else if (iwATDS1i01k > 0.0f) {
                f += iwATDS1i01k;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            wc0 wc0Var2 = (wc0) list.get(i4);
            float iwATDS1i01k2 = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var2));
            if (iwATDS1i01k2 > 0.0f) {
                i2 = Math.max(i2, wc0Var2.EljAMC1QTz(round != Integer.MAX_VALUE ? Math.round(round * iwATDS1i01k2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.bd0
    public final int encWxUiV2(k30 k30Var, List list, int i) {
        int rezfBrjOrqK = k30Var.rezfBrjOrqK(this.GWasM1elztuh.GWasM1elztuh());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * rezfBrjOrqK, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            wc0 wc0Var = (wc0) list.get(i3);
            float iwATDS1i01k = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var));
            if (iwATDS1i01k == 0.0f) {
                int min2 = Math.min(wc0Var.J3Xc8BaqpN8(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, wc0Var.Uxq83abb04(min2));
            } else if (iwATDS1i01k > 0.0f) {
                f += iwATDS1i01k;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            wc0 wc0Var2 = (wc0) list.get(i4);
            float iwATDS1i01k2 = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var2));
            if (iwATDS1i01k2 > 0.0f) {
                i2 = Math.max(i2, wc0Var2.Uxq83abb04(round != Integer.MAX_VALUE ? Math.round(round * iwATDS1i01k2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0)) {
            return false;
        }
        zv0 zv0Var = (zv0) obj;
        return this.GWasM1elztuh.equals(zv0Var.GWasM1elztuh) && this.Yi7zF1RB1.equals(zv0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1.GWasM1elztuh) + (this.GWasM1elztuh.hashCode() * 31);
    }

    @Override // defpackage.wv0
    public final int mOu10nynGul(up0 up0Var) {
        return up0Var.OOA6hdeuvCS;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.GWasM1elztuh + ", verticalAlignment=" + this.Yi7zF1RB1 + ')';
    }

    @Override // defpackage.bd0
    public final int xqGvceK5x(k30 k30Var, List list, int i) {
        int rezfBrjOrqK = k30Var.rezfBrjOrqK(this.GWasM1elztuh.GWasM1elztuh());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            wc0 wc0Var = (wc0) list.get(i4);
            float iwATDS1i01k = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var));
            int J3Xc8BaqpN8 = wc0Var.J3Xc8BaqpN8(i);
            if (iwATDS1i01k == 0.0f) {
                i3 += J3Xc8BaqpN8;
            } else if (iwATDS1i01k > 0.0f) {
                f += iwATDS1i01k;
                i2 = Math.max(i2, Math.round(J3Xc8BaqpN8 / iwATDS1i01k));
            }
        }
        return ((list.size() - 1) * rezfBrjOrqK) + Math.round(i2 * f) + i3;
    }
}
