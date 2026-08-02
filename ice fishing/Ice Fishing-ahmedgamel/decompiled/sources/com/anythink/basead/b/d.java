package com.anythink.basead.b;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6766a = "d";

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f6767c;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, com.anythink.basead.d.e> f6768b = new ConcurrentHashMap<>();

    private d() {
    }

    public static d a() {
        if (f6767c == null) {
            synchronized (d.class) {
                try {
                    if (f6767c == null) {
                        f6767c = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6767c;
    }

    public final void a(int i, String str, com.anythink.basead.d.e eVar) {
        this.f6768b.put(i + str, eVar);
    }

    public final com.anythink.basead.d.e a(int i, String str) {
        return this.f6768b.get(i + str);
    }
}
