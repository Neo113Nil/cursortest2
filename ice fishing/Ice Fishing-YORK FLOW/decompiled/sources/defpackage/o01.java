package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o01 {
    public int JhCgjQRTAOCT;
    public final defpackage.p7 P05cfTpS5W5L;
    public final defpackage.yb1 QiMR8OkAhezm;
    public boolean WDYagTQQm9ns;
    public final int ZpBGe2uQfcn8;
    public final java.util.concurrent.locks.ReentrantLock fWTAfUmVKrZq = new java.util.concurrent.locks.ReentrantLock();
    public final defpackage.n10 giKS3J6vZuNy;
    public final defpackage.gk[] oh71FJcDz6S2;

    public o01(int i, defpackage.n10 n10Var) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = n10Var;
        this.oh71FJcDz6S2 = new defpackage.gk[i];
        int i2 = defpackage.zb1.ZpBGe2uQfcn8;
        this.QiMR8OkAhezm = new defpackage.yb1(i);
        this.P05cfTpS5W5L = new defpackage.p7(i);
    }

    public final void JhCgjQRTAOCT(java.lang.StringBuilder sb) {
        defpackage.p7 p7Var = this.P05cfTpS5W5L;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.fWTAfUmVKrZq;
        reentrantLock.lock();
        try {
            defpackage.wh0 XntWc4eZSQ8j = defpackage.ma0.XntWc4eZSQ8j();
            int i = p7Var.QiMR8OkAhezm;
            for (int i2 = 0; i2 < i; i2++) {
                XntWc4eZSQ8j.add(p7Var.get(i2));
            }
            defpackage.wh0 GE9mJIPrb8gP = defpackage.ma0.GE9mJIPrb8gP(XntWc4eZSQ8j);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.ZpBGe2uQfcn8 + ", ");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("permits=");
            defpackage.yb1 yb1Var = this.QiMR8OkAhezm;
            yb1Var.getClass();
            sb2.append(java.lang.Math.max(defpackage.xb1.Ns0WNyEWdPsk.get(yb1Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + GE9mJIPrb8gP.ZpBGe2uQfcn8() + ")[" + defpackage.hf.m6iZQUu7XjoL(GE9mJIPrb8gP, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            defpackage.gk[] gkVarArr = this.oh71FJcDz6S2;
            int length = gkVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                defpackage.gk gkVar = gkVarArr[i4];
                i3++;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(gkVar != null ? gkVar.WDYagTQQm9ns.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (gkVar != null) {
                    gkVar.QiMR8OkAhezm(sb);
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void WDYagTQQm9ns(defpackage.gk gkVar) {
        gkVar.getClass();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.fWTAfUmVKrZq;
        reentrantLock.lock();
        try {
            this.P05cfTpS5W5L.addLast(gkVar);
            reentrantLock.unlock();
            this.QiMR8OkAhezm.fWTAfUmVKrZq();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0061, code lost:
    
        r1.GE9mJIPrb8gP(r5, r4.oh71FJcDz6S2);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c0), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c0), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.ll llVar) {
        defpackage.m01 m01Var;
        int i;
        defpackage.yb1 yb1Var;
        int andDecrement;
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        defpackage.p7 p7Var = this.P05cfTpS5W5L;
        try {
            try {
                if (llVar instanceof defpackage.m01) {
                    m01Var = (defpackage.m01) llVar;
                    int i2 = m01Var.GE9mJIPrb8gP;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        m01Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj = m01Var.P05cfTpS5W5L;
                        i = m01Var.GE9mJIPrb8gP;
                        yb1Var = this.QiMR8OkAhezm;
                        if (i != 0) {
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            m01Var.GE9mJIPrb8gP = 1;
                            yb1Var.getClass();
                            int i3 = yb1Var.WDYagTQQm9ns;
                            do {
                                andDecrement = defpackage.xb1.Ns0WNyEWdPsk.getAndDecrement(yb1Var);
                            } while (andDecrement > i3);
                            java.lang.Object obj2 = defpackage.gs1.ZpBGe2uQfcn8;
                            java.lang.Object obj3 = defpackage.tm.WDYagTQQm9ns;
                            if (andDecrement <= 0) {
                                defpackage.dd frSwwKIlbUhK = defpackage.nq1.frSwwKIlbUhK(defpackage.q70.OcTWLQzke1i2(m01Var));
                                try {
                                    if (!yb1Var.ZpBGe2uQfcn8(frSwwKIlbUhK)) {
                                        while (true) {
                                            int andDecrement2 = defpackage.xb1.Ns0WNyEWdPsk.getAndDecrement(yb1Var);
                                            if (andDecrement2 <= i3) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (yb1Var.ZpBGe2uQfcn8(frSwwKIlbUhK)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    java.lang.Object w7APNrr0aGRc = frSwwKIlbUhK.w7APNrr0aGRc();
                                    java.lang.Object obj4 = w7APNrr0aGRc;
                                    if (w7APNrr0aGRc != obj3) {
                                        obj4 = obj2;
                                    }
                                    if (obj4 == obj3) {
                                        obj2 = obj4;
                                    }
                                } catch (java.lang.Throwable th) {
                                    frSwwKIlbUhK.jjTN4uUnoyEn();
                                    throw th;
                                }
                            }
                            if (obj2 == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i != 1) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.b80.KrtOTfE6jiS2(obj);
                        }
                        reentrantLock = this.fWTAfUmVKrZq;
                        reentrantLock.lock();
                        if (!this.WDYagTQQm9ns) {
                            defpackage.b80.IBvW5fLsPuHy("Connection pool is closed", 21);
                            throw null;
                        }
                        if (p7Var.isEmpty() && this.JhCgjQRTAOCT < this.ZpBGe2uQfcn8) {
                            defpackage.gk gkVar = new defpackage.gk((defpackage.y61) this.giKS3J6vZuNy.ZpBGe2uQfcn8());
                            defpackage.gk[] gkVarArr = this.oh71FJcDz6S2;
                            int i4 = this.JhCgjQRTAOCT;
                            this.JhCgjQRTAOCT = i4 + 1;
                            gkVarArr[i4] = gkVar;
                            p7Var.addLast(gkVar);
                        }
                        return (defpackage.gk) p7Var.removeLast();
                    }
                }
                if (!this.WDYagTQQm9ns) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.fWTAfUmVKrZq;
            reentrantLock.lock();
        } catch (java.lang.Throwable th2) {
            yb1Var.fWTAfUmVKrZq();
            throw th2;
        }
        m01Var = new defpackage.m01(this, llVar);
        java.lang.Object obj5 = m01Var.P05cfTpS5W5L;
        i = m01Var.GE9mJIPrb8gP;
        yb1Var = this.QiMR8OkAhezm;
        if (i != 0) {
        }
    }

    public final void fWTAfUmVKrZq() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.fWTAfUmVKrZq;
        reentrantLock.lock();
        try {
            this.WDYagTQQm9ns = true;
            for (defpackage.gk gkVar : this.oh71FJcDz6S2) {
                if (gkVar != null) {
                    gkVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
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
    /* JADX WARN: Type inference failed for: r1v10, types: [n10] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0054 -> B:12:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object giKS3J6vZuNy(long j, defpackage.bk bkVar, defpackage.ll llVar) {
        defpackage.n01 n01Var;
        int i;
        defpackage.z31 z31Var;
        defpackage.n01 n01Var2;
        java.lang.Throwable th;
        java.lang.Object KrtOTfE6jiS2;
        defpackage.tm tmVar;
        defpackage.bk bkVar2;
        if (llVar instanceof defpackage.n01) {
            n01Var = (defpackage.n01) llVar;
            int i2 = n01Var.h3m55N1URyyK;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n01Var.h3m55N1URyyK = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = n01Var.Ns0WNyEWdPsk;
                i = n01Var.h3m55N1URyyK;
                defpackage.kl klVar = null;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.z31 z31Var2 = new defpackage.z31();
                    defpackage.oh71FJcDz6S2 oh71fjcdz6s2 = new defpackage.oh71FJcDz6S2(z31Var2, this, klVar, 11);
                    n01Var.e6mdH7fiFuta = bkVar;
                    n01Var.GE9mJIPrb8gP = z31Var2;
                    n01Var.P05cfTpS5W5L = j;
                    n01Var.h3m55N1URyyK = 1;
                    KrtOTfE6jiS2 = defpackage.n70.KrtOTfE6jiS2(j, oh71fjcdz6s2, n01Var);
                    tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (KrtOTfE6jiS2 == tmVar) {
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = n01Var.P05cfTpS5W5L;
                    defpackage.z31 z31Var3 = n01Var.GE9mJIPrb8gP;
                    ?? r1 = n01Var.e6mdH7fiFuta;
                    try {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        bkVar2 = r1;
                    } catch (java.lang.Throwable th2) {
                        z31Var = z31Var3;
                        bkVar = r1;
                        n01Var2 = n01Var;
                        th = th2;
                    }
                    z31Var = z31Var3;
                    bkVar = bkVar2;
                    n01Var2 = n01Var;
                    th = null;
                    try {
                        if (th instanceof defpackage.go1) {
                            bkVar.ZpBGe2uQfcn8();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            java.lang.Object obj2 = z31Var.WDYagTQQm9ns;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        n01Var = n01Var2;
                        defpackage.z31 z31Var22 = new defpackage.z31();
                        defpackage.oh71FJcDz6S2 oh71fjcdz6s22 = new defpackage.oh71FJcDz6S2(z31Var22, this, klVar, 11);
                        n01Var.e6mdH7fiFuta = bkVar;
                        n01Var.GE9mJIPrb8gP = z31Var22;
                        n01Var.P05cfTpS5W5L = j;
                        n01Var.h3m55N1URyyK = 1;
                        KrtOTfE6jiS2 = defpackage.n70.KrtOTfE6jiS2(j, oh71fjcdz6s22, n01Var);
                        tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (KrtOTfE6jiS2 == tmVar) {
                            return tmVar;
                        }
                        bkVar2 = bkVar;
                        z31Var3 = z31Var22;
                        z31Var = z31Var3;
                        bkVar = bkVar2;
                        n01Var2 = n01Var;
                        th = null;
                        if (th instanceof defpackage.go1) {
                        }
                        n01Var = n01Var2;
                        defpackage.z31 z31Var222 = new defpackage.z31();
                        defpackage.oh71FJcDz6S2 oh71fjcdz6s222 = new defpackage.oh71FJcDz6S2(z31Var222, this, klVar, 11);
                        n01Var.e6mdH7fiFuta = bkVar;
                        n01Var.GE9mJIPrb8gP = z31Var222;
                        n01Var.P05cfTpS5W5L = j;
                        n01Var.h3m55N1URyyK = 1;
                        KrtOTfE6jiS2 = defpackage.n70.KrtOTfE6jiS2(j, oh71fjcdz6s222, n01Var);
                        tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (KrtOTfE6jiS2 == tmVar) {
                        }
                    } catch (java.lang.Throwable th3) {
                        defpackage.gk gkVar = (defpackage.gk) z31Var.WDYagTQQm9ns;
                        if (gkVar != null) {
                            WDYagTQQm9ns(gkVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        n01Var = new defpackage.n01(this, llVar);
        java.lang.Object obj3 = n01Var.Ns0WNyEWdPsk;
        i = n01Var.h3m55N1URyyK;
        defpackage.kl klVar2 = null;
        if (i != 0) {
        }
    }
}
