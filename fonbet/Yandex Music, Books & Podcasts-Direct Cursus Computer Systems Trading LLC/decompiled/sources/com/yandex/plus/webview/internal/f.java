package com.yandex.plus.webview.internal;

import android.view.View;
import android.webkit.WebView;
import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.r;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.core.h;
import defpackage.a4g;
import defpackage.btf;
import defpackage.gld;
import defpackage.jyr;
import defpackage.tf6;
import defpackage.w40;
import defpackage.x97;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class f extends h {
    public final WebViewContainer i;
    public final y j;
    public final com.yandex.plus.webview.api.security.a k;
    public final b l;
    public final com.yandex.plus.webview.internal.security.c m;
    public final tf6 n;
    public final jyr o;
    public final LinkedHashMap p;
    public com.yandex.plus.webview.internal.insets.b q;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a r;
    public final CopyOnWriteArraySet s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.yandex.plus.webview.internal.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(WebViewContainer webViewContainer, y yVar, com.yandex.plus.pay.ui.common.internal.web.a aVar, com.yandex.plus.core.network.ssl.a aVar2, m mVar, boolean z, kotlinx.coroutines.a aVar3, Function1 function1, com.yandex.plus.home.feature.webviews.internal.smart.h hVar, Function1 function12, Function2 function2, boolean z2, com.yandex.plus.webview.internal.security.b bVar, final a aVar4, com.yandex.plus.webview.internal.security.c cVar, com.yandex.plus.log.api.b bVar2) {
        super(r10, bVar2, aVar, mVar, function12, function2, function1, r2, hVar, r10, new Function2() { // from class: com.yandex.plus.webview.internal.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                WebView webView = (WebView) obj;
                String str = (String) obj2;
                switch (r2) {
                    case 0:
                        webView.getClass();
                        str.getClass();
                        aVar4.s(str);
                        break;
                    default:
                        webView.getClass();
                        str.getClass();
                        aVar4.b(str);
                        break;
                }
                return Unit.a;
            }
        }, aVar2, z, z2, 4);
        b bVar3 = new b();
        webViewContainer.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar2.getClass();
        View findViewById = webViewContainer.findViewById(R.id.plus_webview);
        findViewById.getClass();
        WebView webView = (WebView) findViewById;
        w40 w40Var = new w40(3, bVar3, b.class, "onStateChanged", "onStateChanged(Ljava/lang/String;Ljava/lang/String;Z)V", 0, 15);
        final int i = 0;
        ?? r10 = new Function2() { // from class: com.yandex.plus.webview.internal.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                WebView webView2 = (WebView) obj;
                String str = (String) obj2;
                switch (i) {
                    case 0:
                        webView2.getClass();
                        str.getClass();
                        aVar4.s(str);
                        break;
                    default:
                        webView2.getClass();
                        str.getClass();
                        aVar4.b(str);
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 1;
        this.i = webViewContainer;
        this.j = yVar;
        this.k = bVar;
        this.l = bVar3;
        this.m = cVar;
        this.n = gld.e(aVar3.plus(a4g.n()));
        this.o = btf.b(new com.yandex.plus.paymentsdk.api.d(8));
        this.p = new LinkedHashMap();
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar5 = new com.yandex.plus.home.plaque.plugin.internal.proxy.a(26);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        aVar5.b = copyOnWriteArraySet;
        this.r = aVar5;
        this.s = new CopyOnWriteArraySet();
        if (webViewContainer.isAttachedToWindow()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((com.yandex.plus.webview.api.contract.d) it.next()).getClass();
            }
        }
        webViewContainer.addOnAttachStateChangeListener(new r(7, this));
    }

    @Override // com.yandex.plus.webview.core.h, com.yandex.plus.webview.core.d
    public final void a() {
        Iterator it = ((CopyOnWriteArraySet) this.r.b).iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.webview.api.contract.d) it.next()).getClass();
        }
        super.a();
    }

    @Override // com.yandex.plus.webview.core.h, com.yandex.plus.webview.core.d
    public final void f() {
        x97.y(this.n, null, null, new e(this, null, 0), 3);
    }

    @Override // com.yandex.plus.webview.core.h, com.yandex.plus.webview.core.d
    public final void k() {
        x97.y(this.n, null, null, new e(this, null, 1), 3);
    }

    @Override // com.yandex.plus.webview.core.h, com.yandex.plus.webview.core.d
    public final void n(String str, Map map) {
        str.getClass();
        x97.y(this.n, null, null, new j(this, str, map, null, 28), 3);
    }

    @Override // com.yandex.plus.webview.core.h, com.yandex.plus.webview.core.d
    public final void onResume() {
        super.onResume();
        Iterator it = ((CopyOnWriteArraySet) this.r.b).iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.webview.api.contract.d) it.next()).getClass();
        }
    }
}
