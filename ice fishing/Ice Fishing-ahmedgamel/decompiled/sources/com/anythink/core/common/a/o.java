package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q5.C4876a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile o f12989b;

    /* renamed from: f, reason: collision with root package name */
    private long f12994f;

    /* renamed from: a, reason: collision with root package name */
    final String f12990a = C4876a.PUSH_MINIFIED_BUTTONS_LIST;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f12993e = false;

    /* renamed from: g, reason: collision with root package name */
    private long f12995g = 0;

    /* renamed from: c, reason: collision with root package name */
    private q f12991c = q.a(com.anythink.core.common.e.e.a(t.b().g()));

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f12992d = new HashMap();

    /* renamed from: com.anythink.core.common.a.o$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f12997a;

        public AnonymousClass2(n nVar) {
            this.f12997a = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                File file = new File(this.f12997a.b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            o.this.f12991c.c(this.f12997a.a());
        }
    }

    private o() {
        this.f12994f = 209715200L;
        this.f12994f = t.b().d(4);
    }

    public final void e() {
        this.f12994f = t.b().d(4);
    }

    public final void b() {
        if (this.f12993e) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.o.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    o.this.f12993e = true;
                    new ArrayList();
                    o oVar = o.this;
                    oVar.f12995g = oVar.f12991c.a();
                    long unused = o.this.f12995g;
                    long unused2 = o.this.f12994f;
                    long unused3 = o.this.f12995g;
                    long unused4 = o.this.f12994f;
                    if (o.this.f12995g > o.this.f12994f) {
                        List<n> b9 = o.this.f12991c.b();
                        b9.size();
                        for (n nVar : b9) {
                            try {
                                File file = new File(nVar.b());
                                if (file.exists()) {
                                    file.delete();
                                }
                            } catch (Throwable unused5) {
                            }
                            try {
                                if (!TextUtils.isEmpty(nVar.a())) {
                                    String a9 = nVar.a();
                                    o.this.f12992d.remove(a9);
                                    com.anythink.core.common.res.b.c.a().b(a9);
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                } catch (Throwable unused7) {
                }
                o.this.f12993e = false;
            }
        }, 13);
    }

    public final long c() {
        return this.f12994f;
    }

    public final long d() {
        return this.f12995g;
    }

    public static o a() {
        if (f12989b == null) {
            synchronized (o.class) {
                try {
                    if (f12989b == null) {
                        f12989b = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12989b;
    }

    private synchronized int b(String str) {
        if (this.f12992d.containsKey(str) && this.f12992d.get(str) != null) {
            return this.f12992d.get(str).intValue();
        }
        n a9 = this.f12991c.a(str);
        if (a9 == null || a9.c() <= 0) {
            return 0;
        }
        File file = new File(a9.b());
        if (file.exists() && file.length() >= a9.e()) {
            this.f12992d.put(str, Integer.valueOf(a9.c()));
            this.f12991c.b(str);
            return a9.c();
        }
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass2(a9), 2);
        return 0;
    }

    private void a(n nVar) {
        if (nVar == null) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass2(nVar), 2);
    }

    public final void a(String str, String str2, long j6, long j9, int i, boolean z6) {
        this.f12992d.put(str, Integer.valueOf(i));
        if (z6) {
            a(str, str2, j6, j9, i);
        }
    }

    public final void a(final String str, final String str2, final long j6, final long j9, final int i) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.o.3
            @Override // java.lang.Runnable
            public final void run() {
                o.this.f12991c.a(str, str2, j6, j9, i);
            }
        }, 13);
    }

    public final n a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12991c.a(str);
    }

    public final synchronized boolean a(String str, int i) {
        return b(str) >= i;
    }
}
