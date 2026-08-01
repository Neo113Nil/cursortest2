package Z1;

import D.y;
import c2.C0537d;

/* loaded from: classes.dex */
public final class c implements V3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4129a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final V3.c f4130b = new V3.c("eventsDroppedCount", y.u(y.t(Y3.e.class, new Y3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final V3.c f4131c = new V3.c("reason", y.u(y.t(Y3.e.class, new Y3.a(3))));

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        C0537d c0537d = (C0537d) obj;
        V3.e eVar = (V3.e) obj2;
        eVar.a(f4130b, c0537d.f5544a);
        eVar.c(f4131c, c0537d.f5545b);
    }
}
