package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2218c;

    public q0() {
        this.f2218c = B.a.f();
    }

    @Override // O.s0
    public A0 b() {
        WindowInsets build;
        a();
        build = this.f2218c.build();
        A0 h3 = A0.h(null, build);
        h3.f2115a.o(this.f2220b);
        return h3;
    }

    @Override // O.s0
    public void d(G.e eVar) {
        this.f2218c.setMandatorySystemGestureInsets(eVar.d());
    }

    @Override // O.s0
    public void e(G.e eVar) {
        this.f2218c.setStableInsets(eVar.d());
    }

    @Override // O.s0
    public void f(G.e eVar) {
        this.f2218c.setSystemGestureInsets(eVar.d());
    }

    @Override // O.s0
    public void g(G.e eVar) {
        this.f2218c.setSystemWindowInsets(eVar.d());
    }

    @Override // O.s0
    public void h(G.e eVar) {
        this.f2218c.setTappableElementInsets(eVar.d());
    }

    public q0(A0 a02) {
        super(a02);
        WindowInsets.Builder f2;
        WindowInsets g9 = a02.g();
        if (g9 != null) {
            f2 = B.a.g(g9);
        } else {
            f2 = B.a.f();
        }
        this.f2218c = f2;
    }
}
