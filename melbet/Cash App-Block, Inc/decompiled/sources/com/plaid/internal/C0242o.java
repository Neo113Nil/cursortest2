package com.plaid.internal;

import java.util.concurrent.ExecutionException;

/* renamed from: com.plaid.internal.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0242o<R> {
    public static final C0323x0 g;
    public final C0314w0 a;
    public final C0296u0 b;
    public final C0302u6 c;
    public final C0278s0 d;
    public final C0284s6 e;
    public final A7 f;

    /* renamed from: com.plaid.internal.o$a */
    public static class a {
        public final InterfaceC0270r1 a;
        public final D0 b;

        public a(D0 d0, InterfaceC0270r1 interfaceC0270r1) {
            this.a = interfaceC0270r1;
            this.b = d0;
        }
    }

    static {
        W3 w3 = Z3.a;
        g = new C0323x0("auth");
    }

    public C0242o(A7 a7, C0314w0 c0314w0, C0296u0 c0296u0, C0302u6 c0302u6, C0278s0 c0278s0, C0284s6 c0284s6) {
        this.f = a7;
        this.a = c0314w0;
        this.b = c0296u0;
        this.c = c0302u6;
        this.d = c0278s0;
        this.e = c0284s6;
    }

    public static <I, O> O a(EnumC0223l7 enumC0223l7, InterfaceC0214k7<I, O> interfaceC0214k7, I i, C0251p c0251p) {
        try {
            a(enumC0223l7, c0251p);
            g.a(W3.INFO, "execute step: " + enumC0223l7, new Object[0]);
            return (O) interfaceC0214k7.a(i, c0251p).a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new r(enumC0223l7, e);
        } catch (ExecutionException e2) {
            throw new r(enumC0223l7, e2.getCause());
        } catch (Exception e3) {
            throw new r(enumC0223l7, e3);
        }
    }

    public static void a(EnumC0223l7 enumC0223l7, C0251p c0251p) {
        if (enumC0223l7 != EnumC0223l7.FINISH && c0251p.a) {
            throw new C0260q(T0.GENERIC_TIMEOUT);
        }
        c0251p.b = enumC0223l7;
    }
}
