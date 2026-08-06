package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nc implements bd0, wv0 {
    public final t4 GWasM1elztuh;
    public final p6 Yi7zF1RB1;

    public nc(t4 t4Var, p6 p6Var) {
        this.GWasM1elztuh = t4Var;
        this.Yi7zF1RB1 = p6Var;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        return b70.pog2g9KITJA(this, eg.mOu10nynGul(j), eg.JFJ3QoxA(j), eg.AvO7iQsrTN(j), eg.encWxUiV2(j), dd0Var.rezfBrjOrqK(this.GWasM1elztuh.GWasM1elztuh()), dd0Var, list, new up0[list.size()], list.size());
    }

    @Override // defpackage.wv0
    public final int EljAMC1QTz(up0 up0Var) {
        return up0Var.OOA6hdeuvCS;
    }

    @Override // defpackage.wv0
    public final cd0 GWasM1elztuh(final up0[] up0VarArr, final dd0 dd0Var, final int[] iArr, int i, final int i2) {
        return dd0Var.MjxSquD6Av(i2, i, yp.OOA6hdeuvCS, new hv() { // from class: mc
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                tp0 tp0Var = (tp0) obj;
                up0[] up0VarArr2 = up0VarArr;
                int length = up0VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    up0 up0Var = up0VarArr2[i3];
                    int i5 = i4 + 1;
                    up0Var.getClass();
                    Object encWxUiV2 = up0Var.encWxUiV2();
                    xv0 xv0Var = encWxUiV2 instanceof xv0 ? (xv0) encWxUiV2 : null;
                    p50 layoutDirection = dd0Var.getLayoutDirection();
                    yh yhVar = xv0Var != null ? xv0Var.X1lG3V04pd : null;
                    int i6 = i2;
                    tp0.AvO7iQsrTN(tp0Var, up0Var, yhVar != null ? yhVar.GWasM1elztuh.GWasM1elztuh(up0Var.OOA6hdeuvCS, i6, layoutDirection) : this.Yi7zF1RB1.GWasM1elztuh(up0Var.OOA6hdeuvCS, i6, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return kc1.GWasM1elztuh;
            }
        });
    }

    @Override // defpackage.bd0
    public final int JFJ3QoxA(k30 k30Var, List list, int i) {
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
                int min2 = Math.min(wc0Var.EljAMC1QTz(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, wc0Var.dqB83aoLBB(min2));
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
                i2 = Math.max(i2, wc0Var2.dqB83aoLBB(round != Integer.MAX_VALUE ? Math.round(round * iwATDS1i01k2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.wv0
    public final long OOA6hdeuvCS(int i, int i2, int i3, boolean z) {
        return !z ? fg.GWasM1elztuh(0, i3, i, i2) : fb1.WdrkLMV3xh(0, i3, i, i2);
    }

    @Override // defpackage.wv0
    public final void X1lG3V04pd(int i, dd0 dd0Var, int[] iArr, int[] iArr2) {
        this.GWasM1elztuh.encWxUiV2(i, dd0Var, iArr, iArr2);
    }

    @Override // defpackage.bd0
    public final int Yi7zF1RB1(k30 k30Var, List list, int i) {
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
            int EljAMC1QTz = wc0Var.EljAMC1QTz(i);
            if (iwATDS1i01k == 0.0f) {
                i3 += EljAMC1QTz;
            } else if (iwATDS1i01k > 0.0f) {
                f += iwATDS1i01k;
                i2 = Math.max(i2, Math.round(EljAMC1QTz / iwATDS1i01k));
            }
        }
        return ((list.size() - 1) * rezfBrjOrqK) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.bd0
    public final int encWxUiV2(k30 k30Var, List list, int i) {
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
            int Uxq83abb04 = wc0Var.Uxq83abb04(i);
            if (iwATDS1i01k == 0.0f) {
                i3 += Uxq83abb04;
            } else if (iwATDS1i01k > 0.0f) {
                f += iwATDS1i01k;
                i2 = Math.max(i2, Math.round(Uxq83abb04 / iwATDS1i01k));
            }
        }
        return ((list.size() - 1) * rezfBrjOrqK) + Math.round(i2 * f) + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return this.GWasM1elztuh.equals(ncVar.GWasM1elztuh) && this.Yi7zF1RB1.equals(ncVar.Yi7zF1RB1);
    }

    public final int hashCode() {
        return Float.hashCode(this.Yi7zF1RB1.GWasM1elztuh) + (this.GWasM1elztuh.hashCode() * 31);
    }

    @Override // defpackage.wv0
    public final int mOu10nynGul(up0 up0Var) {
        return up0Var.EljAMC1QTz;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.GWasM1elztuh + ", horizontalAlignment=" + this.Yi7zF1RB1 + ')';
    }

    @Override // defpackage.bd0
    public final int xqGvceK5x(k30 k30Var, List list, int i) {
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
                int min2 = Math.min(wc0Var.EljAMC1QTz(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, wc0Var.J3Xc8BaqpN8(min2));
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
                i2 = Math.max(i2, wc0Var2.J3Xc8BaqpN8(round != Integer.MAX_VALUE ? Math.round(round * iwATDS1i01k2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }
}
