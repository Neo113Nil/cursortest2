package Q0;

import J0.r;
import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f2474f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2475g;

    public i(Context context, b3.e eVar) {
        super(context, eVar);
        Object systemService = this.f2467b.getSystemService("connectivity");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f2474f = (ConnectivityManager) systemService;
        this.f2475g = new h(0, this);
    }

    @Override // Q0.f
    public final Object a() {
        return j.a(this.f2474f);
    }

    @Override // Q0.f
    public final void d() {
        try {
            r.d().a(j.f2476a, "Registering network callback");
            T0.i.a(this.f2474f, this.f2475g);
        } catch (IllegalArgumentException e9) {
            r.d().c(j.f2476a, "Received exception while registering network callback", e9);
        } catch (SecurityException e10) {
            r.d().c(j.f2476a, "Received exception while registering network callback", e10);
        }
    }

    @Override // Q0.f
    public final void e() {
        try {
            r.d().a(j.f2476a, "Unregistering network callback");
            T0.g.c(this.f2474f, this.f2475g);
        } catch (IllegalArgumentException e9) {
            r.d().c(j.f2476a, "Received exception while unregistering network callback", e9);
        } catch (SecurityException e10) {
            r.d().c(j.f2476a, "Received exception while unregistering network callback", e10);
        }
    }
}
