package defpackage;

/* loaded from: classes.dex */
public final class i61 {
    public final defpackage.a61 AARZUJiTa;
    public final defpackage.w51 EXtogiMhuM;
    public defpackage.ks0 F7NU4MC0GW;
    public defpackage.b61 IHQe1A4L2xu;
    public boolean adDC3e2L;
    public defpackage.e2 oh6vYeIP;
    public defpackage.qm r1MBDhnF;
    public boolean riuEU0zW4;
    public defpackage.y xiZrDbcSW0;
    public int SH1y5HwkJhh = 1;
    public defpackage.l51 ez2rX8ReCYw = defpackage.u51.oh6vYeIP;
    public final defpackage.g61 JlrlGoKF = new defpackage.g61(this);
    public final defpackage.DFo87pBq1E5 DFo87pBq1E5 = new defpackage.DFo87pBq1E5(25, this);

    public i61(defpackage.b61 b61Var, defpackage.e2 e2Var, defpackage.qm qmVar, defpackage.ks0 ks0Var, boolean z, defpackage.y yVar, defpackage.a61 a61Var, defpackage.w51 w51Var) {
        this.IHQe1A4L2xu = b61Var;
        this.oh6vYeIP = e2Var;
        this.r1MBDhnF = qmVar;
        this.F7NU4MC0GW = ks0Var;
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = yVar;
        this.AARZUJiTa = a61Var;
        this.EXtogiMhuM = w51Var;
    }

    public final float AARZUJiTa(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.F7NU4MC0GW == defpackage.ks0.xiZrDbcSW0 ? j >> 32 : j & 4294967295L));
    }

    public final long EXtogiMhuM(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.F7NU4MC0GW == defpackage.ks0.xiZrDbcSW0) {
            return (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (java.lang.Float.floatToRawIntBits(f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float F7NU4MC0GW(float f) {
        return this.adDC3e2L ? f * (-1.0f) : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(long j, defpackage.fj fjVar) {
        defpackage.d61 d61Var;
        int i;
        defpackage.i61 i61Var;
        java.lang.Throwable th;
        defpackage.qz0 qz0Var;
        if (fjVar instanceof defpackage.d61) {
            d61Var = (defpackage.d61) fjVar;
            int i2 = d61Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d61Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = d61Var.riuEU0zW4;
                i = d61Var.ez2rX8ReCYw;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.qz0 qz0Var2 = new defpackage.qz0();
                    qz0Var2.adDC3e2L = j;
                    this.riuEU0zW4 = true;
                    try {
                        defpackage.am0 am0Var = defpackage.am0.adDC3e2L;
                        i61Var = this;
                        try {
                            defpackage.f61 f61Var = new defpackage.f61(i61Var, qz0Var2, j, null);
                            d61Var.EXtogiMhuM = qz0Var2;
                            d61Var.ez2rX8ReCYw = 1;
                            java.lang.Object xiZrDbcSW0 = i61Var.xiZrDbcSW0(am0Var, f61Var, d61Var);
                            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                            if (xiZrDbcSW0 == vjVar) {
                                return vjVar;
                            }
                            qz0Var = qz0Var2;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            th = th;
                            i61Var.riuEU0zW4 = false;
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        i61Var = this;
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qz0Var = d61Var.EXtogiMhuM;
                    try {
                        defpackage.f70.nBH8hAHy(obj);
                        i61Var = this;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        i61Var = this;
                        i61Var.riuEU0zW4 = false;
                        throw th;
                    }
                }
                i61Var.riuEU0zW4 = false;
                return new defpackage.rl1(qz0Var.adDC3e2L);
            }
        }
        d61Var = new defpackage.d61(this, fjVar);
        java.lang.Object obj2 = d61Var.riuEU0zW4;
        i = d61Var.ez2rX8ReCYw;
        if (i != 0) {
        }
        i61Var.riuEU0zW4 = false;
        return new defpackage.rl1(qz0Var.adDC3e2L);
    }

    public final long adDC3e2L(long j) {
        return this.adDC3e2L ? defpackage.gq0.xiZrDbcSW0(j, -1.0f) : j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof defpackage.qm) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object oh6vYeIP(long j, boolean z, defpackage.ce1 ce1Var) {
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        if (z) {
            defpackage.qm qmVar = this.r1MBDhnF;
            defpackage.r41 r41Var = defpackage.u51.IHQe1A4L2xu;
        }
        long IHQe1A4L2xu = defpackage.rl1.IHQe1A4L2xu(j, 0.0f, 0.0f, this.F7NU4MC0GW == defpackage.ks0.xiZrDbcSW0 ? 1 : 2);
        defpackage.h61 h61Var = new defpackage.h61(this, null);
        defpackage.e2 e2Var = this.oh6vYeIP;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (e2Var == null || !(this.IHQe1A4L2xu.r1MBDhnF() || this.IHQe1A4L2xu.IHQe1A4L2xu())) {
            defpackage.h61 h61Var2 = new defpackage.h61(this, ce1Var);
            h61Var2.ez2rX8ReCYw = IHQe1A4L2xu;
            java.lang.Object SyNS6RMn = h61Var2.SyNS6RMn(ok1Var);
            if (SyNS6RMn == vjVar) {
                return SyNS6RMn;
            }
        } else {
            java.lang.Object oh6vYeIP = e2Var.oh6vYeIP(IHQe1A4L2xu, h61Var, ce1Var);
            if (oh6vYeIP == vjVar) {
                return oh6vYeIP;
            }
        }
        return ok1Var;
    }

    public final long r1MBDhnF(defpackage.l51 l51Var, long j, int i) {
        int i2;
        defpackage.xo0 xo0Var;
        defpackage.xo0 xo0Var2;
        long j2;
        long j3;
        defpackage.ui1 ui1Var;
        defpackage.ep0 ep0Var;
        defpackage.ui1 ui1Var2;
        defpackage.ep0 ep0Var2;
        defpackage.xo0 xo0Var3 = (defpackage.xo0) this.xiZrDbcSW0.adDC3e2L;
        int i3 = 262144;
        defpackage.xl0 xl0Var = null;
        if (xo0Var3 == null || !xo0Var3.kd6TUFXn) {
            i2 = 262144;
            xo0Var = null;
        } else {
            if (!xo0Var3.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var = xo0Var3.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(xo0Var3);
            loop0: while (true) {
                if (D2vUnMij == null) {
                    i2 = i3;
                    ui1Var2 = null;
                    break;
                }
                if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & i3) != 0) {
                    while (lj0Var != null) {
                        if ((lj0Var.AARZUJiTa & i3) != 0) {
                            defpackage.xl0 xl0Var2 = null;
                            defpackage.lj0 lj0Var2 = lj0Var;
                            while (lj0Var2 != null) {
                                if (lj0Var2 instanceof defpackage.ui1) {
                                    ui1Var2 = (defpackage.ui1) lj0Var2;
                                    i2 = i3;
                                    if (defpackage.x70.QoRHpC4k(xo0Var3.JlrlGoKF(), ui1Var2.JlrlGoKF()) && defpackage.xo0.class == ui1Var2.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i3;
                                }
                                if ((lj0Var2.AARZUJiTa & i2) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                    int i4 = 0;
                                    for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                        if ((lj0Var3.AARZUJiTa & i2) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                lj0Var2 = lj0Var3;
                                            } else {
                                                if (xl0Var2 == null) {
                                                    xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var2 != null) {
                                                    xl0Var2.oh6vYeIP(lj0Var2);
                                                    lj0Var2 = null;
                                                }
                                                xl0Var2.oh6vYeIP(lj0Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                        i3 = i2;
                                    }
                                }
                                lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var2);
                                i3 = i2;
                            }
                        }
                        lj0Var = lj0Var.riuEU0zW4;
                        i3 = i3;
                    }
                }
                int i5 = i3;
                D2vUnMij = D2vUnMij.V7bD7b8KA();
                lj0Var = (D2vUnMij == null || (ep0Var2 = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var2.adDC3e2L;
                i3 = i5;
            }
            xo0Var = (defpackage.xo0) ui1Var2;
        }
        long uLnPvzwk = xo0Var != null ? xo0Var.uLnPvzwk(i, j) : 0L;
        long F7NU4MC0GW = defpackage.gq0.F7NU4MC0GW(j, uLnPvzwk);
        long adDC3e2L = adDC3e2L(EXtogiMhuM(l51Var.IHQe1A4L2xu(AARZUJiTa(adDC3e2L(this.F7NU4MC0GW == defpackage.ks0.xiZrDbcSW0 ? defpackage.gq0.IHQe1A4L2xu(1, F7NU4MC0GW) : defpackage.gq0.IHQe1A4L2xu(2, F7NU4MC0GW))))));
        defpackage.a61 a61Var = this.AARZUJiTa;
        if (a61Var.kd6TUFXn) {
            android.view.ViewTreeObserver viewTreeObserver = ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(a61Var)).getViewTreeObserver();
            try {
                if (defpackage.v0.rzSERzFHIn == null) {
                    java.lang.reflect.Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    defpackage.v0.rzSERzFHIn = declaredMethod;
                }
                java.lang.reflect.Method method = defpackage.v0.rzSERzFHIn;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        long F7NU4MC0GW2 = defpackage.gq0.F7NU4MC0GW(F7NU4MC0GW, adDC3e2L);
        defpackage.xo0 xo0Var4 = (defpackage.xo0) this.xiZrDbcSW0.adDC3e2L;
        if (xo0Var4 == null || !xo0Var4.kd6TUFXn) {
            xo0Var2 = null;
        } else {
            if (!xo0Var4.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var4 = xo0Var4.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij2 = defpackage.w70.D2vUnMij(xo0Var4);
            loop3: while (true) {
                if (D2vUnMij2 == null) {
                    ui1Var = null;
                    break;
                }
                if ((D2vUnMij2.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & i2) != 0) {
                    while (lj0Var4 != null) {
                        if ((lj0Var4.AARZUJiTa & i2) != 0) {
                            defpackage.lj0 lj0Var5 = lj0Var4;
                            defpackage.xl0 xl0Var3 = xl0Var;
                            while (lj0Var5 != null) {
                                if (lj0Var5 instanceof defpackage.ui1) {
                                    defpackage.ui1 ui1Var3 = (defpackage.ui1) lj0Var5;
                                    if (defpackage.x70.QoRHpC4k(xo0Var4.JlrlGoKF(), ui1Var3.JlrlGoKF()) && defpackage.xo0.class == ui1Var3.getClass()) {
                                        ui1Var = ui1Var3;
                                        break loop3;
                                    }
                                }
                                if ((lj0Var5.AARZUJiTa & i2) != 0 && (lj0Var5 instanceof defpackage.ln)) {
                                    int i6 = 0;
                                    for (defpackage.lj0 lj0Var6 = ((defpackage.ln) lj0Var5).fnWB2E7cs; lj0Var6 != null; lj0Var6 = lj0Var6.SH1y5HwkJhh) {
                                        if ((lj0Var6.AARZUJiTa & i2) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                lj0Var5 = lj0Var6;
                                            } else {
                                                if (xl0Var3 == null) {
                                                    xl0Var3 = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var5 != null) {
                                                    xl0Var3.oh6vYeIP(lj0Var5);
                                                    lj0Var5 = null;
                                                }
                                                xl0Var3.oh6vYeIP(lj0Var6);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                lj0Var5 = defpackage.w70.riuEU0zW4(xl0Var3);
                            }
                        }
                        lj0Var4 = lj0Var4.riuEU0zW4;
                        xl0Var = null;
                    }
                }
                D2vUnMij2 = D2vUnMij2.V7bD7b8KA();
                lj0Var4 = (D2vUnMij2 == null || (ep0Var = D2vUnMij2.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                xl0Var = null;
            }
            xo0Var2 = (defpackage.xo0) ui1Var;
        }
        if (xo0Var2 != null) {
            j3 = xo0Var2.pm90rNzI5F(i, adDC3e2L, F7NU4MC0GW2);
            j2 = adDC3e2L;
        } else {
            j2 = adDC3e2L;
            j3 = 0;
        }
        return defpackage.gq0.adDC3e2L(defpackage.gq0.adDC3e2L(uLnPvzwk, j2), j3);
    }

    public final float riuEU0zW4(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat(i)), java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2)));
        defpackage.ks0 ks0Var = this.F7NU4MC0GW;
        if (atan2 >= 0.7853981633974483d) {
            if (ks0Var == defpackage.ks0.adDC3e2L) {
                return java.lang.Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (ks0Var == defpackage.ks0.xiZrDbcSW0) {
            return java.lang.Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    public final java.lang.Object xiZrDbcSW0(defpackage.am0 am0Var, defpackage.k00 k00Var, defpackage.fj fjVar) {
        java.lang.Object F7NU4MC0GW = this.IHQe1A4L2xu.F7NU4MC0GW(am0Var, new defpackage.AARZUJiTa(this, k00Var, null, 16), fjVar);
        return F7NU4MC0GW == defpackage.vj.adDC3e2L ? F7NU4MC0GW : defpackage.ok1.IHQe1A4L2xu;
    }
}
