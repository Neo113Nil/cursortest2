package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2130c;

    public q0() {
        this.f2130c = B.a.e();
    }

    @Override // O.s0
    public A0 b() {
        WindowInsets build;
        a();
        build = this.f2130c.build();
        A0 h9 = A0.h(null, build);
        h9.f2027a.o(this.f2132b);
        return h9;
    }

    @Override // O.s0
    public void d(G.e eVar) {
        this.f2130c.setMandatorySystemGestureInsets(eVar.d());
    }

    @Override // O.s0
    public void e(G.e eVar) {
        this.f2130c.setStableInsets(eVar.d());
    }

    @Override // O.s0
    public void f(G.e eVar) {
        this.f2130c.setSystemGestureInsets(eVar.d());
    }

    @Override // O.s0
    public void g(G.e eVar) {
        this.f2130c.setSystemWindowInsets(eVar.d());
    }

    @Override // O.s0
    public void h(G.e eVar) {
        this.f2130c.setTappableElementInsets(eVar.d());
    }

    public q0(A0 a02) {
        super(a02);
        WindowInsets.Builder e9;
        WindowInsets g4 = a02.g();
        if (g4 != null) {
            e9 = B.a.f(g4);
        } else {
            e9 = B.a.e();
        }
        this.f2130c = e9;
    }
}
