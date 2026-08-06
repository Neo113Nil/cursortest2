package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class te1 {
    public static final defpackage.u30 GE9mJIPrb8gP;
    public static defpackage.re1 JhCgjQRTAOCT;
    public static final defpackage.h8 Ns0WNyEWdPsk;
    public static java.util.List P05cfTpS5W5L;
    public static final defpackage.x1 QiMR8OkAhezm;
    public static long WDYagTQQm9ns;
    public static java.util.List e6mdH7fiFuta;
    public static final defpackage.pe1 oh71FJcDz6S2;
    public static final defpackage.g81 ZpBGe2uQfcn8 = new defpackage.g81(26);
    public static final defpackage.a7 giKS3J6vZuNy = new defpackage.a7(16);
    public static final java.lang.Object fWTAfUmVKrZq = new java.lang.Object();

    static {
        defpackage.re1 re1Var = defpackage.re1.e6mdH7fiFuta;
        JhCgjQRTAOCT = re1Var;
        WDYagTQQm9ns = 2L;
        defpackage.pe1 pe1Var = new defpackage.pe1();
        pe1Var.giKS3J6vZuNy = new long[16];
        pe1Var.fWTAfUmVKrZq = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        pe1Var.JhCgjQRTAOCT = iArr;
        oh71FJcDz6S2 = pe1Var;
        defpackage.x1 x1Var = new defpackage.x1();
        x1Var.giKS3J6vZuNy = new int[16];
        x1Var.fWTAfUmVKrZq = new defpackage.zu1[16];
        QiMR8OkAhezm = x1Var;
        defpackage.av avVar = defpackage.av.WDYagTQQm9ns;
        P05cfTpS5W5L = avVar;
        e6mdH7fiFuta = avVar;
        long j = WDYagTQQm9ns;
        WDYagTQQm9ns = 1 + j;
        defpackage.u30 u30Var = new defpackage.u30(j, re1Var, null, new defpackage.awuGf4qH8HFd(10));
        JhCgjQRTAOCT = JhCgjQRTAOCT.WDYagTQQm9ns(u30Var.giKS3J6vZuNy);
        GE9mJIPrb8gP = u30Var;
        Ns0WNyEWdPsk = new defpackage.h8(0);
    }

    public static final defpackage.lg1 BHfvd2J71qpO(defpackage.lg1 lg1Var, long j, defpackage.re1 re1Var) {
        defpackage.lg1 lg1Var2 = null;
        while (lg1Var != null) {
            long j2 = lg1Var.ZpBGe2uQfcn8;
            if (j2 != 0 && defpackage.ma0.h3m55N1URyyK(j2, j) <= 0 && !re1Var.fWTAfUmVKrZq(j2) && (lg1Var2 == null || defpackage.ma0.h3m55N1URyyK(lg1Var2.ZpBGe2uQfcn8, lg1Var.ZpBGe2uQfcn8) < 0)) {
                lg1Var2 = lg1Var;
            }
            lg1Var = lg1Var.giKS3J6vZuNy;
        }
        if (lg1Var2 != null) {
            return lg1Var2;
        }
        return null;
    }

    public static final defpackage.me1 GE9mJIPrb8gP() {
        defpackage.me1 me1Var = (defpackage.me1) giKS3J6vZuNy.WDYagTQQm9ns();
        return me1Var == null ? GE9mJIPrb8gP : me1Var;
    }

    public static final defpackage.lg1 IJ0hOnjhPOri(defpackage.lg1 lg1Var, defpackage.jg1 jg1Var, defpackage.me1 me1Var) {
        defpackage.lg1 BHfvd2J71qpO;
        if (me1Var.oh71FJcDz6S2()) {
            me1Var.gUjdnLbkVAaA(jg1Var);
        }
        long QiMR8OkAhezm2 = me1Var.QiMR8OkAhezm();
        defpackage.lg1 BHfvd2J71qpO2 = BHfvd2J71qpO(lg1Var, QiMR8OkAhezm2, me1Var.JhCgjQRTAOCT());
        if (BHfvd2J71qpO2 == null) {
            s0TASMVLSWD5();
            throw null;
        }
        if (BHfvd2J71qpO2.ZpBGe2uQfcn8 == me1Var.QiMR8OkAhezm()) {
            return BHfvd2J71qpO2;
        }
        synchronized (fWTAfUmVKrZq) {
            BHfvd2J71qpO = BHfvd2J71qpO(jg1Var.ZpBGe2uQfcn8(), QiMR8OkAhezm2, me1Var.JhCgjQRTAOCT());
            if (BHfvd2J71qpO == null) {
                s0TASMVLSWD5();
                throw null;
            }
            if (BHfvd2J71qpO.ZpBGe2uQfcn8 != QiMR8OkAhezm2) {
                defpackage.lg1 h3m55N1URyyK = h3m55N1URyyK(BHfvd2J71qpO, jg1Var);
                h3m55N1URyyK.ZpBGe2uQfcn8(BHfvd2J71qpO);
                h3m55N1URyyK.ZpBGe2uQfcn8 = me1Var.QiMR8OkAhezm();
                BHfvd2J71qpO = h3m55N1URyyK;
            }
        }
        if (BHfvd2J71qpO2.ZpBGe2uQfcn8 != 1) {
            me1Var.gUjdnLbkVAaA(jg1Var);
        }
        return BHfvd2J71qpO;
    }

    public static final defpackage.re1 JhCgjQRTAOCT(defpackage.re1 re1Var, long j, long j2) {
        while (defpackage.ma0.h3m55N1URyyK(j, j2) < 0) {
            re1Var = re1Var.WDYagTQQm9ns(j);
            j++;
        }
        return re1Var;
    }

    public static final defpackage.y10 Ns0WNyEWdPsk(defpackage.y10 y10Var, defpackage.y10 y10Var2, boolean z) {
        if (!z) {
            y10Var2 = null;
        }
        return (y10Var == null || y10Var2 == null || y10Var == y10Var2) ? y10Var == null ? y10Var2 : y10Var : new defpackage.se1(y10Var, y10Var2, 0);
    }

    public static final defpackage.lg1 P05cfTpS5W5L(defpackage.lg1 lg1Var) {
        defpackage.lg1 BHfvd2J71qpO;
        defpackage.me1 GE9mJIPrb8gP2 = GE9mJIPrb8gP();
        defpackage.lg1 BHfvd2J71qpO2 = BHfvd2J71qpO(lg1Var, GE9mJIPrb8gP2.QiMR8OkAhezm(), GE9mJIPrb8gP2.JhCgjQRTAOCT());
        if (BHfvd2J71qpO2 != null) {
            return BHfvd2J71qpO2;
        }
        synchronized (fWTAfUmVKrZq) {
            defpackage.me1 GE9mJIPrb8gP3 = GE9mJIPrb8gP();
            BHfvd2J71qpO = BHfvd2J71qpO(lg1Var, GE9mJIPrb8gP3.QiMR8OkAhezm(), GE9mJIPrb8gP3.JhCgjQRTAOCT());
        }
        if (BHfvd2J71qpO != null) {
            return BHfvd2J71qpO;
        }
        s0TASMVLSWD5();
        throw null;
    }

    public static final defpackage.me1 QiMR8OkAhezm(defpackage.me1 me1Var, defpackage.y10 y10Var, boolean z) {
        boolean z2 = me1Var instanceof defpackage.do0;
        if (z2 || me1Var == null) {
            return new defpackage.op1(z2 ? (defpackage.do0) me1Var : null, y10Var, null, false, z);
        }
        return new defpackage.pp1(me1Var, y10Var, false, z);
    }

    public static final defpackage.lg1 T1fB7bDYiVJQ(defpackage.lg1 lg1Var, defpackage.kg1 kg1Var, defpackage.me1 me1Var, defpackage.lg1 lg1Var2) {
        defpackage.lg1 h3m55N1URyyK;
        if (me1Var.oh71FJcDz6S2()) {
            me1Var.gUjdnLbkVAaA(kg1Var);
        }
        long QiMR8OkAhezm2 = me1Var.QiMR8OkAhezm();
        if (lg1Var2.ZpBGe2uQfcn8 == QiMR8OkAhezm2) {
            return lg1Var2;
        }
        synchronized (fWTAfUmVKrZq) {
            h3m55N1URyyK = h3m55N1URyyK(lg1Var, kg1Var);
        }
        h3m55N1URyyK.ZpBGe2uQfcn8 = QiMR8OkAhezm2;
        if (lg1Var2.ZpBGe2uQfcn8 != 1) {
            me1Var.gUjdnLbkVAaA(kg1Var);
        }
        return h3m55N1URyyK;
    }

    public static final java.lang.Object WDYagTQQm9ns(defpackage.y10 y10Var) {
        defpackage.zn0 zn0Var;
        java.lang.Object maCixPsq4ml2;
        defpackage.u30 u30Var = GE9mJIPrb8gP;
        synchronized (fWTAfUmVKrZq) {
            try {
                zn0Var = u30Var.P05cfTpS5W5L;
                if (zn0Var != null) {
                    Ns0WNyEWdPsk.addAndGet(1);
                }
                maCixPsq4ml2 = maCixPsq4ml2(u30Var, y10Var);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (zn0Var != null) {
            try {
                java.util.List list = P05cfTpS5W5L;
                defpackage.o81 o81Var = new defpackage.o81(zn0Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.c20) list.get(i)).QiMR8OkAhezm(o81Var, u30Var);
                }
            } finally {
                Ns0WNyEWdPsk.addAndGet(-1);
            }
        }
        synchronized (fWTAfUmVKrZq) {
            oh71FJcDz6S2();
            if (zn0Var != null) {
                java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
                long[] jArr = zn0Var.ZpBGe2uQfcn8;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    WmetiUbpKU9I((defpackage.jg1) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return maCixPsq4ml2;
    }

    public static final void WmetiUbpKU9I(defpackage.jg1 jg1Var) {
        if (XntWc4eZSQ8j(jg1Var)) {
            defpackage.x1 x1Var = QiMR8OkAhezm;
            int i = x1Var.ZpBGe2uQfcn8;
            int identityHashCode = java.lang.System.identityHashCode(jg1Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = x1Var.ZpBGe2uQfcn8 - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) x1Var.giKS3J6vZuNy)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        defpackage.zu1 zu1Var = ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i5];
                        if (jg1Var != (zu1Var != null ? zu1Var.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) x1Var.giKS3J6vZuNy)[i7] == identityHashCode; i7--) {
                                defpackage.zu1 zu1Var2 = ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i7];
                                if ((zu1Var2 != null ? zu1Var2.get() : null) == jg1Var) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = x1Var.ZpBGe2uQfcn8;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(x1Var.ZpBGe2uQfcn8 + 1);
                                    break;
                                } else {
                                    if (((int[]) x1Var.giKS3J6vZuNy)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    defpackage.zu1 zu1Var3 = ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i5];
                                    if ((zu1Var3 != null ? zu1Var3.get() : null) == jg1Var) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            defpackage.zu1[] zu1VarArr = (defpackage.zu1[]) x1Var.fWTAfUmVKrZq;
            int length = zu1VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                defpackage.zu1[] zu1VarArr2 = new defpackage.zu1[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                java.lang.System.arraycopy(zu1VarArr, i9, zu1VarArr2, i11, i - i9);
                java.lang.System.arraycopy((defpackage.zu1[]) x1Var.fWTAfUmVKrZq, 0, zu1VarArr2, 0, i9);
                defpackage.y7.cCeDCHgnx5OL((int[]) x1Var.giKS3J6vZuNy, iArr, i11, i9, i);
                defpackage.y7.m6iZQUu7XjoL((int[]) x1Var.giKS3J6vZuNy, iArr, 0, i9, 6);
                x1Var.fWTAfUmVKrZq = zu1VarArr2;
                x1Var.giKS3J6vZuNy = iArr;
            } else {
                int i12 = i9 + 1;
                java.lang.System.arraycopy(zu1VarArr, i9, zu1VarArr, i12, i - i9);
                int[] iArr2 = (int[]) x1Var.giKS3J6vZuNy;
                defpackage.y7.cCeDCHgnx5OL(iArr2, iArr2, i12, i9, i);
            }
            ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i9] = new defpackage.zu1(jg1Var);
            ((int[]) x1Var.giKS3J6vZuNy)[i9] = identityHashCode;
            x1Var.ZpBGe2uQfcn8++;
        }
    }

    public static final boolean XntWc4eZSQ8j(defpackage.jg1 jg1Var) {
        defpackage.lg1 lg1Var;
        long j = WDYagTQQm9ns;
        defpackage.pe1 pe1Var = oh71FJcDz6S2;
        if (pe1Var.ZpBGe2uQfcn8 > 0) {
            j = pe1Var.giKS3J6vZuNy[0];
        }
        defpackage.lg1 lg1Var2 = null;
        defpackage.lg1 lg1Var3 = null;
        int i = 0;
        for (defpackage.lg1 ZpBGe2uQfcn82 = jg1Var.ZpBGe2uQfcn8(); ZpBGe2uQfcn82 != null; ZpBGe2uQfcn82 = ZpBGe2uQfcn82.giKS3J6vZuNy) {
            long j2 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
            if (j2 != 0) {
                if (defpackage.ma0.h3m55N1URyyK(j2, j) >= 0) {
                    i++;
                } else if (lg1Var2 == null) {
                    i++;
                    lg1Var2 = ZpBGe2uQfcn82;
                } else {
                    if (defpackage.ma0.h3m55N1URyyK(ZpBGe2uQfcn82.ZpBGe2uQfcn8, lg1Var2.ZpBGe2uQfcn8) < 0) {
                        lg1Var = lg1Var2;
                        lg1Var2 = ZpBGe2uQfcn82;
                    } else {
                        lg1Var = ZpBGe2uQfcn82;
                    }
                    if (lg1Var3 == null) {
                        lg1Var3 = jg1Var.ZpBGe2uQfcn8();
                        defpackage.lg1 lg1Var4 = lg1Var3;
                        while (true) {
                            if (lg1Var3 == null) {
                                lg1Var3 = lg1Var4;
                                break;
                            }
                            if (defpackage.ma0.h3m55N1URyyK(lg1Var3.ZpBGe2uQfcn8, j) >= 0) {
                                break;
                            }
                            if (defpackage.ma0.h3m55N1URyyK(lg1Var4.ZpBGe2uQfcn8, lg1Var3.ZpBGe2uQfcn8) < 0) {
                                lg1Var4 = lg1Var3;
                            }
                            lg1Var3 = lg1Var3.giKS3J6vZuNy;
                        }
                    }
                    lg1Var2.ZpBGe2uQfcn8 = 0L;
                    lg1Var2.ZpBGe2uQfcn8(lg1Var3);
                    lg1Var2 = lg1Var;
                }
            }
        }
        return i > 1;
    }

    public static final defpackage.lg1 ZVVdXbWmyCSK(defpackage.lg1 lg1Var, defpackage.jg1 jg1Var) {
        defpackage.lg1 BHfvd2J71qpO;
        defpackage.me1 GE9mJIPrb8gP2 = GE9mJIPrb8gP();
        defpackage.y10 WDYagTQQm9ns2 = GE9mJIPrb8gP2.WDYagTQQm9ns();
        if (WDYagTQQm9ns2 != null) {
            WDYagTQQm9ns2.P05cfTpS5W5L(jg1Var);
        }
        defpackage.lg1 BHfvd2J71qpO2 = BHfvd2J71qpO(lg1Var, GE9mJIPrb8gP2.QiMR8OkAhezm(), GE9mJIPrb8gP2.JhCgjQRTAOCT());
        if (BHfvd2J71qpO2 != null) {
            return BHfvd2J71qpO2;
        }
        synchronized (fWTAfUmVKrZq) {
            defpackage.me1 GE9mJIPrb8gP3 = GE9mJIPrb8gP();
            defpackage.lg1 ZpBGe2uQfcn82 = jg1Var.ZpBGe2uQfcn8();
            ZpBGe2uQfcn82.getClass();
            BHfvd2J71qpO = BHfvd2J71qpO(ZpBGe2uQfcn82, GE9mJIPrb8gP3.QiMR8OkAhezm(), GE9mJIPrb8gP3.JhCgjQRTAOCT());
            if (BHfvd2J71qpO == null) {
                s0TASMVLSWD5();
                throw null;
            }
        }
        return BHfvd2J71qpO;
    }

    public static final void ZpBGe2uQfcn8() {
        WDYagTQQm9ns(ZpBGe2uQfcn8);
    }

    public static final defpackage.lg1 e6mdH7fiFuta(defpackage.lg1 lg1Var, defpackage.me1 me1Var) {
        defpackage.lg1 BHfvd2J71qpO;
        defpackage.lg1 BHfvd2J71qpO2 = BHfvd2J71qpO(lg1Var, me1Var.QiMR8OkAhezm(), me1Var.JhCgjQRTAOCT());
        if (BHfvd2J71qpO2 != null) {
            return BHfvd2J71qpO2;
        }
        synchronized (fWTAfUmVKrZq) {
            BHfvd2J71qpO = BHfvd2J71qpO(lg1Var, me1Var.QiMR8OkAhezm(), me1Var.JhCgjQRTAOCT());
        }
        if (BHfvd2J71qpO != null) {
            return BHfvd2J71qpO;
        }
        s0TASMVLSWD5();
        throw null;
    }

    public static final defpackage.y10 fNwYGHIYeJcR(defpackage.y10 y10Var, defpackage.y10 y10Var2) {
        return (y10Var == null || y10Var2 == null || y10Var == y10Var2) ? y10Var == null ? y10Var2 : y10Var : new defpackage.se1(y10Var, y10Var2, 1);
    }

    public static final void fWTAfUmVKrZq(defpackage.me1 me1Var) {
        long j;
        if (JhCgjQRTAOCT.fWTAfUmVKrZq(me1Var.QiMR8OkAhezm())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(me1Var.QiMR8OkAhezm());
        sb.append(", disposed=");
        sb.append(me1Var.fWTAfUmVKrZq);
        sb.append(", applied=");
        defpackage.do0 do0Var = me1Var instanceof defpackage.do0 ? (defpackage.do0) me1Var : null;
        sb.append(do0Var != null ? java.lang.Boolean.valueOf(do0Var.h3m55N1URyyK) : "read-only");
        sb.append(", lowestPin=");
        synchronized (fWTAfUmVKrZq) {
            defpackage.pe1 pe1Var = oh71FJcDz6S2;
            j = pe1Var.ZpBGe2uQfcn8 > 0 ? pe1Var.giKS3J6vZuNy[0] : -1L;
        }
        sb.append(j);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final void gUjdnLbkVAaA(defpackage.me1 me1Var, defpackage.jg1 jg1Var) {
        me1Var.ZVVdXbWmyCSK(me1Var.P05cfTpS5W5L() + 1);
        defpackage.y10 e6mdH7fiFuta2 = me1Var.e6mdH7fiFuta();
        if (e6mdH7fiFuta2 != null) {
            e6mdH7fiFuta2.P05cfTpS5W5L(jg1Var);
        }
    }

    public static final java.util.HashMap giKS3J6vZuNy(long j, defpackage.do0 do0Var, defpackage.re1 re1Var) {
        long[] jArr;
        defpackage.re1 re1Var2;
        long[] jArr2;
        defpackage.re1 re1Var3;
        int i;
        int i2;
        defpackage.lg1 BHfvd2J71qpO;
        defpackage.zn0 VFeft99leXEK = do0Var.VFeft99leXEK();
        if (VFeft99leXEK != null) {
            long QiMR8OkAhezm2 = do0Var.QiMR8OkAhezm();
            defpackage.re1 JhCgjQRTAOCT2 = do0Var.JhCgjQRTAOCT().WDYagTQQm9ns(QiMR8OkAhezm2).JhCgjQRTAOCT(do0Var.GE9mJIPrb8gP);
            java.lang.Object[] objArr = VFeft99leXEK.giKS3J6vZuNy;
            long[] jArr3 = VFeft99leXEK.ZpBGe2uQfcn8;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                java.util.HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                defpackage.jg1 jg1Var = (defpackage.jg1) objArr[(i3 << 3) + i6];
                                defpackage.lg1 ZpBGe2uQfcn82 = jg1Var.ZpBGe2uQfcn8();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                defpackage.lg1 BHfvd2J71qpO2 = BHfvd2J71qpO(ZpBGe2uQfcn82, j, re1Var);
                                if (BHfvd2J71qpO2 == null || (BHfvd2J71qpO = BHfvd2J71qpO(ZpBGe2uQfcn82, QiMR8OkAhezm2, JhCgjQRTAOCT2)) == null || BHfvd2J71qpO2.equals(BHfvd2J71qpO)) {
                                    re1Var3 = JhCgjQRTAOCT2;
                                } else {
                                    re1Var3 = JhCgjQRTAOCT2;
                                    defpackage.lg1 BHfvd2J71qpO3 = BHfvd2J71qpO(ZpBGe2uQfcn82, QiMR8OkAhezm2, do0Var.JhCgjQRTAOCT());
                                    if (BHfvd2J71qpO3 == null) {
                                        s0TASMVLSWD5();
                                        throw null;
                                    }
                                    defpackage.lg1 giKS3J6vZuNy2 = jg1Var.giKS3J6vZuNy(BHfvd2J71qpO, BHfvd2J71qpO2, BHfvd2J71qpO3);
                                    if (giKS3J6vZuNy2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new java.util.HashMap();
                                    }
                                    hashMap.put(BHfvd2J71qpO2, giKS3J6vZuNy2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                re1Var3 = JhCgjQRTAOCT2;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            JhCgjQRTAOCT2 = re1Var3;
                        }
                        jArr = jArr3;
                        re1Var2 = JhCgjQRTAOCT2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        re1Var2 = JhCgjQRTAOCT2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    JhCgjQRTAOCT2 = re1Var2;
                }
            }
        }
        return null;
    }

    public static final defpackage.lg1 h3m55N1URyyK(defpackage.lg1 lg1Var, defpackage.jg1 jg1Var) {
        defpackage.lg1 ZpBGe2uQfcn82 = jg1Var.ZpBGe2uQfcn8();
        long j = WDYagTQQm9ns;
        defpackage.pe1 pe1Var = oh71FJcDz6S2;
        if (pe1Var.ZpBGe2uQfcn8 > 0) {
            j = pe1Var.giKS3J6vZuNy[0];
        }
        long j2 = j - 1;
        defpackage.lg1 lg1Var2 = null;
        defpackage.lg1 lg1Var3 = null;
        while (true) {
            if (ZpBGe2uQfcn82 == null) {
                break;
            }
            long j3 = ZpBGe2uQfcn82.ZpBGe2uQfcn8;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && defpackage.ma0.h3m55N1URyyK(j3, j2) <= 0 && !defpackage.re1.e6mdH7fiFuta.fWTAfUmVKrZq(j3)) {
                if (lg1Var3 == null) {
                    lg1Var3 = ZpBGe2uQfcn82;
                } else if (defpackage.ma0.h3m55N1URyyK(ZpBGe2uQfcn82.ZpBGe2uQfcn8, lg1Var3.ZpBGe2uQfcn8) >= 0) {
                    lg1Var2 = lg1Var3;
                }
            }
            ZpBGe2uQfcn82 = ZpBGe2uQfcn82.giKS3J6vZuNy;
        }
        lg1Var2 = ZpBGe2uQfcn82;
        if (lg1Var2 != null) {
            lg1Var2.ZpBGe2uQfcn8 = Long.MAX_VALUE;
            return lg1Var2;
        }
        defpackage.lg1 giKS3J6vZuNy2 = lg1Var.giKS3J6vZuNy(Long.MAX_VALUE);
        giKS3J6vZuNy2.giKS3J6vZuNy = jg1Var.ZpBGe2uQfcn8();
        jg1Var.JhCgjQRTAOCT(giKS3J6vZuNy2);
        return giKS3J6vZuNy2;
    }

    public static final java.lang.Object maCixPsq4ml2(defpackage.u30 u30Var, defpackage.y10 y10Var) {
        long j = u30Var.giKS3J6vZuNy;
        java.lang.Object P05cfTpS5W5L2 = y10Var.P05cfTpS5W5L(JhCgjQRTAOCT.giKS3J6vZuNy(j));
        long j2 = WDYagTQQm9ns;
        WDYagTQQm9ns = 1 + j2;
        defpackage.re1 giKS3J6vZuNy2 = JhCgjQRTAOCT.giKS3J6vZuNy(j);
        JhCgjQRTAOCT = giKS3J6vZuNy2;
        u30Var.giKS3J6vZuNy = j2;
        u30Var.ZpBGe2uQfcn8 = giKS3J6vZuNy2;
        u30Var.QiMR8OkAhezm = 0;
        u30Var.P05cfTpS5W5L = null;
        u30Var.T1fB7bDYiVJQ();
        JhCgjQRTAOCT = JhCgjQRTAOCT.WDYagTQQm9ns(j2);
        return P05cfTpS5W5L2;
    }

    public static final void oh71FJcDz6S2() {
        defpackage.x1 x1Var = QiMR8OkAhezm;
        int i = x1Var.ZpBGe2uQfcn8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            defpackage.zu1 zu1Var = ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i2];
            java.lang.Object obj = zu1Var != null ? zu1Var.get() : null;
            if (obj != null && XntWc4eZSQ8j((defpackage.jg1) obj)) {
                if (i3 != i2) {
                    ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i3] = zu1Var;
                    int[] iArr = (int[]) x1Var.giKS3J6vZuNy;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((defpackage.zu1[]) x1Var.fWTAfUmVKrZq)[i4] = null;
            ((int[]) x1Var.giKS3J6vZuNy)[i4] = 0;
        }
        if (i3 != i) {
            x1Var.ZpBGe2uQfcn8 = i3;
        }
    }

    public static final void s0TASMVLSWD5() {
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final void w7APNrr0aGRc(int i) {
        defpackage.pe1 pe1Var = oh71FJcDz6S2;
        int i2 = pe1Var.JhCgjQRTAOCT[i];
        pe1Var.giKS3J6vZuNy(i2, pe1Var.ZpBGe2uQfcn8 - 1);
        pe1Var.ZpBGe2uQfcn8--;
        long[] jArr = pe1Var.giKS3J6vZuNy;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (defpackage.ma0.h3m55N1URyyK(jArr[i4], j) <= 0) {
                break;
            }
            pe1Var.giKS3J6vZuNy(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = pe1Var.giKS3J6vZuNy;
        int i5 = pe1Var.ZpBGe2uQfcn8 >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < pe1Var.ZpBGe2uQfcn8 && defpackage.ma0.h3m55N1URyyK(jArr2[i6], jArr2[i7]) < 0) {
                if (defpackage.ma0.h3m55N1URyyK(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                pe1Var.giKS3J6vZuNy(i6, i2);
                i2 = i6;
            } else {
                if (defpackage.ma0.h3m55N1URyyK(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                pe1Var.giKS3J6vZuNy(i7, i2);
                i2 = i7;
            }
        }
        pe1Var.JhCgjQRTAOCT[i] = pe1Var.WDYagTQQm9ns;
        pe1Var.WDYagTQQm9ns = i;
    }
}
