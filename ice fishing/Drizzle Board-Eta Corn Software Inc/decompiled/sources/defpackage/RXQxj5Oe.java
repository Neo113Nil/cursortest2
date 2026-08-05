package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class RXQxj5Oe extends ra {
    public final AtomicReferenceFieldUpdater DK9slbsy;
    public final AtomicReferenceFieldUpdater FySoLYna;
    public final AtomicReferenceFieldUpdater WYNAV5pd;
    public final AtomicReferenceFieldUpdater gjV1z5T1;
    public final AtomicReferenceFieldUpdater lwWCatUu;

    public RXQxj5Oe(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.FySoLYna = atomicReferenceFieldUpdater;
        this.gjV1z5T1 = atomicReferenceFieldUpdater2;
        this.WYNAV5pd = atomicReferenceFieldUpdater3;
        this.DK9slbsy = atomicReferenceFieldUpdater4;
        this.lwWCatUu = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ra
    public final boolean Qr9iLBAD(WYNAV5pd wYNAV5pd, I5GHvsYW i5GHvsYW) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.DK9slbsy;
            if (atomicReferenceFieldUpdater.compareAndSet(wYNAV5pd, i5GHvsYW, I5GHvsYW.NCTxEWno)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(wYNAV5pd) == i5GHvsYW);
        return false;
    }

    @Override // defpackage.ra
    public final void U0LaHZX7(gjV1z5T1 gjv1z5t1, gjV1z5T1 gjv1z5t12) {
        this.gjV1z5T1.lazySet(gjv1z5t1, gjv1z5t12);
    }

    @Override // defpackage.ra
    public final boolean eVhOlqcC(WYNAV5pd wYNAV5pd, gjV1z5T1 gjv1z5t1, gjV1z5T1 gjv1z5t12) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.WYNAV5pd;
            if (atomicReferenceFieldUpdater.compareAndSet(wYNAV5pd, gjv1z5t1, gjv1z5t12)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(wYNAV5pd) == gjv1z5t1);
        return false;
    }

    @Override // defpackage.ra
    public final void i7xS8jrb(gjV1z5T1 gjv1z5t1, Thread thread) {
        this.FySoLYna.lazySet(gjv1z5t1, thread);
    }

    @Override // defpackage.ra
    public final boolean jb9XjC4I(WYNAV5pd wYNAV5pd, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.lwWCatUu;
            if (atomicReferenceFieldUpdater.compareAndSet(wYNAV5pd, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(wYNAV5pd) == obj);
        return false;
    }
}
