package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class fpd implements yod {
    public static final epd z = new epd();
    public final hpa b;
    public final pu3 c;
    public final yeu d;
    public final Resources e;
    public final Rect f;
    public int g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public boolean p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public float x;
    public qwn y;

    public fpd(hpa hpaVar) {
        pu3 pu3Var = new pu3();
        ou3 ou3Var = new ou3();
        this.b = hpaVar;
        this.c = pu3Var;
        yeu yeuVar = new yeu(hpaVar, pu3Var, ou3Var);
        this.d = yeuVar;
        this.e = hpaVar.getResources();
        this.f = new Rect();
        hpaVar.addView(yeuVar);
        yeuVar.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.o = 1.0f;
        this.q = 1.0f;
        this.r = 1.0f;
        long j = d85.b;
        this.v = j;
        this.w = j;
    }

    @Override // defpackage.yod
    public final float A() {
        return this.q;
    }

    @Override // defpackage.yod
    public final void B(float f) {
        this.u = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.yod
    public final void C(Outline outline, long j) {
        yeu yeuVar = this.d;
        yeuVar.e = outline;
        yeuVar.invalidateOutline();
        if ((this.l || yeuVar.getClipToOutline()) && outline != null) {
            yeuVar.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }

    @Override // defpackage.yod
    public final void D(mu3 mu3Var) {
        Rect rect;
        boolean z2 = this.j;
        yeu yeuVar = this.d;
        if (z2) {
            if ((this.l || yeuVar.getClipToOutline()) && !this.k) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = yeuVar.getWidth();
                rect.bottom = yeuVar.getHeight();
            } else {
                rect = null;
            }
            yeuVar.setClipBounds(rect);
        }
        if (vd0.a(mu3Var).isHardwareAccelerated()) {
            this.b.a(mu3Var, yeuVar, yeuVar.getDrawingTime());
        }
    }

    @Override // defpackage.yod
    public final void E(long j) {
        long j2 = 9223372034707292159L & j;
        yeu yeuVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.p = false;
            yeuVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            yeuVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                jo0.G(yeuVar);
                return;
            }
            this.p = true;
            yeuVar.setPivotX(((int) (this.i >> 32)) / 2.0f);
            yeuVar.setPivotY(((int) (this.i & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.yod
    public final float F() {
        return this.t;
    }

    @Override // defpackage.yod
    public final void G(long j, int i, int i2) {
        boolean a = hqe.a(this.i, j);
        yeu yeuVar = this.d;
        if (a) {
            int i3 = this.g;
            if (i3 != i) {
                yeuVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.h;
            if (i4 != i2) {
                yeuVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.l || yeuVar.getClipToOutline()) {
                this.j = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            yeuVar.layout(i, i2, i + i5, i2 + i6);
            this.i = j;
            if (this.p) {
                yeuVar.setPivotX(i5 / 2.0f);
                yeuVar.setPivotY(i6 / 2.0f);
            }
        }
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.yod
    public final float H() {
        return this.s;
    }

    @Override // defpackage.yod
    public final float I() {
        return 0.0f;
    }

    @Override // defpackage.yod
    public final void J(int i) {
        this.n = i;
        yeu yeuVar = this.d;
        boolean z2 = true;
        if (i == 1 || this.m != 3) {
            yeuVar.setLayerType(2, null);
            yeuVar.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i == 1) {
            yeuVar.setLayerType(2, null);
        } else if (i == 2) {
            yeuVar.setLayerType(0, null);
            z2 = false;
        } else {
            yeuVar.setLayerType(0, null);
        }
        yeuVar.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    @Override // defpackage.yod
    public final float K() {
        return this.u;
    }

    @Override // defpackage.yod
    public final float L() {
        return this.r;
    }

    @Override // defpackage.yod
    public final qwn a() {
        return this.y;
    }

    @Override // defpackage.yod
    public final float b() {
        return this.o;
    }

    @Override // defpackage.yod
    public final void c(jx7 jx7Var, xof xofVar, xod xodVar, kma kmaVar) {
        yeu yeuVar = this.d;
        ViewParent parent = yeuVar.getParent();
        hpa hpaVar = this.b;
        if (parent == null) {
            hpaVar.addView(yeuVar);
        }
        yeuVar.g = jx7Var;
        yeuVar.h = xofVar;
        yeuVar.i = kmaVar;
        yeuVar.j = xodVar;
        if (yeuVar.isAttachedToWindow()) {
            yeuVar.setVisibility(4);
            yeuVar.setVisibility(0);
            try {
                pu3 pu3Var = this.c;
                epd epdVar = z;
                ud0 ud0Var = pu3Var.a;
                Canvas canvas = ud0Var.a;
                ud0Var.a = epdVar;
                hpaVar.a(ud0Var, yeuVar, yeuVar.getDrawingTime());
                pu3Var.a.a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // defpackage.yod
    public final void d(float f) {
        this.t = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.yod
    public final void e(qwn qwnVar) {
        this.y = qwnVar;
        if (Build.VERSION.SDK_INT >= 31) {
            rf0.E(this.d, qwnVar);
        }
    }

    @Override // defpackage.yod
    public final void f() {
        this.b.removeViewInLayout(this.d);
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
        this.q = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.yod
    public final void k(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.yod
    public final void l(float f) {
        this.x = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.yod
    public final void m(float f) {
        this.r = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.yod
    public final void n(float f) {
        this.o = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.yod
    public final void o(float f) {
        this.s = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.yod
    public final int p() {
        return this.n;
    }

    @Override // defpackage.yod
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.yod
    public final float r() {
        return this.x;
    }

    @Override // defpackage.yod
    public final long s() {
        return this.v;
    }

    @Override // defpackage.yod
    public final long t() {
        return this.w;
    }

    @Override // defpackage.yod
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            jo0.J(c3x.U(j), this.d);
        }
    }

    @Override // defpackage.yod
    public final float v() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.yod
    public final void w(boolean z2) {
        boolean z3 = false;
        this.l = z2 && !this.k;
        this.j = true;
        if (z2 && this.k) {
            z3 = true;
        }
        this.d.setClipToOutline(z3);
    }

    @Override // defpackage.yod
    public final void x(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            jo0.L(c3x.U(j), this.d);
        }
    }

    @Override // defpackage.yod
    public final Matrix y() {
        return this.d.getMatrix();
    }

    @Override // defpackage.yod
    public final int z() {
        return this.m;
    }
}
