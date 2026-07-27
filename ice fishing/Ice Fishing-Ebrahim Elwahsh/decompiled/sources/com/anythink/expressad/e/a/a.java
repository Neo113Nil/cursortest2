package com.anythink.expressad.e.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18465a = "a";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f18466b;

    /* renamed from: com.anythink.expressad.e.a.a$a, reason: collision with other inner class name */
    public static class C0116a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f18467a = new a(0);

        private C0116a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public static a a() {
        return C0116a.f18467a;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f18466b.containsKey(str)) {
                this.f18466b.remove(str);
            }
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.getMessage();
            }
        }
    }

    private a() {
        this.f18466b = new ConcurrentHashMap<>();
    }

    public final void a(c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null || cVar == null) {
            return;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f18466b.containsKey(str)) {
                this.f18466b.remove(str);
            }
            this.f18466b.put(str, cVar);
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.getMessage();
            }
        }
    }

    public final c a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f18466b.containsKey(str)) {
                return this.f18466b.get(str);
            }
            c cVar = new c(dVar, dVar.L(), dVar.aa());
            this.f18466b.put(str, cVar);
            return cVar;
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.getMessage();
            }
            return null;
        }
    }
}
