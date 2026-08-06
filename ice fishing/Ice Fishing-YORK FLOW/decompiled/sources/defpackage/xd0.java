package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xd0 implements defpackage.ii {
    public int BHfvd2J71qpO;
    public final defpackage.yn0 GE9mJIPrb8gP;
    public final defpackage.yn0 Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public defpackage.th1 QiMR8OkAhezm;
    public final defpackage.sh1 T1fB7bDYiVJQ;
    public final defpackage.jd0 WDYagTQQm9ns;
    public final defpackage.ho0 WmetiUbpKU9I;
    public final defpackage.yn0 XntWc4eZSQ8j;
    public final java.lang.String ZVVdXbWmyCSK;
    public int e6mdH7fiFuta;
    public final defpackage.rd0 fNwYGHIYeJcR;
    public final defpackage.yn0 gUjdnLbkVAaA;
    public final defpackage.od0 h3m55N1URyyK;
    public defpackage.gj oh71FJcDz6S2;
    public int s0TASMVLSWD5;

    public xd0(defpackage.jd0 jd0Var, defpackage.th1 th1Var) {
        this.WDYagTQQm9ns = jd0Var;
        this.QiMR8OkAhezm = th1Var;
        long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
        this.GE9mJIPrb8gP = new defpackage.yn0();
        this.Ns0WNyEWdPsk = new defpackage.yn0();
        this.fNwYGHIYeJcR = new defpackage.rd0(this);
        this.h3m55N1URyyK = new defpackage.od0(this);
        this.gUjdnLbkVAaA = new defpackage.yn0();
        this.T1fB7bDYiVJQ = new defpackage.sh1();
        this.XntWc4eZSQ8j = new defpackage.yn0();
        this.WmetiUbpKU9I = new defpackage.ho0(new java.lang.Object[16]);
        this.ZVVdXbWmyCSK = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void WDYagTQQm9ns(defpackage.pd0 pd0Var) {
        defpackage.zn0 zn0Var;
        defpackage.vx0 vx0Var = pd0Var.oh71FJcDz6S2;
        if (vx0Var != null) {
            vx0Var.P05cfTpS5W5L.set(defpackage.xx0.oh71FJcDz6S2);
            defpackage.i41 i41Var = vx0Var.Ns0WNyEWdPsk;
            if (i41Var.JhCgjQRTAOCT.P05cfTpS5W5L()) {
                zn0Var = i41Var.JhCgjQRTAOCT;
                defpackage.zn0 zn0Var2 = defpackage.n81.ZpBGe2uQfcn8;
                i41Var.JhCgjQRTAOCT = new defpackage.zn0();
                i41Var.fWTAfUmVKrZq.QiMR8OkAhezm();
            } else {
                zn0Var = null;
            }
            i41Var.giKS3J6vZuNy();
            defpackage.lj ljVar = vx0Var.ZpBGe2uQfcn8;
            ljVar.w7APNrr0aGRc = null;
            if (zn0Var != null) {
                ljVar.oCu53ZX2v4Ju.Ns0WNyEWdPsk = zn0Var;
                ljVar.OcTWLQzke1i2 = 2;
            }
            pd0Var.oh71FJcDz6S2 = null;
            defpackage.lj ljVar2 = pd0Var.fWTAfUmVKrZq;
            if (ljVar2 != null) {
                ljVar2.h3m55N1URyyK();
            }
            pd0Var.fWTAfUmVKrZq = null;
        }
    }

    public static final void fWTAfUmVKrZq(defpackage.xd0 xd0Var, java.lang.Object obj) {
        defpackage.jd0 jd0Var = xd0Var.WDYagTQQm9ns;
        xd0Var.P05cfTpS5W5L();
        defpackage.jd0 jd0Var2 = (defpackage.jd0) xd0Var.gUjdnLbkVAaA.Ns0WNyEWdPsk(obj);
        if (jd0Var2 != null) {
            if (xd0Var.BHfvd2J71qpO <= 0) {
                defpackage.e80.giKS3J6vZuNy("No pre-composed items to dispose");
            }
            int e6mdH7fiFuta = ((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).e6mdH7fiFuta(jd0Var2);
            if (e6mdH7fiFuta < ((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).QiMR8OkAhezm - xd0Var.BHfvd2J71qpO) {
                defpackage.e80.giKS3J6vZuNy("Item is not in pre-composed item range");
            }
            xd0Var.s0TASMVLSWD5++;
            xd0Var.BHfvd2J71qpO--;
            defpackage.pd0 pd0Var = (defpackage.pd0) xd0Var.GE9mJIPrb8gP.QiMR8OkAhezm(jd0Var2);
            if (pd0Var != null) {
                WDYagTQQm9ns(pd0Var);
            }
            int i = (((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).QiMR8OkAhezm - xd0Var.BHfvd2J71qpO) - xd0Var.s0TASMVLSWD5;
            xd0Var.GE9mJIPrb8gP(e6mdH7fiFuta, i);
            xd0Var.QiMR8OkAhezm(i);
        }
        if (xd0Var.WmetiUbpKU9I.P05cfTpS5W5L(obj)) {
            defpackage.jd0.z16KqenTjq8o(jd0Var, true, 6);
        }
    }

    public final void GE9mJIPrb8gP(int i, int i2) {
        defpackage.jd0 jd0Var = this.WDYagTQQm9ns;
        jd0Var.ZVVdXbWmyCSK = true;
        jd0Var.GcLuU6pT9wO9(i, i2, 1);
        jd0Var.ZVVdXbWmyCSK = false;
    }

    public final void JhCgjQRTAOCT(defpackage.pd0 pd0Var, boolean z) {
        defpackage.vx0 vx0Var = pd0Var.oh71FJcDz6S2;
        if (vx0Var != null) {
            defpackage.me1 BHfvd2J71qpO = defpackage.t80.BHfvd2J71qpO();
            defpackage.y10 WDYagTQQm9ns = BHfvd2J71qpO != null ? BHfvd2J71qpO.WDYagTQQm9ns() : null;
            defpackage.me1 UmgHb6n58gfG = defpackage.t80.UmgHb6n58gfG(BHfvd2J71qpO);
            try {
                defpackage.jd0 jd0Var = this.WDYagTQQm9ns;
                jd0Var.ZVVdXbWmyCSK = true;
                if (z) {
                    while (!vx0Var.fWTAfUmVKrZq()) {
                        try {
                            vx0Var.WDYagTQQm9ns(new defpackage.h7(16));
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                vx0Var.ZpBGe2uQfcn8();
                pd0Var.oh71FJcDz6S2 = null;
                jd0Var.ZVVdXbWmyCSK = false;
            } finally {
                defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
            }
        }
    }

    public final void Ns0WNyEWdPsk(java.lang.Object obj, defpackage.c20 c20Var, boolean z) {
        defpackage.jd0 jd0Var = this.WDYagTQQm9ns;
        if (jd0Var.KrtOTfE6jiS2()) {
            P05cfTpS5W5L();
            if (this.Ns0WNyEWdPsk.fWTAfUmVKrZq(obj)) {
                return;
            }
            this.XntWc4eZSQ8j.Ns0WNyEWdPsk(obj);
            defpackage.yn0 yn0Var = this.gUjdnLbkVAaA;
            java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(obj);
            if (QiMR8OkAhezm == null) {
                QiMR8OkAhezm = gUjdnLbkVAaA(obj);
                if (QiMR8OkAhezm != null) {
                    GE9mJIPrb8gP(((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).e6mdH7fiFuta(QiMR8OkAhezm), ((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).QiMR8OkAhezm);
                    this.BHfvd2J71qpO++;
                } else {
                    int i = ((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).QiMR8OkAhezm;
                    defpackage.jd0 jd0Var2 = new defpackage.jd0(2);
                    jd0Var.ZVVdXbWmyCSK = true;
                    jd0Var.blKFvluuDQOf(i, jd0Var2);
                    jd0Var.ZVVdXbWmyCSK = false;
                    this.BHfvd2J71qpO++;
                    QiMR8OkAhezm = jd0Var2;
                }
                yn0Var.h3m55N1URyyK(obj, QiMR8OkAhezm);
            }
            h3m55N1URyyK((defpackage.jd0) QiMR8OkAhezm, obj, z, c20Var);
        }
    }

    public final void P05cfTpS5W5L() {
        int i = ((defpackage.ho0) ((defpackage.qn0) this.WDYagTQQm9ns.T1fB7bDYiVJQ()).oh71FJcDz6S2).QiMR8OkAhezm;
        defpackage.yn0 yn0Var = this.GE9mJIPrb8gP;
        if (yn0Var.WDYagTQQm9ns != i) {
            defpackage.e80.ZpBGe2uQfcn8("Inconsistency between the count of nodes tracked by the state (" + yn0Var.WDYagTQQm9ns + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.s0TASMVLSWD5) - this.BHfvd2J71qpO < 0) {
            java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Incorrect state. Total children ", ". Reusable children ");
            h3m55N1URyyK.append(this.s0TASMVLSWD5);
            h3m55N1URyyK.append(". Precomposed children ");
            h3m55N1URyyK.append(this.BHfvd2J71qpO);
            defpackage.e80.ZpBGe2uQfcn8(h3m55N1URyyK.toString());
        }
        defpackage.yn0 yn0Var2 = this.gUjdnLbkVAaA;
        if (yn0Var2.WDYagTQQm9ns == this.BHfvd2J71qpO) {
            return;
        }
        defpackage.e80.ZpBGe2uQfcn8("Incorrect state. Precomposed children " + this.BHfvd2J71qpO + ". Map size " + yn0Var2.WDYagTQQm9ns);
    }

    public final void QiMR8OkAhezm(int i) {
        boolean z;
        boolean z2 = false;
        this.s0TASMVLSWD5 = 0;
        java.util.List T1fB7bDYiVJQ = this.WDYagTQQm9ns.T1fB7bDYiVJQ();
        defpackage.qn0 qn0Var = (defpackage.qn0) T1fB7bDYiVJQ;
        int i2 = (((defpackage.ho0) qn0Var.oh71FJcDz6S2).QiMR8OkAhezm - this.BHfvd2J71qpO) - 1;
        if (i <= i2) {
            this.T1fB7bDYiVJQ.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    java.lang.Object QiMR8OkAhezm = this.GE9mJIPrb8gP.QiMR8OkAhezm((defpackage.jd0) qn0Var.get(i3));
                    QiMR8OkAhezm.getClass();
                    ((defpackage.tn0) this.T1fB7bDYiVJQ.oh71FJcDz6S2).ZpBGe2uQfcn8(((defpackage.pd0) QiMR8OkAhezm).ZpBGe2uQfcn8);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.QiMR8OkAhezm.WDYagTQQm9ns(this.T1fB7bDYiVJQ);
            defpackage.me1 BHfvd2J71qpO = defpackage.t80.BHfvd2J71qpO();
            defpackage.y10 WDYagTQQm9ns = BHfvd2J71qpO != null ? BHfvd2J71qpO.WDYagTQQm9ns() : null;
            defpackage.me1 UmgHb6n58gfG = defpackage.t80.UmgHb6n58gfG(BHfvd2J71qpO);
            z = false;
            while (i2 >= i) {
                try {
                    defpackage.jd0 jd0Var = (defpackage.jd0) ((defpackage.qn0) T1fB7bDYiVJQ).get(i2);
                    java.lang.Object QiMR8OkAhezm2 = this.GE9mJIPrb8gP.QiMR8OkAhezm(jd0Var);
                    QiMR8OkAhezm2.getClass();
                    defpackage.pd0 pd0Var = (defpackage.pd0) QiMR8OkAhezm2;
                    java.lang.Object obj = pd0Var.ZpBGe2uQfcn8;
                    if (((defpackage.tn0) this.T1fB7bDYiVJQ.oh71FJcDz6S2).fWTAfUmVKrZq(obj)) {
                        this.s0TASMVLSWD5++;
                        if (((java.lang.Boolean) pd0Var.QiMR8OkAhezm.getValue()).booleanValue()) {
                            defpackage.nd0 nd0Var = jd0Var.BXaznwstz2U0;
                            defpackage.uk0 uk0Var = nd0Var.XntWc4eZSQ8j;
                            defpackage.hd0 hd0Var = defpackage.hd0.QiMR8OkAhezm;
                            uk0Var.XntWc4eZSQ8j = hd0Var;
                            defpackage.qj0 qj0Var = nd0Var.WmetiUbpKU9I;
                            if (qj0Var != null) {
                                qj0Var.gUjdnLbkVAaA = hd0Var;
                            }
                            fNwYGHIYeJcR(pd0Var, false);
                            if (pd0Var.P05cfTpS5W5L) {
                                z = true;
                            }
                        }
                    } else {
                        defpackage.jd0 jd0Var2 = this.WDYagTQQm9ns;
                        jd0Var2.ZVVdXbWmyCSK = true;
                        this.GE9mJIPrb8gP.Ns0WNyEWdPsk(jd0Var);
                        defpackage.lj ljVar = pd0Var.fWTAfUmVKrZq;
                        if (ljVar != null) {
                            ljVar.h3m55N1URyyK();
                        }
                        this.WDYagTQQm9ns.OVwOqzUGHcCU(i2, 1);
                        jd0Var2.ZVVdXbWmyCSK = false;
                    }
                    this.Ns0WNyEWdPsk.Ns0WNyEWdPsk(obj);
                    i2--;
                } catch (java.lang.Throwable th) {
                    defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                    throw th;
                }
            }
            defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
        } else {
            z = false;
        }
        if (z) {
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                defpackage.zn0 zn0Var = defpackage.te1.GE9mJIPrb8gP.P05cfTpS5W5L;
                if (zn0Var != null) {
                    if (zn0Var.P05cfTpS5W5L()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                defpackage.te1.ZpBGe2uQfcn8();
            }
        }
        P05cfTpS5W5L();
    }

    @Override // defpackage.ii
    public final void ZpBGe2uQfcn8() {
        defpackage.lj ljVar;
        defpackage.jd0 jd0Var = this.WDYagTQQm9ns;
        jd0Var.ZVVdXbWmyCSK = true;
        defpackage.yn0 yn0Var = this.GE9mJIPrb8gP;
        java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
        long[] jArr = yn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (ljVar = ((defpackage.pd0) objArr[(i << 3) + i3]).fWTAfUmVKrZq) != null) {
                            ljVar.h3m55N1URyyK();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        jd0Var.Wc0TdmRSwbbi();
        jd0Var.ZVVdXbWmyCSK = false;
        yn0Var.ZpBGe2uQfcn8();
        this.Ns0WNyEWdPsk.ZpBGe2uQfcn8();
        this.BHfvd2J71qpO = 0;
        this.s0TASMVLSWD5 = 0;
        this.gUjdnLbkVAaA.ZpBGe2uQfcn8();
        P05cfTpS5W5L();
    }

    public final void e6mdH7fiFuta(boolean z) {
        this.BHfvd2J71qpO = 0;
        this.gUjdnLbkVAaA.ZpBGe2uQfcn8();
        java.util.List T1fB7bDYiVJQ = this.WDYagTQQm9ns.T1fB7bDYiVJQ();
        int i = ((defpackage.ho0) ((defpackage.qn0) T1fB7bDYiVJQ).oh71FJcDz6S2).QiMR8OkAhezm;
        if (this.s0TASMVLSWD5 != i) {
            this.s0TASMVLSWD5 = i;
            defpackage.me1 BHfvd2J71qpO = defpackage.t80.BHfvd2J71qpO();
            defpackage.y10 WDYagTQQm9ns = BHfvd2J71qpO != null ? BHfvd2J71qpO.WDYagTQQm9ns() : null;
            defpackage.me1 UmgHb6n58gfG = defpackage.t80.UmgHb6n58gfG(BHfvd2J71qpO);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    defpackage.jd0 jd0Var = (defpackage.jd0) ((defpackage.qn0) T1fB7bDYiVJQ).get(i2);
                    defpackage.pd0 pd0Var = (defpackage.pd0) this.GE9mJIPrb8gP.QiMR8OkAhezm(jd0Var);
                    if (pd0Var != null && ((java.lang.Boolean) pd0Var.QiMR8OkAhezm.getValue()).booleanValue()) {
                        defpackage.nd0 nd0Var = jd0Var.BXaznwstz2U0;
                        defpackage.uk0 uk0Var = nd0Var.XntWc4eZSQ8j;
                        defpackage.hd0 hd0Var = defpackage.hd0.QiMR8OkAhezm;
                        uk0Var.XntWc4eZSQ8j = hd0Var;
                        defpackage.qj0 qj0Var = nd0Var.WmetiUbpKU9I;
                        if (qj0Var != null) {
                            qj0Var.gUjdnLbkVAaA = hd0Var;
                        }
                        fNwYGHIYeJcR(pd0Var, z);
                        pd0Var.ZpBGe2uQfcn8 = defpackage.h0.XntWc4eZSQ8j;
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                    throw th;
                }
            }
            defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
            this.Ns0WNyEWdPsk.ZpBGe2uQfcn8();
        }
        P05cfTpS5W5L();
    }

    public final void fNwYGHIYeJcR(defpackage.pd0 pd0Var, boolean z) {
        defpackage.lj ljVar;
        if (z || !pd0Var.P05cfTpS5W5L) {
            pd0Var.QiMR8OkAhezm = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
        } else {
            pd0Var.QiMR8OkAhezm.setValue(java.lang.Boolean.FALSE);
        }
        if (pd0Var.oh71FJcDz6S2 != null) {
            WDYagTQQm9ns(pd0Var);
            return;
        }
        if (z) {
            defpackage.lj ljVar2 = pd0Var.fWTAfUmVKrZq;
            if (ljVar2 != null) {
                ljVar2.fNwYGHIYeJcR();
                return;
            }
            return;
        }
        defpackage.gv0 outOfFrameExecutor = ((defpackage.u) defpackage.md0.ZpBGe2uQfcn8(this.WDYagTQQm9ns)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (pd0Var.P05cfTpS5W5L || (ljVar = pd0Var.fWTAfUmVKrZq) == null) {
                return;
            }
            ljVar.fNwYGHIYeJcR();
            return;
        }
        defpackage.w2 w2Var = new defpackage.w2(7, pd0Var);
        defpackage.u uVar = (defpackage.u) outOfFrameExecutor;
        defpackage.p7 p7Var = uVar.h3m55N1URyyK;
        boolean isEmpty = p7Var.isEmpty();
        p7Var.addLast(w2Var);
        if (isEmpty) {
            android.os.Handler handler = uVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(uVar.gUjdnLbkVAaA);
            } else {
                defpackage.h7.w7APNrr0aGRc("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final defpackage.jd0 gUjdnLbkVAaA(java.lang.Object obj) {
        defpackage.yn0 yn0Var;
        int i;
        if (this.s0TASMVLSWD5 == 0) {
            return null;
        }
        defpackage.qn0 qn0Var = (defpackage.qn0) this.WDYagTQQm9ns.T1fB7bDYiVJQ();
        int i2 = ((defpackage.ho0) qn0Var.oh71FJcDz6S2).QiMR8OkAhezm - this.BHfvd2J71qpO;
        int i3 = i2 - this.s0TASMVLSWD5;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            yn0Var = this.GE9mJIPrb8gP;
            if (i5 < i3) {
                i = -1;
                break;
            }
            java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm((defpackage.jd0) qn0Var.get(i5));
            QiMR8OkAhezm.getClass();
            if (((defpackage.pd0) QiMR8OkAhezm).ZpBGe2uQfcn8.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                java.lang.Object QiMR8OkAhezm2 = yn0Var.QiMR8OkAhezm((defpackage.jd0) qn0Var.get(i4));
                QiMR8OkAhezm2.getClass();
                defpackage.pd0 pd0Var = (defpackage.pd0) QiMR8OkAhezm2;
                java.lang.Object obj2 = pd0Var.ZpBGe2uQfcn8;
                if (obj2 == defpackage.h0.XntWc4eZSQ8j || this.QiMR8OkAhezm.e6mdH7fiFuta(obj, obj2)) {
                    pd0Var.ZpBGe2uQfcn8 = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            GE9mJIPrb8gP(i5, i3);
        }
        this.s0TASMVLSWD5--;
        defpackage.jd0 jd0Var = (defpackage.jd0) qn0Var.get(i3);
        java.lang.Object QiMR8OkAhezm3 = yn0Var.QiMR8OkAhezm(jd0Var);
        QiMR8OkAhezm3.getClass();
        defpackage.pd0 pd0Var2 = (defpackage.pd0) QiMR8OkAhezm3;
        pd0Var2.QiMR8OkAhezm = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.TRUE);
        pd0Var2.WDYagTQQm9ns = true;
        pd0Var2.JhCgjQRTAOCT = true;
        return jd0Var;
    }

    @Override // defpackage.ii
    public final void giKS3J6vZuNy() {
        e6mdH7fiFuta(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h3m55N1URyyK(defpackage.jd0 jd0Var, java.lang.Object obj, boolean z, defpackage.c20 c20Var) {
        boolean z2;
        defpackage.lj ljVar;
        defpackage.yn0 yn0Var = this.GE9mJIPrb8gP;
        java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(jd0Var);
        java.lang.Object obj2 = QiMR8OkAhezm;
        if (QiMR8OkAhezm == null) {
            defpackage.nh nhVar = defpackage.yh.ZpBGe2uQfcn8;
            defpackage.pd0 pd0Var = new defpackage.pd0();
            pd0Var.ZpBGe2uQfcn8 = obj;
            pd0Var.giKS3J6vZuNy = nhVar;
            pd0Var.fWTAfUmVKrZq = null;
            pd0Var.QiMR8OkAhezm = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.TRUE);
            yn0Var.h3m55N1URyyK(jd0Var, pd0Var);
            obj2 = pd0Var;
        }
        defpackage.pd0 pd0Var2 = (defpackage.pd0) obj2;
        int i = 1;
        boolean z3 = pd0Var2.giKS3J6vZuNy != c20Var;
        if (pd0Var2.oh71FJcDz6S2 != null) {
            if (z3) {
                WDYagTQQm9ns(pd0Var2);
            } else if (z) {
                return;
            } else {
                JhCgjQRTAOCT(pd0Var2, true);
            }
        }
        defpackage.lj ljVar2 = pd0Var2.fWTAfUmVKrZq;
        if (ljVar2 != null) {
            synchronized (ljVar2.P05cfTpS5W5L) {
                z2 = ljVar2.s0TASMVLSWD5.WDYagTQQm9ns > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || pd0Var2.JhCgjQRTAOCT) {
            pd0Var2.giKS3J6vZuNy = c20Var;
            if (pd0Var2.oh71FJcDz6S2 != null) {
                defpackage.e80.ZpBGe2uQfcn8("new subcompose call while paused composition is still active");
            }
            defpackage.me1 BHfvd2J71qpO = defpackage.t80.BHfvd2J71qpO();
            defpackage.y10 WDYagTQQm9ns = BHfvd2J71qpO != null ? BHfvd2J71qpO.WDYagTQQm9ns() : null;
            defpackage.me1 UmgHb6n58gfG = defpackage.t80.UmgHb6n58gfG(BHfvd2J71qpO);
            try {
                defpackage.jd0 jd0Var2 = this.WDYagTQQm9ns;
                jd0Var2.ZVVdXbWmyCSK = true;
                defpackage.lj ljVar3 = pd0Var2.fWTAfUmVKrZq;
                defpackage.gj gjVar = this.oh71FJcDz6S2;
                if (gjVar == null) {
                    defpackage.e80.fWTAfUmVKrZq("parent composition reference not set");
                    throw new defpackage.vg();
                }
                if (ljVar3 != null) {
                    if (ljVar3.OcTWLQzke1i2 == 3) {
                    }
                    pd0Var2.fWTAfUmVKrZq = ljVar3;
                    defpackage.c20 c20Var2 = pd0Var2.giKS3J6vZuNy;
                    if (((defpackage.u) defpackage.md0.ZpBGe2uQfcn8(this.WDYagTQQm9ns)).getOutOfFrameExecutor() == null) {
                        pd0Var2.P05cfTpS5W5L = false;
                    } else {
                        pd0Var2.P05cfTpS5W5L = true;
                        c20Var2 = new defpackage.nh(1524156494, true, new defpackage.o0(i, pd0Var2, c20Var2));
                    }
                    if (z) {
                        if (pd0Var2.WDYagTQQm9ns) {
                            ljVar3.e6mdH7fiFuta();
                            ljVar3.WmetiUbpKU9I();
                            defpackage.e30 e30Var = ljVar3.dG7RjM6DqYVL;
                            e30Var.dG7RjM6DqYVL = 0;
                            e30Var.oCu53ZX2v4Ju = true;
                            ljVar3.WDYagTQQm9ns.ZpBGe2uQfcn8(ljVar3, c20Var2);
                            e30Var.BHfvd2J71qpO();
                        } else {
                            ljVar3.OcTWLQzke1i2(c20Var2);
                        }
                    } else if (pd0Var2.WDYagTQQm9ns) {
                        ljVar3.e6mdH7fiFuta();
                        ljVar3.WmetiUbpKU9I();
                        pd0Var2.oh71FJcDz6S2 = ljVar3.Ns0WNyEWdPsk(true, c20Var2);
                    } else {
                        pd0Var2.oh71FJcDz6S2 = ljVar3.Ns0WNyEWdPsk(ljVar3.e6mdH7fiFuta(), c20Var2);
                    }
                    pd0Var2.WDYagTQQm9ns = false;
                    jd0Var2.ZVVdXbWmyCSK = false;
                    defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                    pd0Var2.JhCgjQRTAOCT = false;
                }
                if (z) {
                    android.view.ViewGroup.LayoutParams layoutParams = defpackage.sx1.ZpBGe2uQfcn8;
                    ljVar = new defpackage.lj(gjVar, new defpackage.bs1(jd0Var));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = defpackage.sx1.ZpBGe2uQfcn8;
                    ljVar = new defpackage.lj(gjVar, new defpackage.bs1(jd0Var));
                }
                ljVar3 = ljVar;
                pd0Var2.fWTAfUmVKrZq = ljVar3;
                defpackage.c20 c20Var22 = pd0Var2.giKS3J6vZuNy;
                if (((defpackage.u) defpackage.md0.ZpBGe2uQfcn8(this.WDYagTQQm9ns)).getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                pd0Var2.WDYagTQQm9ns = false;
                jd0Var2.ZVVdXbWmyCSK = false;
                defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                pd0Var2.JhCgjQRTAOCT = false;
            } catch (java.lang.Throwable th) {
                defpackage.t80.IBvW5fLsPuHy(BHfvd2J71qpO, UmgHb6n58gfG, WDYagTQQm9ns);
                throw th;
            }
        }
    }

    public final defpackage.oh1 oh71FJcDz6S2(java.lang.Object obj) {
        return !this.WDYagTQQm9ns.KrtOTfE6jiS2() ? new defpackage.ud0() : new defpackage.vd0(this, obj);
    }
}
