package b1;

import Z0.v;
import Z0.z;
import android.graphics.ColorFilter;
import android.graphics.Path;
import c1.InterfaceC0541a;
import com.google.android.gms.internal.ads.LP;
import h1.AbstractC4563a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4672g;

/* loaded from: classes.dex */
public final class r implements m, InterfaceC0541a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f5494b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5495c;

    /* renamed from: d, reason: collision with root package name */
    public final v f5496d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.n f5497e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5498f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f5493a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final K1.b f5499g = new K1.b(2);

    public r(v vVar, AbstractC4563a abstractC4563a, g1.n nVar) {
        this.f5494b = nVar.f37642a;
        this.f5495c = nVar.f37645d;
        this.f5496d = vVar;
        c1.n nVar2 = new c1.n((List) nVar.f37644c.f67u);
        this.f5497e = nVar2;
        abstractC4563a.f(nVar2);
        nVar2.a(this);
    }

    @Override // c1.InterfaceC0541a
    public final void a() {
        this.f5498f = false;
        this.f5496d.invalidateSelf();
    }

    @Override // b1.InterfaceC0519c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.f5497e.f5675m = arrayList;
                return;
            }
            InterfaceC0519c interfaceC0519c = (InterfaceC0519c) arrayList2.get(i);
            if (interfaceC0519c instanceof t) {
                t tVar = (t) interfaceC0519c;
                if (tVar.f5507c == 1) {
                    this.f5499g.f1670a.add(tVar);
                    tVar.c(this);
                    i++;
                }
            }
            if (interfaceC0519c instanceof q) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                q qVar = (q) interfaceC0519c;
                qVar.f5491b.a(this);
                arrayList.add(qVar);
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
        if (colorFilter == z.f4079N) {
            this.f5497e.j(lp);
        }
    }

    @Override // b1.m
    public final Path g() {
        boolean z6 = this.f5498f;
        Path path = this.f5493a;
        c1.n nVar = this.f5497e;
        if (z6 && nVar.f5652e == null) {
            return path;
        }
        path.reset();
        if (this.f5495c) {
            this.f5498f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f5499g.a(path);
        this.f5498f = true;
        return path;
    }

    @Override // b1.InterfaceC0519c
    public final String getName() {
        return this.f5494b;
    }
}
