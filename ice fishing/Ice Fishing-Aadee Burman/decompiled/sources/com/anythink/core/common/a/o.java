package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q5.C4927a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile o f12203b;

    /* renamed from: f, reason: collision with root package name */
    private long f12208f;

    /* renamed from: a, reason: collision with root package name */
    final String f12204a = C4927a.PUSH_MINIFIED_BUTTONS_LIST;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f12207e = false;

    /* renamed from: g, reason: collision with root package name */
    private long f12209g = 0;

    /* renamed from: c, reason: collision with root package name */
    private q f12205c = q.a(com.anythink.core.common.e.e.a(t.b().g()));

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f12206d = new HashMap();

    /* renamed from: com.anythink.core.common.a.o$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f12211a;

        public AnonymousClass2(n nVar) {
            this.f12211a = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                File file = new File(this.f12211a.b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            o.this.f12205c.c(this.f12211a.a());
        }
    }

    private o() {
        this.f12208f = 209715200L;
        this.f12208f = t.b().d(4);
    }

    public final void e() {
        this.f12208f = t.b().d(4);
    }

    public final void b() {
        if (this.f12207e) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.o.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    o.this.f12207e = true;
                    new ArrayList();
                    o oVar = o.this;
                    oVar.f12209g = oVar.f12205c.a();
                    long unused = o.this.f12209g;
                    long unused2 = o.this.f12208f;
                    long unused3 = o.this.f12209g;
                    long unused4 = o.this.f12208f;
                    if (o.this.f12209g > o.this.f12208f) {
                        List<n> b9 = o.this.f12205c.b();
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
                                    o.this.f12206d.remove(a9);
                                    com.anythink.core.common.res.b.c.a().b(a9);
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                } catch (Throwable unused7) {
                }
                o.this.f12207e = false;
            }
        }, 13);
    }

    public final long c() {
        return this.f12208f;
    }

    public final long d() {
        return this.f12209g;
    }

    public static o a() {
        if (f12203b == null) {
            synchronized (o.class) {
                try {
                    if (f12203b == null) {
                        f12203b = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12203b;
    }

    private synchronized int b(String str) {
        if (this.f12206d.containsKey(str) && this.f12206d.get(str) != null) {
            return this.f12206d.get(str).intValue();
        }
        n a9 = this.f12205c.a(str);
        if (a9 == null || a9.c() <= 0) {
            return 0;
        }
        File file = new File(a9.b());
        if (file.exists() && file.length() >= a9.e()) {
            this.f12206d.put(str, Integer.valueOf(a9.c()));
            this.f12205c.b(str);
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

    public final void a(String str, String str2, long j6, long j9, int i, boolean z3) {
        this.f12206d.put(str, Integer.valueOf(i));
        if (z3) {
            a(str, str2, j6, j9, i);
        }
    }

    public final void a(final String str, final String str2, final long j6, final long j9, final int i) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.a.o.3
            @Override // java.lang.Runnable
            public final void run() {
                o.this.f12205c.a(str, str2, j6, j9, i);
            }
        }, 13);
    }

    public final n a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12205c.a(str);
    }

    public final synchronized boolean a(String str, int i) {
        return b(str) >= i;
    }
}
