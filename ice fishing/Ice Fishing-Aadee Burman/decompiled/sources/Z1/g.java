package Z1;

import D.y;
import c2.C0540g;

/* loaded from: classes.dex */
public final class g implements V3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4139a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final V3.c f4140b = new V3.c("startMs", y.u(y.t(Y3.e.class, new Y3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final V3.c f4141c = new V3.c("endMs", y.u(y.t(Y3.e.class, new Y3.a(2))));

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        C0540g c0540g = (C0540g) obj;
        V3.e eVar = (V3.e) obj2;
        eVar.a(f4140b, c0540g.f5551a);
        eVar.a(f4141c, c0540g.f5552b);
    }
}
