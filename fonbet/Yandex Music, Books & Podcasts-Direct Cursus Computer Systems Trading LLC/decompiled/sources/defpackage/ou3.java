package defpackage;

import android.graphics.Paint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ou3 implements jpa {
    public final nu3 a;
    public final nsh b;
    public gh0 c;
    public gh0 d;

    public ou3() {
        kx7 kx7Var = xv7.k;
        xof xofVar = xof.a;
        nu3 nu3Var = new nu3();
        nu3Var.a = kx7Var;
        nu3Var.b = xofVar;
        nu3Var.c = q4b.a;
        nu3Var.d = 0L;
        this.a = nu3Var;
        this.b = new nsh(this);
    }

    public static gh0 a(ou3 ou3Var, long j, kpa kpaVar, float f, m85 m85Var, int i) {
        gh0 h = ou3Var.h(kpaVar);
        Paint paint = h.a;
        if (f != 1.0f) {
            j = d85.b(j, d85.d(j) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        if (!d85.c(c3x.f(paint.getColor()), j)) {
            h.e(j);
        }
        if (h.c != null) {
            h.h(null);
        }
        if (!Intrinsics.d(h.d, m85Var)) {
            h.f(m85Var);
        }
        if (h.b != i) {
            h.d(i);
        }
        if (paint.isFilterBitmap()) {
            return h;
        }
        h.g(1);
        return h;
    }

    public static gh0 c(ou3 ou3Var, long j, float f, int i) {
        gh0 gh0Var = ou3Var.d;
        if (gh0Var == null) {
            gh0Var = hld.p();
            gh0Var.l(1);
            ou3Var.d = gh0Var;
        }
        Paint paint = gh0Var.a;
        if (!d85.c(c3x.f(paint.getColor()), j)) {
            gh0Var.e(j);
        }
        if (gh0Var.c != null) {
            gh0Var.h(null);
        }
        if (!Intrinsics.d(gh0Var.d, null)) {
            gh0Var.f(null);
        }
        if (gh0Var.b != 3) {
            gh0Var.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            gh0Var.k(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (gh0Var.a() != i) {
            gh0Var.i(i);
        }
        if (gh0Var.b() != 0) {
            gh0Var.j(0);
        }
        if (paint.isFilterBitmap()) {
            return gh0Var;
        }
        gh0Var.g(1);
        return gh0Var;
    }

    @Override // defpackage.jpa
    public final void F0(ai3 ai3Var, long j, long j2, float f, kpa kpaVar, m85 m85Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.t(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(ai3Var, kpaVar, f, m85Var, i, 1));
    }

    @Override // defpackage.jpa
    public final void H(long j, long j2, long j3, long j4, kpa kpaVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, kpaVar, 1.0f, null, 3));
    }

    @Override // defpackage.jpa
    public final void I(ltp ltpVar, float f, long j, float f2, kpa kpaVar) {
        this.a.c.c(f, j, b(ltpVar, kpaVar, f2, null, 3, 1));
    }

    @Override // defpackage.jpa
    public final void V(long j, float f, float f2, boolean z, long j2, long j3, float f3, kpa kpaVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, z, a(this, j, kpaVar, f3, null, 3));
    }

    public final gh0 b(ai3 ai3Var, kpa kpaVar, float f, m85 m85Var, int i, int i2) {
        gh0 h = h(kpaVar);
        Paint paint = h.a;
        if (ai3Var != null) {
            ai3Var.a(f, e(), h);
        } else {
            if (h.c != null) {
                h.h(null);
            }
            long f2 = c3x.f(paint.getColor());
            long j = d85.b;
            if (!d85.c(f2, j)) {
                h.e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                h.c(f);
            }
        }
        if (!Intrinsics.d(h.d, m85Var)) {
            h.f(m85Var);
        }
        if (h.b != i) {
            h.d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return h;
        }
        h.g(i2);
        return h;
    }

    public final void d(yg0 yg0Var, d43 d43Var) {
        this.a.c.a(yg0Var, b(null, dbc.a, 1.0f, d43Var, 3, 1));
    }

    @Override // defpackage.jpa
    public final void e0(eak eakVar, ai3 ai3Var, float f, kpa kpaVar, int i) {
        this.a.c.e(eakVar, b(ai3Var, kpaVar, f, null, i, 1));
    }

    @Override // defpackage.jpa
    public final void f(eak eakVar, long j, float f, kpa kpaVar) {
        this.a.c.e(eakVar, a(this, j, kpaVar, f, null, 3));
    }

    @Override // defpackage.jpa
    public final void g0(long j, float f, long j2, float f2, kpa kpaVar, int i) {
        this.a.c.c(f, j2, a(this, j, kpaVar, f2, null, i));
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.jpa
    public final xof getLayoutDirection() {
        return this.a.b;
    }

    public final gh0 h(kpa kpaVar) {
        if (Intrinsics.d(kpaVar, dbc.a)) {
            gh0 gh0Var = this.c;
            if (gh0Var != null) {
                return gh0Var;
            }
            gh0 p = hld.p();
            p.l(0);
            this.c = p;
            return p;
        }
        if (!(kpaVar instanceof amr)) {
            b6e.s();
            return null;
        }
        gh0 gh0Var2 = this.d;
        if (gh0Var2 == null) {
            gh0Var2 = hld.p();
            gh0Var2.l(1);
            this.d = gh0Var2;
        }
        Paint paint = gh0Var2.a;
        float strokeWidth = paint.getStrokeWidth();
        amr amrVar = (amr) kpaVar;
        float f = amrVar.a;
        if (strokeWidth != f) {
            gh0Var2.k(f);
        }
        int a = gh0Var2.a();
        int i = amrVar.c;
        if (a != i) {
            gh0Var2.i(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = amrVar.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int b = gh0Var2.b();
        int i2 = amrVar.d;
        if (b == i2) {
            return gh0Var2;
        }
        gh0Var2.j(i2);
        return gh0Var2;
    }

    @Override // defpackage.jpa
    public final void h0(yg0 yg0Var, long j, long j2, long j3, long j4, float f, m85 m85Var, int i) {
        this.a.c.d(yg0Var, j, j2, j3, j4, b(null, dbc.a, f, m85Var, 3, i));
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.a.a.i0();
    }

    @Override // defpackage.jpa
    public final void k0(o6g o6gVar, long j, long j2, kpa kpaVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.q(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), b(o6gVar, kpaVar, 1.0f, null, 3, 1));
    }

    @Override // defpackage.jpa
    public final void l0(ai3 ai3Var, long j, long j2, long j3, float f, kpa kpaVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(ai3Var, kpaVar, f, null, 3, 1));
    }

    @Override // defpackage.jpa
    public final nsh q0() {
        return this.b;
    }

    @Override // defpackage.jpa
    public final void s(long j, long j2, long j3, float f, int i) {
        this.a.c.g(j2, j3, c(this, j, f, i));
    }

    @Override // defpackage.jpa
    public final void u0(ArrayList arrayList, long j, float f) {
        this.a.c.l(arrayList, c(this, j, f, 1));
    }

    @Override // defpackage.jpa
    public final void v0(long j, long j2, long j3, float f, kpa kpaVar, m85 m85Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.t(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, kpaVar, f, m85Var, i));
    }
}
