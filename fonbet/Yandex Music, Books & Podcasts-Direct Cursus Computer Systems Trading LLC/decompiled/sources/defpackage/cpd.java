package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* loaded from: classes.dex */
public final class cpd implements yod {
    public final pu3 b;
    public final ou3 c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public float h;
    public final int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public long o;
    public long p;
    public float q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public qwn v;
    public int w;

    public cpd() {
        pu3 pu3Var = new pu3();
        ou3 ou3Var = new ou3();
        this.b = pu3Var;
        this.c = ou3Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        N(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = d85.b;
        this.o = j;
        this.p = j;
        this.r = 8.0f;
        this.w = 0;
    }

    public static void N(RenderNode renderNode, int i) {
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

    @Override // defpackage.yod
    public final float A() {
        return this.j;
    }

    @Override // defpackage.yod
    public final void B(float f) {
        this.n = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.yod
    public final void C(Outline outline, long j) {
        this.d.setOutline(outline);
        this.g = outline != null;
        M();
    }

    @Override // defpackage.yod
    public final void D(mu3 mu3Var) {
        vd0.a(mu3Var).drawRenderNode(this.d);
    }

    @Override // defpackage.yod
    public final void E(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.yod
    public final float F() {
        return this.m;
    }

    @Override // defpackage.yod
    public final void G(long j, int i, int i2) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = nt0.Q(j);
    }

    @Override // defpackage.yod
    public final float H() {
        return this.l;
    }

    @Override // defpackage.yod
    public final float I() {
        return 0.0f;
    }

    @Override // defpackage.yod
    public final void J(int i) {
        this.w = i;
        if (i != 1 && this.i == 3 && this.v == null) {
            N(this.d, i);
        } else {
            N(this.d, 1);
        }
    }

    @Override // defpackage.yod
    public final float K() {
        return this.n;
    }

    @Override // defpackage.yod
    public final float L() {
        return this.k;
    }

    public final void M() {
        boolean z = this.s;
        boolean z2 = false;
        boolean z3 = z && !this.g;
        if (z && this.g) {
            z2 = true;
        }
        if (z3 != this.t) {
            this.t = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.u) {
            this.u = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.yod
    public final qwn a() {
        return this.v;
    }

    @Override // defpackage.yod
    public final float b() {
        return this.h;
    }

    @Override // defpackage.yod
    public final void c(jx7 jx7Var, xof xofVar, xod xodVar, kma kmaVar) {
        ou3 ou3Var = this.c;
        RecordingCanvas beginRecording = this.d.beginRecording();
        try {
            pu3 pu3Var = this.b;
            ud0 ud0Var = pu3Var.a;
            Canvas canvas = ud0Var.a;
            ud0Var.a = beginRecording;
            nsh nshVar = ou3Var.b;
            nshVar.O(jx7Var);
            nshVar.P(xofVar);
            nshVar.c = xodVar;
            nshVar.R(this.e);
            nshVar.M(ud0Var);
            kmaVar.invoke(ou3Var);
            pu3Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.yod
    public final void d(float f) {
        this.m = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.yod
    public final void e(qwn qwnVar) {
        this.v = qwnVar;
        if (Build.VERSION.SDK_INT >= 31) {
            rf0.F(this.d, qwnVar);
        }
    }

    @Override // defpackage.yod
    public final void f() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.yod
    public final boolean g() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.yod
    public final void h() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.yod
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.yod
    public final void j(float f) {
        this.j = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.yod
    public final void k(float f) {
        this.r = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.yod
    public final void l(float f) {
        this.q = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.yod
    public final void m(float f) {
        this.k = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.yod
    public final void n(float f) {
        this.h = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.yod
    public final void o(float f) {
        this.l = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.yod
    public final int p() {
        return this.w;
    }

    @Override // defpackage.yod
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.yod
    public final float r() {
        return this.q;
    }

    @Override // defpackage.yod
    public final long s() {
        return this.o;
    }

    @Override // defpackage.yod
    public final long t() {
        return this.p;
    }

    @Override // defpackage.yod
    public final void u(long j) {
        this.o = j;
        this.d.setAmbientShadowColor(c3x.U(j));
    }

    @Override // defpackage.yod
    public final float v() {
        return this.r;
    }

    @Override // defpackage.yod
    public final void w(boolean z) {
        this.s = z;
        M();
    }

    @Override // defpackage.yod
    public final void x(long j) {
        this.p = j;
        this.d.setSpotShadowColor(c3x.U(j));
    }

    @Override // defpackage.yod
    public final Matrix y() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.yod
    public final int z() {
        return this.i;
    }
}
