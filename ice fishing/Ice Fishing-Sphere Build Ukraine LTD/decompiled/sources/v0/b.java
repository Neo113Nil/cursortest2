package v0;

import D0.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3010e;

    public /* synthetic */ b(int i2) {
        this.f3010e = i2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        c cVar;
        switch (this.f3010e) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                E0.i.e(str, "acc");
                E0.i.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                E0.i.e(iVar, "acc");
                E0.i.e(gVar2, "element");
                i g2 = iVar.g(gVar2.getKey());
                j jVar = j.f3014e;
                if (g2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f3013e;
                f fVar = (f) g2.i(eVar);
                if (fVar == null) {
                    cVar = new c(g2, gVar2);
                } else {
                    i g3 = g2.g(eVar);
                    if (g3 == jVar) {
                        return new c(gVar2, fVar);
                    }
                    cVar = new c(new c(g3, gVar2), fVar);
                }
                return cVar;
        }
    }
}
