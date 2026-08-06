package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Pm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4942a;

    public Pm() {
        HashMap hashMap = new HashMap();
        this.f4942a = hashMap;
        Jm jm = new Jm();
        Km km = new Km();
        Lm lm = new Lm();
        Mm mm = new Mm();
        hashMap.put(C0518jm.class, jm);
        hashMap.put(T1.class, km);
        hashMap.put(C0357df.class, lm);
        hashMap.put(C0732s3.class, mm);
    }

    public static Qm a(Class cls) {
        return (Qm) Om.f4888a.f4942a.get(cls);
    }
}
