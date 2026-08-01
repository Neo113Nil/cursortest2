package com.anythink.basead.webtemplet;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11525a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11526b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11527c = -999;

    /* renamed from: d, reason: collision with root package name */
    private static final String f11528d = "l";

    public interface a {
        void a();

        void a(com.anythink.basead.d.f fVar);
    }

    public static void a(final String str, final String str2, final WTWebView wTWebView, final a aVar, final w wVar, final x xVar, final int i, final Object obj) {
        if (wTWebView == null) {
            com.anythink.basead.d.f a9 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6171b, "wtWebView is null");
            a9.c();
            aVar.a(a9);
        } else {
            if (obj == null) {
                com.anythink.basead.d.f a10 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6171b, "h5 template not support this format");
                a10.c();
                aVar.a(a10);
            }
            t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    String unused = l.f11528d;
                    wTWebView.initData(wVar, xVar, i == 1);
                    wTWebView.setWebViewListener(new b() { // from class: com.anythink.basead.webtemplet.l.1.1

                        /* renamed from: a, reason: collision with root package name */
                        boolean f11537a = false;

                        @Override // com.anythink.basead.webtemplet.b, com.anythink.basead.webtemplet.c
                        public final void a(WebView webView) {
                            super.a(webView);
                            if (this.f11537a) {
                                return;
                            }
                            this.f11537a = true;
                            wTWebView.release();
                            com.anythink.basead.d.f a11 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6171b, "onRenderProcessGone");
                            String unused2 = l.f11528d;
                            String str3 = str2;
                            a11.c();
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(a11);
                            }
                        }

                        @Override // com.anythink.basead.webtemplet.b, com.anythink.basead.webtemplet.c
                        public final void b(WebView webView) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (i == 1) {
                                com.anythink.basead.b.c.d.a(str, wTWebView);
                            }
                            if (this.f11537a) {
                                return;
                            }
                            this.f11537a = true;
                            String unused2 = l.f11528d;
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            String str3 = str2;
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                        }

                        @Override // com.anythink.basead.webtemplet.b, com.anythink.basead.webtemplet.c
                        public final void a(WebView webView, int i6, String str3, String str4) {
                            com.anythink.basead.d.f a11;
                            if (this.f11537a) {
                                return;
                            }
                            this.f11537a = true;
                            wTWebView.release();
                            super.a(webView, i6, str3, str4);
                            if (i6 == -999) {
                                a11 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6189u, i6 + "_" + str3);
                            } else {
                                a11 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6171b, i6 + "_" + str3);
                            }
                            String unused2 = l.f11528d;
                            String str5 = str2;
                            a11.c();
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(a11);
                            }
                        }

                        @Override // com.anythink.basead.webtemplet.b, com.anythink.basead.webtemplet.c
                        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                            if (this.f11537a) {
                                return;
                            }
                            this.f11537a = true;
                            wTWebView.release();
                            super.a(webView, sslErrorHandler, sslError);
                            com.anythink.basead.d.f a11 = com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6171b, sslError != null ? sslError.toString() : "onReceivedSslError");
                            String unused2 = l.f11528d;
                            String str3 = str2;
                            a11.c();
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(a11);
                            }
                        }
                    });
                    Object obj2 = obj;
                    if (obj2 instanceof com.anythink.basead.webtemplet.adformat.e) {
                        ((com.anythink.basead.webtemplet.adformat.e) obj2).a(wVar, xVar);
                    }
                    wTWebView.setJsCommunicationObject(obj);
                    wTWebView.loadUrl(str2);
                }
            });
        }
    }
}
