package com.anythink.expressad.e.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18307a = "a";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f18308b;

    /* renamed from: com.anythink.expressad.e.a.a$a, reason: collision with other inner class name */
    public static class C0117a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f18309a = new a(0);

        private C0117a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public static a a() {
        return C0117a.f18309a;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f18308b.containsKey(str)) {
                this.f18308b.remove(str);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
        }
    }

    private a() {
        this.f18308b = new ConcurrentHashMap<>();
    }

    public final void a(c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null || cVar == null) {
            return;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f18308b.containsKey(str)) {
                this.f18308b.remove(str);
            }
            this.f18308b.put(str, cVar);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
        }
    }

    public final c a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f18308b.containsKey(str)) {
                return this.f18308b.get(str);
            }
            c cVar = new c(dVar, dVar.L(), dVar.aa());
            this.f18308b.put(str, cVar);
            return cVar;
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
            return null;
        }
    }
}
