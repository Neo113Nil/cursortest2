package defpackage;

/* loaded from: classes.dex */
public final class y implements defpackage.b7, defpackage.ql1 {
    public java.lang.Object AARZUJiTa;
    public java.lang.Object EXtogiMhuM;
    public java.lang.Object adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public y(android.graphics.Typeface typeface, defpackage.dj0 dj0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.EXtogiMhuM = typeface;
        this.adDC3e2L = dj0Var;
        this.AARZUJiTa = new defpackage.ej0(1024);
        int IHQe1A4L2xu = dj0Var.IHQe1A4L2xu(6);
        if (IHQe1A4L2xu != 0) {
            int i5 = IHQe1A4L2xu + dj0Var.adDC3e2L;
            i = ((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getInt(((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.xiZrDbcSW0 = new char[i * 2];
        int IHQe1A4L2xu2 = dj0Var.IHQe1A4L2xu(6);
        if (IHQe1A4L2xu2 != 0) {
            int i6 = IHQe1A4L2xu2 + dj0Var.adDC3e2L;
            i2 = ((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getInt(((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            defpackage.wj1 wj1Var = new defpackage.wj1(this, i7);
            defpackage.cj0 oh6vYeIP = wj1Var.oh6vYeIP();
            int IHQe1A4L2xu3 = oh6vYeIP.IHQe1A4L2xu(4);
            java.lang.Character.toChars(IHQe1A4L2xu3 != 0 ? ((java.nio.ByteBuffer) oh6vYeIP.EXtogiMhuM).getInt(IHQe1A4L2xu3 + oh6vYeIP.adDC3e2L) : 0, (char[]) this.xiZrDbcSW0, i7 * 2);
            defpackage.cj0 oh6vYeIP2 = wj1Var.oh6vYeIP();
            int IHQe1A4L2xu4 = oh6vYeIP2.IHQe1A4L2xu(16);
            if (IHQe1A4L2xu4 != 0) {
                int i8 = IHQe1A4L2xu4 + oh6vYeIP2.adDC3e2L;
                i3 = ((java.nio.ByteBuffer) oh6vYeIP2.EXtogiMhuM).getInt(((java.nio.ByteBuffer) oh6vYeIP2.EXtogiMhuM).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                defpackage.db.fnWB2E7cs("invalid metadata codepoint length");
                throw null;
            }
            defpackage.ej0 ej0Var = (defpackage.ej0) this.AARZUJiTa;
            defpackage.cj0 oh6vYeIP3 = wj1Var.oh6vYeIP();
            int IHQe1A4L2xu5 = oh6vYeIP3.IHQe1A4L2xu(16);
            if (IHQe1A4L2xu5 != 0) {
                int i9 = IHQe1A4L2xu5 + oh6vYeIP3.adDC3e2L;
                i4 = ((java.nio.ByteBuffer) oh6vYeIP3.EXtogiMhuM).getInt(((java.nio.ByteBuffer) oh6vYeIP3.EXtogiMhuM).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ej0Var.IHQe1A4L2xu(wj1Var, 0, i4 - 1);
        }
    }

    public static void r1MBDhnF(defpackage.y yVar, defpackage.ho0 ho0Var) {
        yVar.getClass();
        ho0Var.getClass();
        if (((java.util.LinkedHashSet) yVar.AARZUJiTa).add(ho0Var)) {
            defpackage.ko0 ko0Var = (defpackage.ko0) yVar.xiZrDbcSW0;
            ko0Var.getClass();
            if (ho0Var.r1MBDhnF != null) {
                defpackage.db.QoRHpC4k("Handler '", ho0Var, "' is already registered with a dispatcher");
                return;
            }
            ko0Var.adDC3e2L.addFirst(ho0Var);
            ho0Var.r1MBDhnF = yVar;
            ko0Var.oh6vYeIP();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AARZUJiTa(long j, long j2, defpackage.fj fjVar) {
        defpackage.to0 to0Var;
        int i;
        int i2;
        defpackage.xo0 xo0Var;
        long j3;
        defpackage.xo0 xo0Var2;
        defpackage.ui1 ui1Var;
        defpackage.ep0 ep0Var;
        defpackage.ui1 ui1Var2;
        defpackage.ep0 ep0Var2;
        if (fjVar instanceof defpackage.to0) {
            to0Var = (defpackage.to0) fjVar;
            int i3 = to0Var.SH1y5HwkJhh;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                to0Var.SH1y5HwkJhh = i3 - Integer.MIN_VALUE;
                defpackage.to0 to0Var2 = to0Var;
                java.lang.Object obj = to0Var2.EXtogiMhuM;
                i = to0Var2.SH1y5HwkJhh;
                defpackage.xl0 xl0Var = null;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.xo0 xo0Var3 = (defpackage.xo0) this.adDC3e2L;
                    int i4 = 262144;
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
                                i2 = i4;
                                ui1Var2 = null;
                                break;
                            }
                            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & i4) != 0) {
                                while (lj0Var != null) {
                                    if ((lj0Var.AARZUJiTa & i4) != 0) {
                                        defpackage.xl0 xl0Var2 = xl0Var;
                                        defpackage.lj0 lj0Var2 = lj0Var;
                                        while (lj0Var2 != null) {
                                            if (lj0Var2 instanceof defpackage.ui1) {
                                                ui1Var2 = (defpackage.ui1) lj0Var2;
                                                i2 = i4;
                                                if (defpackage.x70.QoRHpC4k(xo0Var3.JlrlGoKF(), ui1Var2.JlrlGoKF()) && defpackage.xo0.class == ui1Var2.getClass()) {
                                                    break loop0;
                                                }
                                            } else {
                                                i2 = i4;
                                            }
                                            if ((lj0Var2.AARZUJiTa & i2) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                                int i5 = 0;
                                                for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                                    if ((lj0Var3.AARZUJiTa & i2) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
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
                                                if (i5 == 1) {
                                                    i4 = i2;
                                                }
                                            }
                                            lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var2);
                                            i4 = i2;
                                        }
                                    }
                                    lj0Var = lj0Var.riuEU0zW4;
                                    i4 = i4;
                                    xl0Var = null;
                                }
                            }
                            int i6 = i4;
                            D2vUnMij = D2vUnMij.V7bD7b8KA();
                            lj0Var = (D2vUnMij == null || (ep0Var2 = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var2.adDC3e2L;
                            i4 = i6;
                            xl0Var = null;
                        }
                        xo0Var = (defpackage.xo0) ui1Var2;
                    }
                    j3 = 0;
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (xo0Var == null) {
                        defpackage.xo0 xo0Var4 = (defpackage.xo0) this.xiZrDbcSW0;
                        if (xo0Var4 != null) {
                            to0Var2.SH1y5HwkJhh = 1;
                            java.lang.Object H6IrRhrpWoH = xo0Var4.H6IrRhrpWoH(j, j2, to0Var2);
                            if (H6IrRhrpWoH != vjVar) {
                                obj = H6IrRhrpWoH;
                                j3 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                            }
                            return vjVar;
                        }
                    } else {
                        defpackage.xo0 xo0Var5 = (defpackage.xo0) this.adDC3e2L;
                        if (xo0Var5 == null || !xo0Var5.kd6TUFXn) {
                            xo0Var2 = null;
                        } else {
                            if (!xo0Var5.adDC3e2L.kd6TUFXn) {
                                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                            }
                            defpackage.lj0 lj0Var4 = xo0Var5.adDC3e2L.riuEU0zW4;
                            defpackage.ma0 D2vUnMij2 = defpackage.w70.D2vUnMij(xo0Var5);
                            loop3: while (true) {
                                if (D2vUnMij2 == null) {
                                    ui1Var = null;
                                    break;
                                }
                                if ((D2vUnMij2.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & i2) != 0) {
                                    while (lj0Var4 != null) {
                                        if ((lj0Var4.AARZUJiTa & i2) != 0) {
                                            defpackage.lj0 lj0Var5 = lj0Var4;
                                            defpackage.xl0 xl0Var3 = null;
                                            while (lj0Var5 != null) {
                                                if (lj0Var5 instanceof defpackage.ui1) {
                                                    defpackage.ui1 ui1Var3 = (defpackage.ui1) lj0Var5;
                                                    if (defpackage.x70.QoRHpC4k(xo0Var5.JlrlGoKF(), ui1Var3.JlrlGoKF()) && defpackage.xo0.class == ui1Var3.getClass()) {
                                                        ui1Var = ui1Var3;
                                                        break loop3;
                                                    }
                                                }
                                                if ((lj0Var5.AARZUJiTa & i2) != 0 && (lj0Var5 instanceof defpackage.ln)) {
                                                    int i7 = 0;
                                                    for (defpackage.lj0 lj0Var6 = ((defpackage.ln) lj0Var5).fnWB2E7cs; lj0Var6 != null; lj0Var6 = lj0Var6.SH1y5HwkJhh) {
                                                        if ((lj0Var6.AARZUJiTa & i2) != 0) {
                                                            i7++;
                                                            if (i7 == 1) {
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
                                                    if (i7 == 1) {
                                                    }
                                                }
                                                lj0Var5 = defpackage.w70.riuEU0zW4(xl0Var3);
                                            }
                                        }
                                        lj0Var4 = lj0Var4.riuEU0zW4;
                                    }
                                }
                                D2vUnMij2 = D2vUnMij2.V7bD7b8KA();
                                lj0Var4 = (D2vUnMij2 == null || (ep0Var = D2vUnMij2.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                            }
                            xo0Var2 = (defpackage.xo0) ui1Var;
                        }
                        if (xo0Var2 != null) {
                            to0Var2.SH1y5HwkJhh = 2;
                            java.lang.Object H6IrRhrpWoH2 = xo0Var2.H6IrRhrpWoH(j, j2, to0Var2);
                            if (H6IrRhrpWoH2 != vjVar) {
                                obj = H6IrRhrpWoH2;
                                j3 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                            }
                            return vjVar;
                        }
                    }
                } else if (i == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    j3 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                } else {
                    if (i != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                    j3 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                }
                return new defpackage.rl1(j3);
            }
        }
        to0Var = new defpackage.to0(this, fjVar);
        defpackage.to0 to0Var22 = to0Var;
        java.lang.Object obj2 = to0Var22.EXtogiMhuM;
        i = to0Var22.SH1y5HwkJhh;
        defpackage.xl0 xl0Var4 = null;
        if (i != 0) {
        }
        return new defpackage.rl1(j3);
    }

    public defpackage.vm1 DFo87pBq1E5(defpackage.xc xcVar, java.lang.String str) {
        defpackage.vm1 vm1Var;
        defpackage.vm1 IHQe1A4L2xu;
        synchronized (((defpackage.c41) this.EXtogiMhuM)) {
            try {
                vm1Var = (defpackage.vm1) ((defpackage.bn1) this.adDC3e2L).IHQe1A4L2xu.get(str);
                if (xcVar.F7NU4MC0GW(vm1Var)) {
                    defpackage.zm1 zm1Var = (defpackage.zm1) this.xiZrDbcSW0;
                    if (zm1Var instanceof defpackage.j41) {
                        defpackage.j41 j41Var = (defpackage.j41) zm1Var;
                        vm1Var.getClass();
                        defpackage.xd0 xd0Var = j41Var.F7NU4MC0GW;
                        if (xd0Var != null) {
                            defpackage.F7NU4MC0GW f7nu4mc0gw = j41Var.adDC3e2L;
                            f7nu4mc0gw.getClass();
                            defpackage.s70.AARZUJiTa(vm1Var, f7nu4mc0gw, xd0Var);
                        }
                    }
                    vm1Var.getClass();
                } else {
                    defpackage.uk0 uk0Var = new defpackage.uk0((defpackage.fk) this.AARZUJiTa);
                    uk0Var.IHQe1A4L2xu.put(defpackage.fm.EoOhNTTfIN7K, str);
                    defpackage.zm1 zm1Var2 = (defpackage.zm1) this.xiZrDbcSW0;
                    try {
                        try {
                            IHQe1A4L2xu = zm1Var2.r1MBDhnF(xcVar, uk0Var);
                        } catch (java.lang.AbstractMethodError unused) {
                            IHQe1A4L2xu = zm1Var2.IHQe1A4L2xu(defpackage.a70.QoRHpC4k(xcVar));
                        }
                    } catch (java.lang.AbstractMethodError unused2) {
                        IHQe1A4L2xu = zm1Var2.oh6vYeIP(defpackage.a70.QoRHpC4k(xcVar), uk0Var);
                    }
                    vm1Var = IHQe1A4L2xu;
                    defpackage.bn1 bn1Var = (defpackage.bn1) this.adDC3e2L;
                    bn1Var.getClass();
                    vm1Var.getClass();
                    defpackage.vm1 vm1Var2 = (defpackage.vm1) bn1Var.IHQe1A4L2xu.put(str, vm1Var);
                    if (vm1Var2 != null) {
                        vm1Var2.oh6vYeIP();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return vm1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EXtogiMhuM(long j, defpackage.fj fjVar) {
        defpackage.uo0 uo0Var;
        int i;
        long j2;
        defpackage.ep0 ep0Var;
        if (fjVar instanceof defpackage.uo0) {
            uo0Var = (defpackage.uo0) fjVar;
            int i2 = uo0Var.SH1y5HwkJhh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uo0Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = uo0Var.EXtogiMhuM;
                i = uo0Var.SH1y5HwkJhh;
                defpackage.xo0 xo0Var = null;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.xo0 xo0Var2 = (defpackage.xo0) this.adDC3e2L;
                    if (xo0Var2 != null && xo0Var2.kd6TUFXn) {
                        if (!xo0Var2.adDC3e2L.kd6TUFXn) {
                            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                        }
                        defpackage.lj0 lj0Var = xo0Var2.adDC3e2L.riuEU0zW4;
                        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(xo0Var2);
                        loop0: while (true) {
                            if (D2vUnMij == null) {
                                break;
                            }
                            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                                while (lj0Var != null) {
                                    if ((lj0Var.AARZUJiTa & 262144) != 0) {
                                        defpackage.lj0 lj0Var2 = lj0Var;
                                        defpackage.xl0 xl0Var = null;
                                        while (lj0Var2 != null) {
                                            if (lj0Var2 instanceof defpackage.ui1) {
                                                defpackage.ui1 ui1Var = (defpackage.ui1) lj0Var2;
                                                if (defpackage.x70.QoRHpC4k(xo0Var2.JlrlGoKF(), ui1Var.JlrlGoKF()) && defpackage.xo0.class == ui1Var.getClass()) {
                                                    xo0Var = ui1Var;
                                                    break loop0;
                                                }
                                            }
                                            if ((lj0Var2.AARZUJiTa & 262144) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                                int i3 = 0;
                                                for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                                    if ((lj0Var3.AARZUJiTa & 262144) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            lj0Var2 = lj0Var3;
                                                        } else {
                                                            if (xl0Var == null) {
                                                                xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                                            }
                                                            if (lj0Var2 != null) {
                                                                xl0Var.oh6vYeIP(lj0Var2);
                                                                lj0Var2 = null;
                                                            }
                                                            xl0Var.oh6vYeIP(lj0Var3);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var);
                                        }
                                    }
                                    lj0Var = lj0Var.riuEU0zW4;
                                }
                            }
                            D2vUnMij = D2vUnMij.V7bD7b8KA();
                            lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                        }
                        xo0Var = xo0Var;
                    }
                    if (xo0Var == null) {
                        j2 = 0;
                        return new defpackage.rl1(j2);
                    }
                    uo0Var.SH1y5HwkJhh = 1;
                    obj = xo0Var.WnQbjbWuMR(j, uo0Var);
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                j2 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                return new defpackage.rl1(j2);
            }
        }
        uo0Var = new defpackage.uo0(this, fjVar);
        java.lang.Object obj2 = uo0Var.EXtogiMhuM;
        i = uo0Var.SH1y5HwkJhh;
        defpackage.xo0 xo0Var3 = null;
        if (i != 0) {
        }
        j2 = ((defpackage.rl1) obj2).IHQe1A4L2xu;
        return new defpackage.rl1(j2);
    }

    public void F7NU4MC0GW(defpackage.jo0 jo0Var) {
        if (((java.util.LinkedHashSet) this.EXtogiMhuM).add(jo0Var)) {
            ((defpackage.ko0) this.xiZrDbcSW0).IHQe1A4L2xu(this, jo0Var, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r9.F7NU4MC0GW(r0) == r6) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:25:0x0064, B:29:0x0074), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v8, types: [im0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object G3OKOH3wZRC(defpackage.fj fjVar) {
        defpackage.h31 h31Var;
        int i;
        defpackage.km0 km0Var;
        java.lang.Throwable th;
        defpackage.im0 im0Var;
        defpackage.y yVar;
        try {
            if (fjVar instanceof defpackage.h31) {
                h31Var = (defpackage.h31) fjVar;
                int i2 = h31Var.JlrlGoKF;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    h31Var.JlrlGoKF = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = h31Var.SH1y5HwkJhh;
                    i = h31Var.JlrlGoKF;
                    defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        if (!(((defpackage.ye) this.xiZrDbcSW0).hkbnNdmy() instanceof defpackage.x40)) {
                            return ok1Var;
                        }
                        km0Var = (defpackage.km0) this.adDC3e2L;
                        h31Var.EXtogiMhuM = this;
                        h31Var.riuEU0zW4 = km0Var;
                        h31Var.JlrlGoKF = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            im0Var = h31Var.riuEU0zW4;
                            yVar = h31Var.EXtogiMhuM;
                            try {
                                defpackage.f70.nBH8hAHy(obj);
                                ((defpackage.ye) yVar.xiZrDbcSW0).wKlPRKlRnfqr(ok1Var);
                                im0Var.oh6vYeIP(null);
                                return ok1Var;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                im0Var.oh6vYeIP(null);
                                throw th;
                            }
                        }
                        ?? r8 = h31Var.riuEU0zW4;
                        defpackage.y yVar2 = h31Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        km0Var = r8;
                        this = yVar2;
                    }
                    if (((defpackage.ye) this.xiZrDbcSW0).hkbnNdmy() instanceof defpackage.x40) {
                        km0Var.oh6vYeIP(null);
                        return ok1Var;
                    }
                    h31Var.EXtogiMhuM = this;
                    h31Var.riuEU0zW4 = km0Var;
                    h31Var.JlrlGoKF = 2;
                    if (this.riuEU0zW4(h31Var) != vjVar) {
                        yVar = this;
                        im0Var = km0Var;
                        ((defpackage.ye) yVar.xiZrDbcSW0).wKlPRKlRnfqr(ok1Var);
                        im0Var.oh6vYeIP(null);
                        return ok1Var;
                    }
                    return vjVar;
                }
            }
            if (((defpackage.ye) this.xiZrDbcSW0).hkbnNdmy() instanceof defpackage.x40) {
            }
        } catch (java.lang.Throwable th3) {
            defpackage.km0 km0Var2 = km0Var;
            th = th3;
            im0Var = km0Var2;
            im0Var.oh6vYeIP(null);
            throw th;
        }
        h31Var = new defpackage.h31(this, fjVar);
        java.lang.Object obj2 = h31Var.SH1y5HwkJhh;
        i = h31Var.JlrlGoKF;
        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
    }

    @Override // defpackage.nl1
    public defpackage.i5 JlrlGoKF(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        if (((defpackage.i5) this.AARZUJiTa) == null) {
            this.AARZUJiTa = i5Var3.r1MBDhnF();
        }
        defpackage.i5 i5Var4 = (defpackage.i5) this.AARZUJiTa;
        if (i5Var4 == null) {
            defpackage.x70.Ye0N2xE9Hc("velocityVector");
            throw null;
        }
        int oh6vYeIP = i5Var4.oh6vYeIP();
        int i = 0;
        while (true) {
            defpackage.i5 i5Var5 = (defpackage.i5) this.AARZUJiTa;
            if (i >= oh6vYeIP) {
                if (i5Var5 != null) {
                    return i5Var5;
                }
                defpackage.x70.Ye0N2xE9Hc("velocityVector");
                throw null;
            }
            if (i5Var5 == null) {
                defpackage.x70.Ye0N2xE9Hc("velocityVector");
                throw null;
            }
            i5Var5.adDC3e2L(((defpackage.sa1) this.adDC3e2L).adDC3e2L(i).r1MBDhnF(j, i5Var.IHQe1A4L2xu(i), i5Var2.IHQe1A4L2xu(i), i5Var3.IHQe1A4L2xu(i)), i);
            i++;
        }
    }

    @Override // defpackage.nl1
    public defpackage.i5 QoRHpC4k(defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        if (((defpackage.i5) this.EXtogiMhuM) == null) {
            this.EXtogiMhuM = i5Var3.r1MBDhnF();
        }
        defpackage.i5 i5Var4 = (defpackage.i5) this.EXtogiMhuM;
        if (i5Var4 == null) {
            defpackage.x70.Ye0N2xE9Hc("endVelocityVector");
            throw null;
        }
        int oh6vYeIP = i5Var4.oh6vYeIP();
        int i = 0;
        while (true) {
            defpackage.i5 i5Var5 = (defpackage.i5) this.EXtogiMhuM;
            if (i >= oh6vYeIP) {
                if (i5Var5 != null) {
                    return i5Var5;
                }
                defpackage.x70.Ye0N2xE9Hc("endVelocityVector");
                throw null;
            }
            if (i5Var5 == null) {
                defpackage.x70.Ye0N2xE9Hc("endVelocityVector");
                throw null;
            }
            i5Var5.adDC3e2L(((defpackage.sa1) this.adDC3e2L).adDC3e2L(i).adDC3e2L(i5Var.IHQe1A4L2xu(i), i5Var2.IHQe1A4L2xu(i), i5Var3.IHQe1A4L2xu(i)), i);
            i++;
        }
    }

    public defpackage.i5 SH1y5HwkJhh(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2) {
        if (((defpackage.i5) this.AARZUJiTa) == null) {
            this.AARZUJiTa = i5Var.r1MBDhnF();
        }
        defpackage.i5 i5Var3 = (defpackage.i5) this.AARZUJiTa;
        if (i5Var3 == null) {
            defpackage.x70.Ye0N2xE9Hc("velocityVector");
            throw null;
        }
        int oh6vYeIP = i5Var3.oh6vYeIP();
        int i = 0;
        while (true) {
            defpackage.i5 i5Var4 = (defpackage.i5) this.AARZUJiTa;
            if (i >= oh6vYeIP) {
                if (i5Var4 != null) {
                    return i5Var4;
                }
                defpackage.x70.Ye0N2xE9Hc("velocityVector");
                throw null;
            }
            if (i5Var4 == null) {
                defpackage.x70.Ye0N2xE9Hc("velocityVector");
                throw null;
            }
            defpackage.sa1 sa1Var = (defpackage.sa1) this.adDC3e2L;
            i5Var.getClass();
            long j2 = j / 1000000;
            defpackage.xv IHQe1A4L2xu = ((defpackage.yv) sa1Var.xiZrDbcSW0).IHQe1A4L2xu(i5Var2.IHQe1A4L2xu(i));
            long j3 = IHQe1A4L2xu.r1MBDhnF;
            i5Var4.adDC3e2L((((java.lang.Math.signum(IHQe1A4L2xu.IHQe1A4L2xu) * defpackage.j2.IHQe1A4L2xu(j3 > 0 ? j2 / j3 : 1.0f).oh6vYeIP) * IHQe1A4L2xu.oh6vYeIP) / j3) * 1000.0f, i);
            i++;
        }
    }

    public void adDC3e2L(defpackage.kq0 kq0Var, int i) {
        if (i != 1 && i != 0) {
            defpackage.db.adDC3e2L(defpackage.fx0.SH1y5HwkJhh("Unsupported priority value: ", i));
        } else if (((java.util.LinkedHashSet) this.EXtogiMhuM).add(kq0Var)) {
            ((defpackage.ko0) this.xiZrDbcSW0).IHQe1A4L2xu(this, kq0Var, i);
        }
    }

    @Override // defpackage.nl1
    public defpackage.i5 cnag84Bm(long j, defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        if (((defpackage.i5) this.xiZrDbcSW0) == null) {
            this.xiZrDbcSW0 = i5Var.r1MBDhnF();
        }
        defpackage.i5 i5Var4 = (defpackage.i5) this.xiZrDbcSW0;
        if (i5Var4 == null) {
            defpackage.x70.Ye0N2xE9Hc("valueVector");
            throw null;
        }
        int oh6vYeIP = i5Var4.oh6vYeIP();
        int i = 0;
        while (true) {
            defpackage.i5 i5Var5 = (defpackage.i5) this.xiZrDbcSW0;
            if (i >= oh6vYeIP) {
                if (i5Var5 != null) {
                    return i5Var5;
                }
                defpackage.x70.Ye0N2xE9Hc("valueVector");
                throw null;
            }
            if (i5Var5 == null) {
                defpackage.x70.Ye0N2xE9Hc("valueVector");
                throw null;
            }
            i5Var5.adDC3e2L(((defpackage.sa1) this.adDC3e2L).adDC3e2L(i).oh6vYeIP(j, i5Var.IHQe1A4L2xu(i), i5Var2.IHQe1A4L2xu(i), i5Var3.IHQe1A4L2xu(i)), i);
            i++;
        }
    }

    @Override // defpackage.nl1
    public long oh6vYeIP(defpackage.i5 i5Var, defpackage.i5 i5Var2, defpackage.i5 i5Var3) {
        int oh6vYeIP = i5Var.oh6vYeIP();
        long j = 0;
        for (int i = 0; i < oh6vYeIP; i++) {
            j = java.lang.Math.max(j, ((defpackage.sa1) this.adDC3e2L).adDC3e2L(i).F7NU4MC0GW(i5Var.IHQe1A4L2xu(i), i5Var2.IHQe1A4L2xu(i), i5Var3.IHQe1A4L2xu(i)));
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object riuEU0zW4(defpackage.fj fjVar) {
        defpackage.fl flVar;
        int i;
        defpackage.zk zkVar;
        defpackage.bm bmVar = (defpackage.bm) this.EXtogiMhuM;
        if (fjVar instanceof defpackage.fl) {
            flVar = (defpackage.fl) fjVar;
            int i2 = flVar.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flVar.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = flVar.riuEU0zW4;
                i = flVar.ez2rX8ReCYw;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    java.util.List list = (java.util.List) this.AARZUJiTa;
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (list == null || list.isEmpty()) {
                        flVar.EXtogiMhuM = this;
                        flVar.ez2rX8ReCYw = 1;
                        obj = defpackage.bm.AARZUJiTa(bmVar, false, flVar);
                    } else {
                        defpackage.x91 EXtogiMhuM = bmVar.EXtogiMhuM();
                        defpackage.il ilVar = new defpackage.il(bmVar, this, null);
                        flVar.EXtogiMhuM = this;
                        flVar.ez2rX8ReCYw = 2;
                        obj = EXtogiMhuM.oh6vYeIP(ilVar, flVar);
                    }
                    return vjVar;
                }
                if (i == 1) {
                    this = flVar.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    zkVar = (defpackage.zk) obj;
                } else {
                    if (i != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = flVar.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    zkVar = (defpackage.zk) obj;
                }
                ((defpackage.bm) this.EXtogiMhuM).EXtogiMhuM.r1MBDhnF(zkVar);
                return defpackage.ok1.IHQe1A4L2xu;
            }
        }
        flVar = new defpackage.fl(this, fjVar);
        java.lang.Object obj2 = flVar.riuEU0zW4;
        i = flVar.ez2rX8ReCYw;
        if (i != 0) {
        }
        ((defpackage.bm) this.EXtogiMhuM).EXtogiMhuM.r1MBDhnF(zkVar);
        return defpackage.ok1.IHQe1A4L2xu;
    }

    public void xiZrDbcSW0(defpackage.jo0 jo0Var, defpackage.fo0 fo0Var) {
        defpackage.ko0 ko0Var = (defpackage.ko0) this.xiZrDbcSW0;
        ko0Var.getClass();
        if (ko0Var.AARZUJiTa != 0) {
            return;
        }
        defpackage.ho0 r1MBDhnF = ko0Var.r1MBDhnF(-1);
        ko0Var.xiZrDbcSW0 = r1MBDhnF;
        ko0Var.AARZUJiTa = -1;
        ko0Var.EXtogiMhuM = jo0Var;
        if (fo0Var != null) {
            if (r1MBDhnF != null) {
                r1MBDhnF.F7NU4MC0GW(fo0Var);
            }
            defpackage.hc1 hc1Var = ko0Var.IHQe1A4L2xu;
            defpackage.mo0 mo0Var = new defpackage.mo0(fo0Var);
            hc1Var.getClass();
            hc1Var.ez2rX8ReCYw(null, mo0Var);
        }
    }

    public y(defpackage.bn1 bn1Var, defpackage.zm1 zm1Var, defpackage.fk fkVar) {
        bn1Var.getClass();
        fkVar.getClass();
        this.adDC3e2L = bn1Var;
        this.xiZrDbcSW0 = zm1Var;
        this.AARZUJiTa = fkVar;
        this.EXtogiMhuM = new defpackage.c41(6);
    }

    public /* synthetic */ y(java.lang.Object obj) {
        this.adDC3e2L = obj;
    }

    public y(defpackage.cw cwVar) {
        this(new defpackage.sa1(7, cwVar));
    }
}
