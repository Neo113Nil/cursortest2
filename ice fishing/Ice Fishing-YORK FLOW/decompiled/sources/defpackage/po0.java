package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class po0 {
    public final java.util.concurrent.atomic.AtomicReference ZpBGe2uQfcn8 = new java.util.concurrent.atomic.AtomicReference(null);
    public final defpackage.to0 giKS3J6vZuNy = new defpackage.to0();

    public static final void ZpBGe2uQfcn8(defpackage.po0 po0Var, defpackage.mo0 mo0Var) {
        java.util.concurrent.atomic.AtomicReference atomicReference = po0Var.ZpBGe2uQfcn8;
        while (true) {
            defpackage.mo0 mo0Var2 = (defpackage.mo0) atomicReference.get();
            if (mo0Var2 != null && mo0Var.ZpBGe2uQfcn8.compareTo(mo0Var2.ZpBGe2uQfcn8) < 0) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mo0Var2, mo0Var)) {
                if (atomicReference.get() != mo0Var2) {
                    break;
                }
            }
            if (mo0Var2 != null) {
                mo0Var2.giKS3J6vZuNy.JhCgjQRTAOCT(new defpackage.kx("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
