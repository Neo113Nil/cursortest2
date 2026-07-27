package N2;

import B2.RunnableC0272f;
import O2.InterfaceC0367d;
import O2.InterfaceC0373j;
import java.util.Set;

/* loaded from: classes.dex */
public final class E implements InterfaceC0367d {

    /* renamed from: a, reason: collision with root package name */
    public final M2.c f1997a;

    /* renamed from: b, reason: collision with root package name */
    public final C0315a f1998b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0373j f1999c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f2000d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2001e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0318d f2002f;

    public E(C0318d c0318d, M2.c cVar, C0315a c0315a) {
        this.f2002f = c0318d;
        this.f1997a = cVar;
        this.f1998b = c0315a;
    }

    @Override // O2.InterfaceC0367d
    public final void a(L2.b bVar) {
        this.f2002f.f2052F.post(new RunnableC0272f(this, bVar, 14, false));
    }

    public final void b(L2.b bVar) {
        C c4 = (C) this.f2002f.f2049C.get(this.f1998b);
        if (c4 != null) {
            O2.w.c(c4.f1987F.f2052F);
            M2.c cVar = c4.f1989u;
            String name = cVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            cVar.c(com.anythink.basead.b.c.i.q(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
            c4.l(bVar, null);
        }
    }
}
