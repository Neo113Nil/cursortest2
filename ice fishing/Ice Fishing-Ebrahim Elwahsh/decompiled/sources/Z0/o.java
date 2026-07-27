package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d1.C4455a;
import f1.AbstractC4490a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements InterfaceC0417a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f4161c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4162d;

    /* renamed from: e, reason: collision with root package name */
    public final v f4163e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0421e f4164f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0421e f4165g;

    /* renamed from: h, reason: collision with root package name */
    public final a1.i f4166h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4168k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4159a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4160b = new RectF();
    public final I1.f i = new I1.f(1);

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0421e f4167j = null;

    public o(v vVar, AbstractC4490a abstractC4490a, e1.i iVar) {
        this.f4161c = iVar.f37279b;
        this.f4162d = iVar.f37281d;
        this.f4163e = vVar;
        AbstractC0421e a9 = iVar.f37282e.a();
        this.f4164f = a9;
        AbstractC0421e a10 = ((C4455a) iVar.f37283f).a();
        this.f4165g = a10;
        a1.i a11 = iVar.f37280c.a();
        this.f4166h = a11;
        abstractC4490a.e(a9);
        abstractC4490a.e(a10);
        abstractC4490a.e(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4168k = false;
        this.f4163e.invalidateSelf();
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
                if (tVar.f4195c == 1) {
                    this.i.f1255a.add(tVar);
                    tVar.c(this);
                    i++;
                }
            }
            if (cVar instanceof q) {
                this.f4167j = ((q) cVar).f4179b;
            }
            i++;
        }
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        if (colorFilter == z.f3791g) {
            this.f4165g.j(sVar);
        } else if (colorFilter == z.i) {
            this.f4164f.j(sVar);
        } else if (colorFilter == z.f3792h) {
            this.f4166h.j(sVar);
        }
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.m
    public final Path g() {
        float f6;
        AbstractC0421e abstractC0421e;
        boolean z8 = this.f4168k;
        Path path = this.f4159a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f4162d) {
            this.f4168k = true;
            return path;
        }
        PointF pointF = (PointF) this.f4165g.e();
        float f9 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        a1.i iVar = this.f4166h;
        float l9 = iVar == null ? 0.0f : iVar.l();
        if (l9 == 0.0f && (abstractC0421e = this.f4167j) != null) {
            l9 = Math.min(((Float) abstractC0421e.e()).floatValue(), Math.min(f9, f10));
        }
        float min = Math.min(f9, f10);
        if (l9 > min) {
            l9 = min;
        }
        PointF pointF2 = (PointF) this.f4164f.e();
        path.moveTo(pointF2.x + f9, (pointF2.y - f10) + l9);
        path.lineTo(pointF2.x + f9, (pointF2.y + f10) - l9);
        RectF rectF = this.f4160b;
        if (l9 > 0.0f) {
            float f11 = pointF2.x + f9;
            float f12 = l9 * 2.0f;
            f6 = 2.0f;
            float f13 = pointF2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f6 = 2.0f;
        }
        path.lineTo((pointF2.x - f9) + l9, pointF2.y + f10);
        if (l9 > 0.0f) {
            float f14 = pointF2.x - f9;
            float f15 = pointF2.y + f10;
            float f16 = l9 * f6;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f9, (pointF2.y - f10) + l9);
        if (l9 > 0.0f) {
            float f17 = pointF2.x - f9;
            float f18 = pointF2.y - f10;
            float f19 = l9 * f6;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f9) - l9, pointF2.y - f10);
        if (l9 > 0.0f) {
            float f20 = pointF2.x + f9;
            float f21 = l9 * f6;
            float f22 = pointF2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.f4168k = true;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4161c;
    }
}
