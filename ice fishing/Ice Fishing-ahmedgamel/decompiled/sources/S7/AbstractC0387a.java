package S7;

import u7.AbstractC5083i;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* renamed from: S7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0387a extends h0 implements InterfaceC5240d, InterfaceC0408w {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5245i f3025v;

    public AbstractC0387a(InterfaceC5245i interfaceC5245i, boolean z6) {
        super(z6);
        F((Y) interfaceC5245i.m(C0407v.f3081u));
        this.f3025v = interfaceC5245i.n(this);
    }

    @Override // S7.h0
    public final void E(B0.c cVar) {
        AbstractC0410y.l(cVar, this.f3025v);
    }

    @Override // S7.h0
    public final void O(Object obj) {
        if (!(obj instanceof C0402p)) {
            V(obj);
        } else {
            C0402p c0402p = (C0402p) obj;
            U(c0402p.f3066a, C0402p.f3065b.get(c0402p) != 0);
        }
    }

    public final void W(EnumC0409x enumC0409x, AbstractC0387a abstractC0387a, I7.p pVar) {
        Object invoke;
        int ordinal = enumC0409x.ordinal();
        if (ordinal == 0) {
            S0.f.s(pVar, abstractC0387a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.h.e(pVar, "<this>");
                A8.b.n(A8.b.g(pVar, abstractC0387a, this)).resumeWith(u7.v.f41073a);
                return;
            }
            if (ordinal != 3) {
                throw new B0.c();
            }
            try {
                InterfaceC5245i interfaceC5245i = this.f3025v;
                Object m9 = X7.a.m(interfaceC5245i, null);
                try {
                    if (pVar instanceof B7.a) {
                        kotlin.jvm.internal.u.b(2, pVar);
                        invoke = pVar.invoke(abstractC0387a, this);
                    } else {
                        invoke = A8.b.x(pVar, abstractC0387a, this);
                    }
                    X7.a.g(interfaceC5245i, m9);
                    if (invoke != A7.a.f215n) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    X7.a.g(interfaceC5245i, m9);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(Q3.b.b(th2));
            }
        }
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f3025v;
    }

    @Override // S7.h0
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        Throwable a9 = AbstractC5083i.a(obj);
        if (a9 != null) {
            obj = new C0402p(a9, false);
        }
        Object K7 = K(obj);
        if (K7 == AbstractC0410y.f3094e) {
            return;
        }
        k(K7);
    }

    @Override // S7.InterfaceC0408w
    public final InterfaceC5245i z() {
        return this.f3025v;
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z6) {
    }
}
