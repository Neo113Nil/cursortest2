package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vy implements qy {
    public Matrix AvO7iQsrTN;
    public float E7jCp8Ls;
    public Paint EljAMC1QTz;
    public int JFJ3QoxA;
    public boolean Mjvvu5DE;
    public long OOA6hdeuvCS;
    public float WIEu4Ya2g8;
    public final u9 X1lG3V04pd;
    public float XnEVoBF0td1l;
    public final v9 Yi7zF1RB1;
    public boolean YmKjaVtbfp5Z;
    public boolean encWxUiV2;
    public long iwATDS1i01k;
    public int jivtDDk9H;
    public boolean mE4lRynR;
    public float mOu10nynGul;
    public float rQPn8YBR;
    public long uFEq9NpZ;
    public final RenderNode xqGvceK5x;

    public vy() {
        v9 v9Var = new v9();
        u9 u9Var = new u9();
        this.Yi7zF1RB1 = v9Var;
        this.X1lG3V04pd = u9Var;
        RenderNode X1lG3V04pd = uy.X1lG3V04pd();
        this.xqGvceK5x = X1lG3V04pd;
        this.OOA6hdeuvCS = 0L;
        X1lG3V04pd.setClipToBounds(false);
        dqB83aoLBB(X1lG3V04pd, 0);
        this.mOu10nynGul = 1.0f;
        this.JFJ3QoxA = 3;
        this.rQPn8YBR = 1.0f;
        this.E7jCp8Ls = 1.0f;
        long j = yb.Yi7zF1RB1;
        this.uFEq9NpZ = j;
        this.iwATDS1i01k = j;
        this.WIEu4Ya2g8 = 8.0f;
        this.jivtDDk9H = 0;
    }

    @Override // defpackage.qy
    public final boolean A1EKNP6CxJ() {
        boolean hasDisplayList;
        hasDisplayList = this.xqGvceK5x.hasDisplayList();
        return hasDisplayList;
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
        this.xqGvceK5x.setOutline(outline);
        this.encWxUiV2 = outline != null;
        GWasM1elztuh();
    }

    @Override // defpackage.qy
    public final Matrix EXrPz3p7hFb() {
        Matrix matrix = this.AvO7iQsrTN;
        if (matrix == null) {
            matrix = new Matrix();
            this.AvO7iQsrTN = matrix;
        }
        this.xqGvceK5x.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.qy
    public final void EljAMC1QTz(float f) {
        this.XnEVoBF0td1l = f;
        this.xqGvceK5x.setElevation(f);
    }

    public final void GWasM1elztuh() {
        boolean z = this.YmKjaVtbfp5Z;
        boolean z2 = false;
        boolean z3 = z && !this.encWxUiV2;
        if (z && this.encWxUiV2) {
            z2 = true;
        }
        if (z3 != this.Mjvvu5DE) {
            this.Mjvvu5DE = z3;
            this.xqGvceK5x.setClipToBounds(z3);
        }
        if (z2 != this.mE4lRynR) {
            this.mE4lRynR = z2;
            this.xqGvceK5x.setClipToOutline(z2);
        }
    }

    @Override // defpackage.qy
    public final int HFYAaqMd6() {
        return this.JFJ3QoxA;
    }

    @Override // defpackage.qy
    public final long JFJ3QoxA() {
        return this.iwATDS1i01k;
    }

    @Override // defpackage.qy
    public final void M3K9sHhK(long j) {
        this.iwATDS1i01k = j;
        this.xqGvceK5x.setSpotShadowColor(ki1.HFYAaqMd6(j));
    }

    @Override // defpackage.qy
    public final float MZhzXH72() {
        return this.E7jCp8Ls;
    }

    @Override // defpackage.qy
    public final float Mjvvu5DE() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final float OOA6hdeuvCS() {
        return this.rQPn8YBR;
    }

    @Override // defpackage.qy
    public final long TpUsjqg3bxO() {
        return this.uFEq9NpZ;
    }

    public final void VeqTn1PQw7() {
        int i = this.jivtDDk9H;
        if (i != 1 && this.JFJ3QoxA == 3) {
            dqB83aoLBB(this.xqGvceK5x, i);
        } else {
            dqB83aoLBB(this.xqGvceK5x, 1);
        }
    }

    @Override // defpackage.qy
    public final float WIEu4Ya2g8() {
        return this.WIEu4Ya2g8;
    }

    @Override // defpackage.qy
    public final s6 WRKkgoJXwDn() {
        return null;
    }

    @Override // defpackage.qy
    public final void WdrkLMV3xh(el elVar, p50 p50Var, oy oyVar, NWXxPwoOUSX9 nWXxPwoOUSX9) {
        RecordingCanvas beginRecording;
        u9 u9Var = this.X1lG3V04pd;
        beginRecording = this.xqGvceK5x.beginRecording();
        try {
            v9 v9Var = this.Yi7zF1RB1;
            Jz7YUlEP53 jz7YUlEP53 = v9Var.GWasM1elztuh;
            Canvas canvas = jz7YUlEP53.GWasM1elztuh;
            jz7YUlEP53.GWasM1elztuh = beginRecording;
            f4 f4Var = u9Var.EljAMC1QTz;
            f4Var.Mjvvu5DE(elVar);
            f4Var.mE4lRynR(p50Var);
            f4Var.X1lG3V04pd = oyVar;
            f4Var.jivtDDk9H(this.OOA6hdeuvCS);
            f4Var.YmKjaVtbfp5Z(jz7YUlEP53);
            nWXxPwoOUSX9.mOu10nynGul(u9Var);
            v9Var.GWasM1elztuh.GWasM1elztuh = canvas;
        } finally {
            this.xqGvceK5x.endRecording();
        }
    }

    @Override // defpackage.qy
    public final void X1lG3V04pd() {
        this.xqGvceK5x.setRotationX(0.0f);
    }

    @Override // defpackage.qy
    public final void XnEVoBF0td1l() {
        Paint paint = this.EljAMC1QTz;
        if (paint == null) {
            paint = new Paint();
            this.EljAMC1QTz = paint;
        }
        paint.setColorFilter(null);
        VeqTn1PQw7();
    }

    @Override // defpackage.qy
    public final void Y6hRI1cF8(boolean z) {
        this.YmKjaVtbfp5Z = z;
        GWasM1elztuh();
    }

    @Override // defpackage.qy
    public final void YZjbz8VdP5(float f) {
        this.WIEu4Ya2g8 = f;
        this.xqGvceK5x.setCameraDistance(f);
    }

    @Override // defpackage.qy
    public final float Yi7zF1RB1() {
        return this.mOu10nynGul;
    }

    @Override // defpackage.qy
    public final void YmKjaVtbfp5Z() {
        this.xqGvceK5x.discardDisplayList();
    }

    @Override // defpackage.qy
    public final void arNh8D4Z5gB(int i) {
        this.jivtDDk9H = i;
        VeqTn1PQw7();
    }

    @Override // defpackage.qy
    public final int cilMamHF() {
        return this.jivtDDk9H;
    }

    public final void dqB83aoLBB(RenderNode renderNode, int i) {
        Paint paint = this.EljAMC1QTz;
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

    @Override // defpackage.qy
    public final float eUH21U3apd() {
        return this.XnEVoBF0td1l;
    }

    @Override // defpackage.qy
    public final void encWxUiV2() {
        this.xqGvceK5x.setTranslationY(0.0f);
    }

    @Override // defpackage.qy
    public final void iwATDS1i01k(int i) {
        this.JFJ3QoxA = i;
        Paint paint = this.EljAMC1QTz;
        if (paint == null) {
            paint = new Paint();
            this.EljAMC1QTz = paint;
        }
        paint.setBlendMode(fb1.Uxq83abb04(i));
        VeqTn1PQw7();
    }

    @Override // defpackage.qy
    public final void jivtDDk9H(s9 s9Var) {
        Canvas canvas = ddkiCTz5mZ.GWasM1elztuh;
        ((Jz7YUlEP53) s9Var).GWasM1elztuh.drawRenderNode(this.xqGvceK5x);
    }

    @Override // defpackage.qy
    public final void k8h8IjolWQ(float f) {
        this.E7jCp8Ls = f;
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
        this.xqGvceK5x.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.OOA6hdeuvCS = o30.CMh55RymNfS(j);
    }

    @Override // defpackage.qy
    public final void pog2g9KITJA() {
        this.xqGvceK5x.setRotationZ(0.0f);
    }

    @Override // defpackage.qy
    public final void rQPn8YBR(long j) {
        this.uFEq9NpZ = j;
        this.xqGvceK5x.setAmbientShadowColor(ki1.HFYAaqMd6(j));
    }

    @Override // defpackage.qy
    public final void rezfBrjOrqK(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.xqGvceK5x;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.xqGvceK5x.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.qy
    public final void uFEq9NpZ(float f) {
        this.rQPn8YBR = f;
        this.xqGvceK5x.setScaleX(f);
    }

    @Override // defpackage.qy
    public final void xqGvceK5x(float f) {
        this.mOu10nynGul = f;
        this.xqGvceK5x.setAlpha(f);
    }
}
