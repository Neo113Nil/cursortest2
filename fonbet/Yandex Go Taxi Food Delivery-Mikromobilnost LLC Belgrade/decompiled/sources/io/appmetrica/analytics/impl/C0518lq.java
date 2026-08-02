package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.lq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0518lq {
    public final HashMap a;

    public C0518lq() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        C0345fq c0345fq = new C0345fq();
        C0374gq c0374gq = new C0374gq();
        C0403hq c0403hq = new C0403hq();
        C0431iq c0431iq = new C0431iq();
        hashMap.put(Fp.class, c0345fq);
        hashMap.put(F2.class, c0374gq);
        hashMap.put(Ph.class, c0403hq);
        hashMap.put(C0496l4.class, c0431iq);
    }

    public static InterfaceC0547mq a(Class cls) {
        return (InterfaceC0547mq) AbstractC0489kq.a.a.get(cls);
    }
}
