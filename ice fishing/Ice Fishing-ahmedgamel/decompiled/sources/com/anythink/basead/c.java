package com.anythink.basead;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.j.f;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.ac;
import com.anythink.core.common.v.g;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f6831e;

    /* renamed from: a, reason: collision with root package name */
    long f6832a;

    /* renamed from: f, reason: collision with root package name */
    private Context f6836f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f6838h;
    private com.anythink.basead.b.a.b i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.basead.b.a.c f6839j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f6840k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Boolean f6841l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Boolean f6842m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f6843n;

    /* renamed from: d, reason: collision with root package name */
    private final String f6835d = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public boolean f6833b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6834c = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6837g = false;

    private c() {
    }

    private void i() {
        if (this.f6841l != null) {
            return;
        }
        if (this.f6842m == null) {
            com.anythink.core.d.b k9 = k.k(k.l());
            if (!k9.S()) {
                this.f6842m = Boolean.valueOf(k9.aS() == 1);
            }
        }
        if (this.f6842m == null || !this.f6842m.booleanValue()) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.c.3
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView;
                String unused = c.this.f6835d;
                try {
                    webView = new WebView(c.this.f6836f);
                } catch (Throwable unused2) {
                    webView = null;
                }
                if (webView != null) {
                    try {
                        webView.destroy();
                    } catch (Throwable unused3) {
                    }
                    c.this.f6841l = Boolean.TRUE;
                } else {
                    c.this.f6841l = Boolean.FALSE;
                }
                String unused4 = c.this.f6835d;
                Boolean unused5 = c.this.f6841l;
            }
        });
    }

    public final Activity d() {
        WeakReference<Activity> weakReference = this.f6840k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean e() {
        return this.f6838h;
    }

    public final Context f() {
        return this.f6836f;
    }

    public final boolean g() {
        if (this.f6842m != null && !this.f6842m.booleanValue()) {
            return true;
        }
        com.anythink.core.d.b k9 = k.k(k.l());
        if (k9.S()) {
            return true;
        }
        this.f6842m = Boolean.valueOf(k9.aS() == 1);
        if (!this.f6842m.booleanValue()) {
            return true;
        }
        i();
        if (this.f6841l != null) {
            return this.f6841l.booleanValue();
        }
        return true;
    }

    public final boolean h() {
        return this.f6843n;
    }

    public final void b() {
        if (f.a().b()) {
            ac.a().b(this.f6836f);
            ac.a().d(this.f6836f);
            if (ac.a().b(this.f6836f) || ac.a().d(this.f6836f)) {
                t.b();
                t.a(new Runnable() { // from class: com.anythink.basead.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ac.a().c(c.this.f6836f);
                        ac.a().e(c.this.f6836f);
                    }
                });
            }
        }
        g.a().b(this.f6836f);
        if (g.a().b(this.f6836f)) {
            t.b();
            t.a(new Runnable() { // from class: com.anythink.basead.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    g.a().c(c.this.f6836f);
                }
            });
        }
    }

    public final void c() {
        boolean z6 = !this.f6833b && this.f6834c;
        com.anythink.basead.b.a.c cVar = this.f6839j;
        if (cVar != null) {
            cVar.a(z6);
            this.f6839j = null;
        }
        this.f6834c = false;
        this.f6833b = false;
    }

    public static c a() {
        if (f6831e == null) {
            synchronized (c.class) {
                try {
                    if (f6831e == null) {
                        f6831e = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6831e;
    }

    public final synchronized void a(Context context) {
        try {
            if (this.f6837g) {
                return;
            }
            this.f6837g = true;
            this.f6836f = context.getApplicationContext();
            if (context instanceof Activity) {
                a((Activity) context);
            } else {
                a(t.b().N());
            }
            this.f6838h = t.b().W();
            this.f6843n = false;
            ((Application) this.f6836f).registerActivityLifecycleCallbacks(new com.anythink.basead.b.a());
            i();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(boolean z6) {
        if (!this.f6843n) {
            this.f6843n = true;
        }
        this.f6838h = z6;
        if (z6) {
            com.anythink.basead.b.a.b bVar = this.i;
            if (bVar != null) {
                bVar.a(this.f6832a);
                this.i = null;
                return;
            }
            return;
        }
        this.f6832a = System.currentTimeMillis();
    }

    public final void a(com.anythink.basead.b.a.b bVar) {
        this.i = bVar;
    }

    public final void a(com.anythink.basead.b.a.c cVar) {
        this.f6839j = cVar;
        this.f6833b = false;
    }

    public final void a(Activity activity) {
        if (activity != null) {
            this.f6840k = new WeakReference<>(activity);
        }
    }
}
