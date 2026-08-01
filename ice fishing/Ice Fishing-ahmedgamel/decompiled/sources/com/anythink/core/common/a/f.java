package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static volatile f f12155d;

    /* renamed from: b, reason: collision with root package name */
    long f12157b;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.core.common.e.b f12159e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, h> f12160f;

    /* renamed from: a, reason: collision with root package name */
    final String f12156a = f.class.getName();

    /* renamed from: c, reason: collision with root package name */
    Object f12158c = new Object();

    /* renamed from: com.anythink.core.common.a.f$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (f.this.f12158c) {
                try {
                    f.this.b();
                    List<g> a9 = f.this.f12159e.a();
                    if (a9 != null) {
                        for (int i = 0; i < a9.size(); i++) {
                            g gVar = a9.get(i);
                            String a10 = gVar.a();
                            if (!TextUtils.isEmpty(a10)) {
                                h hVar = (h) f.this.f12160f.get(a10);
                                if (hVar == null) {
                                    hVar = new h();
                                    f.this.f12160f.put(a10, hVar);
                                }
                                hVar.a(gVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private f() {
        this.f12157b = 0L;
        if (t.b().g() != null) {
            this.f12159e = com.anythink.core.common.e.b.a(com.anythink.core.common.e.e.a(t.b().g()));
            this.f12160f = new ConcurrentHashMap();
            this.f12157b = f();
            t.b();
            t.c(new AnonymousClass1());
        }
    }

    private static void c() {
    }

    private void d() {
        this.f12157b = f();
        t.b();
        t.c(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        long f3 = f();
        if (this.f12157b != f3) {
            this.f12160f.clear();
            this.f12157b = f3;
        }
    }

    private static long f() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static f a() {
        if (f12155d == null) {
            synchronized (f.class) {
                try {
                    if (f12155d == null) {
                        f12155d = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12155d;
    }

    public final void b(final String str, final w wVar) {
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.f.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (f.this.f12158c) {
                    try {
                        f.this.e();
                        h hVar = (h) f.this.f12160f.get(str);
                        if (hVar == null) {
                            hVar = new h();
                            f.this.f12160f.put(str, hVar);
                        }
                        w wVar2 = wVar;
                        if (wVar2 instanceof r) {
                            hVar.b(((r) wVar2).aD());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f.a(f.this, 6, str, wVar);
            }
        });
    }

    public final void b() {
        this.f12159e.b();
    }

    public final void a(final String str, final w wVar) {
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.f.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (f.this.f12158c) {
                    try {
                        f.this.e();
                        h hVar = (h) f.this.f12160f.get(str);
                        if (hVar == null) {
                            hVar = new h();
                            f.this.f12160f.put(str, hVar);
                        }
                        hVar.a(((r) wVar).aD());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f.a(f.this, 4, str, wVar);
            }
        });
    }

    public final void a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        synchronized (this.f12158c) {
            try {
                e();
                h hVar = this.f12160f.get(str);
                if (hVar != null) {
                    hVar.a(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(int i, String str, w wVar) {
        if (TextUtils.isEmpty(str) || !(wVar instanceof r)) {
            return;
        }
        g gVar = new g();
        gVar.a(str);
        gVar.b(((r) wVar).aD());
        gVar.c(wVar.v());
        gVar.a(i);
        gVar.d("");
        this.f12159e.a(gVar);
    }

    public static /* synthetic */ void a(f fVar, int i, String str, w wVar) {
        if (TextUtils.isEmpty(str) || !(wVar instanceof r)) {
            return;
        }
        g gVar = new g();
        gVar.a(str);
        gVar.b(((r) wVar).aD());
        gVar.c(wVar.v());
        gVar.a(i);
        gVar.d("");
        fVar.f12159e.a(gVar);
    }
}
