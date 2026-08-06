package defpackage;

/* loaded from: classes.dex */
public final class z20 implements defpackage.s20 {
    public static final defpackage.y20 PAEGRtP0bX = new defpackage.y20();
    public android.graphics.Paint AARZUJiTa;
    public boolean DFo87pBq1E5;
    public int EXtogiMhuM;
    public float EgCjBq0SZwJ;
    public final defpackage.tm1 F7NU4MC0GW;
    public boolean G3OKOH3wZRC;
    public boolean JlrlGoKF;
    public float QoRHpC4k;
    public long SH1y5HwkJhh;
    public int SyNS6RMn;
    public long V7bD7b8KA;
    public final android.content.res.Resources adDC3e2L;
    public int cnag84Bm;
    public boolean ez2rX8ReCYw;
    public float fnWB2E7cs;
    public long kNAkVymC;
    public float kd6TUFXn;
    public final defpackage.ur oh6vYeIP;
    public final defpackage.kb r1MBDhnF;
    public int riuEU0zW4;
    public final android.graphics.Rect xiZrDbcSW0;

    public z20(defpackage.ur urVar) {
        defpackage.kb kbVar = new defpackage.kb();
        defpackage.jb jbVar = new defpackage.jb();
        this.oh6vYeIP = urVar;
        this.r1MBDhnF = kbVar;
        defpackage.tm1 tm1Var = new defpackage.tm1(urVar, kbVar, jbVar);
        this.F7NU4MC0GW = tm1Var;
        this.adDC3e2L = urVar.getResources();
        this.xiZrDbcSW0 = new android.graphics.Rect();
        urVar.addView(tm1Var);
        tm1Var.setClipBounds(null);
        this.SH1y5HwkJhh = 0L;
        android.view.View.generateViewId();
        this.SyNS6RMn = 3;
        this.cnag84Bm = 0;
        this.QoRHpC4k = 1.0f;
        this.kd6TUFXn = 1.0f;
        this.EgCjBq0SZwJ = 1.0f;
        long j = defpackage.ae.oh6vYeIP;
        this.kNAkVymC = j;
        this.V7bD7b8KA = j;
    }

    @Override // defpackage.s20
    public final float AARZUJiTa() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void C0U8sNJm() {
        this.F7NU4MC0GW.setRotation(0.0f);
    }

    @Override // defpackage.s20
    public final void D2vUnMij(int i, int i2, long j) {
        boolean IHQe1A4L2xu = defpackage.i70.IHQe1A4L2xu(this.SH1y5HwkJhh, j);
        defpackage.tm1 tm1Var = this.F7NU4MC0GW;
        if (IHQe1A4L2xu) {
            int i3 = this.EXtogiMhuM;
            if (i3 != i) {
                tm1Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.riuEU0zW4;
            if (i4 != i2) {
                tm1Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.DFo87pBq1E5 || tm1Var.getClipToOutline()) {
                this.ez2rX8ReCYw = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            tm1Var.layout(i, i2, i + i5, i2 + i6);
            this.SH1y5HwkJhh = j;
            if (this.G3OKOH3wZRC) {
                tm1Var.setPivotX(i5 / 2.0f);
                tm1Var.setPivotY(i6 / 2.0f);
            }
        }
        this.EXtogiMhuM = i;
        this.riuEU0zW4 = i2;
    }

    @Override // defpackage.s20
    public final void DFo87pBq1E5() {
        android.graphics.Paint paint = this.AARZUJiTa;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.AARZUJiTa = paint;
        }
        paint.setColorFilter(null);
        lpprD5VAS();
    }

    @Override // defpackage.s20
    public final void EXtogiMhuM() {
        this.F7NU4MC0GW.setTranslationY(0.0f);
    }

    @Override // defpackage.s20
    public final void EgCjBq0SZwJ() {
        this.F7NU4MC0GW.setTranslationX(0.0f);
    }

    @Override // defpackage.s20
    public final void F7NU4MC0GW(float f) {
        this.QoRHpC4k = f;
        this.F7NU4MC0GW.setAlpha(f);
    }

    @Override // defpackage.s20
    public final void G3OKOH3wZRC() {
        this.oh6vYeIP.removeViewInLayout(this.F7NU4MC0GW);
    }

    public final void IHQe1A4L2xu(int i) {
        defpackage.tm1 tm1Var = this.F7NU4MC0GW;
        boolean z = true;
        if (i == 1) {
            tm1Var.setLayerType(2, this.AARZUJiTa);
        } else {
            android.graphics.Paint paint = this.AARZUJiTa;
            if (i == 2) {
                tm1Var.setLayerType(0, paint);
                z = false;
            } else {
                tm1Var.setLayerType(0, paint);
            }
        }
        tm1Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.s20
    public final void JlrlGoKF(android.graphics.Outline outline, long j) {
        defpackage.tm1 tm1Var = this.F7NU4MC0GW;
        tm1Var.riuEU0zW4 = outline;
        tm1Var.invalidateOutline();
        if ((this.DFo87pBq1E5 || tm1Var.getClipToOutline()) && outline != null) {
            tm1Var.setClipToOutline(true);
            if (this.DFo87pBq1E5) {
                this.DFo87pBq1E5 = false;
                this.ez2rX8ReCYw = true;
            }
        }
        this.JlrlGoKF = outline != null;
    }

    @Override // defpackage.s20
    public final defpackage.f8 NHJTzaLwkd() {
        return null;
    }

    @Override // defpackage.s20
    public final float PAEGRtP0bX() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void QQUzIjv3iOC5(int i) {
        this.cnag84Bm = i;
        lpprD5VAS();
    }

    @Override // defpackage.s20
    public final float QoRHpC4k() {
        return this.F7NU4MC0GW.getCameraDistance() / this.adDC3e2L.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.s20
    public final long SH1y5HwkJhh() {
        return this.V7bD7b8KA;
    }

    @Override // defpackage.s20
    public final void SiPhmbmu(float f) {
        this.F7NU4MC0GW.setCameraDistance(f * this.adDC3e2L.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.s20
    public final void SyNS6RMn(float f) {
        this.kd6TUFXn = f;
        this.F7NU4MC0GW.setScaleX(f);
    }

    @Override // defpackage.s20
    public final void UsuH8pd5P(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.V7bD7b8KA = j;
            this.F7NU4MC0GW.setOutlineSpotShadowColor(defpackage.w70.yIx6ChFVk(j));
        }
    }

    @Override // defpackage.s20
    public final long Uv8CGu3G() {
        return this.kNAkVymC;
    }

    @Override // defpackage.s20
    public final int V7bD7b8KA() {
        return this.cnag84Bm;
    }

    @Override // defpackage.s20
    public final float XZx205DYe() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void abhbClRa(defpackage.qn qnVar, defpackage.w90 w90Var, defpackage.q20 q20Var, defpackage.s sVar) {
        defpackage.tm1 tm1Var = this.F7NU4MC0GW;
        android.view.ViewParent parent = tm1Var.getParent();
        defpackage.ur urVar = this.oh6vYeIP;
        if (parent == null) {
            urVar.addView(tm1Var);
        }
        tm1Var.ez2rX8ReCYw = qnVar;
        tm1Var.JlrlGoKF = w90Var;
        tm1Var.DFo87pBq1E5 = sVar;
        tm1Var.SyNS6RMn = q20Var;
        if (tm1Var.isAttachedToWindow()) {
            tm1Var.setVisibility(4);
            tm1Var.setVisibility(0);
            try {
                defpackage.kb kbVar = this.r1MBDhnF;
                defpackage.y20 y20Var = PAEGRtP0bX;
                defpackage.c0 c0Var = kbVar.IHQe1A4L2xu;
                android.graphics.Canvas canvas = c0Var.IHQe1A4L2xu;
                c0Var.IHQe1A4L2xu = y20Var;
                urVar.IHQe1A4L2xu(c0Var, tm1Var, tm1Var.getDrawingTime());
                kbVar.IHQe1A4L2xu.IHQe1A4L2xu = canvas;
            } catch (java.lang.ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.s20
    public final float adDC3e2L() {
        return this.kd6TUFXn;
    }

    @Override // defpackage.s20
    public final void cnag84Bm(int i) {
        this.SyNS6RMn = i;
        android.graphics.Paint paint = this.AARZUJiTa;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.AARZUJiTa = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.w70.wll2JLbTBC2(i)));
        lpprD5VAS();
    }

    @Override // defpackage.s20
    public final void ez2rX8ReCYw(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.kNAkVymC = j;
            this.F7NU4MC0GW.setOutlineAmbientShadowColor(defpackage.w70.yIx6ChFVk(j));
        }
    }

    @Override // defpackage.s20
    public final void fnWB2E7cs(defpackage.hb hbVar) {
        android.graphics.Rect rect;
        boolean z = this.ez2rX8ReCYw;
        defpackage.tm1 tm1Var = this.F7NU4MC0GW;
        if (z) {
            if ((this.DFo87pBq1E5 || tm1Var.getClipToOutline()) && !this.JlrlGoKF) {
                rect = this.xiZrDbcSW0;
                rect.left = 0;
                rect.top = 0;
                rect.right = tm1Var.getWidth();
                rect.bottom = tm1Var.getHeight();
            } else {
                rect = null;
            }
            tm1Var.setClipBounds(rect);
        }
        android.graphics.Canvas canvas = defpackage.d0.IHQe1A4L2xu;
        if (((defpackage.c0) hbVar).IHQe1A4L2xu.isHardwareAccelerated()) {
            this.oh6vYeIP.IHQe1A4L2xu(hbVar, tm1Var, tm1Var.getDrawingTime());
        }
    }

    @Override // defpackage.s20
    public final float frpfPPIgqM9O() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void hyxIchWRW(long j) {
        long j2 = 9223372034707292159L & j;
        defpackage.tm1 tm1Var = this.F7NU4MC0GW;
        if (j2 != 9205357640488583168L) {
            this.G3OKOH3wZRC = false;
            tm1Var.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            tm1Var.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                tm1Var.resetPivot();
                return;
            }
            this.G3OKOH3wZRC = true;
            tm1Var.setPivotX(((int) (this.SH1y5HwkJhh >> 32)) / 2.0f);
            tm1Var.setPivotY(((int) (this.SH1y5HwkJhh & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.s20
    public final void kNAkVymC(boolean z) {
        boolean z2 = false;
        this.DFo87pBq1E5 = z && !this.JlrlGoKF;
        this.ez2rX8ReCYw = true;
        if (z && this.JlrlGoKF) {
            z2 = true;
        }
        this.F7NU4MC0GW.setClipToOutline(z2);
    }

    @Override // defpackage.s20
    public final float kd6TUFXn() {
        return 0.0f;
    }

    public final void lpprD5VAS() {
        int i = this.cnag84Bm;
        if (i != 1 && this.SyNS6RMn == 3) {
            IHQe1A4L2xu(i);
        } else {
            IHQe1A4L2xu(1);
        }
    }

    @Override // defpackage.s20
    public final int mAr5m2L7gYDP() {
        return this.SyNS6RMn;
    }

    @Override // defpackage.s20
    public final void nBH8hAHy(float f) {
        this.EgCjBq0SZwJ = f;
        this.F7NU4MC0GW.setScaleY(f);
    }

    @Override // defpackage.s20
    public final float oh6vYeIP() {
        return this.QoRHpC4k;
    }

    @Override // defpackage.s20
    public final float p4kuH6PDtgom() {
        return this.fnWB2E7cs;
    }

    @Override // defpackage.s20
    public final void r1MBDhnF() {
        this.F7NU4MC0GW.setRotationX(0.0f);
    }

    @Override // defpackage.s20
    public final void riuEU0zW4() {
        this.F7NU4MC0GW.setRotationY(0.0f);
    }

    @Override // defpackage.s20
    public final android.graphics.Matrix v5iciZok() {
        return this.F7NU4MC0GW.getMatrix();
    }

    @Override // defpackage.s20
    public final float wll2JLbTBC2() {
        return this.EgCjBq0SZwJ;
    }

    @Override // defpackage.s20
    public final void xiZrDbcSW0(float f) {
        this.fnWB2E7cs = f;
        this.F7NU4MC0GW.setElevation(f);
    }
}
