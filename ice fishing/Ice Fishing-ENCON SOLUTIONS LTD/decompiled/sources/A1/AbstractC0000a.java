package A1;

import h1.AbstractC0236f;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import u0.AbstractC1050a;

/* renamed from: A1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0000a extends b0 implements l1.d, InterfaceC0020v {

    /* renamed from: c, reason: collision with root package name */
    public final l1.i f32c;

    public AbstractC0000a(l1.i iVar, boolean z2) {
        super(z2);
        G((S) iVar.m(C0019u.f73b));
        this.f32c = iVar.l(this);
    }

    @Override // A1.b0
    public final void F(C0015p c0015p) {
        AbstractC0022x.d(c0015p, this.f32c);
    }

    @Override // A1.b0
    public final void N(Object obj) {
        if (!(obj instanceof C0013n)) {
            U(obj);
            return;
        }
        C0013n c0013n = (C0013n) obj;
        Throwable th = c0013n.f62a;
        c0013n.getClass();
        T(th, C0013n.f61b.get(c0013n) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(int i2, AbstractC0000a abstractC0000a, t1.p pVar) {
        int b2 = H.j.b(i2);
        if (b2 == 0) {
            AbstractC1050a.B(pVar, abstractC0000a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                R1.d.t(((AbstractC0991b) pVar).b(abstractC0000a, this)).i(C0239i.f3393a);
                return;
            }
            if (b2 != 3) {
                throw new C0015p();
            }
            try {
                l1.i iVar = this.f32c;
                Object m2 = F1.a.m(iVar, null);
                try {
                    kotlin.jvm.internal.s.a(2, pVar);
                    Object invoke = pVar.invoke(abstractC0000a, this);
                    if (invoke != EnumC0985a.f8194a) {
                        i(invoke);
                    }
                } finally {
                    F1.a.g(iVar, m2);
                }
            } catch (Throwable th) {
                i(R1.l.h(th));
            }
        }
    }

    @Override // l1.d
    public final l1.i getContext() {
        return this.f32c;
    }

    @Override // A1.InterfaceC0020v
    public final l1.i h() {
        return this.f32c;
    }

    @Override // l1.d
    public final void i(Object obj) {
        Throwable a2 = AbstractC0236f.a(obj);
        if (a2 != null) {
            obj = new C0013n(a2, false);
        }
        Object K2 = K(obj);
        if (K2 == AbstractC0022x.f77d) {
            return;
        }
        q(K2);
    }

    @Override // A1.b0
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void U(Object obj) {
    }

    public void T(Throwable th, boolean z2) {
    }
}
