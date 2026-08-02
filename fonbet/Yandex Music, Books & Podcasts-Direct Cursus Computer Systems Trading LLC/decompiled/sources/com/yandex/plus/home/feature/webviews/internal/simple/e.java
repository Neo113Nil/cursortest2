package com.yandex.plus.home.feature.webviews.internal.simple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.yandex.passport.data.network.l;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.q;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.b6e;
import defpackage.btf;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.r0w;
import defpackage.s9f;
import defpackage.x97;
import defpackage.yxm;
import defpackage.zne;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class e extends FrameLayout implements g, com.yandex.plus.home.feature.webviews.internal.container.c {
    public static final /* synthetic */ s9f[] s = {new yxm(e.class, "topSpacerView", "getTopSpacerView()Landroid/view/View;", 0), f1d.c(ern.a, e.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), new yxm(e.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new yxm(e.class, "progressBarLayout", "getProgressBarLayout()Landroid/view/ViewGroup;", 0), new yxm(e.class, "errorLayout", "getErrorLayout()Landroid/view/ViewGroup;", 0)};
    public final j a;
    public final com.yandex.plus.home.feature.webviews.internal.accessibility.b b;
    public final com.yandex.plus.resources.core.a c;
    public final com.yandex.plus.home.feature.webviews.internalapi.toolbar.a d;
    public final com.yandex.plus.home.api.webview.b e;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c f;
    public final com.yandex.plus.home.feature.webviews.internal.webview.j g;
    public final u h;
    public final e i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final com.yandex.plus.bdui.plus.content.controller.f k;
    public final com.yandex.plus.bdui.plus.content.controller.f l;
    public final com.yandex.plus.bdui.plus.content.controller.f m;
    public final com.yandex.plus.bdui.plus.content.controller.f n;
    public final jyr o;
    public final l p;
    public final jyr q;
    public final jyr r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @NotNull j jVar, @NotNull com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar, @NotNull com.yandex.plus.resources.core.a aVar, @NotNull com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar2, com.yandex.plus.home.api.webview.c cVar, @NotNull com.yandex.plus.home.api.webview.b bVar2, @NotNull com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar2, @NotNull com.yandex.plus.home.feature.webviews.internal.webview.j jVar2, @NotNull u uVar, @NotNull com.yandex.plus.home.feature.webviews.internal.uri.i iVar, @NotNull zne zneVar) {
        super(context);
        int i;
        context.getClass();
        jVar.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        cVar2.getClass();
        jVar2.getClass();
        uVar.getClass();
        iVar.getClass();
        zneVar.getClass();
        this.a = jVar;
        this.b = bVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = bVar2;
        this.f = cVar2;
        this.g = jVar2;
        this.h = uVar;
        this.i = this;
        this.j = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, 0));
        this.k = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, 1));
        this.l = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, 2));
        this.m = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, 3));
        this.n = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, 4));
        this.o = btf.b(new a(this, 0));
        this.p = new l(this);
        this.q = btf.b(new a(this, 1));
        this.r = btf.b(new a(this, 2));
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            i = R.layout.plus_sdk_webview_simple_card;
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            i = R.layout.plus_sdk_webview_simple_full;
        }
        r1.p(this, i, true);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "SimpleWebViewLayout.applyInsets(" + zneVar + ')', null);
        View topSpacerView = getTopSpacerView();
        ViewGroup.LayoutParams layoutParams = topSpacerView.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        layoutParams.height = zneVar.b;
        topSpacerView.setLayoutParams(layoutParams);
        ViewGroup root = getRoot();
        root.setPadding(zneVar.a, root.getPaddingTop(), zneVar.c, zneVar.d);
        bVar.b(getWebViewContainer().getWebView());
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.n.g(s[4]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.error.b getErrorViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.error.b) this.r.getValue();
    }

    private final ViewGroup getProgressBarLayout() {
        return (ViewGroup) this.m.g(s[3]);
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.k.g(s[1]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.toolbar.c getToolbarController() {
        return (com.yandex.plus.home.feature.webviews.internal.toolbar.c) this.o.getValue();
    }

    private final View getTopSpacerView() {
        return (View) this.j.g(s[0]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.l.g(s[2]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.simple.contract.c getWebViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.simple.contract.c) this.q.getValue();
    }

    public static Unit k(e eVar) {
        j jVar = eVar.a;
        boolean g = eVar.getWebViewController().g();
        jVar.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.b, "reloadUri() canGoBack=" + g, null);
        jVar.q.v();
        if (!g || jVar.w) {
            x97.y(jVar.l(), null, null, new h(jVar, continuation, 2), 3);
        } else {
            ((g) jVar.e).f();
        }
        return Unit.a;
    }

    public static com.yandex.plus.home.feature.webviews.internal.error.b m(e eVar) {
        return new com.yandex.plus.home.feature.webviews.internal.error.b(eVar.getErrorLayout(), eVar.e, eVar.f, new a(eVar, 3));
    }

    public static Unit n(e eVar) {
        com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar = eVar.b;
        WebView webView = eVar.getWebViewContainer().getWebView();
        bVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.accessibility.b.a(webView);
        return Unit.a;
    }

    public static com.yandex.plus.home.feature.webviews.internal.simple.contract.c o(e eVar) {
        com.yandex.plus.home.feature.webviews.internal.webview.j jVar = eVar.g;
        WebViewContainer webViewContainer = eVar.getWebViewContainer();
        j jVar2 = eVar.a;
        int i = 0;
        d dVar = new d(1, eVar.a, j.class, "interceptRequest", "interceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", 0, i);
        d dVar2 = new d(1, eVar.h, u.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", i, 1);
        q qVar = new q(2, eVar.h, u.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0, 28);
        q qVar2 = new q(2, eVar.a, j.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0, 29);
        d dVar3 = new d(1, eVar.getToolbarController(), com.yandex.plus.home.feature.webviews.internal.toolbar.c.class, "update", "update(Lcom/yandex/plus/home/feature/webviews/internalapi/toolbar/WebViewToolbarData;)V", 0, 2);
        com.yandex.plus.core.network.ssl.a aVar = jVar2.t;
        l lVar = eVar.p;
        r0w r0wVar = new r0w(27, eVar);
        jVar.getClass();
        webViewContainer.getClass();
        aVar.getClass();
        lVar.getClass();
        return new com.yandex.plus.home.feature.webviews.internal.simple.contract.c(jVar.a, webViewContainer, jVar2, dVar2, qVar, dVar, qVar2, r0wVar, dVar3, aVar, jVar.f, jVar.b, jVar.d, jVar.e, lVar, jVar.c, jVar.g, jVar.h);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void a() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onPause()");
        getWebViewController().a();
        this.a.d0();
        getWebViewController().setAudioMuted(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function0, oj] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // com.yandex.plus.home.feature.webviews.internal.simple.g
    public final void c(String str) {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String concat = "showError() message=".concat(str);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
        getWebViewController().k();
        WebViewContainer webViewContainer = getWebViewContainer();
        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a aVar = (com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.f;
        aVar.b(webViewContainer);
        aVar.b(getProgressBarLayout());
        getErrorViewController().b(getWebViewController().j(), true);
        com.yandex.plus.home.feature.webviews.internal.toolbar.c toolbarController = getToolbarController();
        String j = getWebViewController().j();
        boolean g = getWebViewController().g();
        String str2 = getToolbarController().f;
        j.getClass();
        toolbarController.getClass();
        WebViewToolbar webViewToolbar = toolbarController.a;
        if (webViewToolbar.getVisibility() == 0) {
            webViewToolbar.setTitle(str2);
            com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar2 = toolbarController.c;
            if (aVar2.d && g) {
                webViewToolbar.y();
                webViewToolbar.setOnStartIconClickListener(toolbarController.d);
            } else {
                webViewToolbar.w();
            }
            if (!aVar2.c) {
                webViewToolbar.v();
            } else {
                webViewToolbar.z();
                webViewToolbar.setOnEndIconClickListener(toolbarController.e);
            }
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.simple.g
    public final void d() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "clearHistory()");
        getWebViewController().d();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final boolean e() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onBackPressed()");
        return getWebViewController().c();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.simple.g
    public final void f() {
        com.yandex.plus.core.analytics.logging.e.b(com.yandex.plus.core.analytics.logging.b.b, "reload()");
        getWebViewController().f();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.simple.g
    public final void g() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "showWebViewContent()", null);
        WebViewContainer webViewContainer = getWebViewContainer();
        a aVar = new a(this, 4);
        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a aVar2 = (com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.f;
        aVar2.c(webViewContainer, aVar);
        aVar2.b(getProgressBarLayout());
        getErrorViewController().a(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    @NotNull
    public View getView() {
        return this.i;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.simple.g
    public final void h() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "showLoading()", null);
        WebViewContainer webViewContainer = getWebViewContainer();
        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar = this.f;
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) cVar).b(webViewContainer);
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) cVar).c(getProgressBarLayout(), new u6(25));
        getErrorViewController().a(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.simple.g
    public final void j(String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        String concat = "loadUri() url=".concat(str);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, concat, null);
        getWebViewController().n(str, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onAttachedToWindow()", null);
        j jVar = this.a;
        jVar.getClass();
        jVar.f(this);
        jVar.q.v();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "attachView()", null);
        x97.y(jVar.l(), null, null, new h(jVar, null, 0), 3);
        p();
        getWebViewController().setAudioMuted(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onDetachedFromWindow()");
        this.a.h();
        getWebViewController().setAudioMuted(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onResume() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onResume()");
        getWebViewController().onResume();
        this.a.f0();
        getWebViewController().setAudioMuted(false);
    }

    public final void p() {
        getToolbarController().a(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.q(getWebViewController()));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void r() {
        getTopSpacerView().setVisibility(4);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void t() {
        getTopSpacerView().setVisibility(0);
    }
}
