package b2;

import D.x;
import a4.C0437a;
import e2.C4478f;

/* loaded from: classes.dex */
public final class f implements X3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5525a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final X3.c f5526b = new X3.c("currentCacheSizeBytes", x.r(x.q(a4.e.class, new C0437a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X3.c f5527c = new X3.c("maxCacheSizeBytes", x.r(x.q(a4.e.class, new C0437a(2))));

    @Override // X3.a
    public final void a(Object obj, Object obj2) {
        C4478f c4478f = (C4478f) obj;
        X3.e eVar = (X3.e) obj2;
        eVar.b(f5526b, c4478f.f37264a);
        eVar.b(f5527c, c4478f.f37265b);
    }
}
