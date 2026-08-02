package b1;

import Z0.v;
import Z0.z;
import a1.C0428a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;
import l1.C4666a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0521e, InterfaceC0541a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f5408a;

    /* renamed from: b, reason: collision with root package name */
    public final C0428a f5409b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4563a f5410c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5411d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5412e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5413f;

    /* renamed from: g, reason: collision with root package name */
    public final c1.f f5414g;

    /* renamed from: h, reason: collision with root package name */
    public final c1.f f5415h;
    public c1.s i;

    /* renamed from: j, reason: collision with root package name */
    public final v f5416j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0545e f5417k;

    /* renamed from: l, reason: collision with root package name */
    public float f5418l;

    public g(v vVar, AbstractC4563a abstractC4563a, g1.l lVar) {
        Path path = new Path();
        this.f5408a = path;
        this.f5409b = new C0428a(1, 0);
        this.f5413f = new ArrayList();
        this.f5410c = abstractC4563a;
        this.f5411d = lVar.f37635c;
        this.f5412e = lVar.f37638f;
        this.f5416j = vVar;
        if (abstractC4563a.l() != null) {
            c1.i a9 = ((C4516b) abstractC4563a.l().f38154u).a();
            this.f5417k = a9;
            a9.a(this);
            abstractC4563a.f(this.f5417k);
        }
        C4515a c4515a = lVar.f37636d;
        if (c4515a == null) {
            this.f5414g = null;
            this.f5415h = null;
            return;
        }
        C4515a c4515a2 = lVar.f37637e;
        path.setFillType(lVar.f37634b);
        AbstractC0545e a10 = c4515a.a();
        this.f5414g = (c1.f) a10;
        a10.a(this);
        abstractC4563a.f(a10);
        AbstractC0545e a11 = c4515a2.a();
        this.f5415h = (c1.f) a11;
        a11.a(this);
        abstractC4563a.f(a11);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5416j.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) list2.get(i);
            if (interfaceC0519c instanceof m) {
                this.f5413f.add((m) interfaceC0519c);
            }
        }
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4672g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        PointF pointF = z.f4080a;
        if (colorFilter == 1) {
            this.f5414g.j(lp);
            return;
        }
        if (colorFilter == 4) {
            this.f5415h.j(lp);
            return;
        }
        ColorFilter colorFilter2 = z.f4075I;
        AbstractC4563a abstractC4563a = this.f5410c;
        if (colorFilter == colorFilter2) {
            c1.s sVar = this.i;
            if (sVar != null) {
                abstractC4563a.o(sVar);
            }
            c1.s sVar2 = new c1.s(lp, null);
            this.i = sVar2;
            sVar2.a(this);
            abstractC4563a.f(this.i);
            return;
        }
        if (colorFilter == z.f4084e) {
            AbstractC0545e abstractC0545e = this.f5417k;
            if (abstractC0545e != null) {
                abstractC0545e.j(lp);
                return;
            }
            c1.s sVar3 = new c1.s(lp, null);
            this.f5417k = sVar3;
            sVar3.a(this);
            abstractC4563a.f(this.f5417k);
        }
    }

    @Override // b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        Path path = this.f5408a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5413f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).g(), matrix);
                i++;
            }
        }
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5411d;
    }

    @Override // b1.InterfaceC0521e
    public final void h(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        BlurMaskFilter blurMaskFilter;
        if (this.f5412e) {
            return;
        }
        c1.f fVar = this.f5414g;
        float intValue = ((Integer) this.f5415h.e()).intValue() / 100.0f;
        int c9 = (AbstractC4672g.c((int) (i * intValue)) << 24) | (fVar.l(fVar.f5650c.f(), fVar.c()) & 16777215);
        C0428a c0428a = this.f5409b;
        c0428a.setColor(c9);
        c1.s sVar = this.i;
        if (sVar != null) {
            c0428a.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0545e abstractC0545e = this.f5417k;
        if (abstractC0545e != null) {
            float floatValue = ((Float) abstractC0545e.e()).floatValue();
            if (floatValue == 0.0f) {
                c0428a.setMaskFilter(null);
            } else if (floatValue != this.f5418l) {
                AbstractC4563a abstractC4563a = this.f5410c;
                if (abstractC4563a.f37972A == floatValue) {
                    blurMaskFilter = abstractC4563a.f37973B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC4563a.f37973B = blurMaskFilter2;
                    abstractC4563a.f37972A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c0428a.setMaskFilter(blurMaskFilter);
            }
            this.f5418l = floatValue;
        }
        if (c4666a != null) {
            c4666a.a((int) (intValue * 255.0f), c0428a);
        } else {
            c0428a.clearShadowLayer();
        }
        Path path = this.f5408a;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f5413f;
            if (i4 >= arrayList.size()) {
                canvas.drawPath(path, c0428a);
                return;
            } else {
                path.addPath(((m) arrayList.get(i4)).g(), matrix);
                i4++;
            }
        }
    }
}
