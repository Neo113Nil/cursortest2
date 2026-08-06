package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i40 implements defpackage.d40 {
    public boolean BHfvd2J71qpO;
    public int GE9mJIPrb8gP;
    public final android.graphics.RenderNode JhCgjQRTAOCT;
    public float Ns0WNyEWdPsk;
    public boolean P05cfTpS5W5L;
    public android.graphics.Matrix QiMR8OkAhezm;
    public long T1fB7bDYiVJQ;
    public long WDYagTQQm9ns;
    public float WmetiUbpKU9I;
    public float XntWc4eZSQ8j;
    public boolean ZVVdXbWmyCSK;
    public float e6mdH7fiFuta;
    public float fNwYGHIYeJcR;
    public final defpackage.ld fWTAfUmVKrZq;
    public long gUjdnLbkVAaA;
    public final defpackage.md giKS3J6vZuNy;
    public float h3m55N1URyyK;
    public android.graphics.Paint oh71FJcDz6S2;
    public boolean s0TASMVLSWD5;
    public int w7APNrr0aGRc;

    public i40() {
        defpackage.md mdVar = new defpackage.md();
        defpackage.ld ldVar = new defpackage.ld();
        this.giKS3J6vZuNy = mdVar;
        this.fWTAfUmVKrZq = ldVar;
        android.graphics.RenderNode fWTAfUmVKrZq = defpackage.h40.fWTAfUmVKrZq();
        this.JhCgjQRTAOCT = fWTAfUmVKrZq;
        this.WDYagTQQm9ns = 0L;
        fWTAfUmVKrZq.setClipToBounds(false);
        zJPqDeoF0Os1(fWTAfUmVKrZq, 0);
        this.e6mdH7fiFuta = 1.0f;
        this.GE9mJIPrb8gP = 3;
        this.Ns0WNyEWdPsk = 1.0f;
        this.fNwYGHIYeJcR = 1.0f;
        long j = defpackage.pf.giKS3J6vZuNy;
        this.gUjdnLbkVAaA = j;
        this.T1fB7bDYiVJQ = j;
        this.WmetiUbpKU9I = 8.0f;
        this.w7APNrr0aGRc = 0;
    }

    @Override // defpackage.d40
    public final void BHfvd2J71qpO() {
        this.JhCgjQRTAOCT.setTranslationX(0.0f);
    }

    @Override // defpackage.d40
    public final float BXaznwstz2U0() {
        return this.XntWc4eZSQ8j;
    }

    @Override // defpackage.d40
    public final long GE9mJIPrb8gP() {
        return this.T1fB7bDYiVJQ;
    }

    @Override // defpackage.d40
    public final void GcLuU6pT9wO9(long j) {
        long j2 = 9223372034707292159L & j;
        android.graphics.RenderNode renderNode = this.JhCgjQRTAOCT;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            this.JhCgjQRTAOCT.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.d40
    public final float IBvW5fLsPuHy() {
        return this.fNwYGHIYeJcR;
    }

    @Override // defpackage.d40
    public final float IJ0hOnjhPOri() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final float JhCgjQRTAOCT() {
        return this.Ns0WNyEWdPsk;
    }

    @Override // defpackage.d40
    public final boolean KrtOTfE6jiS2() {
        boolean hasDisplayList;
        hasDisplayList = this.JhCgjQRTAOCT.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.d40
    public final void Mearx7yMn90V(float f) {
        this.WmetiUbpKU9I = f;
        this.JhCgjQRTAOCT.setCameraDistance(f);
    }

    @Override // defpackage.d40
    public final void Ns0WNyEWdPsk(long j) {
        this.gUjdnLbkVAaA = j;
        this.JhCgjQRTAOCT.setAmbientShadowColor(defpackage.ok0.PS16moFv2oLu(j));
    }

    @Override // defpackage.d40
    public final void OcTWLQzke1i2(long j) {
        this.T1fB7bDYiVJQ = j;
        this.JhCgjQRTAOCT.setSpotShadowColor(defpackage.ok0.PS16moFv2oLu(j));
    }

    @Override // defpackage.d40
    public final void P05cfTpS5W5L(float f) {
        this.XntWc4eZSQ8j = f;
        this.JhCgjQRTAOCT.setRotationZ(f);
    }

    @Override // defpackage.d40
    public final void QiMR8OkAhezm() {
        this.JhCgjQRTAOCT.setTranslationY(0.0f);
    }

    @Override // defpackage.d40
    public final void T1fB7bDYiVJQ(int i) {
        this.GE9mJIPrb8gP = i;
        android.graphics.Paint paint = this.oh71FJcDz6S2;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.oh71FJcDz6S2 = paint;
        }
        paint.setBlendMode(defpackage.h0.FhgBoOud6zyW(i));
        Wc0TdmRSwbbi();
    }

    @Override // defpackage.d40
    public final android.graphics.Matrix UmgHb6n58gfG() {
        android.graphics.Matrix matrix = this.QiMR8OkAhezm;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.QiMR8OkAhezm = matrix;
        }
        this.JhCgjQRTAOCT.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.d40
    public final void VFeft99leXEK(defpackage.hp hpVar, defpackage.sc0 sc0Var, defpackage.b40 b40Var, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX) {
        android.graphics.RecordingCanvas beginRecording;
        defpackage.ld ldVar = this.fWTAfUmVKrZq;
        beginRecording = this.JhCgjQRTAOCT.beginRecording();
        try {
            defpackage.md mdVar = this.giKS3J6vZuNy;
            defpackage.DR1ov5IJDbR8 dR1ov5IJDbR8 = mdVar.ZpBGe2uQfcn8;
            android.graphics.Canvas canvas = dR1ov5IJDbR8.ZpBGe2uQfcn8;
            dR1ov5IJDbR8.ZpBGe2uQfcn8 = beginRecording;
            defpackage.a7 a7Var = ldVar.oh71FJcDz6S2;
            a7Var.w7APNrr0aGRc(hpVar);
            a7Var.maCixPsq4ml2(sc0Var);
            a7Var.fWTAfUmVKrZq = b40Var;
            a7Var.IJ0hOnjhPOri(this.WDYagTQQm9ns);
            a7Var.ZVVdXbWmyCSK(dR1ov5IJDbR8);
            yjS0G3zEDWNX.P05cfTpS5W5L(ldVar);
            mdVar.ZpBGe2uQfcn8.ZpBGe2uQfcn8 = canvas;
        } finally {
            this.JhCgjQRTAOCT.endRecording();
        }
    }

    @Override // defpackage.d40
    public final void WDYagTQQm9ns(float f) {
        this.h3m55N1URyyK = f;
        this.JhCgjQRTAOCT.setElevation(f);
    }

    public final void Wc0TdmRSwbbi() {
        int i = this.w7APNrr0aGRc;
        if (i != 1 && this.GE9mJIPrb8gP == 3) {
            zJPqDeoF0Os1(this.JhCgjQRTAOCT, i);
        } else {
            zJPqDeoF0Os1(this.JhCgjQRTAOCT, 1);
        }
    }

    @Override // defpackage.d40
    public final void WmetiUbpKU9I() {
        this.JhCgjQRTAOCT.discardDisplayList();
    }

    @Override // defpackage.d40
    public final float XntWc4eZSQ8j() {
        return this.WmetiUbpKU9I;
    }

    @Override // defpackage.d40
    public final void ZVVdXbWmyCSK(defpackage.id idVar) {
        android.graphics.Canvas canvas = defpackage.a.ZpBGe2uQfcn8;
        ((defpackage.DR1ov5IJDbR8) idVar).ZpBGe2uQfcn8.drawRenderNode(this.JhCgjQRTAOCT);
    }

    @Override // defpackage.d40
    public final float ZpBGe2uQfcn8() {
        return this.e6mdH7fiFuta;
    }

    @Override // defpackage.d40
    public final void blKFvluuDQOf(float f) {
        this.fNwYGHIYeJcR = f;
        this.JhCgjQRTAOCT.setScaleY(f);
    }

    @Override // defpackage.d40
    public final void dG7RjM6DqYVL(int i) {
        this.w7APNrr0aGRc = i;
        Wc0TdmRSwbbi();
    }

    @Override // defpackage.d40
    public final void e6mdH7fiFuta() {
        this.JhCgjQRTAOCT.setRotationY(0.0f);
    }

    @Override // defpackage.d40
    public final void fNwYGHIYeJcR(android.graphics.Outline outline, long j) {
        this.JhCgjQRTAOCT.setOutline(outline);
        this.P05cfTpS5W5L = outline != null;
        w6IV1lieBIux();
    }

    @Override // defpackage.d40
    public final void fWTAfUmVKrZq(float f) {
        this.e6mdH7fiFuta = f;
        this.JhCgjQRTAOCT.setAlpha(f);
    }

    @Override // defpackage.d40
    public final float frSwwKIlbUhK() {
        return this.h3m55N1URyyK;
    }

    @Override // defpackage.d40
    public final void gUjdnLbkVAaA(float f) {
        this.Ns0WNyEWdPsk = f;
        this.JhCgjQRTAOCT.setScaleX(f);
    }

    @Override // defpackage.d40
    public final void giKS3J6vZuNy() {
        this.JhCgjQRTAOCT.setRotationX(0.0f);
    }

    @Override // defpackage.d40
    public final void h3m55N1URyyK() {
        android.graphics.Paint paint = this.oh71FJcDz6S2;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.oh71FJcDz6S2 = paint;
        }
        paint.setColorFilter(null);
        Wc0TdmRSwbbi();
    }

    @Override // defpackage.d40
    public final int hH0RRJrNssvh() {
        return this.GE9mJIPrb8gP;
    }

    @Override // defpackage.d40
    public final float jjTN4uUnoyEn() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final int maCixPsq4ml2() {
        return this.w7APNrr0aGRc;
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
        this.JhCgjQRTAOCT.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.WDYagTQQm9ns = defpackage.w60.EPEWHACkMcF1(j);
    }

    @Override // defpackage.d40
    public final float s0TASMVLSWD5() {
        return 0.0f;
    }

    public final void w6IV1lieBIux() {
        boolean z = this.s0TASMVLSWD5;
        boolean z2 = false;
        boolean z3 = z && !this.P05cfTpS5W5L;
        if (z && this.P05cfTpS5W5L) {
            z2 = true;
        }
        if (z3 != this.BHfvd2J71qpO) {
            this.BHfvd2J71qpO = z3;
            this.JhCgjQRTAOCT.setClipToBounds(z3);
        }
        if (z2 != this.ZVVdXbWmyCSK) {
            this.ZVVdXbWmyCSK = z2;
            this.JhCgjQRTAOCT.setClipToOutline(z2);
        }
    }

    @Override // defpackage.d40
    public final void w7APNrr0aGRc(boolean z) {
        this.s0TASMVLSWD5 = z;
        w6IV1lieBIux();
    }

    @Override // defpackage.d40
    public final long xahdJg25P1Bv() {
        return this.gUjdnLbkVAaA;
    }

    public final void zJPqDeoF0Os1(android.graphics.RenderNode renderNode, int i) {
        android.graphics.Paint paint = this.oh71FJcDz6S2;
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
}
