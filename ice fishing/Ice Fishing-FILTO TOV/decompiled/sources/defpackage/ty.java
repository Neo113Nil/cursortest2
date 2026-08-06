package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ty implements qy {
    public static final AtomicBoolean lv06NcmrQ = new AtomicBoolean(true);
    public Matrix AvO7iQsrTN;
    public float E7jCp8Ls;
    public Paint EljAMC1QTz;
    public int JFJ3QoxA;
    public long Mjvvu5DE;
    public long OOA6hdeuvCS;
    public float WIEu4Ya2g8;
    public final u9 X1lG3V04pd;
    public boolean XnEVoBF0td1l;
    public boolean Y6hRI1cF8;
    public final v9 Yi7zF1RB1;
    public long YmKjaVtbfp5Z;
    public boolean cilMamHF;
    public boolean encWxUiV2;
    public float iwATDS1i01k;
    public boolean jivtDDk9H;
    public float mE4lRynR;
    public long mOu10nynGul;
    public int rQPn8YBR;
    public float uFEq9NpZ;
    public final RenderNode xqGvceK5x;

    public ty(c cVar, v9 v9Var, u9 u9Var) {
        this.Yi7zF1RB1 = v9Var;
        this.X1lG3V04pd = u9Var;
        RenderNode create = RenderNode.create("Compose", cVar);
        this.xqGvceK5x = create;
        this.OOA6hdeuvCS = 0L;
        this.mOu10nynGul = 0L;
        if (lv06NcmrQ.getAndSet(false)) {
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
            if (Build.VERSION.SDK_INT >= 28) {
                hu0.X1lG3V04pd(create, hu0.GWasM1elztuh(create));
                hu0.xqGvceK5x(create, hu0.Yi7zF1RB1(create));
            }
            gu0.GWasM1elztuh(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        dqB83aoLBB(0);
        this.JFJ3QoxA = 0;
        this.rQPn8YBR = 3;
        this.E7jCp8Ls = 1.0f;
        this.uFEq9NpZ = 1.0f;
        this.iwATDS1i01k = 1.0f;
        long j = yb.Yi7zF1RB1;
        this.YmKjaVtbfp5Z = j;
        this.Mjvvu5DE = j;
        this.mE4lRynR = 8.0f;
    }

    @Override // defpackage.qy
    public final boolean A1EKNP6CxJ() {
        return this.xqGvceK5x.isValid();
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
        this.mOu10nynGul = j;
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
        this.WIEu4Ya2g8 = f;
        this.xqGvceK5x.setElevation(f);
    }

    public final void GWasM1elztuh() {
        boolean z = this.jivtDDk9H;
        boolean z2 = false;
        boolean z3 = z && !this.encWxUiV2;
        if (z && this.encWxUiV2) {
            z2 = true;
        }
        if (z3 != this.Y6hRI1cF8) {
            this.Y6hRI1cF8 = z3;
            this.xqGvceK5x.setClipToBounds(z3);
        }
        if (z2 != this.cilMamHF) {
            this.cilMamHF = z2;
            this.xqGvceK5x.setClipToOutline(z2);
        }
    }

    @Override // defpackage.qy
    public final int HFYAaqMd6() {
        return this.rQPn8YBR;
    }

    @Override // defpackage.qy
    public final long JFJ3QoxA() {
        return this.Mjvvu5DE;
    }

    @Override // defpackage.qy
    public final void M3K9sHhK(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.Mjvvu5DE = j;
            hu0.xqGvceK5x(this.xqGvceK5x, ki1.HFYAaqMd6(j));
        }
    }

    @Override // defpackage.qy
    public final float MZhzXH72() {
        return this.iwATDS1i01k;
    }

    @Override // defpackage.qy
    public final float Mjvvu5DE() {
        return 0.0f;
    }

    @Override // defpackage.qy
    public final float OOA6hdeuvCS() {
        return this.uFEq9NpZ;
    }

    @Override // defpackage.qy
    public final long TpUsjqg3bxO() {
        return this.YmKjaVtbfp5Z;
    }

    public final void VeqTn1PQw7() {
        int i = this.JFJ3QoxA;
        if (i != 1 && this.rQPn8YBR == 3) {
            dqB83aoLBB(i);
        } else {
            dqB83aoLBB(1);
        }
    }

    @Override // defpackage.qy
    public final float WIEu4Ya2g8() {
        return this.mE4lRynR;
    }

    @Override // defpackage.qy
    public final s6 WRKkgoJXwDn() {
        return null;
    }

    @Override // defpackage.qy
    public final void WdrkLMV3xh(el elVar, p50 p50Var, oy oyVar, NWXxPwoOUSX9 nWXxPwoOUSX9) {
        Canvas start = this.xqGvceK5x.start(Math.max((int) (this.OOA6hdeuvCS >> 32), (int) (this.mOu10nynGul >> 32)), Math.max((int) (this.OOA6hdeuvCS & 4294967295L), (int) (this.mOu10nynGul & 4294967295L)));
        try {
            Jz7YUlEP53 jz7YUlEP53 = this.Yi7zF1RB1.GWasM1elztuh;
            Canvas canvas = jz7YUlEP53.GWasM1elztuh;
            jz7YUlEP53.GWasM1elztuh = start;
            u9 u9Var = this.X1lG3V04pd;
            f4 f4Var = u9Var.EljAMC1QTz;
            long CMh55RymNfS = o30.CMh55RymNfS(this.OOA6hdeuvCS);
            t9 t9Var = ((u9) f4Var.xqGvceK5x).OOA6hdeuvCS;
            el elVar2 = t9Var.GWasM1elztuh;
            p50 p50Var2 = t9Var.Yi7zF1RB1;
            s9 EljAMC1QTz = f4Var.EljAMC1QTz();
            long mOu10nynGul = f4Var.mOu10nynGul();
            oy oyVar2 = (oy) f4Var.X1lG3V04pd;
            f4Var.Mjvvu5DE(elVar);
            f4Var.mE4lRynR(p50Var);
            f4Var.YmKjaVtbfp5Z(jz7YUlEP53);
            f4Var.jivtDDk9H(CMh55RymNfS);
            f4Var.X1lG3V04pd = oyVar;
            jz7YUlEP53.E7jCp8Ls();
            try {
                nWXxPwoOUSX9.mOu10nynGul(u9Var);
                jz7YUlEP53.JFJ3QoxA();
                f4Var.Mjvvu5DE(elVar2);
                f4Var.mE4lRynR(p50Var2);
                f4Var.YmKjaVtbfp5Z(EljAMC1QTz);
                f4Var.jivtDDk9H(mOu10nynGul);
                f4Var.X1lG3V04pd = oyVar2;
                jz7YUlEP53.GWasM1elztuh = canvas;
            } catch (Throwable th) {
                jz7YUlEP53.JFJ3QoxA();
                f4 f4Var2 = u9Var.EljAMC1QTz;
                f4Var2.Mjvvu5DE(elVar2);
                f4Var2.mE4lRynR(p50Var2);
                f4Var2.YmKjaVtbfp5Z(EljAMC1QTz);
                f4Var2.jivtDDk9H(mOu10nynGul);
                f4Var2.X1lG3V04pd = oyVar2;
                throw th;
            }
        } finally {
            this.xqGvceK5x.end(start);
        }
    }

    @Override // defpackage.qy
    public final void X1lG3V04pd() {
        this.xqGvceK5x.setRotationX(0.0f);
    }

    @Override // defpackage.qy
    public final void XnEVoBF0td1l() {
        VeqTn1PQw7();
    }

    @Override // defpackage.qy
    public final void Y6hRI1cF8(boolean z) {
        this.jivtDDk9H = z;
        GWasM1elztuh();
    }

    @Override // defpackage.qy
    public final void YZjbz8VdP5(float f) {
        this.mE4lRynR = f;
        this.xqGvceK5x.setCameraDistance(-f);
    }

    @Override // defpackage.qy
    public final float Yi7zF1RB1() {
        return this.E7jCp8Ls;
    }

    @Override // defpackage.qy
    public final void YmKjaVtbfp5Z() {
        gu0.GWasM1elztuh(this.xqGvceK5x);
    }

    @Override // defpackage.qy
    public final void arNh8D4Z5gB(int i) {
        this.JFJ3QoxA = i;
        VeqTn1PQw7();
    }

    @Override // defpackage.qy
    public final int cilMamHF() {
        return this.JFJ3QoxA;
    }

    public final void dqB83aoLBB(int i) {
        RenderNode renderNode = this.xqGvceK5x;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.EljAMC1QTz);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.EljAMC1QTz);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.EljAMC1QTz);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.qy
    public final float eUH21U3apd() {
        return this.WIEu4Ya2g8;
    }

    @Override // defpackage.qy
    public final void encWxUiV2() {
        this.xqGvceK5x.setTranslationY(0.0f);
    }

    @Override // defpackage.qy
    public final void iwATDS1i01k(int i) {
        if (this.rQPn8YBR == i) {
            return;
        }
        this.rQPn8YBR = i;
        Paint paint = this.EljAMC1QTz;
        if (paint == null) {
            paint = new Paint();
            this.EljAMC1QTz = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(fb1.mqNvfisv7(i)));
        VeqTn1PQw7();
    }

    @Override // defpackage.qy
    public final void jivtDDk9H(s9 s9Var) {
        Canvas canvas = ddkiCTz5mZ.GWasM1elztuh;
        DisplayListCanvas displayListCanvas = ((Jz7YUlEP53) s9Var).GWasM1elztuh;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.xqGvceK5x);
    }

    @Override // defpackage.qy
    public final void k8h8IjolWQ(float f) {
        this.iwATDS1i01k = f;
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
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.xqGvceK5x.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (b30.GWasM1elztuh(this.OOA6hdeuvCS, j)) {
            return;
        }
        if (this.XnEVoBF0td1l) {
            this.xqGvceK5x.setPivotX(i3 / 2.0f);
            this.xqGvceK5x.setPivotY(i4 / 2.0f);
        }
        this.OOA6hdeuvCS = j;
    }

    @Override // defpackage.qy
    public final void pog2g9KITJA() {
        this.xqGvceK5x.setRotation(0.0f);
    }

    @Override // defpackage.qy
    public final void rQPn8YBR(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.YmKjaVtbfp5Z = j;
            hu0.X1lG3V04pd(this.xqGvceK5x, ki1.HFYAaqMd6(j));
        }
    }

    @Override // defpackage.qy
    public final void rezfBrjOrqK(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.XnEVoBF0td1l = true;
            this.xqGvceK5x.setPivotX(((int) (this.OOA6hdeuvCS >> 32)) / 2.0f);
            this.xqGvceK5x.setPivotY(((int) (4294967295L & this.OOA6hdeuvCS)) / 2.0f);
        } else {
            this.XnEVoBF0td1l = false;
            this.xqGvceK5x.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.xqGvceK5x.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.qy
    public final void uFEq9NpZ(float f) {
        this.uFEq9NpZ = f;
        this.xqGvceK5x.setScaleX(f);
    }

    @Override // defpackage.qy
    public final void xqGvceK5x(float f) {
        this.E7jCp8Ls = f;
        this.xqGvceK5x.setAlpha(f);
    }
}
