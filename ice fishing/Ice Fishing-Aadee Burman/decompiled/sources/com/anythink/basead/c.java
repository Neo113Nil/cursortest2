package com.anythink.basead;

import D.y;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.anythink.basead.j.f;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.ac;
import com.anythink.core.common.v.g;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f6045e;

    /* renamed from: a, reason: collision with root package name */
    long f6046a;

    /* renamed from: f, reason: collision with root package name */
    private Context f6050f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f6052h;
    private com.anythink.basead.b.a.b i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.basead.b.a.c f6053j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f6054k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Boolean f6055l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Boolean f6056m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f6057n;

    /* renamed from: d, reason: collision with root package name */
    private final String f6049d = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public boolean f6047b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6048c = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6051g = false;

    private c() {
    }

    private void i() {
        if (this.f6055l != null) {
            return;
        }
        if (this.f6056m == null) {
            com.anythink.core.d.b g4 = y.g(y.h());
            if (!g4.S()) {
                this.f6056m = Boolean.valueOf(g4.aS() == 1);
            }
        }
        if (this.f6056m == null || !this.f6056m.booleanValue()) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.c.3
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView;
                String unused = c.this.f6049d;
                try {
                    webView = new WebView(c.this.f6050f);
                } catch (Throwable unused2) {
                    webView = null;
                }
                if (webView != null) {
                    try {
                        webView.destroy();
                    } catch (Throwable unused3) {
                    }
                    c.this.f6055l = Boolean.TRUE;
                } else {
                    c.this.f6055l = Boolean.FALSE;
                }
                String unused4 = c.this.f6049d;
                Boolean unused5 = c.this.f6055l;
            }
        });
    }

    public final Activity d() {
        WeakReference<Activity> weakReference = this.f6054k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean e() {
        return this.f6052h;
    }

    public final Context f() {
        return this.f6050f;
    }

    public final boolean g() {
        if (this.f6056m != null && !this.f6056m.booleanValue()) {
            return true;
        }
        com.anythink.core.d.b g4 = y.g(y.h());
        if (g4.S()) {
            return true;
        }
        this.f6056m = Boolean.valueOf(g4.aS() == 1);
        if (!this.f6056m.booleanValue()) {
            return true;
        }
        i();
        if (this.f6055l != null) {
            return this.f6055l.booleanValue();
        }
        return true;
    }

    public final boolean h() {
        return this.f6057n;
    }

    public final void b() {
        if (f.a().b()) {
            ac.a().b(this.f6050f);
            ac.a().d(this.f6050f);
            if (ac.a().b(this.f6050f) || ac.a().d(this.f6050f)) {
                t.b();
                t.a(new Runnable() { // from class: com.anythink.basead.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ac.a().c(c.this.f6050f);
                        ac.a().e(c.this.f6050f);
                    }
                });
            }
        }
        g.a().b(this.f6050f);
        if (g.a().b(this.f6050f)) {
            t.b();
            t.a(new Runnable() { // from class: com.anythink.basead.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    g.a().c(c.this.f6050f);
                }
            });
        }
    }

    public final void c() {
        boolean z3 = !this.f6047b && this.f6048c;
        com.anythink.basead.b.a.c cVar = this.f6053j;
        if (cVar != null) {
            cVar.a(z3);
            this.f6053j = null;
        }
        this.f6048c = false;
        this.f6047b = false;
    }

    public static c a() {
        if (f6045e == null) {
            synchronized (c.class) {
                try {
                    if (f6045e == null) {
                        f6045e = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6045e;
    }

    public final synchronized void a(Context context) {
        try {
            if (this.f6051g) {
                return;
            }
            this.f6051g = true;
            this.f6050f = context.getApplicationContext();
            if (context instanceof Activity) {
                a((Activity) context);
            } else {
                a(t.b().N());
            }
            this.f6052h = t.b().W();
            this.f6057n = false;
            ((Application) this.f6050f).registerActivityLifecycleCallbacks(new com.anythink.basead.b.a());
            i();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(boolean z3) {
        if (!this.f6057n) {
            this.f6057n = true;
        }
        this.f6052h = z3;
        if (z3) {
            com.anythink.basead.b.a.b bVar = this.i;
            if (bVar != null) {
                bVar.a(this.f6046a);
                this.i = null;
                return;
            }
            return;
        }
        this.f6046a = System.currentTimeMillis();
    }

    public final void a(com.anythink.basead.b.a.b bVar) {
        this.i = bVar;
    }

    public final void a(com.anythink.basead.b.a.c cVar) {
        this.f6053j = cVar;
        this.f6047b = false;
    }

    public final void a(Activity activity) {
        if (activity != null) {
            this.f6054k = new WeakReference<>(activity);
        }
    }
}
