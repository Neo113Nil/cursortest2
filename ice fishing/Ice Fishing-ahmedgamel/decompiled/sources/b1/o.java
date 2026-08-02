package b1;

import Z0.v;
import Z0.z;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import f1.C4515a;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;

/* loaded from: classes.dex */
public final class o implements InterfaceC0541a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public final String f5473c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5474d;

    /* renamed from: e, reason: collision with root package name */
    public final v f5475e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0545e f5476f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0545e f5477g;

    /* renamed from: h, reason: collision with root package name */
    public final c1.i f5478h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5480k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f5471a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f5472b = new RectF();
    public final K1.b i = new K1.b(2);

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0545e f5479j = null;

    public o(v vVar, AbstractC4563a abstractC4563a, g1.i iVar) {
        this.f5473c = iVar.f37624b;
        this.f5474d = iVar.f37626d;
        this.f5475e = vVar;
        AbstractC0545e a9 = iVar.f37627e.a();
        this.f5476f = a9;
        AbstractC0545e a10 = ((C4515a) iVar.f37628f).a();
        this.f5477g = a10;
        c1.i a11 = iVar.f37625c.a();
        this.f5478h = a11;
        abstractC4563a.f(a9);
        abstractC4563a.f(a10);
        abstractC4563a.f(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5480k = false;
        this.f5475e.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList.get(i);
            if (interfaceC0519c instanceof t) {
                t tVar = (t) interfaceC0519c;
                if (tVar.f5507c == 1) {
                    this.i.f1670a.add(tVar);
                    tVar.c(this);
                    i++;
                }
            }
            if (interfaceC0519c instanceof q) {
                this.f5479j = ((q) interfaceC0519c).f5491b;
            }
            i++;
        }
    }

    @Override // e1.f
    public final void c(e1.e eVar, int i, ArrayList arrayList, e1.e eVar2) {
        AbstractC4672g.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        if (colorFilter == z.f4086g) {
            this.f5477g.j(lp);
        } else if (colorFilter == z.i) {
            this.f5476f.j(lp);
        } else if (colorFilter == z.f4087h) {
            this.f5478h.j(lp);
        }
    }

    @Override // b1.m
    public final Path g() {
        float f2;
        AbstractC0545e abstractC0545e;
        boolean z6 = this.f5480k;
        Path path = this.f5471a;
        if (z6) {
            return path;
        }
        path.reset();
        if (this.f5474d) {
            this.f5480k = true;
            return path;
        }
        PointF pointF = (PointF) this.f5477g.e();
        float f9 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        c1.i iVar = this.f5478h;
        float l9 = iVar == null ? 0.0f : iVar.l();
        if (l9 == 0.0f && (abstractC0545e = this.f5479j) != null) {
            l9 = Math.min(((Float) abstractC0545e.e()).floatValue(), Math.min(f9, f10));
        }
        float min = Math.min(f9, f10);
        if (l9 > min) {
            l9 = min;
        }
        PointF pointF2 = (PointF) this.f5476f.e();
        path.moveTo(pointF2.x + f9, (pointF2.y - f10) + l9);
        path.lineTo(pointF2.x + f9, (pointF2.y + f10) - l9);
        RectF rectF = this.f5472b;
        if (l9 > 0.0f) {
            float f11 = pointF2.x + f9;
            float f12 = l9 * 2.0f;
            f2 = 2.0f;
            float f13 = pointF2.y + f10;
            rectF.set(f11 - f12, f13 - f12, f11, f13);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f2 = 2.0f;
        }
        path.lineTo((pointF2.x - f9) + l9, pointF2.y + f10);
        if (l9 > 0.0f) {
            float f14 = pointF2.x - f9;
            float f15 = pointF2.y + f10;
            float f16 = l9 * f2;
            rectF.set(f14, f15 - f16, f16 + f14, f15);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f9, (pointF2.y - f10) + l9);
        if (l9 > 0.0f) {
            float f17 = pointF2.x - f9;
            float f18 = pointF2.y - f10;
            float f19 = l9 * f2;
            rectF.set(f17, f18, f17 + f19, f19 + f18);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f9) - l9, pointF2.y - f10);
        if (l9 > 0.0f) {
            float f20 = pointF2.x + f9;
            float f21 = l9 * f2;
            float f22 = pointF2.y - f10;
            rectF.set(f20 - f21, f22, f20, f21 + f22);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.f5480k = true;
        return path;
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5473c;
    }
}
