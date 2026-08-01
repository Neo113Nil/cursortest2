package Z1;

import D.y;
import c2.C0538e;

/* loaded from: classes.dex */
public final class d implements V3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4132a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final V3.c f4133b = new V3.c("logSource", y.u(y.t(Y3.e.class, new Y3.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final V3.c f4134c = new V3.c("logEventDropped", y.u(y.t(Y3.e.class, new Y3.a(2))));

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        C0538e c0538e = (C0538e) obj;
        V3.e eVar = (V3.e) obj2;
        eVar.c(f4133b, c0538e.f5547a);
        eVar.c(f4134c, c0538e.f5548b);
    }
}
