package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w01 implements defpackage.xo1, defpackage.y21 {
    public final defpackage.p7 JhCgjQRTAOCT;
    public volatile boolean WDYagTQQm9ns;
    public final defpackage.pa1 ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final defpackage.gk giKS3J6vZuNy;

    public w01(defpackage.pa1 pa1Var, defpackage.gk gkVar, boolean z) {
        pa1Var.getClass();
        this.ZpBGe2uQfcn8 = pa1Var;
        this.giKS3J6vZuNy = gkVar;
        this.fWTAfUmVKrZq = z;
        this.JhCgjQRTAOCT = new defpackage.p7();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.p01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str, defpackage.y10 y10Var, defpackage.ll llVar) {
        defpackage.v01 v01Var;
        int i;
        defpackage.gk gkVar;
        try {
            try {
                if (llVar instanceof defpackage.v01) {
                    v01Var = (defpackage.v01) llVar;
                    int i2 = v01Var.h3m55N1URyyK;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        v01Var.h3m55N1URyyK = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj = v01Var.Ns0WNyEWdPsk;
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        i = v01Var.h3m55N1URyyK;
                        if (i != 0) {
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            if (this.WDYagTQQm9ns) {
                                defpackage.b80.IBvW5fLsPuHy("Connection is recycled", 21);
                                throw null;
                            }
                            defpackage.jm jmVar = v01Var.oh71FJcDz6S2;
                            jmVar.getClass();
                            defpackage.yj yjVar = (defpackage.yj) jmVar.XntWc4eZSQ8j(this.ZpBGe2uQfcn8);
                            if (yjVar == null || yjVar.oh71FJcDz6S2 != this) {
                                defpackage.b80.IBvW5fLsPuHy("Attempted to use connection on a different coroutine", 21);
                                throw null;
                            }
                            gkVar = this.giKS3J6vZuNy;
                            v01Var.P05cfTpS5W5L = str;
                            v01Var.e6mdH7fiFuta = y10Var;
                            v01Var.GE9mJIPrb8gP = gkVar;
                            v01Var.h3m55N1URyyK = 1;
                            if (gkVar.oh71FJcDz6S2.JhCgjQRTAOCT(v01Var) == tmVar) {
                                return tmVar;
                            }
                        } else {
                            if (i != 1) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.gk gkVar2 = v01Var.GE9mJIPrb8gP;
                            y10Var = v01Var.e6mdH7fiFuta;
                            java.lang.String str2 = v01Var.P05cfTpS5W5L;
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            gkVar = gkVar2;
                            str = str2;
                        }
                        defpackage.q01 q01Var = new defpackage.q01(this, this.giKS3J6vZuNy.UmgHb6n58gfG(str));
                        java.lang.Object P05cfTpS5W5L = y10Var.P05cfTpS5W5L(q01Var);
                        defpackage.vx1.T1fB7bDYiVJQ(q01Var, null);
                        return P05cfTpS5W5L;
                    }
                }
                java.lang.Object P05cfTpS5W5L2 = y10Var.P05cfTpS5W5L(q01Var);
                defpackage.vx1.T1fB7bDYiVJQ(q01Var, null);
                return P05cfTpS5W5L2;
            } finally {
            }
            defpackage.q01 q01Var2 = new defpackage.q01(this, this.giKS3J6vZuNy.UmgHb6n58gfG(str));
        } finally {
            gkVar.giKS3J6vZuNy(null);
        }
        v01Var = new defpackage.v01(this, llVar);
        java.lang.Object obj2 = v01Var.Ns0WNyEWdPsk;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
        i = v01Var.h3m55N1URyyK;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (WDYagTQQm9ns(r11, r0) == r8) goto L51;
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
    public final java.lang.Object QiMR8OkAhezm(defpackage.wo1 wo1Var, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.u01 u01Var;
        java.lang.Object obj;
        int i;
        java.lang.Object obj2;
        android.database.SQLException e;
        java.lang.Throwable th;
        int i2;
        try {
            if (llVar instanceof defpackage.u01) {
                u01Var = (defpackage.u01) llVar;
                int i3 = u01Var.h3m55N1URyyK;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    u01Var.h3m55N1URyyK = i3 - Integer.MIN_VALUE;
                    obj = u01Var.Ns0WNyEWdPsk;
                    i = u01Var.h3m55N1URyyK;
                    obj2 = defpackage.tm.WDYagTQQm9ns;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        if (wo1Var == null) {
                            wo1Var = defpackage.wo1.WDYagTQQm9ns;
                        }
                        u01Var.P05cfTpS5W5L = c20Var;
                        u01Var.h3m55N1URyyK = 1;
                    } else if (i == 1) {
                        c20Var = (defpackage.c20) u01Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    } else {
                        if (i == 2) {
                            i2 = u01Var.GE9mJIPrb8gP;
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            boolean z = i2 != 0;
                            u01Var.P05cfTpS5W5L = obj;
                            u01Var.h3m55N1URyyK = 3;
                            return oh71FJcDz6S2(z, u01Var) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            java.lang.Object obj3 = u01Var.P05cfTpS5W5L;
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = u01Var.e6mdH7fiFuta;
                        th = (java.lang.Throwable) u01Var.P05cfTpS5W5L;
                        try {
                            defpackage.b80.KrtOTfE6jiS2(obj);
                            throw th;
                        } catch (android.database.SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    defpackage.sw0 sw0Var = new defpackage.sw0(1, this);
                    u01Var.P05cfTpS5W5L = null;
                    u01Var.GE9mJIPrb8gP = 1;
                    u01Var.h3m55N1URyyK = 2;
                    obj = c20Var.QiMR8OkAhezm(sw0Var, u01Var);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        u01Var.P05cfTpS5W5L = obj;
                        u01Var.h3m55N1URyyK = 3;
                        if (oh71FJcDz6S2(z, u01Var) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            defpackage.sw0 sw0Var2 = new defpackage.sw0(1, this);
            u01Var.P05cfTpS5W5L = null;
            u01Var.GE9mJIPrb8gP = 1;
            u01Var.h3m55N1URyyK = 2;
            obj = c20Var.QiMR8OkAhezm(sw0Var2, u01Var);
            if (obj != obj2) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (java.lang.Throwable th3) {
                try {
                    u01Var.P05cfTpS5W5L = th;
                    u01Var.e6mdH7fiFuta = th3;
                    u01Var.h3m55N1URyyK = 5;
                    if (oh71FJcDz6S2(false, u01Var) != obj2) {
                        throw th3;
                    }
                } catch (android.database.SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    defpackage.i61.P05cfTpS5W5L(th, e);
                    throw th;
                }
            }
        }
        u01Var = new defpackage.u01(this, llVar);
        obj = u01Var.Ns0WNyEWdPsk;
        i = u01Var.h3m55N1URyyK;
        obj2 = defpackage.tm.WDYagTQQm9ns;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object WDYagTQQm9ns(defpackage.wo1 wo1Var, defpackage.ll llVar) {
        defpackage.s01 s01Var;
        int i;
        defpackage.gk gkVar;
        defpackage.p7 p7Var = this.JhCgjQRTAOCT;
        try {
            if (llVar instanceof defpackage.s01) {
                s01Var = (defpackage.s01) llVar;
                int i2 = s01Var.fNwYGHIYeJcR;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    s01Var.fNwYGHIYeJcR = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = s01Var.GE9mJIPrb8gP;
                    i = s01Var.fNwYGHIYeJcR;
                    defpackage.gk gkVar2 = this.giKS3J6vZuNy;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        s01Var.P05cfTpS5W5L = wo1Var;
                        s01Var.e6mdH7fiFuta = gkVar2;
                        s01Var.fNwYGHIYeJcR = 1;
                        java.lang.Object JhCgjQRTAOCT = gkVar2.oh71FJcDz6S2.JhCgjQRTAOCT(s01Var);
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (JhCgjQRTAOCT == tmVar) {
                            return tmVar;
                        }
                        gkVar = gkVar2;
                    } else {
                        if (i != 1) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.gk gkVar3 = s01Var.e6mdH7fiFuta;
                        defpackage.wo1 wo1Var2 = s01Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        gkVar = gkVar3;
                        wo1Var = wo1Var2;
                    }
                    int i3 = p7Var.QiMR8OkAhezm;
                    if (p7Var.isEmpty()) {
                        defpackage.b80.T1fB7bDYiVJQ(gkVar2, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = wo1Var.ordinal();
                        if (ordinal == 0) {
                            defpackage.b80.T1fB7bDYiVJQ(gkVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            defpackage.b80.T1fB7bDYiVJQ(gkVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new defpackage.vg();
                            }
                            defpackage.b80.T1fB7bDYiVJQ(gkVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    p7Var.addLast(new defpackage.r01(i3));
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    gkVar.giKS3J6vZuNy(null);
                    return gs1Var;
                }
            }
            int i32 = p7Var.QiMR8OkAhezm;
            if (p7Var.isEmpty()) {
            }
            p7Var.addLast(new defpackage.r01(i32));
            defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
            gkVar.giKS3J6vZuNy(null);
            return gs1Var2;
        } catch (java.lang.Throwable th) {
            gkVar.giKS3J6vZuNy(null);
            throw th;
        }
        s01Var = new defpackage.s01(this, llVar);
        java.lang.Object obj2 = s01Var.GE9mJIPrb8gP;
        i = s01Var.fNwYGHIYeJcR;
        defpackage.gk gkVar22 = this.giKS3J6vZuNy;
        if (i != 0) {
        }
    }

    @Override // defpackage.xo1
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.wo1 wo1Var, defpackage.c20 c20Var, defpackage.mi1 mi1Var) {
        if (this.WDYagTQQm9ns) {
            defpackage.b80.IBvW5fLsPuHy("Connection is recycled", 21);
            throw null;
        }
        defpackage.jm jmVar = mi1Var.oh71FJcDz6S2;
        jmVar.getClass();
        defpackage.yj yjVar = (defpackage.yj) jmVar.XntWc4eZSQ8j(this.ZpBGe2uQfcn8);
        if (yjVar != null && yjVar.oh71FJcDz6S2 == this) {
            return QiMR8OkAhezm(wo1Var, c20Var, mi1Var);
        }
        defpackage.b80.IBvW5fLsPuHy("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // defpackage.xo1
    public final java.lang.Boolean fWTAfUmVKrZq(defpackage.kl klVar) {
        if (this.WDYagTQQm9ns) {
            defpackage.b80.IBvW5fLsPuHy("Connection is recycled", 21);
            throw null;
        }
        defpackage.jm jmVar = ((defpackage.ll) klVar).oh71FJcDz6S2;
        jmVar.getClass();
        defpackage.yj yjVar = (defpackage.yj) jmVar.XntWc4eZSQ8j(this.ZpBGe2uQfcn8);
        if (yjVar != null && yjVar.oh71FJcDz6S2 == this) {
            return java.lang.Boolean.valueOf(!this.JhCgjQRTAOCT.isEmpty() || this.giKS3J6vZuNy.WDYagTQQm9ns.gUjdnLbkVAaA());
        }
        defpackage.b80.IBvW5fLsPuHy("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // defpackage.y21
    public final defpackage.y61 giKS3J6vZuNy() {
        return this.giKS3J6vZuNy;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object oh71FJcDz6S2(boolean z, defpackage.ll llVar) {
        defpackage.t01 t01Var;
        int i;
        defpackage.gk gkVar;
        defpackage.p7 p7Var = this.JhCgjQRTAOCT;
        try {
            if (llVar instanceof defpackage.t01) {
                t01Var = (defpackage.t01) llVar;
                int i2 = t01Var.fNwYGHIYeJcR;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    t01Var.fNwYGHIYeJcR = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = t01Var.GE9mJIPrb8gP;
                    i = t01Var.fNwYGHIYeJcR;
                    defpackage.gk gkVar2 = this.giKS3J6vZuNy;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        t01Var.e6mdH7fiFuta = gkVar2;
                        t01Var.P05cfTpS5W5L = z;
                        t01Var.fNwYGHIYeJcR = 1;
                        java.lang.Object JhCgjQRTAOCT = gkVar2.oh71FJcDz6S2.JhCgjQRTAOCT(t01Var);
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (JhCgjQRTAOCT == tmVar) {
                            return tmVar;
                        }
                        gkVar = gkVar2;
                    } else {
                        if (i != 1) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = t01Var.P05cfTpS5W5L;
                        gkVar = t01Var.e6mdH7fiFuta;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    }
                    if (!p7Var.isEmpty()) {
                        throw new java.lang.IllegalStateException("Not in a transaction");
                    }
                    defpackage.r01 r01Var = (defpackage.r01) defpackage.nf.CZa7MwI9IzLd(p7Var);
                    if (z) {
                        r01Var.getClass();
                        if (p7Var.isEmpty()) {
                            defpackage.b80.T1fB7bDYiVJQ(gkVar2, "END TRANSACTION");
                        } else {
                            defpackage.b80.T1fB7bDYiVJQ(gkVar2, "RELEASE SAVEPOINT '" + r01Var.ZpBGe2uQfcn8 + '\'');
                        }
                    } else if (p7Var.isEmpty()) {
                        defpackage.b80.T1fB7bDYiVJQ(gkVar2, "ROLLBACK TRANSACTION");
                    } else {
                        defpackage.b80.T1fB7bDYiVJQ(gkVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + r01Var.ZpBGe2uQfcn8 + '\'');
                    }
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    gkVar.giKS3J6vZuNy(null);
                    return gs1Var;
                }
            }
            if (!p7Var.isEmpty()) {
            }
        } catch (java.lang.Throwable th) {
            gkVar.giKS3J6vZuNy(null);
            throw th;
        }
        t01Var = new defpackage.t01(this, llVar);
        java.lang.Object obj2 = t01Var.GE9mJIPrb8gP;
        i = t01Var.fNwYGHIYeJcR;
        defpackage.gk gkVar22 = this.giKS3J6vZuNy;
        if (i != 0) {
        }
    }
}
