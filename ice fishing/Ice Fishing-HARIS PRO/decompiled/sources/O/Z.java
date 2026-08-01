package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class Z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f782c;

    public Z() {
        this.f782c = B.a.h();
    }

    @Override // O.b0
    public j0 b() {
        WindowInsets build;
        a();
        build = this.f782c.build();
        j0 g2 = j0.g(null, build);
        g2.f819a.o(this.f788b);
        return g2;
    }

    @Override // O.b0
    public void d(G.c cVar) {
        this.f782c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // O.b0
    public void e(G.c cVar) {
        this.f782c.setStableInsets(cVar.d());
    }

    @Override // O.b0
    public void f(G.c cVar) {
        this.f782c.setSystemGestureInsets(cVar.d());
    }

    @Override // O.b0
    public void g(G.c cVar) {
        this.f782c.setSystemWindowInsets(cVar.d());
    }

    @Override // O.b0
    public void h(G.c cVar) {
        this.f782c.setTappableElementInsets(cVar.d());
    }

    public Z(j0 j0Var) {
        super(j0Var);
        WindowInsets.Builder h2;
        WindowInsets f2 = j0Var.f();
        if (f2 != null) {
            h2 = B.a.i(f2);
        } else {
            h2 = B.a.h();
        }
        this.f782c = h2;
    }
}
