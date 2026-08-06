package defpackage;

/* loaded from: classes.dex */
public final class v20 implements defpackage.s20 {
    public static final java.util.concurrent.atomic.AtomicBoolean PAEGRtP0bX = new java.util.concurrent.atomic.AtomicBoolean(true);
    public android.graphics.Matrix AARZUJiTa;
    public boolean DFo87pBq1E5;
    public boolean EXtogiMhuM;
    public float EgCjBq0SZwJ;
    public final android.view.RenderNode F7NU4MC0GW;
    public long G3OKOH3wZRC;
    public float JlrlGoKF;
    public float QoRHpC4k;
    public int SH1y5HwkJhh;
    public float SyNS6RMn;
    public boolean V7bD7b8KA;
    public long adDC3e2L;
    public float cnag84Bm;
    public int ez2rX8ReCYw;
    public boolean fnWB2E7cs;
    public boolean kNAkVymC;
    public long kd6TUFXn;
    public final defpackage.kb oh6vYeIP;
    public final defpackage.jb r1MBDhnF;
    public long riuEU0zW4;
    public android.graphics.Paint xiZrDbcSW0;

    public v20(defpackage.v0 v0Var, defpackage.kb kbVar, defpackage.jb jbVar) {
        this.oh6vYeIP = kbVar;
        this.r1MBDhnF = jbVar;
        android.view.RenderNode create = android.view.RenderNode.create("Compose", v0Var);
        this.F7NU4MC0GW = create;
        this.adDC3e2L = 0L;
        this.riuEU0zW4 = 0L;
        if (PAEGRtP0bX.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                defpackage.c11.r1MBDhnF(create, defpackage.c11.IHQe1A4L2xu(create));
                defpackage.c11.F7NU4MC0GW(create, defpackage.c11.oh6vYeIP(create));
            }
            defpackage.b11.IHQe1A4L2xu(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        lpprD5VAS(0);
        this.SH1y5HwkJhh = 0;
        this.ez2rX8ReCYw = 3;
        this.JlrlGoKF = 1.0f;
        this.SyNS6RMn = 1.0f;
        this.cnag84Bm = 1.0f;
        long j = defpackage.ae.oh6vYeIP;
        this.G3OKOH3wZRC = j;
        this.kd6TUFXn = j;
        this.EgCjBq0SZwJ = 8.0f;
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
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.F7NU4MC0GW.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (defpackage.i70.IHQe1A4L2xu(this.adDC3e2L, j)) {
            return;
        }
        if (this.DFo87pBq1E5) {
            this.F7NU4MC0GW.setPivotX(i3 / 2.0f);
            this.F7NU4MC0GW.setPivotY(i4 / 2.0f);
        }
        this.adDC3e2L = j;
    }

    @Override // defpackage.s20
    public final void DFo87pBq1E5() {
        hkbnNdmy();
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
        this.JlrlGoKF = f;
        this.F7NU4MC0GW.setAlpha(f);
    }

    @Override // defpackage.s20
    public final void G3OKOH3wZRC() {
        defpackage.b11.IHQe1A4L2xu(this.F7NU4MC0GW);
    }

    public final void IHQe1A4L2xu() {
        boolean z = this.fnWB2E7cs;
        boolean z2 = false;
        boolean z3 = z && !this.EXtogiMhuM;
        if (z && this.EXtogiMhuM) {
            z2 = true;
        }
        if (z3 != this.kNAkVymC) {
            this.kNAkVymC = z3;
            this.F7NU4MC0GW.setClipToBounds(z3);
        }
        if (z2 != this.V7bD7b8KA) {
            this.V7bD7b8KA = z2;
            this.F7NU4MC0GW.setClipToOutline(z2);
        }
    }

    @Override // defpackage.s20
    public final void JlrlGoKF(android.graphics.Outline outline, long j) {
        this.riuEU0zW4 = j;
        this.F7NU4MC0GW.setOutline(outline);
        this.EXtogiMhuM = outline != null;
        IHQe1A4L2xu();
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
        this.SH1y5HwkJhh = i;
        hkbnNdmy();
    }

    @Override // defpackage.s20
    public final float QoRHpC4k() {
        return this.EgCjBq0SZwJ;
    }

    @Override // defpackage.s20
    public final long SH1y5HwkJhh() {
        return this.kd6TUFXn;
    }

    @Override // defpackage.s20
    public final void SiPhmbmu(float f) {
        this.EgCjBq0SZwJ = f;
        this.F7NU4MC0GW.setCameraDistance(-f);
    }

    @Override // defpackage.s20
    public final void SyNS6RMn(float f) {
        this.SyNS6RMn = f;
        this.F7NU4MC0GW.setScaleX(f);
    }

    @Override // defpackage.s20
    public final void UsuH8pd5P(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.kd6TUFXn = j;
            defpackage.c11.F7NU4MC0GW(this.F7NU4MC0GW, defpackage.w70.yIx6ChFVk(j));
        }
    }

    @Override // defpackage.s20
    public final long Uv8CGu3G() {
        return this.G3OKOH3wZRC;
    }

    @Override // defpackage.s20
    public final int V7bD7b8KA() {
        return this.SH1y5HwkJhh;
    }

    @Override // defpackage.s20
    public final float XZx205DYe() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void abhbClRa(defpackage.qn qnVar, defpackage.w90 w90Var, defpackage.q20 q20Var, defpackage.s sVar) {
        android.graphics.Canvas start = this.F7NU4MC0GW.start(java.lang.Math.max((int) (this.adDC3e2L >> 32), (int) (this.riuEU0zW4 >> 32)), java.lang.Math.max((int) (this.adDC3e2L & 4294967295L), (int) (this.riuEU0zW4 & 4294967295L)));
        try {
            defpackage.c0 c0Var = this.oh6vYeIP.IHQe1A4L2xu;
            android.graphics.Canvas canvas = c0Var.IHQe1A4L2xu;
            c0Var.IHQe1A4L2xu = start;
            defpackage.jb jbVar = this.r1MBDhnF;
            defpackage.v5 v5Var = jbVar.xiZrDbcSW0;
            long frpfPPIgqM9O = defpackage.j70.frpfPPIgqM9O(this.adDC3e2L);
            defpackage.ib ibVar = ((defpackage.jb) v5Var.F7NU4MC0GW).adDC3e2L;
            defpackage.qn qnVar2 = ibVar.IHQe1A4L2xu;
            defpackage.w90 w90Var2 = ibVar.oh6vYeIP;
            defpackage.hb xiZrDbcSW0 = v5Var.xiZrDbcSW0();
            long riuEU0zW4 = v5Var.riuEU0zW4();
            defpackage.q20 q20Var2 = (defpackage.q20) v5Var.r1MBDhnF;
            v5Var.G3OKOH3wZRC(qnVar);
            v5Var.kd6TUFXn(w90Var);
            v5Var.QoRHpC4k(c0Var);
            v5Var.EgCjBq0SZwJ(frpfPPIgqM9O);
            v5Var.r1MBDhnF = q20Var;
            c0Var.riuEU0zW4();
            try {
                sVar.AARZUJiTa(jbVar);
                c0Var.AARZUJiTa();
                v5Var.G3OKOH3wZRC(qnVar2);
                v5Var.kd6TUFXn(w90Var2);
                v5Var.QoRHpC4k(xiZrDbcSW0);
                v5Var.EgCjBq0SZwJ(riuEU0zW4);
                v5Var.r1MBDhnF = q20Var2;
                c0Var.IHQe1A4L2xu = canvas;
            } catch (java.lang.Throwable th) {
                c0Var.AARZUJiTa();
                defpackage.v5 v5Var2 = jbVar.xiZrDbcSW0;
                v5Var2.G3OKOH3wZRC(qnVar2);
                v5Var2.kd6TUFXn(w90Var2);
                v5Var2.QoRHpC4k(xiZrDbcSW0);
                v5Var2.EgCjBq0SZwJ(riuEU0zW4);
                v5Var2.r1MBDhnF = q20Var2;
                throw th;
            }
        } finally {
            this.F7NU4MC0GW.end(start);
        }
    }

    @Override // defpackage.s20
    public final float adDC3e2L() {
        return this.SyNS6RMn;
    }

    @Override // defpackage.s20
    public final void cnag84Bm(int i) {
        if (this.ez2rX8ReCYw == i) {
            return;
        }
        this.ez2rX8ReCYw = i;
        android.graphics.Paint paint = this.xiZrDbcSW0;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.xiZrDbcSW0 = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.w70.wll2JLbTBC2(i)));
        hkbnNdmy();
    }

    @Override // defpackage.s20
    public final void ez2rX8ReCYw(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.G3OKOH3wZRC = j;
            defpackage.c11.r1MBDhnF(this.F7NU4MC0GW, defpackage.w70.yIx6ChFVk(j));
        }
    }

    @Override // defpackage.s20
    public final void fnWB2E7cs(defpackage.hb hbVar) {
        android.graphics.Canvas canvas = defpackage.d0.IHQe1A4L2xu;
        android.view.DisplayListCanvas displayListCanvas = ((defpackage.c0) hbVar).IHQe1A4L2xu;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.F7NU4MC0GW);
    }

    @Override // defpackage.s20
    public final float frpfPPIgqM9O() {
        return 0.0f;
    }

    public final void hkbnNdmy() {
        int i = this.SH1y5HwkJhh;
        if (i != 1 && this.ez2rX8ReCYw == 3) {
            lpprD5VAS(i);
        } else {
            lpprD5VAS(1);
        }
    }

    @Override // defpackage.s20
    public final void hyxIchWRW(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.DFo87pBq1E5 = true;
            this.F7NU4MC0GW.setPivotX(((int) (this.adDC3e2L >> 32)) / 2.0f);
            this.F7NU4MC0GW.setPivotY(((int) (4294967295L & this.adDC3e2L)) / 2.0f);
        } else {
            this.DFo87pBq1E5 = false;
            this.F7NU4MC0GW.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            this.F7NU4MC0GW.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.s20
    public final void kNAkVymC(boolean z) {
        this.fnWB2E7cs = z;
        IHQe1A4L2xu();
    }

    @Override // defpackage.s20
    public final float kd6TUFXn() {
        return 0.0f;
    }

    public final void lpprD5VAS(int i) {
        android.view.RenderNode renderNode = this.F7NU4MC0GW;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.xiZrDbcSW0);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.xiZrDbcSW0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.xiZrDbcSW0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.s20
    public final int mAr5m2L7gYDP() {
        return this.ez2rX8ReCYw;
    }

    @Override // defpackage.s20
    public final void nBH8hAHy(float f) {
        this.cnag84Bm = f;
        this.F7NU4MC0GW.setScaleY(f);
    }

    @Override // defpackage.s20
    public final float oh6vYeIP() {
        return this.JlrlGoKF;
    }

    @Override // defpackage.s20
    public final float p4kuH6PDtgom() {
        return this.QoRHpC4k;
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
        android.graphics.Matrix matrix = this.AARZUJiTa;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.AARZUJiTa = matrix;
        }
        this.F7NU4MC0GW.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.s20
    public final float wll2JLbTBC2() {
        return this.cnag84Bm;
    }

    @Override // defpackage.s20
    public final void xiZrDbcSW0(float f) {
        this.QoRHpC4k = f;
        this.F7NU4MC0GW.setElevation(f);
    }

    @Override // defpackage.s20
    public final boolean yIx6ChFVk() {
        return this.F7NU4MC0GW.isValid();
    }
}
