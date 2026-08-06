package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class k40 implements defpackage.d40 {
    public static final defpackage.j40 VFeft99leXEK = new defpackage.j40();
    public float BHfvd2J71qpO;
    public long GE9mJIPrb8gP;
    public float IJ0hOnjhPOri;
    public final defpackage.gu1 JhCgjQRTAOCT;
    public boolean Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public android.graphics.Paint QiMR8OkAhezm;
    public int T1fB7bDYiVJQ;
    public final android.content.res.Resources WDYagTQQm9ns;
    public boolean WmetiUbpKU9I;
    public float XntWc4eZSQ8j;
    public float ZVVdXbWmyCSK;
    public int e6mdH7fiFuta;
    public boolean fNwYGHIYeJcR;
    public final defpackage.md fWTAfUmVKrZq;
    public int gUjdnLbkVAaA;
    public final defpackage.zs giKS3J6vZuNy;
    public boolean h3m55N1URyyK;
    public long maCixPsq4ml2;
    public final android.graphics.Rect oh71FJcDz6S2;
    public float s0TASMVLSWD5;
    public long w7APNrr0aGRc;

    public k40(defpackage.zs zsVar) {
        defpackage.md mdVar = new defpackage.md();
        defpackage.ld ldVar = new defpackage.ld();
        this.giKS3J6vZuNy = zsVar;
        this.fWTAfUmVKrZq = mdVar;
        defpackage.gu1 gu1Var = new defpackage.gu1(zsVar, mdVar, ldVar);
        this.JhCgjQRTAOCT = gu1Var;
        this.WDYagTQQm9ns = zsVar.getResources();
        this.oh71FJcDz6S2 = new android.graphics.Rect();
        zsVar.addView(gu1Var);
        gu1Var.setClipBounds(null);
        this.GE9mJIPrb8gP = 0L;
        android.view.View.generateViewId();
        this.gUjdnLbkVAaA = 3;
        this.T1fB7bDYiVJQ = 0;
        this.XntWc4eZSQ8j = 1.0f;
        this.s0TASMVLSWD5 = 1.0f;
        this.BHfvd2J71qpO = 1.0f;
        long j = defpackage.pf.giKS3J6vZuNy;
        this.w7APNrr0aGRc = j;
        this.maCixPsq4ml2 = j;
    }

    @Override // defpackage.d40
    public final void BHfvd2J71qpO() {
        this.JhCgjQRTAOCT.setTranslationX(0.0f);
    }

    @Override // defpackage.d40
    public final float BXaznwstz2U0() {
        return this.IJ0hOnjhPOri;
    }

    @Override // defpackage.d40
    public final long GE9mJIPrb8gP() {
        return this.maCixPsq4ml2;
    }

    @Override // defpackage.d40
    public final void GcLuU6pT9wO9(long j) {
        long j2 = 9223372034707292159L & j;
        defpackage.gu1 gu1Var = this.JhCgjQRTAOCT;
        if (j2 != 9205357640488583168L) {
            this.WmetiUbpKU9I = false;
            gu1Var.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            gu1Var.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                gu1Var.resetPivot();
                return;
            }
            this.WmetiUbpKU9I = true;
            gu1Var.setPivotX(((int) (this.GE9mJIPrb8gP >> 32)) / 2.0f);
            gu1Var.setPivotY(((int) (this.GE9mJIPrb8gP & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.d40
    public final float IBvW5fLsPuHy() {
        return this.BHfvd2J71qpO;
    }

    @Override // defpackage.d40
    public final float IJ0hOnjhPOri() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final float JhCgjQRTAOCT() {
        return this.s0TASMVLSWD5;
    }

    @Override // defpackage.d40
    public final void Mearx7yMn90V(float f) {
        this.JhCgjQRTAOCT.setCameraDistance(f * this.WDYagTQQm9ns.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.d40
    public final void Ns0WNyEWdPsk(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.w7APNrr0aGRc = j;
            this.JhCgjQRTAOCT.setOutlineAmbientShadowColor(defpackage.ok0.PS16moFv2oLu(j));
        }
    }

    @Override // defpackage.d40
    public final void OcTWLQzke1i2(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.maCixPsq4ml2 = j;
            this.JhCgjQRTAOCT.setOutlineSpotShadowColor(defpackage.ok0.PS16moFv2oLu(j));
        }
    }

    @Override // defpackage.d40
    public final void P05cfTpS5W5L(float f) {
        this.IJ0hOnjhPOri = f;
        this.JhCgjQRTAOCT.setRotation(f);
    }

    @Override // defpackage.d40
    public final void QiMR8OkAhezm() {
        this.JhCgjQRTAOCT.setTranslationY(0.0f);
    }

    @Override // defpackage.d40
    public final void T1fB7bDYiVJQ(int i) {
        this.gUjdnLbkVAaA = i;
        android.graphics.Paint paint = this.QiMR8OkAhezm;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.QiMR8OkAhezm = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.h0.Rl68HURFBtL3(i)));
        zJPqDeoF0Os1();
    }

    @Override // defpackage.d40
    public final android.graphics.Matrix UmgHb6n58gfG() {
        return this.JhCgjQRTAOCT.getMatrix();
    }

    @Override // defpackage.d40
    public final void VFeft99leXEK(defpackage.hp hpVar, defpackage.sc0 sc0Var, defpackage.b40 b40Var, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX) {
        defpackage.gu1 gu1Var = this.JhCgjQRTAOCT;
        android.view.ViewParent parent = gu1Var.getParent();
        defpackage.zs zsVar = this.giKS3J6vZuNy;
        if (parent == null) {
            zsVar.addView(gu1Var);
        }
        gu1Var.Ns0WNyEWdPsk = hpVar;
        gu1Var.fNwYGHIYeJcR = sc0Var;
        gu1Var.h3m55N1URyyK = yjS0G3zEDWNX;
        gu1Var.gUjdnLbkVAaA = b40Var;
        if (gu1Var.isAttachedToWindow()) {
            gu1Var.setVisibility(4);
            gu1Var.setVisibility(0);
            try {
                defpackage.md mdVar = this.fWTAfUmVKrZq;
                defpackage.j40 j40Var = VFeft99leXEK;
                defpackage.DR1ov5IJDbR8 dR1ov5IJDbR8 = mdVar.ZpBGe2uQfcn8;
                android.graphics.Canvas canvas = dR1ov5IJDbR8.ZpBGe2uQfcn8;
                dR1ov5IJDbR8.ZpBGe2uQfcn8 = j40Var;
                zsVar.ZpBGe2uQfcn8(dR1ov5IJDbR8, gu1Var, gu1Var.getDrawingTime());
                mdVar.ZpBGe2uQfcn8.ZpBGe2uQfcn8 = canvas;
            } catch (java.lang.ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.d40
    public final void WDYagTQQm9ns(float f) {
        this.ZVVdXbWmyCSK = f;
        this.JhCgjQRTAOCT.setElevation(f);
    }

    @Override // defpackage.d40
    public final void WmetiUbpKU9I() {
        this.giKS3J6vZuNy.removeViewInLayout(this.JhCgjQRTAOCT);
    }

    @Override // defpackage.d40
    public final float XntWc4eZSQ8j() {
        return this.JhCgjQRTAOCT.getCameraDistance() / this.WDYagTQQm9ns.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.d40
    public final void ZVVdXbWmyCSK(defpackage.id idVar) {
        android.graphics.Rect rect;
        boolean z = this.Ns0WNyEWdPsk;
        defpackage.gu1 gu1Var = this.JhCgjQRTAOCT;
        if (z) {
            if ((this.h3m55N1URyyK || gu1Var.getClipToOutline()) && !this.fNwYGHIYeJcR) {
                rect = this.oh71FJcDz6S2;
                rect.left = 0;
                rect.top = 0;
                rect.right = gu1Var.getWidth();
                rect.bottom = gu1Var.getHeight();
            } else {
                rect = null;
            }
            gu1Var.setClipBounds(rect);
        }
        android.graphics.Canvas canvas = defpackage.a.ZpBGe2uQfcn8;
        if (((defpackage.DR1ov5IJDbR8) idVar).ZpBGe2uQfcn8.isHardwareAccelerated()) {
            this.giKS3J6vZuNy.ZpBGe2uQfcn8(idVar, gu1Var, gu1Var.getDrawingTime());
        }
    }

    @Override // defpackage.d40
    public final float ZpBGe2uQfcn8() {
        return this.XntWc4eZSQ8j;
    }

    @Override // defpackage.d40
    public final void blKFvluuDQOf(float f) {
        this.BHfvd2J71qpO = f;
        this.JhCgjQRTAOCT.setScaleY(f);
    }

    @Override // defpackage.d40
    public final void dG7RjM6DqYVL(int i) {
        this.T1fB7bDYiVJQ = i;
        zJPqDeoF0Os1();
    }

    @Override // defpackage.d40
    public final void e6mdH7fiFuta() {
        this.JhCgjQRTAOCT.setRotationY(0.0f);
    }

    @Override // defpackage.d40
    public final void fNwYGHIYeJcR(android.graphics.Outline outline, long j) {
        defpackage.gu1 gu1Var = this.JhCgjQRTAOCT;
        gu1Var.e6mdH7fiFuta = outline;
        gu1Var.invalidateOutline();
        if ((this.h3m55N1URyyK || gu1Var.getClipToOutline()) && outline != null) {
            gu1Var.setClipToOutline(true);
            if (this.h3m55N1URyyK) {
                this.h3m55N1URyyK = false;
                this.Ns0WNyEWdPsk = true;
            }
        }
        this.fNwYGHIYeJcR = outline != null;
    }

    @Override // defpackage.d40
    public final void fWTAfUmVKrZq(float f) {
        this.XntWc4eZSQ8j = f;
        this.JhCgjQRTAOCT.setAlpha(f);
    }

    @Override // defpackage.d40
    public final float frSwwKIlbUhK() {
        return this.ZVVdXbWmyCSK;
    }

    @Override // defpackage.d40
    public final void gUjdnLbkVAaA(float f) {
        this.s0TASMVLSWD5 = f;
        this.JhCgjQRTAOCT.setScaleX(f);
    }

    @Override // defpackage.d40
    public final void giKS3J6vZuNy() {
        this.JhCgjQRTAOCT.setRotationX(0.0f);
    }

    @Override // defpackage.d40
    public final void h3m55N1URyyK() {
        android.graphics.Paint paint = this.QiMR8OkAhezm;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.QiMR8OkAhezm = paint;
        }
        paint.setColorFilter(null);
        zJPqDeoF0Os1();
    }

    @Override // defpackage.d40
    public final int hH0RRJrNssvh() {
        return this.gUjdnLbkVAaA;
    }

    @Override // defpackage.d40
    public final float jjTN4uUnoyEn() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final int maCixPsq4ml2() {
        return this.T1fB7bDYiVJQ;
    }

    @Override // defpackage.d40
    public final defpackage.ga oCu53ZX2v4Ju() {
        return null;
    }

    @Override // defpackage.d40
    public final float oh71FJcDz6S2() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final void qjMheFZ0l9kA(int i, int i2, long j) {
        boolean ZpBGe2uQfcn8 = defpackage.u90.ZpBGe2uQfcn8(this.GE9mJIPrb8gP, j);
        defpackage.gu1 gu1Var = this.JhCgjQRTAOCT;
        if (ZpBGe2uQfcn8) {
            int i3 = this.P05cfTpS5W5L;
            if (i3 != i) {
                gu1Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.e6mdH7fiFuta;
            if (i4 != i2) {
                gu1Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.h3m55N1URyyK || gu1Var.getClipToOutline()) {
                this.Ns0WNyEWdPsk = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            gu1Var.layout(i, i2, i + i5, i2 + i6);
            this.GE9mJIPrb8gP = j;
            if (this.WmetiUbpKU9I) {
                gu1Var.setPivotX(i5 / 2.0f);
                gu1Var.setPivotY(i6 / 2.0f);
            }
        }
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = i2;
    }

    @Override // defpackage.d40
    public final float s0TASMVLSWD5() {
        return 0.0f;
    }

    public final void w6IV1lieBIux(int i) {
        defpackage.gu1 gu1Var = this.JhCgjQRTAOCT;
        boolean z = true;
        if (i == 1) {
            gu1Var.setLayerType(2, this.QiMR8OkAhezm);
        } else {
            android.graphics.Paint paint = this.QiMR8OkAhezm;
            if (i == 2) {
                gu1Var.setLayerType(0, paint);
                z = false;
            } else {
                gu1Var.setLayerType(0, paint);
            }
        }
        gu1Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.d40
    public final void w7APNrr0aGRc(boolean z) {
        boolean z2 = false;
        this.h3m55N1URyyK = z && !this.fNwYGHIYeJcR;
        this.Ns0WNyEWdPsk = true;
        if (z && this.fNwYGHIYeJcR) {
            z2 = true;
        }
        this.JhCgjQRTAOCT.setClipToOutline(z2);
    }

    @Override // defpackage.d40
    public final long xahdJg25P1Bv() {
        return this.w7APNrr0aGRc;
    }

    public final void zJPqDeoF0Os1() {
        int i = this.T1fB7bDYiVJQ;
        if (i != 1 && this.gUjdnLbkVAaA == 3) {
            w6IV1lieBIux(i);
        } else {
            w6IV1lieBIux(1);
        }
    }
}
