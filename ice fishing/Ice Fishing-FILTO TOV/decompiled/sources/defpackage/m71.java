package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m71 implements z60, Serializable {
    public final Object AvO7iQsrTN;
    public volatile Object EljAMC1QTz;
    public wu OOA6hdeuvCS;

    public m71(wu wuVar) {
        wuVar.getClass();
        this.OOA6hdeuvCS = wuVar;
        this.EljAMC1QTz = k61.encWxUiV2;
        this.AvO7iQsrTN = this;
    }

    @Override // defpackage.z60
    public final Object getValue() {
        Object obj;
        Object obj2 = this.EljAMC1QTz;
        k61 k61Var = k61.encWxUiV2;
        if (obj2 != k61Var) {
            return obj2;
        }
        synchronized (this.AvO7iQsrTN) {
            obj = this.EljAMC1QTz;
            if (obj == k61Var) {
                wu wuVar = this.OOA6hdeuvCS;
                wuVar.getClass();
                obj = wuVar.GWasM1elztuh();
                this.EljAMC1QTz = obj;
                this.OOA6hdeuvCS = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.EljAMC1QTz != k61.encWxUiV2 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
