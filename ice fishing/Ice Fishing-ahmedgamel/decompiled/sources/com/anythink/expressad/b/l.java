package com.anythink.expressad.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static long f19030a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f19031d = "l";

    /* renamed from: p, reason: collision with root package name */
    private static final int f19032p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f19033q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final int f19034r = 0;

    /* renamed from: b, reason: collision with root package name */
    boolean f19035b;

    /* renamed from: c, reason: collision with root package name */
    boolean f19036c;

    /* renamed from: e, reason: collision with root package name */
    private int f19037e;

    /* renamed from: f, reason: collision with root package name */
    private int f19038f;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.f.a f19040h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private String f19041j;

    /* renamed from: k, reason: collision with root package name */
    private String f19042k;

    /* renamed from: l, reason: collision with root package name */
    private WebView f19043l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19044m;

    /* renamed from: n, reason: collision with root package name */
    private String f19045n;

    /* renamed from: o, reason: collision with root package name */
    private int f19046o;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19048t;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19047s = false;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f19049u = new Runnable() { // from class: com.anythink.expressad.b.l.4
        @Override // java.lang.Runnable
        public final void run() {
            l.n(l.this);
            l.this.f19046o = 1;
            String unused = l.f19031d;
            int unused2 = l.this.f19038f;
            l.p(l.this);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f19050v = new Runnable() { // from class: com.anythink.expressad.b.l.5
        @Override // java.lang.Runnable
        public final void run() {
            l.n(l.this);
            l.this.f19046o = 2;
            String unused = l.f19031d;
            int unused2 = l.this.f19037e;
            l.p(l.this);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Handler f19039g = new Handler(Looper.getMainLooper());

    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, String str3);

        boolean a();

        boolean a(String str);

        boolean b(String str);
    }

    public l() {
        this.f19037e = com.anythink.basead.exoplayer.d.f7548a;
        this.f19038f = 3000;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f19040h = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f19040h = com.anythink.expressad.f.b.c();
        }
        this.f19044m = this.f19040h.u();
        this.f19037e = (int) this.f19040h.q();
        this.f19038f = (int) this.f19040h.q();
    }

    private void c() {
        synchronized (f19031d) {
            try {
                f();
                this.f19043l.destroy();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.f19041j, this.f19045n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ boolean e(l lVar) {
        lVar.f19048t = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        j();
        h();
    }

    public static /* synthetic */ void m(l lVar) {
        lVar.j();
        lVar.f19039g.postDelayed(lVar.f19049u, lVar.f19038f);
    }

    public static /* synthetic */ boolean n(l lVar) {
        lVar.f19047s = true;
        return true;
    }

    public static /* synthetic */ void p(l lVar) {
        synchronized (f19031d) {
            try {
                lVar.f();
                lVar.f19043l.destroy();
                a aVar = lVar.i;
                if (aVar != null) {
                    aVar.a(lVar.f19041j, lVar.f19045n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void b() {
        synchronized (f19031d) {
            try {
                f();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.f19041j, this.f19045n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void d() {
        h();
        this.f19039g.postDelayed(this.f19050v, this.f19037e);
    }

    private void e() {
        j();
        this.f19039g.postDelayed(this.f19049u, this.f19038f);
    }

    private void g() {
        this.f19039g.postDelayed(this.f19050v, this.f19037e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f19039g.removeCallbacks(this.f19050v);
    }

    private void i() {
        this.f19039g.postDelayed(this.f19049u, this.f19038f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f19039g.removeCallbacks(this.f19049u);
    }

    public static /* synthetic */ void f(l lVar) {
        lVar.h();
        lVar.f19039g.postDelayed(lVar.f19050v, lVar.f19037e);
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        if (aVar != null) {
            this.f19042k = str4;
            this.f19041j = str3;
            this.i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public static /* synthetic */ void c(l lVar) {
        synchronized (f19031d) {
            try {
                lVar.f();
                a aVar = lVar.i;
                if (aVar != null) {
                    aVar.a(lVar.f19041j, lVar.f19045n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        if (aVar != null) {
            this.f19041j = str3;
            this.i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f19041j);
        } else {
            this.f19039g.post(new Runnable() { // from class: com.anythink.expressad.b.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar = l.this;
                    lVar.a(str, str2, context, lVar.f19041j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f19042k)) {
                this.f19043l.getSettings().setDefaultTextEncodingName(com.anythink.expressad.foundation.g.a.bR);
                this.f19038f = 2000;
                this.f19037e = 2000;
                this.f19043l.loadDataWithBaseURL(str3, this.f19042k, "*/*", com.anythink.expressad.foundation.g.a.bR, str3);
                return;
            }
            if (this.f19044m) {
                HashMap hashMap = new HashMap();
                if (this.f19043l.getUrl() != null) {
                    hashMap.put("Referer", this.f19043l.getUrl());
                }
                this.f19043l.loadUrl(str3, hashMap);
                return;
            }
            this.f19043l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.f19041j, th.getMessage(), this.f19045n);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private void a(Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f19043l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f19043l.getSettings().setCacheMode(2);
        this.f19043l.getSettings().setLoadsImagesAutomatically(false);
        this.f19043l.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.b.l.2
            private boolean a() {
                l lVar = l.this;
                return lVar.f19035b || lVar.f19036c;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (l.this.f19048t) {
                        l.this.f19046o = 0;
                        l.c(l.this);
                        return;
                    }
                    l.this.f19036c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        l.this.f19035b = true;
                    }
                    synchronized (l.f19031d) {
                        try {
                            l.this.f19041j = str3;
                            if (l.this.i == null || !l.this.i.a(str3)) {
                                l.f(l.this);
                            } else {
                                l.e(l.this);
                                l.c(l.this);
                            }
                        } finally {
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str3, String str4) {
                String unused = l.f19031d;
                webView2.getUrl();
                synchronized (l.f19031d) {
                    l.e(l.this);
                    l.this.f();
                    l.c(l.this);
                }
                if (l.this.i != null) {
                    l.this.i.a(webView2.getUrl(), str3, l.this.f19045n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    String unused = l.f19031d;
                    if (com.anythink.expressad.a.f18421r && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    TextUtils.isEmpty(str);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    synchronized (l.f19031d) {
                        l.e(l.this);
                        l.this.f();
                        l.c(l.this);
                    }
                    if (l.this.i != null) {
                        l.this.i.a(webView2.getUrl(), "WebView render process crash.", l.this.f19045n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th) {
                    String unused = l.f19031d;
                    th.getMessage();
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (l.f19031d) {
                    try {
                        String unused = l.f19031d;
                        l lVar = l.this;
                        lVar.f19036c = true;
                        lVar.j();
                        if (l.this.f19048t) {
                            l.this.h();
                            l.c(l.this);
                            return true;
                        }
                        l.this.f19041j = str3;
                        if (l.this.i != null && l.this.i.b(str3)) {
                            l.e(l.this);
                            l.this.h();
                            l.c(l.this);
                            return true;
                        }
                        if (l.this.f19044m) {
                            HashMap hashMap = new HashMap();
                            if (l.this.f19043l.getUrl() != null) {
                                hashMap.put("Referer", l.this.f19043l.getUrl());
                            }
                            l.this.f19043l.loadUrl(str3, hashMap);
                        } else {
                            l.this.f19043l.loadUrl(str3);
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        this.f19043l.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.b.l.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    try {
                        String unused = l.f19031d;
                        webView2.getUrl();
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!l.this.f19048t) {
                            l lVar = l.this;
                            if (!lVar.f19036c) {
                                l.m(lVar);
                            }
                        }
                        if (l.this.i != null) {
                            a unused2 = l.this.i;
                            webView2.getUrl();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
        });
    }
}
