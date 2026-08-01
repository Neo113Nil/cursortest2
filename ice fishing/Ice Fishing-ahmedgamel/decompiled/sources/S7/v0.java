package S7;

import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class v0 extends AbstractC0402u {

    /* renamed from: v, reason: collision with root package name */
    public static final v0 f2999v = new v0();

    @Override // S7.AbstractC0402u
    public final void p(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        z0 z0Var = (z0) interfaceC5272i.m(z0.f3018v);
        if (z0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        z0Var.f3019u = true;
    }

    @Override // S7.AbstractC0402u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
