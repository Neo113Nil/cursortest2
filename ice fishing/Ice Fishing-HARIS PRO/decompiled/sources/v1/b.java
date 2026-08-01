package v1;

import C1.p;

/* loaded from: classes.dex */
public final class b extends D1.j implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4491c = new b(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final b f4492d = new b(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.f4493b = i2;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f4493b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                D1.i.e(str, "acc");
                D1.i.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                D1.i.e(iVar, "acc");
                D1.i.e(gVar2, "element");
                i c2 = iVar.c(gVar2.getKey());
                j jVar = j.f4497a;
                if (c2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f4496a;
                f fVar = (f) c2.e(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, c2);
                } else {
                    i c3 = c2.c(eVar);
                    if (c3 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, c3));
                }
                return cVar;
        }
    }
}
