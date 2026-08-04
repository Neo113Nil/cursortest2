package com.gamericefishpro.space.q1;

import android.graphics.Paint;
import android.graphics.Shader;
import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.o1.h;
import com.gamericefishpro.space.o1.k;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.r8.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public final a d;
    public final com.gamericefishpro.space.a8.c e;
    public m i;
    public m v;

    public b() {
        l lVar = l.d;
        a aVar = new a();
        aVar.a = c.a;
        aVar.b = lVar;
        aVar.c = e.a;
        aVar.d = 0L;
        this.d = aVar;
        this.e = new com.gamericefishpro.space.a8.c(this);
    }

    public static m a(b bVar, long j, c cVar, int i) {
        m mVarE = bVar.e(cVar);
        Paint paint = (Paint) mVarE.b;
        if (!s.d(o.b(paint.getColor()), j)) {
            mVarE.c(j);
        }
        if (((Shader) mVarE.c) != null) {
            mVarE.c = null;
            paint.setShader(null);
        }
        if (!Intrinsics.a((k) mVarE.d, null)) {
            mVarE.d(null);
        }
        if (mVarE.a != i) {
            mVarE.b(i);
        }
        if (paint.isFilterBitmap()) {
            return mVarE;
        }
        paint.setFilterBitmap(true);
        return mVarE;
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void O(h hVar, long j, c cVar) {
        this.d.c.h(hVar, a(this, j, cVar, 3));
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void T(o oVar, long j, long j2, float f, c cVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.d.c.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), d(oVar, cVar, f, null, 3, 1));
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void W(long j, long j2, long j3, c cVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.d.c.e(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, cVar, i));
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d.a.b();
    }

    public final m d(o oVar, c cVar, float f, k kVar, int i, int i2) {
        m mVarE = e(cVar);
        Paint paint = (Paint) mVarE.b;
        if (oVar != null) {
            oVar.g(f, c(), mVarE);
        } else {
            if (((Shader) mVarE.c) != null) {
                mVarE.c = null;
                paint.setShader(null);
            }
            long jB = o.b(paint.getColor());
            long j = s.b;
            if (!s.d(jB, j)) {
                mVarE.c(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                mVarE.a(f);
            }
        }
        if (!Intrinsics.a((k) mVarE.d, kVar)) {
            mVarE.d(kVar);
        }
        if (mVarE.a != i) {
            mVarE.b(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return mVarE;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return mVarE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    public final m e(c cVar) {
        int i;
        Paint.Join join;
        Paint.Cap cap;
        int i2 = 0;
        if (Intrinsics.a(cVar, f.b)) {
            m mVar = this.i;
            if (mVar != null) {
                return mVar;
            }
            m mVarF = o.f();
            mVarF.e(0);
            this.i = mVarF;
            return mVarF;
        }
        if (!(cVar instanceof g)) {
            throw new com.gamericefishpro.space.oh.k();
        }
        m mVarF2 = this.v;
        if (mVarF2 == null) {
            mVarF2 = o.f();
            mVarF2.e(1);
            this.v = mVarF2;
        }
        Paint paint = (Paint) mVarF2.b;
        float strokeWidth = paint.getStrokeWidth();
        g gVar = (g) cVar;
        float f = gVar.b;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i3 = strokeCap == null ? -1 : com.gamericefishpro.space.o1.g.a[strokeCap.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 2) {
            i = 1;
        } else if (i3 != 3) {
            i = 0;
        } else {
            i = 2;
        }
        int i4 = gVar.d;
        if (i != i4) {
            if (i4 == 2) {
                cap = Paint.Cap.SQUARE;
            } else if (i4 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i4 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = gVar.c;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i5 = strokeJoin != null ? com.gamericefishpro.space.o1.g.b[strokeJoin.ordinal()] : -1;
        if (i5 != 1) {
            if (i5 == 2) {
                i2 = 2;
            } else if (i5 == 3) {
                i2 = 1;
            }
        }
        int i6 = gVar.e;
        if (i2 == i6) {
            return mVarF2;
        }
        if (i6 == 0) {
            join = Paint.Join.MITER;
        } else if (i6 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i6 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        return mVarF2;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.d.a.g();
    }

    @Override // com.gamericefishpro.space.q1.d
    public final l getLayoutDirection() {
        return this.d.b;
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void m(com.gamericefishpro.space.o1.f fVar, long j, long j2, long j3, float f, k kVar, int i) {
        this.d.c.j(fVar, j, j2, j3, d(null, f.b, f, kVar, 3, i));
    }

    @Override // com.gamericefishpro.space.q1.d
    public final void s(h hVar, o oVar, float f, c cVar, int i) {
        this.d.c.h(hVar, d(oVar, cVar, f, null, i, 1));
    }

    @Override // com.gamericefishpro.space.q1.d
    public final com.gamericefishpro.space.a8.c x() {
        return this.e;
    }
}
