package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class aw1 extends defpackage.jw1 {
    public static java.lang.Class T1fB7bDYiVJQ = null;
    public static java.lang.reflect.Field WmetiUbpKU9I = null;
    public static java.lang.reflect.Field XntWc4eZSQ8j = null;
    public static java.lang.reflect.Method gUjdnLbkVAaA = null;
    public static boolean h3m55N1URyyK = false;
    public int GE9mJIPrb8gP;
    public defpackage.v80[] JhCgjQRTAOCT;
    public android.graphics.Rect[][] Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public defpackage.v80 QiMR8OkAhezm;
    public defpackage.v80 WDYagTQQm9ns;
    public int e6mdH7fiFuta;
    public android.graphics.Rect[][] fNwYGHIYeJcR;
    public final android.view.WindowInsets fWTAfUmVKrZq;
    public defpackage.mw1 oh71FJcDz6S2;

    public aw1(defpackage.mw1 mw1Var, android.view.WindowInsets windowInsets) {
        super(mw1Var);
        this.WDYagTQQm9ns = null;
        this.Ns0WNyEWdPsk = new android.graphics.Rect[10][];
        this.fNwYGHIYeJcR = new android.graphics.Rect[10][];
        this.fWTAfUmVKrZq = windowInsets;
    }

    private static void BXaznwstz2U0() {
        try {
            gUjdnLbkVAaA = android.view.View.class.getDeclaredMethod("getViewRootImpl", null);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            T1fB7bDYiVJQ = cls;
            XntWc4eZSQ8j = cls.getDeclaredField("mVisibleInsets");
            WmetiUbpKU9I = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            XntWc4eZSQ8j.setAccessible(true);
            WmetiUbpKU9I.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e) {
            android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h3m55N1URyyK = true;
    }

    public static boolean GcLuU6pT9wO9(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private defpackage.v80 KrtOTfE6jiS2(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h3m55N1URyyK) {
            BXaznwstz2U0();
        }
        java.lang.reflect.Method method = gUjdnLbkVAaA;
        if (method != null && T1fB7bDYiVJQ != null && XntWc4eZSQ8j != null) {
            try {
                java.lang.Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) XntWc4eZSQ8j.get(WmetiUbpKU9I.get(invoke));
                if (rect != null) {
                    return defpackage.v80.giKS3J6vZuNy(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static java.util.List<android.graphics.Rect> UmgHb6n58gfG(android.graphics.Rect[][] rectArr, int i) {
        android.graphics.Rect[] rectArr2;
        android.graphics.Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[defpackage.q70.oCu53ZX2v4Ju(i2)]) != null) {
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

    private defpackage.xq blKFvluuDQOf(android.view.View view) {
        android.view.Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point();
        display.getRealSize(point);
        if (this.ZpBGe2uQfcn8.ZpBGe2uQfcn8.BHfvd2J71qpO()) {
            return defpackage.xq.ZpBGe2uQfcn8(point.x, point.y, true, 0, 0, 0, 0);
        }
        defpackage.o61 frSwwKIlbUhK = defpackage.h0.frSwwKIlbUhK(display, 0);
        defpackage.o61 frSwwKIlbUhK2 = defpackage.h0.frSwwKIlbUhK(display, 1);
        defpackage.o61 frSwwKIlbUhK3 = defpackage.h0.frSwwKIlbUhK(display, 2);
        defpackage.o61 frSwwKIlbUhK4 = defpackage.h0.frSwwKIlbUhK(display, 3);
        return defpackage.xq.ZpBGe2uQfcn8(point.x, point.y, false, frSwwKIlbUhK != null ? frSwwKIlbUhK.giKS3J6vZuNy : 0, frSwwKIlbUhK2 != null ? frSwwKIlbUhK2.giKS3J6vZuNy : 0, frSwwKIlbUhK3 != null ? frSwwKIlbUhK3.giKS3J6vZuNy : 0, frSwwKIlbUhK4 != null ? frSwwKIlbUhK4.giKS3J6vZuNy : 0);
    }

    private defpackage.v80 frSwwKIlbUhK() {
        defpackage.mw1 mw1Var = this.oh71FJcDz6S2;
        return mw1Var != null ? mw1Var.ZpBGe2uQfcn8.Ns0WNyEWdPsk() : defpackage.v80.WDYagTQQm9ns;
    }

    private defpackage.v80 jjTN4uUnoyEn(int i, boolean z) {
        defpackage.v80 v80Var = defpackage.v80.WDYagTQQm9ns;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                v80Var = defpackage.v80.ZpBGe2uQfcn8(v80Var, Mearx7yMn90V(i2, z));
            }
        }
        return v80Var;
    }

    private android.graphics.Rect[] qjMheFZ0l9kA(defpackage.v80 v80Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = v80Var.ZpBGe2uQfcn8;
        int i2 = v80Var.JhCgjQRTAOCT;
        int i3 = v80Var.fWTAfUmVKrZq;
        int i4 = v80Var.giKS3J6vZuNy;
        if (i != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, v80Var.ZpBGe2uQfcn8, this.e6mdH7fiFuta));
        }
        if (i4 != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, this.GE9mJIPrb8gP, i4));
        }
        if (i3 != 0) {
            int i5 = this.GE9mJIPrb8gP;
            arrayList.add(new android.graphics.Rect(i5 - i3, 0, i5, this.e6mdH7fiFuta));
        }
        if (i2 != 0) {
            int i6 = this.e6mdH7fiFuta;
            arrayList.add(new android.graphics.Rect(0, i6 - i2, this.GE9mJIPrb8gP, i6));
        }
        return (android.graphics.Rect[]) arrayList.toArray(new android.graphics.Rect[arrayList.size()]);
    }

    @Override // defpackage.jw1
    public boolean BHfvd2J71qpO() {
        return this.fWTAfUmVKrZq.isRound();
    }

    public boolean IBvW5fLsPuHy(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !Mearx7yMn90V(i, false).equals(defpackage.v80.WDYagTQQm9ns);
    }

    @Override // defpackage.jw1
    public void IJ0hOnjhPOri(defpackage.mw1 mw1Var) {
        this.oh71FJcDz6S2 = mw1Var;
    }

    @Override // defpackage.jw1
    public void JhCgjQRTAOCT(android.view.View view) {
        this.GE9mJIPrb8gP = view.getWidth();
        this.e6mdH7fiFuta = view.getHeight();
        defpackage.v80 KrtOTfE6jiS2 = KrtOTfE6jiS2(view);
        if (KrtOTfE6jiS2 == null) {
            KrtOTfE6jiS2 = defpackage.v80.WDYagTQQm9ns;
        }
        hH0RRJrNssvh(KrtOTfE6jiS2);
    }

    public defpackage.v80 Mearx7yMn90V(int i, boolean z) {
        defpackage.v80 Ns0WNyEWdPsk;
        int i2;
        defpackage.v80 v80Var = defpackage.v80.WDYagTQQm9ns;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    defpackage.v80[] v80VarArr = this.JhCgjQRTAOCT;
                    Ns0WNyEWdPsk = v80VarArr != null ? v80VarArr[defpackage.q70.oCu53ZX2v4Ju(8)] : null;
                    if (Ns0WNyEWdPsk != null) {
                        return Ns0WNyEWdPsk;
                    }
                    defpackage.v80 h3m55N1URyyK2 = h3m55N1URyyK();
                    defpackage.v80 frSwwKIlbUhK = frSwwKIlbUhK();
                    int i3 = h3m55N1URyyK2.JhCgjQRTAOCT;
                    if (i3 > frSwwKIlbUhK.JhCgjQRTAOCT) {
                        return defpackage.v80.giKS3J6vZuNy(0, 0, 0, i3);
                    }
                    defpackage.v80 v80Var2 = this.QiMR8OkAhezm;
                    if (v80Var2 != null && !v80Var2.equals(v80Var) && (i2 = this.QiMR8OkAhezm.JhCgjQRTAOCT) > frSwwKIlbUhK.JhCgjQRTAOCT) {
                        return defpackage.v80.giKS3J6vZuNy(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return fNwYGHIYeJcR();
                    }
                    if (i == 32) {
                        return GE9mJIPrb8gP();
                    }
                    if (i == 64) {
                        return gUjdnLbkVAaA();
                    }
                    if (i == 128) {
                        defpackage.mw1 mw1Var = this.oh71FJcDz6S2;
                        defpackage.vq QiMR8OkAhezm = mw1Var != null ? mw1Var.ZpBGe2uQfcn8.QiMR8OkAhezm() : QiMR8OkAhezm();
                        if (QiMR8OkAhezm != null) {
                            int i4 = android.os.Build.VERSION.SDK_INT;
                            return defpackage.v80.giKS3J6vZuNy(i4 >= 28 ? defpackage.uq.WDYagTQQm9ns(QiMR8OkAhezm.ZpBGe2uQfcn8) : 0, i4 >= 28 ? defpackage.uq.QiMR8OkAhezm(QiMR8OkAhezm.ZpBGe2uQfcn8) : 0, i4 >= 28 ? defpackage.uq.oh71FJcDz6S2(QiMR8OkAhezm.ZpBGe2uQfcn8) : 0, i4 >= 28 ? defpackage.uq.JhCgjQRTAOCT(QiMR8OkAhezm.ZpBGe2uQfcn8) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    defpackage.v80 frSwwKIlbUhK2 = frSwwKIlbUhK();
                    defpackage.v80 Ns0WNyEWdPsk2 = Ns0WNyEWdPsk();
                    return defpackage.v80.giKS3J6vZuNy(java.lang.Math.max(frSwwKIlbUhK2.ZpBGe2uQfcn8, Ns0WNyEWdPsk2.ZpBGe2uQfcn8), 0, java.lang.Math.max(frSwwKIlbUhK2.fWTAfUmVKrZq, Ns0WNyEWdPsk2.fWTAfUmVKrZq), java.lang.Math.max(frSwwKIlbUhK2.JhCgjQRTAOCT, Ns0WNyEWdPsk2.JhCgjQRTAOCT));
                }
                if ((this.P05cfTpS5W5L & 2) == 0) {
                    defpackage.v80 h3m55N1URyyK3 = h3m55N1URyyK();
                    defpackage.mw1 mw1Var2 = this.oh71FJcDz6S2;
                    Ns0WNyEWdPsk = mw1Var2 != null ? mw1Var2.ZpBGe2uQfcn8.Ns0WNyEWdPsk() : null;
                    int i5 = h3m55N1URyyK3.JhCgjQRTAOCT;
                    if (Ns0WNyEWdPsk != null) {
                        i5 = java.lang.Math.min(i5, Ns0WNyEWdPsk.JhCgjQRTAOCT);
                    }
                    return defpackage.v80.giKS3J6vZuNy(h3m55N1URyyK3.ZpBGe2uQfcn8, 0, h3m55N1URyyK3.fWTAfUmVKrZq, i5);
                }
            }
        } else {
            if (z) {
                return defpackage.v80.giKS3J6vZuNy(0, java.lang.Math.max(frSwwKIlbUhK().giKS3J6vZuNy, h3m55N1URyyK().giKS3J6vZuNy), 0, 0);
            }
            if ((this.P05cfTpS5W5L & 4) == 0) {
                return defpackage.v80.giKS3J6vZuNy(0, h3m55N1URyyK().giKS3J6vZuNy, 0, 0);
            }
        }
        return v80Var;
    }

    @Override // defpackage.jw1
    public void OcTWLQzke1i2(android.graphics.Rect[][] rectArr) {
        java.util.Objects.requireNonNull(rectArr);
        this.fNwYGHIYeJcR = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.jw1
    public defpackage.v80 P05cfTpS5W5L(int i) {
        return jjTN4uUnoyEn(i, false);
    }

    @Override // defpackage.jw1
    public void T1fB7bDYiVJQ(android.view.View view) {
        blKFvluuDQOf(view);
    }

    @Override // defpackage.jw1
    public java.util.List<android.graphics.Rect> WDYagTQQm9ns(int i) {
        return UmgHb6n58gfG(this.Ns0WNyEWdPsk, i);
    }

    @Override // defpackage.jw1
    public defpackage.mw1 WmetiUbpKU9I(int i, int i2, int i3, int i4) {
        defpackage.mw1 fWTAfUmVKrZq = defpackage.mw1.fWTAfUmVKrZq(this.fWTAfUmVKrZq, null);
        int i5 = android.os.Build.VERSION.SDK_INT;
        defpackage.zv1 yv1Var = i5 >= 36 ? new defpackage.yv1(fWTAfUmVKrZq) : i5 >= 35 ? new defpackage.xv1(fWTAfUmVKrZq) : i5 >= 34 ? new defpackage.wv1(fWTAfUmVKrZq) : i5 >= 31 ? new defpackage.vv1(fWTAfUmVKrZq) : i5 >= 30 ? new defpackage.uv1(fWTAfUmVKrZq) : i5 >= 29 ? new defpackage.tv1(fWTAfUmVKrZq) : new defpackage.rv1(fWTAfUmVKrZq);
        yv1Var.P05cfTpS5W5L(defpackage.mw1.ZpBGe2uQfcn8(h3m55N1URyyK(), i, i2, i3, i4));
        yv1Var.oh71FJcDz6S2(defpackage.mw1.ZpBGe2uQfcn8(Ns0WNyEWdPsk(), i, i2, i3, i4));
        return yv1Var.giKS3J6vZuNy();
    }

    @Override // defpackage.jw1
    public void XntWc4eZSQ8j() {
        for (int i = 1; i <= 512; i <<= 1) {
            int oCu53ZX2v4Ju = defpackage.q70.oCu53ZX2v4Ju(i);
            this.Ns0WNyEWdPsk[oCu53ZX2v4Ju] = qjMheFZ0l9kA(P05cfTpS5W5L(i));
            if (i != 8) {
                this.fNwYGHIYeJcR[oCu53ZX2v4Ju] = qjMheFZ0l9kA(e6mdH7fiFuta(i));
            }
        }
    }

    @Override // defpackage.jw1
    public boolean ZVVdXbWmyCSK(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !IBvW5fLsPuHy(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jw1
    public void dG7RjM6DqYVL(android.graphics.Rect[][] rectArr) {
        java.util.Objects.requireNonNull(rectArr);
        this.Ns0WNyEWdPsk = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.jw1
    public defpackage.v80 e6mdH7fiFuta(int i) {
        return jjTN4uUnoyEn(i, true);
    }

    @Override // defpackage.jw1
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        defpackage.aw1 aw1Var = (defpackage.aw1) obj;
        return java.util.Objects.equals(this.QiMR8OkAhezm, aw1Var.QiMR8OkAhezm) && GcLuU6pT9wO9(this.P05cfTpS5W5L, aw1Var.P05cfTpS5W5L);
    }

    @Override // defpackage.jw1
    public final defpackage.v80 h3m55N1URyyK() {
        if (this.WDYagTQQm9ns == null) {
            android.view.WindowInsets windowInsets = this.fWTAfUmVKrZq;
            this.WDYagTQQm9ns = defpackage.v80.giKS3J6vZuNy(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.WDYagTQQm9ns;
    }

    public void hH0RRJrNssvh(defpackage.v80 v80Var) {
        this.QiMR8OkAhezm = v80Var;
    }

    @Override // defpackage.jw1
    public void maCixPsq4ml2(defpackage.v80[] v80VarArr) {
        this.JhCgjQRTAOCT = v80VarArr;
    }

    @Override // defpackage.jw1
    public void oCu53ZX2v4Ju(int i) {
        this.P05cfTpS5W5L = i;
    }

    @Override // defpackage.jw1
    public java.util.List<android.graphics.Rect> oh71FJcDz6S2(int i) {
        return UmgHb6n58gfG(this.fNwYGHIYeJcR, i);
    }

    @Override // defpackage.jw1
    public void w7APNrr0aGRc(defpackage.xq xqVar) {
    }
}
