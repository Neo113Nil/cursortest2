package Z1;

import D.y;

/* loaded from: classes.dex */
public final class f implements R3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4213a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.c f4214b = new R3.c("currentCacheSizeBytes", y.q(y.p(U3.e.class, new U3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R3.c f4215c = new R3.c("maxCacheSizeBytes", y.q(y.p(U3.e.class, new U3.a(2))));

    @Override // R3.a
    public final void a(Object obj, Object obj2) {
        c2.f fVar = (c2.f) obj;
        R3.e eVar = (R3.e) obj2;
        eVar.c(f4214b, fVar.f5706a);
        eVar.c(f4215c, fVar.f5707b);
    }
}
