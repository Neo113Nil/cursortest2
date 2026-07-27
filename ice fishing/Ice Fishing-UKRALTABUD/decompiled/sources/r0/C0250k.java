package r0;

import java.util.List;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250k extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2890j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2891k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250k(List list, v0.d dVar) {
        super(2, dVar);
        this.f2891k = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0250k c0250k = (C0250k) l((G.b) obj, (v0.d) obj2);
        t0.g gVar = t0.g.f2989a;
        c0250k.n(gVar);
        return gVar;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0250k c0250k = new C0250k(this.f2891k, dVar);
        c0250k.f2890j = obj;
        return c0250k;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        G.b bVar = (G.b) this.f2890j;
        List<String> list = this.f2891k;
        if (list != null) {
            for (String str : list) {
                E0.i.e(str, "name");
                G.d dVar = new G.d(str);
                bVar.b();
                bVar.f328a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f328a.clear();
        }
        return t0.g.f2989a;
    }
}
