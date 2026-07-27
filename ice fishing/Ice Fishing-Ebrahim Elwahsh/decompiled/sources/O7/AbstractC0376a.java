package O7;

import q7.AbstractC4940i;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5217a;

/* renamed from: O7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0376a extends h0 implements InterfaceC5133d, InterfaceC0397w {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC5138i f2578v;

    public AbstractC0376a(InterfaceC5138i interfaceC5138i, boolean z8) {
        super(z8);
        F((Y) interfaceC5138i.i(C0396v.f2634u));
        this.f2578v = interfaceC5138i.n(this);
    }

    @Override // O7.h0
    public final void E(B0.c cVar) {
        AbstractC0399y.l(cVar, this.f2578v);
    }

    @Override // O7.h0
    public final void O(Object obj) {
        if (!(obj instanceof C0391p)) {
            V(obj);
        } else {
            C0391p c0391p = (C0391p) obj;
            U(c0391p.f2619a, C0391p.f2618b.get(c0391p) != 0);
        }
    }

    public final void W(EnumC0398x enumC0398x, AbstractC0376a abstractC0376a, E7.p pVar) {
        Object invoke;
        int ordinal = enumC0398x.ordinal();
        if (ordinal == 0) {
            com.bumptech.glide.f.q(pVar, abstractC0376a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.h.e(pVar, "<this>");
                w8.a.f(w8.a.d(pVar, abstractC0376a, this)).resumeWith(q7.v.f40183a);
                return;
            }
            if (ordinal != 3) {
                throw new B0.c();
            }
            try {
                InterfaceC5138i interfaceC5138i = this.f2578v;
                Object m8 = T7.a.m(interfaceC5138i, null);
                try {
                    if (pVar instanceof AbstractC5217a) {
                        kotlin.jvm.internal.u.b(2, pVar);
                        invoke = pVar.invoke(abstractC0376a, this);
                    } else {
                        invoke = w8.a.m(pVar, abstractC0376a, this);
                    }
                    T7.a.g(interfaceC5138i, m8);
                    if (invoke != EnumC5179a.f41704n) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    T7.a.g(interfaceC5138i, m8);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(com.bumptech.glide.f.e(th2));
            }
        }
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f2578v;
    }

    @Override // O7.h0
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        Throwable a9 = AbstractC4940i.a(obj);
        if (a9 != null) {
            obj = new C0391p(a9, false);
        }
        Object K8 = K(obj);
        if (K8 == AbstractC0399y.f2647e) {
            return;
        }
        l(K8);
    }

    @Override // O7.InterfaceC0397w
    public final InterfaceC5138i z() {
        return this.f2578v;
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z8) {
    }
}
