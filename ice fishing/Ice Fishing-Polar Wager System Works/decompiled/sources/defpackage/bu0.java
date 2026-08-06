package defpackage;

/* loaded from: classes.dex */
public final class bu0 {
    public final java.lang.Object AARZUJiTa;
    public final defpackage.k00 F7NU4MC0GW;
    public final defpackage.kh IHQe1A4L2xu;
    public final defpackage.hz0 JlrlGoKF;
    public defpackage.ol0 SH1y5HwkJhh;
    public final boolean adDC3e2L;
    public final defpackage.v01 ez2rX8ReCYw;
    public final defpackage.fh oh6vYeIP;
    public final defpackage.t10 r1MBDhnF;
    public final defpackage.gk1 xiZrDbcSW0;
    public final java.util.concurrent.atomic.AtomicReference EXtogiMhuM = new java.util.concurrent.atomic.AtomicReference(defpackage.du0.AARZUJiTa);
    public long riuEU0zW4 = defpackage.j70.DFo87pBq1E5();

    public bu0(defpackage.kh khVar, defpackage.fh fhVar, defpackage.t10 t10Var, defpackage.ql0 ql0Var, defpackage.k00 k00Var, boolean z, defpackage.gk1 gk1Var, java.lang.Object obj) {
        this.IHQe1A4L2xu = khVar;
        this.oh6vYeIP = fhVar;
        this.r1MBDhnF = t10Var;
        this.F7NU4MC0GW = k00Var;
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = gk1Var;
        this.AARZUJiTa = obj;
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        ol0Var.getClass();
        this.SH1y5HwkJhh = ol0Var;
        defpackage.v01 v01Var = new defpackage.v01();
        v01Var.AARZUJiTa(ql0Var, t10Var.QQUzIjv3iOC5());
        this.ez2rX8ReCYw = v01Var;
        this.JlrlGoKF = new defpackage.hz0(gk1Var.AARZUJiTa);
    }

    public final void F7NU4MC0GW() {
        defpackage.du0 du0Var;
        defpackage.du0 du0Var2;
        boolean z;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.EXtogiMhuM;
            du0Var = defpackage.du0.EXtogiMhuM;
            du0Var2 = defpackage.du0.SH1y5HwkJhh;
            if (atomicReference.compareAndSet(du0Var, du0Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != du0Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        defpackage.nw0.oh6vYeIP("Unexpected state change from: " + du0Var + " to: " + du0Var2 + '.');
    }

    public final void IHQe1A4L2xu() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.EXtogiMhuM;
        try {
            switch (((defpackage.du0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    throw new java.lang.IllegalStateException("The paused composition has not completed yet");
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    oh6vYeIP();
                    defpackage.du0 du0Var = defpackage.du0.SH1y5HwkJhh;
                    defpackage.du0 du0Var2 = defpackage.du0.ez2rX8ReCYw;
                    while (!atomicReference.compareAndSet(du0Var, du0Var2)) {
                        if (atomicReference.get() != du0Var) {
                            defpackage.nw0.oh6vYeIP("Unexpected state change from: " + du0Var + " to: " + du0Var2 + '.');
                            return;
                        }
                    }
                    return;
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new java.lang.IllegalStateException("The paused composition has already been applied");
                default:
                    throw new defpackage.cf();
            }
        } catch (java.lang.Exception e) {
            atomicReference.set(defpackage.du0.adDC3e2L);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean adDC3e2L(defpackage.r91 r91Var) {
        defpackage.du0 du0Var = defpackage.du0.riuEU0zW4;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.EXtogiMhuM;
        try {
            int ordinal = ((defpackage.du0) atomicReference.get()).ordinal();
            defpackage.du0 du0Var2 = defpackage.du0.EXtogiMhuM;
            defpackage.kh khVar = this.IHQe1A4L2xu;
            defpackage.fh fhVar = this.oh6vYeIP;
            switch (ordinal) {
                case 0:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                    defpackage.t10 t10Var = this.r1MBDhnF;
                    boolean z = this.adDC3e2L;
                    if (z) {
                        t10Var.QQUzIjv3iOC5 = 0;
                        t10Var.NHJTzaLwkd = true;
                    }
                    try {
                        this.SH1y5HwkJhh = fhVar.oh6vYeIP(khVar, r91Var, this.F7NU4MC0GW);
                        defpackage.du0 du0Var3 = defpackage.du0.AARZUJiTa;
                        while (true) {
                            if (!atomicReference.compareAndSet(du0Var3, du0Var2)) {
                                if (atomicReference.get() != du0Var3) {
                                    defpackage.nw0.oh6vYeIP("Unexpected state change from: " + du0Var3 + " to: " + du0Var2 + '.');
                                }
                            }
                        }
                        if (this.SH1y5HwkJhh.AARZUJiTa()) {
                            F7NU4MC0GW();
                        }
                        return r1MBDhnF();
                    } finally {
                        if (z) {
                            t10Var.EgCjBq0SZwJ();
                        }
                    }
                case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                    while (true) {
                        if (!atomicReference.compareAndSet(du0Var2, du0Var)) {
                            if (atomicReference.get() != du0Var2) {
                                defpackage.nw0.oh6vYeIP("Unexpected state change from: " + du0Var2 + " to: " + du0Var + '.');
                            }
                        }
                    }
                    long j = this.riuEU0zW4;
                    try {
                        this.riuEU0zW4 = defpackage.j70.DFo87pBq1E5();
                        this.SH1y5HwkJhh = fhVar.SyNS6RMn(khVar, r91Var, this.SH1y5HwkJhh);
                        this.riuEU0zW4 = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(du0Var, du0Var2)) {
                                if (atomicReference.get() != du0Var) {
                                    defpackage.nw0.oh6vYeIP("Unexpected state change from: " + du0Var + " to: " + du0Var2 + '.');
                                }
                            }
                        }
                        if (this.SH1y5HwkJhh.AARZUJiTa()) {
                            F7NU4MC0GW();
                        }
                        return r1MBDhnF();
                    } catch (java.lang.Throwable th) {
                        this.riuEU0zW4 = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(du0Var, du0Var2)) {
                                if (atomicReference.get() != du0Var) {
                                    defpackage.nw0.oh6vYeIP("Unexpected state change from: " + du0Var + " to: " + du0Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                    defpackage.dh.oh6vYeIP("Recursive call to resume()");
                    throw new defpackage.cf();
                case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                    throw new java.lang.IllegalStateException("Pausable composition is complete and apply() should be applied");
                case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new java.lang.IllegalStateException("The paused composition has been applied");
                default:
                    throw new defpackage.cf();
            }
        } catch (java.lang.Exception e) {
            atomicReference.set(defpackage.du0.adDC3e2L);
            throw e;
        }
    }

    public final void oh6vYeIP() {
        android.os.Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.AARZUJiTa) {
                try {
                    this.JlrlGoKF.IHQe1A4L2xu(this.xiZrDbcSW0, this.ez2rX8ReCYw);
                    this.ez2rX8ReCYw.r1MBDhnF();
                    this.ez2rX8ReCYw.F7NU4MC0GW();
                } finally {
                    this.ez2rX8ReCYw.oh6vYeIP();
                    this.IHQe1A4L2xu.kNAkVymC = null;
                }
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final boolean r1MBDhnF() {
        return ((defpackage.du0) this.EXtogiMhuM.get()).compareTo(defpackage.du0.SH1y5HwkJhh) >= 0;
    }
}
