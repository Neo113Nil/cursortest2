package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0428e;
import a1.InterfaceC0424a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements m, InterfaceC0424a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f4012b;

    /* renamed from: c, reason: collision with root package name */
    public final v f4013c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.j f4014d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0428e f4015e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.a f4016f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4018h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4011a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final G1.e f4017g = new G1.e(2);

    public f(v vVar, AbstractC4498a abstractC4498a, e1.a aVar) {
        this.f4012b = aVar.f37104a;
        this.f4013c = vVar;
        AbstractC0428e a9 = aVar.f37106c.a();
        this.f4014d = (a1.j) a9;
        AbstractC0428e a10 = aVar.f37105b.a();
        this.f4015e = a10;
        this.f4016f = aVar;
        abstractC4498a.d(a9);
        abstractC4498a.d(a10);
        a9.a(this);
        a10.a(this);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4018h = false;
        this.f4013c.invalidateSelf();
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
                    this.f4017g.f1056a.add(tVar);
                    tVar.d(this);
                }
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
        boolean z3 = this.f4018h;
        Path path = this.f4011a;
        if (z3) {
            return path;
        }
        path.reset();
        e1.a aVar = this.f4016f;
        if (aVar.f37108e) {
            this.f4018h = true;
            return path;
        }
        PointF pointF = (PointF) this.f4014d.e();
        float f3 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f3 * 0.55228f;
        float f11 = f9 * 0.55228f;
        path.reset();
        if (aVar.f37107d) {
            float f12 = -f9;
            path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f3;
            float f15 = 0.0f - f11;
            path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            path.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            path.cubicTo(f17, f9, f3, f16, f3, 0.0f);
            path.cubicTo(f3, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            path.cubicTo(f19, f18, f3, f20, f3, 0.0f);
            float f21 = f11 + 0.0f;
            path.cubicTo(f3, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f3;
            path.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f4015e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f4017g.a(path);
        this.f4018h = true;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4012b;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        if (colorFilter == z.f3734f) {
            this.f4014d.j(c2991bm);
        } else if (colorFilter == z.i) {
            this.f4015e.j(c2991bm);
        }
    }
}
