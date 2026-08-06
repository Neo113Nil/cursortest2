package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vx0 {
    public defpackage.zn0 GE9mJIPrb8gP;
    public final defpackage.c20 JhCgjQRTAOCT;
    public final defpackage.i41 Ns0WNyEWdPsk;
    public final java.lang.Object QiMR8OkAhezm;
    public final boolean WDYagTQQm9ns;
    public final defpackage.lj ZpBGe2uQfcn8;
    public final defpackage.n31 fNwYGHIYeJcR;
    public final defpackage.e30 fWTAfUmVKrZq;
    public final defpackage.gj giKS3J6vZuNy;
    public final defpackage.bs1 oh71FJcDz6S2;
    public final java.util.concurrent.atomic.AtomicReference P05cfTpS5W5L = new java.util.concurrent.atomic.AtomicReference(defpackage.xx0.QiMR8OkAhezm);
    public long e6mdH7fiFuta = defpackage.w60.gUjdnLbkVAaA();

    public vx0(defpackage.lj ljVar, defpackage.gj gjVar, defpackage.e30 e30Var, defpackage.bo0 bo0Var, defpackage.c20 c20Var, boolean z, defpackage.bs1 bs1Var, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = ljVar;
        this.giKS3J6vZuNy = gjVar;
        this.fWTAfUmVKrZq = e30Var;
        this.JhCgjQRTAOCT = c20Var;
        this.WDYagTQQm9ns = z;
        this.oh71FJcDz6S2 = bs1Var;
        this.QiMR8OkAhezm = obj;
        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
        zn0Var.getClass();
        this.GE9mJIPrb8gP = zn0Var;
        defpackage.i41 i41Var = new defpackage.i41();
        i41Var.QiMR8OkAhezm(bo0Var, e30Var.dG7RjM6DqYVL());
        this.Ns0WNyEWdPsk = i41Var;
        this.fNwYGHIYeJcR = new defpackage.n31(bs1Var.QiMR8OkAhezm);
    }

    public final void JhCgjQRTAOCT() {
        defpackage.xx0 xx0Var;
        defpackage.xx0 xx0Var2;
        boolean z;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.P05cfTpS5W5L;
            xx0Var = defpackage.xx0.P05cfTpS5W5L;
            xx0Var2 = defpackage.xx0.GE9mJIPrb8gP;
            if (atomicReference.compareAndSet(xx0Var, xx0Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != xx0Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        defpackage.g11.giKS3J6vZuNy("Unexpected state change from: " + xx0Var + " to: " + xx0Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean WDYagTQQm9ns(defpackage.td1 td1Var) {
        defpackage.xx0 xx0Var = defpackage.xx0.e6mdH7fiFuta;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.P05cfTpS5W5L;
        try {
            int ordinal = ((defpackage.xx0) atomicReference.get()).ordinal();
            defpackage.xx0 xx0Var2 = defpackage.xx0.P05cfTpS5W5L;
            defpackage.lj ljVar = this.ZpBGe2uQfcn8;
            defpackage.gj gjVar = this.giKS3J6vZuNy;
            switch (ordinal) {
                case 0:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case 2:
                    defpackage.e30 e30Var = this.fWTAfUmVKrZq;
                    boolean z = this.WDYagTQQm9ns;
                    if (z) {
                        e30Var.dG7RjM6DqYVL = 0;
                        e30Var.oCu53ZX2v4Ju = true;
                    }
                    try {
                        this.GE9mJIPrb8gP = gjVar.giKS3J6vZuNy(ljVar, td1Var, this.JhCgjQRTAOCT);
                        defpackage.xx0 xx0Var3 = defpackage.xx0.QiMR8OkAhezm;
                        while (true) {
                            if (!atomicReference.compareAndSet(xx0Var3, xx0Var2)) {
                                if (atomicReference.get() != xx0Var3) {
                                    defpackage.g11.giKS3J6vZuNy("Unexpected state change from: " + xx0Var3 + " to: " + xx0Var2 + '.');
                                }
                            }
                        }
                        if (this.GE9mJIPrb8gP.QiMR8OkAhezm()) {
                            JhCgjQRTAOCT();
                        }
                        return fWTAfUmVKrZq();
                    } finally {
                        if (z) {
                            e30Var.BHfvd2J71qpO();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(xx0Var2, xx0Var)) {
                            if (atomicReference.get() != xx0Var2) {
                                defpackage.g11.giKS3J6vZuNy("Unexpected state change from: " + xx0Var2 + " to: " + xx0Var + '.');
                            }
                        }
                    }
                    long j = this.e6mdH7fiFuta;
                    try {
                        this.e6mdH7fiFuta = defpackage.w60.gUjdnLbkVAaA();
                        this.GE9mJIPrb8gP = gjVar.gUjdnLbkVAaA(ljVar, td1Var, this.GE9mJIPrb8gP);
                        this.e6mdH7fiFuta = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(xx0Var, xx0Var2)) {
                                if (atomicReference.get() != xx0Var) {
                                    defpackage.g11.giKS3J6vZuNy("Unexpected state change from: " + xx0Var + " to: " + xx0Var2 + '.');
                                }
                            }
                        }
                        if (this.GE9mJIPrb8gP.QiMR8OkAhezm()) {
                            JhCgjQRTAOCT();
                        }
                        return fWTAfUmVKrZq();
                    } catch (java.lang.Throwable th) {
                        this.e6mdH7fiFuta = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(xx0Var, xx0Var2)) {
                                if (atomicReference.get() != xx0Var) {
                                    defpackage.g11.giKS3J6vZuNy("Unexpected state change from: " + xx0Var + " to: " + xx0Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    defpackage.ej.giKS3J6vZuNy("Recursive call to resume()");
                    throw new defpackage.vg();
                case 5:
                    throw new java.lang.IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new java.lang.IllegalStateException("The paused composition has been applied");
                default:
                    throw new defpackage.vg();
            }
        } catch (java.lang.Exception e) {
            atomicReference.set(defpackage.xx0.WDYagTQQm9ns);
            throw e;
        }
    }

    public final void ZpBGe2uQfcn8() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.P05cfTpS5W5L;
        try {
            switch (((defpackage.xx0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new java.lang.IllegalStateException("The paused composition has not completed yet");
                case 5:
                    giKS3J6vZuNy();
                    defpackage.xx0 xx0Var = defpackage.xx0.GE9mJIPrb8gP;
                    defpackage.xx0 xx0Var2 = defpackage.xx0.Ns0WNyEWdPsk;
                    while (!atomicReference.compareAndSet(xx0Var, xx0Var2)) {
                        if (atomicReference.get() != xx0Var) {
                            defpackage.g11.giKS3J6vZuNy("Unexpected state change from: " + xx0Var + " to: " + xx0Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new java.lang.IllegalStateException("The paused composition has already been applied");
                default:
                    throw new defpackage.vg();
            }
        } catch (java.lang.Exception e) {
            atomicReference.set(defpackage.xx0.WDYagTQQm9ns);
            throw e;
        }
    }

    public final boolean fWTAfUmVKrZq() {
        return ((defpackage.xx0) this.P05cfTpS5W5L.get()).compareTo(defpackage.xx0.GE9mJIPrb8gP) >= 0;
    }

    public final void giKS3J6vZuNy() {
        android.os.Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.QiMR8OkAhezm) {
                try {
                    this.fNwYGHIYeJcR.ZpBGe2uQfcn8(this.oh71FJcDz6S2, this.Ns0WNyEWdPsk);
                    this.Ns0WNyEWdPsk.fWTAfUmVKrZq();
                    this.Ns0WNyEWdPsk.JhCgjQRTAOCT();
                } finally {
                    this.Ns0WNyEWdPsk.giKS3J6vZuNy();
                    this.ZpBGe2uQfcn8.w7APNrr0aGRc = null;
                }
            }
        } finally {
            android.os.Trace.endSection();
        }
    }
}
