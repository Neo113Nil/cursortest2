package O7;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: O7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0388m extends h0 implements InterfaceC0387l {
    public final Object U(InterfaceC5133d interfaceC5133d) {
        Object w9;
        while (true) {
            Object C7 = C();
            if (C7 instanceof V) {
                if (R(C7) >= 0) {
                    d0 d0Var = new d0(w8.a.f(interfaceC5133d), this);
                    d0Var.r();
                    d0Var.t(new C0380e(1, G(false, true, new I(2, d0Var))));
                    w9 = d0Var.q();
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    break;
                }
            } else {
                if (C7 instanceof C0391p) {
                    throw ((C0391p) C7).f2619a;
                }
                w9 = AbstractC0399y.w(C7);
            }
        }
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        return w9;
    }
}
