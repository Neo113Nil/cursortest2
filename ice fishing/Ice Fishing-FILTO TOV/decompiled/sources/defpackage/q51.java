package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q51 extends dqB83aoLBB {
    public final AtomicReference GWasM1elztuh = new AtomicReference(null);

    @Override // defpackage.dqB83aoLBB
    public final boolean GWasM1elztuh(TpUsjqg3bxO tpUsjqg3bxO) {
        AtomicReference atomicReference = this.GWasM1elztuh;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(vc0.AvO7iQsrTN);
        return true;
    }

    @Override // defpackage.dqB83aoLBB
    public final vg[] Yi7zF1RB1(TpUsjqg3bxO tpUsjqg3bxO) {
        this.GWasM1elztuh.set(null);
        return p.GWasM1elztuh;
    }
}
