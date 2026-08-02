package com.yandex.plus.home.feature.webviews.internal.stories;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.z0;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.btf;
import defpackage.dkn;
import defpackage.ern;
import defpackage.evj;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.jbb;
import defpackage.jyr;
import defpackage.laq;
import defpackage.oi3;
import defpackage.s9f;
import defpackage.tah;
import defpackage.u0q;
import defpackage.ub7;
import defpackage.v4w;
import defpackage.v75;
import defpackage.wxm;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.y0q;
import defpackage.yxm;
import defpackage.zne;
import defpackage.zsd;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class p extends LinearLayout implements c, com.yandex.plus.home.feature.webviews.internal.container.c {
    public static final /* synthetic */ s9f[] C = {new yxm(p.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), f1d.c(ern.a, p.class, "storiesLoading", "getStoriesLoading()Landroid/view/ViewGroup;", 0), new yxm(p.class, "errorLayout", "getErrorLayout()Landroid/view/ViewGroup;", 0), new yxm(p.class, "nativePayLayout", "getNativePayLayout()Landroid/view/ViewGroup;", 0), new yxm(p.class, "hostPayContainer", "getHostPayContainer()Landroid/view/ViewGroup;", 0), new yxm(p.class, "acqSdkButtonSectionContainer", "getAcqSdkButtonSectionContainer()Landroid/view/ViewGroup;", 0)};
    public final jyr A;
    public final jyr B;
    public final k a;
    public final com.yandex.plus.home.feature.webviews.internal.accessibility.b b;
    public final com.yandex.plus.ui.core.theme.a c;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.pay.c d;
    public final com.yandex.plus.resources.core.a e;
    public final com.yandex.plus.home.api.webview.b f;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c g;
    public final com.yandex.plus.home.feature.webviews.internal.stories.contract.d h;
    public final boolean i;
    public final u j;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a k;
    public final p l;
    public final x0q m;
    public final dkn n;
    public final com.yandex.plus.bdui.plus.content.controller.f o;
    public final com.yandex.plus.bdui.plus.content.controller.f p;
    public final com.yandex.plus.bdui.plus.content.controller.f q;
    public final com.yandex.plus.bdui.plus.content.controller.f r;
    public final com.yandex.plus.bdui.plus.content.controller.f s;
    public final com.yandex.plus.bdui.plus.content.controller.f t;
    public String u;
    public final n v;
    public final n w;
    public final jyr x;
    public final jyr y;
    public final jyr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, @NotNull k kVar, @NotNull com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar, boolean z, @NotNull com.yandex.plus.ui.core.theme.a aVar, @NotNull com.yandex.plus.home.feature.webviews.internal.purchase.pay.c cVar, @NotNull com.yandex.plus.resources.core.a aVar2, @NotNull com.yandex.plus.home.api.webview.b bVar2, @NotNull com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar2, @NotNull com.yandex.plus.core.strings.a aVar3, @NotNull zne zneVar, @NotNull com.yandex.plus.home.feature.webviews.internal.stories.contract.d dVar, boolean z2, @NotNull u uVar, @NotNull com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a aVar4) {
        super(context);
        context.getClass();
        kVar.getClass();
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        cVar2.getClass();
        aVar3.getClass();
        zneVar.getClass();
        dVar.getClass();
        uVar.getClass();
        aVar4.getClass();
        this.a = kVar;
        this.b = bVar;
        this.c = aVar;
        this.d = cVar;
        this.e = aVar2;
        this.f = bVar2;
        this.g = cVar2;
        this.h = dVar;
        this.i = z2;
        this.j = uVar;
        this.k = aVar4;
        this.l = this;
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.m = b;
        this.n = new dkn(b);
        this.o = new com.yandex.plus.bdui.plus.content.controller.f(new o(this, 0));
        this.p = new com.yandex.plus.bdui.plus.content.controller.f(new o(this, 1));
        this.q = new com.yandex.plus.bdui.plus.content.controller.f(new o(this, 2));
        this.r = new com.yandex.plus.bdui.plus.content.controller.f(new o(this, 3));
        this.s = new com.yandex.plus.bdui.plus.content.controller.f(new o(this, 4));
        this.t = new com.yandex.plus.bdui.plus.content.controller.f(new o(this, 5));
        this.v = new n(this);
        this.w = new n(this);
        this.x = btf.b(new l(this, 0));
        this.y = btf.b(new l(this, 1));
        this.z = btf.b(new com.yandex.plus.bdui.content.b(21, this, aVar3));
        this.A = btf.b(new l(this, 2));
        this.B = btf.b(new l(this, 3));
        com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar3, "init()", null);
        r1.p(this, R.layout.plus_sdk_web_view_stories, true);
        setNestedScrollEnabled(z);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "WebStoriesView.applyInsets(" + zneVar + ')', null);
        ViewGroup storiesLoading = getStoriesLoading();
        int i = zneVar.a;
        int i2 = zneVar.b;
        int i3 = zneVar.c;
        int i4 = zneVar.d;
        storiesLoading.setPadding(i, i2, i3, i4);
        getErrorLayout().setPadding(i, i2, i3, i4);
        ViewGroup nativePayLayout = getNativePayLayout();
        nativePayLayout.setPadding(i, nativePayLayout.getPaddingTop(), i3, i4);
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.setPadding(i, hostPayContainer.getPaddingTop(), i3, i4);
        ViewGroup acqSdkButtonSectionContainer = getAcqSdkButtonSectionContainer();
        acqSdkButtonSectionContainer.setPadding(i, acqSdkButtonSectionContainer.getPaddingTop(), i3, i4);
        setLayerType(2, null);
        bVar.b(getWebViewContainer().getWebView());
    }

    public static com.yandex.plus.home.feature.webviews.internal.purchase.pay.g A(p pVar) {
        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.g(pVar.getHostPayContainer());
    }

    public static com.yandex.plus.home.feature.webviews.internal.error.b B(p pVar) {
        return new com.yandex.plus.home.feature.webviews.internal.error.b(pVar.getErrorLayout(), pVar.f, pVar.g, new i(0, pVar.a, k.class, "onRetryClick", "onRetryClick()V", 0, 2));
    }

    private final ViewGroup getAcqSdkButtonSectionContainer() {
        return (ViewGroup) this.t.g(C[5]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.b getAcqSdkButtonSectionContainerViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.b) this.y.getValue();
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.q.g(C[2]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.error.b getErrorViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.error.b) this.B.getValue();
    }

    private final com.yandex.plus.home.feature.webviews.internal.purchase.pay.g getHostPayAnimationController() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) this.A.getValue();
    }

    private final ViewGroup getHostPayContainer() {
        return (ViewGroup) this.s.g(C[4]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.purchase.pay.f getNativePayButtonViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.pay.f) this.z.getValue();
    }

    private final ViewGroup getNativePayLayout() {
        return (ViewGroup) this.r.g(C[3]);
    }

    private final ViewGroup getStoriesLoading() {
        return (ViewGroup) this.p.g(C[1]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.o.g(C[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.plus.home.feature.webviews.internal.stories.contract.c getWebViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.stories.contract.c) this.x.getValue();
    }

    private final void setNestedScrollEnabled(boolean z) {
        getWebViewController().b.getWebView().setNestedScrollingEnabled(z);
    }

    public static void w(p pVar) {
        pVar.getStoriesLoading().setAlpha(1.0f);
        pVar.getStoriesLoading().setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ezc, kotlin.jvm.functions.Function0] */
    public static com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c x(p pVar) {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a aVar = pVar.k;
        ViewGroup acqSdkButtonSectionContainer = pVar.getAcqSdkButtonSectionContainer();
        s sVar = (s) aVar;
        sVar.getClass();
        acqSdkButtonSectionContainer.getClass();
        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c(acqSdkButtonSectionContainer, (ezc) sVar.d, (com.yandex.plus.bdui.plus.content.controller.f) sVar.b, (com.yandex.plus.acquisition.adapter.internal.controller.b) sVar.c, (wxm) sVar.e, (com.yandex.passport.internal.ui.bouncer.model.middleware.o) sVar.a, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) sVar.f, (y) sVar.g);
    }

    public static com.yandex.plus.home.feature.webviews.internal.stories.contract.c y(p pVar) {
        com.yandex.plus.home.feature.webviews.internal.stories.contract.d dVar = pVar.h;
        WebViewContainer webViewContainer = pVar.getWebViewContainer();
        l lVar = new l(pVar, 4);
        k kVar = pVar.a;
        com.yandex.plus.home.feature.webviews.internal.simple.d dVar2 = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, pVar.j, u.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0, 19);
        com.yandex.plus.home.feature.webviews.internal.smart.h hVar = new com.yandex.plus.home.feature.webviews.internal.smart.h(2, pVar.j, u.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0, 2);
        m mVar = new m(0, pVar);
        k kVar2 = pVar.a;
        com.yandex.plus.home.feature.webviews.internal.smart.h hVar2 = new com.yandex.plus.home.feature.webviews.internal.smart.h(2, kVar2, k.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0, 3);
        com.yandex.plus.core.network.ssl.a aVar = kVar2.Z;
        n nVar = pVar.v;
        n nVar2 = pVar.w;
        dVar.getClass();
        webViewContainer.getClass();
        kVar.getClass();
        aVar.getClass();
        nVar.getClass();
        nVar2.getClass();
        boolean z = dVar.a;
        boolean z2 = dVar.b;
        com.yandex.plus.home.feature.webviews.internal.f fVar = dVar.f;
        Function0 function0 = dVar.g;
        w wVar = dVar.e;
        long j = dVar.c;
        com.yandex.plus.home.feature.webviews.internal.stories.contract.b bVar = dVar.d;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar2 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        return new com.yandex.plus.home.feature.webviews.internal.stories.contract.c(z, z2, webViewContainer, kVar, fVar, function0, lVar, kVar, dVar2, hVar, mVar, hVar2, aVar, wVar, j, nVar, nVar2, bVar, dVar.h);
    }

    public static com.yandex.plus.home.feature.webviews.internal.purchase.pay.f z(p pVar, com.yandex.plus.core.strings.a aVar) {
        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.f(pVar.c, pVar.getNativePayLayout(), pVar.a, pVar.d, pVar.e, aVar);
    }

    public final void D() {
        WebView webView = getWebViewContainer().getWebView();
        this.b.getClass();
        com.yandex.plus.home.feature.webviews.internal.accessibility.b.a(webView);
    }

    public final void E() {
        getWebViewController().setAudioMuted(true);
    }

    public final void F(boolean z, b1 b1Var, z0 z0Var) {
        b1Var.getClass();
        setNestedScrollEnabled(z);
        k kVar = this.a;
        kVar.getClass();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.b, "WebStories setStorySelected: isSelected = " + z + ", controlType = " + z0Var + ", type = " + b1Var, null);
        if (z0Var != null) {
            if ((z ? z0Var : null) != null) {
                evj evjVar = kVar.w0;
                kVar.z0 = zsd.r0(kVar.l(), new ub7(12, new com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b(2, zsd.Q((xdr) evjVar.d, (xdr) evjVar.e, kVar.y0, new h(4, null))), new com.yandex.plus.experiments.impl.cache.b(kVar, z0Var, b1Var, continuation, 5)));
            }
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void a() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onPause()");
        getWebViewController().a();
        k kVar = this.a;
        kVar.d0();
        getWebViewController().setAudioMuted(true);
        if (this.i) {
            kVar.F0 = false;
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void c(String str) {
        getWebViewController().k();
        getStoriesLoading().animate().alpha(0.0f).withEndAction(new androidx.core.app.a(15, this)).start();
        com.yandex.plus.home.feature.webviews.internal.webview.f.p(getWebViewController());
        getErrorViewController().b(getWebViewController().j(), false);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void d(v1 v1Var) {
        v1Var.getClass();
        com.yandex.plus.home.feature.webviews.internal.stories.contract.c webViewController = getWebViewController();
        webViewController.getClass();
        ((com.yandex.plus.home.feature.webviews.internal.stories.contract.a) webViewController.v.getValue()).C(v1Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final boolean e() {
        if (!getWebViewController().g()) {
            return false;
        }
        getWebViewController().e();
        return true;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void f(int i) {
        getView().performHapticFeedback(i);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void g(String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "sendMessage() url=" + str);
        getWebViewController().s(str);
    }

    @NotNull
    public final u0q getStoryNavigationSharedFlow() {
        return this.n;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    @NotNull
    public View getView() {
        return this.l;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void h(String str) {
        ((t) this.j).s(new com.yandex.plus.home.feature.webviews.internal.serviceinfo.b(getWebViewController().h(), str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void j() {
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.c.a();
        View view = ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) nativePayButtonViewController.q.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void k() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) this.a.D0.getValue()).a();
        hostPayContainer.addView(null);
        getHostPayAnimationController().a();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void m(com.yandex.plus.home.pay.a aVar) {
        aVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.getClass();
        nativePayButtonViewController.d(false);
        nativePayButtonViewController.b().setText(nativePayButtonViewController.c(aVar));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void n(boolean z) {
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, com.yandex.plus.core.analytics.logging.b.b, "dismiss() animate=" + z, null);
        ((t) this.j).k();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void o(com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a aVar) {
        aVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f.e(getNativePayButtonViewController(), aVar.b, aVar.c, aVar.d, aVar.e, aVar.a, false, 96);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.a aVar = com.yandex.plus.core.analytics.logging.a.c;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "onAttachedToWindow()", null);
        k kVar = this.a;
        kVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.uri.g gVar = kVar.g;
        kVar.f(this);
        kVar.t.v();
        com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "attachView()", null);
        evj evjVar = kVar.w0;
        evjVar.a = true;
        evjVar.c();
        kVar.B0.h();
        boolean z = kVar.E;
        com.yandex.plus.bdui.plus.content.controller.f fVar = kVar.v;
        int i = 15;
        if (z) {
            com.yandex.plus.bdui.flex.ui.a.i(fVar.l("stories"), kVar.l(), new laq(kVar, continuation, 14));
        } else {
            com.yandex.plus.bdui.flex.ui.a.i(fVar.k("stories"), kVar.l(), new laq(kVar, continuation, i));
        }
        com.yandex.plus.home.feature.webviews.internal.bridge.g gVar2 = (com.yandex.plus.home.feature.webviews.internal.bridge.g) kVar.A0.getValue();
        com.yandex.plus.bdui.flex.ui.a.j((com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b) gVar2.a.a, kVar.l(), new com.yandex.passport.internal.ui.social.i(gVar2, continuation, i));
        String str = gVar.b;
        if (str != null) {
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g h0 = kVar.h0();
            String str2 = gVar.c;
            String str3 = kVar.F;
            h0.getClass();
            h0.j(new jbb(h0, str, str2, str3, (Continuation) null, 14));
        }
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g h02 = kVar.h0();
        String str4 = gVar.b;
        h02.getClass();
        h02.a(new v4w(str4, 13));
        kVar.G0.f(kVar.y);
        getWebViewController().setAudioMuted(false);
        ((com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) getAcqSdkButtonSectionContainerViewController()).b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        this.a.h();
        getWebViewController().setAudioMuted(true);
        ((com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) getAcqSdkButtonSectionContainerViewController()).a();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onResume() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onResume()", null);
        getWebViewController().onResume();
        k kVar = this.a;
        kVar.f0();
        getWebViewController().setAudioMuted(false);
        if (this.i) {
            kVar.F0 = true;
            if (kVar.E0) {
                kVar.G0.a(kVar.y);
            }
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void p() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        hostPayContainer.setVisibility(8);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void q() {
        getStoriesLoading().animate().alpha(0.0f).withEndAction(new androidx.core.app.a(15, this)).start();
        getErrorViewController().a(false);
        getWebViewController().q(new l(this, 5), true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void s() {
        D();
        getWebViewController().setAudioMuted(false);
    }

    public final void setIsFullyVisible(boolean z) {
        k kVar = this.a;
        kVar.F0 = z;
        if (z && kVar.E0) {
            kVar.G0.a(kVar.y);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void u(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        StringBuilder m = f1d.m("openUrl() url=", str, " storiesData=", str2, " headers=");
        m.append(list);
        String sb = m.toString();
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, sb, null);
        this.u = str2;
        com.yandex.plus.home.feature.webviews.internal.stories.contract.c webViewController = getWebViewController();
        List<com.yandex.plus.home.feature.webviews.internal.network.b> list2 = list;
        int a = tah.a(v75.o(list2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (com.yandex.plus.home.feature.webviews.internal.network.b bVar2 : list2) {
            linkedHashMap.put(bVar2.a, bVar2.b);
        }
        webViewController.n(str, linkedHashMap);
        com.yandex.plus.home.feature.webviews.internal.webview.f.p(getWebViewController());
        ViewGroup storiesLoading = getStoriesLoading();
        storiesLoading.setAlpha(0.0f);
        storiesLoading.setVisibility(0);
        storiesLoading.animate().alpha(1.0f).start();
        getErrorViewController().a(false);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.stories.c
    public final void v(b bVar) {
        this.m.a(bVar);
    }
}
