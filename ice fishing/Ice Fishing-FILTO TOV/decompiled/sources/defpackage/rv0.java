package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rv0 extends d60 {
    public static final rv0 X1lG3V04pd = new rv0("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int Yi7zF1RB1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv0(String str, int i) {
        super(str);
        this.Yi7zF1RB1 = i;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        switch (this.Yi7zF1RB1) {
            case 0:
                int size = list.size();
                yp ypVar = yp.OOA6hdeuvCS;
                if (size == 0) {
                    return dd0Var.MjxSquD6Av(eg.JFJ3QoxA(j), eg.mOu10nynGul(j), ypVar, XdwzlWIkSDqF.MZhzXH72);
                }
                if (size == 1) {
                    up0 OOA6hdeuvCS = ((wc0) list.get(0)).OOA6hdeuvCS(j);
                    return dd0Var.MjxSquD6Av(fg.EljAMC1QTz(OOA6hdeuvCS.OOA6hdeuvCS, j), fg.OOA6hdeuvCS(OOA6hdeuvCS.EljAMC1QTz, j), ypVar, new Bg54Cq4f(OOA6hdeuvCS, 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    up0 OOA6hdeuvCS2 = ((wc0) list.get(i3)).OOA6hdeuvCS(j);
                    i = Math.max(OOA6hdeuvCS2.OOA6hdeuvCS, i);
                    i2 = Math.max(OOA6hdeuvCS2.EljAMC1QTz, i2);
                    arrayList.add(OOA6hdeuvCS2);
                }
                return dd0Var.MjxSquD6Av(fg.EljAMC1QTz(i, j), fg.OOA6hdeuvCS(i2, j), ypVar, new d0(2, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
