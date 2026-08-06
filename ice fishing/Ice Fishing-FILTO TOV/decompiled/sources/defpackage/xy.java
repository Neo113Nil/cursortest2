package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xy implements qy {
    public static final wy lv06NcmrQ = new wy();
    public Paint AvO7iQsrTN;
    public boolean E7jCp8Ls;
    public final Rect EljAMC1QTz;
    public long JFJ3QoxA;
    public float Mjvvu5DE;
    public final Resources OOA6hdeuvCS;
    public float WIEu4Ya2g8;
    public final v9 X1lG3V04pd;
    public boolean XnEVoBF0td1l;
    public long Y6hRI1cF8;
    public final eo Yi7zF1RB1;
    public boolean YmKjaVtbfp5Z;
    public long cilMamHF;
    public int encWxUiV2;
    public int iwATDS1i01k;
    public float jivtDDk9H;
    public float mE4lRynR;
    public int mOu10nynGul;
    public boolean rQPn8YBR;
    public int uFEq9NpZ;
    public final ue1 xqGvceK5x;

    public xy(eo eoVar) {
        v9 v9Var = new v9();
        u9 u9Var = new u9();
        this.Yi7zF1RB1 = eoVar;
        this.X1lG3V04pd = v9Var;
        ue1 ue1Var = new ue1(eoVar, v9Var, u9Var);
        this.xqGvceK5x = ue1Var;
        this.OOA6hdeuvCS = eoVar.getResources();
        this.EljAMC1QTz = new Rect();
        eoVar.addView(ue1Var);
        ue1Var.setClipBounds(null);
        this.JFJ3QoxA = 0L;
        View.generateViewId();
        this.uFEq9NpZ = 3;
        this.iwATDS1i01k = 0;
        this.WIEu4Ya2g8 = 1.0f;
        this.Mjvvu5DE = 1.0f;
        this.mE4lRynR = 1.0f;
        long j = yb.Yi7zF1RB1;
        this.Y6hRI1cF8 = j;
        this.cilMamHF = j;
    }

    @Override // defpackage.qy
    public final float AEn1Rrio() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final float AvO7iQsrTN() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final float DmJncFq5() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final void E7jCp8Ls(Outline outline, long j) {
        ue1 ue1Var = this.xqGvceK5x;
        ue1Var.mOu10nynGul = outline;
        ue1Var.invalidateOutline();
        if ((this.XnEVoBF0td1l || ue1Var.getClipToOutline()) && outline != null) {
            ue1Var.setClipToOutline(true);
            if (this.XnEVoBF0td1l) {
                this.XnEVoBF0td1l = false;
                this.rQPn8YBR = true;
            }
        }
        this.E7jCp8Ls = outline != null;
    }

    @Override // defpackage.qy
    public final Matrix EXrPz3p7hFb() {
        return this.xqGvceK5x.getMatrix();
    }

    @Override // defpackage.qy
    public final void EljAMC1QTz(float f) {
        this.jivtDDk9H = f;
        this.xqGvceK5x.setElevation(f);
    }

    public final void GWasM1elztuh(int i) {
        ue1 ue1Var = this.xqGvceK5x;
        boolean z = true;
        if (i == 1) {
            ue1Var.setLayerType(2, this.AvO7iQsrTN);
        } else {
            Paint paint = this.AvO7iQsrTN;
            if (i == 2) {
                ue1Var.setLayerType(0, paint);
                z = false;
            } else {
                ue1Var.setLayerType(0, paint);
            }
        }
        ue1Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.qy
    public final int HFYAaqMd6() {
        return this.uFEq9NpZ;
    }

    @Override // defpackage.qy
    public final long JFJ3QoxA() {
        return this.cilMamHF;
    }

    @Override // defpackage.qy
    public final void M3K9sHhK(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.cilMamHF = j;
            this.xqGvceK5x.setOutlineSpotShadowColor(ki1.HFYAaqMd6(j));
        }
    }

    @Override // defpackage.qy
    public final float MZhzXH72() {
        return this.mE4lRynR;
    }

    @Override // defpackage.qy
    public final float Mjvvu5DE() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final float OOA6hdeuvCS() {
        return this.Mjvvu5DE;
    }

    @Override // defpackage.qy
    public final long TpUsjqg3bxO() {
        return this.Y6hRI1cF8;
    }

    @Override // defpackage.qy
    public final float WIEu4Ya2g8() {
        return this.xqGvceK5x.getCameraDistance() / this.OOA6hdeuvCS.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.qy
    public final s6 WRKkgoJXwDn() {
        return null;
    }

    @Override // defpackage.qy
    public final void WdrkLMV3xh(el elVar, p50 p50Var, oy oyVar, NWXxPwoOUSX9 nWXxPwoOUSX9) {
        ue1 ue1Var = this.xqGvceK5x;
        ViewParent parent = ue1Var.getParent();
        eo eoVar = this.Yi7zF1RB1;
        if (parent == null) {
            eoVar.addView(ue1Var);
        }
        ue1Var.rQPn8YBR = elVar;
        ue1Var.E7jCp8Ls = p50Var;
        ue1Var.XnEVoBF0td1l = nWXxPwoOUSX9;
        ue1Var.uFEq9NpZ = oyVar;
        if (ue1Var.isAttachedToWindow()) {
            ue1Var.setVisibility(4);
            ue1Var.setVisibility(0);
            try {
                v9 v9Var = this.X1lG3V04pd;
                wy wyVar = lv06NcmrQ;
                Jz7YUlEP53 jz7YUlEP53 = v9Var.GWasM1elztuh;
                Canvas canvas = jz7YUlEP53.GWasM1elztuh;
                jz7YUlEP53.GWasM1elztuh = wyVar;
                eoVar.GWasM1elztuh(jz7YUlEP53, ue1Var, ue1Var.getDrawingTime());
                v9Var.GWasM1elztuh.GWasM1elztuh = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.qy
    public final void X1lG3V04pd() {
        this.xqGvceK5x.setRotationX(0.0f);
    }

    @Override // defpackage.qy
    public final void XnEVoBF0td1l() {
        Paint paint = this.AvO7iQsrTN;
        if (paint == null) {
            paint = new Paint();
            this.AvO7iQsrTN = paint;
        }
        paint.setColorFilter(null);
        dqB83aoLBB();
    }

    @Override // defpackage.qy
    public final void Y6hRI1cF8(boolean z) {
        boolean z2 = false;
        this.XnEVoBF0td1l = z && !this.E7jCp8Ls;
        this.rQPn8YBR = true;
        if (z && this.E7jCp8Ls) {
            z2 = true;
        }
        this.xqGvceK5x.setClipToOutline(z2);
    }

    @Override // defpackage.qy
    public final void YZjbz8VdP5(float f) {
        this.xqGvceK5x.setCameraDistance(f * this.OOA6hdeuvCS.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.qy
    public final float Yi7zF1RB1() {
        return this.WIEu4Ya2g8;
    }

    @Override // defpackage.qy
    public final void YmKjaVtbfp5Z() {
        this.Yi7zF1RB1.removeViewInLayout(this.xqGvceK5x);
    }

    @Override // defpackage.qy
    public final void arNh8D4Z5gB(int i) {
        this.iwATDS1i01k = i;
        dqB83aoLBB();
    }

    @Override // defpackage.qy
    public final int cilMamHF() {
        return this.iwATDS1i01k;
    }

    public final void dqB83aoLBB() {
        int i = this.iwATDS1i01k;
        if (i != 1 && this.uFEq9NpZ == 3) {
            GWasM1elztuh(i);
        } else {
            GWasM1elztuh(1);
        }
    }

    @Override // defpackage.qy
    public final float eUH21U3apd() {
        return this.jivtDDk9H;
    }

    @Override // defpackage.qy
    public final void encWxUiV2() {
        this.xqGvceK5x.setTranslationY(0.0f);
    }

    @Override // defpackage.qy
    public final void iwATDS1i01k(int i) {
        this.uFEq9NpZ = i;
        Paint paint = this.AvO7iQsrTN;
        if (paint == null) {
            paint = new Paint();
            this.AvO7iQsrTN = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(fb1.mqNvfisv7(i)));
        dqB83aoLBB();
    }

    @Override // defpackage.qy
    public final void jivtDDk9H(s9 s9Var) {
        Rect rect;
        boolean z = this.rQPn8YBR;
        ue1 ue1Var = this.xqGvceK5x;
        if (z) {
            if ((this.XnEVoBF0td1l || ue1Var.getClipToOutline()) && !this.E7jCp8Ls) {
                rect = this.EljAMC1QTz;
                rect.left = 0;
                rect.top = 0;
                rect.right = ue1Var.getWidth();
                rect.bottom = ue1Var.getHeight();
            } else {
                rect = null;
            }
            ue1Var.setClipBounds(rect);
        }
        Canvas canvas = ddkiCTz5mZ.GWasM1elztuh;
        if (((Jz7YUlEP53) s9Var).GWasM1elztuh.isHardwareAccelerated()) {
            this.Yi7zF1RB1.GWasM1elztuh(s9Var, ue1Var, ue1Var.getDrawingTime());
        }
    }

    @Override // defpackage.qy
    public final void k8h8IjolWQ(float f) {
        this.mE4lRynR = f;
        this.xqGvceK5x.setScaleY(f);
    }

    @Override // defpackage.qy
    public final float lv06NcmrQ() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final void mE4lRynR() {
        this.xqGvceK5x.setTranslationX(0.0f);
    }

    @Override // defpackage.qy
    public final void mOu10nynGul() {
        this.xqGvceK5x.setRotationY(0.0f);
    }

    @Override // defpackage.qy
    public final void ozMwhSAI(int i, int i2, long j) {
        boolean GWasM1elztuh = b30.GWasM1elztuh(this.JFJ3QoxA, j);
        ue1 ue1Var = this.xqGvceK5x;
        if (GWasM1elztuh) {
            int i3 = this.encWxUiV2;
            if (i3 != i) {
                ue1Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.mOu10nynGul;
            if (i4 != i2) {
                ue1Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.XnEVoBF0td1l || ue1Var.getClipToOutline()) {
                this.rQPn8YBR = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            ue1Var.layout(i, i2, i + i5, i2 + i6);
            this.JFJ3QoxA = j;
            if (this.YmKjaVtbfp5Z) {
                ue1Var.setPivotX(i5 / 2.0f);
                ue1Var.setPivotY(i6 / 2.0f);
            }
        }
        this.encWxUiV2 = i;
        this.mOu10nynGul = i2;
    }

    @Override // defpackage.qy
    public final void pog2g9KITJA() {
        this.xqGvceK5x.setRotation(0.0f);
    }

    @Override // defpackage.qy
    public final void rQPn8YBR(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.Y6hRI1cF8 = j;
            this.xqGvceK5x.setOutlineAmbientShadowColor(ki1.HFYAaqMd6(j));
        }
    }

    @Override // defpackage.qy
    public final void rezfBrjOrqK(long j) {
        long j2 = 9223372034707292159L & j;
        ue1 ue1Var = this.xqGvceK5x;
        if (j2 != 9205357640488583168L) {
            this.YmKjaVtbfp5Z = false;
            ue1Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            ue1Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ue1Var.resetPivot();
                return;
            }
            this.YmKjaVtbfp5Z = true;
            ue1Var.setPivotX(((int) (this.JFJ3QoxA >> 32)) / 2.0f);
            ue1Var.setPivotY(((int) (this.JFJ3QoxA & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.qy
    public final void uFEq9NpZ(float f) {
        this.Mjvvu5DE = f;
        this.xqGvceK5x.setScaleX(f);
    }

    @Override // defpackage.qy
    public final void xqGvceK5x(float f) {
        this.WIEu4Ya2g8 = f;
        this.xqGvceK5x.setAlpha(f);
    }
}
