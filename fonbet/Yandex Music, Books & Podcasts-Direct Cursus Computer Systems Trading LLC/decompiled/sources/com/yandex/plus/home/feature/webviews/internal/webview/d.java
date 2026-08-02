package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.home.feature.webviews.internal.stories.l;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.brr;
import defpackage.ezc;
import defpackage.jyr;
import defpackage.u75;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class d extends f {
    public final boolean d;
    public final WebViewContainer e;
    public final com.yandex.plus.home.feature.webviews.internal.bridge.c f;
    public final brr g;
    public final Function0 h;
    public final Function0 i;
    public final com.yandex.plus.webview.core.i j;
    public final ezc k;
    public final ezc l;
    public final Function1 m;
    public final Function1 n;
    public final ezc o;
    public final com.yandex.plus.core.network.ssl.a p;
    public final w q;
    public final boolean r;
    public final long s;
    public final kotlinx.coroutines.a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z, boolean z2, WebViewContainer webViewContainer, com.yandex.plus.home.feature.webviews.internal.bridge.c cVar, brr brrVar, Function0 function0, l lVar, com.yandex.plus.webview.core.i iVar, Function1 function1, Function2 function2, Function1 function12, com.yandex.plus.home.feature.webviews.internal.simple.d dVar, Function2 function22, com.yandex.plus.core.network.ssl.a aVar, w wVar, boolean z3, long j, kotlinx.coroutines.a aVar2, int i) {
        super(z, webViewContainer);
        lVar = (i & 64) != 0 ? null : lVar;
        Function1 aVar3 = (i & 2048) != 0 ? new com.yandex.plus.bdui.plus.webview.navigation.a(29) : dVar;
        cVar.getClass();
        function0.getClass();
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.d = z2;
        this.e = webViewContainer;
        this.f = cVar;
        this.g = brrVar;
        this.h = function0;
        this.i = lVar;
        this.j = iVar;
        this.k = (ezc) function1;
        this.l = (ezc) function2;
        this.m = function12;
        this.n = aVar3;
        this.o = (ezc) function22;
        this.p = aVar;
        this.q = wVar;
        this.r = z3;
        this.s = j;
        this.t = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ezc, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // com.yandex.plus.home.feature.webviews.internal.webview.f
    public final com.yandex.plus.webview.internal.f l() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "create new webview controller with WebViewControllerBuilder", null);
        com.yandex.plus.webview.api.c cVar = new com.yandex.plus.webview.api.c(this.e, com.yandex.plus.bdui.plus.analytics.b.h(CollectionsKt.g0(r(), u75.h(new com.yandex.plus.home.feature.webviews.internal.bridge.e(this.g, this.d), new com.yandex.plus.home.feature.webviews.internal.c(new c(this.h))))), this.p, this.r, this.t, com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.b));
        Function1 function1 = this.m;
        function1.getClass();
        cVar.g = function1;
        cVar.h = new com.yandex.plus.home.feature.webviews.internal.simple.contract.b((Function2) this.o);
        ?? r0 = this.k;
        r0.getClass();
        cVar.j = r0;
        ezc ezcVar = this.l;
        ezcVar.getClass();
        cVar.k = ezcVar;
        cVar.n = this.s;
        cVar.p = com.yandex.plus.webview.api.d.a;
        w wVar = this.q;
        wVar.getClass();
        cVar.l = wVar;
        cVar.m = false;
        return cVar.a();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [ezc, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ezc, kotlin.jvm.functions.Function2] */
    @Override // com.yandex.plus.home.feature.webviews.internal.webview.f
    public final com.yandex.plus.webview.core.d m() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "create old PlusWebViewController controller", null);
        return new com.yandex.plus.home.feature.webviews.internal.g(this.e.getWebView(), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r);
    }

    public abstract List r();

    public final void s(String str) {
        str.getClass();
        o().b(String.format("__homeApp.response(%s)", Arrays.copyOf(new Object[]{str}, 1)));
    }
}
