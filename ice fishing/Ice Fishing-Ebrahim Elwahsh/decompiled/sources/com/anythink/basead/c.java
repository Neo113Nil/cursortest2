package com.anythink.basead;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.anythink.basead.b.c.i;
import com.anythink.basead.j.f;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.ac;
import com.anythink.core.common.v.g;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f6202e;

    /* renamed from: a, reason: collision with root package name */
    long f6203a;

    /* renamed from: f, reason: collision with root package name */
    private Context f6207f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f6209h;
    private com.anythink.basead.b.a.b i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.basead.b.a.c f6210j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f6211k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Boolean f6212l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Boolean f6213m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f6214n;

    /* renamed from: d, reason: collision with root package name */
    private final String f6206d = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public boolean f6204b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6205c = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6208g = false;

    private c() {
    }

    private void i() {
        if (this.f6212l != null) {
            return;
        }
        if (this.f6213m == null) {
            com.anythink.core.d.b k6 = i.k(i.l());
            if (!k6.S()) {
                this.f6213m = Boolean.valueOf(k6.aS() == 1);
            }
        }
        if (this.f6213m == null || !this.f6213m.booleanValue()) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.c.3
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView;
                String unused = c.this.f6206d;
                try {
                    webView = new WebView(c.this.f6207f);
                } catch (Throwable unused2) {
                    webView = null;
                }
                if (webView != null) {
                    try {
                        webView.destroy();
                    } catch (Throwable unused3) {
                    }
                    c.this.f6212l = Boolean.TRUE;
                } else {
                    c.this.f6212l = Boolean.FALSE;
                }
                String unused4 = c.this.f6206d;
                Boolean unused5 = c.this.f6212l;
            }
        });
    }

    public final Activity d() {
        WeakReference<Activity> weakReference = this.f6211k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean e() {
        return this.f6209h;
    }

    public final Context f() {
        return this.f6207f;
    }

    public final boolean g() {
        if (this.f6213m != null && !this.f6213m.booleanValue()) {
            return true;
        }
        com.anythink.core.d.b k6 = i.k(i.l());
        if (k6.S()) {
            return true;
        }
        this.f6213m = Boolean.valueOf(k6.aS() == 1);
        if (!this.f6213m.booleanValue()) {
            return true;
        }
        i();
        if (this.f6212l != null) {
            return this.f6212l.booleanValue();
        }
        return true;
    }

    public final boolean h() {
        return this.f6214n;
    }

    public final void b() {
        if (f.a().b()) {
            ac.a().b(this.f6207f);
            ac.a().d(this.f6207f);
            if (ac.a().b(this.f6207f) || ac.a().d(this.f6207f)) {
                t.b();
                t.a(new Runnable() { // from class: com.anythink.basead.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ac.a().c(c.this.f6207f);
                        ac.a().e(c.this.f6207f);
                    }
                });
            }
        }
        g.a().b(this.f6207f);
        if (g.a().b(this.f6207f)) {
            t.b();
            t.a(new Runnable() { // from class: com.anythink.basead.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    g.a().c(c.this.f6207f);
                }
            });
        }
    }

    public final void c() {
        boolean z8 = !this.f6204b && this.f6205c;
        com.anythink.basead.b.a.c cVar = this.f6210j;
        if (cVar != null) {
            cVar.a(z8);
            this.f6210j = null;
        }
        this.f6205c = false;
        this.f6204b = false;
    }

    public static c a() {
        if (f6202e == null) {
            synchronized (c.class) {
                try {
                    if (f6202e == null) {
                        f6202e = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6202e;
    }

    public final synchronized void a(Context context) {
        try {
            if (this.f6208g) {
                return;
            }
            this.f6208g = true;
            this.f6207f = context.getApplicationContext();
            if (context instanceof Activity) {
                a((Activity) context);
            } else {
                a(t.b().N());
            }
            this.f6209h = t.b().W();
            this.f6214n = false;
            ((Application) this.f6207f).registerActivityLifecycleCallbacks(new com.anythink.basead.b.a());
            i();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(boolean z8) {
        if (!this.f6214n) {
            this.f6214n = true;
        }
        this.f6209h = z8;
        if (z8) {
            com.anythink.basead.b.a.b bVar = this.i;
            if (bVar != null) {
                bVar.a(this.f6203a);
                this.i = null;
                return;
            }
            return;
        }
        this.f6203a = System.currentTimeMillis();
    }

    public final void a(com.anythink.basead.b.a.b bVar) {
        this.i = bVar;
    }

    public final void a(com.anythink.basead.b.a.c cVar) {
        this.f6210j = cVar;
        this.f6204b = false;
    }

    public final void a(Activity activity) {
        if (activity != null) {
            this.f6211k = new WeakReference<>(activity);
        }
    }
}
