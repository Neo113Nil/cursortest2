package com.gamericefishpro.space.r1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.o1.n;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.o1.r;
import com.gamericefishpro.space.o1.s;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public static final AtomicBoolean x = new AtomicBoolean(true);
    public final r b;
    public final com.gamericefishpro.space.q1.b c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public n w;

    public e(t tVar, r rVar, com.gamericefishpro.space.q1.b bVar) {
        this.b = rVar;
        this.c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", tVar);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (x.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                k.c(renderNodeCreate, k.a(renderNodeCreate));
                k.d(renderNodeCreate, k.b(renderNodeCreate));
            }
            j.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = s.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void A() {
        this.d.setRotation(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void B(q qVar) {
        DisplayListCanvas displayListCanvasA = com.gamericefishpro.space.o1.c.a(qVar);
        Intrinsics.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.d);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void C(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            k.d(this.d, o.y(j));
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void D(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final Matrix E() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void F(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (com.gamericefishpro.space.c3.k.a(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float G() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void H(float f) {
        this.s = f;
        this.d.setCameraDistance(-f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float I() {
        return this.p;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final boolean J() {
        return this.d.isValid();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float K() {
        return this.o;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float L() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final int M() {
        return this.k;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void N(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final long O() {
        return this.q;
    }

    public final void P() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            Q(i);
        } else {
            Q(1);
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float a() {
        return this.l;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void c(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float d() {
        return this.n;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void e(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float f() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final n g() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void h() {
        this.d.setTranslationY(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void i(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar, b bVar, d0 d0Var) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            com.gamericefishpro.space.o1.b bVar2 = this.b.a;
            Canvas canvas = bVar2.a;
            bVar2.a = canvasStart;
            com.gamericefishpro.space.q1.b bVar3 = this.c;
            com.gamericefishpro.space.a8.c cVar2 = bVar3.e;
            long jQ = com.gamericefishpro.space.d9.h.Q(this.e);
            com.gamericefishpro.space.q1.a aVar = ((com.gamericefishpro.space.q1.b) cVar2.v).d;
            com.gamericefishpro.space.c3.c cVar3 = aVar.a;
            com.gamericefishpro.space.c3.l lVar2 = aVar.b;
            q qVarJ = cVar2.j();
            long jO = cVar2.o();
            b bVar4 = (b) cVar2.i;
            cVar2.E(cVar);
            cVar2.G(lVar);
            cVar2.D(bVar2);
            cVar2.H(jQ);
            cVar2.i = bVar;
            bVar2.k();
            try {
                d0Var.invoke(bVar3);
                bVar2.i();
                cVar2.E(cVar3);
                cVar2.G(lVar2);
                cVar2.D(qVarJ);
                cVar2.H(jO);
                cVar2.i = bVar4;
                bVar2.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                bVar2.i();
                com.gamericefishpro.space.a8.c cVar4 = bVar3.e;
                cVar4.E(cVar3);
                cVar4.G(lVar2);
                cVar4.D(qVarJ);
                cVar4.H(jO);
                cVar4.i = bVar4;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void j() {
        this.d.setRotationY(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final long k() {
        return this.r;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            k.c(this.d, o.y(j));
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void m(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void n() {
        R();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void o(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void p(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(o.B(i)));
        R();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float q() {
        return this.s;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void r() {
        j.a(this.d);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void s(n nVar) {
        this.w = nVar;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float t() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void u() {
        this.d.setTranslationX(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void v(boolean z) {
        this.t = z;
        P();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final int w() {
        return this.j;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float x() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final com.gamericefishpro.space.o1.k y() {
        return null;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void z(int i) {
        this.j = i;
        R();
    }
}
