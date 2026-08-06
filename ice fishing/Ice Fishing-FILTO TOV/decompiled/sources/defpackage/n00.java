package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n00 extends lv06NcmrQ {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final EXrPz3p7hFb OOA6hdeuvCS;

    public n00(EXrPz3p7hFb eXrPz3p7hFb, int i, int i2) {
        this.OOA6hdeuvCS = eXrPz3p7hFb;
        this.EljAMC1QTz = i;
        z50.encWxUiV2(i, i2, eXrPz3p7hFb.GWasM1elztuh());
        this.AvO7iQsrTN = i2 - i;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.AvO7iQsrTN;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z50.EljAMC1QTz(i, this.AvO7iQsrTN);
        return this.OOA6hdeuvCS.get(this.EljAMC1QTz + i);
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final List subList(int i, int i2) {
        z50.encWxUiV2(i, i2, this.AvO7iQsrTN);
        int i3 = this.EljAMC1QTz;
        return new n00(this.OOA6hdeuvCS, i + i3, i3 + i2);
    }
}
