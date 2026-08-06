package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class A1EKNP6CxJ extends n30 {
    public final AtomicReferenceFieldUpdater Mjvvu5DE;
    public final AtomicReferenceFieldUpdater WIEu4Ya2g8;
    public final AtomicReferenceFieldUpdater YmKjaVtbfp5Z;
    public final AtomicReferenceFieldUpdater jivtDDk9H;
    public final AtomicReferenceFieldUpdater mE4lRynR;

    public A1EKNP6CxJ(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.WIEu4Ya2g8 = atomicReferenceFieldUpdater;
        this.YmKjaVtbfp5Z = atomicReferenceFieldUpdater2;
        this.Mjvvu5DE = atomicReferenceFieldUpdater3;
        this.mE4lRynR = atomicReferenceFieldUpdater4;
        this.jivtDDk9H = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.n30
    public final void TpUsjqg3bxO(DmJncFq5 dmJncFq5, Thread thread) {
        this.WIEu4Ya2g8.lazySet(dmJncFq5, thread);
    }

    @Override // defpackage.n30
    public final boolean XnEVoBF0td1l(HFYAaqMd6 hFYAaqMd6, eUH21U3apd euh21u3apd) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.mE4lRynR;
            if (atomicReferenceFieldUpdater.compareAndSet(hFYAaqMd6, euh21u3apd, eUH21U3apd.Yi7zF1RB1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hFYAaqMd6) == euh21u3apd);
        return false;
    }

    @Override // defpackage.n30
    public final boolean iwATDS1i01k(HFYAaqMd6 hFYAaqMd6, DmJncFq5 dmJncFq5, DmJncFq5 dmJncFq52) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.Mjvvu5DE;
            if (atomicReferenceFieldUpdater.compareAndSet(hFYAaqMd6, dmJncFq5, dmJncFq52)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hFYAaqMd6) == dmJncFq5);
        return false;
    }

    @Override // defpackage.n30
    public final void rezfBrjOrqK(DmJncFq5 dmJncFq5, DmJncFq5 dmJncFq52) {
        this.YmKjaVtbfp5Z.lazySet(dmJncFq5, dmJncFq52);
    }

    @Override // defpackage.n30
    public final boolean uFEq9NpZ(HFYAaqMd6 hFYAaqMd6, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.jivtDDk9H;
            if (atomicReferenceFieldUpdater.compareAndSet(hFYAaqMd6, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hFYAaqMd6) == obj);
        return false;
    }
}
