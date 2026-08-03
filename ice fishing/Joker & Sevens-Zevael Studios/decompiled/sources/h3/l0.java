package h3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class l0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2797c;

    public l0() {
        this.f2797c = k0.c();
    }

    @Override // h3.p0
    public a1 b() {
        WindowInsets build;
        a();
        build = this.f2797c.build();
        a1 c3 = a1.c(null, build);
        c3.f2745a.q(this.f2808b);
        return c3;
    }

    @Override // h3.p0
    public void d(a3.b bVar) {
        this.f2797c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // h3.p0
    public void e(a3.b bVar) {
        this.f2797c.setStableInsets(bVar.d());
    }

    @Override // h3.p0
    public void f(a3.b bVar) {
        this.f2797c.setSystemGestureInsets(bVar.d());
    }

    @Override // h3.p0
    public void g(a3.b bVar) {
        this.f2797c.setSystemWindowInsets(bVar.d());
    }

    @Override // h3.p0
    public void h(a3.b bVar) {
        this.f2797c.setTappableElementInsets(bVar.d());
    }

    public l0(a1 a1Var) {
        super(a1Var);
        WindowInsets.Builder c3;
        WindowInsets b2 = a1Var.b();
        if (b2 != null) {
            c3 = k0.d(b2);
        } else {
            c3 = k0.c();
        }
        this.f2797c = c3;
    }
}
