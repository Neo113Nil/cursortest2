package r0;

import java.util.List;
import t0.C0252g;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237i extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2889i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f2890j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237i(List list, v0.d dVar) {
        super(2, dVar);
        this.f2890j = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0237i c0237i = (C0237i) l((G.b) obj, (v0.d) obj2);
        C0252g c0252g = C0252g.f2994a;
        c0237i.n(c0252g);
        return c0252g;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0237i c0237i = new C0237i(this.f2890j, dVar);
        c0237i.f2889i = obj;
        return c0237i;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.z(obj);
        G.b bVar = (G.b) this.f2889i;
        List<String> list = this.f2890j;
        if (list != null) {
            for (String str : list) {
                E0.i.e(str, "name");
                G.d dVar = new G.d(str);
                bVar.b();
                bVar.f329a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f329a.clear();
        }
        return C0252g.f2994a;
    }
}
