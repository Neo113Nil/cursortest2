package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n80 {
    public final /* synthetic */ int AvO7iQsrTN;
    public final /* synthetic */ u80 E7jCp8Ls;
    public final /* synthetic */ int EljAMC1QTz;
    public final rf0 GWasM1elztuh;
    public final /* synthetic */ int JFJ3QoxA;
    public final /* synthetic */ s70 OOA6hdeuvCS;
    public final s70 X1lG3V04pd;
    public final k80 Yi7zF1RB1;
    public final /* synthetic */ p6 encWxUiV2;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ long rQPn8YBR;
    public final long xqGvceK5x;

    public n80(long j, k80 k80Var, s70 s70Var, int i, int i2, p6 p6Var, int i3, int i4, long j2, u80 u80Var) {
        this.OOA6hdeuvCS = s70Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
        this.encWxUiV2 = p6Var;
        this.mOu10nynGul = i3;
        this.JFJ3QoxA = i4;
        this.rQPn8YBR = j2;
        this.E7jCp8Ls = u80Var;
        rf0 rf0Var = t20.GWasM1elztuh;
        this.GWasM1elztuh = new rf0();
        this.Yi7zF1RB1 = k80Var;
        this.X1lG3V04pd = s70Var;
        this.xqGvceK5x = fg.Yi7zF1RB1(eg.encWxUiV2(j), Integer.MAX_VALUE, 5);
    }

    public final q80 GWasM1elztuh(int i, long j) {
        long j2;
        List list;
        k80 k80Var = this.Yi7zF1RB1;
        Object xqGvceK5x = k80Var.xqGvceK5x(i);
        k80Var.Yi7zF1RB1(i);
        rf0 rf0Var = this.GWasM1elztuh;
        List list2 = (List) rf0Var.Yi7zF1RB1(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            s70 s70Var = this.X1lG3V04pd;
            k80 k80Var2 = s70Var.AvO7iQsrTN;
            rf0 rf0Var2 = s70Var.encWxUiV2;
            List list3 = (List) rf0Var2.Yi7zF1RB1(i);
            if (list3 == null) {
                Object xqGvceK5x2 = k80Var2.xqGvceK5x(i);
                k80Var2.Yi7zF1RB1(i);
                list3 = s70Var.EljAMC1QTz.EXrPz3p7hFb(s70Var.OOA6hdeuvCS.GWasM1elztuh(i, xqGvceK5x2, null), xqGvceK5x2);
                rf0Var2.encWxUiV2(i, list3);
            }
            int size = list3.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((wc0) list3.get(i2)).OOA6hdeuvCS(j));
            }
            j2 = j;
            rf0Var.encWxUiV2(i, arrayList);
            list = arrayList;
        }
        return new q80(i, list, this.encWxUiV2, this.OOA6hdeuvCS.EljAMC1QTz.getLayoutDirection(), this.mOu10nynGul, this.JFJ3QoxA, i != this.EljAMC1QTz + (-1) ? this.AvO7iQsrTN : 0, this.rQPn8YBR, xqGvceK5x, null, this.E7jCp8Ls.uFEq9NpZ, j2);
    }
}
