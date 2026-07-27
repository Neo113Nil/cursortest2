package Z0;

import X0.v;
import X0.z;
import a1.InterfaceC0424a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import com.google.android.gms.internal.ads.C2991bm;
import f1.AbstractC4498a;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements m, InterfaceC0424a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f4105b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4106c;

    /* renamed from: d, reason: collision with root package name */
    public final v f4107d;

    /* renamed from: e, reason: collision with root package name */
    public final a1.n f4108e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4109f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4104a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final G1.e f4110g = new G1.e(2);

    public r(v vVar, AbstractC4498a abstractC4498a, e1.n nVar) {
        this.f4105b = nVar.f37166a;
        this.f4106c = nVar.f37169d;
        this.f4107d = vVar;
        a1.n nVar2 = new a1.n((List) nVar.f37168c.f1720u);
        this.f4108e = nVar2;
        abstractC4498a.d(nVar2);
        nVar2.a(this);
    }

    @Override // a1.InterfaceC0424a
    public final void a() {
        this.f4109f = false;
        this.f4107d.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.f4108e.f4280m = arrayList;
                return;
            }
            c cVar = (c) arrayList2.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f4118c == 1) {
                    this.f4110g.f1056a.add(tVar);
                    tVar.d(this);
                    i++;
                }
            }
            if (cVar instanceof q) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                q qVar = (q) cVar;
                qVar.f4102b.a(this);
                arrayList.add(qVar);
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
        boolean z3 = this.f4109f;
        Path path = this.f4104a;
        a1.n nVar = this.f4108e;
        if (z3 && nVar.f4257e == null) {
            return path;
        }
        path.reset();
        if (this.f4106c) {
            this.f4109f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f4110g.a(path);
        this.f4109f = true;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4105b;
    }

    @Override // c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        if (colorFilter == z.f3728N) {
            this.f4108e.j(c2991bm);
        }
    }
}
