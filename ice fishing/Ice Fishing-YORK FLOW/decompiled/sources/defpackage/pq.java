package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pq extends defpackage.r81 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Ns0WNyEWdPsk = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.pq.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.r81, defpackage.jb0
    public final void VFeft99leXEK(java.lang.Object obj) {
        oCu53ZX2v4Ju(obj);
    }

    @Override // defpackage.r81, defpackage.jb0
    public final void oCu53ZX2v4Ju(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = Ns0WNyEWdPsk;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    defpackage.ma0.jjTN4uUnoyEn(defpackage.q70.OcTWLQzke1i2(this.GE9mJIPrb8gP), defpackage.h0.GoIRkIe1iwj6(obj));
                    return;
                } else {
                    defpackage.h7.P05cfTpS5W5L("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
