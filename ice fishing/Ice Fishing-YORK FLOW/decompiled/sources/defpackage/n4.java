package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n4 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
    public final /* synthetic */ defpackage.o4 WDYagTQQm9ns;

    public n4(defpackage.o4 o4Var) {
        this.WDYagTQQm9ns = o4Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.WDYagTQQm9ns.P05cfTpS5W5L.removeCallbacks(this);
        defpackage.o4.IBvW5fLsPuHy(this.WDYagTQQm9ns);
        defpackage.o4 o4Var = this.WDYagTQQm9ns;
        synchronized (o4Var.e6mdH7fiFuta) {
            if (o4Var.gUjdnLbkVAaA) {
                o4Var.gUjdnLbkVAaA = false;
                java.util.ArrayList arrayList = o4Var.Ns0WNyEWdPsk;
                o4Var.Ns0WNyEWdPsk = o4Var.fNwYGHIYeJcR;
                o4Var.fNwYGHIYeJcR = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((android.view.Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.o4.IBvW5fLsPuHy(this.WDYagTQQm9ns);
        defpackage.o4 o4Var = this.WDYagTQQm9ns;
        synchronized (o4Var.e6mdH7fiFuta) {
            if (o4Var.Ns0WNyEWdPsk.isEmpty()) {
                o4Var.QiMR8OkAhezm.removeFrameCallback(this);
                o4Var.gUjdnLbkVAaA = false;
            }
        }
    }
}
