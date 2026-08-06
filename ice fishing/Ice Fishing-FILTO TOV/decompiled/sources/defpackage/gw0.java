package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gw0 implements z60, Serializable {
    public static final AtomicReferenceFieldUpdater AvO7iQsrTN = AtomicReferenceFieldUpdater.newUpdater(gw0.class, Object.class, "EljAMC1QTz");
    public volatile Object EljAMC1QTz;
    public volatile wu OOA6hdeuvCS;

    @Override // defpackage.z60
    public final Object getValue() {
        Object obj = this.EljAMC1QTz;
        k61 k61Var = k61.encWxUiV2;
        if (obj != k61Var) {
            return obj;
        }
        wu wuVar = this.OOA6hdeuvCS;
        if (wuVar != null) {
            Object GWasM1elztuh = wuVar.GWasM1elztuh();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AvO7iQsrTN;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, k61Var, GWasM1elztuh)) {
                if (atomicReferenceFieldUpdater.get(this) != k61Var) {
                }
            }
            this.OOA6hdeuvCS = null;
            return GWasM1elztuh;
        }
        return this.EljAMC1QTz;
    }

    public final String toString() {
        return this.EljAMC1QTz != k61.encWxUiV2 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
