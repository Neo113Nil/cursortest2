package b1;

import Z0.v;
import Z0.z;
import a1.C0428a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import c1.AbstractC0545e;
import com.google.android.gms.internal.ads.LP;
import h1.AbstractC4563a;
import l1.C4666a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class s extends AbstractC0518b {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC4563a f5500q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5501r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5502s;

    /* renamed from: t, reason: collision with root package name */
    public final c1.f f5503t;

    /* renamed from: u, reason: collision with root package name */
    public c1.s f5504u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(v vVar, AbstractC4563a abstractC4563a, g1.o oVar) {
        super(vVar, abstractC4563a, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.i, oVar.f37650e, oVar.f37651f, oVar.f37648c, oVar.f37647b);
        int d9 = AbstractC5050e.d(oVar.f37652g);
        Paint.Cap cap = d9 != 0 ? d9 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int d10 = AbstractC5050e.d(oVar.f37653h);
        this.f5500q = abstractC4563a;
        this.f5501r = oVar.f37646a;
        this.f5502s = oVar.f37654j;
        AbstractC0545e a9 = oVar.f37649d.a();
        this.f5503t = (c1.f) a9;
        a9.a(this);
        abstractC4563a.f(a9);
    }

    @Override // b1.AbstractC0518b, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        PointF pointF = z.f4080a;
        c1.f fVar = this.f5503t;
        if (colorFilter == 2) {
            fVar.j(lp);
            return;
        }
        if (colorFilter == z.f4075I) {
            c1.s sVar = this.f5504u;
            AbstractC4563a abstractC4563a = this.f5500q;
            if (sVar != null) {
                abstractC4563a.o(sVar);
            }
            c1.s sVar2 = new c1.s(lp, null);
            this.f5504u = sVar2;
            sVar2.a(this);
            abstractC4563a.f(fVar);
        }
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5501r;
    }

    @Override // b1.AbstractC0518b, b1.InterfaceC0521e
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        if (this.f5502s) {
            return;
        }
        c1.f fVar = this.f5503t;
        int l9 = fVar.l(fVar.f5650c.f(), fVar.c());
        C0428a c0428a = this.i;
        c0428a.setColor(l9);
        c1.s sVar = this.f5504u;
        if (sVar != null) {
            c0428a.setColorFilter((ColorFilter) sVar.e());
        }
        super.h(canvas, matrix, i, c4666a);
    }
}
