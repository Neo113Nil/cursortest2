package S7;

import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class v0 extends AbstractC0406u {

    /* renamed from: v, reason: collision with root package name */
    public static final v0 f3082v = new v0();

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        z0 z0Var = (z0) interfaceC5245i.m(z0.f3101v);
        if (z0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        z0Var.f3102u = true;
    }

    @Override // S7.AbstractC0406u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
