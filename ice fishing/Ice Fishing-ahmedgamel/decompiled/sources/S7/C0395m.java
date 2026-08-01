package S7;

import z7.InterfaceC5267d;

/* renamed from: S7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0395m extends h0 implements InterfaceC0394l {
    public final Object U(InterfaceC5267d interfaceC5267d) {
        Object w6;
        while (true) {
            Object C8 = C();
            if (C8 instanceof V) {
                if (R(C8) >= 0) {
                    d0 d0Var = new d0(A8.b.l(interfaceC5267d), this);
                    d0Var.r();
                    d0Var.t(new C0387e(1, G(false, true, new I(2, d0Var))));
                    w6 = d0Var.q();
                    A7.a aVar = A7.a.f58n;
                    break;
                }
            } else {
                if (C8 instanceof C0398p) {
                    throw ((C0398p) C8).f2983a;
                }
                w6 = AbstractC0406y.w(C8);
            }
        }
        A7.a aVar2 = A7.a.f58n;
        return w6;
    }
}
