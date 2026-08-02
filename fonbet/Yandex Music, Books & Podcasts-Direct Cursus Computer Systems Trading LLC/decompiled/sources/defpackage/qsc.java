package defpackage;

/* loaded from: classes5.dex */
public abstract class qsc extends vn4 {
    @Override // defpackage.vn4
    public void a(String str, Throwable th) {
        g().a(str, th);
    }

    @Override // defpackage.vn4
    public final void b() {
        g().b();
    }

    @Override // defpackage.vn4
    public final boolean c() {
        return g().c();
    }

    @Override // defpackage.vn4
    public final void d() {
        g().d();
    }

    @Override // defpackage.vn4
    public void e(Object obj) {
        g().e(obj);
    }

    @Override // defpackage.vn4
    public void f(bg3 bg3Var, s2i s2iVar) {
        g().f(bg3Var, s2iVar);
    }

    public abstract vn4 g();

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(g(), "delegate");
        return Y.toString();
    }
}
