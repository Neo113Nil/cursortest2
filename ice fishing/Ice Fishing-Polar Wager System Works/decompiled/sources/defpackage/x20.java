package defpackage;

/* loaded from: classes.dex */
public final class x20 implements defpackage.s20 {
    public android.graphics.Matrix AARZUJiTa;
    public float DFo87pBq1E5;
    public boolean EXtogiMhuM;
    public boolean EgCjBq0SZwJ;
    public final android.graphics.RenderNode F7NU4MC0GW;
    public boolean G3OKOH3wZRC;
    public float JlrlGoKF;
    public float QoRHpC4k;
    public int SH1y5HwkJhh;
    public long SyNS6RMn;
    public long adDC3e2L;
    public long cnag84Bm;
    public float ez2rX8ReCYw;
    public int fnWB2E7cs;
    public boolean kd6TUFXn;
    public final defpackage.kb oh6vYeIP;
    public final defpackage.jb r1MBDhnF;
    public float riuEU0zW4;
    public android.graphics.Paint xiZrDbcSW0;

    public x20() {
        defpackage.kb kbVar = new defpackage.kb();
        defpackage.jb jbVar = new defpackage.jb();
        this.oh6vYeIP = kbVar;
        this.r1MBDhnF = jbVar;
        android.graphics.RenderNode r1MBDhnF = defpackage.w20.r1MBDhnF();
        this.F7NU4MC0GW = r1MBDhnF;
        this.adDC3e2L = 0L;
        r1MBDhnF.setClipToBounds(false);
        lpprD5VAS(r1MBDhnF, 0);
        this.riuEU0zW4 = 1.0f;
        this.SH1y5HwkJhh = 3;
        this.ez2rX8ReCYw = 1.0f;
        this.JlrlGoKF = 1.0f;
        long j = defpackage.ae.oh6vYeIP;
        this.SyNS6RMn = j;
        this.cnag84Bm = j;
        this.QoRHpC4k = 8.0f;
        this.fnWB2E7cs = 0;
    }

    @Override // defpackage.s20
    public final float AARZUJiTa() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void C0U8sNJm() {
        this.F7NU4MC0GW.setRotationZ(0.0f);
    }

    @Override // defpackage.s20
    public final void D2vUnMij(int i, int i2, long j) {
        this.F7NU4MC0GW.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.adDC3e2L = defpackage.j70.frpfPPIgqM9O(j);
    }

    @Override // defpackage.s20
    public final void DFo87pBq1E5() {
        android.graphics.Paint paint = this.xiZrDbcSW0;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.xiZrDbcSW0 = paint;
        }
        paint.setColorFilter(null);
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
        this.riuEU0zW4 = f;
        this.F7NU4MC0GW.setAlpha(f);
    }

    @Override // defpackage.s20
    public final void G3OKOH3wZRC() {
        this.F7NU4MC0GW.discardDisplayList();
    }

    public final void IHQe1A4L2xu() {
        boolean z = this.G3OKOH3wZRC;
        boolean z2 = false;
        boolean z3 = z && !this.EXtogiMhuM;
        if (z && this.EXtogiMhuM) {
            z2 = true;
        }
        if (z3 != this.kd6TUFXn) {
            this.kd6TUFXn = z3;
            this.F7NU4MC0GW.setClipToBounds(z3);
        }
        if (z2 != this.EgCjBq0SZwJ) {
            this.EgCjBq0SZwJ = z2;
            this.F7NU4MC0GW.setClipToOutline(z2);
        }
    }

    @Override // defpackage.s20
    public final void JlrlGoKF(android.graphics.Outline outline, long j) {
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
        this.fnWB2E7cs = i;
        hkbnNdmy();
    }

    @Override // defpackage.s20
    public final float QoRHpC4k() {
        return this.QoRHpC4k;
    }

    @Override // defpackage.s20
    public final long SH1y5HwkJhh() {
        return this.cnag84Bm;
    }

    @Override // defpackage.s20
    public final void SiPhmbmu(float f) {
        this.QoRHpC4k = f;
        this.F7NU4MC0GW.setCameraDistance(f);
    }

    @Override // defpackage.s20
    public final void SyNS6RMn(float f) {
        this.ez2rX8ReCYw = f;
        this.F7NU4MC0GW.setScaleX(f);
    }

    @Override // defpackage.s20
    public final void UsuH8pd5P(long j) {
        this.cnag84Bm = j;
        this.F7NU4MC0GW.setSpotShadowColor(defpackage.w70.yIx6ChFVk(j));
    }

    @Override // defpackage.s20
    public final long Uv8CGu3G() {
        return this.SyNS6RMn;
    }

    @Override // defpackage.s20
    public final int V7bD7b8KA() {
        return this.fnWB2E7cs;
    }

    @Override // defpackage.s20
    public final float XZx205DYe() {
        return 0.0f;
    }

    @Override // defpackage.s20
    public final void abhbClRa(defpackage.qn qnVar, defpackage.w90 w90Var, defpackage.q20 q20Var, defpackage.s sVar) {
        android.graphics.RecordingCanvas beginRecording;
        defpackage.jb jbVar = this.r1MBDhnF;
        beginRecording = this.F7NU4MC0GW.beginRecording();
        try {
            defpackage.kb kbVar = this.oh6vYeIP;
            defpackage.c0 c0Var = kbVar.IHQe1A4L2xu;
            android.graphics.Canvas canvas = c0Var.IHQe1A4L2xu;
            c0Var.IHQe1A4L2xu = beginRecording;
            defpackage.v5 v5Var = jbVar.xiZrDbcSW0;
            v5Var.G3OKOH3wZRC(qnVar);
            v5Var.kd6TUFXn(w90Var);
            v5Var.r1MBDhnF = q20Var;
            v5Var.EgCjBq0SZwJ(this.adDC3e2L);
            v5Var.QoRHpC4k(c0Var);
            sVar.AARZUJiTa(jbVar);
            kbVar.IHQe1A4L2xu.IHQe1A4L2xu = canvas;
        } finally {
            this.F7NU4MC0GW.endRecording();
        }
    }

    @Override // defpackage.s20
    public final float adDC3e2L() {
        return this.ez2rX8ReCYw;
    }

    @Override // defpackage.s20
    public final void cnag84Bm(int i) {
        this.SH1y5HwkJhh = i;
        android.graphics.Paint paint = this.xiZrDbcSW0;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.xiZrDbcSW0 = paint;
        }
        paint.setBlendMode(defpackage.w70.p4kuH6PDtgom(i));
        hkbnNdmy();
    }

    @Override // defpackage.s20
    public final void ez2rX8ReCYw(long j) {
        this.SyNS6RMn = j;
        this.F7NU4MC0GW.setAmbientShadowColor(defpackage.w70.yIx6ChFVk(j));
    }

    @Override // defpackage.s20
    public final void fnWB2E7cs(defpackage.hb hbVar) {
        android.graphics.Canvas canvas = defpackage.d0.IHQe1A4L2xu;
        ((defpackage.c0) hbVar).IHQe1A4L2xu.drawRenderNode(this.F7NU4MC0GW);
    }

    @Override // defpackage.s20
    public final float frpfPPIgqM9O() {
        return 0.0f;
    }

    public final void hkbnNdmy() {
        int i = this.fnWB2E7cs;
        if (i != 1 && this.SH1y5HwkJhh == 3) {
            lpprD5VAS(this.F7NU4MC0GW, i);
        } else {
            lpprD5VAS(this.F7NU4MC0GW, 1);
        }
    }

    @Override // defpackage.s20
    public final void hyxIchWRW(long j) {
        long j2 = 9223372034707292159L & j;
        android.graphics.RenderNode renderNode = this.F7NU4MC0GW;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            this.F7NU4MC0GW.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.s20
    public final void kNAkVymC(boolean z) {
        this.G3OKOH3wZRC = z;
        IHQe1A4L2xu();
    }

    @Override // defpackage.s20
    public final float kd6TUFXn() {
        return 0.0f;
    }

    public final void lpprD5VAS(android.graphics.RenderNode renderNode, int i) {
        android.graphics.Paint paint = this.xiZrDbcSW0;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.s20
    public final int mAr5m2L7gYDP() {
        return this.SH1y5HwkJhh;
    }

    @Override // defpackage.s20
    public final void nBH8hAHy(float f) {
        this.JlrlGoKF = f;
        this.F7NU4MC0GW.setScaleY(f);
    }

    @Override // defpackage.s20
    public final float oh6vYeIP() {
        return this.riuEU0zW4;
    }

    @Override // defpackage.s20
    public final float p4kuH6PDtgom() {
        return this.DFo87pBq1E5;
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
        return this.JlrlGoKF;
    }

    @Override // defpackage.s20
    public final void xiZrDbcSW0(float f) {
        this.DFo87pBq1E5 = f;
        this.F7NU4MC0GW.setElevation(f);
    }

    @Override // defpackage.s20
    public final boolean yIx6ChFVk() {
        boolean hasDisplayList;
        hasDisplayList = this.F7NU4MC0GW.hasDisplayList();
        return hasDisplayList;
    }
}
