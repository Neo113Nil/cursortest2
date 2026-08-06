package defpackage;

/* loaded from: classes.dex */
public final class i8 extends defpackage.kd6TUFXn {
    public final java.lang.Thread SH1y5HwkJhh;
    public final defpackage.hu ez2rX8ReCYw;

    public i8(defpackage.lj ljVar, java.lang.Thread thread, defpackage.hu huVar) {
        super(ljVar, true);
        this.SH1y5HwkJhh = thread;
        this.ez2rX8ReCYw = huVar;
    }

    @Override // defpackage.c90
    public final void NHJTzaLwkd(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.SH1y5HwkJhh;
        if (defpackage.x70.QoRHpC4k(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
