package K0;

import P0.AbstractC0068a;
import a.AbstractC0069a;

/* renamed from: K0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0025a extends a0 implements v0.d, InterfaceC0045v {

    /* renamed from: h, reason: collision with root package name */
    public final v0.i f497h;

    public AbstractC0025a(v0.i iVar, boolean z2) {
        super(z2);
        H((Q) iVar.i(C0044u.f534g));
        this.f497h = iVar.f(this);
    }

    @Override // K0.a0
    public final void G(C0040p c0040p) {
        AbstractC0046w.d(c0040p, this.f497h);
    }

    @Override // K0.a0
    public final void O(Object obj) {
        if (!(obj instanceof C0038n)) {
            V(obj);
            return;
        }
        C0038n c0038n = (C0038n) obj;
        Throwable th = c0038n.f523a;
        c0038n.getClass();
        U(th, C0038n.f522b.get(c0038n) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i2, AbstractC0025a abstractC0025a, D0.p pVar) {
        int b2 = F.j.b(i2);
        if (b2 == 0) {
            AbstractC0069a.H(pVar, abstractC0025a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                o.g.u(((x0.b) pVar).l(abstractC0025a, this)).c(t0.g.f2989a);
                return;
            }
            if (b2 != 3) {
                throw new C0040p();
            }
            try {
                v0.i iVar = this.f497h;
                Object n2 = AbstractC0068a.n(iVar, null);
                try {
                    E0.s.a(2, pVar);
                    Object f2 = pVar.f(abstractC0025a, this);
                    if (f2 != w0.a.f3071f) {
                        c(f2);
                    }
                } finally {
                    AbstractC0068a.h(iVar, n2);
                }
            } catch (Throwable th) {
                c(o.g.f(th));
            }
        }
    }

    @Override // v0.d
    public final void c(Object obj) {
        Throwable a2 = t0.d.a(obj);
        if (a2 != null) {
            obj = new C0038n(a2, false);
        }
        Object L2 = L(obj);
        if (L2 == AbstractC0046w.f538d) {
            return;
        }
        r(L2);
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f497h;
    }

    @Override // K0.InterfaceC0045v
    public final v0.i o() {
        return this.f497h;
    }

    @Override // K0.a0
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z2) {
    }
}
