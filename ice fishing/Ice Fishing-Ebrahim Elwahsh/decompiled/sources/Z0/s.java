package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import f1.AbstractC4490a;
import j1.C4589b;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC4490a f4188q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4189r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4190s;

    /* renamed from: t, reason: collision with root package name */
    public final a1.f f4191t;

    /* renamed from: u, reason: collision with root package name */
    public a1.s f4192u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(v vVar, AbstractC4490a abstractC4490a, e1.o oVar) {
        super(vVar, abstractC4490a, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.i, oVar.f37305e, oVar.f37306f, oVar.f37303c, oVar.f37302b);
        int d2 = AbstractC5088e.d(oVar.f37307g);
        Paint.Cap cap = d2 != 0 ? d2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int d3 = AbstractC5088e.d(oVar.f37308h);
        this.f4188q = abstractC4490a;
        this.f4189r = oVar.f37301a;
        this.f4190s = oVar.f37309j;
        AbstractC0421e a9 = oVar.f37304d.a();
        this.f4191t = (a1.f) a9;
        a9.a(this);
        abstractC4490a.e(a9);
    }

    @Override // Z0.b, c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        super.c(colorFilter, sVar);
        PointF pointF = z.f3785a;
        a1.f fVar = this.f4191t;
        if (colorFilter == 2) {
            fVar.j(sVar);
            return;
        }
        if (colorFilter == z.f3780I) {
            a1.s sVar2 = this.f4192u;
            AbstractC4490a abstractC4490a = this.f4188q;
            if (sVar2 != null) {
                abstractC4490a.o(sVar2);
            }
            a1.s sVar3 = new a1.s(sVar, null);
            this.f4192u = sVar3;
            sVar3.a(this);
            abstractC4490a.e(fVar);
        }
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4189r;
    }

    @Override // Z0.b, Z0.e
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        if (this.f4190s) {
            return;
        }
        a1.f fVar = this.f4191t;
        int l9 = fVar.l(fVar.f4304c.h(), fVar.c());
        Y0.a aVar = this.i;
        aVar.setColor(l9);
        a1.s sVar = this.f4192u;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        super.h(canvas, matrix, i, c4589b);
    }
}
