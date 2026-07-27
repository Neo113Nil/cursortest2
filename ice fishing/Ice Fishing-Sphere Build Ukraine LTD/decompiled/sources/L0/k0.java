package L0;

import Q0.AbstractC0068a;
import t0.C0247b;

/* loaded from: classes.dex */
public final class k0 extends Q0.u {

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f663i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(v0.i iVar, x0.f fVar) {
        super(fVar, iVar.i(r0) == null ? iVar.f(r0) : iVar);
        l0 l0Var = l0.f664e;
        this.f663i = new ThreadLocal();
        v0.i iVar2 = fVar.f3091f;
        E0.i.b(iVar2);
        if (iVar2.i(v0.e.f3013e) instanceof AbstractC0061t) {
            return;
        }
        Object n2 = AbstractC0068a.n(iVar, null);
        AbstractC0068a.h(iVar, n2);
        Y(iVar, n2);
    }

    public final boolean X() {
        boolean z2 = this.threadLocalIsSet && this.f663i.get() == null;
        this.f663i.remove();
        return !z2;
    }

    public final void Y(v0.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f663i.set(new C0247b(iVar, obj));
    }

    @Override // Q0.u, L0.a0
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            C0247b c0247b = (C0247b) this.f663i.get();
            if (c0247b != null) {
                AbstractC0068a.h((v0.i) c0247b.f2987e, c0247b.f2988f);
            }
            this.f663i.remove();
        }
        Object h2 = AbstractC0064w.h(obj);
        v0.d dVar = this.f912h;
        v0.i j2 = dVar.j();
        Object n2 = AbstractC0068a.n(j2, null);
        k0 m2 = n2 != AbstractC0068a.f874f ? AbstractC0064w.m(dVar, j2, n2) : null;
        try {
            this.f912h.c(h2);
        } finally {
            if (m2 == null || m2.X()) {
                AbstractC0068a.h(j2, n2);
            }
        }
    }
}
