package defpackage;

/* loaded from: classes.dex */
public abstract class wa1 {
    public static final defpackage.p2 AARZUJiTa;
    public static java.util.List EXtogiMhuM;
    public static defpackage.ua1 F7NU4MC0GW;
    public static final defpackage.l20 SH1y5HwkJhh;
    public static long adDC3e2L;
    public static final defpackage.y6 ez2rX8ReCYw;
    public static java.util.List riuEU0zW4;
    public static final defpackage.nk0 xiZrDbcSW0;
    public static final defpackage.r41 IHQe1A4L2xu = new defpackage.r41(5);
    public static final defpackage.v5 oh6vYeIP = new defpackage.v5(14);
    public static final java.lang.Object r1MBDhnF = new java.lang.Object();

    static {
        defpackage.ua1 ua1Var = defpackage.ua1.riuEU0zW4;
        F7NU4MC0GW = ua1Var;
        adDC3e2L = 2L;
        defpackage.nk0 nk0Var = new defpackage.nk0();
        nk0Var.r1MBDhnF = new long[16];
        nk0Var.F7NU4MC0GW = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        nk0Var.adDC3e2L = iArr;
        xiZrDbcSW0 = nk0Var;
        defpackage.p2 p2Var = new defpackage.p2();
        p2Var.oh6vYeIP = new int[16];
        p2Var.r1MBDhnF = new defpackage.jn1[16];
        AARZUJiTa = p2Var;
        defpackage.nt ntVar = defpackage.nt.adDC3e2L;
        EXtogiMhuM = ntVar;
        riuEU0zW4 = ntVar;
        long j = adDC3e2L;
        adDC3e2L = 1 + j;
        defpackage.l20 l20Var = new defpackage.l20(j, ua1Var, null, new defpackage.JX5fKip1C6(27));
        F7NU4MC0GW = F7NU4MC0GW.xiZrDbcSW0(l20Var.oh6vYeIP);
        SH1y5HwkJhh = l20Var;
        ez2rX8ReCYw = new defpackage.y6(0);
    }

    public static final defpackage.oa1 AARZUJiTa(defpackage.oa1 oa1Var, defpackage.g00 g00Var, boolean z) {
        boolean z2 = oa1Var instanceof defpackage.rl0;
        if (z2 || oa1Var == null) {
            return new defpackage.ri1(z2 ? (defpackage.rl0) oa1Var : null, g00Var, null, false, z);
        }
        return new defpackage.si1(oa1Var, g00Var, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.mc1 DFo87pBq1E5(defpackage.mc1 mc1Var, defpackage.kc1 kc1Var) {
        defpackage.mc1 IHQe1A4L2xu2 = kc1Var.IHQe1A4L2xu();
        long j = adDC3e2L;
        defpackage.nk0 nk0Var = xiZrDbcSW0;
        if (nk0Var.IHQe1A4L2xu > 0) {
            j = ((long[]) nk0Var.r1MBDhnF)[0];
        }
        long j2 = j - 1;
        defpackage.mc1 mc1Var2 = null;
        defpackage.mc1 mc1Var3 = null;
        while (true) {
            if (IHQe1A4L2xu2 == null) {
                break;
            }
            long j3 = IHQe1A4L2xu2.IHQe1A4L2xu;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && defpackage.x70.V7bD7b8KA(j3, j2) <= 0 && !defpackage.ua1.riuEU0zW4.r1MBDhnF(j3)) {
                if (mc1Var3 == null) {
                    mc1Var3 = IHQe1A4L2xu2;
                } else if (defpackage.x70.V7bD7b8KA(IHQe1A4L2xu2.IHQe1A4L2xu, mc1Var3.IHQe1A4L2xu) >= 0) {
                    mc1Var2 = mc1Var3;
                }
            }
            IHQe1A4L2xu2 = IHQe1A4L2xu2.oh6vYeIP;
        }
        if (mc1Var2 != null) {
            mc1Var2.IHQe1A4L2xu = Long.MAX_VALUE;
            return mc1Var2;
        }
        defpackage.mc1 oh6vYeIP2 = mc1Var.oh6vYeIP(Long.MAX_VALUE);
        oh6vYeIP2.oh6vYeIP = kc1Var.IHQe1A4L2xu();
        kc1Var.r1MBDhnF(oh6vYeIP2);
        return oh6vYeIP2;
    }

    public static final defpackage.mc1 EXtogiMhuM(defpackage.mc1 mc1Var) {
        defpackage.mc1 EgCjBq0SZwJ;
        defpackage.oa1 SH1y5HwkJhh2 = SH1y5HwkJhh();
        defpackage.mc1 EgCjBq0SZwJ2 = EgCjBq0SZwJ(mc1Var, SH1y5HwkJhh2.AARZUJiTa(), SH1y5HwkJhh2.F7NU4MC0GW());
        if (EgCjBq0SZwJ2 != null) {
            return EgCjBq0SZwJ2;
        }
        synchronized (r1MBDhnF) {
            defpackage.oa1 SH1y5HwkJhh3 = SH1y5HwkJhh();
            EgCjBq0SZwJ = EgCjBq0SZwJ(mc1Var, SH1y5HwkJhh3.AARZUJiTa(), SH1y5HwkJhh3.F7NU4MC0GW());
        }
        if (EgCjBq0SZwJ != null) {
            return EgCjBq0SZwJ;
        }
        kd6TUFXn();
        throw null;
    }

    public static final defpackage.mc1 EgCjBq0SZwJ(defpackage.mc1 mc1Var, long j, defpackage.ua1 ua1Var) {
        defpackage.mc1 mc1Var2 = null;
        while (mc1Var != null) {
            long j2 = mc1Var.IHQe1A4L2xu;
            if (j2 != 0 && defpackage.x70.V7bD7b8KA(j2, j) <= 0 && !ua1Var.r1MBDhnF(j2) && (mc1Var2 == null || defpackage.x70.V7bD7b8KA(mc1Var2.IHQe1A4L2xu, mc1Var.IHQe1A4L2xu) < 0)) {
                mc1Var2 = mc1Var;
            }
            mc1Var = mc1Var.oh6vYeIP;
        }
        if (mc1Var2 != null) {
            return mc1Var2;
        }
        return null;
    }

    public static final defpackage.ua1 F7NU4MC0GW(defpackage.ua1 ua1Var, long j, long j2) {
        while (defpackage.x70.V7bD7b8KA(j, j2) < 0) {
            ua1Var = ua1Var.xiZrDbcSW0(j);
            j++;
        }
        return ua1Var;
    }

    public static final void G3OKOH3wZRC(defpackage.kc1 kc1Var) {
        if (QoRHpC4k(kc1Var)) {
            defpackage.p2 p2Var = AARZUJiTa;
            int i = p2Var.IHQe1A4L2xu;
            int identityHashCode = java.lang.System.identityHashCode(kc1Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = p2Var.IHQe1A4L2xu - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) p2Var.oh6vYeIP)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        defpackage.jn1 jn1Var = ((defpackage.jn1[]) p2Var.r1MBDhnF)[i5];
                        if (kc1Var != (jn1Var != null ? jn1Var.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) p2Var.oh6vYeIP)[i7] == identityHashCode; i7--) {
                                defpackage.jn1 jn1Var2 = ((defpackage.jn1[]) p2Var.r1MBDhnF)[i7];
                                if ((jn1Var2 != null ? jn1Var2.get() : null) == kc1Var) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = p2Var.IHQe1A4L2xu;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(p2Var.IHQe1A4L2xu + 1);
                                    break;
                                } else {
                                    if (((int[]) p2Var.oh6vYeIP)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    defpackage.jn1 jn1Var3 = ((defpackage.jn1[]) p2Var.r1MBDhnF)[i5];
                                    if ((jn1Var3 != null ? jn1Var3.get() : null) == kc1Var) {
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
            defpackage.jn1[] jn1VarArr = (defpackage.jn1[]) p2Var.r1MBDhnF;
            int length = jn1VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                defpackage.jn1[] jn1VarArr2 = new defpackage.jn1[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                java.lang.System.arraycopy(jn1VarArr, i9, jn1VarArr2, i11, i - i9);
                java.lang.System.arraycopy((defpackage.jn1[]) p2Var.r1MBDhnF, 0, jn1VarArr2, 0, i9);
                defpackage.t6.Ye0N2xE9Hc((int[]) p2Var.oh6vYeIP, iArr, i11, i9, i);
                defpackage.t6.AsxAYCCkb3Hi((int[]) p2Var.oh6vYeIP, iArr, 0, i9, 6);
                p2Var.r1MBDhnF = jn1VarArr2;
                p2Var.oh6vYeIP = iArr;
            } else {
                int i12 = i9 + 1;
                java.lang.System.arraycopy(jn1VarArr, i9, jn1VarArr, i12, i - i9);
                int[] iArr2 = (int[]) p2Var.oh6vYeIP;
                defpackage.t6.Ye0N2xE9Hc(iArr2, iArr2, i12, i9, i);
            }
            ((defpackage.jn1[]) p2Var.r1MBDhnF)[i9] = new defpackage.jn1(kc1Var);
            ((int[]) p2Var.oh6vYeIP)[i9] = identityHashCode;
            p2Var.IHQe1A4L2xu++;
        }
    }

    public static final void IHQe1A4L2xu() {
        adDC3e2L(IHQe1A4L2xu);
    }

    public static final defpackage.g00 JlrlGoKF(defpackage.g00 g00Var, defpackage.g00 g00Var2) {
        return (g00Var == null || g00Var2 == null || g00Var == g00Var2) ? g00Var == null ? g00Var2 : g00Var : new defpackage.va1(g00Var, g00Var2, 1);
    }

    public static final defpackage.mc1 PAEGRtP0bX(defpackage.mc1 mc1Var, defpackage.kc1 kc1Var, defpackage.oa1 oa1Var) {
        defpackage.mc1 EgCjBq0SZwJ;
        if (oa1Var.xiZrDbcSW0()) {
            oa1Var.SyNS6RMn(kc1Var);
        }
        long AARZUJiTa2 = oa1Var.AARZUJiTa();
        defpackage.mc1 EgCjBq0SZwJ2 = EgCjBq0SZwJ(mc1Var, AARZUJiTa2, oa1Var.F7NU4MC0GW());
        if (EgCjBq0SZwJ2 == null) {
            kd6TUFXn();
            throw null;
        }
        if (EgCjBq0SZwJ2.IHQe1A4L2xu == oa1Var.AARZUJiTa()) {
            return EgCjBq0SZwJ2;
        }
        synchronized (r1MBDhnF) {
            EgCjBq0SZwJ = EgCjBq0SZwJ(kc1Var.IHQe1A4L2xu(), AARZUJiTa2, oa1Var.F7NU4MC0GW());
            if (EgCjBq0SZwJ == null) {
                kd6TUFXn();
                throw null;
            }
            if (EgCjBq0SZwJ.IHQe1A4L2xu != AARZUJiTa2) {
                defpackage.mc1 DFo87pBq1E5 = DFo87pBq1E5(EgCjBq0SZwJ, kc1Var);
                DFo87pBq1E5.IHQe1A4L2xu(EgCjBq0SZwJ);
                DFo87pBq1E5.IHQe1A4L2xu = oa1Var.AARZUJiTa();
                EgCjBq0SZwJ = DFo87pBq1E5;
            }
        }
        if (EgCjBq0SZwJ2.IHQe1A4L2xu != 1) {
            oa1Var.SyNS6RMn(kc1Var);
        }
        return EgCjBq0SZwJ;
    }

    public static final boolean QoRHpC4k(defpackage.kc1 kc1Var) {
        defpackage.mc1 mc1Var;
        long j = adDC3e2L;
        defpackage.nk0 nk0Var = xiZrDbcSW0;
        if (nk0Var.IHQe1A4L2xu > 0) {
            j = ((long[]) nk0Var.r1MBDhnF)[0];
        }
        defpackage.mc1 mc1Var2 = null;
        defpackage.mc1 mc1Var3 = null;
        int i = 0;
        for (defpackage.mc1 IHQe1A4L2xu2 = kc1Var.IHQe1A4L2xu(); IHQe1A4L2xu2 != null; IHQe1A4L2xu2 = IHQe1A4L2xu2.oh6vYeIP) {
            long j2 = IHQe1A4L2xu2.IHQe1A4L2xu;
            if (j2 != 0) {
                if (defpackage.x70.V7bD7b8KA(j2, j) >= 0) {
                    i++;
                } else if (mc1Var2 == null) {
                    i++;
                    mc1Var2 = IHQe1A4L2xu2;
                } else {
                    if (defpackage.x70.V7bD7b8KA(IHQe1A4L2xu2.IHQe1A4L2xu, mc1Var2.IHQe1A4L2xu) < 0) {
                        mc1Var = mc1Var2;
                        mc1Var2 = IHQe1A4L2xu2;
                    } else {
                        mc1Var = IHQe1A4L2xu2;
                    }
                    if (mc1Var3 == null) {
                        mc1Var3 = kc1Var.IHQe1A4L2xu();
                        defpackage.mc1 mc1Var4 = mc1Var3;
                        while (true) {
                            if (mc1Var3 == null) {
                                mc1Var3 = mc1Var4;
                                break;
                            }
                            if (defpackage.x70.V7bD7b8KA(mc1Var3.IHQe1A4L2xu, j) >= 0) {
                                break;
                            }
                            if (defpackage.x70.V7bD7b8KA(mc1Var4.IHQe1A4L2xu, mc1Var3.IHQe1A4L2xu) < 0) {
                                mc1Var4 = mc1Var3;
                            }
                            mc1Var3 = mc1Var3.oh6vYeIP;
                        }
                    }
                    mc1Var2.IHQe1A4L2xu = 0L;
                    mc1Var2.IHQe1A4L2xu(mc1Var3);
                    mc1Var2 = mc1Var;
                }
            }
        }
        return i > 1;
    }

    public static final defpackage.oa1 SH1y5HwkJhh() {
        defpackage.oa1 oa1Var = (defpackage.oa1) oh6vYeIP.adDC3e2L();
        return oa1Var == null ? SH1y5HwkJhh : oa1Var;
    }

    public static final void SyNS6RMn(defpackage.oa1 oa1Var, defpackage.kc1 kc1Var) {
        oa1Var.fnWB2E7cs(oa1Var.EXtogiMhuM() + 1);
        defpackage.g00 riuEU0zW42 = oa1Var.riuEU0zW4();
        if (riuEU0zW42 != null) {
            riuEU0zW42.AARZUJiTa(kc1Var);
        }
    }

    public static final java.lang.Object V7bD7b8KA(defpackage.l20 l20Var, defpackage.g00 g00Var) {
        long j = l20Var.oh6vYeIP;
        java.lang.Object AARZUJiTa2 = g00Var.AARZUJiTa(F7NU4MC0GW.oh6vYeIP(j));
        long j2 = adDC3e2L;
        adDC3e2L = 1 + j2;
        defpackage.ua1 oh6vYeIP2 = F7NU4MC0GW.oh6vYeIP(j);
        F7NU4MC0GW = oh6vYeIP2;
        l20Var.oh6vYeIP = j2;
        l20Var.IHQe1A4L2xu = oh6vYeIP2;
        l20Var.AARZUJiTa = 0;
        l20Var.EXtogiMhuM = null;
        l20Var.cnag84Bm();
        F7NU4MC0GW = F7NU4MC0GW.xiZrDbcSW0(j2);
        return AARZUJiTa2;
    }

    public static final java.lang.Object adDC3e2L(defpackage.g00 g00Var) {
        defpackage.ol0 ol0Var;
        java.lang.Object V7bD7b8KA;
        defpackage.l20 l20Var = SH1y5HwkJhh;
        synchronized (r1MBDhnF) {
            try {
                ol0Var = l20Var.EXtogiMhuM;
                if (ol0Var != null) {
                    ez2rX8ReCYw.addAndGet(1);
                }
                V7bD7b8KA = V7bD7b8KA(l20Var, g00Var);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (ol0Var != null) {
            try {
                java.util.List list = EXtogiMhuM;
                defpackage.b51 b51Var = new defpackage.b51(ol0Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.k00) list.get(i)).adDC3e2L(b51Var, l20Var);
                }
            } finally {
                ez2rX8ReCYw.addAndGet(-1);
            }
        }
        synchronized (r1MBDhnF) {
            xiZrDbcSW0();
            if (ol0Var != null) {
                java.lang.Object[] objArr = ol0Var.oh6vYeIP;
                long[] jArr = ol0Var.IHQe1A4L2xu;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    G3OKOH3wZRC((defpackage.kc1) objArr[(i2 << 3) + i4]);
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
        return V7bD7b8KA;
    }

    public static final defpackage.mc1 cnag84Bm(defpackage.mc1 mc1Var, defpackage.lc1 lc1Var, defpackage.oa1 oa1Var, defpackage.mc1 mc1Var2) {
        defpackage.mc1 DFo87pBq1E5;
        if (oa1Var.xiZrDbcSW0()) {
            oa1Var.SyNS6RMn(lc1Var);
        }
        long AARZUJiTa2 = oa1Var.AARZUJiTa();
        if (mc1Var2.IHQe1A4L2xu == AARZUJiTa2) {
            return mc1Var2;
        }
        synchronized (r1MBDhnF) {
            DFo87pBq1E5 = DFo87pBq1E5(mc1Var, lc1Var);
        }
        DFo87pBq1E5.IHQe1A4L2xu = AARZUJiTa2;
        if (mc1Var2.IHQe1A4L2xu != 1) {
            oa1Var.SyNS6RMn(lc1Var);
        }
        return DFo87pBq1E5;
    }

    public static final defpackage.g00 ez2rX8ReCYw(defpackage.g00 g00Var, defpackage.g00 g00Var2, boolean z) {
        if (!z) {
            g00Var2 = null;
        }
        return (g00Var == null || g00Var2 == null || g00Var == g00Var2) ? g00Var == null ? g00Var2 : g00Var : new defpackage.va1(g00Var, g00Var2, 0);
    }

    public static final defpackage.mc1 fnWB2E7cs(defpackage.mc1 mc1Var, defpackage.kc1 kc1Var) {
        defpackage.mc1 EgCjBq0SZwJ;
        defpackage.oa1 SH1y5HwkJhh2 = SH1y5HwkJhh();
        defpackage.g00 adDC3e2L2 = SH1y5HwkJhh2.adDC3e2L();
        if (adDC3e2L2 != null) {
            adDC3e2L2.AARZUJiTa(kc1Var);
        }
        defpackage.mc1 EgCjBq0SZwJ2 = EgCjBq0SZwJ(mc1Var, SH1y5HwkJhh2.AARZUJiTa(), SH1y5HwkJhh2.F7NU4MC0GW());
        if (EgCjBq0SZwJ2 != null) {
            return EgCjBq0SZwJ2;
        }
        synchronized (r1MBDhnF) {
            defpackage.oa1 SH1y5HwkJhh3 = SH1y5HwkJhh();
            defpackage.mc1 IHQe1A4L2xu2 = kc1Var.IHQe1A4L2xu();
            IHQe1A4L2xu2.getClass();
            EgCjBq0SZwJ = EgCjBq0SZwJ(IHQe1A4L2xu2, SH1y5HwkJhh3.AARZUJiTa(), SH1y5HwkJhh3.F7NU4MC0GW());
            if (EgCjBq0SZwJ == null) {
                kd6TUFXn();
                throw null;
            }
        }
        return EgCjBq0SZwJ;
    }

    public static final void kNAkVymC(int i) {
        defpackage.nk0 nk0Var = xiZrDbcSW0;
        int i2 = ((int[]) nk0Var.adDC3e2L)[i];
        nk0Var.r1MBDhnF(i2, nk0Var.IHQe1A4L2xu - 1);
        nk0Var.IHQe1A4L2xu--;
        long[] jArr = (long[]) nk0Var.r1MBDhnF;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (defpackage.x70.V7bD7b8KA(jArr[i4], j) <= 0) {
                break;
            }
            nk0Var.r1MBDhnF(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) nk0Var.r1MBDhnF;
        int i5 = nk0Var.IHQe1A4L2xu >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < nk0Var.IHQe1A4L2xu && defpackage.x70.V7bD7b8KA(jArr2[i6], jArr2[i7]) < 0) {
                if (defpackage.x70.V7bD7b8KA(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                nk0Var.r1MBDhnF(i6, i2);
                i2 = i6;
            } else {
                if (defpackage.x70.V7bD7b8KA(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                nk0Var.r1MBDhnF(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) nk0Var.adDC3e2L)[i] = nk0Var.oh6vYeIP;
        nk0Var.oh6vYeIP = i;
    }

    public static final void kd6TUFXn() {
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final java.util.HashMap oh6vYeIP(long j, defpackage.rl0 rl0Var, defpackage.ua1 ua1Var) {
        long[] jArr;
        defpackage.ua1 ua1Var2;
        long[] jArr2;
        defpackage.ua1 ua1Var3;
        int i;
        int i2;
        defpackage.mc1 EgCjBq0SZwJ;
        defpackage.ol0 abhbClRa = rl0Var.abhbClRa();
        if (abhbClRa != null) {
            long AARZUJiTa2 = rl0Var.AARZUJiTa();
            defpackage.ua1 adDC3e2L2 = rl0Var.F7NU4MC0GW().xiZrDbcSW0(AARZUJiTa2).adDC3e2L(rl0Var.SH1y5HwkJhh);
            java.lang.Object[] objArr = abhbClRa.oh6vYeIP;
            long[] jArr3 = abhbClRa.IHQe1A4L2xu;
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
                                defpackage.kc1 kc1Var = (defpackage.kc1) objArr[(i3 << 3) + i6];
                                defpackage.mc1 IHQe1A4L2xu2 = kc1Var.IHQe1A4L2xu();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                defpackage.mc1 EgCjBq0SZwJ2 = EgCjBq0SZwJ(IHQe1A4L2xu2, j, ua1Var);
                                if (EgCjBq0SZwJ2 == null || (EgCjBq0SZwJ = EgCjBq0SZwJ(IHQe1A4L2xu2, AARZUJiTa2, adDC3e2L2)) == null || EgCjBq0SZwJ2.equals(EgCjBq0SZwJ)) {
                                    ua1Var3 = adDC3e2L2;
                                } else {
                                    ua1Var3 = adDC3e2L2;
                                    defpackage.mc1 EgCjBq0SZwJ3 = EgCjBq0SZwJ(IHQe1A4L2xu2, AARZUJiTa2, rl0Var.F7NU4MC0GW());
                                    if (EgCjBq0SZwJ3 == null) {
                                        kd6TUFXn();
                                        throw null;
                                    }
                                    defpackage.mc1 oh6vYeIP2 = kc1Var.oh6vYeIP(EgCjBq0SZwJ, EgCjBq0SZwJ2, EgCjBq0SZwJ3);
                                    if (oh6vYeIP2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new java.util.HashMap();
                                    }
                                    hashMap.put(EgCjBq0SZwJ2, oh6vYeIP2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                ua1Var3 = adDC3e2L2;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            adDC3e2L2 = ua1Var3;
                        }
                        jArr = jArr3;
                        ua1Var2 = adDC3e2L2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        ua1Var2 = adDC3e2L2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    adDC3e2L2 = ua1Var2;
                }
            }
        }
        return null;
    }

    public static final void r1MBDhnF(defpackage.oa1 oa1Var) {
        long j;
        if (F7NU4MC0GW.r1MBDhnF(oa1Var.AARZUJiTa())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(oa1Var.AARZUJiTa());
        sb.append(", disposed=");
        sb.append(oa1Var.r1MBDhnF);
        sb.append(", applied=");
        defpackage.rl0 rl0Var = oa1Var instanceof defpackage.rl0 ? (defpackage.rl0) oa1Var : null;
        sb.append(rl0Var != null ? java.lang.Boolean.valueOf(rl0Var.DFo87pBq1E5) : "read-only");
        sb.append(", lowestPin=");
        synchronized (r1MBDhnF) {
            defpackage.nk0 nk0Var = xiZrDbcSW0;
            j = nk0Var.IHQe1A4L2xu > 0 ? ((long[]) nk0Var.r1MBDhnF)[0] : -1L;
        }
        sb.append(j);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final defpackage.mc1 riuEU0zW4(defpackage.mc1 mc1Var, defpackage.oa1 oa1Var) {
        defpackage.mc1 EgCjBq0SZwJ;
        defpackage.mc1 EgCjBq0SZwJ2 = EgCjBq0SZwJ(mc1Var, oa1Var.AARZUJiTa(), oa1Var.F7NU4MC0GW());
        if (EgCjBq0SZwJ2 != null) {
            return EgCjBq0SZwJ2;
        }
        synchronized (r1MBDhnF) {
            EgCjBq0SZwJ = EgCjBq0SZwJ(mc1Var, oa1Var.AARZUJiTa(), oa1Var.F7NU4MC0GW());
        }
        if (EgCjBq0SZwJ != null) {
            return EgCjBq0SZwJ;
        }
        kd6TUFXn();
        throw null;
    }

    public static final void xiZrDbcSW0() {
        defpackage.p2 p2Var = AARZUJiTa;
        int i = p2Var.IHQe1A4L2xu;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            defpackage.jn1 jn1Var = ((defpackage.jn1[]) p2Var.r1MBDhnF)[i2];
            java.lang.Object obj = jn1Var != null ? jn1Var.get() : null;
            if (obj != null && QoRHpC4k((defpackage.kc1) obj)) {
                if (i3 != i2) {
                    ((defpackage.jn1[]) p2Var.r1MBDhnF)[i3] = jn1Var;
                    int[] iArr = (int[]) p2Var.oh6vYeIP;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((defpackage.jn1[]) p2Var.r1MBDhnF)[i4] = null;
            ((int[]) p2Var.oh6vYeIP)[i4] = 0;
        }
        if (i3 != i) {
            p2Var.IHQe1A4L2xu = i3;
        }
    }
}
