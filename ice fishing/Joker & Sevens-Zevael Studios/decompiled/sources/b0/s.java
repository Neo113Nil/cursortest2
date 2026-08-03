package b0;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final v0.c f885a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.k f886b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f887c = new LinkedHashMap();

    public s(v0.c cVar, a0.k kVar) {
        this.f885a = cVar;
        this.f886b = kVar;
    }

    public final oc.e a(int i10, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f887c;
        r rVar = (r) linkedHashMap.get(obj);
        if (rVar != null && rVar.f878c == i10 && pc.j.a(rVar.f877b, obj2)) {
            u0.d dVar = rVar.f879d;
            if (dVar != null) {
                return dVar;
            }
            u0.d dVar2 = new u0.d(1403994769, new a1.f(1, rVar.f880e, rVar), true);
            rVar.f879d = dVar2;
            return dVar2;
        }
        r rVar2 = new r(this, i10, obj, obj2);
        linkedHashMap.put(obj, rVar2);
        u0.d dVar3 = rVar2.f879d;
        if (dVar3 != null) {
            return dVar3;
        }
        u0.d dVar4 = new u0.d(1403994769, new a1.f(1, this, rVar2), true);
        rVar2.f879d = dVar4;
        return dVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        r rVar = (r) this.f887c.get(obj);
        if (rVar != null) {
            return rVar.f877b;
        }
        a0.i iVar = (a0.i) this.f886b.invoke();
        int b2 = iVar.f55d.b(obj);
        if (b2 != -1) {
            return iVar.b(b2);
        }
        return null;
    }
}
