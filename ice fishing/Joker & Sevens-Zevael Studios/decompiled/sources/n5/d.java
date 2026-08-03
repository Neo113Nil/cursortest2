package n5;

import b0.l0;
import d8.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.l1;
import m0.r;
import m0.x1;
import m0.z;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5063a = v6.a.U(l5.b.f4161i, l5.b.f4160h);

    public static final void a(m5.c cVar, r rVar, int i10) {
        rVar.Z(1888863985);
        j5.d.a(cVar, new c(cVar, 0), rVar);
        j5.d.a(cVar, new c(cVar, 1), rVar);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new m5.f(cVar, i10, 2);
        }
    }

    public static final void b(m5.c cVar, r rVar, int i10) {
        rVar.Z(-514805831);
        j5.d.a(cVar, new c(cVar, 2), rVar);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new m5.f(cVar, i10, 3);
        }
    }

    public static final void c(m5.c cVar, r rVar, int i10) {
        rVar.Z(628249098);
        List b2 = cVar.b();
        z.d(b2, new l0(4, cVar, b2), rVar);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new m5.f(cVar, i10, 4);
        }
    }

    public static final void d(m5.c cVar) {
        j.e(cVar, "navigator");
        Iterator it = cVar.b().iterator();
        while (it.hasNext()) {
            cVar.a((k5.a) it.next());
        }
        i5.a aVar = o5.a.f5226a;
        i5.a aVar2 = (i5.a) aVar.f3195g.remove(cVar.f4878a);
        if (aVar2 != null) {
            Iterator it2 = aVar2.entrySet().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        t tVar = cVar.f4881d;
        tVar.getClass();
        ((l1) tVar.f1817b).setValue(l5.b.f4162j);
    }
}
