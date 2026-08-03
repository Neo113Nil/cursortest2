package j5;

import android.app.Activity;
import m0.e2;
import m0.k0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements e2 {

    /* renamed from: g, reason: collision with root package name */
    public final a f3533g;

    /* renamed from: h, reason: collision with root package name */
    public final pc.k f3534h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f3535i;

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, oc.c cVar) {
        pc.j.e(aVar, "configurationChecker");
        this.f3533g = aVar;
        this.f3534h = (pc.k) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oc.c, pc.k] */
    @Override // m0.e2
    public final void c() {
        this.f3535i = (k0) this.f3534h.invoke(d.f3536a);
    }

    @Override // m0.e2
    public final void h() {
        k0 k0Var = this.f3535i;
        if (k0Var != null) {
            Activity activity = this.f3533g.f3531a;
            if (activity != null ? activity.isChangingConfigurations() : false) {
                k0Var = null;
            }
            if (k0Var != null) {
                k0Var.a();
            }
        }
        this.f3535i = null;
    }

    @Override // m0.e2
    public final void e() {
    }
}
