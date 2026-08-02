package com.anythink.expressad.e.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19094a = "a";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f19095b;

    /* renamed from: com.anythink.expressad.e.a.a$a, reason: collision with other inner class name */
    public static class C0117a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f19096a = new a(0);

        private C0117a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    public static a a() {
        return C0117a.f19096a;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f19095b.containsKey(str)) {
                this.f19095b.remove(str);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.getMessage();
            }
        }
    }

    private a() {
        this.f19095b = new ConcurrentHashMap<>();
    }

    public final void a(c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null || cVar == null) {
            return;
        }
        try {
            String str = dVar.aa() + "_" + dVar.bh() + "_" + dVar.L();
            if (this.f19095b.containsKey(str)) {
                this.f19095b.remove(str);
            }
            this.f19095b.put(str, cVar);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
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
            if (this.f19095b.containsKey(str)) {
                return this.f19095b.get(str);
            }
            c cVar = new c(dVar, dVar.L(), dVar.aa());
            this.f19095b.put(str, cVar);
            return cVar;
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.getMessage();
            }
            return null;
        }
    }
}
