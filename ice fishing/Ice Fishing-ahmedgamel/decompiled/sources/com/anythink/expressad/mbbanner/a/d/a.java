package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.d.t;
import com.anythink.expressad.mbbanner.a.b.e;
import com.anythink.expressad.mbbanner.a.c.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20672a = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f20673h;

    /* renamed from: b, reason: collision with root package name */
    private Context f20674b = t.b().g();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.e.a f20675c = new com.anythink.expressad.mbbanner.a.e.a();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, e> f20676d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f20677e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Handler> f20678f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f20679g = new ConcurrentHashMap();

    private a() {
    }

    private e b(String str) {
        if (this.f20676d.containsKey(str)) {
            return this.f20676d.get(str);
        }
        String f2 = com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(f2, str);
        if (c9 == null) {
            c9 = com.anythink.expressad.f.c.c(str);
        }
        e eVar = new e(str, "", c9.t());
        this.f20676d.put(str, eVar);
        return eVar;
    }

    public static a a() {
        if (f20673h == null) {
            synchronized (a.class) {
                try {
                    if (f20673h == null) {
                        f20673h = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20673h;
    }

    public final void a(String str, String str2, com.anythink.expressad.foundation.d.e eVar, com.anythink.expressad.mbbanner.a.c.b bVar) {
        e eVar2;
        Boolean bool;
        synchronized (a()) {
            try {
                if (this.f20674b == null) {
                    com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19789y);
                    cVar.c(str);
                    cVar.b(str2);
                    this.f20675c.a(bVar, cVar);
                    return;
                }
                if (eVar != null && bVar != null) {
                    Map<String, Boolean> map = this.f20677e;
                    if (map != null && map.containsKey(str2) && (bool = this.f20677e.get(str2)) != null && bool.booleanValue()) {
                        com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19780p, "Current unit is loading!");
                        cVar2.c(str);
                        cVar2.b(str2);
                        this.f20675c.a(bVar, cVar2);
                        return;
                    }
                    this.f20677e.put(str2, Boolean.TRUE);
                    if (this.f20676d.containsKey(str2)) {
                        eVar2 = this.f20676d.get(str2);
                    } else {
                        String f2 = com.anythink.expressad.foundation.b.a.c().f();
                        com.anythink.expressad.f.b.a();
                        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(f2, str2);
                        if (c9 == null) {
                            c9 = com.anythink.expressad.f.c.c(str2);
                        }
                        e eVar3 = new e(str2, "", c9.t());
                        this.f20676d.put(str2, eVar3);
                        eVar2 = eVar3;
                    }
                    new b(this.f20674b, eVar2, bVar, this.f20675c).a(str2, eVar, new d() { // from class: com.anythink.expressad.mbbanner.a.d.a.1
                        @Override // com.anythink.expressad.mbbanner.a.c.d
                        public final void a(String str3) {
                            synchronized (a.a()) {
                                a.this.f20677e.put(str3, Boolean.FALSE);
                            }
                        }
                    });
                    return;
                }
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19767b);
                cVar3.c(str);
                cVar3.b(str2);
                this.f20675c.a(bVar, cVar3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Map<String, e> map = this.f20676d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f20677e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f20678f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f20678f.clear();
        }
        Map<String, Integer> map4 = this.f20679g;
        if (map4 != null) {
            map4.clear();
        }
    }

    public final void a(String str) {
        if (this.f20678f.containsKey(str)) {
            Handler handler = this.f20678f.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f20678f.remove(str);
        }
    }

    public final void a(int i, String str) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        int intValue = this.f20679g.containsKey(str) ? this.f20679g.get(str).intValue() : 0;
        if (i == 1) {
            if (this.f20678f.containsKey(str) && (handler = this.f20678f.get(str)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f20679g.put(str, Integer.valueOf(i));
            return;
        }
        if (i == 2) {
            if (intValue == 1) {
                if (this.f20678f.containsKey(str) && (handler2 = this.f20678f.get(str)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f20679g.put(str, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (i == 3) {
            if (intValue == 2 || intValue == 4) {
                this.f20679g.put(str, 1);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        if (intValue == 0) {
            this.f20679g.put(str, 0);
            return;
        }
        if (this.f20678f.containsKey(str) && (handler3 = this.f20678f.get(str)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f20679g.put(str, Integer.valueOf(i));
    }
}
