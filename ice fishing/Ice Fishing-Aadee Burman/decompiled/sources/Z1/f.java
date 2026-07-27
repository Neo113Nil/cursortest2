package Z1;

import D.y;
import c2.C0539f;

/* loaded from: classes.dex */
public final class f implements V3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4136a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final V3.c f4137b = new V3.c("currentCacheSizeBytes", y.u(y.t(Y3.e.class, new Y3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final V3.c f4138c = new V3.c("maxCacheSizeBytes", y.u(y.t(Y3.e.class, new Y3.a(2))));

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        C0539f c0539f = (C0539f) obj;
        V3.e eVar = (V3.e) obj2;
        eVar.a(f4137b, c0539f.f5549a);
        eVar.a(f4138c, c0539f.f5550b);
    }
}
