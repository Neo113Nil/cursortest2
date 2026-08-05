package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y90 extends lwWCatUu {
    public final AtomicReference qoPGr6Ce = new AtomicReference(null);

    @Override // defpackage.lwWCatUu
    public final g9[] NCTxEWno(DK9slbsy dK9slbsy) {
        this.qoPGr6Ce.set(null);
        return ra.qoPGr6Ce;
    }

    @Override // defpackage.lwWCatUu
    public final boolean qoPGr6Ce(DK9slbsy dK9slbsy) {
        AtomicReference atomicReference = this.qoPGr6Ce;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ra.ow5vqvCr);
        return true;
    }
}
