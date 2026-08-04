package com.gamericefishpro.space.r1;

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
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.o1.n;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.o1.r;
import com.gamericefishpro.space.o1.s;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d {
    public static final h x = new h();
    public final com.gamericefishpro.space.s1.a b;
    public final r c;
    public final l d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public n w;

    public i(com.gamericefishpro.space.s1.a aVar) {
        r rVar = new r();
        com.gamericefishpro.space.q1.b bVar = new com.gamericefishpro.space.q1.b();
        this.b = aVar;
        this.c = rVar;
        l lVar = new l(aVar, rVar, bVar);
        this.d = lVar;
        this.e = aVar.getResources();
        this.f = new Rect();
        aVar.addView(lVar);
        lVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = s.b;
        this.u = j;
        this.v = j;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void A() {
        this.d.setRotation(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void B(q qVar) {
        Rect rect;
        boolean z = this.k;
        l lVar = this.d;
        if (z) {
            if ((this.m || lVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        if (com.gamericefishpro.space.o1.c.a(qVar).isHardwareAccelerated()) {
            this.b.a(qVar, lVar, lVar.getDrawingTime());
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void C(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineSpotShadowColor(o.y(j));
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void D(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final Matrix E() {
        return this.d.getMatrix();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void F(int i, int i2, long j) {
        boolean zA = com.gamericefishpro.space.c3.k.a(this.j, j);
        l lVar = this.d;
        if (zA) {
            int i3 = this.h;
            if (i3 != i) {
                lVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                lVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || lVar.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            lVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                lVar.setPivotX(i5 / 2.0f);
                lVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float G() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void H(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float I() {
        return this.t;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float K() {
        return this.s;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float L() {
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final int M() {
        return this.n;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void N(long j) {
        long j2 = 9223372034707292159L & j;
        l lVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            lVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            lVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                lVar.resetPivot();
                return;
            }
            this.q = true;
            lVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final long O() {
        return this.u;
    }

    public final void P(int i) {
        l lVar = this.d;
        boolean z = true;
        if (i == 1) {
            lVar.setLayerType(2, this.g);
        } else if (i == 2) {
            lVar.setLayerType(0, this.g);
            z = false;
        } else {
            lVar.setLayerType(0, this.g);
        }
        lVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float a() {
        return this.p;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float d() {
        return this.r;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void e(float f) {
        this.t = f;
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.gamericefishpro.space.r1.d
    public final void i(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar, b bVar, d0 d0Var) {
        l lVar2 = this.d;
        ViewParent parent = lVar2.getParent();
        com.gamericefishpro.space.s1.a aVar = this.b;
        if (parent == null) {
            aVar.addView(lVar2);
        }
        lVar2.z = cVar;
        lVar2.A = lVar;
        lVar2.B = d0Var;
        lVar2.C = bVar;
        if (lVar2.isAttachedToWindow()) {
            lVar2.setVisibility(4);
            lVar2.setVisibility(0);
            try {
                r rVar = this.c;
                h hVar = x;
                com.gamericefishpro.space.o1.b bVar2 = rVar.a;
                Canvas canvas = bVar2.a;
                bVar2.a = hVar;
                aVar.a(bVar2, lVar2, lVar2.getDrawingTime());
                rVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void j() {
        this.d.setRotationY(0.0f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final long k() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            this.d.setOutlineAmbientShadowColor(o.y(j));
        }
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void m(Outline outline, long j) {
        l lVar = this.d;
        lVar.w = outline;
        lVar.invalidateOutline();
        if ((this.m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void n() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void o(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void p(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(o.B(i)));
        Q();
    }

    @Override // com.gamericefishpro.space.r1.d
    public final float q() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void r() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final void s(n nVar) {
        this.w = nVar;
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
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // com.gamericefishpro.space.r1.d
    public final int w() {
        return this.o;
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
        this.o = i;
        Q();
    }
}
