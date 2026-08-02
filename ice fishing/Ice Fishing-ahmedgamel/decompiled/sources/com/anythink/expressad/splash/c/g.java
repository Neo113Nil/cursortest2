package com.anythink.expressad.splash.c;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21384a = "WebViewRenderManager";

    /* renamed from: b, reason: collision with root package name */
    private boolean f21385b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21386c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f21391a = new g(0);
    }

    public interface b {
        void a();

        void a(int i);

        void a(String str);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f21392a;

        /* renamed from: b, reason: collision with root package name */
        private String f21393b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f21394c;

        /* renamed from: d, reason: collision with root package name */
        private String f21395d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f21396e;

        /* renamed from: f, reason: collision with root package name */
        private int f21397f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21398g;

        private boolean g() {
            return this.f21398g;
        }

        public final void a(boolean z6) {
            this.f21398g = z6;
        }

        public final String b() {
            return this.f21392a;
        }

        public final String c() {
            return this.f21393b;
        }

        public final com.anythink.expressad.foundation.d.d d() {
            return this.f21394c;
        }

        public final boolean e() {
            return this.f21396e;
        }

        public final int f() {
            return this.f21397f;
        }

        public final String a() {
            return this.f21395d;
        }

        public final void b(String str) {
            this.f21392a = str;
        }

        public final void c(String str) {
            this.f21393b = str;
        }

        public final void a(String str) {
            this.f21395d = str;
        }

        public final void b(boolean z6) {
            this.f21396e = z6;
        }

        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            this.f21394c = dVar;
        }

        public final void a(int i) {
            this.f21397f = i;
        }
    }

    public /* synthetic */ g(byte b9) {
        this();
    }

    public static /* synthetic */ boolean a(g gVar) {
        gVar.f21386c = true;
        return true;
    }

    private static g b() {
        return a.f21391a;
    }

    private g() {
        this.f21385b = false;
        this.f21386c = false;
    }

    public final void a() {
        this.f21385b = false;
        this.f21386c = false;
    }

    public final void a(final ATSplashView aTSplashView, c cVar, final b bVar) {
        String aa;
        if (aTSplashView != null) {
            String c9 = cVar.c();
            String b9 = cVar.b();
            final com.anythink.expressad.foundation.d.d d9 = cVar.d();
            String a9 = cVar.a();
            boolean e9 = cVar.e();
            int f2 = cVar.f();
            ATSplashWebview splashWebview = aTSplashView.getSplashWebview();
            if (splashWebview == null) {
                return;
            }
            SplashJSBridgeImpl splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), b9, c9);
            ArrayList arrayList = new ArrayList();
            arrayList.add(d9);
            splashJSBridgeImpl.setCampaignList(arrayList);
            splashJSBridgeImpl.setAllowSkip(e9 ? 1 : 0);
            splashJSBridgeImpl.setCountdownS(f2);
            aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
            if (TextUtils.isEmpty(d9.aa())) {
                aa = d9.ac();
            } else {
                aa = d9.aa();
            }
            String requestId = splashWebview.getRequestId();
            if (!TextUtils.isEmpty(requestId) && requestId.equals(aa) && (this.f21385b || this.f21386c)) {
                aTSplashView.setH5Ready(true);
                if (bVar != null) {
                    bVar.a(1);
                    return;
                }
                return;
            }
            a();
            splashWebview.setRequestId(aa);
            System.currentTimeMillis();
            splashWebview.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.splash.c.g.1
                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                    g.a(g.this);
                    if (!d9.t()) {
                        aTSplashView.setH5Ready(true);
                    }
                    SplashJsUtils.fireOnJSBridgeConnected(webView);
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(str);
                    }
                    g.this.a();
                    aTSplashView.setH5Ready(false);
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(sslError.toString());
                    }
                    g.this.a();
                    aTSplashView.setH5Ready(false);
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void readyState(WebView webView, int i) {
                    super.readyState(webView, i);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(i);
                    }
                    if (i == 1) {
                        g.this.f21385b = true;
                        aTSplashView.setH5Ready(true);
                    } else {
                        g.this.f21385b = false;
                        aTSplashView.setH5Ready(false);
                    }
                }
            });
            if (!splashWebview.isDestroyed()) {
                splashWebview.loadUrl(a9);
            } else {
                aTSplashView.setH5Ready(false);
            }
        }
    }
}
