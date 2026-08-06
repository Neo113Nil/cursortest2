package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class g40 implements defpackage.d40 {
    public static final java.util.concurrent.atomic.AtomicBoolean VFeft99leXEK = new java.util.concurrent.atomic.AtomicBoolean(true);
    public float BHfvd2J71qpO;
    public int GE9mJIPrb8gP;
    public boolean IJ0hOnjhPOri;
    public final android.view.RenderNode JhCgjQRTAOCT;
    public int Ns0WNyEWdPsk;
    public boolean P05cfTpS5W5L;
    public android.graphics.Matrix QiMR8OkAhezm;
    public float T1fB7bDYiVJQ;
    public long WDYagTQQm9ns;
    public long WmetiUbpKU9I;
    public float XntWc4eZSQ8j;
    public float ZVVdXbWmyCSK;
    public long e6mdH7fiFuta;
    public float fNwYGHIYeJcR;
    public final defpackage.ld fWTAfUmVKrZq;
    public float gUjdnLbkVAaA;
    public final defpackage.md giKS3J6vZuNy;
    public boolean h3m55N1URyyK;
    public boolean maCixPsq4ml2;
    public android.graphics.Paint oh71FJcDz6S2;
    public long s0TASMVLSWD5;
    public boolean w7APNrr0aGRc;

    public g40(defpackage.u uVar, defpackage.md mdVar, defpackage.ld ldVar) {
        this.giKS3J6vZuNy = mdVar;
        this.fWTAfUmVKrZq = ldVar;
        android.view.RenderNode create = android.view.RenderNode.create("Compose", uVar);
        this.JhCgjQRTAOCT = create;
        this.WDYagTQQm9ns = 0L;
        this.e6mdH7fiFuta = 0L;
        if (VFeft99leXEK.getAndSet(false)) {
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
                defpackage.p41.fWTAfUmVKrZq(create, defpackage.p41.ZpBGe2uQfcn8(create));
                defpackage.p41.JhCgjQRTAOCT(create, defpackage.p41.giKS3J6vZuNy(create));
            }
            defpackage.o41.ZpBGe2uQfcn8(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        zJPqDeoF0Os1(0);
        this.GE9mJIPrb8gP = 0;
        this.Ns0WNyEWdPsk = 3;
        this.fNwYGHIYeJcR = 1.0f;
        this.gUjdnLbkVAaA = 1.0f;
        this.T1fB7bDYiVJQ = 1.0f;
        long j = defpackage.pf.giKS3J6vZuNy;
        this.WmetiUbpKU9I = j;
        this.s0TASMVLSWD5 = j;
        this.ZVVdXbWmyCSK = 8.0f;
    }

    @Override // defpackage.d40
    public final void BHfvd2J71qpO() {
        this.JhCgjQRTAOCT.setTranslationX(0.0f);
    }

    @Override // defpackage.d40
    public final float BXaznwstz2U0() {
        return this.BHfvd2J71qpO;
    }

    @Override // defpackage.d40
    public final long GE9mJIPrb8gP() {
        return this.s0TASMVLSWD5;
    }

    @Override // defpackage.d40
    public final void GcLuU6pT9wO9(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.h3m55N1URyyK = true;
            this.JhCgjQRTAOCT.setPivotX(((int) (this.WDYagTQQm9ns >> 32)) / 2.0f);
            this.JhCgjQRTAOCT.setPivotY(((int) (4294967295L & this.WDYagTQQm9ns)) / 2.0f);
        } else {
            this.h3m55N1URyyK = false;
            this.JhCgjQRTAOCT.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)));
            this.JhCgjQRTAOCT.setPivotY(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.d40
    public final float IBvW5fLsPuHy() {
        return this.T1fB7bDYiVJQ;
    }

    @Override // defpackage.d40
    public final float IJ0hOnjhPOri() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final float JhCgjQRTAOCT() {
        return this.gUjdnLbkVAaA;
    }

    @Override // defpackage.d40
    public final boolean KrtOTfE6jiS2() {
        return this.JhCgjQRTAOCT.isValid();
    }

    @Override // defpackage.d40
    public final void Mearx7yMn90V(float f) {
        this.ZVVdXbWmyCSK = f;
        this.JhCgjQRTAOCT.setCameraDistance(-f);
    }

    @Override // defpackage.d40
    public final void Ns0WNyEWdPsk(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.WmetiUbpKU9I = j;
            defpackage.p41.fWTAfUmVKrZq(this.JhCgjQRTAOCT, defpackage.ok0.PS16moFv2oLu(j));
        }
    }

    @Override // defpackage.d40
    public final void OcTWLQzke1i2(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.s0TASMVLSWD5 = j;
            defpackage.p41.JhCgjQRTAOCT(this.JhCgjQRTAOCT, defpackage.ok0.PS16moFv2oLu(j));
        }
    }

    @Override // defpackage.d40
    public final void P05cfTpS5W5L(float f) {
        this.BHfvd2J71qpO = f;
        this.JhCgjQRTAOCT.setRotation(f);
    }

    @Override // defpackage.d40
    public final void QiMR8OkAhezm() {
        this.JhCgjQRTAOCT.setTranslationY(0.0f);
    }

    @Override // defpackage.d40
    public final void T1fB7bDYiVJQ(int i) {
        if (this.Ns0WNyEWdPsk == i) {
            return;
        }
        this.Ns0WNyEWdPsk = i;
        android.graphics.Paint paint = this.oh71FJcDz6S2;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.oh71FJcDz6S2 = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.h0.Rl68HURFBtL3(i)));
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
        android.graphics.Canvas start = this.JhCgjQRTAOCT.start(java.lang.Math.max((int) (this.WDYagTQQm9ns >> 32), (int) (this.e6mdH7fiFuta >> 32)), java.lang.Math.max((int) (this.WDYagTQQm9ns & 4294967295L), (int) (this.e6mdH7fiFuta & 4294967295L)));
        try {
            defpackage.DR1ov5IJDbR8 dR1ov5IJDbR8 = this.giKS3J6vZuNy.ZpBGe2uQfcn8;
            android.graphics.Canvas canvas = dR1ov5IJDbR8.ZpBGe2uQfcn8;
            dR1ov5IJDbR8.ZpBGe2uQfcn8 = start;
            defpackage.ld ldVar = this.fWTAfUmVKrZq;
            defpackage.a7 a7Var = ldVar.oh71FJcDz6S2;
            long EPEWHACkMcF1 = defpackage.w60.EPEWHACkMcF1(this.WDYagTQQm9ns);
            defpackage.kd kdVar = ((defpackage.ld) a7Var.JhCgjQRTAOCT).WDYagTQQm9ns;
            defpackage.hp hpVar2 = kdVar.ZpBGe2uQfcn8;
            defpackage.sc0 sc0Var2 = kdVar.giKS3J6vZuNy;
            defpackage.id oh71FJcDz6S2 = a7Var.oh71FJcDz6S2();
            long Ns0WNyEWdPsk = a7Var.Ns0WNyEWdPsk();
            defpackage.b40 b40Var2 = (defpackage.b40) a7Var.fWTAfUmVKrZq;
            a7Var.w7APNrr0aGRc(hpVar);
            a7Var.maCixPsq4ml2(sc0Var);
            a7Var.ZVVdXbWmyCSK(dR1ov5IJDbR8);
            a7Var.IJ0hOnjhPOri(EPEWHACkMcF1);
            a7Var.fWTAfUmVKrZq = b40Var;
            dR1ov5IJDbR8.fNwYGHIYeJcR();
            try {
                yjS0G3zEDWNX.P05cfTpS5W5L(ldVar);
                dR1ov5IJDbR8.e6mdH7fiFuta();
                a7Var.w7APNrr0aGRc(hpVar2);
                a7Var.maCixPsq4ml2(sc0Var2);
                a7Var.ZVVdXbWmyCSK(oh71FJcDz6S2);
                a7Var.IJ0hOnjhPOri(Ns0WNyEWdPsk);
                a7Var.fWTAfUmVKrZq = b40Var2;
                dR1ov5IJDbR8.ZpBGe2uQfcn8 = canvas;
            } catch (java.lang.Throwable th) {
                dR1ov5IJDbR8.e6mdH7fiFuta();
                defpackage.a7 a7Var2 = ldVar.oh71FJcDz6S2;
                a7Var2.w7APNrr0aGRc(hpVar2);
                a7Var2.maCixPsq4ml2(sc0Var2);
                a7Var2.ZVVdXbWmyCSK(oh71FJcDz6S2);
                a7Var2.IJ0hOnjhPOri(Ns0WNyEWdPsk);
                a7Var2.fWTAfUmVKrZq = b40Var2;
                throw th;
            }
        } finally {
            this.JhCgjQRTAOCT.end(start);
        }
    }

    @Override // defpackage.d40
    public final void WDYagTQQm9ns(float f) {
        this.XntWc4eZSQ8j = f;
        this.JhCgjQRTAOCT.setElevation(f);
    }

    public final void Wc0TdmRSwbbi() {
        int i = this.GE9mJIPrb8gP;
        if (i != 1 && this.Ns0WNyEWdPsk == 3) {
            zJPqDeoF0Os1(i);
        } else {
            zJPqDeoF0Os1(1);
        }
    }

    @Override // defpackage.d40
    public final void WmetiUbpKU9I() {
        defpackage.o41.ZpBGe2uQfcn8(this.JhCgjQRTAOCT);
    }

    @Override // defpackage.d40
    public final float XntWc4eZSQ8j() {
        return this.ZVVdXbWmyCSK;
    }

    @Override // defpackage.d40
    public final void ZVVdXbWmyCSK(defpackage.id idVar) {
        android.graphics.Canvas canvas = defpackage.a.ZpBGe2uQfcn8;
        android.view.DisplayListCanvas displayListCanvas = ((defpackage.DR1ov5IJDbR8) idVar).ZpBGe2uQfcn8;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.JhCgjQRTAOCT);
    }

    @Override // defpackage.d40
    public final float ZpBGe2uQfcn8() {
        return this.fNwYGHIYeJcR;
    }

    @Override // defpackage.d40
    public final void blKFvluuDQOf(float f) {
        this.T1fB7bDYiVJQ = f;
        this.JhCgjQRTAOCT.setScaleY(f);
    }

    @Override // defpackage.d40
    public final void dG7RjM6DqYVL(int i) {
        this.GE9mJIPrb8gP = i;
        Wc0TdmRSwbbi();
    }

    @Override // defpackage.d40
    public final void e6mdH7fiFuta() {
        this.JhCgjQRTAOCT.setRotationY(0.0f);
    }

    @Override // defpackage.d40
    public final void fNwYGHIYeJcR(android.graphics.Outline outline, long j) {
        this.e6mdH7fiFuta = j;
        this.JhCgjQRTAOCT.setOutline(outline);
        this.P05cfTpS5W5L = outline != null;
        w6IV1lieBIux();
    }

    @Override // defpackage.d40
    public final void fWTAfUmVKrZq(float f) {
        this.fNwYGHIYeJcR = f;
        this.JhCgjQRTAOCT.setAlpha(f);
    }

    @Override // defpackage.d40
    public final float frSwwKIlbUhK() {
        return this.XntWc4eZSQ8j;
    }

    @Override // defpackage.d40
    public final void gUjdnLbkVAaA(float f) {
        this.gUjdnLbkVAaA = f;
        this.JhCgjQRTAOCT.setScaleX(f);
    }

    @Override // defpackage.d40
    public final void giKS3J6vZuNy() {
        this.JhCgjQRTAOCT.setRotationX(0.0f);
    }

    @Override // defpackage.d40
    public final void h3m55N1URyyK() {
        Wc0TdmRSwbbi();
    }

    @Override // defpackage.d40
    public final int hH0RRJrNssvh() {
        return this.Ns0WNyEWdPsk;
    }

    @Override // defpackage.d40
    public final float jjTN4uUnoyEn() {
        return 0.0f;
    }

    @Override // defpackage.d40
    public final int maCixPsq4ml2() {
        return this.GE9mJIPrb8gP;
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
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.JhCgjQRTAOCT.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (defpackage.u90.ZpBGe2uQfcn8(this.WDYagTQQm9ns, j)) {
            return;
        }
        if (this.h3m55N1URyyK) {
            this.JhCgjQRTAOCT.setPivotX(i3 / 2.0f);
            this.JhCgjQRTAOCT.setPivotY(i4 / 2.0f);
        }
        this.WDYagTQQm9ns = j;
    }

    @Override // defpackage.d40
    public final float s0TASMVLSWD5() {
        return 0.0f;
    }

    public final void w6IV1lieBIux() {
        boolean z = this.w7APNrr0aGRc;
        boolean z2 = false;
        boolean z3 = z && !this.P05cfTpS5W5L;
        if (z && this.P05cfTpS5W5L) {
            z2 = true;
        }
        if (z3 != this.maCixPsq4ml2) {
            this.maCixPsq4ml2 = z3;
            this.JhCgjQRTAOCT.setClipToBounds(z3);
        }
        if (z2 != this.IJ0hOnjhPOri) {
            this.IJ0hOnjhPOri = z2;
            this.JhCgjQRTAOCT.setClipToOutline(z2);
        }
    }

    @Override // defpackage.d40
    public final void w7APNrr0aGRc(boolean z) {
        this.w7APNrr0aGRc = z;
        w6IV1lieBIux();
    }

    @Override // defpackage.d40
    public final long xahdJg25P1Bv() {
        return this.WmetiUbpKU9I;
    }

    public final void zJPqDeoF0Os1(int i) {
        android.view.RenderNode renderNode = this.JhCgjQRTAOCT;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.oh71FJcDz6S2);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.oh71FJcDz6S2);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.oh71FJcDz6S2);
            renderNode.setHasOverlappingRendering(true);
        }
    }
}
