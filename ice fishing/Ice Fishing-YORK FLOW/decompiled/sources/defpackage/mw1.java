package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mw1 {
    public static final defpackage.mw1 giKS3J6vZuNy;
    public final defpackage.jw1 ZpBGe2uQfcn8;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 34) {
            giKS3J6vZuNy = defpackage.hw1.IJ0hOnjhPOri;
        } else if (i >= 30) {
            giKS3J6vZuNy = defpackage.fw1.maCixPsq4ml2;
        } else {
            giKS3J6vZuNy = defpackage.jw1.giKS3J6vZuNy;
        }
    }

    public mw1(android.view.WindowInsets windowInsets) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.ZpBGe2uQfcn8 = new defpackage.iw1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.ZpBGe2uQfcn8 = new defpackage.hw1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.ZpBGe2uQfcn8 = new defpackage.gw1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.ZpBGe2uQfcn8 = new defpackage.fw1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.ZpBGe2uQfcn8 = new defpackage.dw1(this, windowInsets);
        } else if (i >= 28) {
            this.ZpBGe2uQfcn8 = new defpackage.cw1(this, windowInsets);
        } else {
            this.ZpBGe2uQfcn8 = new defpackage.bw1(this, windowInsets);
        }
    }

    public static defpackage.v80 ZpBGe2uQfcn8(defpackage.v80 v80Var, int i, int i2, int i3, int i4) {
        int max = java.lang.Math.max(0, v80Var.ZpBGe2uQfcn8 - i);
        int max2 = java.lang.Math.max(0, v80Var.giKS3J6vZuNy - i2);
        int max3 = java.lang.Math.max(0, v80Var.fWTAfUmVKrZq - i3);
        int max4 = java.lang.Math.max(0, v80Var.JhCgjQRTAOCT - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? v80Var : defpackage.v80.giKS3J6vZuNy(max, max2, max3, max4);
    }

    public static defpackage.mw1 fWTAfUmVKrZq(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        defpackage.mw1 mw1Var = new defpackage.mw1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = defpackage.zt1.ZpBGe2uQfcn8;
            defpackage.mw1 ZpBGe2uQfcn8 = defpackage.vt1.ZpBGe2uQfcn8(view);
            defpackage.jw1 jw1Var = mw1Var.ZpBGe2uQfcn8;
            jw1Var.IJ0hOnjhPOri(ZpBGe2uQfcn8);
            android.view.View rootView = view.getRootView();
            jw1Var.JhCgjQRTAOCT(rootView);
            jw1Var.T1fB7bDYiVJQ(rootView);
            jw1Var.XntWc4eZSQ8j();
            jw1Var.oCu53ZX2v4Ju(view.getWindowSystemUiVisibility());
        }
        return mw1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mw1) {
            return java.util.Objects.equals(this.ZpBGe2uQfcn8, ((defpackage.mw1) obj).ZpBGe2uQfcn8);
        }
        return false;
    }

    public final android.view.WindowInsets giKS3J6vZuNy() {
        defpackage.jw1 jw1Var = this.ZpBGe2uQfcn8;
        if (jw1Var instanceof defpackage.aw1) {
            return ((defpackage.aw1) jw1Var).fWTAfUmVKrZq;
        }
        return null;
    }

    public final int hashCode() {
        defpackage.jw1 jw1Var = this.ZpBGe2uQfcn8;
        if (jw1Var == null) {
            return 0;
        }
        return jw1Var.hashCode();
    }

    public mw1() {
        this.ZpBGe2uQfcn8 = new defpackage.jw1(this);
    }
}
