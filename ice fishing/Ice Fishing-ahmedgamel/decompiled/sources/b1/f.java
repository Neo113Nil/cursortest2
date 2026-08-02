package b1;

import Z0.v;
import Z0.z;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import c1.AbstractC0545e;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;

/* loaded from: classes.dex */
public final class f implements m, InterfaceC0541a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f5401b;

    /* renamed from: c, reason: collision with root package name */
    public final v f5402c;

    /* renamed from: d, reason: collision with root package name */
    public final c1.j f5403d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0545e f5404e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.a f5405f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5407h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f5400a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final K1.b f5406g = new K1.b(2);

    public f(v vVar, AbstractC4563a abstractC4563a, g1.a aVar) {
        this.f5401b = aVar.f37580a;
        this.f5402c = vVar;
        AbstractC0545e a9 = aVar.f37582c.a();
        this.f5403d = (c1.j) a9;
        AbstractC0545e a10 = aVar.f37581b.a();
        this.f5404e = a10;
        this.f5405f = aVar;
        abstractC4563a.f(a9);
        abstractC4563a.f(a10);
        a9.a(this);
        a10.a(this);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5407h = false;
        this.f5402c.invalidateSelf();
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
                    this.f5406g.f1670a.add(tVar);
                    tVar.c(this);
                }
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
        if (colorFilter == z.f4085f) {
            this.f5403d.j(lp);
        } else if (colorFilter == z.i) {
            this.f5404e.j(lp);
        }
    }

    @Override // b1.m
    public final Path g() {
        boolean z6 = this.f5407h;
        Path path = this.f5400a;
        if (z6) {
            return path;
        }
        path.reset();
        g1.a aVar = this.f5405f;
        if (aVar.f37584e) {
            this.f5407h = true;
            return path;
        }
        PointF pointF = (PointF) this.f5403d.e();
        float f2 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f2 * 0.55228f;
        float f11 = f9 * 0.55228f;
        path.reset();
        if (aVar.f37583d) {
            float f12 = -f9;
            path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f2;
            float f15 = 0.0f - f11;
            path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            path.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            path.cubicTo(f17, f9, f2, f16, f2, 0.0f);
            path.cubicTo(f2, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            path.cubicTo(f19, f18, f2, f20, f2, 0.0f);
            float f21 = f11 + 0.0f;
            path.cubicTo(f2, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f2;
            path.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f5404e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f5406g.a(path);
        this.f5407h = true;
        return path;
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5401b;
    }
}
