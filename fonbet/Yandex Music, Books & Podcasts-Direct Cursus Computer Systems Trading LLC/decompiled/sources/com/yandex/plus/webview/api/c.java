package com.yandex.plus.webview.api;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.yandex.plus.home.feature.webviews.internal.smart.h;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.webview.core.i;
import com.yandex.plus.webview.internal.contract.impl.loading.k;
import com.yandex.plus.webview.internal.contract.impl.loading.n;
import defpackage.b6e;
import defpackage.b85;
import defpackage.c5b;
import defpackage.ezc;
import defpackage.t75;
import defpackage.v75;
import defpackage.xpi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public final WebViewContainer a;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a b;
    public final com.yandex.plus.core.network.ssl.a c;
    public final boolean d;
    public final kotlinx.coroutines.a e;
    public final com.yandex.plus.log.api.b f;
    public Function1 g;
    public com.yandex.plus.webview.api.redirect.a h;
    public boolean i;
    public Function1 j;
    public ezc k;
    public com.yandex.plus.webview.api.request.b l;
    public boolean m;
    public long n;
    public n o;
    public g p;

    public c(WebViewContainer webViewContainer, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.core.network.ssl.a aVar2, boolean z, kotlinx.coroutines.a aVar3, com.yandex.plus.log.api.b bVar) {
        webViewContainer.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar.getClass();
        this.a = webViewContainer;
        this.b = aVar;
        this.c = aVar2;
        this.d = z;
        this.e = aVar3;
        this.f = bVar;
        this.i = true;
        this.m = true;
        this.n = 10000L;
        this.p = d.a;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [ezc, kotlin.jvm.functions.Function2] */
    public final com.yandex.plus.webview.internal.f a() {
        Collection collection;
        int i;
        com.yandex.plus.webview.internal.container.a aVar;
        com.yandex.plus.webview.internal.container.a aVar2;
        k kVar = new k(this.n, this.o, this.p, this.e);
        List list = (List) this.b.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.yandex.plus.webview.api.contract.c) {
                arrayList.add(obj);
            }
        }
        com.yandex.plus.webview.api.contract.c cVar = (com.yandex.plus.webview.api.contract.c) CollectionsKt.Z(arrayList);
        if (cVar != null) {
            WebViewContainer webViewContainer = this.a;
            WebView webView = webViewContainer.getWebView();
            Context context = webViewContainer.getWebView().getContext();
            context.getClass();
            webView.setBackgroundColor(cVar.e(context));
        }
        ArrayList<com.yandex.plus.webview.api.contract.d> h0 = CollectionsKt.h0(list, kVar);
        com.yandex.passport.legacy.lx.f fVar = new com.yandex.passport.legacy.lx.f(h0);
        Object obj2 = this.l;
        if (obj2 == null) {
            obj2 = new com.yandex.plus.webview.internal.request.a();
        }
        y yVar = new y(fVar, obj2);
        com.yandex.plus.pay.ui.common.internal.web.a aVar3 = new com.yandex.plus.pay.ui.common.internal.web.a((i[]) b85.C(h0, i.class).toArray(new i[0]));
        m mVar = new m(23, fVar);
        Function1 function1 = this.g;
        if (this.i) {
            Object obj3 = this.h;
            if (obj3 == null) {
                obj3 = new com.yandex.plus.webview.internal.redirect.c();
            }
            collection = t75.c(obj3);
        } else {
            collection = c5b.a;
        }
        Collection collection2 = collection;
        ArrayList C = b85.C(h0, com.yandex.plus.webview.api.security.a.class);
        ArrayList arrayList2 = new ArrayList(v75.o(C, 10));
        Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.yandex.plus.webview.internal.redirect.d((com.yandex.plus.webview.api.security.a) it.next()));
        }
        h hVar = new h(2, new com.yandex.plus.webview.internal.redirect.a(CollectionsKt.g0(CollectionsKt.g0(collection2, arrayList2), b85.C(h0, com.yandex.plus.webview.api.redirect.a.class))), com.yandex.plus.webview.internal.redirect.a.class, "handleLoadResource", "handleLoadResource(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0, 5);
        com.yandex.plus.webview.internal.a aVar4 = new com.yandex.plus.webview.internal.a();
        Iterator it2 = b85.C(h0, a.class).iterator();
        while (it2.hasNext()) {
            a aVar5 = (a) it2.next();
            aVar5.getClass();
            aVar4.a.add(aVar5);
        }
        Function1 function12 = this.j;
        ?? r15 = this.k;
        boolean z = this.m;
        ArrayList C2 = b85.C(fVar.a, com.yandex.plus.webview.api.security.a.class);
        com.yandex.plus.webview.internal.security.a[] aVarArr = com.yandex.plus.webview.internal.security.a.a;
        com.yandex.plus.webview.internal.security.b bVar = new com.yandex.plus.webview.internal.security.b(C2);
        com.yandex.plus.webview.internal.security.c cVar2 = new com.yandex.plus.webview.internal.security.c();
        Iterator it3 = b85.C(h0, com.yandex.plus.webview.api.security.b.class).iterator();
        while (it3.hasNext()) {
            com.yandex.plus.webview.api.security.b bVar2 = (com.yandex.plus.webview.api.security.b) it3.next();
            bVar2.getClass();
            cVar2.a.add(bVar2);
            aVar4 = aVar4;
        }
        final com.yandex.plus.webview.internal.f fVar2 = new com.yandex.plus.webview.internal.f(this.a, yVar, aVar3, this.c, mVar, this.d, this.e, function1, hVar, function12, r15, z, bVar, aVar4, cVar2, this.f);
        Iterator it4 = b85.C(h0, com.yandex.plus.webview.api.container.a.class).iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            WebViewContainer webViewContainer2 = fVar2.i;
            if (!hasNext) {
                Iterator it5 = b85.C(h0, com.yandex.plus.webview.internal.insets.c.class).iterator();
                while (it5.hasNext()) {
                    com.yandex.plus.webview.internal.insets.c cVar3 = (com.yandex.plus.webview.internal.insets.c) it5.next();
                    com.yandex.plus.webview.internal.insets.b bVar3 = fVar2.q;
                    if (bVar3 == null) {
                        bVar3 = new com.yandex.plus.webview.internal.insets.b(webViewContainer2);
                        fVar2.q = bVar3;
                    }
                    cVar3.m(bVar3);
                }
                k kVar2 = (k) CollectionsKt.firstOrNull(b85.C(h0, k.class));
                if (kVar2 != null) {
                    Iterator it6 = b85.C(h0, com.yandex.plus.webview.api.contract.i.class).iterator();
                    while (it6.hasNext()) {
                        com.yandex.plus.webview.api.contract.i iVar = (com.yandex.plus.webview.api.contract.i) it6.next();
                        iVar.getClass();
                        kVar2.f.add(iVar);
                    }
                }
                for (com.yandex.plus.webview.api.contract.d dVar : h0) {
                    dVar.getClass();
                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar6 = fVar2.r;
                    aVar6.getClass();
                    ((CopyOnWriteArraySet) aVar6.b).add(dVar);
                    fVar2.s.add(dVar);
                    dVar.t(fVar2, fVar);
                }
                return fVar2;
            }
            com.yandex.plus.webview.api.container.a aVar7 = (com.yandex.plus.webview.api.container.a) it4.next();
            for (com.yandex.plus.webview.api.container.b bVar4 : aVar7.n()) {
                bVar4.getClass();
                LinkedHashMap linkedHashMap = fVar2.p;
                if (linkedHashMap.containsKey(bVar4)) {
                    Object obj4 = linkedHashMap.get(bVar4);
                    obj4.getClass();
                    aVar2 = (com.yandex.plus.webview.internal.container.a) obj4;
                } else {
                    int ordinal = bVar4.ordinal();
                    if (ordinal == 0) {
                        i = R.id.plus_webview_toolbar_container;
                    } else if (ordinal == 1) {
                        i = R.id.plus_webview_footer_container;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        i = R.id.plus_webview_full_size_container;
                    }
                    View findViewById = webViewContainer2.findViewById(i);
                    findViewById.getClass();
                    if (bVar4 != com.yandex.plus.webview.api.container.b.a) {
                        aVar = new com.yandex.plus.webview.internal.container.a();
                    } else {
                        com.yandex.plus.webview.internal.g gVar = new com.yandex.plus.webview.internal.g() { // from class: com.yandex.plus.webview.internal.d
                            @Override // com.yandex.plus.webview.internal.g
                            public final void a(String str, String str2, boolean z2) {
                                str.getClass();
                                ((xpi) f.this.o.getValue()).a(new com.yandex.plus.webview.api.container.toolbar.a(str, str2, z2));
                            }
                        };
                        com.yandex.plus.webview.internal.b bVar5 = fVar2.l;
                        bVar5.getClass();
                        bVar5.a.add(gVar);
                        ((xpi) fVar2.o.getValue()).getClass();
                        aVar = new com.yandex.plus.webview.internal.container.toolbar.a();
                    }
                    linkedHashMap.put(bVar4, aVar);
                    aVar2 = aVar;
                }
                aVar7.j(bVar4, aVar2);
            }
        }
    }
}
