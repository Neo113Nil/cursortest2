package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class jb0 implements defpackage.cb0 {
    public static final /* synthetic */ long P05cfTpS5W5L;
    public static final /* synthetic */ long QiMR8OkAhezm;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater WDYagTQQm9ns = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.jb0.class, java.lang.Object.class, "_state$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater oh71FJcDz6S2;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        P05cfTpS5W5L = unsafe.objectFieldOffset(defpackage.jb0.class.getDeclaredField("_state$volatile"));
        oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.jb0.class, java.lang.Object.class, "_parentHandle$volatile");
        QiMR8OkAhezm = unsafe.objectFieldOffset(defpackage.jb0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public jb0(boolean z) {
        this._state$volatile = z ? defpackage.jr0.e6mdH7fiFuta : defpackage.jr0.P05cfTpS5W5L;
    }

    public static java.lang.String EgL5gQQnyJKX(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ib0)) {
            return obj instanceof defpackage.s60 ? ((defpackage.s60) obj).giKS3J6vZuNy() ? "Active" : "New" : obj instanceof defpackage.ug ? "Cancelled" : "Completed";
        }
        defpackage.ib0 ib0Var = (defpackage.ib0) obj;
        return ib0Var.oh71FJcDz6S2() ? "Cancelling" : defpackage.ib0.oh71FJcDz6S2.get(ib0Var) != 0 ? "Completing" : "Active";
    }

    public static defpackage.je PS16moFv2oLu(defpackage.si0 si0Var) {
        while (si0Var.gUjdnLbkVAaA()) {
            si0Var = si0Var.h3m55N1URyyK();
        }
        while (true) {
            si0Var = si0Var.fNwYGHIYeJcR();
            if (!si0Var.gUjdnLbkVAaA()) {
                if (si0Var instanceof defpackage.je) {
                    return (defpackage.je) si0Var;
                }
                if (si0Var instanceof defpackage.ur0) {
                    return null;
                }
            }
        }
    }

    @Override // defpackage.jm
    public final java.lang.Object BHfvd2J71qpO(defpackage.c20 c20Var, java.lang.Object obj) {
        return c20Var.QiMR8OkAhezm(obj, this);
    }

    public final java.lang.Object BXaznwstz2U0(defpackage.ib0 ib0Var, java.lang.Object obj) {
        defpackage.ib0 ib0Var2;
        java.lang.Throwable th;
        java.lang.Throwable hH0RRJrNssvh;
        defpackage.jb0 jb0Var;
        defpackage.ib0 ib0Var3;
        defpackage.ug ugVar = obj instanceof defpackage.ug ? (defpackage.ug) obj : null;
        java.lang.Throwable th2 = ugVar != null ? ugVar.ZpBGe2uQfcn8 : null;
        synchronized (ib0Var) {
            try {
                ib0Var.oh71FJcDz6S2();
                java.util.ArrayList QiMR8OkAhezm2 = ib0Var.QiMR8OkAhezm(th2);
                hH0RRJrNssvh = hH0RRJrNssvh(ib0Var, QiMR8OkAhezm2);
                if (hH0RRJrNssvh != null) {
                    try {
                        if (QiMR8OkAhezm2.size() > 1) {
                            java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(QiMR8OkAhezm2.size()));
                            int size = QiMR8OkAhezm2.size();
                            int i = 0;
                            while (i < size) {
                                java.lang.Object obj2 = QiMR8OkAhezm2.get(i);
                                i++;
                                java.lang.Throwable th3 = (java.lang.Throwable) obj2;
                                if (th3 != hH0RRJrNssvh && th3 != hH0RRJrNssvh && !(th3 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th3)) {
                                    defpackage.i61.P05cfTpS5W5L(hH0RRJrNssvh, th3);
                                }
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        ib0Var2 = ib0Var;
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th5) {
                ib0Var2 = ib0Var;
                th = th5;
            }
        }
        if (hH0RRJrNssvh != null && hH0RRJrNssvh != th2) {
            obj = new defpackage.ug(hH0RRJrNssvh, false);
        }
        if (hH0RRJrNssvh != null && (jjTN4uUnoyEn(hH0RRJrNssvh) || OVwOqzUGHcCU(hH0RRJrNssvh))) {
            obj.getClass();
            defpackage.ug.giKS3J6vZuNy.compareAndSet((defpackage.ug) obj, 0, 1);
        }
        fhbmYuu9J3cT(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WDYagTQQm9ns;
        java.lang.Object t60Var = obj instanceof defpackage.s60 ? new defpackage.t60((defpackage.s60) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = P05cfTpS5W5L;
            jb0Var = this;
            ib0Var3 = ib0Var;
            if (!unsafe.compareAndSwapObject(jb0Var, j, ib0Var3, t60Var) && unsafe.getObjectVolatile(jb0Var, j) == ib0Var3) {
                this = jb0Var;
                ib0Var = ib0Var3;
            }
        }
        jb0Var.KrtOTfE6jiS2(ib0Var3, obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.cr CZa7MwI9IzLd(boolean z, defpackage.fb0 fb0Var) {
        defpackage.jb0 jb0Var;
        defpackage.fb0 fb0Var2;
        defpackage.zr0 zr0Var;
        boolean WDYagTQQm9ns2;
        fb0Var.Ns0WNyEWdPsk = this;
        loop0: while (true) {
            java.lang.Object Wc0TdmRSwbbi = this.Wc0TdmRSwbbi();
            if (Wc0TdmRSwbbi instanceof defpackage.uu) {
                defpackage.uu uuVar = (defpackage.uu) Wc0TdmRSwbbi;
                if (uuVar.WDYagTQQm9ns) {
                    while (true) {
                        WDYagTQQm9ns.getClass();
                        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        long j = P05cfTpS5W5L;
                        jb0Var = this;
                        fb0Var2 = fb0Var;
                        if (unsafe.compareAndSwapObject(jb0Var, j, Wc0TdmRSwbbi, fb0Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(jb0Var, j) != Wc0TdmRSwbbi) {
                            break;
                        }
                        this = jb0Var;
                        fb0Var = fb0Var2;
                    }
                } else {
                    jb0Var = this;
                    fb0Var2 = fb0Var;
                    jb0Var.Rl68HURFBtL3(uuVar);
                }
                this = jb0Var;
                fb0Var = fb0Var2;
            } else {
                jb0Var = this;
                fb0Var2 = fb0Var;
                boolean z2 = Wc0TdmRSwbbi instanceof defpackage.s60;
                zr0Var = defpackage.zr0.WDYagTQQm9ns;
                if (z2) {
                    defpackage.s60 s60Var = (defpackage.s60) Wc0TdmRSwbbi;
                    defpackage.ur0 JhCgjQRTAOCT = s60Var.JhCgjQRTAOCT();
                    if (JhCgjQRTAOCT == null) {
                        jb0Var.cCeDCHgnx5OL((defpackage.fb0) Wc0TdmRSwbbi);
                    } else {
                        if (fb0Var2.s0TASMVLSWD5()) {
                            defpackage.ib0 ib0Var = s60Var instanceof defpackage.ib0 ? (defpackage.ib0) s60Var : null;
                            java.lang.Throwable WDYagTQQm9ns3 = ib0Var != null ? ib0Var.WDYagTQQm9ns() : null;
                            if (WDYagTQQm9ns3 == null) {
                                WDYagTQQm9ns2 = JhCgjQRTAOCT.WDYagTQQm9ns(fb0Var2, 5);
                            } else if (z) {
                                fb0Var2.BHfvd2J71qpO(WDYagTQQm9ns3);
                                return zr0Var;
                            }
                        } else {
                            WDYagTQQm9ns2 = JhCgjQRTAOCT.WDYagTQQm9ns(fb0Var2, 1);
                        }
                        if (WDYagTQQm9ns2) {
                            break;
                        }
                    }
                    this = jb0Var;
                    fb0Var = fb0Var2;
                } else if (z) {
                    java.lang.Object Wc0TdmRSwbbi2 = jb0Var.Wc0TdmRSwbbi();
                    defpackage.ug ugVar = Wc0TdmRSwbbi2 instanceof defpackage.ug ? (defpackage.ug) Wc0TdmRSwbbi2 : null;
                    fb0Var2.BHfvd2J71qpO(ugVar != null ? ugVar.ZpBGe2uQfcn8 : null);
                }
            }
        }
        return zr0Var;
    }

    public boolean EPEWHACkMcF1() {
        return this instanceof defpackage.ja;
    }

    public final void Fu5WBEia9jBo(defpackage.cb0 cb0Var) {
        defpackage.zr0 zr0Var = defpackage.zr0.WDYagTQQm9ns;
        if (cb0Var == null) {
            hwoZxnIesQBZ(zr0Var);
            return;
        }
        cb0Var.start();
        defpackage.ie Ns0WNyEWdPsk = cb0Var.Ns0WNyEWdPsk(this);
        hwoZxnIesQBZ(Ns0WNyEWdPsk);
        if (Wc0TdmRSwbbi() instanceof defpackage.s60) {
            return;
        }
        Ns0WNyEWdPsk.ZpBGe2uQfcn8();
        hwoZxnIesQBZ(zr0Var);
    }

    public boolean GcLuU6pT9wO9() {
        return true;
    }

    public final void GoIRkIe1iwj6(defpackage.ur0 ur0Var, java.lang.Throwable th) {
        ur0Var.WDYagTQQm9ns(new defpackage.xh0(4), 4);
        java.lang.Object Ns0WNyEWdPsk = ur0Var.Ns0WNyEWdPsk();
        Ns0WNyEWdPsk.getClass();
        defpackage.vg vgVar = null;
        for (defpackage.si0 si0Var = (defpackage.si0) Ns0WNyEWdPsk; !si0Var.equals(ur0Var); si0Var = si0Var.fNwYGHIYeJcR()) {
            if ((si0Var instanceof defpackage.fb0) && ((defpackage.fb0) si0Var).s0TASMVLSWD5()) {
                try {
                    ((defpackage.fb0) si0Var).BHfvd2J71qpO(th);
                } catch (java.lang.Throwable th2) {
                    if (vgVar != null) {
                        defpackage.i61.P05cfTpS5W5L(vgVar, th2);
                    } else {
                        vgVar = new defpackage.vg("Exception in completion handler " + si0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (vgVar != null) {
            Jkfc0NcwyPL8(vgVar);
        }
        jjTN4uUnoyEn(th);
    }

    public final boolean I5Vdbaz9SDkL(defpackage.s60 s60Var, java.lang.Throwable th) {
        defpackage.ur0 w6IV1lieBIux = w6IV1lieBIux(s60Var);
        if (w6IV1lieBIux == null) {
            return false;
        }
        defpackage.ib0 ib0Var = new defpackage.ib0(w6IV1lieBIux, th);
        while (true) {
            WDYagTQQm9ns.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = P05cfTpS5W5L;
            defpackage.jb0 jb0Var = this;
            defpackage.s60 s60Var2 = s60Var;
            if (unsafe.compareAndSwapObject(jb0Var, j, s60Var2, ib0Var)) {
                jb0Var.GoIRkIe1iwj6(w6IV1lieBIux, th);
                return true;
            }
            if (unsafe.getObjectVolatile(jb0Var, j) != s60Var2) {
                return false;
            }
            this = jb0Var;
            s60Var = s60Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final java.lang.Throwable IBvW5fLsPuHy(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        defpackage.jb0 jb0Var = (defpackage.jb0) obj;
        java.lang.Object Wc0TdmRSwbbi = jb0Var.Wc0TdmRSwbbi();
        if (Wc0TdmRSwbbi instanceof defpackage.ib0) {
            cancellationException = ((defpackage.ib0) Wc0TdmRSwbbi).WDYagTQQm9ns();
        } else if (Wc0TdmRSwbbi instanceof defpackage.ug) {
            cancellationException = ((defpackage.ug) Wc0TdmRSwbbi).ZpBGe2uQfcn8;
        } else {
            if (Wc0TdmRSwbbi instanceof defpackage.s60) {
                defpackage.h7.QiMR8OkAhezm(Wc0TdmRSwbbi, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new defpackage.db0("Parent job is ".concat(EgL5gQQnyJKX(Wc0TdmRSwbbi)), cancellationException, jb0Var) : cancellationException2;
    }

    @Override // defpackage.cb0
    public void JhCgjQRTAOCT(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new defpackage.db0(Mearx7yMn90V(), null, this);
        }
        qjMheFZ0l9kA(cancellationException);
    }

    public final void KrtOTfE6jiS2(defpackage.s60 s60Var, java.lang.Object obj) {
        defpackage.ie zJPqDeoF0Os1 = zJPqDeoF0Os1();
        if (zJPqDeoF0Os1 != null) {
            zJPqDeoF0Os1.ZpBGe2uQfcn8();
            hwoZxnIesQBZ(defpackage.zr0.WDYagTQQm9ns);
        }
        defpackage.vg vgVar = null;
        defpackage.ug ugVar = obj instanceof defpackage.ug ? (defpackage.ug) obj : null;
        java.lang.Throwable th = ugVar != null ? ugVar.ZpBGe2uQfcn8 : null;
        if (s60Var instanceof defpackage.fb0) {
            try {
                ((defpackage.fb0) s60Var).BHfvd2J71qpO(th);
                return;
            } catch (java.lang.Throwable th2) {
                Jkfc0NcwyPL8(new defpackage.vg("Exception in completion handler " + s60Var + " for " + this, th2));
                return;
            }
        }
        defpackage.ur0 JhCgjQRTAOCT = s60Var.JhCgjQRTAOCT();
        if (JhCgjQRTAOCT != null) {
            JhCgjQRTAOCT.WDYagTQQm9ns(new defpackage.xh0(1), 1);
            java.lang.Object Ns0WNyEWdPsk = JhCgjQRTAOCT.Ns0WNyEWdPsk();
            Ns0WNyEWdPsk.getClass();
            for (defpackage.si0 si0Var = (defpackage.si0) Ns0WNyEWdPsk; !si0Var.equals(JhCgjQRTAOCT); si0Var = si0Var.fNwYGHIYeJcR()) {
                if (si0Var instanceof defpackage.fb0) {
                    try {
                        ((defpackage.fb0) si0Var).BHfvd2J71qpO(th);
                    } catch (java.lang.Throwable th3) {
                        if (vgVar != null) {
                            defpackage.i61.P05cfTpS5W5L(vgVar, th3);
                        } else {
                            vgVar = new defpackage.vg("Exception in completion handler " + si0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (vgVar != null) {
                Jkfc0NcwyPL8(vgVar);
            }
        }
    }

    public final boolean LCK4GGEwbWAr(defpackage.s60 s60Var, java.lang.Object obj) {
        java.lang.Object t60Var = obj instanceof defpackage.s60 ? new defpackage.t60((defpackage.s60) obj) : obj;
        while (true) {
            WDYagTQQm9ns.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = P05cfTpS5W5L;
            defpackage.jb0 jb0Var = this;
            defpackage.s60 s60Var2 = s60Var;
            if (unsafe.compareAndSwapObject(jb0Var, j, s60Var2, t60Var)) {
                jb0Var.fhbmYuu9J3cT(obj);
                jb0Var.KrtOTfE6jiS2(s60Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(jb0Var, j) != s60Var2) {
                return false;
            }
            this = jb0Var;
            s60Var = s60Var2;
        }
    }

    public java.lang.String Mearx7yMn90V() {
        return "Job was cancelled";
    }

    public java.lang.String NkfcFfdaVTox() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.cb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.ie Ns0WNyEWdPsk(defpackage.jb0 jb0Var) {
        defpackage.jb0 jb0Var2;
        defpackage.je jeVar = new defpackage.je(jb0Var);
        jeVar.Ns0WNyEWdPsk = this;
        loop0: while (true) {
            java.lang.Object Wc0TdmRSwbbi = this.Wc0TdmRSwbbi();
            if (Wc0TdmRSwbbi instanceof defpackage.uu) {
                defpackage.uu uuVar = (defpackage.uu) Wc0TdmRSwbbi;
                if (uuVar.WDYagTQQm9ns) {
                    while (true) {
                        WDYagTQQm9ns.getClass();
                        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        long j = P05cfTpS5W5L;
                        jb0Var2 = this;
                        if (unsafe.compareAndSwapObject(jb0Var2, j, Wc0TdmRSwbbi, jeVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(jb0Var2, j) != Wc0TdmRSwbbi) {
                            break;
                        }
                        this = jb0Var2;
                    }
                } else {
                    jb0Var2 = this;
                    jb0Var2.Rl68HURFBtL3(uuVar);
                }
                this = jb0Var2;
            } else {
                jb0Var2 = this;
                boolean z = Wc0TdmRSwbbi instanceof defpackage.s60;
                defpackage.zr0 zr0Var = defpackage.zr0.WDYagTQQm9ns;
                if (!z) {
                    java.lang.Object Wc0TdmRSwbbi2 = jb0Var2.Wc0TdmRSwbbi();
                    defpackage.ug ugVar = Wc0TdmRSwbbi2 instanceof defpackage.ug ? (defpackage.ug) Wc0TdmRSwbbi2 : null;
                    jeVar.BHfvd2J71qpO(ugVar != null ? ugVar.ZpBGe2uQfcn8 : null);
                    return zr0Var;
                }
                defpackage.ur0 JhCgjQRTAOCT = ((defpackage.s60) Wc0TdmRSwbbi).JhCgjQRTAOCT();
                if (JhCgjQRTAOCT == null) {
                    jb0Var2.cCeDCHgnx5OL((defpackage.fb0) Wc0TdmRSwbbi);
                    this = jb0Var2;
                } else if (!JhCgjQRTAOCT.WDYagTQQm9ns(jeVar, 7)) {
                    boolean WDYagTQQm9ns2 = JhCgjQRTAOCT.WDYagTQQm9ns(jeVar, 3);
                    java.lang.Object Wc0TdmRSwbbi3 = jb0Var2.Wc0TdmRSwbbi();
                    if (Wc0TdmRSwbbi3 instanceof defpackage.ib0) {
                        r0 = ((defpackage.ib0) Wc0TdmRSwbbi3).WDYagTQQm9ns();
                    } else {
                        defpackage.ug ugVar2 = Wc0TdmRSwbbi3 instanceof defpackage.ug ? (defpackage.ug) Wc0TdmRSwbbi3 : null;
                        if (ugVar2 != null) {
                            r0 = ugVar2.ZpBGe2uQfcn8;
                        }
                    }
                    jeVar.BHfvd2J71qpO(r0);
                    if (WDYagTQQm9ns2) {
                        break loop0;
                    }
                    return zr0Var;
                }
            }
        }
    }

    public boolean OVwOqzUGHcCU(java.lang.Throwable th) {
        return false;
    }

    @Override // defpackage.cb0
    public final java.lang.Object OcTWLQzke1i2(defpackage.ll llVar) {
        java.lang.Object Wc0TdmRSwbbi;
        defpackage.gs1 gs1Var;
        do {
            Wc0TdmRSwbbi = Wc0TdmRSwbbi();
            boolean z = Wc0TdmRSwbbi instanceof defpackage.s60;
            gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
            if (!z) {
                defpackage.b80.h3m55N1URyyK(llVar.oh71FJcDz6S2());
                return gs1Var;
            }
        } while (m6iZQUu7XjoL(Wc0TdmRSwbbi) < 0);
        defpackage.dd ddVar = new defpackage.dd(1, defpackage.q70.OcTWLQzke1i2(llVar));
        ddVar.IJ0hOnjhPOri();
        ddVar.dG7RjM6DqYVL(new defpackage.yc(2, defpackage.b80.dG7RjM6DqYVL(this, true, new defpackage.j51(ddVar))));
        java.lang.Object w7APNrr0aGRc = ddVar.w7APNrr0aGRc();
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (w7APNrr0aGRc != tmVar) {
            w7APNrr0aGRc = gs1Var;
        }
        return w7APNrr0aGRc == tmVar ? w7APNrr0aGRc : gs1Var;
    }

    public final void Rl68HURFBtL3(defpackage.uu uuVar) {
        defpackage.ur0 ur0Var = new defpackage.ur0();
        java.lang.Object r60Var = uuVar.WDYagTQQm9ns ? ur0Var : new defpackage.r60(ur0Var);
        while (true) {
            WDYagTQQm9ns.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = P05cfTpS5W5L;
            defpackage.jb0 jb0Var = this;
            defpackage.uu uuVar2 = uuVar;
            if (unsafe.compareAndSwapObject(jb0Var, j, uuVar2, r60Var) || unsafe.getObjectVolatile(jb0Var, j) != uuVar2) {
                return;
            }
            this = jb0Var;
            uuVar = uuVar2;
        }
    }

    public final boolean ULjnV488Y6RO(defpackage.ib0 ib0Var, defpackage.je jeVar, java.lang.Object obj) {
        while (defpackage.b80.dG7RjM6DqYVL(jeVar.fNwYGHIYeJcR, false, new defpackage.hb0(this, ib0Var, jeVar, obj)) == defpackage.zr0.WDYagTQQm9ns) {
            jeVar = PS16moFv2oLu(jeVar);
            if (jeVar == null) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.Object Wc0TdmRSwbbi() {
        WDYagTQQm9ns.getClass();
        return defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, P05cfTpS5W5L);
    }

    @Override // defpackage.jm
    public final defpackage.hm XntWc4eZSQ8j(defpackage.im imVar) {
        return defpackage.h0.dG7RjM6DqYVL(this, imVar);
    }

    @Override // defpackage.cb0
    public final defpackage.cr ZVVdXbWmyCSK(defpackage.y10 y10Var) {
        return CZa7MwI9IzLd(true, new defpackage.ya0(y10Var));
    }

    @Override // defpackage.cb0
    public final defpackage.cr blKFvluuDQOf(boolean z, boolean z2, defpackage.WDYagTQQm9ns wDYagTQQm9ns) {
        return CZa7MwI9IzLd(z2, z ? new defpackage.xa0(wDYagTQQm9ns) : new defpackage.ya0(wDYagTQQm9ns));
    }

    public final void cCeDCHgnx5OL(defpackage.fb0 fb0Var) {
        fb0Var.QiMR8OkAhezm(new defpackage.ur0());
        defpackage.si0 fNwYGHIYeJcR = fb0Var.fNwYGHIYeJcR();
        while (true) {
            WDYagTQQm9ns.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = P05cfTpS5W5L;
            defpackage.jb0 jb0Var = this;
            defpackage.fb0 fb0Var2 = fb0Var;
            if (unsafe.compareAndSwapObject(jb0Var, j, fb0Var2, fNwYGHIYeJcR) || unsafe.getObjectVolatile(jb0Var, j) != fb0Var2) {
                return;
            }
            this = jb0Var;
            fb0Var = fb0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.jr0.JhCgjQRTAOCT) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dG7RjM6DqYVL(java.lang.Object obj) {
        defpackage.ru ruVar;
        java.lang.Object obj2 = defpackage.jr0.fWTAfUmVKrZq;
        if (xahdJg25P1Bv()) {
            do {
                java.lang.Object Wc0TdmRSwbbi = Wc0TdmRSwbbi();
                if (Wc0TdmRSwbbi instanceof defpackage.s60) {
                    if (Wc0TdmRSwbbi instanceof defpackage.ib0) {
                        if (defpackage.ib0.oh71FJcDz6S2.get((defpackage.ib0) Wc0TdmRSwbbi) != 0) {
                        }
                    }
                    obj2 = lXYSMswtzmix(Wc0TdmRSwbbi, new defpackage.ug(IBvW5fLsPuHy(obj), false));
                }
                obj2 = defpackage.jr0.fWTAfUmVKrZq;
                break;
            } while (obj2 == defpackage.jr0.WDYagTQQm9ns);
        }
        if (obj2 == defpackage.jr0.fWTAfUmVKrZq) {
            java.lang.Throwable th = null;
            while (true) {
                java.lang.Object Wc0TdmRSwbbi2 = Wc0TdmRSwbbi();
                if (!(Wc0TdmRSwbbi2 instanceof defpackage.ib0)) {
                    if (!(Wc0TdmRSwbbi2 instanceof defpackage.s60)) {
                        ruVar = defpackage.jr0.oh71FJcDz6S2;
                        break;
                    }
                    if (th == null) {
                        th = IBvW5fLsPuHy(obj);
                    }
                    defpackage.s60 s60Var = (defpackage.s60) Wc0TdmRSwbbi2;
                    if (!s60Var.giKS3J6vZuNy()) {
                        java.lang.Object lXYSMswtzmix = lXYSMswtzmix(Wc0TdmRSwbbi2, new defpackage.ug(th, false));
                        if (lXYSMswtzmix == defpackage.jr0.fWTAfUmVKrZq) {
                            defpackage.h7.QiMR8OkAhezm(Wc0TdmRSwbbi2, "Cannot happen in ");
                            return false;
                        }
                        if (lXYSMswtzmix != defpackage.jr0.WDYagTQQm9ns) {
                            obj2 = lXYSMswtzmix;
                            break;
                        }
                    } else if (I5Vdbaz9SDkL(s60Var, th)) {
                        ruVar = defpackage.jr0.fWTAfUmVKrZq;
                        break;
                    }
                } else {
                    synchronized (Wc0TdmRSwbbi2) {
                        if (((defpackage.ib0) Wc0TdmRSwbbi2).fWTAfUmVKrZq() == defpackage.jr0.QiMR8OkAhezm) {
                            ruVar = defpackage.jr0.oh71FJcDz6S2;
                        } else {
                            boolean oh71FJcDz6S22 = ((defpackage.ib0) Wc0TdmRSwbbi2).oh71FJcDz6S2();
                            if (th == null) {
                                th = IBvW5fLsPuHy(obj);
                            }
                            ((defpackage.ib0) Wc0TdmRSwbbi2).ZpBGe2uQfcn8(th);
                            java.lang.Throwable WDYagTQQm9ns2 = oh71FJcDz6S22 ? null : ((defpackage.ib0) Wc0TdmRSwbbi2).WDYagTQQm9ns();
                            if (WDYagTQQm9ns2 != null) {
                                GoIRkIe1iwj6(((defpackage.ib0) Wc0TdmRSwbbi2).WDYagTQQm9ns, WDYagTQQm9ns2);
                            }
                            ruVar = defpackage.jr0.fWTAfUmVKrZq;
                        }
                    }
                }
            }
        }
        if (obj2 != defpackage.jr0.fWTAfUmVKrZq && obj2 != defpackage.jr0.JhCgjQRTAOCT) {
            if (obj2 == defpackage.jr0.oh71FJcDz6S2) {
                return false;
            }
            VFeft99leXEK(obj2);
            return true;
        }
        return true;
    }

    @Override // defpackage.jm
    public final defpackage.jm fNwYGHIYeJcR(defpackage.jm jmVar) {
        return defpackage.h0.zJPqDeoF0Os1(this, jmVar);
    }

    public boolean frSwwKIlbUhK(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return dG7RjM6DqYVL(th) && GcLuU6pT9wO9();
    }

    @Override // defpackage.hm
    public final defpackage.im getKey() {
        return defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8;
    }

    @Override // defpackage.cb0
    public boolean giKS3J6vZuNy() {
        java.lang.Object Wc0TdmRSwbbi = Wc0TdmRSwbbi();
        return (Wc0TdmRSwbbi instanceof defpackage.s60) && ((defpackage.s60) Wc0TdmRSwbbi).giKS3J6vZuNy();
    }

    public final java.lang.Throwable hH0RRJrNssvh(defpackage.ib0 ib0Var, java.util.ArrayList arrayList) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (ib0Var.oh71FJcDz6S2()) {
                return new defpackage.db0(Mearx7yMn90V(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException)) {
                break;
            }
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = (java.lang.Throwable) arrayList.get(0);
        if (th2 instanceof defpackage.go1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                java.lang.Object obj3 = arrayList.get(i);
                i++;
                java.lang.Throwable th3 = (java.lang.Throwable) obj3;
                if (th3 != th2 && (th3 instanceof defpackage.go1)) {
                    obj2 = obj3;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final void hwoZxnIesQBZ(defpackage.ie ieVar) {
        oh71FJcDz6S2.getClass();
        defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, QiMR8OkAhezm, ieVar);
    }

    public final boolean jjTN4uUnoyEn(java.lang.Throwable th) {
        if (EPEWHACkMcF1()) {
            return true;
        }
        boolean z = th instanceof java.util.concurrent.CancellationException;
        defpackage.ie zJPqDeoF0Os1 = zJPqDeoF0Os1();
        return (zJPqDeoF0Os1 == null || zJPqDeoF0Os1 == defpackage.zr0.WDYagTQQm9ns) ? z : zJPqDeoF0Os1.fWTAfUmVKrZq(th) || z;
    }

    public final java.lang.Object lXYSMswtzmix(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj instanceof defpackage.s60)) {
            return defpackage.jr0.fWTAfUmVKrZq;
        }
        if (((obj instanceof defpackage.uu) || (obj instanceof defpackage.fb0)) && !(obj instanceof defpackage.je) && !(obj2 instanceof defpackage.ug)) {
            return LCK4GGEwbWAr((defpackage.s60) obj, obj2) ? obj2 : defpackage.jr0.WDYagTQQm9ns;
        }
        defpackage.s60 s60Var = (defpackage.s60) obj;
        defpackage.ur0 w6IV1lieBIux = w6IV1lieBIux(s60Var);
        if (w6IV1lieBIux == null) {
            return defpackage.jr0.WDYagTQQm9ns;
        }
        defpackage.ib0 ib0Var = s60Var instanceof defpackage.ib0 ? (defpackage.ib0) s60Var : null;
        if (ib0Var == null) {
            ib0Var = new defpackage.ib0(w6IV1lieBIux, null);
        }
        synchronized (ib0Var) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = defpackage.ib0.oh71FJcDz6S2;
            if (atomicIntegerFieldUpdater.get(ib0Var) != 0) {
                return defpackage.jr0.fWTAfUmVKrZq;
            }
            atomicIntegerFieldUpdater.set(ib0Var, 1);
            if (ib0Var != s60Var) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WDYagTQQm9ns;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, s60Var, ib0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != s60Var) {
                        return defpackage.jr0.WDYagTQQm9ns;
                    }
                }
            }
            boolean oh71FJcDz6S22 = ib0Var.oh71FJcDz6S2();
            defpackage.ug ugVar = obj2 instanceof defpackage.ug ? (defpackage.ug) obj2 : null;
            if (ugVar != null) {
                ib0Var.ZpBGe2uQfcn8(ugVar.ZpBGe2uQfcn8);
            }
            java.lang.Throwable WDYagTQQm9ns2 = oh71FJcDz6S22 ? null : ib0Var.WDYagTQQm9ns();
            if (WDYagTQQm9ns2 != null) {
                GoIRkIe1iwj6(w6IV1lieBIux, WDYagTQQm9ns2);
            }
            defpackage.je PS16moFv2oLu = PS16moFv2oLu(w6IV1lieBIux);
            if (PS16moFv2oLu != null && ULjnV488Y6RO(ib0Var, PS16moFv2oLu, obj2)) {
                return defpackage.jr0.JhCgjQRTAOCT;
            }
            w6IV1lieBIux.WDYagTQQm9ns(new defpackage.xh0(2), 2);
            defpackage.je PS16moFv2oLu2 = PS16moFv2oLu(w6IV1lieBIux);
            return (PS16moFv2oLu2 == null || !ULjnV488Y6RO(ib0Var, PS16moFv2oLu2, obj2)) ? BXaznwstz2U0(ib0Var, obj2) : defpackage.jr0.JhCgjQRTAOCT;
        }
    }

    public final int m6iZQUu7XjoL(java.lang.Object obj) {
        sun.misc.Unsafe unsafe;
        sun.misc.Unsafe unsafe2;
        boolean z = obj instanceof defpackage.uu;
        long j = P05cfTpS5W5L;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WDYagTQQm9ns;
        if (z) {
            if (((defpackage.uu) obj).WDYagTQQm9ns) {
                return 0;
            }
            defpackage.uu uuVar = defpackage.jr0.e6mdH7fiFuta;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                if (unsafe2.compareAndSwapObject(this, P05cfTpS5W5L, obj, uuVar)) {
                    FhgBoOud6zyW();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof defpackage.r60)) {
            return 0;
        }
        defpackage.ur0 ur0Var = ((defpackage.r60) obj).WDYagTQQm9ns;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = defpackage.ed.ZpBGe2uQfcn8;
            if (unsafe.compareAndSwapObject(this, P05cfTpS5W5L, obj, ur0Var)) {
                FhgBoOud6zyW();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public void oCu53ZX2v4Ju(java.lang.Object obj) {
        VFeft99leXEK(obj);
    }

    public final void omM9cAlgeGXx(defpackage.fb0 fb0Var) {
        defpackage.jb0 jb0Var;
        while (true) {
            java.lang.Object Wc0TdmRSwbbi = this.Wc0TdmRSwbbi();
            if (!(Wc0TdmRSwbbi instanceof defpackage.fb0)) {
                if (!(Wc0TdmRSwbbi instanceof defpackage.s60) || ((defpackage.s60) Wc0TdmRSwbbi).JhCgjQRTAOCT() == null) {
                    return;
                }
                fb0Var.T1fB7bDYiVJQ();
                return;
            }
            if (Wc0TdmRSwbbi != fb0Var) {
                return;
            }
            defpackage.uu uuVar = defpackage.jr0.e6mdH7fiFuta;
            while (true) {
                WDYagTQQm9ns.getClass();
                sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
                long j = P05cfTpS5W5L;
                jb0Var = this;
                if (unsafe.compareAndSwapObject(jb0Var, j, Wc0TdmRSwbbi, uuVar)) {
                    return;
                }
                if (unsafe.getObjectVolatile(jb0Var, j) != Wc0TdmRSwbbi) {
                    break;
                } else {
                    this = jb0Var;
                }
            }
            this = jb0Var;
        }
    }

    public void qjMheFZ0l9kA(java.util.concurrent.CancellationException cancellationException) {
        dG7RjM6DqYVL(cancellationException);
    }

    @Override // defpackage.cb0
    public final java.util.concurrent.CancellationException s0TASMVLSWD5() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object Wc0TdmRSwbbi = Wc0TdmRSwbbi();
        if (Wc0TdmRSwbbi instanceof defpackage.ib0) {
            java.lang.Throwable WDYagTQQm9ns2 = ((defpackage.ib0) Wc0TdmRSwbbi).WDYagTQQm9ns();
            if (WDYagTQQm9ns2 == null) {
                defpackage.h7.QiMR8OkAhezm(this, "Job is still new or active: ");
                return null;
            }
            java.lang.String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = WDYagTQQm9ns2 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) WDYagTQQm9ns2 : null;
            return cancellationException == null ? new defpackage.db0(concat, WDYagTQQm9ns2, this) : cancellationException;
        }
        if (Wc0TdmRSwbbi instanceof defpackage.s60) {
            defpackage.h7.QiMR8OkAhezm(this, "Job is still new or active: ");
            return null;
        }
        if (!(Wc0TdmRSwbbi instanceof defpackage.ug)) {
            return new defpackage.db0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        java.lang.Throwable th = ((defpackage.ug) Wc0TdmRSwbbi).ZpBGe2uQfcn8;
        cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        return cancellationException == null ? new defpackage.db0(Mearx7yMn90V(), th, this) : cancellationException;
    }

    @Override // defpackage.cb0
    public final boolean start() {
        int m6iZQUu7XjoL;
        do {
            m6iZQUu7XjoL = m6iZQUu7XjoL(Wc0TdmRSwbbi());
            if (m6iZQUu7XjoL == 0) {
                return false;
            }
        } while (m6iZQUu7XjoL != 1);
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(NkfcFfdaVTox() + '{' + EgL5gQQnyJKX(Wc0TdmRSwbbi()) + '}');
        sb.append('@');
        sb.append(defpackage.nn.IJ0hOnjhPOri(this));
        return sb.toString();
    }

    public final defpackage.ur0 w6IV1lieBIux(defpackage.s60 s60Var) {
        defpackage.ur0 JhCgjQRTAOCT = s60Var.JhCgjQRTAOCT();
        if (JhCgjQRTAOCT != null) {
            return JhCgjQRTAOCT;
        }
        if (s60Var instanceof defpackage.uu) {
            return new defpackage.ur0();
        }
        if (s60Var instanceof defpackage.fb0) {
            cCeDCHgnx5OL((defpackage.fb0) s60Var);
            return null;
        }
        defpackage.h7.QiMR8OkAhezm(s60Var, "State should have list: ");
        return null;
    }

    @Override // defpackage.jm
    public final defpackage.jm w7APNrr0aGRc(defpackage.im imVar) {
        return defpackage.h0.xahdJg25P1Bv(this, imVar);
    }

    public boolean xahdJg25P1Bv() {
        return this instanceof defpackage.rg;
    }

    public final java.lang.Object z16KqenTjq8o(java.lang.Object obj) {
        java.lang.Object lXYSMswtzmix;
        do {
            lXYSMswtzmix = lXYSMswtzmix(Wc0TdmRSwbbi(), obj);
            if (lXYSMswtzmix == defpackage.jr0.fWTAfUmVKrZq) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                defpackage.ug ugVar = obj instanceof defpackage.ug ? (defpackage.ug) obj : null;
                throw new java.lang.IllegalStateException(str, ugVar != null ? ugVar.ZpBGe2uQfcn8 : null);
            }
        } while (lXYSMswtzmix == defpackage.jr0.WDYagTQQm9ns);
        return lXYSMswtzmix;
    }

    public final defpackage.ie zJPqDeoF0Os1() {
        oh71FJcDz6S2.getClass();
        return (defpackage.ie) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, QiMR8OkAhezm);
    }

    public void FhgBoOud6zyW() {
    }

    public void Jkfc0NcwyPL8(defpackage.vg vgVar) {
        throw vgVar;
    }

    public void VFeft99leXEK(java.lang.Object obj) {
    }

    public void fhbmYuu9J3cT(java.lang.Object obj) {
    }
}
