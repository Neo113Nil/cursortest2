package K0;

import P0.AbstractC0068a;

/* loaded from: classes.dex */
public final class k0 extends P0.u {

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f515j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(v0.i iVar, x0.f fVar) {
        super(fVar, iVar.i(r0) == null ? iVar.f(r0) : iVar);
        l0 l0Var = l0.f516f;
        this.f515j = new ThreadLocal();
        v0.i iVar2 = fVar.f3086g;
        E0.i.b(iVar2);
        if (iVar2.i(v0.e.f3008f) instanceof AbstractC0043t) {
            return;
        }
        Object n2 = AbstractC0068a.n(iVar, null);
        AbstractC0068a.h(iVar, n2);
        Y(iVar, n2);
    }

    public final boolean X() {
        boolean z2 = this.threadLocalIsSet && this.f515j.get() == null;
        this.f515j.remove();
        return !z2;
    }

    public final void Y(v0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f515j.set(new t0.b(iVar, obj));
    }

    @Override // P0.u, K0.a0
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            t0.b bVar = (t0.b) this.f515j.get();
            if (bVar != null) {
                AbstractC0068a.h((v0.i) bVar.f2982f, bVar.f2983g);
            }
            this.f515j.remove();
        }
        Object h2 = AbstractC0046w.h(obj);
        v0.d dVar = this.f903i;
        v0.i j2 = dVar.j();
        Object n2 = AbstractC0068a.n(j2, null);
        k0 m2 = n2 != AbstractC0068a.f865f ? AbstractC0046w.m(dVar, j2, n2) : null;
        try {
            this.f903i.c(h2);
        } finally {
            if (m2 == null || m2.X()) {
                AbstractC0068a.h(j2, n2);
            }
        }
    }
}
