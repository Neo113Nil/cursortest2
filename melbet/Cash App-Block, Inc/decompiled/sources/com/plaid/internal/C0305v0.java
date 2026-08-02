package com.plaid.internal;

/* renamed from: com.plaid.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0305v0 {
    public final C0220l4 a;
    public final EnumC0202j4 b;
    public final C0287t0 c;

    public C0305v0(C0220l4 c0220l4, EnumC0202j4 enumC0202j4, C0250o7 c0250o7, C0287t0 c0287t0) {
        this.a = c0220l4;
        this.b = enumC0202j4;
        this.c = c0287t0;
    }

    public final C0098b a() {
        if (this.a.a()) {
            throw new C0260q(T0.PRE_CHECK_AIRPLANE_MODE_ENABLED);
        }
        C0175g4 a = this.a.a(this.b);
        if (a == null) {
            throw new C0260q(T0.PRE_CHECK_NO_CELLULAR_RADIO);
        }
        try {
            C0098b c0098b = new C0098b(a);
            c0098b.a.c = 10000;
            c0098b.b.c = 10000;
            if (this.c.a(c0098b)) {
                return c0098b;
            }
            throw new C0260q(T0.PRE_CHECK_NO_CELLULAR_CONNECTION);
        } catch (C0260q | RuntimeException e) {
            if (!a.d) {
                a.d = true;
                a.b.run();
            }
            throw e;
        }
    }
}
