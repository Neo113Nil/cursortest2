package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class Mearx7yMn90V extends defpackage.jr0 {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater T1fB7bDYiVJQ;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater WmetiUbpKU9I;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater XntWc4eZSQ8j;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater gUjdnLbkVAaA;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h3m55N1URyyK;

    public Mearx7yMn90V(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.h3m55N1URyyK = atomicReferenceFieldUpdater;
        this.gUjdnLbkVAaA = atomicReferenceFieldUpdater2;
        this.T1fB7bDYiVJQ = atomicReferenceFieldUpdater3;
        this.XntWc4eZSQ8j = atomicReferenceFieldUpdater4;
        this.WmetiUbpKU9I = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.jr0
    public final boolean T1fB7bDYiVJQ(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy, defpackage.KrtOTfE6jiS2 krtOTfE6jiS2, defpackage.KrtOTfE6jiS2 krtOTfE6jiS22) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.T1fB7bDYiVJQ;
            if (atomicReferenceFieldUpdater.compareAndSet(iBvW5fLsPuHy, krtOTfE6jiS2, krtOTfE6jiS22)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iBvW5fLsPuHy) == krtOTfE6jiS2);
        return false;
    }

    @Override // defpackage.jr0
    public final boolean gUjdnLbkVAaA(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.WmetiUbpKU9I;
            if (atomicReferenceFieldUpdater.compareAndSet(iBvW5fLsPuHy, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iBvW5fLsPuHy) == obj);
        return false;
    }

    @Override // defpackage.jr0
    public final boolean h3m55N1URyyK(defpackage.IBvW5fLsPuHy iBvW5fLsPuHy, defpackage.jjTN4uUnoyEn jjtn4uunoyen) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.XntWc4eZSQ8j;
            if (atomicReferenceFieldUpdater.compareAndSet(iBvW5fLsPuHy, jjtn4uunoyen, defpackage.jjTN4uUnoyEn.giKS3J6vZuNy)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iBvW5fLsPuHy) == jjtn4uunoyen);
        return false;
    }

    @Override // defpackage.jr0
    public final void w6IV1lieBIux(defpackage.KrtOTfE6jiS2 krtOTfE6jiS2, defpackage.KrtOTfE6jiS2 krtOTfE6jiS22) {
        this.gUjdnLbkVAaA.lazySet(krtOTfE6jiS2, krtOTfE6jiS22);
    }

    @Override // defpackage.jr0
    public final void zJPqDeoF0Os1(defpackage.KrtOTfE6jiS2 krtOTfE6jiS2, java.lang.Thread thread) {
        this.h3m55N1URyyK.lazySet(krtOTfE6jiS2, thread);
    }
}
