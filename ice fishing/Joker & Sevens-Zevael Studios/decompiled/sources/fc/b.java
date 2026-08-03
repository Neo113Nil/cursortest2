package fc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends pc.k implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public static final b f2342h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f2343i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2344g;

    static {
        int i10 = 2;
        f2342h = new b(i10, 0);
        f2343i = new b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f2344g = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f2344g) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                pc.j.e(str, "acc");
                pc.j.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                pc.j.e(iVar, "acc");
                pc.j.e(gVar2, "element");
                i g8 = iVar.g(gVar2.getKey());
                j jVar = j.f2348g;
                if (g8 == jVar) {
                    return gVar2;
                }
                e eVar = e.f2347g;
                f fVar = (f) g8.v(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, g8);
                } else {
                    i g10 = g8.g(eVar);
                    if (g10 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, g10));
                }
                return cVar;
        }
    }
}
