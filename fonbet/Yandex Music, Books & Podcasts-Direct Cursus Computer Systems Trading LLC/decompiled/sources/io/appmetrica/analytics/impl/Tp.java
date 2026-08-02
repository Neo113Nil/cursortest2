package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class Tp {
    public final HashMap a;

    public Tp() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        Np np = new Np();
        Op op = new Op();
        Pp pp = new Pp();
        Qp qp = new Qp();
        hashMap.put(C0501np.class, np);
        hashMap.put(F2.class, op);
        hashMap.put(C0838zh.class, pp);
        hashMap.put(C0307h4.class, qp);
    }

    public static Up a(Class cls) {
        return (Up) Sp.a.a.get(cls);
    }
}
