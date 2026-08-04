package com.gamericefishpro.space.r1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.o1.n;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.o1.r;
import com.gamericefishpro.space.o1.s;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d {
    public final r b;
    public final com.gamericefishpro.space.q1.b c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public n t;
    public int u;

    public g() {
        r rVar = new r();
        com.gamericefishpro.space.q1.b bVar = new com.gamericefishpro.space.q1.b();
        this.b = rVar;
        this.c = bVar;
        RenderNode renderNodeD = com.gamericefishpro.space.o1.a.d();
        this.d = renderNodeD;
        this.e = 0L;
        renderNodeD.setClipToBounds(false);
        Q(renderNodeD, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = s.b;
        this.n = j;
        this.o = j;
        this.p = 8.0f;
        this.u = 0;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void A() {
        this.d.setRotationZ(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void B(q qVar) {
        com.gamericefishpro.space.o1.c.a(qVar).drawRenderNode(this.d);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void C(long j) {
        this.o = j;
        this.d.setSpotShadowColor(o.y(j));
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void D(float f) {
        this.l = f;
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
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = com.gamericefishpro.space.d9.h.Q(j);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float G() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void H(float f) {
        this.p = f;
        this.d.setCameraDistance(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float I() {
        return this.m;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final boolean J() {
        return this.d.hasDisplayList();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float K() {
        return this.l;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float L() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final int M() {
        return this.j;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void N(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.d.resetPivot();
        } else {
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final long O() {
        return this.n;
    }

    public final void P() {
        boolean z = this.q;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.r) {
            this.r = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.s) {
            this.s = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.u;
        if (i != 1 && this.j == 3 && this.t == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float a() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void c(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float d() {
        return this.k;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void e(float f) {
        this.m = f;
        this.d.setElevation(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float f() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final n g() {
        return this.t;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void h() {
        this.d.setTranslationY(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void i(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar, b bVar, d0 d0Var) {
        com.gamericefishpro.space.q1.b bVar2 = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            r rVar = this.b;
            com.gamericefishpro.space.o1.b bVar3 = rVar.a;
            Canvas canvas = bVar3.a;
            bVar3.a = recordingCanvasBeginRecording;
            com.gamericefishpro.space.a8.c cVar2 = bVar2.e;
            cVar2.E(cVar);
            cVar2.G(lVar);
            cVar2.i = bVar;
            cVar2.H(this.e);
            cVar2.D(bVar3);
            d0Var.invoke(bVar2);
            rVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void j() {
        this.d.setRotationY(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final long k() {
        return this.o;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void l(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(o.y(j));
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void m(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void n() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void o(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void p(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(o.v(i));
        R();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float q() {
        return this.p;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void r() {
        this.d.discardDisplayList();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void s(n nVar) {
        this.t = nVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(nVar != null ? nVar.a() : null);
        }
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
        this.q = z;
        P();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final int w() {
        return this.u;
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
        this.u = i;
        R();
    }
}
