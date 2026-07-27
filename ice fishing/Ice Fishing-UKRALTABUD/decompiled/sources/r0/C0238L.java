package r0;

import D.InterfaceC0008i;
import K0.AbstractC0046w;
import L.C0051b;
import L.Q;
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
import m0.InterfaceC0208f;

/* renamed from: r0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238L implements InterfaceC0188a, InterfaceC0248i {

    /* renamed from: f, reason: collision with root package name */
    public Context f2861f;

    /* renamed from: g, reason: collision with root package name */
    public C0051b f2862g;

    /* renamed from: h, reason: collision with root package name */
    public final E.a f2863h = new E.a(25);

    public static final Object r(C0238L c0238l, String str, String str2, x0.f fVar) {
        c0238l.getClass();
        G.d dVar = new G.d(str);
        Context context = c0238l.f2861f;
        if (context != null) {
            Object o2 = AbstractC0239M.a(context).o(new G.h(new C0252m(dVar, str2, null), null), fVar);
            return o2 == w0.a.f3071f ? o2 : t0.g.f2989a;
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
    public static final Object s(C0238L c0238l, List list, x0.b bVar) {
        x xVar;
        int i2;
        Set I2;
        C0238L c0238l2;
        Map map;
        Set set;
        Set set2;
        Iterator it;
        C0238L c0238l3;
        Map map2;
        Object c2;
        c0238l.getClass();
        if (bVar instanceof x) {
            xVar = (x) bVar;
            int i3 = xVar.f2941p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xVar.f2941p = i3 - Integer.MIN_VALUE;
                Object obj = xVar.f2939n;
                w0.a aVar = w0.a.f3071f;
                i2 = xVar.f2941p;
                if (i2 != 0) {
                    o.g.C(obj);
                    I2 = list != null ? u0.d.I(list) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xVar.f2934i = c0238l;
                    xVar.f2935j = I2;
                    xVar.f2936k = linkedHashMap;
                    xVar.f2941p = 1;
                    Context context = c0238l.f2861f;
                    if (context == null) {
                        E0.i.g("context");
                        throw null;
                    }
                    Object c3 = N0.r.c(new C0200c(21, ((InterfaceC0008i) AbstractC0239M.a(context).f30g).k()), xVar);
                    if (c3 == aVar) {
                        return aVar;
                    }
                    c0238l2 = c0238l;
                    map = linkedHashMap;
                    obj = c3;
                } else if (i2 == 1) {
                    map = xVar.f2936k;
                    I2 = xVar.f2935j;
                    c0238l2 = xVar.f2934i;
                    o.g.C(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G.d dVar = xVar.f2938m;
                    it = xVar.f2937l;
                    map2 = xVar.f2936k;
                    set2 = xVar.f2935j;
                    c0238l3 = xVar.f2934i;
                    o.g.C(obj);
                    if (AbstractC0239M.b(dVar.f333a, obj, set2) && (c2 = AbstractC0239M.c(obj, c0238l3.f2863h)) != null) {
                        map2.put(dVar.f333a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (G.d) it.next();
                        xVar.f2934i = c0238l3;
                        xVar.f2935j = set2;
                        xVar.f2936k = map2;
                        xVar.f2937l = it;
                        xVar.f2938m = dVar;
                        xVar.f2941p = 2;
                        Context context2 = c0238l3.f2861f;
                        if (context2 == null) {
                            E0.i.g("context");
                            throw null;
                        }
                        obj = N0.r.c(new q(((InterfaceC0008i) AbstractC0239M.a(context2).f30g).k(), dVar, 3), xVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (AbstractC0239M.b(dVar.f333a, obj, set2)) {
                            map2.put(dVar.f333a, c2);
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
                set2 = I2;
                it = set.iterator();
                c0238l3 = c0238l2;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        xVar = new x(c0238l, bVar);
        Object obj2 = xVar.f2939n;
        w0.a aVar2 = w0.a.f3071f;
        i2 = xVar.f2941p;
        if (i2 != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // r0.InterfaceC0248i
    public final Double a(String str, C0249j c0249j) {
        E0.p pVar = new E0.p();
        AbstractC0046w.j(new t(str, this, pVar, null));
        return (Double) pVar.f312f;
    }

    @Override // r0.InterfaceC0248i
    public final void b(String str, boolean z2, C0249j c0249j) {
        AbstractC0046w.j(new C0230D(str, this, z2, null));
    }

    @Override // j0.InterfaceC0188a
    public final void c(Q q2) {
        E0.i.e(q2, "binding");
        InterfaceC0208f interfaceC0208f = (InterfaceC0208f) q2.f598h;
        E0.i.d(interfaceC0208f, "getBinaryMessenger(...)");
        InterfaceC0248i.f2887e.getClass();
        C0247h.b(interfaceC0208f, null, "data_store");
        C0051b c0051b = this.f2862g;
        if (c0051b != null) {
            C0247h.b((InterfaceC0208f) c0051b.f603h, null, "shared_preferences");
        }
        this.f2862g = null;
    }

    @Override // r0.InterfaceC0248i
    public final P d(String str, C0249j c0249j) {
        String l2 = l(str, c0249j);
        if (l2 == null) {
            return null;
        }
        if (l2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new P(l2, N.JSON_ENCODED);
        }
        return l2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new P(null, N.PLATFORM_ENCODED) : new P(null, N.UNEXPECTED_STRING);
    }

    @Override // r0.InterfaceC0248i
    public final void e(String str, String str2, C0249j c0249j) {
        AbstractC0046w.j(new C0237K(this, str, str2, null));
    }

    @Override // r0.InterfaceC0248i
    public final Long f(String str, C0249j c0249j) {
        E0.p pVar = new E0.p();
        AbstractC0046w.j(new v(str, this, pVar, null));
        return (Long) pVar.f312f;
    }

    @Override // r0.InterfaceC0248i
    public final List g(List list, C0249j c0249j) {
        return u0.d.H(((Map) AbstractC0046w.j(new w(this, list, null))).keySet());
    }

    @Override // r0.InterfaceC0248i
    public final void h(String str, long j2, C0249j c0249j) {
        AbstractC0046w.j(new C0236J(str, this, j2, null));
    }

    @Override // r0.InterfaceC0248i
    public final void i(String str, String str2, C0249j c0249j) {
        AbstractC0046w.j(new C0234H(this, str, str2, null));
    }

    @Override // r0.InterfaceC0248i
    public final void j(String str, List list, C0249j c0249j) {
        AbstractC0046w.j(new C0231E(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f2863h.d(list)), null));
    }

    @Override // r0.InterfaceC0248i
    public final void k(String str, double d2, C0249j c0249j) {
        AbstractC0046w.j(new C0233G(str, this, d2, null));
    }

    @Override // r0.InterfaceC0248i
    public final String l(String str, C0249j c0249j) {
        E0.p pVar = new E0.p();
        AbstractC0046w.j(new z(str, this, pVar, null));
        return (String) pVar.f312f;
    }

    @Override // r0.InterfaceC0248i
    public final Boolean m(String str, C0249j c0249j) {
        E0.p pVar = new E0.p();
        AbstractC0046w.j(new r(str, this, pVar, null));
        return (Boolean) pVar.f312f;
    }

    @Override // j0.InterfaceC0188a
    public final void n(Q q2) {
        E0.i.e(q2, "binding");
        InterfaceC0208f interfaceC0208f = (InterfaceC0208f) q2.f598h;
        E0.i.d(interfaceC0208f, "getBinaryMessenger(...)");
        Context context = (Context) q2.f597g;
        E0.i.d(context, "getApplicationContext(...)");
        this.f2861f = context;
        try {
            InterfaceC0248i.f2887e.getClass();
            C0247h.b(interfaceC0208f, this, "data_store");
            this.f2862g = new C0051b(interfaceC0208f, context, this.f2863h);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0240a().n(q2);
    }

    @Override // r0.InterfaceC0248i
    public final void o(List list, C0249j c0249j) {
        AbstractC0046w.j(new C0251l(this, list, null));
    }

    @Override // r0.InterfaceC0248i
    public final Map p(List list, C0249j c0249j) {
        return (Map) AbstractC0046w.j(new C0253n(this, list, null));
    }

    @Override // r0.InterfaceC0248i
    public final ArrayList q(String str, C0249j c0249j) {
        List list;
        String l2 = l(str, c0249j);
        ArrayList arrayList = null;
        if (l2 != null && !l2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && l2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) AbstractC0239M.c(l2, this.f2863h)) != null) {
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
