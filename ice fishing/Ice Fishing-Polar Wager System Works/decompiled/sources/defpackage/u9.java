package defpackage;

/* loaded from: classes.dex */
public final class u9 implements defpackage.fn1 {
    public final /* synthetic */ defpackage.x9 AARZUJiTa;
    public java.lang.Object adDC3e2L = defpackage.z9.QoRHpC4k;
    public defpackage.bb xiZrDbcSW0;

    public u9(defpackage.x9 x9Var) {
        this.AARZUJiTa = x9Var;
    }

    @Override // defpackage.fn1
    public final void IHQe1A4L2xu(defpackage.t61 t61Var, int i) {
        defpackage.bb bbVar = this.xiZrDbcSW0;
        if (bbVar != null) {
            bbVar.IHQe1A4L2xu(t61Var, i);
        }
    }

    public final java.lang.Object oh6vYeIP(defpackage.fj fjVar) {
        defpackage.ec ecVar;
        java.lang.Object obj = this.adDC3e2L;
        boolean z = true;
        if (obj == defpackage.z9.QoRHpC4k || obj == defpackage.z9.JlrlGoKF) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = defpackage.x9.ez2rX8ReCYw;
            defpackage.x9 x9Var = this.AARZUJiTa;
            defpackage.ec ecVar2 = (defpackage.ec) atomicReferenceFieldUpdater.get(x9Var);
            while (true) {
                if (x9Var.QQUzIjv3iOC5()) {
                    this.adDC3e2L = defpackage.z9.JlrlGoKF;
                    java.lang.Throwable kd6TUFXn = x9Var.kd6TUFXn();
                    if (kd6TUFXn != null) {
                        int i = defpackage.wb1.IHQe1A4L2xu;
                        throw kd6TUFXn;
                    }
                    z = false;
                } else {
                    long andIncrement = defpackage.x9.AARZUJiTa.getAndIncrement(x9Var);
                    long j = defpackage.z9.oh6vYeIP;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (ecVar2.adDC3e2L != j2) {
                        ecVar = x9Var.QoRHpC4k(j2, ecVar2);
                        if (ecVar == null) {
                            continue;
                        }
                    } else {
                        ecVar = ecVar2;
                    }
                    java.lang.Object Uv8CGu3G = x9Var.Uv8CGu3G(ecVar, i2, andIncrement, null);
                    defpackage.et etVar = defpackage.z9.DFo87pBq1E5;
                    if (Uv8CGu3G == etVar) {
                        defpackage.db.AARZUJiTa("unreachable");
                        return null;
                    }
                    defpackage.et etVar2 = defpackage.z9.cnag84Bm;
                    if (Uv8CGu3G == etVar2) {
                        if (andIncrement < x9Var.kNAkVymC()) {
                            ecVar.IHQe1A4L2xu();
                        }
                        ecVar2 = ecVar;
                    } else {
                        if (Uv8CGu3G == defpackage.z9.SyNS6RMn) {
                            defpackage.x9 x9Var2 = this.AARZUJiTa;
                            defpackage.bb nBH8hAHy = defpackage.ci0.nBH8hAHy(defpackage.c80.V7bD7b8KA(fjVar));
                            try {
                                this.xiZrDbcSW0 = nBH8hAHy;
                                java.lang.Object Uv8CGu3G2 = x9Var2.Uv8CGu3G(ecVar, i2, andIncrement, this);
                                if (Uv8CGu3G2 == etVar) {
                                    IHQe1A4L2xu(ecVar, i2);
                                } else {
                                    if (Uv8CGu3G2 == etVar2) {
                                        if (andIncrement < x9Var2.kNAkVymC()) {
                                            ecVar.IHQe1A4L2xu();
                                        }
                                        defpackage.ec ecVar3 = (defpackage.ec) defpackage.x9.ez2rX8ReCYw.get(x9Var2);
                                        while (true) {
                                            if (x9Var2.QQUzIjv3iOC5()) {
                                                defpackage.bb bbVar = this.xiZrDbcSW0;
                                                bbVar.getClass();
                                                this.xiZrDbcSW0 = null;
                                                this.adDC3e2L = defpackage.z9.JlrlGoKF;
                                                java.lang.Throwable kd6TUFXn2 = x9Var.kd6TUFXn();
                                                if (kd6TUFXn2 == null) {
                                                    bbVar.SH1y5HwkJhh(java.lang.Boolean.FALSE);
                                                } else {
                                                    bbVar.SH1y5HwkJhh(new defpackage.p11(kd6TUFXn2));
                                                }
                                            } else {
                                                long andIncrement2 = defpackage.x9.AARZUJiTa.getAndIncrement(x9Var2);
                                                long j3 = defpackage.z9.oh6vYeIP;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (ecVar3.adDC3e2L != j4) {
                                                    defpackage.ec QoRHpC4k = x9Var2.QoRHpC4k(j4, ecVar3);
                                                    if (QoRHpC4k != null) {
                                                        ecVar3 = QoRHpC4k;
                                                    }
                                                }
                                                java.lang.Object Uv8CGu3G3 = x9Var2.Uv8CGu3G(ecVar3, i3, andIncrement2, this);
                                                if (Uv8CGu3G3 == defpackage.z9.DFo87pBq1E5) {
                                                    IHQe1A4L2xu(ecVar3, i3);
                                                    break;
                                                }
                                                if (Uv8CGu3G3 == defpackage.z9.cnag84Bm) {
                                                    if (andIncrement2 < x9Var2.kNAkVymC()) {
                                                        ecVar3.IHQe1A4L2xu();
                                                    }
                                                } else {
                                                    if (Uv8CGu3G3 == defpackage.z9.SyNS6RMn) {
                                                        throw new java.lang.IllegalStateException("unexpected");
                                                    }
                                                    ecVar3.IHQe1A4L2xu();
                                                    this.adDC3e2L = Uv8CGu3G3;
                                                    this.xiZrDbcSW0 = null;
                                                }
                                            }
                                        }
                                    } else {
                                        ecVar.IHQe1A4L2xu();
                                        this.adDC3e2L = Uv8CGu3G2;
                                        this.xiZrDbcSW0 = null;
                                    }
                                    nBH8hAHy.DFo87pBq1E5(java.lang.Boolean.TRUE, null);
                                }
                                return nBH8hAHy.kNAkVymC();
                            } catch (java.lang.Throwable th) {
                                nBH8hAHy.D2vUnMij();
                                throw th;
                            }
                        }
                        ecVar.IHQe1A4L2xu();
                        this.adDC3e2L = Uv8CGu3G;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final java.lang.Object r1MBDhnF() {
        java.lang.Object obj = this.adDC3e2L;
        defpackage.et etVar = defpackage.z9.QoRHpC4k;
        if (obj == etVar) {
            defpackage.db.AARZUJiTa("`hasNext()` has not been invoked");
            return null;
        }
        this.adDC3e2L = etVar;
        if (obj != defpackage.z9.JlrlGoKF) {
            return obj;
        }
        java.lang.Throwable EgCjBq0SZwJ = this.AARZUJiTa.EgCjBq0SZwJ();
        int i = defpackage.wb1.IHQe1A4L2xu;
        throw EgCjBq0SZwJ;
    }
}
