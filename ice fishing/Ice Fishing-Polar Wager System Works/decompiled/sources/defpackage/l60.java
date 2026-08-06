package defpackage;

/* loaded from: classes.dex */
public final class l60 extends defpackage.od implements java.lang.Runnable, defpackage.jq0, android.view.View.OnAttachStateChangeListener {
    public boolean AARZUJiTa;
    public final defpackage.gb1 DFo87pBq1E5;
    public int EXtogiMhuM;
    public final defpackage.gl0 JlrlGoKF;
    public final defpackage.nl0 SH1y5HwkJhh;
    public final defpackage.nt0 ez2rX8ReCYw;
    public defpackage.ro1 riuEU0zW4;

    public l60() {
        super(1);
        defpackage.nl0 nl0Var = new defpackage.nl0(9);
        defpackage.yo1.IHQe1A4L2xu.getClass();
        nl0Var.DFo87pBq1E5(defpackage.xo1.oh6vYeIP, new defpackage.op1("caption bar"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.r1MBDhnF, new defpackage.op1("display cutout"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.F7NU4MC0GW, new defpackage.op1("ime"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.adDC3e2L, new defpackage.op1("mandatory system gestures"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.xiZrDbcSW0, new defpackage.op1("navigation bars"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.AARZUJiTa, new defpackage.op1("status bars"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.EXtogiMhuM, new defpackage.op1("system gestures"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.riuEU0zW4, new defpackage.op1("tappable element"));
        nl0Var.DFo87pBq1E5(defpackage.xo1.SH1y5HwkJhh, new defpackage.op1("waterfall"));
        this.SH1y5HwkJhh = nl0Var;
        this.ez2rX8ReCYw = new defpackage.nt0(0);
        this.JlrlGoKF = new defpackage.gl0(4);
        this.DFo87pBq1E5 = new defpackage.gb1();
    }

    @Override // defpackage.od
    public final defpackage.ro1 AARZUJiTa(defpackage.ro1 ro1Var, java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.wn1 wn1Var = (defpackage.wn1) list.get(i);
            defpackage.yo1 yo1Var = (defpackage.yo1) defpackage.ap1.IHQe1A4L2xu.oh6vYeIP(wn1Var.IHQe1A4L2xu.F7NU4MC0GW());
            if (yo1Var != null) {
                java.lang.Object AARZUJiTa = this.SH1y5HwkJhh.AARZUJiTa(yo1Var);
                AARZUJiTa.getClass();
                defpackage.op1 op1Var = (defpackage.op1) AARZUJiTa;
                if (((java.lang.Boolean) op1Var.oh6vYeIP.getValue()).booleanValue()) {
                    defpackage.vn1 vn1Var = wn1Var.IHQe1A4L2xu;
                    op1Var.r1MBDhnF.EXtogiMhuM(vn1Var.r1MBDhnF());
                    op1Var.adDC3e2L.EXtogiMhuM(vn1Var.IHQe1A4L2xu());
                    op1Var.F7NU4MC0GW.EXtogiMhuM(vn1Var.oh6vYeIP());
                }
            }
        }
        D2vUnMij(ro1Var);
        return ro1Var;
    }

    public final void D2vUnMij(defpackage.ro1 ro1Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        java.lang.Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        java.lang.Object[] objArr2;
        long j2;
        int i;
        defpackage.xk0 xk0Var = defpackage.ap1.IHQe1A4L2xu;
        int[] iArr3 = xk0Var.oh6vYeIP;
        java.lang.Object[] objArr3 = xk0Var.r1MBDhnF;
        long[] jArr3 = xk0Var.IHQe1A4L2xu;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            defpackage.yo1 yo1Var = (defpackage.yo1) objArr3[i6];
                            defpackage.i60 EXtogiMhuM = ro1Var.IHQe1A4L2xu.EXtogiMhuM(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (EXtogiMhuM.IHQe1A4L2xu << 48) | (EXtogiMhuM.oh6vYeIP << 32) | (EXtogiMhuM.r1MBDhnF << 16) | EXtogiMhuM.F7NU4MC0GW;
                            java.lang.Object AARZUJiTa = this.SH1y5HwkJhh.AARZUJiTa(yo1Var);
                            AARZUJiTa.getClass();
                            defpackage.op1 op1Var = (defpackage.op1) AARZUJiTa;
                            j2 = j3;
                            if (!defpackage.l80.JlrlGoKF(j4, op1Var.EXtogiMhuM)) {
                                op1Var.EXtogiMhuM = j4;
                                z2 = true;
                                if (!defpackage.l80.JlrlGoKF(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                defpackage.i60 riuEU0zW4 = ro1Var.IHQe1A4L2xu.riuEU0zW4(i7);
                                objArr2 = objArr3;
                                long j5 = (riuEU0zW4.oh6vYeIP << 32) | (riuEU0zW4.IHQe1A4L2xu << 48) | (riuEU0zW4.r1MBDhnF << 16) | riuEU0zW4.F7NU4MC0GW;
                                if (!defpackage.l80.JlrlGoKF(op1Var.riuEU0zW4, j5)) {
                                    op1Var.riuEU0zW4 = j5;
                                    z2 = true;
                                    if (!defpackage.l80.JlrlGoKF(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            op1Var.IHQe1A4L2xu.setValue(java.lang.Boolean.valueOf(ro1Var.IHQe1A4L2xu.fnWB2E7cs(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        defpackage.dq AARZUJiTa2 = ro1Var.IHQe1A4L2xu.AARZUJiTa();
        if (AARZUJiTa2 == null) {
            j = 0;
        } else {
            defpackage.i60 IHQe1A4L2xu = AARZUJiTa2.IHQe1A4L2xu();
            j = (IHQe1A4L2xu.IHQe1A4L2xu << c3) | (IHQe1A4L2xu.oh6vYeIP << c2) | (IHQe1A4L2xu.r1MBDhnF << c) | IHQe1A4L2xu.F7NU4MC0GW;
        }
        defpackage.nl0 nl0Var = this.SH1y5HwkJhh;
        defpackage.yo1.IHQe1A4L2xu.getClass();
        java.lang.Object AARZUJiTa3 = nl0Var.AARZUJiTa(defpackage.xo1.SH1y5HwkJhh);
        AARZUJiTa3.getClass();
        defpackage.op1 op1Var2 = (defpackage.op1) AARZUJiTa3;
        op1Var2.IHQe1A4L2xu.setValue(java.lang.Boolean.valueOf(!defpackage.l80.JlrlGoKF(j, 0L)));
        if (!defpackage.l80.JlrlGoKF(op1Var2.EXtogiMhuM, j)) {
            op1Var2.EXtogiMhuM = j;
            op1Var2.riuEU0zW4 = j;
            z2 = z;
            if (!defpackage.l80.JlrlGoKF(j, 0L)) {
                z3 = z2;
            }
        }
        if (AARZUJiTa2 == null) {
            defpackage.gl0 gl0Var = this.JlrlGoKF;
            if (gl0Var.oh6vYeIP > 0) {
                gl0Var.F7NU4MC0GW();
                this.DFo87pBq1E5.clear();
                z2 = z;
            }
        } else {
            java.util.List oh6vYeIP = android.os.Build.VERSION.SDK_INT >= 28 ? defpackage.cq.oh6vYeIP(AARZUJiTa2.IHQe1A4L2xu) : java.util.Collections.EMPTY_LIST;
            int size = oh6vYeIP.size();
            defpackage.gl0 gl0Var2 = this.JlrlGoKF;
            if (size < gl0Var2.oh6vYeIP) {
                gl0Var2.JlrlGoKF(oh6vYeIP.size(), this.JlrlGoKF.oh6vYeIP);
                this.DFo87pBq1E5.adDC3e2L(oh6vYeIP.size(), this.DFo87pBq1E5.size());
                z2 = z;
            } else {
                int size2 = oh6vYeIP.size() - this.JlrlGoKF.oh6vYeIP;
                int i8 = 0;
                while (i8 < size2) {
                    defpackage.gl0 gl0Var3 = this.JlrlGoKF;
                    gl0Var3.IHQe1A4L2xu(defpackage.c80.nBH8hAHy(oh6vYeIP.get(gl0Var3.oh6vYeIP)));
                    this.DFo87pBq1E5.add(new defpackage.e60("display cutout rect " + this.JlrlGoKF.oh6vYeIP));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = oh6vYeIP.size();
            for (int i9 = 0; i9 < size3; i9++) {
                android.graphics.Rect rect = (android.graphics.Rect) oh6vYeIP.get(i9);
                defpackage.sl0 sl0Var = (defpackage.sl0) this.JlrlGoKF.xiZrDbcSW0(i9);
                if (!defpackage.x70.QoRHpC4k(sl0Var.getValue(), rect)) {
                    sl0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!oh6vYeIP.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.ez2rX8ReCYw.AARZUJiTa() != 0) && z2) {
            defpackage.nt0 nt0Var = this.ez2rX8ReCYw;
            nt0Var.EXtogiMhuM(nt0Var.AARZUJiTa() + 1);
            synchronized (defpackage.wa1.r1MBDhnF) {
                defpackage.ol0 ol0Var = defpackage.wa1.SH1y5HwkJhh.EXtogiMhuM;
                if (ol0Var != null) {
                    boolean z5 = z;
                    z4 = ol0Var.EXtogiMhuM() == z5 ? z5 : false;
                }
            }
            if (z4) {
                defpackage.wa1.IHQe1A4L2xu();
            }
        }
    }

    @Override // defpackage.od
    public final defpackage.F7NU4MC0GW EXtogiMhuM(defpackage.wn1 wn1Var, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        defpackage.ro1 ro1Var = this.riuEU0zW4;
        boolean z = false;
        this.AARZUJiTa = false;
        this.riuEU0zW4 = null;
        if (wn1Var.IHQe1A4L2xu.oh6vYeIP() > 0 && ro1Var != null) {
            int F7NU4MC0GW = wn1Var.IHQe1A4L2xu.F7NU4MC0GW();
            this.EXtogiMhuM |= F7NU4MC0GW;
            defpackage.yo1 yo1Var = (defpackage.yo1) defpackage.ap1.IHQe1A4L2xu.oh6vYeIP(F7NU4MC0GW);
            if (yo1Var != null) {
                java.lang.Object AARZUJiTa = this.SH1y5HwkJhh.AARZUJiTa(yo1Var);
                AARZUJiTa.getClass();
                defpackage.op1 op1Var = (defpackage.op1) AARZUJiTa;
                defpackage.i60 EXtogiMhuM = ro1Var.IHQe1A4L2xu.EXtogiMhuM(F7NU4MC0GW);
                long j = (EXtogiMhuM.IHQe1A4L2xu << 48) | (EXtogiMhuM.oh6vYeIP << 32) | (EXtogiMhuM.r1MBDhnF << 16) | EXtogiMhuM.F7NU4MC0GW;
                long j2 = op1Var.EXtogiMhuM;
                if (!defpackage.l80.JlrlGoKF(j, j2)) {
                    op1Var.SH1y5HwkJhh = j2;
                    op1Var.ez2rX8ReCYw = j;
                    op1Var.oh6vYeIP.setValue(java.lang.Boolean.TRUE);
                    defpackage.vn1 vn1Var = wn1Var.IHQe1A4L2xu;
                    op1Var.r1MBDhnF.EXtogiMhuM(vn1Var.r1MBDhnF());
                    op1Var.adDC3e2L.EXtogiMhuM(vn1Var.IHQe1A4L2xu());
                    op1Var.F7NU4MC0GW.EXtogiMhuM(vn1Var.oh6vYeIP());
                    defpackage.nt0 nt0Var = this.ez2rX8ReCYw;
                    nt0Var.EXtogiMhuM(nt0Var.AARZUJiTa() + 1);
                    synchronized (defpackage.wa1.r1MBDhnF) {
                        defpackage.ol0 ol0Var = defpackage.wa1.SH1y5HwkJhh.EXtogiMhuM;
                        if (ol0Var != null) {
                            if (ol0Var.EXtogiMhuM()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        defpackage.wa1.IHQe1A4L2xu();
                        return f7nu4mc0gw;
                    }
                }
            }
        }
        return f7nu4mc0gw;
    }

    @Override // defpackage.jq0
    public final defpackage.ro1 IHQe1A4L2xu(android.view.View view, defpackage.ro1 ro1Var) {
        if (this.AARZUJiTa) {
            this.riuEU0zW4 = ro1Var;
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return ro1Var;
            }
        } else if (this.EXtogiMhuM == 0) {
            D2vUnMij(ro1Var);
        }
        return ro1Var;
    }

    @Override // defpackage.od
    public final void adDC3e2L(defpackage.wn1 wn1Var) {
        boolean z = false;
        this.AARZUJiTa = false;
        int F7NU4MC0GW = wn1Var.IHQe1A4L2xu.F7NU4MC0GW();
        this.EXtogiMhuM &= ~F7NU4MC0GW;
        this.riuEU0zW4 = null;
        defpackage.yo1 yo1Var = (defpackage.yo1) defpackage.ap1.IHQe1A4L2xu.oh6vYeIP(F7NU4MC0GW);
        if (yo1Var != null) {
            java.lang.Object AARZUJiTa = this.SH1y5HwkJhh.AARZUJiTa(yo1Var);
            AARZUJiTa.getClass();
            defpackage.op1 op1Var = (defpackage.op1) AARZUJiTa;
            op1Var.r1MBDhnF.EXtogiMhuM(0.0f);
            op1Var.adDC3e2L.EXtogiMhuM(1.0f);
            op1Var.F7NU4MC0GW.EXtogiMhuM(0L);
            op1Var.r1MBDhnF.EXtogiMhuM(0.0f);
            op1Var.oh6vYeIP.setValue(java.lang.Boolean.FALSE);
            op1Var.SH1y5HwkJhh = -1L;
            op1Var.ez2rX8ReCYw = -1L;
            defpackage.nt0 nt0Var = this.ez2rX8ReCYw;
            nt0Var.EXtogiMhuM(nt0Var.AARZUJiTa() + 1);
            synchronized (defpackage.wa1.r1MBDhnF) {
                defpackage.ol0 ol0Var = defpackage.wa1.SH1y5HwkJhh.EXtogiMhuM;
                if (ol0Var != null) {
                    if (ol0Var.EXtogiMhuM()) {
                        z = true;
                    }
                }
            }
            if (z) {
                defpackage.wa1.IHQe1A4L2xu();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = defpackage.mm1.IHQe1A4L2xu;
        defpackage.hm1.oh6vYeIP(view, this);
        defpackage.mm1.IHQe1A4L2xu(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = defpackage.mm1.IHQe1A4L2xu;
        defpackage.hm1.oh6vYeIP(view, null);
        defpackage.mm1.IHQe1A4L2xu(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.AARZUJiTa) {
            this.EXtogiMhuM = 0;
            this.AARZUJiTa = false;
            defpackage.ro1 ro1Var = this.riuEU0zW4;
            if (ro1Var != null) {
                D2vUnMij(ro1Var);
                this.riuEU0zW4 = null;
            }
        }
    }

    @Override // defpackage.od
    public final void xiZrDbcSW0(defpackage.wn1 wn1Var) {
        this.AARZUJiTa = true;
    }
}
