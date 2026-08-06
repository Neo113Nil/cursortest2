package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dk implements defpackage.zj {
    public final long GE9mJIPrb8gP;
    public final int Ns0WNyEWdPsk;
    public final java.lang.ThreadLocal P05cfTpS5W5L;
    public final defpackage.pa1 QiMR8OkAhezm;
    public final defpackage.o01 WDYagTQQm9ns;
    public volatile boolean e6mdH7fiFuta;
    public final defpackage.o01 oh71FJcDz6S2;

    public dk(final defpackage.n80 n80Var, final java.lang.String str, int i) {
        long zJPqDeoF0Os1;
        str.getClass();
        this.QiMR8OkAhezm = new defpackage.pa1(23);
        this.P05cfTpS5W5L = new java.lang.ThreadLocal();
        defpackage.pa1 pa1Var = defpackage.jt.WDYagTQQm9ns;
        defpackage.mt mtVar = defpackage.mt.SECONDS;
        if (mtVar.compareTo(mtVar) <= 0) {
            int i2 = defpackage.kt.ZpBGe2uQfcn8;
            zJPqDeoF0Os1 = 60000000000L;
        } else {
            zJPqDeoF0Os1 = defpackage.vx1.zJPqDeoF0Os1(30L, mtVar);
        }
        this.GE9mJIPrb8gP = zJPqDeoF0Os1;
        this.Ns0WNyEWdPsk = 2;
        if (i <= 0) {
            defpackage.h7.w7APNrr0aGRc("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i3 = 0;
        this.WDYagTQQm9ns = new defpackage.o01(i, new defpackage.n10() { // from class: ak
            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                int i4 = i3;
                java.lang.String str2 = str;
                defpackage.n80 n80Var2 = n80Var;
                switch (i4) {
                    case 0:
                        defpackage.y61 giKS3J6vZuNy = n80Var2.giKS3J6vZuNy(str2);
                        defpackage.b80.T1fB7bDYiVJQ(giKS3J6vZuNy, "PRAGMA query_only = 1");
                        return giKS3J6vZuNy;
                    default:
                        return n80Var2.giKS3J6vZuNy(str2);
                }
            }
        });
        final int i4 = 1;
        this.oh71FJcDz6S2 = new defpackage.o01(1, new defpackage.n10() { // from class: ak
            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                int i42 = i4;
                java.lang.String str2 = str;
                defpackage.n80 n80Var2 = n80Var;
                switch (i42) {
                    case 0:
                        defpackage.y61 giKS3J6vZuNy = n80Var2.giKS3J6vZuNy(str2);
                        defpackage.b80.T1fB7bDYiVJQ(giKS3J6vZuNy, "PRAGMA query_only = 1");
                        return giKS3J6vZuNy;
                    default:
                        return n80Var2.giKS3J6vZuNy(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e6mdH7fiFuta) {
            return;
        }
        this.e6mdH7fiFuta = true;
        this.WDYagTQQm9ns.fWTAfUmVKrZq();
        this.oh71FJcDz6S2.fWTAfUmVKrZq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:55:0x0124, B:59:0x0140, B:61:0x014b, B:65:0x01aa, B:66:0x01b1), top: B:54:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:55:0x0124, B:59:0x0140, B:61:0x014b, B:65:0x01aa, B:66:0x01b1), top: B:54:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h3m55N1URyyK(boolean z, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.ck ckVar;
        int i;
        defpackage.z31 z31Var;
        java.lang.Throwable th;
        defpackage.o01 o01Var;
        defpackage.jm jmVar;
        defpackage.c20 c20Var2;
        defpackage.pa1 pa1Var;
        defpackage.o01 o01Var2;
        defpackage.z31 z31Var2;
        java.lang.Object obj;
        defpackage.z31 z31Var3;
        defpackage.w01 w01Var;
        boolean z2 = z;
        try {
            if (llVar instanceof defpackage.ck) {
                ckVar = (defpackage.ck) llVar;
                int i2 = ckVar.WmetiUbpKU9I;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ckVar.WmetiUbpKU9I = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj2 = ckVar.T1fB7bDYiVJQ;
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    i = ckVar.WmetiUbpKU9I;
                    defpackage.jm jmVar2 = null;
                    java.lang.Object[] objArr = 0;
                    java.lang.Object[] objArr2 = 0;
                    java.lang.Object[] objArr3 = 0;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj2);
                        if (this.e6mdH7fiFuta) {
                            defpackage.b80.IBvW5fLsPuHy("Connection pool is closed", 21);
                            throw null;
                        }
                        defpackage.w01 w01Var2 = (defpackage.w01) this.P05cfTpS5W5L.get();
                        if (w01Var2 == null) {
                            defpackage.jm jmVar3 = ckVar.oh71FJcDz6S2;
                            jmVar3.getClass();
                            defpackage.yj yjVar = (defpackage.yj) jmVar3.XntWc4eZSQ8j(this.QiMR8OkAhezm);
                            w01Var2 = yjVar != null ? yjVar.oh71FJcDz6S2 : null;
                        }
                        if (w01Var2 == null) {
                            defpackage.o01 o01Var3 = z2 ? this.WDYagTQQm9ns : this.oh71FJcDz6S2;
                            z31Var = new defpackage.z31();
                            try {
                                jmVar = ckVar.oh71FJcDz6S2;
                                jmVar.getClass();
                                defpackage.pa1 pa1Var2 = this.QiMR8OkAhezm;
                                long j = this.GE9mJIPrb8gP;
                                defpackage.bk bkVar = new defpackage.bk(this, z2);
                                ckVar.e6mdH7fiFuta = c20Var;
                                ckVar.GE9mJIPrb8gP = o01Var3;
                                ckVar.Ns0WNyEWdPsk = z31Var;
                                ckVar.fNwYGHIYeJcR = jmVar;
                                ckVar.h3m55N1URyyK = z31Var;
                                ckVar.gUjdnLbkVAaA = pa1Var2;
                                ckVar.P05cfTpS5W5L = z2;
                                ckVar.WmetiUbpKU9I = 3;
                                java.lang.Object giKS3J6vZuNy = o01Var3.giKS3J6vZuNy(j, bkVar, ckVar);
                                if (giKS3J6vZuNy != tmVar) {
                                    c20Var2 = c20Var;
                                    pa1Var = pa1Var2;
                                    o01Var2 = o01Var3;
                                    obj2 = giKS3J6vZuNy;
                                    z31Var2 = z31Var;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                o01Var = o01Var3;
                                throw th;
                            }
                        } else {
                            if (!z2 && w01Var2.fWTAfUmVKrZq) {
                                defpackage.b80.IBvW5fLsPuHy("Cannot upgrade connection from reader to writer", 1);
                                throw null;
                            }
                            defpackage.jm jmVar4 = ckVar.oh71FJcDz6S2;
                            jmVar4.getClass();
                            if (jmVar4.XntWc4eZSQ8j(this.QiMR8OkAhezm) == null) {
                                defpackage.yj yjVar2 = new defpackage.yj(this.QiMR8OkAhezm, w01Var2);
                                java.lang.ThreadLocal threadLocal = this.P05cfTpS5W5L;
                                threadLocal.getClass();
                                defpackage.jm zJPqDeoF0Os1 = defpackage.h0.zJPqDeoF0Os1(yjVar2, new defpackage.wn1(w01Var2, threadLocal));
                                defpackage.JhCgjQRTAOCT jhCgjQRTAOCT = new defpackage.JhCgjQRTAOCT(c20Var, w01Var2, objArr == true ? 1 : 0, 10);
                                ckVar.WmetiUbpKU9I = 1;
                                java.lang.Object fhbmYuu9J3cT = defpackage.ok0.fhbmYuu9J3cT(zJPqDeoF0Os1, jhCgjQRTAOCT, ckVar);
                                if (fhbmYuu9J3cT != tmVar) {
                                    return fhbmYuu9J3cT;
                                }
                            } else {
                                ckVar.WmetiUbpKU9I = 2;
                                java.lang.Object QiMR8OkAhezm = c20Var.QiMR8OkAhezm(w01Var2, ckVar);
                                if (QiMR8OkAhezm != tmVar) {
                                    return QiMR8OkAhezm;
                                }
                            }
                        }
                        return tmVar;
                    }
                    if (i == 1) {
                        defpackage.b80.KrtOTfE6jiS2(obj2);
                        return obj2;
                    }
                    if (i == 2) {
                        defpackage.b80.KrtOTfE6jiS2(obj2);
                        return obj2;
                    }
                    if (i == 3) {
                        z2 = ckVar.P05cfTpS5W5L;
                        pa1Var = ckVar.gUjdnLbkVAaA;
                        defpackage.z31 z31Var4 = ckVar.h3m55N1URyyK;
                        defpackage.jm jmVar5 = ckVar.fNwYGHIYeJcR;
                        defpackage.z31 z31Var5 = ckVar.Ns0WNyEWdPsk;
                        o01Var2 = (defpackage.o01) ckVar.GE9mJIPrb8gP;
                        c20Var2 = (defpackage.c20) ckVar.e6mdH7fiFuta;
                        try {
                            defpackage.b80.KrtOTfE6jiS2(obj2);
                            z31Var2 = z31Var4;
                            z31Var = z31Var5;
                            jmVar = jmVar5;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            z31Var = z31Var5;
                            o01Var = o01Var2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z31Var3 = (defpackage.z31) ckVar.GE9mJIPrb8gP;
                        o01Var = (defpackage.o01) ckVar.e6mdH7fiFuta;
                        try {
                            defpackage.b80.KrtOTfE6jiS2(obj2);
                            w01Var = (defpackage.w01) z31Var3.WDYagTQQm9ns;
                            if (w01Var != null) {
                                if (!w01Var.WDYagTQQm9ns) {
                                    w01Var.WDYagTQQm9ns = true;
                                    if (w01Var.giKS3J6vZuNy.WDYagTQQm9ns.gUjdnLbkVAaA()) {
                                        defpackage.b80.T1fB7bDYiVJQ(w01Var.giKS3J6vZuNy, "ROLLBACK TRANSACTION");
                                    }
                                }
                                defpackage.gk gkVar = w01Var.giKS3J6vZuNy;
                                gkVar.QiMR8OkAhezm = null;
                                gkVar.P05cfTpS5W5L = null;
                                o01Var.WDYagTQQm9ns(gkVar);
                            }
                            return obj2;
                        } catch (java.lang.Throwable th4) {
                            z31Var = z31Var3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    defpackage.gk gkVar2 = (defpackage.gk) obj2;
                    gkVar2.getClass();
                    jmVar.getClass();
                    gkVar2.QiMR8OkAhezm = jmVar;
                    gkVar2.P05cfTpS5W5L = new java.lang.Throwable();
                    z31Var2.WDYagTQQm9ns = new defpackage.w01(pa1Var, gkVar2, this.WDYagTQQm9ns == this.oh71FJcDz6S2 && z2);
                    obj = z31Var.WDYagTQQm9ns;
                    if (obj != null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    defpackage.w01 w01Var3 = (defpackage.w01) obj;
                    defpackage.yj yjVar3 = new defpackage.yj(this.QiMR8OkAhezm, w01Var3);
                    java.lang.ThreadLocal threadLocal2 = this.P05cfTpS5W5L;
                    threadLocal2.getClass();
                    defpackage.jm zJPqDeoF0Os12 = defpackage.h0.zJPqDeoF0Os1(yjVar3, new defpackage.wn1(w01Var3, threadLocal2));
                    defpackage.JhCgjQRTAOCT jhCgjQRTAOCT2 = new defpackage.JhCgjQRTAOCT(c20Var2, z31Var, objArr2 == true ? 1 : 0, 11);
                    ckVar.e6mdH7fiFuta = o01Var2;
                    ckVar.GE9mJIPrb8gP = z31Var;
                    ckVar.Ns0WNyEWdPsk = null;
                    ckVar.fNwYGHIYeJcR = null;
                    ckVar.h3m55N1URyyK = null;
                    ckVar.gUjdnLbkVAaA = null;
                    ckVar.WmetiUbpKU9I = 4;
                    obj2 = defpackage.ok0.fhbmYuu9J3cT(zJPqDeoF0Os12, jhCgjQRTAOCT2, ckVar);
                    if (obj2 != tmVar) {
                        z31Var3 = z31Var;
                        o01Var = o01Var2;
                        w01Var = (defpackage.w01) z31Var3.WDYagTQQm9ns;
                        if (w01Var != null) {
                        }
                        return obj2;
                    }
                    return tmVar;
                }
            }
            defpackage.gk gkVar22 = (defpackage.gk) obj2;
            gkVar22.getClass();
            jmVar.getClass();
            gkVar22.QiMR8OkAhezm = jmVar;
            gkVar22.P05cfTpS5W5L = new java.lang.Throwable();
            z31Var2.WDYagTQQm9ns = new defpackage.w01(pa1Var, gkVar22, this.WDYagTQQm9ns == this.oh71FJcDz6S2 && z2);
            obj = z31Var.WDYagTQQm9ns;
            if (obj != null) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            o01Var = o01Var2;
            throw th;
        }
        ckVar = new defpackage.ck(this, llVar);
        java.lang.Object obj22 = ckVar.T1fB7bDYiVJQ;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
        i = ckVar.WmetiUbpKU9I;
        defpackage.jm jmVar22 = null;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr32 = 0;
        if (i != 0) {
        }
    }

    public dk(defpackage.n80 n80Var) {
        long zJPqDeoF0Os1;
        this.QiMR8OkAhezm = new defpackage.pa1(23);
        this.P05cfTpS5W5L = new java.lang.ThreadLocal();
        defpackage.pa1 pa1Var = defpackage.jt.WDYagTQQm9ns;
        defpackage.mt mtVar = defpackage.mt.SECONDS;
        if (mtVar.compareTo(mtVar) <= 0) {
            int i = defpackage.kt.ZpBGe2uQfcn8;
            zJPqDeoF0Os1 = 60000000000L;
        } else {
            zJPqDeoF0Os1 = defpackage.vx1.zJPqDeoF0Os1(30L, mtVar);
        }
        this.GE9mJIPrb8gP = zJPqDeoF0Os1;
        this.Ns0WNyEWdPsk = 2;
        defpackage.o01 o01Var = new defpackage.o01(1, new defpackage.l3(5, n80Var));
        this.WDYagTQQm9ns = o01Var;
        this.oh71FJcDz6S2 = o01Var;
    }
}
