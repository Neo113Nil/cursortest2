package r0;

import D.InterfaceC0008i;
import L.C0026b;
import L.Q;
import L0.AbstractC0064w;
import android.content.Context;
import android.util.Log;
import j0.InterfaceC0188a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.C0200c;
import t0.C0252g;

/* loaded from: classes.dex */
public final class J implements InterfaceC0188a, InterfaceC0235g {

    /* renamed from: e, reason: collision with root package name */
    public Context f2863e;

    /* renamed from: f, reason: collision with root package name */
    public C0026b f2864f;

    /* renamed from: g, reason: collision with root package name */
    public final E.a f2865g = new E.a(25);

    public static final Object r(J j2, String str, String str2, x0.f fVar) {
        j2.getClass();
        G.d dVar = new G.d(str);
        Context context = j2.f2863e;
        if (context != null) {
            Object o2 = K.a(context).o(new G.h(new C0239k(dVar, str2, null), null), fVar);
            return o2 == w0.a.f3076e ? o2 : C0252g.f2994a;
        }
        E0.i.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c6 -> B:11:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(J j2, List list, x0.b bVar) {
        v vVar;
        int i2;
        Set G2;
        J j3;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        J j4;
        Map map2;
        Object c2;
        j2.getClass();
        if (bVar instanceof v) {
            vVar = (v) bVar;
            int i3 = vVar.f2940o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.f2940o = i3 - Integer.MIN_VALUE;
                Object obj = vVar.f2938m;
                w0.a aVar = w0.a.f3076e;
                i2 = vVar.f2940o;
                if (i2 != 0) {
                    o.g.z(obj);
                    G2 = list != null ? u0.d.G(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    vVar.f2933h = j2;
                    vVar.f2934i = G2;
                    vVar.f2935j = linkedHashMap;
                    vVar.f2940o = 1;
                    Context context = j2.f2863e;
                    if (context == null) {
                        E0.i.g("context");
                        throw null;
                    }
                    Object c3 = O0.r.c(new C0200c(21, ((InterfaceC0008i) K.a(context).f30f).l()), vVar);
                    if (c3 == aVar) {
                        return aVar;
                    }
                    j3 = j2;
                    map = linkedHashMap;
                    obj = c3;
                } else if (i2 == 1) {
                    map = vVar.f2935j;
                    G2 = vVar.f2934i;
                    j3 = vVar.f2933h;
                    o.g.z(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G.d dVar = vVar.f2937l;
                    it = vVar.f2936k;
                    map2 = vVar.f2935j;
                    set2 = vVar.f2934i;
                    j4 = vVar.f2933h;
                    o.g.z(obj);
                    if (K.b(dVar.f334a, obj, set2) && (c2 = K.c(obj, j4.f2865g)) != null) {
                        map2.put(dVar.f334a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (G.d) it.next();
                        vVar.f2933h = j4;
                        vVar.f2934i = set2;
                        vVar.f2935j = map2;
                        vVar.f2936k = it;
                        vVar.f2937l = dVar;
                        vVar.f2940o = 2;
                        Context context2 = j4.f2863e;
                        if (context2 == null) {
                            E0.i.g("context");
                            throw null;
                        }
                        obj = O0.r.c(new o(((InterfaceC0008i) K.a(context2).f30f).l(), dVar, 3), vVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (K.b(dVar.f334a, obj, set2)) {
                            map2.put(dVar.f334a, c2);
                        }
                        if (it.hasNext()) {
                            return map2;
                        }
                    }
                }
                set = (Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = G2;
                it = set.iterator();
                j4 = j3;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        vVar = new v(j2, bVar);
        Object obj2 = vVar.f2938m;
        w0.a aVar2 = w0.a.f3076e;
        i2 = vVar.f2940o;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // r0.InterfaceC0235g
    public final Double a(String str, C0236h c0236h) {
        E0.p pVar = new E0.p();
        AbstractC0064w.j(new r(str, this, pVar, null));
        return (Double) pVar.f313e;
    }

    @Override // r0.InterfaceC0235g
    public final void b(String str, boolean z2, C0236h c0236h) {
        AbstractC0064w.j(new B(str, this, z2, null));
    }

    @Override // j0.InterfaceC0188a
    public final void c(Q q2) {
        E0.i.e(q2, "binding");
        m0.f fVar = (m0.f) q2.f520g;
        E0.i.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0235g.f2886d.getClass();
        C0234f.b(fVar, null, "data_store");
        C0026b c0026b = this.f2864f;
        if (c0026b != null) {
            C0234f.b((m0.f) c0026b.f525g, null, "shared_preferences");
        }
        this.f2864f = null;
    }

    @Override // r0.InterfaceC0235g
    public final N d(String str, C0236h c0236h) {
        String m2 = m(str, c0236h);
        if (m2 == null) {
            return null;
        }
        if (m2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new N(m2, L.JSON_ENCODED);
        }
        return m2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.PLATFORM_ENCODED) : new N(null, L.UNEXPECTED_STRING);
    }

    @Override // r0.InterfaceC0235g
    public final void e(String str, String str2, C0236h c0236h) {
        AbstractC0064w.j(new I(this, str, str2, null));
    }

    @Override // r0.InterfaceC0235g
    public final Long f(String str, C0236h c0236h) {
        E0.p pVar = new E0.p();
        AbstractC0064w.j(new t(str, this, pVar, null));
        return (Long) pVar.f313e;
    }

    @Override // r0.InterfaceC0235g
    public final List g(List list, C0236h c0236h) {
        return u0.d.F(((Map) AbstractC0064w.j(new u(this, list, null))).keySet());
    }

    @Override // j0.InterfaceC0188a
    public final void h(Q q2) {
        E0.i.e(q2, "binding");
        m0.f fVar = (m0.f) q2.f520g;
        E0.i.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) q2.f519f;
        E0.i.d(context, "getApplicationContext(...)");
        this.f2863e = context;
        try {
            InterfaceC0235g.f2886d.getClass();
            C0234f.b(fVar, this, "data_store");
            this.f2864f = new C0026b(fVar, context, this.f2865g);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0229a().h(q2);
    }

    @Override // r0.InterfaceC0235g
    public final void i(String str, long j2, C0236h c0236h) {
        AbstractC0064w.j(new H(str, this, j2, null));
    }

    @Override // r0.InterfaceC0235g
    public final void j(String str, String str2, C0236h c0236h) {
        AbstractC0064w.j(new F(this, str, str2, null));
    }

    @Override // r0.InterfaceC0235g
    public final void k(String str, List list, C0236h c0236h) {
        AbstractC0064w.j(new C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f2865g.d(list)), null));
    }

    @Override // r0.InterfaceC0235g
    public final void l(String str, double d2, C0236h c0236h) {
        AbstractC0064w.j(new E(str, this, d2, null));
    }

    @Override // r0.InterfaceC0235g
    public final String m(String str, C0236h c0236h) {
        E0.p pVar = new E0.p();
        AbstractC0064w.j(new x(str, this, pVar, null));
        return (String) pVar.f313e;
    }

    @Override // r0.InterfaceC0235g
    public final Boolean n(String str, C0236h c0236h) {
        E0.p pVar = new E0.p();
        AbstractC0064w.j(new p(str, this, pVar, null));
        return (Boolean) pVar.f313e;
    }

    @Override // r0.InterfaceC0235g
    public final void o(List list, C0236h c0236h) {
        AbstractC0064w.j(new C0238j(this, list, null));
    }

    @Override // r0.InterfaceC0235g
    public final Map p(List list, C0236h c0236h) {
        return (Map) AbstractC0064w.j(new C0240l(this, list, null));
    }

    @Override // r0.InterfaceC0235g
    public final ArrayList q(String str, C0236h c0236h) {
        List list;
        String m2 = m(str, c0236h);
        ArrayList arrayList = null;
        if (m2 != null && !m2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && m2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) K.c(m2, this.f2865g)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
