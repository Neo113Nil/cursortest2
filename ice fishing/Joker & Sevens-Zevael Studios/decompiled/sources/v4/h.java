package v4;

import android.content.Context;
import android.net.ConnectivityManager;
import o4.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f7221f;

    /* renamed from: g, reason: collision with root package name */
    public final g f7222g;

    public h(Context context, a5.c cVar) {
        super(context, cVar);
        Object systemService = this.f7215b.getSystemService("connectivity");
        pc.j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f7221f = (ConnectivityManager) systemService;
        this.f7222g = new g(this);
    }

    @Override // v4.e
    public final Object a() {
        return i.a(this.f7221f);
    }

    @Override // v4.e
    public final void d() {
        try {
            o.d().a(i.f7223a, "Registering network callback");
            y4.i.a(this.f7221f, this.f7222g);
        } catch (IllegalArgumentException e10) {
            o.d().c(i.f7223a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            o.d().c(i.f7223a, "Received exception while registering network callback", e11);
        }
    }

    @Override // v4.e
    public final void e() {
        try {
            o.d().a(i.f7223a, "Unregistering network callback");
            y4.g.c(this.f7221f, this.f7222g);
        } catch (IllegalArgumentException e10) {
            o.d().c(i.f7223a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            o.d().c(i.f7223a, "Received exception while unregistering network callback", e11);
        }
    }
}
