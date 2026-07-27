package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4298zp implements InterfaceC2477Ap {

    /* renamed from: a, reason: collision with root package name */
    public final Map f35612a;

    /* renamed from: b, reason: collision with root package name */
    public final C3157eg f35613b;

    /* renamed from: c, reason: collision with root package name */
    public final C2897Zk f35614c;

    public C4298zp(Map map, C3157eg c3157eg, C2897Zk c2897Zk) {
        this.f35612a = map;
        this.f35613b = c3157eg;
        this.f35614c = c2897Zk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477Ap
    public final J3.a c(C2687Ne c2687Ne) {
        this.f35614c.H(c2687Ne);
        AbstractC3837rD l9 = C3686oN.l(new C3275gp(3));
        for (String str : ((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.s9)).split(",")) {
            InterfaceC4279zN interfaceC4279zN = (InterfaceC4279zN) this.f35612a.get(str.trim());
            if (interfaceC4279zN != null) {
                l9 = C3686oN.v(l9, C3275gp.class, new C2936ad(7, interfaceC4279zN, c2687Ne), this.f35613b);
            }
        }
        l9.c(new MD(0, l9, new C3562m7(this)), AbstractC3212fg.f30745h);
        return l9;
    }
}
