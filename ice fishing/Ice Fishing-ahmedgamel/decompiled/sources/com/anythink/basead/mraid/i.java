package com.anythink.basead.mraid;

import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.io.File;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static String f10430a = "i";

    public interface a {
        void a();

        void a(com.anythink.basead.d.f fVar);
    }

    public static String a(x xVar, w wVar) {
        w wVar2;
        if (!TextUtils.isEmpty(wVar.p())) {
            if (com.anythink.basead.j.f.a().a(wVar, xVar)) {
                wVar2 = wVar;
                com.anythink.core.common.u.e.a(xVar, wVar2, com.anythink.basead.j.f.a().c(), "1", false, "1", "can not inject omsdk js into offer_url");
            } else {
                wVar2 = wVar;
            }
            return wVar2.p();
        }
        if (TextUtils.isEmpty(wVar.o())) {
            return "";
        }
        File b9 = com.anythink.core.common.res.d.a(t.b().g()).b(xVar, wVar);
        if (b9 == null) {
            Log.e(f10430a, "loadMraidResource: html no exists: ");
            return com.anythink.core.common.res.d.a(t.b().g()).a(com.anythink.basead.j.f.a().a(wVar.o(), wVar, xVar), xVar, wVar);
        }
        Log.e(f10430a, "loadMraidResource: html exists: " + b9.toURI().toString());
        return b9.toURI().toString();
    }

    public static void a(final String str, final String str2, final MraidWebView mraidWebView, final a aVar, final w wVar, final x xVar, final int i, final boolean z6) {
        if (mraidWebView == null) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.mraid.i.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.u.e.a(x.this, wVar, i, z6);
                d dVar = new d();
                k kVar = new k(str2);
                kVar.a(new b() { // from class: com.anythink.basead.mraid.i.1.1

                    /* renamed from: b, reason: collision with root package name */
                    boolean f10439b = false;

                    @Override // com.anythink.basead.mraid.b, com.anythink.core.express.web.c
                    public final void onPageFinished(WebView webView, String str3) {
                        if (this.f10439b) {
                            return;
                        }
                        this.f10439b = true;
                        if (com.anythink.core.common.res.d.f17002a.equals(str3)) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            String str4 = str2;
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6969o, com.anythink.basead.d.g.f6945O));
                                return;
                            }
                            return;
                        }
                        f.a();
                        com.anythink.core.express.d.a.a(webView);
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        MraidWebView mraidWebView2 = mraidWebView;
                        if (mraidWebView2 != null) {
                            com.anythink.basead.b.c.d.a(str, mraidWebView2);
                        }
                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                        String str5 = str2;
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                    }

                    @Override // com.anythink.basead.mraid.b, com.anythink.core.express.web.c
                    public final void onReceivedError(WebView webView, int i4, String str3, String str4) {
                        if (this.f10439b) {
                            return;
                        }
                        this.f10439b = true;
                        super.onReceivedError(webView, i4, str3, str4);
                        com.anythink.basead.d.f a9 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6957b, i4 + "_" + str3);
                        String str5 = str2;
                        a9.c();
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(a9);
                        }
                    }

                    @Override // com.anythink.basead.mraid.b, com.anythink.core.express.web.c
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (this.f10439b) {
                            return;
                        }
                        this.f10439b = true;
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                        com.anythink.basead.d.f a9 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6957b, sslError != null ? sslError.toString() : "onReceivedSslError");
                        String str3 = str2;
                        a9.c();
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(a9);
                        }
                    }
                });
                mraidWebView.setWebViewClient(kVar);
                mraidWebView.setObject(dVar);
                mraidWebView.loadUrl(str2);
            }
        });
    }
}
