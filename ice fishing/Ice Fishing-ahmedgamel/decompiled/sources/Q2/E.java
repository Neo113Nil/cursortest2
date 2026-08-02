package Q2;

import R2.InterfaceC0378d;
import R2.InterfaceC0384j;
import com.google.android.gms.internal.ads.LD;
import java.util.Set;

/* loaded from: classes.dex */
public final class E implements InterfaceC0378d {

    /* renamed from: a, reason: collision with root package name */
    public final P2.c f2498a;

    /* renamed from: b, reason: collision with root package name */
    public final C0356a f2499b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0384j f2500c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f2501d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2502e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0359d f2503f;

    public E(C0359d c0359d, P2.c cVar, C0356a c0356a) {
        this.f2503f = c0359d;
        this.f2498a = cVar;
        this.f2499b = c0356a;
    }

    @Override // R2.InterfaceC0378d
    public final void a(O2.b bVar) {
        this.f2503f.f2553F.post(new LD(this, bVar, 19, false));
    }

    public final void b(O2.b bVar) {
        C c9 = (C) this.f2503f.f2550C.get(this.f2499b);
        if (c9 != null) {
            R2.w.c(c9.f2488F.f2553F);
            P2.c cVar = c9.f2490u;
            String name = cVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            cVar.b(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
            c9.l(bVar, null);
        }
    }
}
