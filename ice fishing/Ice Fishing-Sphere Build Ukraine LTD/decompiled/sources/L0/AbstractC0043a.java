package L0;

import Q0.AbstractC0068a;
import a.AbstractC0069a;
import t0.AbstractC0249d;
import t0.C0252g;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0043a extends a0 implements v0.d, InterfaceC0063v {

    /* renamed from: g, reason: collision with root package name */
    public final v0.i f645g;

    public AbstractC0043a(v0.i iVar, boolean z2) {
        super(z2);
        H((Q) iVar.i(C0062u.f682f));
        this.f645g = iVar.f(this);
    }

    @Override // L0.a0
    public final void G(C0058p c0058p) {
        AbstractC0064w.d(c0058p, this.f645g);
    }

    @Override // L0.a0
    public final void O(Object obj) {
        if (!(obj instanceof C0056n)) {
            V(obj);
            return;
        }
        C0056n c0056n = (C0056n) obj;
        Throwable th = c0056n.f671a;
        c0056n.getClass();
        U(th, C0056n.f670b.get(c0056n) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i2, AbstractC0043a abstractC0043a, D0.p pVar) {
        int b2 = F.j.b(i2);
        if (b2 == 0) {
            AbstractC0069a.H(pVar, abstractC0043a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                o.g.r(((x0.b) pVar).l(abstractC0043a, this)).c(C0252g.f2994a);
                return;
            }
            if (b2 != 3) {
                throw new C0058p();
            }
            try {
                v0.i iVar = this.f645g;
                Object n2 = AbstractC0068a.n(iVar, null);
                try {
                    E0.s.a(2, pVar);
                    Object f2 = pVar.f(abstractC0043a, this);
                    if (f2 != w0.a.f3076e) {
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
        Throwable a2 = AbstractC0249d.a(obj);
        if (a2 != null) {
            obj = new C0056n(a2, false);
        }
        Object L2 = L(obj);
        if (L2 == AbstractC0064w.f686d) {
            return;
        }
        r(L2);
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f645g;
    }

    @Override // L0.InterfaceC0063v
    public final v0.i o() {
        return this.f645g;
    }

    @Override // L0.a0
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z2) {
    }
}
