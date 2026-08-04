package com.gamericefishpro.space.y2;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import com.gamericefishpro.space.b3.l;
import com.gamericefishpro.space.o1.i0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.r8.m;
import com.gamericefishpro.space.t0.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends TextPaint {
    public m a;
    public l b;
    public int c;
    public j0 d;
    public s e;
    public o f;
    public d0 g;
    public com.gamericefishpro.space.n1.e h;
    public com.gamericefishpro.space.q1.c i;

    public final m a() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this);
        this.a = mVar2;
        return mVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().b(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(final o oVar, final long j, float f) {
        if (oVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (oVar instanceof m0) {
            d(com.gamericefishpro.space.a.a.y(((m0) oVar).f, f));
            return;
        }
        if (!(oVar instanceof i0)) {
            throw new com.gamericefishpro.space.oh.k();
        }
        if (Intrinsics.a(this.f, oVar)) {
            com.gamericefishpro.space.n1.e eVar = this.h;
            if (!(eVar == null ? false : com.gamericefishpro.space.n1.e.a(eVar.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = oVar;
                    this.h = new com.gamericefishpro.space.n1.e(j);
                    this.g = com.gamericefishpro.space.t0.i.p(new Function0() { // from class: com.gamericefishpro.space.y2.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ((i0) oVar).H(j);
                        }
                    });
                }
            }
        } else {
            if (j != 9205357640488583168L) {
                this.f = oVar;
                this.h = new com.gamericefishpro.space.n1.e(j);
                this.g = com.gamericefishpro.space.t0.i.p(new Function0() { // from class: com.gamericefishpro.space.y2.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ((i0) oVar).H(j);
                    }
                });
            }
        }
        m mVarA = a();
        d0 d0Var = this.g;
        Shader shader = d0Var != null ? (Shader) d0Var.getValue() : null;
        mVarA.c = shader;
        ((Paint) mVarA.b).setShader(shader);
        this.e = null;
        j.b(this, f);
    }

    public final void d(long j) {
        s sVar = this.e;
        if (sVar == null ? false : s.d(sVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new s(j);
            setColor(o.y(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(com.gamericefishpro.space.q1.c cVar) {
        Paint.Join join;
        Paint.Cap cap;
        if (cVar == null || Intrinsics.a(this.i, cVar)) {
            return;
        }
        this.i = cVar;
        if (cVar.equals(com.gamericefishpro.space.q1.f.b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(cVar instanceof com.gamericefishpro.space.q1.g)) {
            throw new com.gamericefishpro.space.oh.k();
        }
        a().e(1);
        com.gamericefishpro.space.q1.g gVar = (com.gamericefishpro.space.q1.g) cVar;
        ((Paint) a().b).setStrokeWidth(gVar.b);
        ((Paint) a().b).setStrokeMiter(gVar.c);
        m mVarA = a();
        int i = gVar.e;
        Paint paint = (Paint) mVarA.b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        m mVarA2 = a();
        int i2 = gVar.d;
        Paint paint2 = (Paint) mVarA2.b;
        if (i2 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i2 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i2 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint2.setStrokeCap(cap);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(j0 j0Var) {
        if (j0Var == null || Intrinsics.a(this.d, j0Var)) {
            return;
        }
        this.d = j0Var;
        if (j0Var.equals(j0.d)) {
            clearShadowLayer();
            return;
        }
        j0 j0Var2 = this.d;
        float f = j0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (j0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), o.y(this.d.a));
    }

    public final void g(l lVar) {
        if (lVar == null || Intrinsics.a(this.b, lVar)) {
            return;
        }
        this.b = lVar;
        int i = lVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
