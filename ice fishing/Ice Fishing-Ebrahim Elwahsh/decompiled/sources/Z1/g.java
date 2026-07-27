package Z1;

import D.y;

/* loaded from: classes.dex */
public final class g implements R3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4216a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.c f4217b = new R3.c("startMs", y.q(y.p(U3.e.class, new U3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R3.c f4218c = new R3.c("endMs", y.q(y.p(U3.e.class, new U3.a(2))));

    @Override // R3.a
    public final void a(Object obj, Object obj2) {
        c2.g gVar = (c2.g) obj;
        R3.e eVar = (R3.e) obj2;
        eVar.c(f4217b, gVar.f5708a);
        eVar.c(f4218c, gVar.f5709b);
    }
}
