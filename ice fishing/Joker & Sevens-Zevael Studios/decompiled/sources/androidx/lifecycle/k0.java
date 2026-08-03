package androidx.lifecycle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 implements s, AutoCloseable {

    /* renamed from: g, reason: collision with root package name */
    public final String f683g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f684h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f685i;

    public k0(String str, j0 j0Var) {
        this.f683g = str;
        this.f684h = j0Var;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        if (oVar == o.ON_DESTROY) {
            this.f685i = false;
            uVar.h().f(this);
        }
    }

    public final void i(w wVar, x4.l lVar) {
        pc.j.e(lVar, "registry");
        pc.j.e(wVar, "lifecycle");
        if (this.f685i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f685i = true;
        wVar.a(this);
        lVar.k(this.f683g, (d.i) this.f684h.f682a.f1820e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
