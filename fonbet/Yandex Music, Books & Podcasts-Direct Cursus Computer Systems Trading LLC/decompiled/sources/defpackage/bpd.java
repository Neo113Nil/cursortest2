package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class bpd implements yod {
    public static final AtomicBoolean z = new AtomicBoolean(true);
    public final pu3 b;
    public final ou3 c;
    public final RenderNode d;
    public long e;
    public Matrix f;
    public boolean g;
    public long h;
    public int i;
    public final int j;
    public float k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public qwn y;

    public bpd(AndroidComposeView androidComposeView, pu3 pu3Var, ou3 ou3Var) {
        this.b = pu3Var;
        this.c = ou3Var;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.d = create;
        this.e = 0L;
        this.h = 0L;
        if (z.getAndSet(false)) {
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
                exn.c(create, exn.a(create));
                exn.d(create, exn.b(create));
            }
            cxn.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        N(0);
        this.i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = d85.b;
        this.r = j;
        this.s = j;
        this.u = 8.0f;
    }

    @Override // defpackage.yod
    public final float A() {
        return this.m;
    }

    @Override // defpackage.yod
    public final void B(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.yod
    public final void C(Outline outline, long j) {
        this.h = j;
        this.d.setOutline(outline);
        this.g = outline != null;
        M();
    }

    @Override // defpackage.yod
    public final void D(mu3 mu3Var) {
        DisplayListCanvas a = vd0.a(mu3Var);
        a.getClass();
        a.drawRenderNode(this.d);
    }

    @Override // defpackage.yod
    public final void E(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.l = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.l = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.yod
    public final float F() {
        return this.p;
    }

    @Override // defpackage.yod
    public final void G(long j, int i, int i2) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (hqe.a(this.e, j)) {
            return;
        }
        if (this.l) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.yod
    public final float H() {
        return this.o;
    }

    @Override // defpackage.yod
    public final float I() {
        return 0.0f;
    }

    @Override // defpackage.yod
    public final void J(int i) {
        this.i = i;
        if (i != 1 && this.j == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    @Override // defpackage.yod
    public final float K() {
        return this.q;
    }

    @Override // defpackage.yod
    public final float L() {
        return this.n;
    }

    public final void M() {
        boolean z2 = this.v;
        boolean z3 = false;
        boolean z4 = z2 && !this.g;
        if (z2 && this.g) {
            z3 = true;
        }
        if (z4 != this.w) {
            this.w = z4;
            this.d.setClipToBounds(z4);
        }
        if (z3 != this.x) {
            this.x = z3;
            this.d.setClipToOutline(z3);
        }
    }

    public final void N(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.yod
    public final qwn a() {
        return this.y;
    }

    @Override // defpackage.yod
    public final float b() {
        return this.k;
    }

    @Override // defpackage.yod
    public final void c(jx7 jx7Var, xof xofVar, xod xodVar, kma kmaVar) {
        Canvas start = this.d.start(Math.max((int) (this.e >> 32), (int) (this.h >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.h & 4294967295L)));
        try {
            ud0 ud0Var = this.b.a;
            Canvas canvas = ud0Var.a;
            ud0Var.a = start;
            ou3 ou3Var = this.c;
            nsh nshVar = ou3Var.b;
            long Q = nt0.Q(this.e);
            jx7 y = nshVar.y();
            xof A = nshVar.A();
            mu3 s = nshVar.s();
            long B = nshVar.B();
            xod xodVar2 = (xod) nshVar.c;
            nshVar.O(jx7Var);
            nshVar.P(xofVar);
            nshVar.M(ud0Var);
            nshVar.R(Q);
            nshVar.c = xodVar;
            ud0Var.r();
            try {
                kmaVar.invoke(ou3Var);
                ud0Var.k();
                nshVar.O(y);
                nshVar.P(A);
                nshVar.M(s);
                nshVar.R(B);
                nshVar.c = xodVar2;
                ud0Var.a = canvas;
                this.d.end(start);
            } catch (Throwable th) {
                ud0Var.k();
                nsh nshVar2 = ou3Var.b;
                nshVar2.O(y);
                nshVar2.P(A);
                nshVar2.M(s);
                nshVar2.R(B);
                nshVar2.c = xodVar2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(start);
            throw th2;
        }
    }

    @Override // defpackage.yod
    public final void d(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.yod
    public final void e(qwn qwnVar) {
        this.y = qwnVar;
    }

    @Override // defpackage.yod
    public final void f() {
        cxn.a(this.d);
    }

    @Override // defpackage.yod
    public final boolean g() {
        return this.d.isValid();
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
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.yod
    public final void k(float f) {
        this.u = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.yod
    public final void l(float f) {
        this.t = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.yod
    public final void m(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.yod
    public final void n(float f) {
        this.k = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.yod
    public final void o(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.yod
    public final int p() {
        return this.i;
    }

    @Override // defpackage.yod
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.yod
    public final float r() {
        return this.t;
    }

    @Override // defpackage.yod
    public final long s() {
        return this.r;
    }

    @Override // defpackage.yod
    public final long t() {
        return this.s;
    }

    @Override // defpackage.yod
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            exn.c(this.d, c3x.U(j));
        }
    }

    @Override // defpackage.yod
    public final float v() {
        return this.u;
    }

    @Override // defpackage.yod
    public final void w(boolean z2) {
        this.v = z2;
        M();
    }

    @Override // defpackage.yod
    public final void x(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            exn.d(this.d, c3x.U(j));
        }
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
        return this.j;
    }
}
