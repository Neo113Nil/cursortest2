package defpackage;

/* loaded from: classes.dex */
public final class xt0 implements defpackage.ai1, defpackage.sy0 {
    public defpackage.zh1 F7NU4MC0GW;
    public final defpackage.k00 IHQe1A4L2xu;
    public final defpackage.i31 oh6vYeIP;
    public final java.util.concurrent.atomic.AtomicInteger r1MBDhnF;

    public xt0(defpackage.k00 k00Var, defpackage.i31 i31Var) {
        i31Var.getClass();
        this.IHQe1A4L2xu = k00Var;
        this.oh6vYeIP = i31Var;
        this.r1MBDhnF = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object F7NU4MC0GW(java.lang.String str, defpackage.g00 g00Var, defpackage.fj fjVar) {
        defpackage.vt0 vt0Var;
        java.lang.Object obj;
        int i;
        if (fjVar instanceof defpackage.vt0) {
            vt0Var = (defpackage.vt0) fjVar;
            int i2 = vt0Var.JlrlGoKF;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vt0Var.JlrlGoKF = i2 - Integer.MIN_VALUE;
                obj = vt0Var.SH1y5HwkJhh;
                i = vt0Var.JlrlGoKF;
                java.lang.Object obj2 = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    vt0Var.EXtogiMhuM = str;
                    vt0Var.riuEU0zW4 = g00Var;
                    vt0Var.JlrlGoKF = 1;
                    obj = r1MBDhnF(vt0Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            defpackage.f70.nBH8hAHy(obj);
                            return obj;
                        }
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g00Var = vt0Var.riuEU0zW4;
                    str = vt0Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.wt0 wt0Var = new defpackage.wt0(this, str, g00Var, null);
                    vt0Var.EXtogiMhuM = null;
                    vt0Var.riuEU0zW4 = null;
                    vt0Var.JlrlGoKF = 2;
                    java.lang.Object adDC3e2L = this.IHQe1A4L2xu.adDC3e2L(wt0Var, vt0Var);
                    return adDC3e2L == obj2 ? obj2 : adDC3e2L;
                }
                defpackage.k31 nBH8hAHy = this.oh6vYeIP.nBH8hAHy(str);
                try {
                    java.lang.Object AARZUJiTa = g00Var.AARZUJiTa(nBH8hAHy);
                    defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                    return AARZUJiTa;
                } finally {
                }
            }
        }
        vt0Var = new defpackage.vt0(this, fjVar);
        obj = vt0Var.SH1y5HwkJhh;
        i = vt0Var.JlrlGoKF;
        java.lang.Object obj22 = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.ai1
    public final java.lang.Object IHQe1A4L2xu(defpackage.zh1 zh1Var, defpackage.k00 k00Var, defpackage.ce1 ce1Var) {
        return this.IHQe1A4L2xu.adDC3e2L(new defpackage.a(this, zh1Var, k00Var, (defpackage.ej) null), ce1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object adDC3e2L(defpackage.zh1 zh1Var, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.ut0 ut0Var;
        int i;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        try {
            if (fjVar instanceof defpackage.ut0) {
                ut0Var = (defpackage.ut0) fjVar;
                int i3 = ut0Var.ez2rX8ReCYw;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ut0Var.ez2rX8ReCYw = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = ut0Var.riuEU0zW4;
                    i = ut0Var.ez2rX8ReCYw;
                    atomicInteger = this.r1MBDhnF;
                    i2 = 1;
                    defpackage.i31 i31Var = this.oh6vYeIP;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        int ordinal = zh1Var.ordinal();
                        if (ordinal == 0) {
                            defpackage.a70.JlrlGoKF(i31Var, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            defpackage.a70.JlrlGoKF(i31Var, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                defpackage.db.F7NU4MC0GW();
                                return null;
                            }
                            defpackage.a70.JlrlGoKF(i31Var, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.F7NU4MC0GW = zh1Var;
                        }
                        java.lang.Object tt0Var = new defpackage.tt0(0, this);
                        ut0Var.EXtogiMhuM = 1;
                        ut0Var.ez2rX8ReCYw = 1;
                        obj = k00Var.adDC3e2L(tt0Var, ut0Var);
                        java.lang.Object obj2 = defpackage.vj.adDC3e2L;
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = ut0Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.F7NU4MC0GW = null;
                    }
                    if (i2 == 0) {
                        defpackage.a70.JlrlGoKF(i31Var, "END TRANSACTION");
                        return obj;
                    }
                    defpackage.a70.JlrlGoKF(i31Var, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } finally {
        }
        ut0Var = new defpackage.ut0(this, fjVar);
        java.lang.Object obj3 = ut0Var.riuEU0zW4;
        i = ut0Var.ez2rX8ReCYw;
        atomicInteger = this.r1MBDhnF;
        i2 = 1;
        defpackage.i31 i31Var2 = this.oh6vYeIP;
    }

    @Override // defpackage.sy0
    public final defpackage.i31 oh6vYeIP() {
        return this.oh6vYeIP;
    }

    @Override // defpackage.ai1
    public final java.lang.Boolean r1MBDhnF(defpackage.ej ejVar) {
        return java.lang.Boolean.valueOf(this.F7NU4MC0GW != null || this.oh6vYeIP.SyNS6RMn());
    }
}
