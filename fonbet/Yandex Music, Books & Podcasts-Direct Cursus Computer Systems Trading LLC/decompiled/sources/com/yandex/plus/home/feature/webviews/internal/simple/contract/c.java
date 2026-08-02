package com.yandex.plus.home.feature.webviews.internal.simple.contract;

import android.webkit.WebView;
import com.yandex.passport.data.network.l;
import com.yandex.plus.bdui.q;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.home.feature.webviews.internal.simple.d;
import com.yandex.plus.home.feature.webviews.internal.uri.y;
import com.yandex.plus.home.feature.webviews.internal.webview.f;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.core.h;
import com.yandex.plus.webview.core.i;
import defpackage.jyr;
import defpackage.olu;
import defpackage.r0w;
import defpackage.t75;

/* loaded from: classes5.dex */
public final class c extends f {
    public final WebViewContainer d;
    public final i e;
    public final d f;
    public final q g;
    public final d h;
    public final q i;
    public final r0w j;
    public final d k;
    public final com.yandex.plus.core.network.ssl.a l;
    public final y m;
    public final long n;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a o;
    public final com.yandex.plus.home.feature.webviews.internalapi.analytics.a p;
    public final l q;
    public final String r;
    public final com.yandex.plus.log.api.b s;
    public final kotlinx.coroutines.a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, WebViewContainer webViewContainer, i iVar, d dVar, q qVar, d dVar2, q qVar2, r0w r0wVar, d dVar3, com.yandex.plus.core.network.ssl.a aVar, y yVar, long j, com.yandex.plus.home.analytics.diagnostic.webview.a aVar2, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar3, l lVar, String str, com.yandex.plus.log.api.b bVar, kotlinx.coroutines.a aVar4) {
        super(z, webViewContainer);
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        bVar.getClass();
        aVar4.getClass();
        this.d = webViewContainer;
        this.e = iVar;
        this.f = dVar;
        this.g = qVar;
        this.h = dVar2;
        this.i = qVar2;
        this.j = r0wVar;
        this.k = dVar3;
        this.l = aVar;
        this.m = yVar;
        this.n = j;
        this.o = aVar2;
        this.p = aVar3;
        this.q = lVar;
        this.r = str;
        this.s = bVar;
        this.t = aVar4;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.f
    public final com.yandex.plus.webview.internal.f l() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.s;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "SimpleWebViewControllerDelegate", "create new simple webview controller with WebViewControllerBuilder");
        }
        jyr jyrVar = e.a;
        com.yandex.plus.core.analytics.logging.d a = e.a(com.yandex.plus.core.analytics.logging.b.b);
        com.yandex.plus.webview.api.c cVar = new com.yandex.plus.webview.api.c(this.d, com.yandex.plus.bdui.plus.analytics.b.h(t75.c(new a(this.q, this.s, this.o, this.p, this.r))), this.l, true, this.t, a);
        d dVar = this.h;
        dVar.getClass();
        cVar.g = dVar;
        cVar.h = new b(this.i);
        d dVar2 = this.f;
        dVar2.getClass();
        cVar.j = dVar2;
        q qVar = this.g;
        qVar.getClass();
        cVar.k = qVar;
        cVar.n = this.n;
        cVar.p = com.yandex.plus.webview.api.e.a;
        y yVar = this.m;
        yVar.getClass();
        cVar.l = yVar;
        cVar.m = false;
        return cVar.a();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.f
    public final com.yandex.plus.webview.core.d m() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.s;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "SimpleWebViewControllerDelegate", "create old simple WebViewControllerImpl controller");
        }
        WebView webView = this.d.getWebView();
        jyr jyrVar = e.a;
        return new h(webView, e.a(com.yandex.plus.core.analytics.logging.b.b), this.e, null, this.f, this.g, this.h, new olu(11, this), this.i, null, this.j, this.l, true, false, 1044);
    }
}
