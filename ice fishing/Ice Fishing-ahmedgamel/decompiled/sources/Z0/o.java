package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.internal.ads.C2991bm;
import d1.C4443a;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements InterfaceC0424a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f4084c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4085d;

    /* renamed from: e, reason: collision with root package name */
    public final v f4086e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0428e f4087f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0428e f4088g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.i f4089h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4091k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4082a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4083b = new RectF();
    public final G1.e i = new G1.e(2);

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0428e f4090j = null;

    public o(v vVar, AbstractC4498a abstractC4498a, e1.i iVar) {
        this.f4084c = iVar.f37148b;
        this.f4085d = iVar.f37150d;
        this.f4086e = vVar;
        AbstractC0428e a9 = iVar.f37151e.a();
        this.f4087f = a9;
        AbstractC0428e a10 = ((C4443a) iVar.f37152f).a();
        this.f4088g = a10;
        a1.i a11 = iVar.f37149c.a();
        this.f4089h = a11;
        abstractC4498a.d(a9);
        abstractC4498a.d(a10);
        abstractC4498a.d(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4091k = false;
        this.f4086e.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f4118c == 1) {
                    this.i.f1056a.add(tVar);
                    tVar.d(this);
                    i++;
                }
            }
            if (cVar instanceof q) {
                this.f4090j = ((q) cVar).f4102b;
            }
            i++;
        }
    }

    @Override // c1.f
    public final void e(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        AbstractC4603g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.m
    public final Path f() {
        float f3;
        AbstractC0428e abstractC0428e;
        boolean z3 = this.f4091k;
        Path path = this.f4082a;
        if (z3) {
            return path;
        }
        path.reset();
        if (this.f4085d) {
            this.f4091k = true;
            return path;
        }
        PointF pointF = (PointF) this.f4088g.e();
        float f9 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        a1.i iVar = this.f4089h;
        float l9 = iVar == null ? 0.0f : iVar.l();
        if (l9 == 0.0f && (abstractC0428e = this.f4090j) != null) {
            l9 = Math.min(((Float) abstractC0428e.e()).floatValue(), Math.min(f9, f10));
        }
        float min = Math.min(f9, f10);
        if (l9 > min) {
            l9 = min;
        }
        PointF pointF2 = (PointF) this.f4087f.e();
        path.moveTo(pointF2.x + f9, (pointF2.y - f10) + l9);
        path.lineTo(pointF2.x + f9, (pointF2.y + f10) - l9);
        RectF rectF = this.f4083b;
        if (l9 > 0.0f) {
            float f11 = pointF2.x + f9;
            float f12 = l9 * 2.0f;
            f3 = 2.0f;
            float f13 = pointF2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f3 = 2.0f;
        }
        path.lineTo((pointF2.x - f9) + l9, pointF2.y + f10);
        if (l9 > 0.0f) {
            float f14 = pointF2.x - f9;
            float f15 = pointF2.y + f10;
            float f16 = l9 * f3;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f9, (pointF2.y - f10) + l9);
        if (l9 > 0.0f) {
            float f17 = pointF2.x - f9;
            float f18 = pointF2.y - f10;
            float f19 = l9 * f3;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f9) - l9, pointF2.y - f10);
        if (l9 > 0.0f) {
            float f20 = pointF2.x + f9;
            float f21 = l9 * f3;
            float f22 = pointF2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.f4091k = true;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4084c;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        if (colorFilter == z.f3735g) {
            this.f4088g.j(c2991bm);
        } else if (colorFilter == z.i) {
            this.f4087f.j(c2991bm);
        } else if (colorFilter == z.f3736h) {
            this.f4089h.j(c2991bm);
        }
    }
}
