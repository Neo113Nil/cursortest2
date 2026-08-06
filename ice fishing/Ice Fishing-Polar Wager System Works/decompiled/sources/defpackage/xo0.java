package defpackage;

/* loaded from: classes.dex */
public final class xo0 extends defpackage.lj0 implements defpackage.ui1 {
    public final defpackage.t21 EgCjBq0SZwJ;
    public final java.lang.String V7bD7b8KA = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    public final defpackage.y fnWB2E7cs;
    public defpackage.xo0 kNAkVymC;

    public xo0(defpackage.t21 t21Var, defpackage.y yVar) {
        this.EgCjBq0SZwJ = t21Var;
        this.fnWB2E7cs = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object H6IrRhrpWoH(long j, long j2, defpackage.fj fjVar) {
        defpackage.vo0 vo0Var;
        int i;
        long j3;
        long j4;
        long j5;
        boolean z;
        defpackage.xo0 xo0Var;
        long j6;
        long j7;
        defpackage.ui1 ui1Var;
        defpackage.ep0 ep0Var;
        int i2;
        int i3;
        if (fjVar instanceof defpackage.vo0) {
            vo0Var = (defpackage.vo0) fjVar;
            int i4 = vo0Var.JlrlGoKF;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vo0Var.JlrlGoKF = i4 - Integer.MIN_VALUE;
                defpackage.vo0 vo0Var2 = vo0Var;
                java.lang.Object obj = vo0Var2.SH1y5HwkJhh;
                i = vo0Var2.JlrlGoKF;
                defpackage.xl0 xl0Var = null;
                int i5 = 1;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    vo0Var2.EXtogiMhuM = j;
                    vo0Var2.riuEU0zW4 = j2;
                    vo0Var2.JlrlGoKF = 1;
                    obj = this.EgCjBq0SZwJ.IHQe1A4L2xu(j, j2, vo0Var2);
                    if (obj != vjVar) {
                        j3 = j;
                        j4 = j2;
                    }
                    return vjVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7 = vo0Var2.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    j6 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                    j5 = j7;
                    return new defpackage.rl1(defpackage.rl1.adDC3e2L(j5, j6));
                }
                j4 = vo0Var2.riuEU0zW4;
                j3 = vo0Var2.EXtogiMhuM;
                defpackage.f70.nBH8hAHy(obj);
                j5 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                z = this.kd6TUFXn;
                if (z) {
                    xo0Var = this.kNAkVymC;
                } else if (z && z) {
                    if (!this.adDC3e2L.kd6TUFXn) {
                        defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                    }
                    defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
                    defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
                    loop0: while (true) {
                        if (D2vUnMij == null) {
                            ui1Var = null;
                            break;
                        }
                        int i6 = 262144;
                        if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                            while (lj0Var != null) {
                                if ((lj0Var.AARZUJiTa & i6) != 0) {
                                    defpackage.lj0 lj0Var2 = lj0Var;
                                    defpackage.xl0 xl0Var2 = xl0Var;
                                    while (lj0Var2 != null) {
                                        if (lj0Var2 instanceof defpackage.ui1) {
                                            ui1Var = (defpackage.ui1) lj0Var2;
                                            i2 = i6;
                                            if (defpackage.x70.QoRHpC4k(JlrlGoKF(), ui1Var.JlrlGoKF()) && defpackage.xo0.class == ui1Var.getClass()) {
                                                break loop0;
                                            }
                                        } else {
                                            i2 = i6;
                                        }
                                        if ((lj0Var2.AARZUJiTa & i2) == 0 || !(lj0Var2 instanceof defpackage.ln)) {
                                            i3 = i5;
                                        } else {
                                            defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs;
                                            int i7 = 0;
                                            while (lj0Var3 != null) {
                                                if ((lj0Var3.AARZUJiTa & i2) != 0) {
                                                    i7++;
                                                    if (i7 == i5) {
                                                        lj0Var2 = lj0Var3;
                                                    } else {
                                                        defpackage.xl0 xl0Var3 = xl0Var2 == null ? new defpackage.xl0(new defpackage.lj0[16]) : xl0Var2;
                                                        if (lj0Var2 != null) {
                                                            xl0Var3.oh6vYeIP(lj0Var2);
                                                            lj0Var2 = null;
                                                        }
                                                        xl0Var3.oh6vYeIP(lj0Var3);
                                                        xl0Var2 = xl0Var3;
                                                    }
                                                }
                                                lj0Var3 = lj0Var3.SH1y5HwkJhh;
                                                i5 = 1;
                                            }
                                            i3 = i5;
                                            if (i7 == i3) {
                                                i6 = i2;
                                                i5 = i3;
                                            }
                                        }
                                        lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var2);
                                        i6 = i2;
                                        i5 = i3;
                                    }
                                }
                                lj0Var = lj0Var.riuEU0zW4;
                                i6 = i6;
                                i5 = i5;
                                xl0Var = null;
                            }
                        }
                        int i8 = i5;
                        D2vUnMij = D2vUnMij.V7bD7b8KA();
                        lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                        i5 = i8;
                        xl0Var = null;
                    }
                    xo0Var = (defpackage.xo0) ui1Var;
                } else {
                    xo0Var = null;
                }
                if (xo0Var != null) {
                    j6 = 0;
                    return new defpackage.rl1(defpackage.rl1.adDC3e2L(j5, j6));
                }
                long adDC3e2L = defpackage.rl1.adDC3e2L(j3, j5);
                long F7NU4MC0GW = defpackage.rl1.F7NU4MC0GW(j4, j5);
                vo0Var2.EXtogiMhuM = j5;
                vo0Var2.JlrlGoKF = 2;
                obj = xo0Var.H6IrRhrpWoH(adDC3e2L, F7NU4MC0GW, vo0Var2);
                if (obj != vjVar) {
                    j7 = j5;
                    j6 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                    j5 = j7;
                    return new defpackage.rl1(defpackage.rl1.adDC3e2L(j5, j6));
                }
                return vjVar;
            }
        }
        vo0Var = new defpackage.vo0(this, fjVar);
        defpackage.vo0 vo0Var22 = vo0Var;
        java.lang.Object obj2 = vo0Var22.SH1y5HwkJhh;
        i = vo0Var22.JlrlGoKF;
        defpackage.xl0 xl0Var4 = null;
        int i52 = 1;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        j5 = ((defpackage.rl1) obj2).IHQe1A4L2xu;
        z = this.kd6TUFXn;
        if (z) {
        }
        if (xo0Var != null) {
        }
    }

    @Override // defpackage.lj0
    public final void JX5fKip1C6() {
        defpackage.y yVar = this.fnWB2E7cs;
        yVar.adDC3e2L = this;
        yVar.xiZrDbcSW0 = null;
        this.kNAkVymC = null;
        yVar.AARZUJiTa = new defpackage.s4(9, this);
        yVar.EXtogiMhuM = dOmtpLcqqI1y();
    }

    @Override // defpackage.ui1
    public final java.lang.Object JlrlGoKF() {
        return this.V7bD7b8KA;
    }

    public final defpackage.uj UVjEelCZ() {
        defpackage.xo0 xo0Var;
        defpackage.ui1 ui1Var;
        defpackage.ep0 ep0Var;
        if (this.kd6TUFXn) {
            if (!this.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
            loop0: while (true) {
                if (D2vUnMij == null) {
                    ui1Var = null;
                    break;
                }
                if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                    while (lj0Var != null) {
                        if ((lj0Var.AARZUJiTa & 262144) != 0) {
                            defpackage.lj0 lj0Var2 = lj0Var;
                            defpackage.xl0 xl0Var = null;
                            while (lj0Var2 != null) {
                                if (lj0Var2 instanceof defpackage.ui1) {
                                    ui1Var = (defpackage.ui1) lj0Var2;
                                    if (defpackage.x70.QoRHpC4k(JlrlGoKF(), ui1Var.JlrlGoKF()) && defpackage.xo0.class == ui1Var.getClass()) {
                                        break loop0;
                                    }
                                }
                                if ((lj0Var2.AARZUJiTa & 262144) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                    int i = 0;
                                    for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                        if ((lj0Var3.AARZUJiTa & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
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
            xo0Var = (defpackage.xo0) ui1Var;
        } else {
            xo0Var = null;
        }
        defpackage.uj UVjEelCZ = xo0Var != null ? xo0Var.UVjEelCZ() : null;
        if (UVjEelCZ != null && defpackage.h1.v5iciZok(UVjEelCZ)) {
            return UVjEelCZ;
        }
        defpackage.uj ujVar = (defpackage.uj) this.fnWB2E7cs.EXtogiMhuM;
        if (ujVar != null) {
            return ujVar;
        }
        defpackage.db.AARZUJiTa("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object WnQbjbWuMR(long j, defpackage.ej ejVar) {
        defpackage.wo0 wo0Var;
        int i;
        defpackage.vj vjVar;
        defpackage.xo0 xo0Var;
        long j2;
        long j3;
        defpackage.ui1 ui1Var;
        defpackage.ep0 ep0Var;
        int i2;
        defpackage.rl1 rl1Var;
        long j4;
        if (ejVar instanceof defpackage.wo0) {
            wo0Var = (defpackage.wo0) ejVar;
            int i3 = wo0Var.ez2rX8ReCYw;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wo0Var.ez2rX8ReCYw = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = wo0Var.riuEU0zW4;
                i = wo0Var.ez2rX8ReCYw;
                defpackage.xl0 xl0Var = null;
                vjVar = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    boolean z = this.kd6TUFXn;
                    if (z && z) {
                        if (!this.adDC3e2L.kd6TUFXn) {
                            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                        }
                        defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
                        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
                        loop0: while (true) {
                            if (D2vUnMij == null) {
                                ui1Var = null;
                                break;
                            }
                            int i4 = 262144;
                            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                                while (lj0Var != null) {
                                    if ((lj0Var.AARZUJiTa & i4) != 0) {
                                        defpackage.lj0 lj0Var2 = lj0Var;
                                        defpackage.xl0 xl0Var2 = xl0Var;
                                        while (lj0Var2 != null) {
                                            if (lj0Var2 instanceof defpackage.ui1) {
                                                defpackage.ui1 ui1Var2 = (defpackage.ui1) lj0Var2;
                                                i2 = i4;
                                                if (defpackage.x70.QoRHpC4k(JlrlGoKF(), ui1Var2.JlrlGoKF()) && defpackage.xo0.class == ui1Var2.getClass()) {
                                                    ui1Var = ui1Var2;
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
                            D2vUnMij = D2vUnMij.V7bD7b8KA();
                            lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                            xl0Var = null;
                        }
                        xo0Var = (defpackage.xo0) ui1Var;
                    } else {
                        xo0Var = null;
                    }
                    if (xo0Var != null) {
                        wo0Var.EXtogiMhuM = j;
                        wo0Var.ez2rX8ReCYw = 1;
                        obj = xo0Var.WnQbjbWuMR(j, wo0Var);
                        if (obj != vjVar) {
                            j2 = j;
                        }
                        return vjVar;
                    }
                    j2 = j;
                    j3 = 0;
                    defpackage.rl1.F7NU4MC0GW(j2, j3);
                    wo0Var.EXtogiMhuM = j3;
                    wo0Var.ez2rX8ReCYw = 2;
                    rl1Var = new defpackage.rl1(0L);
                    if (rl1Var != vjVar) {
                        obj = rl1Var;
                        j4 = j3;
                        return new defpackage.rl1(defpackage.rl1.adDC3e2L(j4, ((defpackage.rl1) obj).IHQe1A4L2xu));
                    }
                    return vjVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = wo0Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    return new defpackage.rl1(defpackage.rl1.adDC3e2L(j4, ((defpackage.rl1) obj).IHQe1A4L2xu));
                }
                j2 = wo0Var.EXtogiMhuM;
                defpackage.f70.nBH8hAHy(obj);
                j3 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                defpackage.rl1.F7NU4MC0GW(j2, j3);
                wo0Var.EXtogiMhuM = j3;
                wo0Var.ez2rX8ReCYw = 2;
                rl1Var = new defpackage.rl1(0L);
                if (rl1Var != vjVar) {
                }
                return vjVar;
            }
        }
        wo0Var = new defpackage.wo0(this, (defpackage.fj) ejVar);
        java.lang.Object obj2 = wo0Var.riuEU0zW4;
        i = wo0Var.ez2rX8ReCYw;
        defpackage.xl0 xl0Var3 = null;
        vjVar = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        j3 = ((defpackage.rl1) obj2).IHQe1A4L2xu;
        defpackage.rl1.F7NU4MC0GW(j2, j3);
        wo0Var.EXtogiMhuM = j3;
        wo0Var.ez2rX8ReCYw = 2;
        rl1Var = new defpackage.rl1(0L);
        if (rl1Var != vjVar) {
        }
        return vjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2 A[EDGE_INSN: B:76:0x00d2->B:29:0x00d2 BREAK  A[LOOP:0: B:13:0x004a->B:71:0x004a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long pm90rNzI5F(int i, long j, long j2) {
        long j3;
        boolean z;
        defpackage.xo0 xo0Var;
        defpackage.ma0 D2vUnMij;
        defpackage.ep0 ep0Var;
        defpackage.t21 t21Var = this.EgCjBq0SZwJ;
        if (t21Var.IHQe1A4L2xu) {
            defpackage.i61 i61Var = (defpackage.i61) t21Var.oh6vYeIP;
            if (!i61Var.IHQe1A4L2xu.oh6vYeIP()) {
                j3 = i61Var.EXtogiMhuM(i61Var.F7NU4MC0GW(i61Var.IHQe1A4L2xu.adDC3e2L(i61Var.F7NU4MC0GW(i61Var.AARZUJiTa(j2)))));
                z = this.kd6TUFXn;
                xo0Var = null;
                if (z && z) {
                    if (!this.adDC3e2L.kd6TUFXn) {
                        defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                    }
                    defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
                    D2vUnMij = defpackage.w70.D2vUnMij(this);
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
                                            if (defpackage.x70.QoRHpC4k(JlrlGoKF(), ui1Var.JlrlGoKF()) && defpackage.xo0.class == ui1Var.getClass()) {
                                                xo0Var = ui1Var;
                                                break loop0;
                                            }
                                        }
                                        if ((lj0Var2.AARZUJiTa & 262144) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                            int i2 = 0;
                                            for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                                if ((lj0Var3.AARZUJiTa & 262144) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
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
                                            if (i2 == 1) {
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
                defpackage.xo0 xo0Var2 = xo0Var;
                return defpackage.gq0.adDC3e2L(j3, xo0Var2 == null ? xo0Var2.pm90rNzI5F(i, defpackage.gq0.adDC3e2L(j, j3), defpackage.gq0.F7NU4MC0GW(j2, j3)) : 0L);
            }
        }
        j3 = 0;
        z = this.kd6TUFXn;
        xo0Var = null;
        if (z) {
            if (!this.adDC3e2L.kd6TUFXn) {
            }
            defpackage.lj0 lj0Var4 = this.adDC3e2L.riuEU0zW4;
            D2vUnMij = defpackage.w70.D2vUnMij(this);
            loop0: while (true) {
                if (D2vUnMij == null) {
                }
            }
            xo0Var = xo0Var;
        }
        defpackage.xo0 xo0Var22 = xo0Var;
        return defpackage.gq0.adDC3e2L(j3, xo0Var22 == null ? xo0Var22.pm90rNzI5F(i, defpackage.gq0.adDC3e2L(j, j3), defpackage.gq0.F7NU4MC0GW(j2, j3)) : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long uLnPvzwk(int i, long j) {
        defpackage.ep0 ep0Var;
        boolean z = this.kd6TUFXn;
        defpackage.xo0 xo0Var = null;
        if (z && z) {
            if (!this.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
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
                                    if (defpackage.x70.QoRHpC4k(JlrlGoKF(), ui1Var.JlrlGoKF()) && defpackage.xo0.class == ui1Var.getClass()) {
                                        xo0Var = ui1Var;
                                        break loop0;
                                    }
                                }
                                if ((lj0Var2.AARZUJiTa & 262144) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                    int i2 = 0;
                                    for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                        if ((lj0Var3.AARZUJiTa & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
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
        long uLnPvzwk = xo0Var != null ? xo0Var.uLnPvzwk(i, j) : 0L;
        defpackage.gq0.F7NU4MC0GW(j, uLnPvzwk);
        return defpackage.gq0.adDC3e2L(uLnPvzwk, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [lj0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [lj0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [xl0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [xl0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        defpackage.ep0 ep0Var;
        defpackage.rz0 rz0Var = new defpackage.rz0();
        defpackage.p0 p0Var = new defpackage.p0(1, rz0Var);
        defpackage.xo0 xo0Var = this;
        if (!xo0Var.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
        }
        defpackage.lj0 lj0Var = xo0Var.adDC3e2L.riuEU0zW4;
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
        loop0: while (D2vUnMij != null) {
            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 262144) != 0) {
                while (lj0Var != null) {
                    if ((lj0Var.AARZUJiTa & 262144) != 0) {
                        defpackage.ln lnVar = lj0Var;
                        ?? r8 = 0;
                        while (lnVar != 0) {
                            if (lnVar instanceof defpackage.ui1) {
                                defpackage.ui1 ui1Var = (defpackage.ui1) lnVar;
                                if (!((defpackage.x70.QoRHpC4k(JlrlGoKF(), ui1Var.JlrlGoKF()) && getClass() == ui1Var.getClass()) ? ((java.lang.Boolean) p0Var.AARZUJiTa(ui1Var)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else if ((lnVar.AARZUJiTa & 262144) != 0 && (lnVar instanceof defpackage.ln)) {
                                defpackage.lj0 lj0Var2 = lnVar.fnWB2E7cs;
                                int i = 0;
                                lnVar = lnVar;
                                r8 = r8;
                                while (lj0Var2 != null) {
                                    if ((lj0Var2.AARZUJiTa & 262144) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            lnVar = lj0Var2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lnVar != 0) {
                                                r8.oh6vYeIP(lnVar);
                                                lnVar = 0;
                                            }
                                            r8.oh6vYeIP(lj0Var2);
                                        }
                                    }
                                    lj0Var2 = lj0Var2.SH1y5HwkJhh;
                                    lnVar = lnVar;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            lnVar = defpackage.w70.riuEU0zW4(r8);
                        }
                    }
                    lj0Var = lj0Var.riuEU0zW4;
                }
            }
            D2vUnMij = D2vUnMij.V7bD7b8KA();
            lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
        }
        defpackage.xo0 xo0Var2 = (defpackage.xo0) ((defpackage.ui1) rz0Var.adDC3e2L);
        this.kNAkVymC = xo0Var2;
        defpackage.y yVar = this.fnWB2E7cs;
        yVar.xiZrDbcSW0 = xo0Var2;
        if (((defpackage.xo0) yVar.adDC3e2L) == this) {
            yVar.adDC3e2L = null;
        }
    }
}
