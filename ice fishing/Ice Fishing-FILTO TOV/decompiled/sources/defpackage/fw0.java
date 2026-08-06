package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fw0 implements vg, rh {
    public static final AtomicReferenceFieldUpdater EljAMC1QTz = AtomicReferenceFieldUpdater.newUpdater(fw0.class, Object.class, "result");
    public final vg OOA6hdeuvCS;
    private volatile Object result;

    public fw0(vg vgVar) {
        qh qhVar = qh.OOA6hdeuvCS;
        this.OOA6hdeuvCS = vgVar;
        this.result = qhVar;
    }

    @Override // defpackage.vg
    public final void AvO7iQsrTN(Object obj) {
        while (true) {
            Object obj2 = this.result;
            qh qhVar = qh.EljAMC1QTz;
            if (obj2 == qhVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = EljAMC1QTz;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, qhVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != qhVar) {
                        break;
                    }
                }
                return;
            }
            qh qhVar2 = qh.OOA6hdeuvCS;
            if (obj2 != qhVar2) {
                o4.jivtDDk9H("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = EljAMC1QTz;
            qh qhVar3 = qh.AvO7iQsrTN;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, qhVar2, qhVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != qhVar2) {
                    break;
                }
            }
            this.OOA6hdeuvCS.AvO7iQsrTN(obj);
            return;
        }
    }

    @Override // defpackage.vg
    public final gh OOA6hdeuvCS() {
        return this.OOA6hdeuvCS.OOA6hdeuvCS();
    }

    public final String toString() {
        return "SafeContinuation for " + this.OOA6hdeuvCS;
    }

    @Override // defpackage.rh
    public final rh xqGvceK5x() {
        vg vgVar = this.OOA6hdeuvCS;
        if (vgVar instanceof rh) {
            return (rh) vgVar;
        }
        return null;
    }
}
