package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gg1 extends defpackage.hH0RRJrNssvh implements defpackage.tx, defpackage.o20, defpackage.eg1, defpackage.co0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater GE9mJIPrb8gP = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.gg1.class, java.lang.Object.class, "_state$volatile");
    public static final /* synthetic */ long Ns0WNyEWdPsk = defpackage.ed.ZpBGe2uQfcn8.objectFieldOffset(defpackage.gg1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    public int e6mdH7fiFuta;

    public gg1(java.lang.Object obj) {
        this._state$volatile = obj;
    }

    public final boolean GE9mJIPrb8gP(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        defpackage.GcLuU6pT9wO9[] gcLuU6pT9wO9Arr;
        defpackage.ru ruVar;
        synchronized (this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GE9mJIPrb8gP;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !defpackage.ma0.QiMR8OkAhezm(obj3, obj)) {
                return false;
            }
            if (defpackage.ma0.QiMR8OkAhezm(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e6mdH7fiFuta;
            if ((i2 & 1) != 0) {
                this.e6mdH7fiFuta = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e6mdH7fiFuta = i3;
            defpackage.GcLuU6pT9wO9[] gcLuU6pT9wO9Arr2 = this.WDYagTQQm9ns;
            while (true) {
                defpackage.hg1[] hg1VarArr = (defpackage.hg1[]) gcLuU6pT9wO9Arr2;
                if (hg1VarArr != null) {
                    for (defpackage.hg1 hg1Var : hg1VarArr) {
                        if (hg1Var != null) {
                            java.util.concurrent.atomic.AtomicReference atomicReference = hg1Var.ZpBGe2uQfcn8;
                            while (true) {
                                java.lang.Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (ruVar = defpackage.nq1.ZVVdXbWmyCSK)) {
                                    defpackage.ru ruVar2 = defpackage.nq1.BHfvd2J71qpO;
                                    if (obj4 != ruVar2) {
                                        while (!atomicReference.compareAndSet(obj4, ruVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((defpackage.dd) obj4).e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, ruVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e6mdH7fiFuta;
                    if (i == i3) {
                        this.e6mdH7fiFuta = i3 + 1;
                        return true;
                    }
                    gcLuU6pT9wO9Arr = this.WDYagTQQm9ns;
                }
                gcLuU6pT9wO9Arr2 = gcLuU6pT9wO9Arr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.hH0RRJrNssvh
    public final defpackage.GcLuU6pT9wO9 JhCgjQRTAOCT() {
        return new defpackage.hg1();
    }

    public final boolean P05cfTpS5W5L(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ru ruVar = defpackage.ok0.WDYagTQQm9ns;
        if (obj == null) {
            obj = ruVar;
        }
        return GE9mJIPrb8gP(obj, obj2);
    }

    @Override // defpackage.hH0RRJrNssvh
    public final defpackage.GcLuU6pT9wO9[] WDYagTQQm9ns() {
        return new defpackage.hg1[2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        r1 = r1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r13.equals(r15) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (r9 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x007a, B:16:0x0082, B:19:0x0089, B:20:0x008d, B:24:0x0090, B:26:0x00b1, B:29:0x00c1, B:30:0x00dd, B:36:0x00ed, B:32:0x00e4, B:35:0x00ea, B:45:0x0096, B:48:0x009d, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x007a, B:16:0x0082, B:19:0x0089, B:20:0x008d, B:24:0x0090, B:26:0x00b1, B:29:0x00c1, B:30:0x00dd, B:36:0x00ed, B:32:0x00e4, B:35:0x00ea, B:45:0x0096, B:48:0x009d, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [hg1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [GcLuU6pT9wO9] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [hg1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [hg1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [hg1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hH0RRJrNssvh] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [gg1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gg1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [gg1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c0 -> B:14:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.tx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.ux uxVar, defpackage.kl klVar) {
        defpackage.fg1 fg1Var;
        ?? r1;
        defpackage.tm tmVar;
        ?? r8;
        defpackage.ux uxVar2;
        defpackage.cb0 cb0Var;
        java.lang.Object obj;
        java.lang.Object andSet;
        java.lang.Object obj2;
        try {
            if (klVar instanceof defpackage.fg1) {
                fg1Var = (defpackage.fg1) klVar;
                int i = fg1Var.T1fB7bDYiVJQ;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fg1Var.T1fB7bDYiVJQ = i - Integer.MIN_VALUE;
                    java.lang.Object obj3 = fg1Var.h3m55N1URyyK;
                    r1 = fg1Var.T1fB7bDYiVJQ;
                    tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (r1 != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj3);
                        r1 = (defpackage.hg1) fWTAfUmVKrZq();
                    } else if (r1 == 1) {
                        r1 = fg1Var.GE9mJIPrb8gP;
                        uxVar = fg1Var.e6mdH7fiFuta;
                        this = fg1Var.P05cfTpS5W5L;
                        try {
                            defpackage.b80.KrtOTfE6jiS2(obj3);
                            r1 = r1;
                        } catch (java.lang.Throwable th) {
                            r8 = this;
                            th = th;
                            r8.oh71FJcDz6S2(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = fg1Var.fNwYGHIYeJcR;
                        cb0Var = fg1Var.Ns0WNyEWdPsk;
                        defpackage.hg1 hg1Var = fg1Var.GE9mJIPrb8gP;
                        uxVar2 = fg1Var.e6mdH7fiFuta;
                        defpackage.gg1 gg1Var = fg1Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj3);
                        r1 = hg1Var;
                        r8 = gg1Var;
                        java.util.concurrent.atomic.AtomicReference atomicReference = r1.ZpBGe2uQfcn8;
                        defpackage.ru ruVar = defpackage.nq1.BHfvd2J71qpO;
                        andSet = atomicReference.getAndSet(ruVar);
                        andSet.getClass();
                        if (andSet == defpackage.nq1.ZVVdXbWmyCSK) {
                        }
                        java.lang.Object obj4 = GE9mJIPrb8gP.get(r8);
                        if (cb0Var != null) {
                        }
                        if (obj4 == defpackage.ok0.WDYagTQQm9ns) {
                        }
                        fg1Var.P05cfTpS5W5L = r8;
                        fg1Var.e6mdH7fiFuta = uxVar2;
                        fg1Var.GE9mJIPrb8gP = r1;
                        fg1Var.Ns0WNyEWdPsk = cb0Var;
                        fg1Var.fNwYGHIYeJcR = obj4;
                        fg1Var.T1fB7bDYiVJQ = 2;
                        if (uxVar2.fNwYGHIYeJcR(obj2, fg1Var) == tmVar) {
                        }
                    } else {
                        if (r1 != 3) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = fg1Var.fNwYGHIYeJcR;
                        cb0Var = fg1Var.Ns0WNyEWdPsk;
                        r1 = fg1Var.GE9mJIPrb8gP;
                        uxVar2 = fg1Var.e6mdH7fiFuta;
                        r8 = fg1Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj3);
                        java.lang.Object obj42 = GE9mJIPrb8gP.get(r8);
                        if (cb0Var != null && !cb0Var.giKS3J6vZuNy()) {
                            throw cb0Var.s0TASMVLSWD5();
                        }
                        obj2 = obj42 == defpackage.ok0.WDYagTQQm9ns ? null : obj42;
                        fg1Var.P05cfTpS5W5L = r8;
                        fg1Var.e6mdH7fiFuta = uxVar2;
                        fg1Var.GE9mJIPrb8gP = r1;
                        fg1Var.Ns0WNyEWdPsk = cb0Var;
                        fg1Var.fNwYGHIYeJcR = obj42;
                        fg1Var.T1fB7bDYiVJQ = 2;
                        if (uxVar2.fNwYGHIYeJcR(obj2, fg1Var) == tmVar) {
                            return tmVar;
                        }
                        obj = obj42;
                        r1 = r1;
                        r8 = r8;
                        java.util.concurrent.atomic.AtomicReference atomicReference2 = r1.ZpBGe2uQfcn8;
                        defpackage.ru ruVar2 = defpackage.nq1.BHfvd2J71qpO;
                        andSet = atomicReference2.getAndSet(ruVar2);
                        andSet.getClass();
                        if (andSet == defpackage.nq1.ZVVdXbWmyCSK) {
                            fg1Var.P05cfTpS5W5L = r8;
                            fg1Var.e6mdH7fiFuta = uxVar2;
                            fg1Var.GE9mJIPrb8gP = r1;
                            fg1Var.Ns0WNyEWdPsk = cb0Var;
                            fg1Var.fNwYGHIYeJcR = obj;
                            fg1Var.T1fB7bDYiVJQ = 3;
                            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                            defpackage.dd ddVar = new defpackage.dd(1, defpackage.q70.OcTWLQzke1i2(fg1Var));
                            ddVar.IJ0hOnjhPOri();
                            java.util.concurrent.atomic.AtomicReference atomicReference3 = r1.ZpBGe2uQfcn8;
                            while (true) {
                                if (atomicReference3.compareAndSet(ruVar2, ddVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != ruVar2) {
                                    ddVar.e6mdH7fiFuta(gs1Var);
                                    break;
                                }
                            }
                            java.lang.Object w7APNrr0aGRc = ddVar.w7APNrr0aGRc();
                            if (w7APNrr0aGRc == tmVar) {
                            }
                        }
                        java.lang.Object obj422 = GE9mJIPrb8gP.get(r8);
                        if (cb0Var != null) {
                            throw cb0Var.s0TASMVLSWD5();
                        }
                        if (obj422 == defpackage.ok0.WDYagTQQm9ns) {
                        }
                        fg1Var.P05cfTpS5W5L = r8;
                        fg1Var.e6mdH7fiFuta = uxVar2;
                        fg1Var.GE9mJIPrb8gP = r1;
                        fg1Var.Ns0WNyEWdPsk = cb0Var;
                        fg1Var.fNwYGHIYeJcR = obj422;
                        fg1Var.T1fB7bDYiVJQ = 2;
                        if (uxVar2.fNwYGHIYeJcR(obj2, fg1Var) == tmVar) {
                        }
                    }
                    defpackage.jm jmVar = fg1Var.oh71FJcDz6S2;
                    jmVar.getClass();
                    r8 = this;
                    uxVar2 = uxVar;
                    cb0Var = (defpackage.cb0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
                    obj = null;
                    java.lang.Object obj4222 = GE9mJIPrb8gP.get(r8);
                    if (cb0Var != null) {
                    }
                    if (obj4222 == defpackage.ok0.WDYagTQQm9ns) {
                    }
                    fg1Var.P05cfTpS5W5L = r8;
                    fg1Var.e6mdH7fiFuta = uxVar2;
                    fg1Var.GE9mJIPrb8gP = r1;
                    fg1Var.Ns0WNyEWdPsk = cb0Var;
                    fg1Var.fNwYGHIYeJcR = obj4222;
                    fg1Var.T1fB7bDYiVJQ = 2;
                    if (uxVar2.fNwYGHIYeJcR(obj2, fg1Var) == tmVar) {
                    }
                }
            }
            if (r1 != 0) {
            }
            defpackage.jm jmVar2 = fg1Var.oh71FJcDz6S2;
            jmVar2.getClass();
            r8 = this;
            uxVar2 = uxVar;
            cb0Var = (defpackage.cb0) jmVar2.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
            obj = null;
            java.lang.Object obj42222 = GE9mJIPrb8gP.get(r8);
            if (cb0Var != null) {
            }
            if (obj42222 == defpackage.ok0.WDYagTQQm9ns) {
            }
            fg1Var.P05cfTpS5W5L = r8;
            fg1Var.e6mdH7fiFuta = uxVar2;
            fg1Var.GE9mJIPrb8gP = r1;
            fg1Var.Ns0WNyEWdPsk = cb0Var;
            fg1Var.fNwYGHIYeJcR = obj42222;
            fg1Var.T1fB7bDYiVJQ = 2;
            if (uxVar2.fNwYGHIYeJcR(obj2, fg1Var) == tmVar) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        fg1Var = new defpackage.fg1(this, klVar);
        java.lang.Object obj32 = fg1Var.h3m55N1URyyK;
        r1 = fg1Var.T1fB7bDYiVJQ;
        tmVar = defpackage.tm.WDYagTQQm9ns;
    }

    public final void e6mdH7fiFuta(java.lang.Object obj) {
        if (obj == null) {
            obj = defpackage.ok0.WDYagTQQm9ns;
        }
        GE9mJIPrb8gP(null, obj);
    }

    @Override // defpackage.ux
    public final java.lang.Object fNwYGHIYeJcR(java.lang.Object obj, defpackage.kl klVar) {
        e6mdH7fiFuta(obj);
        return defpackage.gs1.ZpBGe2uQfcn8;
    }

    @Override // defpackage.eg1
    public final java.lang.Object getValue() {
        defpackage.ru ruVar = defpackage.ok0.WDYagTQQm9ns;
        GE9mJIPrb8gP.getClass();
        java.lang.Object objectVolatile = defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, Ns0WNyEWdPsk);
        if (objectVolatile == ruVar) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.o20
    public final defpackage.tx giKS3J6vZuNy(defpackage.jm jmVar, int i, defpackage.zb zbVar) {
        return (((i < 0 || i >= 2) && i != -2) || zbVar != defpackage.zb.oh71FJcDz6S2) ? defpackage.la0.WmetiUbpKU9I(this, jmVar, i, zbVar) : this;
    }
}
