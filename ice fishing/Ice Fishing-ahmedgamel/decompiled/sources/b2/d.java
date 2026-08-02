package b2;

import D.x;
import a4.C0437a;
import e2.C4477e;

/* loaded from: classes.dex */
public final class d implements X3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5521a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final X3.c f5522b = new X3.c("logSource", x.r(x.q(a4.e.class, new C0437a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X3.c f5523c = new X3.c("logEventDropped", x.r(x.q(a4.e.class, new C0437a(2))));

    @Override // X3.a
    public final void a(Object obj, Object obj2) {
        C4477e c4477e = (C4477e) obj;
        X3.e eVar = (X3.e) obj2;
        eVar.a(f5522b, c4477e.f37262a);
        eVar.a(f5523c, c4477e.f37263b);
    }
}
