package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o4 extends defpackage.lm {
    public static final defpackage.ti1 WmetiUbpKU9I = new defpackage.ti1(defpackage.i0.XntWc4eZSQ8j);
    public static final defpackage.m4 s0TASMVLSWD5 = new defpackage.m4();
    public final android.os.Handler P05cfTpS5W5L;
    public final android.view.Choreographer QiMR8OkAhezm;
    public final defpackage.q4 XntWc4eZSQ8j;
    public boolean gUjdnLbkVAaA;
    public boolean h3m55N1URyyK;
    public final java.lang.Object e6mdH7fiFuta = new java.lang.Object();
    public final defpackage.p7 GE9mJIPrb8gP = new defpackage.p7();
    public java.util.ArrayList Ns0WNyEWdPsk = new java.util.ArrayList();
    public java.util.ArrayList fNwYGHIYeJcR = new java.util.ArrayList();
    public final defpackage.n4 T1fB7bDYiVJQ = new defpackage.n4(this);

    public o4(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.QiMR8OkAhezm = choreographer;
        this.P05cfTpS5W5L = handler;
        this.XntWc4eZSQ8j = new defpackage.q4(choreographer, this);
    }

    public static final void IBvW5fLsPuHy(defpackage.o4 o4Var) {
        java.lang.Runnable runnable;
        boolean z;
        do {
            synchronized (o4Var.e6mdH7fiFuta) {
                defpackage.p7 p7Var = o4Var.GE9mJIPrb8gP;
                runnable = (java.lang.Runnable) (p7Var.isEmpty() ? null : p7Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (o4Var.e6mdH7fiFuta) {
                    defpackage.p7 p7Var2 = o4Var.GE9mJIPrb8gP;
                    runnable = (java.lang.Runnable) (p7Var2.isEmpty() ? null : p7Var2.removeFirst());
                }
            }
            synchronized (o4Var.e6mdH7fiFuta) {
                if (o4Var.GE9mJIPrb8gP.isEmpty()) {
                    z = false;
                    o4Var.h3m55N1URyyK = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.lm
    public final void jjTN4uUnoyEn(defpackage.jm jmVar, java.lang.Runnable runnable) {
        synchronized (this.e6mdH7fiFuta) {
            this.GE9mJIPrb8gP.addLast(runnable);
            if (!this.h3m55N1URyyK) {
                this.h3m55N1URyyK = true;
                this.P05cfTpS5W5L.post(this.T1fB7bDYiVJQ);
                if (!this.gUjdnLbkVAaA) {
                    this.gUjdnLbkVAaA = true;
                    this.QiMR8OkAhezm.postFrameCallback(this.T1fB7bDYiVJQ);
                }
            }
        }
    }
}
