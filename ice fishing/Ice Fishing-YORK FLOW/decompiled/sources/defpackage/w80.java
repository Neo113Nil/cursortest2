package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w80 extends defpackage.hv1 implements java.lang.Runnable, defpackage.ct0, android.view.View.OnAttachStateChangeListener {
    public final defpackage.yn0 GE9mJIPrb8gP;
    public final defpackage.mw0 Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public defpackage.mw1 e6mdH7fiFuta;
    public final defpackage.sn0 fNwYGHIYeJcR;
    public final defpackage.ff1 h3m55N1URyyK;

    public w80() {
        super(1);
        defpackage.yn0 yn0Var = new defpackage.yn0(9);
        defpackage.tw1.ZpBGe2uQfcn8.getClass();
        yn0Var.h3m55N1URyyK(defpackage.sw1.giKS3J6vZuNy, new defpackage.kx1("caption bar"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.fWTAfUmVKrZq, new defpackage.kx1("display cutout"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.JhCgjQRTAOCT, new defpackage.kx1("ime"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.WDYagTQQm9ns, new defpackage.kx1("mandatory system gestures"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.oh71FJcDz6S2, new defpackage.kx1("navigation bars"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.QiMR8OkAhezm, new defpackage.kx1("status bars"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.P05cfTpS5W5L, new defpackage.kx1("system gestures"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.e6mdH7fiFuta, new defpackage.kx1("tappable element"));
        yn0Var.h3m55N1URyyK(defpackage.sw1.GE9mJIPrb8gP, new defpackage.kx1("waterfall"));
        this.GE9mJIPrb8gP = yn0Var;
        this.Ns0WNyEWdPsk = new defpackage.mw0(0);
        this.fNwYGHIYeJcR = new defpackage.sn0(4);
        this.h3m55N1URyyK = new defpackage.ff1();
    }

    @Override // defpackage.hv1
    public final defpackage.mw1 JhCgjQRTAOCT(defpackage.mw1 mw1Var, java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.qv1 qv1Var = (defpackage.qv1) list.get(i);
            defpackage.tw1 tw1Var = (defpackage.tw1) defpackage.vw1.ZpBGe2uQfcn8.giKS3J6vZuNy(qv1Var.ZpBGe2uQfcn8.JhCgjQRTAOCT());
            if (tw1Var != null) {
                java.lang.Object QiMR8OkAhezm = this.GE9mJIPrb8gP.QiMR8OkAhezm(tw1Var);
                QiMR8OkAhezm.getClass();
                defpackage.kx1 kx1Var = (defpackage.kx1) QiMR8OkAhezm;
                if (((java.lang.Boolean) kx1Var.giKS3J6vZuNy.getValue()).booleanValue()) {
                    defpackage.pv1 pv1Var = qv1Var.ZpBGe2uQfcn8;
                    kx1Var.fWTAfUmVKrZq.e6mdH7fiFuta(pv1Var.fWTAfUmVKrZq());
                    kx1Var.WDYagTQQm9ns.e6mdH7fiFuta(pv1Var.ZpBGe2uQfcn8());
                    kx1Var.JhCgjQRTAOCT.e6mdH7fiFuta(pv1Var.giKS3J6vZuNy());
                }
            }
        }
        oh71FJcDz6S2(mw1Var);
        return mw1Var;
    }

    @Override // defpackage.hv1
    public final defpackage.pd1 WDYagTQQm9ns(defpackage.qv1 qv1Var, defpackage.pd1 pd1Var) {
        defpackage.mw1 mw1Var = this.e6mdH7fiFuta;
        boolean z = false;
        this.QiMR8OkAhezm = false;
        this.e6mdH7fiFuta = null;
        if (qv1Var.ZpBGe2uQfcn8.giKS3J6vZuNy() > 0 && mw1Var != null) {
            int JhCgjQRTAOCT = qv1Var.ZpBGe2uQfcn8.JhCgjQRTAOCT();
            this.P05cfTpS5W5L |= JhCgjQRTAOCT;
            defpackage.tw1 tw1Var = (defpackage.tw1) defpackage.vw1.ZpBGe2uQfcn8.giKS3J6vZuNy(JhCgjQRTAOCT);
            if (tw1Var != null) {
                java.lang.Object QiMR8OkAhezm = this.GE9mJIPrb8gP.QiMR8OkAhezm(tw1Var);
                QiMR8OkAhezm.getClass();
                defpackage.kx1 kx1Var = (defpackage.kx1) QiMR8OkAhezm;
                defpackage.v80 P05cfTpS5W5L = mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(JhCgjQRTAOCT);
                long j = (P05cfTpS5W5L.ZpBGe2uQfcn8 << 48) | (P05cfTpS5W5L.giKS3J6vZuNy << 32) | (P05cfTpS5W5L.fWTAfUmVKrZq << 16) | P05cfTpS5W5L.JhCgjQRTAOCT;
                long j2 = kx1Var.P05cfTpS5W5L;
                if (!defpackage.w60.BHfvd2J71qpO(j, j2)) {
                    kx1Var.GE9mJIPrb8gP = j2;
                    kx1Var.Ns0WNyEWdPsk = j;
                    kx1Var.giKS3J6vZuNy.setValue(java.lang.Boolean.TRUE);
                    defpackage.pv1 pv1Var = qv1Var.ZpBGe2uQfcn8;
                    kx1Var.fWTAfUmVKrZq.e6mdH7fiFuta(pv1Var.fWTAfUmVKrZq());
                    kx1Var.WDYagTQQm9ns.e6mdH7fiFuta(pv1Var.ZpBGe2uQfcn8());
                    kx1Var.JhCgjQRTAOCT.e6mdH7fiFuta(pv1Var.giKS3J6vZuNy());
                    defpackage.mw0 mw0Var = this.Ns0WNyEWdPsk;
                    mw0Var.e6mdH7fiFuta(mw0Var.P05cfTpS5W5L() + 1);
                    synchronized (defpackage.te1.fWTAfUmVKrZq) {
                        defpackage.zn0 zn0Var = defpackage.te1.GE9mJIPrb8gP.P05cfTpS5W5L;
                        if (zn0Var != null) {
                            if (zn0Var.P05cfTpS5W5L()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        defpackage.te1.ZpBGe2uQfcn8();
                        return pd1Var;
                    }
                }
            }
        }
        return pd1Var;
    }

    @Override // defpackage.ct0
    public final defpackage.mw1 ZpBGe2uQfcn8(android.view.View view, defpackage.mw1 mw1Var) {
        if (this.QiMR8OkAhezm) {
            this.e6mdH7fiFuta = mw1Var;
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return mw1Var;
            }
        } else if (this.P05cfTpS5W5L == 0) {
            oh71FJcDz6S2(mw1Var);
        }
        return mw1Var;
    }

    @Override // defpackage.hv1
    public final void fWTAfUmVKrZq(defpackage.qv1 qv1Var) {
        this.QiMR8OkAhezm = true;
    }

    @Override // defpackage.hv1
    public final void giKS3J6vZuNy(defpackage.qv1 qv1Var) {
        boolean z = false;
        this.QiMR8OkAhezm = false;
        int JhCgjQRTAOCT = qv1Var.ZpBGe2uQfcn8.JhCgjQRTAOCT();
        this.P05cfTpS5W5L &= ~JhCgjQRTAOCT;
        this.e6mdH7fiFuta = null;
        defpackage.tw1 tw1Var = (defpackage.tw1) defpackage.vw1.ZpBGe2uQfcn8.giKS3J6vZuNy(JhCgjQRTAOCT);
        if (tw1Var != null) {
            java.lang.Object QiMR8OkAhezm = this.GE9mJIPrb8gP.QiMR8OkAhezm(tw1Var);
            QiMR8OkAhezm.getClass();
            defpackage.kx1 kx1Var = (defpackage.kx1) QiMR8OkAhezm;
            kx1Var.fWTAfUmVKrZq.e6mdH7fiFuta(0.0f);
            kx1Var.WDYagTQQm9ns.e6mdH7fiFuta(1.0f);
            kx1Var.JhCgjQRTAOCT.e6mdH7fiFuta(0L);
            kx1Var.fWTAfUmVKrZq.e6mdH7fiFuta(0.0f);
            kx1Var.giKS3J6vZuNy.setValue(java.lang.Boolean.FALSE);
            kx1Var.GE9mJIPrb8gP = -1L;
            kx1Var.Ns0WNyEWdPsk = -1L;
            defpackage.mw0 mw0Var = this.Ns0WNyEWdPsk;
            mw0Var.e6mdH7fiFuta(mw0Var.P05cfTpS5W5L() + 1);
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                defpackage.zn0 zn0Var = defpackage.te1.GE9mJIPrb8gP.P05cfTpS5W5L;
                if (zn0Var != null) {
                    if (zn0Var.P05cfTpS5W5L()) {
                        z = true;
                    }
                }
            }
            if (z) {
                defpackage.te1.ZpBGe2uQfcn8();
            }
        }
    }

    public final void oh71FJcDz6S2(defpackage.mw1 mw1Var) {
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
        defpackage.gn0 gn0Var = defpackage.vw1.ZpBGe2uQfcn8;
        int[] iArr3 = gn0Var.giKS3J6vZuNy;
        java.lang.Object[] objArr3 = gn0Var.fWTAfUmVKrZq;
        long[] jArr3 = gn0Var.ZpBGe2uQfcn8;
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
                            defpackage.tw1 tw1Var = (defpackage.tw1) objArr3[i6];
                            defpackage.v80 P05cfTpS5W5L = mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (P05cfTpS5W5L.ZpBGe2uQfcn8 << 48) | (P05cfTpS5W5L.giKS3J6vZuNy << 32) | (P05cfTpS5W5L.fWTAfUmVKrZq << 16) | P05cfTpS5W5L.JhCgjQRTAOCT;
                            java.lang.Object QiMR8OkAhezm = this.GE9mJIPrb8gP.QiMR8OkAhezm(tw1Var);
                            QiMR8OkAhezm.getClass();
                            defpackage.kx1 kx1Var = (defpackage.kx1) QiMR8OkAhezm;
                            j2 = j3;
                            if (!defpackage.w60.BHfvd2J71qpO(j4, kx1Var.P05cfTpS5W5L)) {
                                kx1Var.P05cfTpS5W5L = j4;
                                z2 = true;
                                if (!defpackage.w60.BHfvd2J71qpO(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                defpackage.v80 e6mdH7fiFuta = mw1Var.ZpBGe2uQfcn8.e6mdH7fiFuta(i7);
                                objArr2 = objArr3;
                                long j5 = (e6mdH7fiFuta.giKS3J6vZuNy << 32) | (e6mdH7fiFuta.ZpBGe2uQfcn8 << 48) | (e6mdH7fiFuta.fWTAfUmVKrZq << 16) | e6mdH7fiFuta.JhCgjQRTAOCT;
                                if (!defpackage.w60.BHfvd2J71qpO(kx1Var.e6mdH7fiFuta, j5)) {
                                    kx1Var.e6mdH7fiFuta = j5;
                                    z2 = true;
                                    if (!defpackage.w60.BHfvd2J71qpO(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            kx1Var.ZpBGe2uQfcn8.setValue(java.lang.Boolean.valueOf(mw1Var.ZpBGe2uQfcn8.ZVVdXbWmyCSK(i7)));
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
        defpackage.vq QiMR8OkAhezm2 = mw1Var.ZpBGe2uQfcn8.QiMR8OkAhezm();
        if (QiMR8OkAhezm2 == null) {
            j = 0;
        } else {
            defpackage.v80 ZpBGe2uQfcn8 = QiMR8OkAhezm2.ZpBGe2uQfcn8();
            j = (ZpBGe2uQfcn8.ZpBGe2uQfcn8 << c3) | (ZpBGe2uQfcn8.giKS3J6vZuNy << c2) | (ZpBGe2uQfcn8.fWTAfUmVKrZq << c) | ZpBGe2uQfcn8.JhCgjQRTAOCT;
        }
        defpackage.yn0 yn0Var = this.GE9mJIPrb8gP;
        defpackage.tw1.ZpBGe2uQfcn8.getClass();
        java.lang.Object QiMR8OkAhezm3 = yn0Var.QiMR8OkAhezm(defpackage.sw1.GE9mJIPrb8gP);
        QiMR8OkAhezm3.getClass();
        defpackage.kx1 kx1Var2 = (defpackage.kx1) QiMR8OkAhezm3;
        kx1Var2.ZpBGe2uQfcn8.setValue(java.lang.Boolean.valueOf(!defpackage.w60.BHfvd2J71qpO(j, 0L)));
        if (!defpackage.w60.BHfvd2J71qpO(kx1Var2.P05cfTpS5W5L, j)) {
            kx1Var2.P05cfTpS5W5L = j;
            kx1Var2.e6mdH7fiFuta = j;
            z2 = z;
            if (!defpackage.w60.BHfvd2J71qpO(j, 0L)) {
                z3 = z2;
            }
        }
        if (QiMR8OkAhezm2 == null) {
            defpackage.sn0 sn0Var = this.fNwYGHIYeJcR;
            if (sn0Var.giKS3J6vZuNy > 0) {
                sn0Var.JhCgjQRTAOCT();
                this.h3m55N1URyyK.clear();
                z2 = z;
            }
        } else {
            java.util.List giKS3J6vZuNy = android.os.Build.VERSION.SDK_INT >= 28 ? defpackage.uq.giKS3J6vZuNy(QiMR8OkAhezm2.ZpBGe2uQfcn8) : java.util.Collections.EMPTY_LIST;
            int size = giKS3J6vZuNy.size();
            defpackage.sn0 sn0Var2 = this.fNwYGHIYeJcR;
            if (size < sn0Var2.giKS3J6vZuNy) {
                sn0Var2.fNwYGHIYeJcR(giKS3J6vZuNy.size(), this.fNwYGHIYeJcR.giKS3J6vZuNy);
                this.h3m55N1URyyK.fWTAfUmVKrZq(giKS3J6vZuNy.size(), this.h3m55N1URyyK.size());
                z2 = z;
            } else {
                int size2 = giKS3J6vZuNy.size() - this.fNwYGHIYeJcR.giKS3J6vZuNy;
                int i8 = 0;
                while (i8 < size2) {
                    defpackage.sn0 sn0Var3 = this.fNwYGHIYeJcR;
                    sn0Var3.ZpBGe2uQfcn8(defpackage.w60.hH0RRJrNssvh(giKS3J6vZuNy.get(sn0Var3.giKS3J6vZuNy)));
                    this.h3m55N1URyyK.add(new defpackage.m80("display cutout rect " + this.fNwYGHIYeJcR.giKS3J6vZuNy));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = giKS3J6vZuNy.size();
            for (int i9 = 0; i9 < size3; i9++) {
                android.graphics.Rect rect = (android.graphics.Rect) giKS3J6vZuNy.get(i9);
                defpackage.fo0 fo0Var = (defpackage.fo0) this.fNwYGHIYeJcR.oh71FJcDz6S2(i9);
                if (!defpackage.ma0.QiMR8OkAhezm(fo0Var.getValue(), rect)) {
                    fo0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!giKS3J6vZuNy.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.Ns0WNyEWdPsk.P05cfTpS5W5L() != 0) && z2) {
            defpackage.mw0 mw0Var = this.Ns0WNyEWdPsk;
            mw0Var.e6mdH7fiFuta(mw0Var.P05cfTpS5W5L() + 1);
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                defpackage.zn0 zn0Var = defpackage.te1.GE9mJIPrb8gP.P05cfTpS5W5L;
                if (zn0Var != null) {
                    boolean z5 = z;
                    z4 = zn0Var.P05cfTpS5W5L() == z5 ? z5 : false;
                }
            }
            if (z4) {
                defpackage.te1.ZpBGe2uQfcn8();
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
        int i = defpackage.zt1.ZpBGe2uQfcn8;
        defpackage.ut1.giKS3J6vZuNy(view, this);
        defpackage.zt1.ZpBGe2uQfcn8(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = defpackage.zt1.ZpBGe2uQfcn8;
        defpackage.ut1.giKS3J6vZuNy(view, null);
        defpackage.zt1.ZpBGe2uQfcn8(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.QiMR8OkAhezm) {
            this.P05cfTpS5W5L = 0;
            this.QiMR8OkAhezm = false;
            defpackage.mw1 mw1Var = this.e6mdH7fiFuta;
            if (mw1Var != null) {
                oh71FJcDz6S2(mw1Var);
                this.e6mdH7fiFuta = null;
            }
        }
    }
}
