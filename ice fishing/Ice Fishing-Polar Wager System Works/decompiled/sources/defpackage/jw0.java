package defpackage;

/* loaded from: classes.dex */
public final class jw0 implements defpackage.ai1, defpackage.sy0 {
    public final defpackage.l6 F7NU4MC0GW;
    public final defpackage.ad1 IHQe1A4L2xu;
    public volatile boolean adDC3e2L;
    public final defpackage.ei oh6vYeIP;
    public final boolean r1MBDhnF;

    public jw0(defpackage.ad1 ad1Var, defpackage.ei eiVar, boolean z) {
        ad1Var.getClass();
        this.IHQe1A4L2xu = ad1Var;
        this.oh6vYeIP = eiVar;
        this.r1MBDhnF = z;
        this.F7NU4MC0GW = new defpackage.l6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (adDC3e2L(r11, r0) == r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AARZUJiTa(defpackage.zh1 zh1Var, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.hw0 hw0Var;
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        android.database.SQLException e;
        java.lang.Throwable th;
        int i2;
        try {
            if (fjVar instanceof defpackage.hw0) {
                hw0Var = (defpackage.hw0) fjVar;
                int i3 = hw0Var.DFo87pBq1E5;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hw0Var.DFo87pBq1E5 = i3 - Integer.MIN_VALUE;
                    obj = hw0Var.ez2rX8ReCYw;
                    i = hw0Var.DFo87pBq1E5;
                    obj2 = defpackage.vj.adDC3e2L;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        if (zh1Var == null) {
                            zh1Var = defpackage.zh1.adDC3e2L;
                        }
                        hw0Var.EXtogiMhuM = k00Var;
                        hw0Var.DFo87pBq1E5 = 1;
                    } else if (i == 1) {
                        k00Var = (defpackage.k00) hw0Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                    } else {
                        if (i == 2) {
                            i2 = hw0Var.SH1y5HwkJhh;
                            defpackage.f70.nBH8hAHy(obj);
                            boolean z = i2 != 0;
                            hw0Var.EXtogiMhuM = obj;
                            hw0Var.DFo87pBq1E5 = 3;
                            return xiZrDbcSW0(z, hw0Var) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            java.lang.Object obj3 = hw0Var.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = hw0Var.riuEU0zW4;
                        th = (java.lang.Throwable) hw0Var.EXtogiMhuM;
                        try {
                            defpackage.f70.nBH8hAHy(obj);
                            throw th;
                        } catch (android.database.SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    defpackage.tt0 tt0Var = new defpackage.tt0(1, this);
                    hw0Var.EXtogiMhuM = null;
                    hw0Var.SH1y5HwkJhh = 1;
                    hw0Var.DFo87pBq1E5 = 2;
                    obj = k00Var.adDC3e2L(tt0Var, hw0Var);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        hw0Var.EXtogiMhuM = obj;
                        hw0Var.DFo87pBq1E5 = 3;
                        if (xiZrDbcSW0(z, hw0Var) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            defpackage.tt0 tt0Var2 = new defpackage.tt0(1, this);
            hw0Var.EXtogiMhuM = null;
            hw0Var.SH1y5HwkJhh = 1;
            hw0Var.DFo87pBq1E5 = 2;
            obj = k00Var.adDC3e2L(tt0Var2, hw0Var);
            if (obj != obj2) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (java.lang.Throwable th3) {
                try {
                    hw0Var.EXtogiMhuM = th;
                    hw0Var.riuEU0zW4 = th3;
                    hw0Var.DFo87pBq1E5 = 5;
                    if (xiZrDbcSW0(false, hw0Var) != obj2) {
                        throw th3;
                    }
                } catch (android.database.SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    defpackage.x70.cnag84Bm(th, e);
                    throw th;
                }
            }
        }
        hw0Var = new defpackage.hw0(this, fjVar);
        obj = hw0Var.ez2rX8ReCYw;
        i = hw0Var.DFo87pBq1E5;
        obj2 = defpackage.vj.adDC3e2L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object F7NU4MC0GW(java.lang.String str, defpackage.g00 g00Var, defpackage.fj fjVar) {
        defpackage.iw0 iw0Var;
        int i;
        defpackage.ei eiVar;
        try {
            try {
                if (fjVar instanceof defpackage.iw0) {
                    iw0Var = (defpackage.iw0) fjVar;
                    int i2 = iw0Var.DFo87pBq1E5;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iw0Var.DFo87pBq1E5 = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj = iw0Var.ez2rX8ReCYw;
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        i = iw0Var.DFo87pBq1E5;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj);
                            if (this.adDC3e2L) {
                                defpackage.a70.SiPhmbmu("Connection is recycled", 21);
                                throw null;
                            }
                            defpackage.lj ljVar = iw0Var.xiZrDbcSW0;
                            ljVar.getClass();
                            defpackage.wh whVar = (defpackage.wh) ljVar.cnag84Bm(this.IHQe1A4L2xu);
                            if (whVar == null || whVar.xiZrDbcSW0 != this) {
                                defpackage.a70.SiPhmbmu("Attempted to use connection on a different coroutine", 21);
                                throw null;
                            }
                            eiVar = this.oh6vYeIP;
                            iw0Var.EXtogiMhuM = str;
                            iw0Var.riuEU0zW4 = g00Var;
                            iw0Var.SH1y5HwkJhh = eiVar;
                            iw0Var.DFo87pBq1E5 = 1;
                            if (eiVar.xiZrDbcSW0.F7NU4MC0GW(iw0Var) == vjVar) {
                                return vjVar;
                            }
                        } else {
                            if (i != 1) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.ei eiVar2 = iw0Var.SH1y5HwkJhh;
                            g00Var = iw0Var.riuEU0zW4;
                            java.lang.String str2 = iw0Var.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                            eiVar = eiVar2;
                            str = str2;
                        }
                        defpackage.dw0 dw0Var = new defpackage.dw0(this, this.oh6vYeIP.nBH8hAHy(str));
                        java.lang.Object AARZUJiTa = g00Var.AARZUJiTa(dw0Var);
                        defpackage.gq1.JlrlGoKF(dw0Var, null);
                        return AARZUJiTa;
                    }
                }
                java.lang.Object AARZUJiTa2 = g00Var.AARZUJiTa(dw0Var);
                defpackage.gq1.JlrlGoKF(dw0Var, null);
                return AARZUJiTa2;
            } finally {
            }
            defpackage.dw0 dw0Var2 = new defpackage.dw0(this, this.oh6vYeIP.nBH8hAHy(str));
        } finally {
            eiVar.oh6vYeIP(null);
        }
        iw0Var = new defpackage.iw0(this, fjVar);
        java.lang.Object obj2 = iw0Var.ez2rX8ReCYw;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        i = iw0Var.DFo87pBq1E5;
        if (i != 0) {
        }
    }

    @Override // defpackage.ai1
    public final java.lang.Object IHQe1A4L2xu(defpackage.zh1 zh1Var, defpackage.k00 k00Var, defpackage.ce1 ce1Var) {
        if (this.adDC3e2L) {
            defpackage.a70.SiPhmbmu("Connection is recycled", 21);
            throw null;
        }
        defpackage.lj ljVar = ce1Var.xiZrDbcSW0;
        ljVar.getClass();
        defpackage.wh whVar = (defpackage.wh) ljVar.cnag84Bm(this.IHQe1A4L2xu);
        if (whVar != null && whVar.xiZrDbcSW0 == this) {
            return AARZUJiTa(zh1Var, k00Var, ce1Var);
        }
        defpackage.a70.SiPhmbmu("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object adDC3e2L(defpackage.zh1 zh1Var, defpackage.fj fjVar) {
        defpackage.fw0 fw0Var;
        int i;
        defpackage.ei eiVar;
        defpackage.l6 l6Var = this.F7NU4MC0GW;
        try {
            if (fjVar instanceof defpackage.fw0) {
                fw0Var = (defpackage.fw0) fjVar;
                int i2 = fw0Var.JlrlGoKF;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fw0Var.JlrlGoKF = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = fw0Var.SH1y5HwkJhh;
                    i = fw0Var.JlrlGoKF;
                    defpackage.ei eiVar2 = this.oh6vYeIP;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        fw0Var.EXtogiMhuM = zh1Var;
                        fw0Var.riuEU0zW4 = eiVar2;
                        fw0Var.JlrlGoKF = 1;
                        java.lang.Object F7NU4MC0GW = eiVar2.xiZrDbcSW0.F7NU4MC0GW(fw0Var);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (F7NU4MC0GW == vjVar) {
                            return vjVar;
                        }
                        eiVar = eiVar2;
                    } else {
                        if (i != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.ei eiVar3 = fw0Var.riuEU0zW4;
                        defpackage.zh1 zh1Var2 = fw0Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        eiVar = eiVar3;
                        zh1Var = zh1Var2;
                    }
                    int i3 = l6Var.AARZUJiTa;
                    if (l6Var.isEmpty()) {
                        defpackage.a70.JlrlGoKF(eiVar2, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = zh1Var.ordinal();
                        if (ordinal == 0) {
                            defpackage.a70.JlrlGoKF(eiVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            defpackage.a70.JlrlGoKF(eiVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new defpackage.cf();
                            }
                            defpackage.a70.JlrlGoKF(eiVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    l6Var.addLast(new defpackage.ew0(i3));
                    defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                    eiVar.oh6vYeIP(null);
                    return ok1Var;
                }
            }
            int i32 = l6Var.AARZUJiTa;
            if (l6Var.isEmpty()) {
            }
            l6Var.addLast(new defpackage.ew0(i32));
            defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
            eiVar.oh6vYeIP(null);
            return ok1Var2;
        } catch (java.lang.Throwable th) {
            eiVar.oh6vYeIP(null);
            throw th;
        }
        fw0Var = new defpackage.fw0(this, fjVar);
        java.lang.Object obj2 = fw0Var.SH1y5HwkJhh;
        i = fw0Var.JlrlGoKF;
        defpackage.ei eiVar22 = this.oh6vYeIP;
        if (i != 0) {
        }
    }

    @Override // defpackage.sy0
    public final defpackage.i31 oh6vYeIP() {
        return this.oh6vYeIP;
    }

    @Override // defpackage.ai1
    public final java.lang.Boolean r1MBDhnF(defpackage.ej ejVar) {
        if (this.adDC3e2L) {
            defpackage.a70.SiPhmbmu("Connection is recycled", 21);
            throw null;
        }
        defpackage.lj ljVar = ((defpackage.fj) ejVar).xiZrDbcSW0;
        ljVar.getClass();
        defpackage.wh whVar = (defpackage.wh) ljVar.cnag84Bm(this.IHQe1A4L2xu);
        if (whVar != null && whVar.xiZrDbcSW0 == this) {
            return java.lang.Boolean.valueOf(!this.F7NU4MC0GW.isEmpty() || this.oh6vYeIP.adDC3e2L.SyNS6RMn());
        }
        defpackage.a70.SiPhmbmu("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object xiZrDbcSW0(boolean z, defpackage.fj fjVar) {
        defpackage.gw0 gw0Var;
        int i;
        defpackage.ei eiVar;
        defpackage.l6 l6Var = this.F7NU4MC0GW;
        try {
            if (fjVar instanceof defpackage.gw0) {
                gw0Var = (defpackage.gw0) fjVar;
                int i2 = gw0Var.JlrlGoKF;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gw0Var.JlrlGoKF = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = gw0Var.SH1y5HwkJhh;
                    i = gw0Var.JlrlGoKF;
                    defpackage.ei eiVar2 = this.oh6vYeIP;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        gw0Var.riuEU0zW4 = eiVar2;
                        gw0Var.EXtogiMhuM = z;
                        gw0Var.JlrlGoKF = 1;
                        java.lang.Object F7NU4MC0GW = eiVar2.xiZrDbcSW0.F7NU4MC0GW(gw0Var);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (F7NU4MC0GW == vjVar) {
                            return vjVar;
                        }
                        eiVar = eiVar2;
                    } else {
                        if (i != 1) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = gw0Var.EXtogiMhuM;
                        eiVar = gw0Var.riuEU0zW4;
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    if (!l6Var.isEmpty()) {
                        throw new java.lang.IllegalStateException("Not in a transaction");
                    }
                    defpackage.ew0 ew0Var = (defpackage.ew0) defpackage.yd.QUKZkWRtw6(l6Var);
                    if (z) {
                        ew0Var.getClass();
                        if (l6Var.isEmpty()) {
                            defpackage.a70.JlrlGoKF(eiVar2, "END TRANSACTION");
                        } else {
                            defpackage.a70.JlrlGoKF(eiVar2, "RELEASE SAVEPOINT '" + ew0Var.IHQe1A4L2xu + '\'');
                        }
                    } else if (l6Var.isEmpty()) {
                        defpackage.a70.JlrlGoKF(eiVar2, "ROLLBACK TRANSACTION");
                    } else {
                        defpackage.a70.JlrlGoKF(eiVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + ew0Var.IHQe1A4L2xu + '\'');
                    }
                    defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                    eiVar.oh6vYeIP(null);
                    return ok1Var;
                }
            }
            if (!l6Var.isEmpty()) {
            }
        } catch (java.lang.Throwable th) {
            eiVar.oh6vYeIP(null);
            throw th;
        }
        gw0Var = new defpackage.gw0(this, fjVar);
        java.lang.Object obj2 = gw0Var.SH1y5HwkJhh;
        i = gw0Var.JlrlGoKF;
        defpackage.ei eiVar22 = this.oh6vYeIP;
        if (i != 0) {
        }
    }
}
