package S7;

import u7.C5089g;
import z7.C5268e;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class w0 extends X7.s {
    private volatile boolean threadLocalIsSet;

    /* renamed from: x, reason: collision with root package name */
    public final ThreadLocal f3000x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0(InterfaceC5267d interfaceC5267d, InterfaceC5272i interfaceC5272i) {
        super(interfaceC5267d, interfaceC5272i.m(r0) == null ? interfaceC5272i.n(r0) : interfaceC5272i);
        x0 x0Var = x0.f3006n;
        this.f3000x = new ThreadLocal();
        if (interfaceC5267d.getContext().m(C5268e.f42271n) instanceof AbstractC0402u) {
            return;
        }
        Object m4 = X7.a.m(interfaceC5272i, null);
        X7.a.g(interfaceC5272i, m4);
        Y(interfaceC5272i, m4);
    }

    public final boolean X() {
        boolean z3 = this.threadLocalIsSet && this.f3000x.get() == null;
        this.f3000x.remove();
        return !z3;
    }

    public final void Y(InterfaceC5272i interfaceC5272i, Object obj) {
        this.threadLocalIsSet = true;
        this.f3000x.set(new C5089g(interfaceC5272i, obj));
    }

    @Override // X7.s, S7.h0
    public final void k(Object obj) {
        if (this.threadLocalIsSet) {
            C5089g c5089g = (C5089g) this.f3000x.get();
            if (c5089g != null) {
                X7.a.g((InterfaceC5272i) c5089g.f41332n, c5089g.f41333u);
            }
            this.f3000x.remove();
        }
        Object q8 = AbstractC0406y.q(obj);
        InterfaceC5267d interfaceC5267d = this.f3858w;
        InterfaceC5272i context = interfaceC5267d.getContext();
        Object m4 = X7.a.m(context, null);
        w0 x9 = m4 != X7.a.f3825f ? AbstractC0406y.x(interfaceC5267d, context, m4) : null;
        try {
            this.f3858w.resumeWith(q8);
            if (x9 == null || x9.X()) {
                X7.a.g(context, m4);
            }
        } catch (Throwable th) {
            if (x9 == null || x9.X()) {
                X7.a.g(context, m4);
            }
            throw th;
        }
    }
}
