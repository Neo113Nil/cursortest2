package com.plaid.internal;

import com.plaid.internal.C0242o;
import com.plaid.internal.C0259p7;
import java.util.HashMap;

/* renamed from: com.plaid.internal.q7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0268q7 implements C0259p7.c<String> {
    public final /* synthetic */ C0251p a;
    public final /* synthetic */ C0259p7 b;

    public C0268q7(C0259p7 c0259p7, C0251p c0251p) {
        this.b = c0259p7;
        this.a = c0251p;
    }

    @Override // com.plaid.internal.C0259p7.c
    public final String call() {
        C0242o<R> c0242o = this.b.a;
        C0251p c0251p = this.a;
        InterfaceC0270r1 interfaceC0270r1 = (InterfaceC0270r1) C0242o.a(EnumC0223l7.PRE_CHECK, c0242o.a, new C0197j(c0242o), c0251p);
        c0242o.f.a(interfaceC0270r1);
        C0242o.a aVar = new C0242o.a((D0) C0242o.a(EnumC0223l7.DEVICE_DESCRIPTOR, c0242o.b, new C0206k(interfaceC0270r1), c0251p), interfaceC0270r1);
        D0 d0 = aVar.b;
        InterfaceC0270r1 interfaceC0270r12 = aVar.a;
        D0 a = this.b.d.a(d0);
        C0242o<R> c0242o2 = this.b.a;
        C0251p c0251p2 = this.a;
        c0242o2.getClass();
        try {
            C0323x0 c0323x0 = C0242o.g;
            W3 w3 = W3.INFO;
            c0323x0.a(w3, "device descriptor=" + a, new Object[0]);
            String str = (String) C0242o.a(EnumC0223l7.START, c0242o2.c, new C0215l(a), c0251p2);
            c0323x0.a(w3, "auth url=" + str, new Object[0]);
            if (a.b != null) {
                throw new r(EnumC0223l7.AUTHENTICATION);
            }
            HashMap a2 = E6.a(str);
            if (a2 != null) {
                c0323x0.a(w3, "use remote features: " + a2, new Object[0]);
                c0251p2.f = c0251p2.f.a(a2);
            }
            String str2 = (String) C0242o.a(EnumC0223l7.AUTHENTICATION, c0242o2.d, new C0224m(interfaceC0270r12, str), c0251p2);
            c0323x0.a(w3, "vfp=" + str2, new Object[0]);
            return str2;
        } catch (r e) {
            c0242o2.f.a();
            throw e;
        }
    }
}
