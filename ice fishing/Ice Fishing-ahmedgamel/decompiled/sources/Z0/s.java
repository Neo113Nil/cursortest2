package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import f1.AbstractC4498a;
import j1.C4597a;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC4498a f4111q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4112r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4113s;

    /* renamed from: t, reason: collision with root package name */
    public final a1.f f4114t;

    /* renamed from: u, reason: collision with root package name */
    public a1.s f4115u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(v vVar, AbstractC4498a abstractC4498a, e1.o oVar) {
        super(vVar, abstractC4498a, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.i, oVar.f37174e, oVar.f37175f, oVar.f37172c, oVar.f37171b);
        int d2 = AbstractC5049e.d(oVar.f37176g);
        Paint.Cap cap = d2 != 0 ? d2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int d9 = AbstractC5049e.d(oVar.f37177h);
        this.f4111q = abstractC4498a;
        this.f4112r = oVar.f37170a;
        this.f4113s = oVar.f37178j;
        AbstractC0428e a9 = oVar.f37173d.a();
        this.f4114t = (a1.f) a9;
        a9.a(this);
        abstractC4498a.d(a9);
    }

    @Override // Z0.b, Z0.e
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        if (this.f4113s) {
            return;
        }
        a1.f fVar = this.f4114t;
        int l9 = fVar.l(fVar.f4255c.i(), fVar.c());
        Y0.a aVar = this.i;
        aVar.setColor(l9);
        a1.s sVar = this.f4115u;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        super.g(canvas, matrix, i, c4597a);
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4112r;
    }

    @Override // Z0.b, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        PointF pointF = z.f3729a;
        a1.f fVar = this.f4114t;
        if (colorFilter == 2) {
            fVar.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3724I) {
            a1.s sVar = this.f4115u;
            AbstractC4498a abstractC4498a = this.f4111q;
            if (sVar != null) {
                abstractC4498a.o(sVar);
            }
            a1.s sVar2 = new a1.s(c2991bm, null);
            this.f4115u = sVar2;
            sVar2.a(this);
            abstractC4498a.d(fVar);
        }
    }
}
