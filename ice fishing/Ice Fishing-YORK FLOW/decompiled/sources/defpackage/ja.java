package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ja extends defpackage.WmetiUbpKU9I {
    public final java.lang.Thread GE9mJIPrb8gP;
    public final defpackage.vv Ns0WNyEWdPsk;

    public ja(defpackage.jm jmVar, java.lang.Thread thread, defpackage.vv vvVar) {
        super(jmVar, true);
        this.GE9mJIPrb8gP = thread;
        this.Ns0WNyEWdPsk = vvVar;
    }

    @Override // defpackage.jb0
    public final void VFeft99leXEK(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.GE9mJIPrb8gP;
        if (defpackage.ma0.QiMR8OkAhezm(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
