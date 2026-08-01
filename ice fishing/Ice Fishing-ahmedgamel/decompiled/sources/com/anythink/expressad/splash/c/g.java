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
    private static final String f20597a = "WebViewRenderManager";

    /* renamed from: b, reason: collision with root package name */
    private boolean f20598b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20599c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f20604a = new g(0);
    }

    public interface b {
        void a();

        void a(int i);

        void a(String str);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f20605a;

        /* renamed from: b, reason: collision with root package name */
        private String f20606b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f20607c;

        /* renamed from: d, reason: collision with root package name */
        private String f20608d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f20609e;

        /* renamed from: f, reason: collision with root package name */
        private int f20610f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f20611g;

        private boolean g() {
            return this.f20611g;
        }

        public final void a(boolean z3) {
            this.f20611g = z3;
        }

        public final String b() {
            return this.f20605a;
        }

        public final String c() {
            return this.f20606b;
        }

        public final com.anythink.expressad.foundation.d.d d() {
            return this.f20607c;
        }

        public final boolean e() {
            return this.f20609e;
        }

        public final int f() {
            return this.f20610f;
        }

        public final String a() {
            return this.f20608d;
        }

        public final void b(String str) {
            this.f20605a = str;
        }

        public final void c(String str) {
            this.f20606b = str;
        }

        public final void a(String str) {
            this.f20608d = str;
        }

        public final void b(boolean z3) {
            this.f20609e = z3;
        }

        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            this.f20607c = dVar;
        }

        public final void a(int i) {
            this.f20610f = i;
        }
    }

    public /* synthetic */ g(byte b9) {
        this();
    }

    public static /* synthetic */ boolean a(g gVar) {
        gVar.f20599c = true;
        return true;
    }

    private static g b() {
        return a.f20604a;
    }

    private g() {
        this.f20598b = false;
        this.f20599c = false;
    }

    public final void a() {
        this.f20598b = false;
        this.f20599c = false;
    }

    public final void a(final ATSplashView aTSplashView, c cVar, final b bVar) {
        String aa;
        if (aTSplashView != null) {
            String c9 = cVar.c();
            String b9 = cVar.b();
            final com.anythink.expressad.foundation.d.d d2 = cVar.d();
            String a9 = cVar.a();
            boolean e9 = cVar.e();
            int f3 = cVar.f();
            ATSplashWebview splashWebview = aTSplashView.getSplashWebview();
            if (splashWebview == null) {
                return;
            }
            SplashJSBridgeImpl splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), b9, c9);
            ArrayList arrayList = new ArrayList();
            arrayList.add(d2);
            splashJSBridgeImpl.setCampaignList(arrayList);
            splashJSBridgeImpl.setAllowSkip(e9 ? 1 : 0);
            splashJSBridgeImpl.setCountdownS(f3);
            aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
            if (TextUtils.isEmpty(d2.aa())) {
                aa = d2.ac();
            } else {
                aa = d2.aa();
            }
            String requestId = splashWebview.getRequestId();
            if (!TextUtils.isEmpty(requestId) && requestId.equals(aa) && (this.f20598b || this.f20599c)) {
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
                    if (!d2.t()) {
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
                        g.this.f20598b = true;
                        aTSplashView.setH5Ready(true);
                    } else {
                        g.this.f20598b = false;
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
