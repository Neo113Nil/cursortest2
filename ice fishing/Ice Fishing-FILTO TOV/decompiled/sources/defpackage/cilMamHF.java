package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cilMamHF extends lv06NcmrQ implements RandomAccess {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final lv06NcmrQ OOA6hdeuvCS;

    public cilMamHF(lv06NcmrQ lv06ncmrq, int i, int i2) {
        this.OOA6hdeuvCS = lv06ncmrq;
        this.EljAMC1QTz = i;
        qj.rQPn8YBR(i, i2, lv06ncmrq.GWasM1elztuh());
        this.AvO7iQsrTN = i2 - i;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.AvO7iQsrTN;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.AvO7iQsrTN;
        if (i < 0 || i >= i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return null;
        }
        return this.OOA6hdeuvCS.get(this.EljAMC1QTz + i);
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final List subList(int i, int i2) {
        qj.rQPn8YBR(i, i2, this.AvO7iQsrTN);
        int i3 = this.EljAMC1QTz;
        return new cilMamHF(this.OOA6hdeuvCS, i + i3, i3 + i2);
    }
}
