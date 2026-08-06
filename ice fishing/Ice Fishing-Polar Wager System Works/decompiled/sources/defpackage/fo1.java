package defpackage;

/* loaded from: classes.dex */
public abstract class fo1 extends defpackage.no1 {
    public static boolean DFo87pBq1E5 = false;
    public static java.lang.reflect.Field G3OKOH3wZRC;
    public static java.lang.reflect.Field QoRHpC4k;
    public static java.lang.reflect.Method SyNS6RMn;
    public static java.lang.Class cnag84Bm;
    public defpackage.i60 AARZUJiTa;
    public int EXtogiMhuM;
    public defpackage.i60[] F7NU4MC0GW;
    public android.graphics.Rect[][] JlrlGoKF;
    public int SH1y5HwkJhh;
    public defpackage.i60 adDC3e2L;
    public android.graphics.Rect[][] ez2rX8ReCYw;
    public final android.view.WindowInsets r1MBDhnF;
    public int riuEU0zW4;
    public defpackage.ro1 xiZrDbcSW0;

    public fo1(defpackage.ro1 ro1Var, android.view.WindowInsets windowInsets) {
        super(ro1Var);
        this.adDC3e2L = null;
        this.ez2rX8ReCYw = new android.graphics.Rect[10][];
        this.JlrlGoKF = new android.graphics.Rect[10][];
        this.r1MBDhnF = windowInsets;
    }

    private defpackage.i60 D2vUnMij(int i, boolean z) {
        defpackage.i60 i60Var = defpackage.i60.adDC3e2L;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                i60Var = defpackage.i60.IHQe1A4L2xu(i60Var, frpfPPIgqM9O(i2, z));
            }
        }
        return i60Var;
    }

    private defpackage.i60 SiPhmbmu() {
        defpackage.ro1 ro1Var = this.xiZrDbcSW0;
        return ro1Var != null ? ro1Var.IHQe1A4L2xu.ez2rX8ReCYw() : defpackage.i60.adDC3e2L;
    }

    private defpackage.fq UsuH8pd5P(android.view.View view) {
        android.view.Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point();
        display.getRealSize(point);
        if (this.IHQe1A4L2xu.IHQe1A4L2xu.EgCjBq0SZwJ()) {
            return defpackage.fq.IHQe1A4L2xu(point.x, point.y, true, 0, 0, 0, 0);
        }
        defpackage.y21 QQUzIjv3iOC5 = defpackage.w70.QQUzIjv3iOC5(display, 0);
        defpackage.y21 QQUzIjv3iOC52 = defpackage.w70.QQUzIjv3iOC5(display, 1);
        defpackage.y21 QQUzIjv3iOC53 = defpackage.w70.QQUzIjv3iOC5(display, 2);
        defpackage.y21 QQUzIjv3iOC54 = defpackage.w70.QQUzIjv3iOC5(display, 3);
        return defpackage.fq.IHQe1A4L2xu(point.x, point.y, false, QQUzIjv3iOC5 != null ? QQUzIjv3iOC5.oh6vYeIP : 0, QQUzIjv3iOC52 != null ? QQUzIjv3iOC52.oh6vYeIP : 0, QQUzIjv3iOC53 != null ? QQUzIjv3iOC53.oh6vYeIP : 0, QQUzIjv3iOC54 != null ? QQUzIjv3iOC54.oh6vYeIP : 0);
    }

    public static boolean mAr5m2L7gYDP(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private static java.util.List<android.graphics.Rect> nBH8hAHy(android.graphics.Rect[][] rectArr, int i) {
        android.graphics.Rect[] rectArr2;
        android.graphics.Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[defpackage.c80.fnWB2E7cs(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    android.graphics.Rect[] rectArr4 = new android.graphics.Rect[rectArr3.length + rectArr2.length];
                    java.lang.System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    java.lang.System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(rectArr3);
    }

    private defpackage.i60 p4kuH6PDtgom(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!DFo87pBq1E5) {
            wll2JLbTBC2();
        }
        java.lang.reflect.Method method = SyNS6RMn;
        if (method != null && cnag84Bm != null && QoRHpC4k != null) {
            try {
                java.lang.Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) QoRHpC4k.get(G3OKOH3wZRC.get(invoke));
                if (rect != null) {
                    return defpackage.i60.oh6vYeIP(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private android.graphics.Rect[] v5iciZok(defpackage.i60 i60Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = i60Var.IHQe1A4L2xu;
        int i2 = i60Var.F7NU4MC0GW;
        int i3 = i60Var.r1MBDhnF;
        int i4 = i60Var.oh6vYeIP;
        if (i != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, i60Var.IHQe1A4L2xu, this.riuEU0zW4));
        }
        if (i4 != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, this.SH1y5HwkJhh, i4));
        }
        if (i3 != 0) {
            int i5 = this.SH1y5HwkJhh;
            arrayList.add(new android.graphics.Rect(i5 - i3, 0, i5, this.riuEU0zW4));
        }
        if (i2 != 0) {
            int i6 = this.riuEU0zW4;
            arrayList.add(new android.graphics.Rect(0, i6 - i2, this.SH1y5HwkJhh, i6));
        }
        return (android.graphics.Rect[]) arrayList.toArray(new android.graphics.Rect[arrayList.size()]);
    }

    private static void wll2JLbTBC2() {
        try {
            SyNS6RMn = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            cnag84Bm = cls;
            QoRHpC4k = cls.getDeclaredField("mVisibleInsets");
            G3OKOH3wZRC = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            QoRHpC4k.setAccessible(true);
            G3OKOH3wZRC.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        DFo87pBq1E5 = true;
    }

    @Override // defpackage.no1
    public void C0U8sNJm(android.graphics.Rect[][] rectArr) {
        java.util.Objects.requireNonNull(rectArr);
        this.JlrlGoKF = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.no1
    public final defpackage.i60 DFo87pBq1E5() {
        if (this.adDC3e2L == null) {
            android.view.WindowInsets windowInsets = this.r1MBDhnF;
            this.adDC3e2L = defpackage.i60.oh6vYeIP(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.adDC3e2L;
    }

    @Override // defpackage.no1
    public defpackage.i60 EXtogiMhuM(int i) {
        return D2vUnMij(i, false);
    }

    @Override // defpackage.no1
    public boolean EgCjBq0SZwJ() {
        return this.r1MBDhnF.isRound();
    }

    @Override // defpackage.no1
    public void F7NU4MC0GW(android.view.View view) {
        this.SH1y5HwkJhh = view.getWidth();
        this.riuEU0zW4 = view.getHeight();
        defpackage.i60 p4kuH6PDtgom = p4kuH6PDtgom(view);
        if (p4kuH6PDtgom == null) {
            p4kuH6PDtgom = defpackage.i60.adDC3e2L;
        }
        XZx205DYe(p4kuH6PDtgom);
    }

    @Override // defpackage.no1
    public defpackage.ro1 G3OKOH3wZRC(int i, int i2, int i3, int i4) {
        defpackage.ro1 r1MBDhnF = defpackage.ro1.r1MBDhnF(this.r1MBDhnF, null);
        int i5 = android.os.Build.VERSION.SDK_INT;
        defpackage.eo1 do1Var = i5 >= 36 ? new defpackage.do1(r1MBDhnF) : i5 >= 35 ? new defpackage.co1(r1MBDhnF) : i5 >= 34 ? new defpackage.bo1(r1MBDhnF) : i5 >= 31 ? new defpackage.ao1(r1MBDhnF) : i5 >= 30 ? new defpackage.zn1(r1MBDhnF) : i5 >= 29 ? new defpackage.yn1(r1MBDhnF) : new defpackage.xn1(r1MBDhnF);
        do1Var.EXtogiMhuM(defpackage.ro1.IHQe1A4L2xu(DFo87pBq1E5(), i, i2, i3, i4));
        do1Var.xiZrDbcSW0(defpackage.ro1.IHQe1A4L2xu(ez2rX8ReCYw(), i, i2, i3, i4));
        return do1Var.oh6vYeIP();
    }

    @Override // defpackage.no1
    public void NHJTzaLwkd(int i) {
        this.EXtogiMhuM = i;
    }

    @Override // defpackage.no1
    public void PAEGRtP0bX(defpackage.ro1 ro1Var) {
        this.xiZrDbcSW0 = ro1Var;
    }

    @Override // defpackage.no1
    public void QQUzIjv3iOC5(android.graphics.Rect[][] rectArr) {
        java.util.Objects.requireNonNull(rectArr);
        this.ez2rX8ReCYw = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.no1
    public void QoRHpC4k() {
        for (int i = 1; i <= 512; i <<= 1) {
            int fnWB2E7cs = defpackage.c80.fnWB2E7cs(i);
            this.ez2rX8ReCYw[fnWB2E7cs] = v5iciZok(EXtogiMhuM(i));
            if (i != 8) {
                this.JlrlGoKF[fnWB2E7cs] = v5iciZok(riuEU0zW4(i));
            }
        }
    }

    @Override // defpackage.no1
    public void V7bD7b8KA(defpackage.i60[] i60VarArr) {
        this.F7NU4MC0GW = i60VarArr;
    }

    public void XZx205DYe(defpackage.i60 i60Var) {
        this.AARZUJiTa = i60Var;
    }

    @Override // defpackage.no1
    public java.util.List<android.graphics.Rect> adDC3e2L(int i) {
        return nBH8hAHy(this.ez2rX8ReCYw, i);
    }

    @Override // defpackage.no1
    public void cnag84Bm(android.view.View view) {
        UsuH8pd5P(view);
    }

    @Override // defpackage.no1
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        defpackage.fo1 fo1Var = (defpackage.fo1) obj;
        return java.util.Objects.equals(this.AARZUJiTa, fo1Var.AARZUJiTa) && mAr5m2L7gYDP(this.EXtogiMhuM, fo1Var.EXtogiMhuM);
    }

    @Override // defpackage.no1
    public boolean fnWB2E7cs(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !yIx6ChFVk(i2)) {
                return false;
            }
        }
        return true;
    }

    public defpackage.i60 frpfPPIgqM9O(int i, boolean z) {
        defpackage.i60 ez2rX8ReCYw;
        int i2;
        defpackage.i60 i60Var = defpackage.i60.adDC3e2L;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    defpackage.i60[] i60VarArr = this.F7NU4MC0GW;
                    ez2rX8ReCYw = i60VarArr != null ? i60VarArr[defpackage.c80.fnWB2E7cs(8)] : null;
                    if (ez2rX8ReCYw != null) {
                        return ez2rX8ReCYw;
                    }
                    defpackage.i60 DFo87pBq1E52 = DFo87pBq1E5();
                    defpackage.i60 SiPhmbmu = SiPhmbmu();
                    int i3 = DFo87pBq1E52.F7NU4MC0GW;
                    if (i3 > SiPhmbmu.F7NU4MC0GW) {
                        return defpackage.i60.oh6vYeIP(0, 0, 0, i3);
                    }
                    defpackage.i60 i60Var2 = this.AARZUJiTa;
                    if (i60Var2 != null && !i60Var2.equals(i60Var) && (i2 = this.AARZUJiTa.F7NU4MC0GW) > SiPhmbmu.F7NU4MC0GW) {
                        return defpackage.i60.oh6vYeIP(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return JlrlGoKF();
                    }
                    if (i == 32) {
                        return SH1y5HwkJhh();
                    }
                    if (i == 64) {
                        return SyNS6RMn();
                    }
                    if (i == 128) {
                        defpackage.ro1 ro1Var = this.xiZrDbcSW0;
                        defpackage.dq AARZUJiTa = ro1Var != null ? ro1Var.IHQe1A4L2xu.AARZUJiTa() : AARZUJiTa();
                        if (AARZUJiTa != null) {
                            int i4 = android.os.Build.VERSION.SDK_INT;
                            return defpackage.i60.oh6vYeIP(i4 >= 28 ? defpackage.cq.adDC3e2L(AARZUJiTa.IHQe1A4L2xu) : 0, i4 >= 28 ? defpackage.cq.AARZUJiTa(AARZUJiTa.IHQe1A4L2xu) : 0, i4 >= 28 ? defpackage.cq.xiZrDbcSW0(AARZUJiTa.IHQe1A4L2xu) : 0, i4 >= 28 ? defpackage.cq.F7NU4MC0GW(AARZUJiTa.IHQe1A4L2xu) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    defpackage.i60 SiPhmbmu2 = SiPhmbmu();
                    defpackage.i60 ez2rX8ReCYw2 = ez2rX8ReCYw();
                    return defpackage.i60.oh6vYeIP(java.lang.Math.max(SiPhmbmu2.IHQe1A4L2xu, ez2rX8ReCYw2.IHQe1A4L2xu), 0, java.lang.Math.max(SiPhmbmu2.r1MBDhnF, ez2rX8ReCYw2.r1MBDhnF), java.lang.Math.max(SiPhmbmu2.F7NU4MC0GW, ez2rX8ReCYw2.F7NU4MC0GW));
                }
                if ((this.EXtogiMhuM & 2) == 0) {
                    defpackage.i60 DFo87pBq1E53 = DFo87pBq1E5();
                    defpackage.ro1 ro1Var2 = this.xiZrDbcSW0;
                    ez2rX8ReCYw = ro1Var2 != null ? ro1Var2.IHQe1A4L2xu.ez2rX8ReCYw() : null;
                    int i5 = DFo87pBq1E53.F7NU4MC0GW;
                    if (ez2rX8ReCYw != null) {
                        i5 = java.lang.Math.min(i5, ez2rX8ReCYw.F7NU4MC0GW);
                    }
                    return defpackage.i60.oh6vYeIP(DFo87pBq1E53.IHQe1A4L2xu, 0, DFo87pBq1E53.r1MBDhnF, i5);
                }
            }
        } else {
            if (z) {
                return defpackage.i60.oh6vYeIP(0, java.lang.Math.max(SiPhmbmu().oh6vYeIP, DFo87pBq1E5().oh6vYeIP), 0, 0);
            }
            if ((this.EXtogiMhuM & 4) == 0) {
                return defpackage.i60.oh6vYeIP(0, DFo87pBq1E5().oh6vYeIP, 0, 0);
            }
        }
        return i60Var;
    }

    @Override // defpackage.no1
    public defpackage.i60 riuEU0zW4(int i) {
        return D2vUnMij(i, true);
    }

    @Override // defpackage.no1
    public java.util.List<android.graphics.Rect> xiZrDbcSW0(int i) {
        return nBH8hAHy(this.JlrlGoKF, i);
    }

    public boolean yIx6ChFVk(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !frpfPPIgqM9O(i, false).equals(defpackage.i60.adDC3e2L);
    }

    @Override // defpackage.no1
    public void kNAkVymC(defpackage.fq fqVar) {
    }
}
