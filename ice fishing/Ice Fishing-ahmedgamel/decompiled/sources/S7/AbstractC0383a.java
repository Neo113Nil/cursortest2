package S7;

import u7.AbstractC5091i;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* renamed from: S7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0383a extends h0 implements InterfaceC5267d, InterfaceC0404w {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5272i f2942v;

    public AbstractC0383a(InterfaceC5272i interfaceC5272i, boolean z3) {
        super(z3);
        F((Y) interfaceC5272i.m(C0403v.f2998u));
        this.f2942v = interfaceC5272i.n(this);
    }

    @Override // S7.h0
    public final void E(B0.c cVar) {
        AbstractC0406y.l(cVar, this.f2942v);
    }

    @Override // S7.h0
    public final void O(Object obj) {
        if (!(obj instanceof C0398p)) {
            V(obj);
        } else {
            C0398p c0398p = (C0398p) obj;
            U(c0398p.f2983a, C0398p.f2982b.get(c0398p) != 0);
        }
    }

    public final void W(EnumC0405x enumC0405x, AbstractC0383a abstractC0383a, I7.p pVar) {
        Object invoke;
        int ordinal = enumC0405x.ordinal();
        if (ordinal == 0) {
            V2.a.u(pVar, abstractC0383a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.h.e(pVar, "<this>");
                A8.b.l(A8.b.f(pVar, abstractC0383a, this)).resumeWith(u7.v.f41353a);
                return;
            }
            if (ordinal != 3) {
                throw new B0.c();
            }
            try {
                InterfaceC5272i interfaceC5272i = this.f2942v;
                Object m4 = X7.a.m(interfaceC5272i, null);
                try {
                    if (pVar instanceof B7.a) {
                        kotlin.jvm.internal.u.b(2, pVar);
                        invoke = pVar.invoke(abstractC0383a, this);
                    } else {
                        invoke = A8.b.u(pVar, abstractC0383a, this);
                    }
                    X7.a.g(interfaceC5272i, m4);
                    if (invoke != A7.a.f58n) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    X7.a.g(interfaceC5272i, m4);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(com.bumptech.glide.d.f(th2));
            }
        }
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f2942v;
    }

    @Override // S7.h0
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        Throwable a9 = AbstractC5091i.a(obj);
        if (a9 != null) {
            obj = new C0398p(a9, false);
        }
        Object K7 = K(obj);
        if (K7 == AbstractC0406y.f3011e) {
            return;
        }
        k(K7);
    }

    @Override // S7.InterfaceC0404w
    public final InterfaceC5272i z() {
        return this.f2942v;
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z3) {
    }
}
