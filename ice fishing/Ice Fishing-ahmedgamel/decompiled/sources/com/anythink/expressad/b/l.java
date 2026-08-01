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
    public static long f18243a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f18244d = "l";

    /* renamed from: p, reason: collision with root package name */
    private static final int f18245p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f18246q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final int f18247r = 0;

    /* renamed from: b, reason: collision with root package name */
    boolean f18248b;

    /* renamed from: c, reason: collision with root package name */
    boolean f18249c;

    /* renamed from: e, reason: collision with root package name */
    private int f18250e;

    /* renamed from: f, reason: collision with root package name */
    private int f18251f;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.f.a f18253h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private String f18254j;

    /* renamed from: k, reason: collision with root package name */
    private String f18255k;

    /* renamed from: l, reason: collision with root package name */
    private WebView f18256l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18257m;

    /* renamed from: n, reason: collision with root package name */
    private String f18258n;

    /* renamed from: o, reason: collision with root package name */
    private int f18259o;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18261t;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18260s = false;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f18262u = new Runnable() { // from class: com.anythink.expressad.b.l.4
        @Override // java.lang.Runnable
        public final void run() {
            l.n(l.this);
            l.this.f18259o = 1;
            String unused = l.f18244d;
            int unused2 = l.this.f18251f;
            l.p(l.this);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f18263v = new Runnable() { // from class: com.anythink.expressad.b.l.5
        @Override // java.lang.Runnable
        public final void run() {
            l.n(l.this);
            l.this.f18259o = 2;
            String unused = l.f18244d;
            int unused2 = l.this.f18250e;
            l.p(l.this);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Handler f18252g = new Handler(Looper.getMainLooper());

    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, String str3);

        boolean a();

        boolean a(String str);

        boolean b(String str);
    }

    public l() {
        this.f18250e = com.anythink.basead.exoplayer.d.f6762a;
        this.f18251f = 3000;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f18253h = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f18253h = com.anythink.expressad.f.b.c();
        }
        this.f18257m = this.f18253h.u();
        this.f18250e = (int) this.f18253h.q();
        this.f18251f = (int) this.f18253h.q();
    }

    private void c() {
        synchronized (f18244d) {
            try {
                f();
                this.f18256l.destroy();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.f18254j, this.f18258n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ boolean e(l lVar) {
        lVar.f18261t = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        j();
        h();
    }

    public static /* synthetic */ void m(l lVar) {
        lVar.j();
        lVar.f18252g.postDelayed(lVar.f18262u, lVar.f18251f);
    }

    public static /* synthetic */ boolean n(l lVar) {
        lVar.f18260s = true;
        return true;
    }

    public static /* synthetic */ void p(l lVar) {
        synchronized (f18244d) {
            try {
                lVar.f();
                lVar.f18256l.destroy();
                a aVar = lVar.i;
                if (aVar != null) {
                    aVar.a(lVar.f18254j, lVar.f18258n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void b() {
        synchronized (f18244d) {
            try {
                f();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.f18254j, this.f18258n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void d() {
        h();
        this.f18252g.postDelayed(this.f18263v, this.f18250e);
    }

    private void e() {
        j();
        this.f18252g.postDelayed(this.f18262u, this.f18251f);
    }

    private void g() {
        this.f18252g.postDelayed(this.f18263v, this.f18250e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f18252g.removeCallbacks(this.f18263v);
    }

    private void i() {
        this.f18252g.postDelayed(this.f18262u, this.f18251f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f18252g.removeCallbacks(this.f18262u);
    }

    public static /* synthetic */ void f(l lVar) {
        lVar.h();
        lVar.f18252g.postDelayed(lVar.f18263v, lVar.f18250e);
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        if (aVar != null) {
            this.f18255k = str4;
            this.f18254j = str3;
            this.i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public static /* synthetic */ void c(l lVar) {
        synchronized (f18244d) {
            try {
                lVar.f();
                a aVar = lVar.i;
                if (aVar != null) {
                    aVar.a(lVar.f18254j, lVar.f18258n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        if (aVar != null) {
            this.f18254j = str3;
            this.i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f18254j);
        } else {
            this.f18252g.post(new Runnable() { // from class: com.anythink.expressad.b.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar = l.this;
                    lVar.a(str, str2, context, lVar.f18254j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f18255k)) {
                this.f18256l.getSettings().setDefaultTextEncodingName(com.anythink.expressad.foundation.g.a.bR);
                this.f18251f = 2000;
                this.f18250e = 2000;
                this.f18256l.loadDataWithBaseURL(str3, this.f18255k, "*/*", com.anythink.expressad.foundation.g.a.bR, str3);
                return;
            }
            if (this.f18257m) {
                HashMap hashMap = new HashMap();
                if (this.f18256l.getUrl() != null) {
                    hashMap.put("Referer", this.f18256l.getUrl());
                }
                this.f18256l.loadUrl(str3, hashMap);
                return;
            }
            this.f18256l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.f18254j, th.getMessage(), this.f18258n);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private void a(Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f18256l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f18256l.getSettings().setCacheMode(2);
        this.f18256l.getSettings().setLoadsImagesAutomatically(false);
        this.f18256l.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.b.l.2
            private boolean a() {
                l lVar = l.this;
                return lVar.f18248b || lVar.f18249c;
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
                    if (l.this.f18261t) {
                        l.this.f18259o = 0;
                        l.c(l.this);
                        return;
                    }
                    l.this.f18249c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        l.this.f18248b = true;
                    }
                    synchronized (l.f18244d) {
                        try {
                            l.this.f18254j = str3;
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
                String unused = l.f18244d;
                webView2.getUrl();
                synchronized (l.f18244d) {
                    l.e(l.this);
                    l.this.f();
                    l.c(l.this);
                }
                if (l.this.i != null) {
                    l.this.i.a(webView2.getUrl(), str3, l.this.f18258n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    String unused = l.f18244d;
                    if (com.anythink.expressad.a.f17634r && sslErrorHandler != null) {
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
                    synchronized (l.f18244d) {
                        l.e(l.this);
                        l.this.f();
                        l.c(l.this);
                    }
                    if (l.this.i != null) {
                        l.this.i.a(webView2.getUrl(), "WebView render process crash.", l.this.f18258n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th) {
                    String unused = l.f18244d;
                    th.getMessage();
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (l.f18244d) {
                    try {
                        String unused = l.f18244d;
                        l lVar = l.this;
                        lVar.f18249c = true;
                        lVar.j();
                        if (l.this.f18261t) {
                            l.this.h();
                            l.c(l.this);
                            return true;
                        }
                        l.this.f18254j = str3;
                        if (l.this.i != null && l.this.i.b(str3)) {
                            l.e(l.this);
                            l.this.h();
                            l.c(l.this);
                            return true;
                        }
                        if (l.this.f18257m) {
                            HashMap hashMap = new HashMap();
                            if (l.this.f18256l.getUrl() != null) {
                                hashMap.put("Referer", l.this.f18256l.getUrl());
                            }
                            l.this.f18256l.loadUrl(str3, hashMap);
                        } else {
                            l.this.f18256l.loadUrl(str3);
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        this.f18256l.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.b.l.3
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
                        String unused = l.f18244d;
                        webView2.getUrl();
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!l.this.f18261t) {
                            l lVar = l.this;
                            if (!lVar.f18249c) {
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
