package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rc1 implements z60, Serializable {
    public Object EljAMC1QTz;
    public wu OOA6hdeuvCS;

    @Override // defpackage.z60
    public final Object getValue() {
        if (this.EljAMC1QTz == k61.encWxUiV2) {
            wu wuVar = this.OOA6hdeuvCS;
            wuVar.getClass();
            this.EljAMC1QTz = wuVar.GWasM1elztuh();
            this.OOA6hdeuvCS = null;
        }
        return this.EljAMC1QTz;
    }

    public final String toString() {
        return this.EljAMC1QTz != k61.encWxUiV2 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
