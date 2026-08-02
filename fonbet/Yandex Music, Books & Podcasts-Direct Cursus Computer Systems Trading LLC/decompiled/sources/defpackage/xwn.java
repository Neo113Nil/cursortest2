package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class xwn implements f18 {
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public xwn(AndroidComposeView androidComposeView) {
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.a = create;
        if (g) {
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
                dxn.c(create, dxn.a(create));
                dxn.d(create, dxn.b(create));
            }
            bxn.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            g = false;
        }
    }

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
        this.b += i;
        this.d += i;
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.f18
    public final int D() {
        return this.e;
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
        if (Build.VERSION.SDK_INT >= 28) {
            dxn.c(this.a, i);
        }
    }

    @Override // defpackage.f18
    public final int I() {
        return this.d;
    }

    @Override // defpackage.f18
    public final void J(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.f18
    public final void K(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            dxn.d(this.a, i);
        }
    }

    @Override // defpackage.f18
    public final float L() {
        return this.a.getElevation();
    }

    @Override // defpackage.f18
    public final int a() {
        return this.e - this.c;
    }

    @Override // defpackage.f18
    public final float b() {
        return this.a.getAlpha();
    }

    @Override // defpackage.f18
    public final int c() {
        return this.d - this.b;
    }

    @Override // defpackage.f18
    public final void d(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.f18
    public final void f() {
        bxn.a(this.a);
    }

    @Override // defpackage.f18
    public final boolean g() {
        return this.a.isValid();
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
        this.a.setCameraDistance(-f);
    }

    @Override // defpackage.f18
    public final void l(float f) {
        this.a.setRotation(f);
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
        Canvas start = this.a.start(c(), a());
        ud0 ud0Var = pu3Var.a;
        Canvas canvas = ud0Var.a;
        ud0Var.a = start;
        if (eakVar != null) {
            ud0Var.r();
            ud0Var.h(eakVar);
        }
        nnaVar.invoke(ud0Var);
        if (eakVar != null) {
            ud0Var.k();
        }
        pu3Var.a.a = canvas;
        this.a.end(start);
    }

    @Override // defpackage.f18
    public final void q(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.a);
    }

    @Override // defpackage.f18
    public final int r() {
        return this.b;
    }

    @Override // defpackage.f18
    public final void s(boolean z) {
        this.f = z;
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.f18
    public final boolean t(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        return this.a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.f18
    public final void u(float f) {
        this.a.setElevation(f);
    }

    @Override // defpackage.f18
    public final void v(int i) {
        this.c += i;
        this.e += i;
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.f18
    public final void w(int i) {
        if (i == 1) {
            this.a.setLayerType(2);
            this.a.setHasOverlappingRendering(true);
            return;
        }
        RenderNode renderNode = this.a;
        if (i == 2) {
            renderNode.setLayerType(0);
            this.a.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            this.a.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.f18
    public final boolean x() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.f18
    public final boolean y() {
        return this.f;
    }

    @Override // defpackage.f18
    public final int z() {
        return this.c;
    }

    @Override // defpackage.f18
    public final void e(qwn qwnVar) {
    }
}
