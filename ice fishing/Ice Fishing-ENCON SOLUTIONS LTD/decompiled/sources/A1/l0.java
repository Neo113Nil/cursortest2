package A1;

import h1.C0234d;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class l0 extends F1.t {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f54e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(l1.i iVar, AbstractC0995f abstractC0995f) {
        super(abstractC0995f, iVar.m(r0) == null ? iVar.l(r0) : iVar);
        m0 m0Var = m0.f60a;
        this.f54e = new ThreadLocal();
        l1.i iVar2 = abstractC0995f.f8213b;
        kotlin.jvm.internal.i.b(iVar2);
        if (iVar2.m(l1.e.f8137a) instanceof AbstractC0018t) {
            return;
        }
        Object m2 = F1.a.m(iVar, null);
        F1.a.g(iVar, m2);
        X(iVar, m2);
    }

    public final boolean W() {
        boolean z2 = this.threadLocalIsSet && this.f54e.get() == null;
        this.f54e.remove();
        return !z2;
    }

    public final void X(l1.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f54e.set(new C0234d(iVar, obj));
    }

    @Override // F1.t, A1.b0
    public final void q(Object obj) {
        if (this.threadLocalIsSet) {
            C0234d c0234d = (C0234d) this.f54e.get();
            if (c0234d != null) {
                F1.a.g((l1.i) c0234d.f3386a, c0234d.f3387b);
            }
            this.f54e.remove();
        }
        Object h2 = AbstractC0022x.h(obj);
        l1.d dVar = this.f629d;
        l1.i context = dVar.getContext();
        Object m2 = F1.a.m(context, null);
        l0 m3 = m2 != F1.a.f594f ? AbstractC0022x.m(dVar, context, m2) : null;
        try {
            this.f629d.i(h2);
        } finally {
            if (m3 == null || m3.W()) {
                F1.a.g(context, m2);
            }
        }
    }
}
