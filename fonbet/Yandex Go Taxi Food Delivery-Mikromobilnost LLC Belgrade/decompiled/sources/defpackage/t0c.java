package defpackage;

/* loaded from: classes15.dex */
public final class t0c extends ky4 {
    public x08 y;

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.y;
        if (x08Var != null) {
            x08Var.cancel();
        }
        this.y = null;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        v0c v0cVar = (v0c) ((m8g) s020Var).z0.get();
        this.y = v0cVar.b.f(new u0c(0, v0cVar));
    }
}
