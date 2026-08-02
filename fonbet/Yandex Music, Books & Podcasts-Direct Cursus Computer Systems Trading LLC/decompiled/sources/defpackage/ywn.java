package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* loaded from: classes.dex */
public final class ywn implements f18 {
    public final RenderNode a = e43.b();

    @Override // defpackage.f18
    public final boolean A() {
        return this.a.getClipToOutline();
    }

    @Override // defpackage.f18
    public final void B(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // defpackage.f18
    public final void C(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.f18
    public final int D() {
        return this.a.getBottom();
    }

    @Override // defpackage.f18
    public final void E(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.f18
    public final void F(float f) {
        this.a.setPivotY(f);
    }

    @Override // defpackage.f18
    public final void G(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.f18
    public final void H(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // defpackage.f18
    public final int I() {
        return this.a.getRight();
    }

    @Override // defpackage.f18
    public final void J(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.f18
    public final void K(int i) {
        this.a.setSpotShadowColor(i);
    }

    @Override // defpackage.f18
    public final float L() {
        return this.a.getElevation();
    }

    @Override // defpackage.f18
    public final int a() {
        return this.a.getHeight();
    }

    @Override // defpackage.f18
    public final float b() {
        return this.a.getAlpha();
    }

    @Override // defpackage.f18
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.f18
    public final void d(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.f18
    public final void e(qwn qwnVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            rf0.D(this.a, qwnVar);
        }
    }

    @Override // defpackage.f18
    public final void f() {
        this.a.discardDisplayList();
    }

    @Override // defpackage.f18
    public final boolean g() {
        return this.a.hasDisplayList();
    }

    @Override // defpackage.f18
    public final void h() {
        this.a.setRotationX(0.0f);
    }

    @Override // defpackage.f18
    public final void i() {
        this.a.setRotationY(0.0f);
    }

    @Override // defpackage.f18
    public final void j(float f) {
        this.a.setScaleX(f);
    }

    @Override // defpackage.f18
    public final void k(float f) {
        this.a.setCameraDistance(f);
    }

    @Override // defpackage.f18
    public final void l(float f) {
        this.a.setRotationZ(f);
    }

    @Override // defpackage.f18
    public final void m(float f) {
        this.a.setScaleY(f);
    }

    @Override // defpackage.f18
    public final void n(float f) {
        this.a.setAlpha(f);
    }

    @Override // defpackage.f18
    public final void o(float f) {
        this.a.setTranslationX(f);
    }

    @Override // defpackage.f18
    public final void p(pu3 pu3Var, eak eakVar, nna nnaVar) {
        RecordingCanvas beginRecording = this.a.beginRecording();
        ud0 ud0Var = pu3Var.a;
        Canvas canvas = ud0Var.a;
        ud0Var.a = beginRecording;
        if (eakVar != null) {
            ud0Var.r();
            ud0Var.h(eakVar);
        }
        nnaVar.invoke(ud0Var);
        if (eakVar != null) {
            ud0Var.k();
        }
        pu3Var.a.a = canvas;
        this.a.endRecording();
    }

    @Override // defpackage.f18
    public final void q(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // defpackage.f18
    public final int r() {
        return this.a.getLeft();
    }

    @Override // defpackage.f18
    public final void s(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.f18
    public final boolean t(int i, int i2, int i3, int i4) {
        return this.a.setPosition(i, i2, i3, i4);
    }

    @Override // defpackage.f18
    public final void u(float f) {
        this.a.setElevation(f);
    }

    @Override // defpackage.f18
    public final void v(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.f18
    public final void w(int i) {
        RenderNode renderNode = this.a;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.f18
    public final boolean x() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.f18
    public final boolean y() {
        return this.a.getClipToBounds();
    }

    @Override // defpackage.f18
    public final int z() {
        return this.a.getTop();
    }
}
