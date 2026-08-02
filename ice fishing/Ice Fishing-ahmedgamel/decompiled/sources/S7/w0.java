package S7;

import u7.C5081g;
import z7.C5241e;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class w0 extends X7.s {
    private volatile boolean threadLocalIsSet;

    /* renamed from: x, reason: collision with root package name */
    public final ThreadLocal f3083x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0(InterfaceC5240d interfaceC5240d, InterfaceC5245i interfaceC5245i) {
        super(interfaceC5240d, interfaceC5245i.m(r0) == null ? interfaceC5245i.n(r0) : interfaceC5245i);
        x0 x0Var = x0.f3089n;
        this.f3083x = new ThreadLocal();
        if (interfaceC5240d.getContext().m(C5241e.f42240n) instanceof AbstractC0406u) {
            return;
        }
        Object m9 = X7.a.m(interfaceC5245i, null);
        X7.a.g(interfaceC5245i, m9);
        Y(interfaceC5245i, m9);
    }

    public final boolean X() {
        boolean z6 = this.threadLocalIsSet && this.f3083x.get() == null;
        this.f3083x.remove();
        return !z6;
    }

    public final void Y(InterfaceC5245i interfaceC5245i, Object obj) {
        this.threadLocalIsSet = true;
        this.f3083x.set(new C5081g(interfaceC5245i, obj));
    }

    @Override // X7.s, S7.h0
    public final void k(Object obj) {
        if (this.threadLocalIsSet) {
            C5081g c5081g = (C5081g) this.f3083x.get();
            if (c5081g != null) {
                X7.a.g((InterfaceC5245i) c5081g.f41052n, c5081g.f41053u);
            }
            this.f3083x.remove();
        }
        Object q8 = AbstractC0410y.q(obj);
        InterfaceC5240d interfaceC5240d = this.f3813w;
        InterfaceC5245i context = interfaceC5240d.getContext();
        Object m9 = X7.a.m(context, null);
        w0 x9 = m9 != X7.a.f3780f ? AbstractC0410y.x(interfaceC5240d, context, m9) : null;
        try {
            this.f3813w.resumeWith(q8);
            if (x9 == null || x9.X()) {
                X7.a.g(context, m9);
            }
        } catch (Throwable th) {
            if (x9 == null || x9.X()) {
                X7.a.g(context, m9);
            }
            throw th;
        }
    }
}
