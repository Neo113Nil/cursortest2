package i1;

import a0.a0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import f1.d0;
import f1.o;
import f1.p;
import f1.q;
import h3.k0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final p f3060b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f3061c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f3062d;

    /* renamed from: e, reason: collision with root package name */
    public long f3063e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f3064f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f3065g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3066h;

    /* renamed from: i, reason: collision with root package name */
    public float f3067i;

    /* renamed from: j, reason: collision with root package name */
    public int f3068j;

    /* renamed from: k, reason: collision with root package name */
    public float f3069k;

    /* renamed from: l, reason: collision with root package name */
    public float f3070l;

    /* renamed from: m, reason: collision with root package name */
    public float f3071m;

    /* renamed from: n, reason: collision with root package name */
    public long f3072n;

    /* renamed from: o, reason: collision with root package name */
    public long f3073o;

    /* renamed from: p, reason: collision with root package name */
    public float f3074p;

    /* renamed from: q, reason: collision with root package name */
    public float f3075q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3076r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3077s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3078t;

    /* renamed from: u, reason: collision with root package name */
    public int f3079u;

    public g() {
        p pVar = new p();
        h1.b bVar = new h1.b();
        this.f3060b = pVar;
        this.f3061c = bVar;
        RenderNode b2 = k0.b();
        this.f3062d = b2;
        this.f3063e = 0L;
        b2.setClipToBounds(false);
        O(b2, 0);
        this.f3067i = 1.0f;
        this.f3068j = 3;
        this.f3069k = 1.0f;
        this.f3070l = 1.0f;
        long j3 = q.f2277b;
        this.f3072n = j3;
        this.f3073o = j3;
        this.f3075q = 8.0f;
        this.f3079u = 0;
    }

    @Override // i1.d
    public final Matrix A() {
        Matrix matrix = this.f3065g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f3065g = matrix;
        }
        this.f3062d.getMatrix(matrix);
        return matrix;
    }

    @Override // i1.d
    public final void B(int i10, int i11, long j3) {
        this.f3062d.setPosition(i10, i11, ((int) (j3 >> 32)) + i10, ((int) (4294967295L & j3)) + i11);
        this.f3063e = i7.b.F(j3);
    }

    @Override // i1.d
    public final float C() {
        return 0.0f;
    }

    @Override // i1.d
    public final void D(float f10) {
        this.f3075q = f10;
        this.f3062d.setCameraDistance(f10);
    }

    @Override // i1.d
    public final float E() {
        return this.f3071m;
    }

    @Override // i1.d
    public final boolean F() {
        boolean hasDisplayList;
        hasDisplayList = this.f3062d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // i1.d
    public final void G(o oVar) {
        f1.c.a(oVar).drawRenderNode(this.f3062d);
    }

    @Override // i1.d
    public final float H() {
        return this.f3070l;
    }

    @Override // i1.d
    public final float I() {
        return this.f3074p;
    }

    @Override // i1.d
    public final void J(s2.c cVar, s2.l lVar, b bVar, a0 a0Var) {
        RecordingCanvas beginRecording;
        h1.b bVar2 = this.f3061c;
        beginRecording = this.f3062d.beginRecording();
        try {
            p pVar = this.f3060b;
            f1.b bVar3 = pVar.f2276a;
            Canvas canvas = bVar3.f2214a;
            bVar3.f2214a = beginRecording;
            a5.c cVar2 = bVar2.f2596h;
            cVar2.N(cVar);
            cVar2.P(lVar);
            cVar2.f261g = bVar;
            cVar2.Q(this.f3063e);
            cVar2.M(bVar3);
            a0Var.invoke(bVar2);
            pVar.f2276a.f2214a = canvas;
        } finally {
            this.f3062d.endRecording();
        }
    }

    @Override // i1.d
    public final int K() {
        return this.f3068j;
    }

    @Override // i1.d
    public final void L(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f3062d.resetPivot();
        } else {
            this.f3062d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f3062d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    @Override // i1.d
    public final long M() {
        return this.f3072n;
    }

    public final void N() {
        boolean z10 = this.f3076r;
        boolean z11 = false;
        boolean z12 = z10 && !this.f3066h;
        if (z10 && this.f3066h) {
            z11 = true;
        }
        if (z12 != this.f3077s) {
            this.f3077s = z12;
            this.f3062d.setClipToBounds(z12);
        }
        if (z11 != this.f3078t) {
            this.f3078t = z11;
            this.f3062d.setClipToOutline(z11);
        }
    }

    public final void O(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, this.f3064f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, this.f3064f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f3064f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i10 = this.f3079u;
        if (i10 != 1 && this.f3068j == 3) {
            O(this.f3062d, i10);
        } else {
            O(this.f3062d, 1);
        }
    }

    @Override // i1.d
    public final float a() {
        return this.f3067i;
    }

    @Override // i1.d
    public final void b() {
        this.f3062d.setRotationX(0.0f);
    }

    @Override // i1.d
    public final void c(float f10) {
        this.f3067i = f10;
        this.f3062d.setAlpha(f10);
    }

    @Override // i1.d
    public final float d() {
        return this.f3069k;
    }

    @Override // i1.d
    public final void e(float f10) {
        this.f3071m = f10;
        this.f3062d.setElevation(f10);
    }

    @Override // i1.d
    public final float f() {
        return 0.0f;
    }

    @Override // i1.d
    public final void g() {
        this.f3062d.setTranslationY(0.0f);
    }

    @Override // i1.d
    public final void h(float f10) {
        this.f3074p = f10;
        this.f3062d.setRotationZ(f10);
    }

    @Override // i1.d
    public final void i() {
        this.f3062d.setRotationY(0.0f);
    }

    @Override // i1.d
    public final long j() {
        return this.f3073o;
    }

    @Override // i1.d
    public final void k(long j3) {
        this.f3072n = j3;
        this.f3062d.setAmbientShadowColor(d0.s(j3));
    }

    @Override // i1.d
    public final void l(Outline outline, long j3) {
        this.f3062d.setOutline(outline);
        this.f3066h = outline != null;
        N();
    }

    @Override // i1.d
    public final void m() {
        Paint paint = this.f3064f;
        if (paint == null) {
            paint = new Paint();
            this.f3064f = paint;
        }
        paint.setColorFilter(null);
        P();
    }

    @Override // i1.d
    public final void n(float f10) {
        this.f3069k = f10;
        this.f3062d.setScaleX(f10);
    }

    @Override // i1.d
    public final void o(int i10) {
        this.f3068j = i10;
        Paint paint = this.f3064f;
        if (paint == null) {
            paint = new Paint();
            this.f3064f = paint;
        }
        paint.setBlendMode(d0.q(i10));
        P();
    }

    @Override // i1.d
    public final float p() {
        return this.f3075q;
    }

    @Override // i1.d
    public final void q() {
        this.f3062d.discardDisplayList();
    }

    @Override // i1.d
    public final float r() {
        return 0.0f;
    }

    @Override // i1.d
    public final void s() {
        this.f3062d.setTranslationX(0.0f);
    }

    @Override // i1.d
    public final void t(boolean z10) {
        this.f3076r = z10;
        N();
    }

    @Override // i1.d
    public final int u() {
        return this.f3079u;
    }

    @Override // i1.d
    public final float v() {
        return 0.0f;
    }

    @Override // i1.d
    public final f1.l w() {
        return null;
    }

    @Override // i1.d
    public final void x(int i10) {
        this.f3079u = i10;
        P();
    }

    @Override // i1.d
    public final void y(long j3) {
        this.f3073o = j3;
        this.f3062d.setSpotShadowColor(d0.s(j3));
    }

    @Override // i1.d
    public final void z(float f10) {
        this.f3070l = f10;
        this.f3062d.setScaleY(f10);
    }
}
