package Z1;

import D.y;

/* loaded from: classes.dex */
public final class c implements R3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4206a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.c f4207b = new R3.c("eventsDroppedCount", y.q(y.p(U3.e.class, new U3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R3.c f4208c = new R3.c("reason", y.q(y.p(U3.e.class, new U3.a(3))));

    @Override // R3.a
    public final void a(Object obj, Object obj2) {
        c2.d dVar = (c2.d) obj;
        R3.e eVar = (R3.e) obj2;
        eVar.c(f4207b, dVar.f5701a);
        eVar.a(f4208c, dVar.f5702b);
    }
}
