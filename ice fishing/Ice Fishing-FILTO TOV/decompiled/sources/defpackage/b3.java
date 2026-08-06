package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b3 implements bd0 {
    public final g3 GWasM1elztuh;
    public boolean Yi7zF1RB1;

    public b3(g3 g3Var) {
        this.GWasM1elztuh = g3Var;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            up0 OOA6hdeuvCS = ((wc0) list.get(i3)).OOA6hdeuvCS(j);
            i = Math.max(i, OOA6hdeuvCS.OOA6hdeuvCS);
            i2 = Math.max(i2, OOA6hdeuvCS.EljAMC1QTz);
            arrayList.add(OOA6hdeuvCS);
        }
        boolean XnEVoBF0td1l = dd0Var.XnEVoBF0td1l();
        g3 g3Var = this.GWasM1elztuh;
        if (XnEVoBF0td1l) {
            this.Yi7zF1RB1 = true;
            g3Var.GWasM1elztuh.setValue(new b30((i2 & 4294967295L) | (i << 32)));
        } else if (!this.Yi7zF1RB1) {
            g3Var.GWasM1elztuh.setValue(new b30((i2 & 4294967295L) | (i << 32)));
        }
        return dd0Var.MjxSquD6Av(i, i2, yp.OOA6hdeuvCS, new d0(1, arrayList));
    }

    @Override // defpackage.bd0
    public final int JFJ3QoxA(k30 k30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int dqB83aoLBB = ((wc0) list.get(0)).dqB83aoLBB(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int dqB83aoLBB2 = ((wc0) list.get(i2)).dqB83aoLBB(i);
                if (dqB83aoLBB2 > dqB83aoLBB) {
                    dqB83aoLBB = dqB83aoLBB2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return dqB83aoLBB;
    }

    @Override // defpackage.bd0
    public final int Yi7zF1RB1(k30 k30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int EljAMC1QTz = ((wc0) list.get(0)).EljAMC1QTz(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int EljAMC1QTz2 = ((wc0) list.get(i2)).EljAMC1QTz(i);
                if (EljAMC1QTz2 > EljAMC1QTz) {
                    EljAMC1QTz = EljAMC1QTz2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return EljAMC1QTz;
    }

    @Override // defpackage.bd0
    public final int encWxUiV2(k30 k30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int Uxq83abb04 = ((wc0) list.get(0)).Uxq83abb04(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int Uxq83abb042 = ((wc0) list.get(i2)).Uxq83abb04(i);
                if (Uxq83abb042 > Uxq83abb04) {
                    Uxq83abb04 = Uxq83abb042;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return Uxq83abb04;
    }

    @Override // defpackage.bd0
    public final int xqGvceK5x(k30 k30Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int J3Xc8BaqpN8 = ((wc0) list.get(0)).J3Xc8BaqpN8(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int J3Xc8BaqpN82 = ((wc0) list.get(i2)).J3Xc8BaqpN8(i);
                if (J3Xc8BaqpN82 > J3Xc8BaqpN8) {
                    J3Xc8BaqpN8 = J3Xc8BaqpN82;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return J3Xc8BaqpN8;
    }
}
