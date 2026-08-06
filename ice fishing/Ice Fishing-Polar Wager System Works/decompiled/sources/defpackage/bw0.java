package defpackage;

/* loaded from: classes.dex */
public final class bw0 {
    public final defpackage.t71 AARZUJiTa;
    public final defpackage.l6 EXtogiMhuM;
    public int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public boolean adDC3e2L;
    public final defpackage.vz oh6vYeIP;
    public final java.util.concurrent.locks.ReentrantLock r1MBDhnF = new java.util.concurrent.locks.ReentrantLock();
    public final defpackage.ei[] xiZrDbcSW0;

    public bw0(int i, defpackage.vz vzVar) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = vzVar;
        this.xiZrDbcSW0 = new defpackage.ei[i];
        int i2 = defpackage.u71.IHQe1A4L2xu;
        this.AARZUJiTa = new defpackage.t71(i);
        this.EXtogiMhuM = new defpackage.l6(i);
    }

    public final void F7NU4MC0GW(java.lang.StringBuilder sb) {
        defpackage.l6 l6Var = this.EXtogiMhuM;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.r1MBDhnF;
        reentrantLock.lock();
        try {
            defpackage.te0 kNAkVymC = defpackage.fm.kNAkVymC();
            int i = l6Var.AARZUJiTa;
            for (int i2 = 0; i2 < i; i2++) {
                kNAkVymC.add(l6Var.get(i2));
            }
            defpackage.te0 fnWB2E7cs = defpackage.fm.fnWB2E7cs(kNAkVymC);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.IHQe1A4L2xu + ", ");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("permits=");
            defpackage.t71 t71Var = this.AARZUJiTa;
            t71Var.getClass();
            sb2.append(java.lang.Math.max(defpackage.s71.ez2rX8ReCYw.get(t71Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + fnWB2E7cs.IHQe1A4L2xu() + ")[" + defpackage.td.cSNyPqwud(fnWB2E7cs, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            defpackage.ei[] eiVarArr = this.xiZrDbcSW0;
            int length = eiVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                defpackage.ei eiVar = eiVarArr[i4];
                i3++;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(eiVar != null ? eiVar.adDC3e2L.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (eiVar != null) {
                    eiVar.AARZUJiTa(sb);
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0061, code lost:
    
        r1.DFo87pBq1E5(r5, r4.xiZrDbcSW0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c0), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c0), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.fj fjVar) {
        defpackage.zv0 zv0Var;
        int i;
        defpackage.t71 t71Var;
        int andDecrement;
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        defpackage.l6 l6Var = this.EXtogiMhuM;
        try {
            try {
                if (fjVar instanceof defpackage.zv0) {
                    zv0Var = (defpackage.zv0) fjVar;
                    int i2 = zv0Var.SH1y5HwkJhh;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zv0Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj = zv0Var.EXtogiMhuM;
                        i = zv0Var.SH1y5HwkJhh;
                        t71Var = this.AARZUJiTa;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj);
                            zv0Var.SH1y5HwkJhh = 1;
                            t71Var.getClass();
                            int i3 = t71Var.adDC3e2L;
                            do {
                                andDecrement = defpackage.s71.ez2rX8ReCYw.getAndDecrement(t71Var);
                            } while (andDecrement > i3);
                            java.lang.Object obj2 = defpackage.ok1.IHQe1A4L2xu;
                            java.lang.Object obj3 = defpackage.vj.adDC3e2L;
                            if (andDecrement <= 0) {
                                defpackage.bb nBH8hAHy = defpackage.ci0.nBH8hAHy(defpackage.c80.V7bD7b8KA(zv0Var));
                                try {
                                    if (!t71Var.IHQe1A4L2xu(nBH8hAHy)) {
                                        while (true) {
                                            int andDecrement2 = defpackage.s71.ez2rX8ReCYw.getAndDecrement(t71Var);
                                            if (andDecrement2 <= i3) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (t71Var.IHQe1A4L2xu(nBH8hAHy)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    java.lang.Object kNAkVymC = nBH8hAHy.kNAkVymC();
                                    java.lang.Object obj4 = kNAkVymC;
                                    if (kNAkVymC != obj3) {
                                        obj4 = obj2;
                                    }
                                    if (obj4 == obj3) {
                                        obj2 = obj4;
                                    }
                                } catch (java.lang.Throwable th) {
                                    nBH8hAHy.D2vUnMij();
                                    throw th;
                                }
                            }
                            if (obj2 == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i != 1) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.f70.nBH8hAHy(obj);
                        }
                        reentrantLock = this.r1MBDhnF;
                        reentrantLock.lock();
                        if (!this.adDC3e2L) {
                            defpackage.a70.SiPhmbmu("Connection pool is closed", 21);
                            throw null;
                        }
                        if (l6Var.isEmpty() && this.F7NU4MC0GW < this.IHQe1A4L2xu) {
                            defpackage.ei eiVar = new defpackage.ei((defpackage.i31) this.oh6vYeIP.IHQe1A4L2xu());
                            defpackage.ei[] eiVarArr = this.xiZrDbcSW0;
                            int i4 = this.F7NU4MC0GW;
                            this.F7NU4MC0GW = i4 + 1;
                            eiVarArr[i4] = eiVar;
                            l6Var.addLast(eiVar);
                        }
                        return (defpackage.ei) l6Var.removeLast();
                    }
                }
                if (!this.adDC3e2L) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.r1MBDhnF;
            reentrantLock.lock();
        } catch (java.lang.Throwable th2) {
            t71Var.r1MBDhnF();
            throw th2;
        }
        zv0Var = new defpackage.zv0(this, fjVar);
        java.lang.Object obj5 = zv0Var.EXtogiMhuM;
        i = zv0Var.SH1y5HwkJhh;
        t71Var = this.AARZUJiTa;
        if (i != 0) {
        }
    }

    public final void adDC3e2L(defpackage.ei eiVar) {
        eiVar.getClass();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.r1MBDhnF;
        reentrantLock.lock();
        try {
            this.EXtogiMhuM.addLast(eiVar);
            reentrantLock.unlock();
            this.AARZUJiTa.r1MBDhnF();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:13|14|(1:(1:34)(2:31|(1:33)))(1:16)|17|18|19|20|21|(1:23)(11:25|12|13|14|(0)(0)|17|18|19|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r10 = r10;
        r9 = r9;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:14:0x0065, B:16:0x0069, B:31:0x0071, B:34:0x0078), top: B:13:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v10, types: [vz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0054 -> B:12:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object oh6vYeIP(long j, defpackage.zh zhVar, defpackage.fj fjVar) {
        defpackage.aw0 aw0Var;
        int i;
        defpackage.rz0 rz0Var;
        defpackage.aw0 aw0Var2;
        java.lang.Throwable th;
        java.lang.Object hkbnNdmy;
        defpackage.vj vjVar;
        defpackage.zh zhVar2;
        if (fjVar instanceof defpackage.aw0) {
            aw0Var = (defpackage.aw0) fjVar;
            int i2 = aw0Var.DFo87pBq1E5;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aw0Var.DFo87pBq1E5 = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aw0Var.ez2rX8ReCYw;
                i = aw0Var.DFo87pBq1E5;
                defpackage.ej ejVar = null;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.rz0 rz0Var2 = new defpackage.rz0();
                    defpackage.AARZUJiTa aARZUJiTa = new defpackage.AARZUJiTa(rz0Var2, this, ejVar, 12);
                    aw0Var.riuEU0zW4 = zhVar;
                    aw0Var.SH1y5HwkJhh = rz0Var2;
                    aw0Var.EXtogiMhuM = j;
                    aw0Var.DFo87pBq1E5 = 1;
                    hkbnNdmy = defpackage.s70.hkbnNdmy(j, aARZUJiTa, aw0Var);
                    vjVar = defpackage.vj.adDC3e2L;
                    if (hkbnNdmy == vjVar) {
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = aw0Var.EXtogiMhuM;
                    defpackage.rz0 rz0Var3 = aw0Var.SH1y5HwkJhh;
                    ?? r1 = aw0Var.riuEU0zW4;
                    try {
                        defpackage.f70.nBH8hAHy(obj);
                        zhVar2 = r1;
                    } catch (java.lang.Throwable th2) {
                        rz0Var = rz0Var3;
                        zhVar = r1;
                        aw0Var2 = aw0Var;
                        th = th2;
                    }
                    rz0Var = rz0Var3;
                    zhVar = zhVar2;
                    aw0Var2 = aw0Var;
                    th = null;
                    try {
                        if (th instanceof defpackage.yg1) {
                            zhVar.IHQe1A4L2xu();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            java.lang.Object obj2 = rz0Var.adDC3e2L;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        aw0Var = aw0Var2;
                        defpackage.rz0 rz0Var22 = new defpackage.rz0();
                        defpackage.AARZUJiTa aARZUJiTa2 = new defpackage.AARZUJiTa(rz0Var22, this, ejVar, 12);
                        aw0Var.riuEU0zW4 = zhVar;
                        aw0Var.SH1y5HwkJhh = rz0Var22;
                        aw0Var.EXtogiMhuM = j;
                        aw0Var.DFo87pBq1E5 = 1;
                        hkbnNdmy = defpackage.s70.hkbnNdmy(j, aARZUJiTa2, aw0Var);
                        vjVar = defpackage.vj.adDC3e2L;
                        if (hkbnNdmy == vjVar) {
                            return vjVar;
                        }
                        zhVar2 = zhVar;
                        rz0Var3 = rz0Var22;
                        rz0Var = rz0Var3;
                        zhVar = zhVar2;
                        aw0Var2 = aw0Var;
                        th = null;
                        if (th instanceof defpackage.yg1) {
                        }
                        aw0Var = aw0Var2;
                        defpackage.rz0 rz0Var222 = new defpackage.rz0();
                        defpackage.AARZUJiTa aARZUJiTa22 = new defpackage.AARZUJiTa(rz0Var222, this, ejVar, 12);
                        aw0Var.riuEU0zW4 = zhVar;
                        aw0Var.SH1y5HwkJhh = rz0Var222;
                        aw0Var.EXtogiMhuM = j;
                        aw0Var.DFo87pBq1E5 = 1;
                        hkbnNdmy = defpackage.s70.hkbnNdmy(j, aARZUJiTa22, aw0Var);
                        vjVar = defpackage.vj.adDC3e2L;
                        if (hkbnNdmy == vjVar) {
                        }
                    } catch (java.lang.Throwable th3) {
                        defpackage.ei eiVar = (defpackage.ei) rz0Var.adDC3e2L;
                        if (eiVar != null) {
                            adDC3e2L(eiVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        aw0Var = new defpackage.aw0(this, fjVar);
        java.lang.Object obj3 = aw0Var.ez2rX8ReCYw;
        i = aw0Var.DFo87pBq1E5;
        defpackage.ej ejVar2 = null;
        if (i != 0) {
        }
    }

    public final void r1MBDhnF() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.r1MBDhnF;
        reentrantLock.lock();
        try {
            this.adDC3e2L = true;
            for (defpackage.ei eiVar : this.xiZrDbcSW0) {
                if (eiVar != null) {
                    eiVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
