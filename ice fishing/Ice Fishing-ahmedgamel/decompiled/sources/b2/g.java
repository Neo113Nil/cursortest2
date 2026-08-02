package b2;

import D.x;
import a4.C0437a;
import e2.C4479g;

/* loaded from: classes.dex */
public final class g implements X3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5528a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final X3.c f5529b = new X3.c("startMs", x.r(x.q(a4.e.class, new C0437a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X3.c f5530c = new X3.c("endMs", x.r(x.q(a4.e.class, new C0437a(2))));

    @Override // X3.a
    public final void a(Object obj, Object obj2) {
        C4479g c4479g = (C4479g) obj;
        X3.e eVar = (X3.e) obj2;
        eVar.b(f5529b, c4479g.f37266a);
        eVar.b(f5530c, c4479g.f37267b);
    }
}
