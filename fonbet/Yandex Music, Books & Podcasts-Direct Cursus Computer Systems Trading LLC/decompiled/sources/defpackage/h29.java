package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class h29 extends er2 {
    public final WeakReference i;

    public h29(gc8 gc8Var) {
        gc8Var.getLogId();
        this.i = new WeakReference(gc8Var);
    }

    @Override // defpackage.n7w
    public void U(Throwable th) {
        gc8 gc8Var;
        if (th == null || (gc8Var = (gc8) this.i.get()) == null) {
            return;
        }
        gc8Var.I(th);
    }
}
