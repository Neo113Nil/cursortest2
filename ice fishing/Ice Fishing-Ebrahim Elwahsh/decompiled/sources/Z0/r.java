package Z0;

import X0.v;
import X0.z;
import a1.InterfaceC0417a;
import android.graphics.ColorFilter;
import android.graphics.Path;
import f1.AbstractC4490a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements m, InterfaceC0417a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f4182b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4183c;

    /* renamed from: d, reason: collision with root package name */
    public final v f4184d;

    /* renamed from: e, reason: collision with root package name */
    public final a1.n f4185e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4186f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4181a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final I1.f f4187g = new I1.f(1);

    public r(v vVar, AbstractC4490a abstractC4490a, e1.n nVar) {
        this.f4182b = nVar.f37297a;
        this.f4183c = nVar.f37300d;
        this.f4184d = vVar;
        a1.n nVar2 = new a1.n((List) nVar.f37299c.f37200u);
        this.f4185e = nVar2;
        abstractC4490a.e(nVar2);
        nVar2.a(this);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4186f = false;
        this.f4184d.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.f4185e.f4329m = arrayList;
                return;
            }
            c cVar = (c) arrayList2.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f4195c == 1) {
                    this.f4187g.f1255a.add(tVar);
                    tVar.c(this);
                    i++;
                }
            }
            if (cVar instanceof q) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                q qVar = (q) cVar;
                qVar.f4179b.a(this);
                arrayList.add(qVar);
            }
            i++;
        }
    }

    @Override // c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        if (colorFilter == z.f3784N) {
            this.f4185e.j(sVar);
        }
    }

    @Override // c1.f
    public final void f(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2) {
        j1.h.g(eVar, i, arrayList, eVar2, this);
    }

    @Override // Z0.m
    public final Path g() {
        boolean z8 = this.f4186f;
        Path path = this.f4181a;
        a1.n nVar = this.f4185e;
        if (z8 && nVar.f4306e == null) {
            return path;
        }
        path.reset();
        if (this.f4183c) {
            this.f4186f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f4187g.a(path);
        this.f4186f = true;
        return path;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4182b;
    }
}
