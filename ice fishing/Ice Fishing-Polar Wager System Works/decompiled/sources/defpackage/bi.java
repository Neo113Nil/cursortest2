package defpackage;

/* loaded from: classes.dex */
public final class bi implements defpackage.xh {
    public final defpackage.ad1 AARZUJiTa;
    public final java.lang.ThreadLocal EXtogiMhuM;
    public final long SH1y5HwkJhh;
    public final defpackage.bw0 adDC3e2L;
    public final int ez2rX8ReCYw;
    public volatile boolean riuEU0zW4;
    public final defpackage.bw0 xiZrDbcSW0;

    public bi(final defpackage.F7NU4MC0GW f7nu4mc0gw, final java.lang.String str, int i) {
        long wKlPRKlRnfqr;
        str.getClass();
        this.AARZUJiTa = new defpackage.ad1(22);
        this.EXtogiMhuM = new java.lang.ThreadLocal();
        defpackage.ad1 ad1Var = defpackage.zr.adDC3e2L;
        defpackage.bs bsVar = defpackage.bs.SECONDS;
        if (bsVar.compareTo(bsVar) <= 0) {
            int i2 = defpackage.as.IHQe1A4L2xu;
            wKlPRKlRnfqr = 60000000000L;
        } else {
            wKlPRKlRnfqr = defpackage.x70.wKlPRKlRnfqr(30L, bsVar);
        }
        this.SH1y5HwkJhh = wKlPRKlRnfqr;
        this.ez2rX8ReCYw = 2;
        if (i <= 0) {
            defpackage.db.fnWB2E7cs("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i3 = 0;
        this.adDC3e2L = new defpackage.bw0(i, new defpackage.vz() { // from class: yh
            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                int i4 = i3;
                java.lang.String str2 = str;
                defpackage.F7NU4MC0GW f7nu4mc0gw2 = f7nu4mc0gw;
                switch (i4) {
                    case 0:
                        defpackage.i31 r1MBDhnF = f7nu4mc0gw2.r1MBDhnF(str2);
                        defpackage.a70.JlrlGoKF(r1MBDhnF, "PRAGMA query_only = 1");
                        return r1MBDhnF;
                    default:
                        return f7nu4mc0gw2.r1MBDhnF(str2);
                }
            }
        });
        final int i4 = 1;
        this.xiZrDbcSW0 = new defpackage.bw0(1, new defpackage.vz() { // from class: yh
            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                int i42 = i4;
                java.lang.String str2 = str;
                defpackage.F7NU4MC0GW f7nu4mc0gw2 = f7nu4mc0gw;
                switch (i42) {
                    case 0:
                        defpackage.i31 r1MBDhnF = f7nu4mc0gw2.r1MBDhnF(str2);
                        defpackage.a70.JlrlGoKF(r1MBDhnF, "PRAGMA query_only = 1");
                        return r1MBDhnF;
                    default:
                        return f7nu4mc0gw2.r1MBDhnF(str2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #2 {all -> 0x01a7, blocks: (B:55:0x0125, B:59:0x013f, B:61:0x014a, B:65:0x01ab, B:66:0x01b2), top: B:54:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #2 {all -> 0x01a7, blocks: (B:55:0x0125, B:59:0x013f, B:61:0x014a, B:65:0x01ab, B:66:0x01b2), top: B:54:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // defpackage.xh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object DFo87pBq1E5(boolean z, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.ai aiVar;
        int i;
        boolean z2;
        defpackage.rz0 rz0Var;
        java.lang.Throwable th;
        defpackage.bw0 bw0Var;
        defpackage.lj ljVar;
        defpackage.k00 k00Var2;
        defpackage.ad1 ad1Var;
        defpackage.bw0 bw0Var2;
        defpackage.rz0 rz0Var2;
        java.lang.Object obj;
        defpackage.rz0 rz0Var3;
        defpackage.jw0 jw0Var;
        boolean z3 = z;
        try {
            if (fjVar instanceof defpackage.ai) {
                aiVar = (defpackage.ai) fjVar;
                int i2 = aiVar.G3OKOH3wZRC;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aiVar.G3OKOH3wZRC = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj2 = aiVar.cnag84Bm;
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    i = aiVar.G3OKOH3wZRC;
                    z2 = false;
                    defpackage.ej ejVar = null;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj2);
                        if (this.riuEU0zW4) {
                            defpackage.a70.SiPhmbmu("Connection pool is closed", 21);
                            throw null;
                        }
                        defpackage.jw0 jw0Var2 = (defpackage.jw0) this.EXtogiMhuM.get();
                        if (jw0Var2 == null) {
                            defpackage.lj ljVar2 = aiVar.xiZrDbcSW0;
                            ljVar2.getClass();
                            defpackage.wh whVar = (defpackage.wh) ljVar2.cnag84Bm(this.AARZUJiTa);
                            jw0Var2 = whVar != null ? whVar.xiZrDbcSW0 : null;
                        }
                        if (jw0Var2 == null) {
                            defpackage.bw0 bw0Var3 = z3 ? this.adDC3e2L : this.xiZrDbcSW0;
                            rz0Var = new defpackage.rz0();
                            try {
                                ljVar = aiVar.xiZrDbcSW0;
                                ljVar.getClass();
                                defpackage.ad1 ad1Var2 = this.AARZUJiTa;
                                long j = this.SH1y5HwkJhh;
                                defpackage.zh zhVar = new defpackage.zh(0, this, z3);
                                aiVar.riuEU0zW4 = k00Var;
                                aiVar.SH1y5HwkJhh = bw0Var3;
                                aiVar.ez2rX8ReCYw = rz0Var;
                                aiVar.JlrlGoKF = ljVar;
                                aiVar.DFo87pBq1E5 = rz0Var;
                                aiVar.SyNS6RMn = ad1Var2;
                                aiVar.EXtogiMhuM = z3;
                                aiVar.G3OKOH3wZRC = 3;
                                java.lang.Object oh6vYeIP = bw0Var3.oh6vYeIP(j, zhVar, aiVar);
                                if (oh6vYeIP != vjVar) {
                                    k00Var2 = k00Var;
                                    ad1Var = ad1Var2;
                                    bw0Var2 = bw0Var3;
                                    obj2 = oh6vYeIP;
                                    rz0Var2 = rz0Var;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                bw0Var = bw0Var3;
                                throw th;
                            }
                        } else {
                            if (!z3 && jw0Var2.r1MBDhnF) {
                                defpackage.a70.SiPhmbmu("Cannot upgrade connection from reader to writer", 1);
                                throw null;
                            }
                            defpackage.lj ljVar3 = aiVar.xiZrDbcSW0;
                            ljVar3.getClass();
                            if (ljVar3.cnag84Bm(this.AARZUJiTa) == null) {
                                defpackage.wh whVar2 = new defpackage.wh(this.AARZUJiTa, jw0Var2);
                                java.lang.ThreadLocal threadLocal = this.EXtogiMhuM;
                                threadLocal.getClass();
                                defpackage.lj hkbnNdmy = defpackage.ci0.hkbnNdmy(whVar2, new defpackage.kg1(jw0Var2, threadLocal));
                                defpackage.adDC3e2L addc3e2l = new defpackage.adDC3e2L(k00Var, jw0Var2, ejVar, 10);
                                aiVar.G3OKOH3wZRC = 1;
                                java.lang.Object QPwENk36pDC = defpackage.fm.QPwENk36pDC(hkbnNdmy, addc3e2l, aiVar);
                                if (QPwENk36pDC != vjVar) {
                                    return QPwENk36pDC;
                                }
                            } else {
                                aiVar.G3OKOH3wZRC = 2;
                                java.lang.Object adDC3e2L = k00Var.adDC3e2L(jw0Var2, aiVar);
                                if (adDC3e2L != vjVar) {
                                    return adDC3e2L;
                                }
                            }
                        }
                        return vjVar;
                    }
                    if (i == 1) {
                        defpackage.f70.nBH8hAHy(obj2);
                        return obj2;
                    }
                    if (i == 2) {
                        defpackage.f70.nBH8hAHy(obj2);
                        return obj2;
                    }
                    if (i == 3) {
                        z3 = aiVar.EXtogiMhuM;
                        ad1Var = aiVar.SyNS6RMn;
                        defpackage.rz0 rz0Var4 = aiVar.DFo87pBq1E5;
                        defpackage.lj ljVar4 = aiVar.JlrlGoKF;
                        defpackage.rz0 rz0Var5 = aiVar.ez2rX8ReCYw;
                        bw0Var2 = (defpackage.bw0) aiVar.SH1y5HwkJhh;
                        k00Var2 = (defpackage.k00) aiVar.riuEU0zW4;
                        try {
                            defpackage.f70.nBH8hAHy(obj2);
                            rz0Var2 = rz0Var4;
                            rz0Var = rz0Var5;
                            ljVar = ljVar4;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            rz0Var = rz0Var5;
                            bw0Var = bw0Var2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rz0Var3 = (defpackage.rz0) aiVar.SH1y5HwkJhh;
                        bw0Var = (defpackage.bw0) aiVar.riuEU0zW4;
                        try {
                            defpackage.f70.nBH8hAHy(obj2);
                            jw0Var = (defpackage.jw0) rz0Var3.adDC3e2L;
                            if (jw0Var != null) {
                                if (!jw0Var.adDC3e2L) {
                                    jw0Var.adDC3e2L = true;
                                    if (jw0Var.oh6vYeIP.adDC3e2L.SyNS6RMn()) {
                                        defpackage.a70.JlrlGoKF(jw0Var.oh6vYeIP, "ROLLBACK TRANSACTION");
                                    }
                                }
                                defpackage.ei eiVar = jw0Var.oh6vYeIP;
                                eiVar.AARZUJiTa = null;
                                eiVar.EXtogiMhuM = null;
                                bw0Var.adDC3e2L(eiVar);
                            }
                            return obj2;
                        } catch (java.lang.Throwable th4) {
                            rz0Var = rz0Var3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    defpackage.ei eiVar2 = (defpackage.ei) obj2;
                    eiVar2.getClass();
                    ljVar.getClass();
                    eiVar2.AARZUJiTa = ljVar;
                    eiVar2.EXtogiMhuM = new java.lang.Throwable();
                    if (this.adDC3e2L != this.xiZrDbcSW0 && z3) {
                        z2 = true;
                    }
                    rz0Var2.adDC3e2L = new defpackage.jw0(ad1Var, eiVar2, z2);
                    obj = rz0Var.adDC3e2L;
                    if (obj != null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    defpackage.jw0 jw0Var3 = (defpackage.jw0) obj;
                    defpackage.wh whVar3 = new defpackage.wh(this.AARZUJiTa, jw0Var3);
                    java.lang.ThreadLocal threadLocal2 = this.EXtogiMhuM;
                    threadLocal2.getClass();
                    defpackage.lj hkbnNdmy2 = defpackage.ci0.hkbnNdmy(whVar3, new defpackage.kg1(jw0Var3, threadLocal2));
                    defpackage.adDC3e2L addc3e2l2 = new defpackage.adDC3e2L(k00Var2, rz0Var, null, 11);
                    aiVar.riuEU0zW4 = bw0Var2;
                    aiVar.SH1y5HwkJhh = rz0Var;
                    aiVar.ez2rX8ReCYw = null;
                    aiVar.JlrlGoKF = null;
                    aiVar.DFo87pBq1E5 = null;
                    aiVar.SyNS6RMn = null;
                    aiVar.G3OKOH3wZRC = 4;
                    obj2 = defpackage.fm.QPwENk36pDC(hkbnNdmy2, addc3e2l2, aiVar);
                    if (obj2 != vjVar) {
                        rz0Var3 = rz0Var;
                        bw0Var = bw0Var2;
                        jw0Var = (defpackage.jw0) rz0Var3.adDC3e2L;
                        if (jw0Var != null) {
                        }
                        return obj2;
                    }
                    return vjVar;
                }
            }
            defpackage.ei eiVar22 = (defpackage.ei) obj2;
            eiVar22.getClass();
            ljVar.getClass();
            eiVar22.AARZUJiTa = ljVar;
            eiVar22.EXtogiMhuM = new java.lang.Throwable();
            if (this.adDC3e2L != this.xiZrDbcSW0) {
                z2 = true;
            }
            rz0Var2.adDC3e2L = new defpackage.jw0(ad1Var, eiVar22, z2);
            obj = rz0Var.adDC3e2L;
            if (obj != null) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bw0Var = bw0Var2;
            throw th;
        }
        aiVar = new defpackage.ai(this, fjVar);
        java.lang.Object obj22 = aiVar.cnag84Bm;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        i = aiVar.G3OKOH3wZRC;
        z2 = false;
        defpackage.ej ejVar2 = null;
        if (i != 0) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.riuEU0zW4) {
            return;
        }
        this.riuEU0zW4 = true;
        this.adDC3e2L.r1MBDhnF();
        this.xiZrDbcSW0.r1MBDhnF();
    }

    public bi(defpackage.F7NU4MC0GW f7nu4mc0gw) {
        long wKlPRKlRnfqr;
        this.AARZUJiTa = new defpackage.ad1(22);
        this.EXtogiMhuM = new java.lang.ThreadLocal();
        defpackage.ad1 ad1Var = defpackage.zr.adDC3e2L;
        defpackage.bs bsVar = defpackage.bs.SECONDS;
        if (bsVar.compareTo(bsVar) <= 0) {
            int i = defpackage.as.IHQe1A4L2xu;
            wKlPRKlRnfqr = 60000000000L;
        } else {
            wKlPRKlRnfqr = defpackage.x70.wKlPRKlRnfqr(30L, bsVar);
        }
        this.SH1y5HwkJhh = wKlPRKlRnfqr;
        this.ez2rX8ReCYw = 2;
        defpackage.bw0 bw0Var = new defpackage.bw0(1, new defpackage.e3(1, f7nu4mc0gw));
        this.adDC3e2L = bw0Var;
        this.xiZrDbcSW0 = bw0Var;
    }
}
