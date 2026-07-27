package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4443a;
import d1.C4444b;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import j1.C4597a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements e, InterfaceC0424a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4019a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.a f4020b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC4498a f4021c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4022d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4023e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4024f;

    /* renamed from: g, reason: collision with root package name */
    public final a1.f f4025g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.f f4026h;
    public a1.s i;

    /* renamed from: j, reason: collision with root package name */
    public final v f4027j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0428e f4028k;

    /* renamed from: l, reason: collision with root package name */
    public float f4029l;

    public g(v vVar, AbstractC4498a abstractC4498a, e1.l lVar) {
        Path path = new Path();
        this.f4019a = path;
        this.f4020b = new Y0.a(1, 0);
        this.f4024f = new ArrayList();
        this.f4021c = abstractC4498a;
        this.f4022d = lVar.f37159c;
        this.f4023e = lVar.f37162f;
        this.f4027j = vVar;
        if (abstractC4498a.l() != null) {
            a1.i a9 = ((C4444b) abstractC4498a.l().f903u).a();
            this.f4028k = a9;
            a9.a(this);
            abstractC4498a.d(this.f4028k);
        }
        C4443a c4443a = lVar.f37160d;
        if (c4443a == null) {
            this.f4025g = null;
            this.f4026h = null;
            return;
        }
        C4443a c4443a2 = lVar.f37161e;
        path.setFillType(lVar.f37158b);
        AbstractC0428e a10 = c4443a.a();
        this.f4025g = (a1.f) a10;
        a10.a(this);
        abstractC4498a.d(a10);
        AbstractC0428e a11 = c4443a2.a();
        this.f4026h = (a1.f) a11;
        a11.a(this);
        abstractC4498a.d(a11);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4027j.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.f4024f.add((m) cVar);
            }
        }
    }

    @Override // Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        Path path = this.f4019a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4024f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).f(), matrix);
                i++;
            }
        }
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4603g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.e
    public final void g(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        BlurMaskFilter blurMaskFilter;
        if (this.f4023e) {
            return;
        }
        a1.f fVar = this.f4025g;
        float intValue = ((Integer) this.f4026h.e()).intValue() / 100.0f;
        int c9 = (AbstractC4603g.c((int) (i * intValue)) << 24) | (fVar.l(fVar.f4255c.i(), fVar.c()) & 16777215);
        Y0.a aVar = this.f4020b;
        aVar.setColor(c9);
        a1.s sVar = this.i;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        AbstractC0428e abstractC0428e = this.f4028k;
        if (abstractC0428e != null) {
            float floatValue = ((Float) abstractC0428e.e()).floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.f4029l) {
                AbstractC4498a abstractC4498a = this.f4021c;
                if (abstractC4498a.f37348A == floatValue) {
                    blurMaskFilter = abstractC4498a.f37349B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC4498a.f37349B = blurMaskFilter2;
                    abstractC4498a.f37348A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f4029l = floatValue;
        }
        if (c4597a != null) {
            c4597a.a((int) (intValue * 255.0f), aVar);
        } else {
            aVar.clearShadowLayer();
        }
        Path path = this.f4019a;
        path.reset();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4024f;
            if (i6 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                return;
            } else {
                path.addPath(((m) arrayList.get(i6)).f(), matrix);
                i6++;
            }
        }
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4022d;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        PointF pointF = z.f3729a;
        if (colorFilter == 1) {
            this.f4025g.j(c2991bm);
            return;
        }
        if (colorFilter == 4) {
            this.f4026h.j(c2991bm);
            return;
        }
        ColorFilter colorFilter2 = z.f3724I;
        AbstractC4498a abstractC4498a = this.f4021c;
        if (colorFilter == colorFilter2) {
            a1.s sVar = this.i;
            if (sVar != null) {
                abstractC4498a.o(sVar);
            }
            a1.s sVar2 = new a1.s(c2991bm, null);
            this.i = sVar2;
            sVar2.a(this);
            abstractC4498a.d(this.i);
            return;
        }
        if (colorFilter == z.f3733e) {
            AbstractC0428e abstractC0428e = this.f4028k;
            if (abstractC0428e != null) {
                abstractC0428e.j(c2991bm);
                return;
            }
            a1.s sVar3 = new a1.s(c2991bm, null);
            this.f4028k = sVar3;
            sVar3.a(this);
            abstractC4498a.d(this.f4028k);
        }
    }
}
