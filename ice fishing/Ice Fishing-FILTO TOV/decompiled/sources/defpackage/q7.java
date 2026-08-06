package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q7 implements bd0 {
    public final r6 GWasM1elztuh;
    public final boolean Yi7zF1RB1;

    public q7(r6 r6Var, boolean z) {
        this.GWasM1elztuh = r6Var;
        this.Yi7zF1RB1 = z;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(final dd0 dd0Var, final List list, long j) {
        boolean isEmpty = list.isEmpty();
        yp ypVar = yp.OOA6hdeuvCS;
        if (isEmpty) {
            return dd0Var.MjxSquD6Av(eg.JFJ3QoxA(j), eg.mOu10nynGul(j), ypVar, new bCsSzSHkbaQ(10));
        }
        long j2 = this.Yi7zF1RB1 ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final wc0 wc0Var = (wc0) list.get(0);
            wc0Var.encWxUiV2();
            final up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j2);
            final int max = Math.max(eg.JFJ3QoxA(j), OOA6hdeuvCS.OOA6hdeuvCS);
            final int max2 = Math.max(eg.mOu10nynGul(j), OOA6hdeuvCS.EljAMC1QTz);
            return dd0Var.MjxSquD6Av(max, max2, ypVar, new hv() { // from class: o7
                @Override // defpackage.hv
                public final Object mOu10nynGul(Object obj) {
                    n7.Yi7zF1RB1((tp0) obj, up0.this, wc0Var, dd0Var.getLayoutDirection(), max, max2, this.GWasM1elztuh);
                    return kc1.GWasM1elztuh;
                }
            });
        }
        final up0[] up0VarArr = new up0[list.size()];
        final pt0 pt0Var = new pt0();
        pt0Var.OOA6hdeuvCS = eg.JFJ3QoxA(j);
        final pt0 pt0Var2 = new pt0();
        pt0Var2.OOA6hdeuvCS = eg.mOu10nynGul(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wc0 wc0Var2 = (wc0) list.get(i);
            wc0Var2.encWxUiV2();
            up0 OOA6hdeuvCS2 = wc0Var2.OOA6hdeuvCS(j2);
            up0VarArr[i] = OOA6hdeuvCS2;
            pt0Var.OOA6hdeuvCS = Math.max(pt0Var.OOA6hdeuvCS, OOA6hdeuvCS2.OOA6hdeuvCS);
            pt0Var2.OOA6hdeuvCS = Math.max(pt0Var2.OOA6hdeuvCS, OOA6hdeuvCS2.EljAMC1QTz);
        }
        return dd0Var.MjxSquD6Av(pt0Var.OOA6hdeuvCS, pt0Var2.OOA6hdeuvCS, ypVar, new hv() { // from class: p7
            @Override // defpackage.hv
            public final Object mOu10nynGul(Object obj) {
                tp0 tp0Var = (tp0) obj;
                up0[] up0VarArr2 = up0VarArr;
                int length = up0VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    up0 up0Var = up0VarArr2[i3];
                    up0Var.getClass();
                    n7.Yi7zF1RB1(tp0Var, up0Var, (wc0) list.get(i4), dd0Var.getLayoutDirection(), pt0Var.OOA6hdeuvCS, pt0Var2.OOA6hdeuvCS, this.GWasM1elztuh);
                    i3++;
                    i2 = i4 + 1;
                }
                return kc1.GWasM1elztuh;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return this.GWasM1elztuh.equals(q7Var.GWasM1elztuh) && this.Yi7zF1RB1 == q7Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Yi7zF1RB1) + (this.GWasM1elztuh.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.GWasM1elztuh + ", propagateMinConstraints=" + this.Yi7zF1RB1 + ')';
    }
}
