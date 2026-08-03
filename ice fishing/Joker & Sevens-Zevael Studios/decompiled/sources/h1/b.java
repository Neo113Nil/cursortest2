package h1;

import android.graphics.Paint;
import android.graphics.Shader;
import f1.d0;
import f1.i;
import f1.o;
import f1.q;
import l6.l;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: g, reason: collision with root package name */
    public final a f2595g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.c f2596h;

    /* renamed from: i, reason: collision with root package name */
    public l f2597i;

    /* renamed from: j, reason: collision with root package name */
    public l f2598j;

    public b() {
        a aVar = new a();
        aVar.f2591a = c.f2599a;
        aVar.f2592b = s2.l.f6396g;
        aVar.f2593c = e.f2600a;
        aVar.f2594d = 0L;
        this.f2595g = aVar;
        a5.c cVar = new a5.c();
        cVar.f263i = this;
        cVar.f262h = new f8.c(12, cVar);
        this.f2596h = cVar;
    }

    public static l a(b bVar, long j3, c cVar, int i10) {
        l e10 = bVar.e(cVar);
        Paint paint = (Paint) e10.f4199b;
        if (!q.c(d0.b(paint.getColor()), j3)) {
            e10.f(j3);
        }
        if (((Shader) e10.f4200c) != null) {
            e10.h(null);
        }
        if (!j.a((f1.l) e10.f4201d, null)) {
            e10.g(null);
        }
        if (e10.f4198a != i10) {
            e10.e(i10);
        }
        if (paint.isFilterBitmap()) {
            return e10;
        }
        paint.setFilterBitmap(true);
        return e10;
    }

    @Override // h1.d
    public final a5.c A() {
        return this.f2596h;
    }

    @Override // h1.d
    public final void G(long j3, long j6, long j10, float f10, int i10) {
        o oVar = this.f2595g.f2593c;
        l lVar = this.f2598j;
        if (lVar == null) {
            lVar = d0.f();
            lVar.k(1);
            this.f2598j = lVar;
        }
        Paint paint = (Paint) lVar.f4199b;
        if (!q.c(d0.b(paint.getColor()), j3)) {
            lVar.f(j3);
        }
        if (((Shader) lVar.f4200c) != null) {
            lVar.h(null);
        }
        if (!j.a((f1.l) lVar.f4201d, null)) {
            lVar.g(null);
        }
        if (lVar.f4198a != 3) {
            lVar.e(3);
        }
        if (paint.getStrokeWidth() != f10) {
            paint.setStrokeWidth(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (lVar.b() != i10) {
            lVar.i(i10);
        }
        if (lVar.c() != 0) {
            lVar.j(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        oVar.l(j6, j10, lVar);
    }

    @Override // h1.d
    public final void Y(i iVar, d0 d0Var, float f10, c cVar, int i10) {
        this.f2595g.f2593c.j(iVar, b(d0Var, cVar, f10, null, i10, 1));
    }

    @Override // h1.d
    public final void Z(long j3, long j6, long j10, c cVar, int i10) {
        int i11 = (int) (j6 >> 32);
        int i12 = (int) (j6 & 4294967295L);
        this.f2595g.f2593c.c(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i12), a(this, j3, cVar, i10));
    }

    public final l b(d0 d0Var, c cVar, float f10, f1.l lVar, int i10, int i11) {
        l e10 = e(cVar);
        Paint paint = (Paint) e10.f4199b;
        if (d0Var != null) {
            d0Var.g(f10, d(), e10);
        } else {
            if (((Shader) e10.f4200c) != null) {
                e10.h(null);
            }
            long b2 = d0.b(paint.getColor());
            long j3 = q.f2277b;
            if (!q.c(b2, j3)) {
                e10.f(j3);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                e10.d(f10);
            }
        }
        if (!j.a((f1.l) e10.f4201d, lVar)) {
            e10.g(lVar);
        }
        if (e10.f4198a != i10) {
            e10.e(i10);
        }
        if (paint.isFilterBitmap() == i11) {
            return e10;
        }
        paint.setFilterBitmap(true ^ (i11 == 0));
        return e10;
    }

    @Override // s2.c
    public final float c() {
        return this.f2595g.f2591a.c();
    }

    public final l e(c cVar) {
        if (j.a(cVar, f.f2601b)) {
            l lVar = this.f2597i;
            if (lVar != null) {
                return lVar;
            }
            l f10 = d0.f();
            f10.k(0);
            this.f2597i = f10;
            return f10;
        }
        if (!(cVar instanceof g)) {
            throw new ac.d();
        }
        l lVar2 = this.f2598j;
        if (lVar2 == null) {
            lVar2 = d0.f();
            lVar2.k(1);
            this.f2598j = lVar2;
        }
        Paint paint = (Paint) lVar2.f4199b;
        float strokeWidth = paint.getStrokeWidth();
        g gVar = (g) cVar;
        float f11 = gVar.f2602b;
        if (strokeWidth != f11) {
            paint.setStrokeWidth(f11);
        }
        int b2 = lVar2.b();
        int i10 = gVar.f2604d;
        if (b2 != i10) {
            lVar2.i(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f12 = gVar.f2603c;
        if (strokeMiter != f12) {
            paint.setStrokeMiter(f12);
        }
        int c3 = lVar2.c();
        int i11 = gVar.f2605e;
        if (c3 == i11) {
            return lVar2;
        }
        lVar2.j(i11);
        return lVar2;
    }

    @Override // h1.d
    public final s2.l getLayoutDirection() {
        return this.f2595g.f2592b;
    }

    @Override // s2.c
    public final float m() {
        return this.f2595g.f2591a.m();
    }

    @Override // h1.d
    public final void u(f1.g gVar, long j3, long j6, long j10, float f10, f1.l lVar, int i10) {
        this.f2595g.f2593c.f(gVar, j3, j6, j10, b(null, f.f2601b, f10, lVar, 3, i10));
    }
}
