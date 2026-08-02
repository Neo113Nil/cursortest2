package b2;

import D.x;
import a4.C0437a;
import e2.C4476d;

/* loaded from: classes.dex */
public final class c implements X3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5518a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final X3.c f5519b = new X3.c("eventsDroppedCount", x.r(x.q(a4.e.class, new C0437a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final X3.c f5520c = new X3.c("reason", x.r(x.q(a4.e.class, new C0437a(3))));

    @Override // X3.a
    public final void a(Object obj, Object obj2) {
        C4476d c4476d = (C4476d) obj;
        X3.e eVar = (X3.e) obj2;
        eVar.b(f5519b, c4476d.f37259a);
        eVar.a(f5520c, c4476d.f37260b);
    }
}
