package O2;

import P2.InterfaceC0374d;
import P2.InterfaceC0380j;
import com.google.android.gms.internal.ads.LD;
import java.util.Set;

/* loaded from: classes.dex */
public final class F implements InterfaceC0374d {

    /* renamed from: a, reason: collision with root package name */
    public final N2.c f2180a;

    /* renamed from: b, reason: collision with root package name */
    public final C0351a f2181b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0380j f2182c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f2183d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2184e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0354d f2185f;

    public F(C0354d c0354d, N2.c cVar, C0351a c0351a) {
        this.f2185f = c0354d;
        this.f2180a = cVar;
        this.f2181b = c0351a;
    }

    @Override // P2.InterfaceC0374d
    public final void a(M2.b bVar) {
        this.f2185f.f2235F.post(new LD(this, bVar, 19, false));
    }

    public final void b(M2.b bVar) {
        D d2 = (D) this.f2185f.f2232C.get(this.f2181b);
        if (d2 != null) {
            P2.w.c(d2.f2170F.f2235F);
            N2.c cVar = d2.f2172u;
            String name = cVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            cVar.d(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
            d2.l(bVar, null);
        }
    }
}
