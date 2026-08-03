package i1;

import a0.a0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import f1.d0;
import f1.o;
import f1.p;
import f1.q;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicBoolean f3037x = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final p f3038b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f3039c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f3040d;

    /* renamed from: e, reason: collision with root package name */
    public long f3041e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f3042f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f3043g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3044h;

    /* renamed from: i, reason: collision with root package name */
    public long f3045i;

    /* renamed from: j, reason: collision with root package name */
    public int f3046j;

    /* renamed from: k, reason: collision with root package name */
    public int f3047k;

    /* renamed from: l, reason: collision with root package name */
    public float f3048l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3049m;

    /* renamed from: n, reason: collision with root package name */
    public float f3050n;

    /* renamed from: o, reason: collision with root package name */
    public float f3051o;

    /* renamed from: p, reason: collision with root package name */
    public float f3052p;

    /* renamed from: q, reason: collision with root package name */
    public long f3053q;

    /* renamed from: r, reason: collision with root package name */
    public long f3054r;

    /* renamed from: s, reason: collision with root package name */
    public float f3055s;

    /* renamed from: t, reason: collision with root package name */
    public float f3056t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3057u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3058v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3059w;

    public e(r rVar, p pVar, h1.b bVar) {
        this.f3038b = pVar;
        this.f3039c = bVar;
        RenderNode create = RenderNode.create("Compose", rVar);
        this.f3040d = create;
        this.f3041e = 0L;
        this.f3045i = 0L;
        if (f3037x.getAndSet(false)) {
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
                k.c(create, k.a(create));
                k.d(create, k.b(create));
            }
            j.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        O(0);
        this.f3046j = 0;
        this.f3047k = 3;
        this.f3048l = 1.0f;
        this.f3050n = 1.0f;
        this.f3051o = 1.0f;
        long j3 = q.f2277b;
        this.f3053q = j3;
        this.f3054r = j3;
        this.f3056t = 8.0f;
    }

    @Override // i1.d
    public final Matrix A() {
        Matrix matrix = this.f3043g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f3043g = matrix;
        }
        this.f3040d.getMatrix(matrix);
        return matrix;
    }

    @Override // i1.d
    public final void B(int i10, int i11, long j3) {
        int i12 = (int) (j3 >> 32);
        int i13 = (int) (4294967295L & j3);
        this.f3040d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (s2.k.a(this.f3041e, j3)) {
            return;
        }
        if (this.f3049m) {
            this.f3040d.setPivotX(i12 / 2.0f);
            this.f3040d.setPivotY(i13 / 2.0f);
        }
        this.f3041e = j3;
    }

    @Override // i1.d
    public final float C() {
        return 0.0f;
    }

    @Override // i1.d
    public final void D(float f10) {
        this.f3056t = f10;
        this.f3040d.setCameraDistance(-f10);
    }

    @Override // i1.d
    public final float E() {
        return this.f3052p;
    }

    @Override // i1.d
    public final boolean F() {
        return this.f3040d.isValid();
    }

    @Override // i1.d
    public final void G(o oVar) {
        DisplayListCanvas a6 = f1.c.a(oVar);
        pc.j.c(a6, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a6.drawRenderNode(this.f3040d);
    }

    @Override // i1.d
    public final float H() {
        return this.f3051o;
    }

    @Override // i1.d
    public final float I() {
        return this.f3055s;
    }

    @Override // i1.d
    public final void J(s2.c cVar, s2.l lVar, b bVar, a0 a0Var) {
        Canvas start = this.f3040d.start(Math.max((int) (this.f3041e >> 32), (int) (this.f3045i >> 32)), Math.max((int) (this.f3041e & 4294967295L), (int) (this.f3045i & 4294967295L)));
        try {
            f1.b bVar2 = this.f3038b.f2276a;
            Canvas canvas = bVar2.f2214a;
            bVar2.f2214a = start;
            h1.b bVar3 = this.f3039c;
            a5.c cVar2 = bVar3.f2596h;
            long F = i7.b.F(this.f3041e);
            h1.a aVar = ((h1.b) cVar2.f263i).f2595g;
            s2.c cVar3 = aVar.f2591a;
            s2.l lVar2 = aVar.f2592b;
            o t3 = cVar2.t();
            long x10 = cVar2.x();
            b bVar4 = (b) cVar2.f261g;
            cVar2.N(cVar);
            cVar2.P(lVar);
            cVar2.M(bVar2);
            cVar2.Q(F);
            cVar2.f261g = bVar;
            bVar2.k();
            try {
                a0Var.invoke(bVar3);
                bVar2.g();
                cVar2.N(cVar3);
                cVar2.P(lVar2);
                cVar2.M(t3);
                cVar2.Q(x10);
                cVar2.f261g = bVar4;
                bVar2.f2214a = canvas;
                this.f3040d.end(start);
            } catch (Throwable th) {
                bVar2.g();
                a5.c cVar4 = bVar3.f2596h;
                cVar4.N(cVar3);
                cVar4.P(lVar2);
                cVar4.M(t3);
                cVar4.Q(x10);
                cVar4.f261g = bVar4;
                throw th;
            }
        } catch (Throwable th2) {
            this.f3040d.end(start);
            throw th2;
        }
    }

    @Override // i1.d
    public final int K() {
        return this.f3047k;
    }

    @Override // i1.d
    public final void L(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f3049m = true;
            this.f3040d.setPivotX(((int) (this.f3041e >> 32)) / 2.0f);
            this.f3040d.setPivotY(((int) (4294967295L & this.f3041e)) / 2.0f);
        } else {
            this.f3049m = false;
            this.f3040d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f3040d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    @Override // i1.d
    public final long M() {
        return this.f3053q;
    }

    public final void N() {
        boolean z10 = this.f3057u;
        boolean z11 = false;
        boolean z12 = z10 && !this.f3044h;
        if (z10 && this.f3044h) {
            z11 = true;
        }
        if (z12 != this.f3058v) {
            this.f3058v = z12;
            this.f3040d.setClipToBounds(z12);
        }
        if (z11 != this.f3059w) {
            this.f3059w = z11;
            this.f3040d.setClipToOutline(z11);
        }
    }

    public final void O(int i10) {
        RenderNode renderNode = this.f3040d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f3042f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f3042f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f3042f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void P() {
        int i10 = this.f3046j;
        if (i10 != 1 && this.f3047k == 3) {
            O(i10);
        } else {
            O(1);
        }
    }

    @Override // i1.d
    public final float a() {
        return this.f3048l;
    }

    @Override // i1.d
    public final void b() {
        this.f3040d.setRotationX(0.0f);
    }

    @Override // i1.d
    public final void c(float f10) {
        this.f3048l = f10;
        this.f3040d.setAlpha(f10);
    }

    @Override // i1.d
    public final float d() {
        return this.f3050n;
    }

    @Override // i1.d
    public final void e(float f10) {
        this.f3052p = f10;
        this.f3040d.setElevation(f10);
    }

    @Override // i1.d
    public final float f() {
        return 0.0f;
    }

    @Override // i1.d
    public final void g() {
        this.f3040d.setTranslationY(0.0f);
    }

    @Override // i1.d
    public final void h(float f10) {
        this.f3055s = f10;
        this.f3040d.setRotation(f10);
    }

    @Override // i1.d
    public final void i() {
        this.f3040d.setRotationY(0.0f);
    }

    @Override // i1.d
    public final long j() {
        return this.f3054r;
    }

    @Override // i1.d
    public final void k(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3053q = j3;
            k.c(this.f3040d, d0.s(j3));
        }
    }

    @Override // i1.d
    public final void l(Outline outline, long j3) {
        this.f3045i = j3;
        this.f3040d.setOutline(outline);
        this.f3044h = outline != null;
        N();
    }

    @Override // i1.d
    public final void m() {
        P();
    }

    @Override // i1.d
    public final void n(float f10) {
        this.f3050n = f10;
        this.f3040d.setScaleX(f10);
    }

    @Override // i1.d
    public final void o(int i10) {
        if (this.f3047k == i10) {
            return;
        }
        this.f3047k = i10;
        Paint paint = this.f3042f;
        if (paint == null) {
            paint = new Paint();
            this.f3042f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(d0.v(i10)));
        P();
    }

    @Override // i1.d
    public final float p() {
        return this.f3056t;
    }

    @Override // i1.d
    public final void q() {
        j.a(this.f3040d);
    }

    @Override // i1.d
    public final float r() {
        return 0.0f;
    }

    @Override // i1.d
    public final void s() {
        this.f3040d.setTranslationX(0.0f);
    }

    @Override // i1.d
    public final void t(boolean z10) {
        this.f3057u = z10;
        N();
    }

    @Override // i1.d
    public final int u() {
        return this.f3046j;
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
        this.f3046j = i10;
        P();
    }

    @Override // i1.d
    public final void y(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3054r = j3;
            k.d(this.f3040d, d0.s(j3));
        }
    }

    @Override // i1.d
    public final void z(float f10) {
        this.f3051o = f10;
        this.f3040d.setScaleY(f10);
    }
}
