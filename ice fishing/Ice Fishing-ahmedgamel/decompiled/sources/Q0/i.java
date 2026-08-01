package Q0;

import J0.s;
import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f2639f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2640g;

    public i(Context context, Z2.e eVar) {
        super(context, eVar);
        Object systemService = this.f2632b.getSystemService("connectivity");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f2639f = (ConnectivityManager) systemService;
        this.f2640g = new h(0, this);
    }

    @Override // Q0.f
    public final Object a() {
        return j.a(this.f2639f);
    }

    @Override // Q0.f
    public final void d() {
        try {
            s.d().a(j.f2641a, "Registering network callback");
            T0.i.a(this.f2639f, this.f2640g);
        } catch (IllegalArgumentException e9) {
            s.d().c(j.f2641a, "Received exception while registering network callback", e9);
        } catch (SecurityException e10) {
            s.d().c(j.f2641a, "Received exception while registering network callback", e10);
        }
    }

    @Override // Q0.f
    public final void e() {
        try {
            s.d().a(j.f2641a, "Unregistering network callback");
            T0.g.c(this.f2639f, this.f2640g);
        } catch (IllegalArgumentException e9) {
            s.d().c(j.f2641a, "Received exception while unregistering network callback", e9);
        } catch (SecurityException e10) {
            s.d().c(j.f2641a, "Received exception while unregistering network callback", e10);
        }
    }
}
