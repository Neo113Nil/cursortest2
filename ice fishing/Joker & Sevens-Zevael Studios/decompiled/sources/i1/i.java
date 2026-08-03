package i1;

import a0.a0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import f1.d0;
import f1.o;
import f1.p;
import f1.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: x, reason: collision with root package name */
    public static final h f3080x = new h();

    /* renamed from: b, reason: collision with root package name */
    public final j1.a f3081b;

    /* renamed from: c, reason: collision with root package name */
    public final p f3082c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3083d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f3084e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3085f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f3086g;

    /* renamed from: h, reason: collision with root package name */
    public int f3087h;

    /* renamed from: i, reason: collision with root package name */
    public int f3088i;

    /* renamed from: j, reason: collision with root package name */
    public long f3089j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3090k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3091l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3092m;

    /* renamed from: n, reason: collision with root package name */
    public int f3093n;

    /* renamed from: o, reason: collision with root package name */
    public int f3094o;

    /* renamed from: p, reason: collision with root package name */
    public float f3095p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3096q;

    /* renamed from: r, reason: collision with root package name */
    public float f3097r;

    /* renamed from: s, reason: collision with root package name */
    public float f3098s;

    /* renamed from: t, reason: collision with root package name */
    public float f3099t;

    /* renamed from: u, reason: collision with root package name */
    public long f3100u;

    /* renamed from: v, reason: collision with root package name */
    public long f3101v;

    /* renamed from: w, reason: collision with root package name */
    public float f3102w;

    public i(j1.a aVar) {
        p pVar = new p();
        h1.b bVar = new h1.b();
        this.f3081b = aVar;
        this.f3082c = pVar;
        m mVar = new m(aVar, pVar, bVar);
        this.f3083d = mVar;
        this.f3084e = aVar.getResources();
        this.f3085f = new Rect();
        aVar.addView(mVar);
        mVar.setClipBounds(null);
        this.f3089j = 0L;
        View.generateViewId();
        this.f3093n = 3;
        this.f3094o = 0;
        this.f3095p = 1.0f;
        this.f3097r = 1.0f;
        this.f3098s = 1.0f;
        long j3 = q.f2277b;
        this.f3100u = j3;
        this.f3101v = j3;
    }

    @Override // i1.d
    public final Matrix A() {
        return this.f3083d.getMatrix();
    }

    @Override // i1.d
    public final void B(int i10, int i11, long j3) {
        boolean a6 = s2.k.a(this.f3089j, j3);
        m mVar = this.f3083d;
        if (a6) {
            int i12 = this.f3087h;
            if (i12 != i10) {
                mVar.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f3088i;
            if (i13 != i11) {
                mVar.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f3092m || mVar.getClipToOutline()) {
                this.f3090k = true;
            }
            int i14 = (int) (j3 >> 32);
            int i15 = (int) (4294967295L & j3);
            mVar.layout(i10, i11, i10 + i14, i11 + i15);
            this.f3089j = j3;
            if (this.f3096q) {
                mVar.setPivotX(i14 / 2.0f);
                mVar.setPivotY(i15 / 2.0f);
            }
        }
        this.f3087h = i10;
        this.f3088i = i11;
    }

    @Override // i1.d
    public final float C() {
        return 0.0f;
    }

    @Override // i1.d
    public final void D(float f10) {
        this.f3083d.setCameraDistance(f10 * this.f3084e.getDisplayMetrics().densityDpi);
    }

    @Override // i1.d
    public final float E() {
        return this.f3099t;
    }

    @Override // i1.d
    public final void G(o oVar) {
        Rect rect;
        boolean z10 = this.f3090k;
        m mVar = this.f3083d;
        if (z10) {
            if ((this.f3092m || mVar.getClipToOutline()) && !this.f3091l) {
                rect = this.f3085f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            } else {
                rect = null;
            }
            mVar.setClipBounds(rect);
        }
        if (f1.c.a(oVar).isHardwareAccelerated()) {
            this.f3081b.a(oVar, mVar, mVar.getDrawingTime());
        }
    }

    @Override // i1.d
    public final float H() {
        return this.f3098s;
    }

    @Override // i1.d
    public final float I() {
        return this.f3102w;
    }

    @Override // i1.d
    public final void J(s2.c cVar, s2.l lVar, b bVar, a0 a0Var) {
        m mVar = this.f3083d;
        ViewParent parent = mVar.getParent();
        j1.a aVar = this.f3081b;
        if (parent == null) {
            aVar.addView(mVar);
        }
        mVar.f3111m = cVar;
        mVar.f3112n = lVar;
        mVar.f3113o = a0Var;
        mVar.f3114p = bVar;
        if (mVar.isAttachedToWindow()) {
            mVar.setVisibility(4);
            mVar.setVisibility(0);
            try {
                p pVar = this.f3082c;
                h hVar = f3080x;
                f1.b bVar2 = pVar.f2276a;
                Canvas canvas = bVar2.f2214a;
                bVar2.f2214a = hVar;
                aVar.a(bVar2, mVar, mVar.getDrawingTime());
                pVar.f2276a.f2214a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // i1.d
    public final int K() {
        return this.f3093n;
    }

    @Override // i1.d
    public final void L(long j3) {
        long j6 = 9223372034707292159L & j3;
        m mVar = this.f3083d;
        if (j6 != 9205357640488583168L) {
            this.f3096q = false;
            mVar.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            mVar.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.resetPivot();
                return;
            }
            this.f3096q = true;
            mVar.setPivotX(((int) (this.f3089j >> 32)) / 2.0f);
            mVar.setPivotY(((int) (this.f3089j & 4294967295L)) / 2.0f);
        }
    }

    @Override // i1.d
    public final long M() {
        return this.f3100u;
    }

    public final void N(int i10) {
        m mVar = this.f3083d;
        boolean z10 = true;
        if (i10 == 1) {
            mVar.setLayerType(2, this.f3086g);
        } else if (i10 == 2) {
            mVar.setLayerType(0, this.f3086g);
            z10 = false;
        } else {
            mVar.setLayerType(0, this.f3086g);
        }
        mVar.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    public final void O() {
        int i10 = this.f3094o;
        if (i10 != 1 && this.f3093n == 3) {
            N(i10);
        } else {
            N(1);
        }
    }

    @Override // i1.d
    public final float a() {
        return this.f3095p;
    }

    @Override // i1.d
    public final void b() {
        this.f3083d.setRotationX(0.0f);
    }

    @Override // i1.d
    public final void c(float f10) {
        this.f3095p = f10;
        this.f3083d.setAlpha(f10);
    }

    @Override // i1.d
    public final float d() {
        return this.f3097r;
    }

    @Override // i1.d
    public final void e(float f10) {
        this.f3099t = f10;
        this.f3083d.setElevation(f10);
    }

    @Override // i1.d
    public final float f() {
        return 0.0f;
    }

    @Override // i1.d
    public final void g() {
        this.f3083d.setTranslationY(0.0f);
    }

    @Override // i1.d
    public final void h(float f10) {
        this.f3102w = f10;
        this.f3083d.setRotation(f10);
    }

    @Override // i1.d
    public final void i() {
        this.f3083d.setRotationY(0.0f);
    }

    @Override // i1.d
    public final long j() {
        return this.f3101v;
    }

    @Override // i1.d
    public final void k(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3100u = j3;
            this.f3083d.setOutlineAmbientShadowColor(d0.s(j3));
        }
    }

    @Override // i1.d
    public final void l(Outline outline, long j3) {
        m mVar = this.f3083d;
        mVar.f3109k = outline;
        mVar.invalidateOutline();
        if ((this.f3092m || mVar.getClipToOutline()) && outline != null) {
            mVar.setClipToOutline(true);
            if (this.f3092m) {
                this.f3092m = false;
                this.f3090k = true;
            }
        }
        this.f3091l = outline != null;
    }

    @Override // i1.d
    public final void m() {
        Paint paint = this.f3086g;
        if (paint == null) {
            paint = new Paint();
            this.f3086g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    @Override // i1.d
    public final void n(float f10) {
        this.f3097r = f10;
        this.f3083d.setScaleX(f10);
    }

    @Override // i1.d
    public final void o(int i10) {
        this.f3093n = i10;
        Paint paint = this.f3086g;
        if (paint == null) {
            paint = new Paint();
            this.f3086g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(d0.v(i10)));
        O();
    }

    @Override // i1.d
    public final float p() {
        return this.f3083d.getCameraDistance() / this.f3084e.getDisplayMetrics().densityDpi;
    }

    @Override // i1.d
    public final void q() {
        this.f3081b.removeViewInLayout(this.f3083d);
    }

    @Override // i1.d
    public final float r() {
        return 0.0f;
    }

    @Override // i1.d
    public final void s() {
        this.f3083d.setTranslationX(0.0f);
    }

    @Override // i1.d
    public final void t(boolean z10) {
        boolean z11 = false;
        this.f3092m = z10 && !this.f3091l;
        this.f3090k = true;
        if (z10 && this.f3091l) {
            z11 = true;
        }
        this.f3083d.setClipToOutline(z11);
    }

    @Override // i1.d
    public final int u() {
        return this.f3094o;
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
        this.f3094o = i10;
        O();
    }

    @Override // i1.d
    public final void y(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3101v = j3;
            this.f3083d.setOutlineSpotShadowColor(d0.s(j3));
        }
    }

    @Override // i1.d
    public final void z(float f10) {
        this.f3098s = f10;
        this.f3083d.setScaleY(f10);
    }
}
