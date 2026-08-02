package S7;

import z7.InterfaceC5240d;

/* renamed from: S7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0399m extends h0 implements InterfaceC0398l {
    public final Object U(InterfaceC5240d interfaceC5240d) {
        Object w3;
        while (true) {
            Object C8 = C();
            if (C8 instanceof V) {
                if (R(C8) >= 0) {
                    d0 d0Var = new d0(A8.b.n(interfaceC5240d), this);
                    d0Var.r();
                    d0Var.t(new C0391e(1, G(false, true, new I(2, d0Var))));
                    w3 = d0Var.q();
                    A7.a aVar = A7.a.f215n;
                    break;
                }
            } else {
                if (C8 instanceof C0402p) {
                    throw ((C0402p) C8).f3066a;
                }
                w3 = AbstractC0410y.w(C8);
            }
        }
        A7.a aVar2 = A7.a.f215n;
        return w3;
    }
}
