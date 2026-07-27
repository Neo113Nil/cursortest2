package com.anythink.basead.b;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5980a = "d";

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f5981c;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, com.anythink.basead.d.e> f5982b = new ConcurrentHashMap<>();

    private d() {
    }

    public static d a() {
        if (f5981c == null) {
            synchronized (d.class) {
                try {
                    if (f5981c == null) {
                        f5981c = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5981c;
    }

    public final void a(int i, String str, com.anythink.basead.d.e eVar) {
        this.f5982b.put(i + str, eVar);
    }

    public final com.anythink.basead.d.e a(int i, String str) {
        return this.f5982b.get(i + str);
    }
}
