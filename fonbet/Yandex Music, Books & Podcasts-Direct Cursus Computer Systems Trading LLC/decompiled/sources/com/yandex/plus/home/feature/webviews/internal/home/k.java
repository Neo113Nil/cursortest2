package com.yandex.plus.home.feature.webviews.internal.home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.q;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.b6e;
import defpackage.btf;
import defpackage.ern;
import defpackage.evj;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.laq;
import defpackage.ow1;
import defpackage.s9f;
import defpackage.tah;
import defpackage.v75;
import defpackage.wxm;
import defpackage.x97;
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
public final class k extends LinearLayout implements a, com.yandex.plus.home.feature.webviews.internal.container.c {
    public static final /* synthetic */ s9f[] B = {new yxm(k.class, "topSpacerView", "getTopSpacerView()Landroid/view/View;", 0), f1d.c(ern.a, k.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new yxm(k.class, "toolbar", "getToolbar()Lcom/yandex/plus/home/feature/webviews/internal/toolbar/WebViewToolbar;", 0), new yxm(k.class, "hostPayContainer", "getHostPayContainer()Landroid/view/ViewGroup;", 0), new yxm(k.class, "sslErrorViewStub", "getSslErrorViewStub()Landroid/view/ViewStub;", 0), new yxm(k.class, "toArticleButton", "getToArticleButton()Landroid/widget/Button;", 0), new yxm(k.class, "errorContainer", "getErrorContainer()Landroid/view/ViewGroup;", 0), new yxm(k.class, "nativePayButton", "getNativePayButton()Landroid/view/ViewGroup;", 0), new yxm(k.class, "acqSdkButtonSectionContainer", "getAcqSdkButtonSectionContainer()Landroid/view/ViewGroup;", 0)};
    public final jyr A;
    public final g a;
    public final com.yandex.plus.home.feature.webviews.internal.accessibility.b b;
    public final com.yandex.plus.ui.core.theme.a c;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.pay.c d;
    public final com.yandex.plus.resources.core.a e;
    public final com.yandex.plus.home.api.webview.b f;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c g;
    public final com.yandex.plus.home.feature.webviews.internal.home.contract.d h;
    public final u i;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a j;
    public final k k;
    public final com.yandex.plus.bdui.plus.content.controller.f l;
    public final com.yandex.plus.bdui.plus.content.controller.f m;
    public final com.yandex.plus.bdui.plus.content.controller.f n;
    public final com.yandex.plus.bdui.plus.content.controller.f o;
    public final com.yandex.plus.bdui.plus.content.controller.f p;
    public final com.yandex.plus.bdui.plus.content.controller.f q;
    public final com.yandex.plus.bdui.plus.content.controller.f r;
    public final com.yandex.plus.bdui.plus.content.controller.f s;
    public final com.yandex.plus.bdui.plus.content.controller.f t;
    public final j u;
    public final j v;
    public final jyr w;
    public final jyr x;
    public final jyr y;
    public final jyr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @NotNull g gVar, @NotNull com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar, @NotNull com.yandex.plus.home.feature.webviews.internal.uri.i iVar, @NotNull com.yandex.plus.ui.core.theme.a aVar, @NotNull com.yandex.plus.home.feature.webviews.internal.purchase.pay.c cVar, @NotNull com.yandex.plus.resources.core.a aVar2, @NotNull com.yandex.plus.home.feature.webviews.internalapi.animation.a aVar3, @NotNull com.yandex.plus.home.api.webview.b bVar2, @NotNull com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar2, @NotNull com.yandex.plus.core.strings.a aVar4, boolean z, @NotNull zne zneVar, @NotNull com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar5, @NotNull com.yandex.plus.home.feature.webviews.internal.home.contract.d dVar, @NotNull u uVar, @NotNull com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a aVar6) {
        super(context);
        int i;
        context.getClass();
        gVar.getClass();
        bVar.getClass();
        iVar.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar2.getClass();
        cVar2.getClass();
        aVar4.getClass();
        zneVar.getClass();
        aVar5.getClass();
        dVar.getClass();
        uVar.getClass();
        aVar6.getClass();
        this.a = gVar;
        this.b = bVar;
        this.c = aVar;
        this.d = cVar;
        this.e = aVar2;
        this.f = bVar2;
        this.g = cVar2;
        this.h = dVar;
        this.i = uVar;
        this.j = aVar6;
        this.k = this;
        final int i2 = 1;
        this.l = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 1));
        final int i3 = 2;
        this.m = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 2));
        this.n = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 3));
        this.o = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 4));
        this.p = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 5));
        this.q = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 6));
        this.r = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 7));
        this.s = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 8));
        this.t = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.webviews.internal.a(this, 9));
        this.u = new j(this);
        this.v = new j(this);
        this.w = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return k.v(this.b);
                    case 1:
                        return k.y(this.b);
                    default:
                        return k.x(this.b);
                }
            }
        });
        this.x = btf.b(new com.yandex.plus.bdui.content.b(16, this, aVar3));
        this.y = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return k.v(this.b);
                    case 1:
                        return k.y(this.b);
                    default:
                        return k.x(this.b);
                }
            }
        });
        this.z = btf.b(new com.yandex.plus.bdui.content.b(17, this, aVar4));
        this.A = btf.b(new Function0(this) { // from class: com.yandex.plus.home.feature.webviews.internal.home.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return k.v(this.b);
                    case 1:
                        return k.y(this.b);
                    default:
                        return k.x(this.b);
                }
            }
        });
        com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar3, "init()", null);
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            i = R.layout.plus_sdk_web_view_home_card;
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            i = R.layout.plus_sdk_web_view_home_full;
        }
        r1.p(this, i, true);
        setOrientation(1);
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "PlusHomeWebView.applyInsets(" + zneVar + ')', null);
        View topSpacerView = getTopSpacerView();
        ViewGroup.LayoutParams layoutParams = topSpacerView.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        layoutParams.height = aVar5.b <= 0 ? zneVar.b : 0;
        topSpacerView.setLayoutParams(layoutParams);
        ViewGroup errorContainer = getErrorContainer();
        int i4 = zneVar.a;
        int i5 = zneVar.d;
        int i6 = zneVar.c;
        errorContainer.setPadding(i4, errorContainer.getPaddingTop(), i6, i5);
        ViewStub sslErrorViewStub = getSslErrorViewStub();
        sslErrorViewStub.setPadding(i4, sslErrorViewStub.getPaddingTop(), i6, i5);
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.setPadding(i4, hostPayContainer.getPaddingTop(), i6, i5);
        ViewGroup nativePayButton = getNativePayButton();
        nativePayButton.setPadding(i4, nativePayButton.getPaddingTop(), i6, i5);
        ViewGroup acqSdkButtonSectionContainer = getAcqSdkButtonSectionContainer();
        acqSdkButtonSectionContainer.setPadding(i4, acqSdkButtonSectionContainer.getPaddingTop(), i6, i5);
        setupToolbar(z);
        bVar.b(getWebViewContainer().getWebView());
    }

    private final ViewGroup getAcqSdkButtonSectionContainer() {
        return (ViewGroup) this.t.g(B[8]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.b getAcqSdkButtonSectionContainerViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.b) this.y.getValue();
    }

    private final ViewGroup getErrorContainer() {
        return (ViewGroup) this.r.g(B[6]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.purchase.pay.g getHostPayAnimationController() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) this.A.getValue();
    }

    private final ViewGroup getHostPayContainer() {
        return (ViewGroup) this.o.g(B[3]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.b getLoadingController() {
        return (com.yandex.plus.home.feature.webviews.internal.b) this.x.getValue();
    }

    private final ViewGroup getNativePayButton() {
        return (ViewGroup) this.s.g(B[7]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.purchase.pay.f getNativePayButtonViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.purchase.pay.f) this.z.getValue();
    }

    private final ViewStub getSslErrorViewStub() {
        return (ViewStub) this.p.g(B[4]);
    }

    private final Button getToArticleButton() {
        return (Button) this.q.g(B[5]);
    }

    private final WebViewToolbar getToolbar() {
        return (WebViewToolbar) this.n.g(B[2]);
    }

    private final View getTopSpacerView() {
        return (View) this.l.g(B[0]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.m.g(B[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.plus.home.feature.webviews.internal.home.contract.c getWebViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.home.contract.c) this.w.getValue();
    }

    private final void setupToolbar(boolean z) {
        WebViewToolbar toolbar = getToolbar();
        if (toolbar != null) {
            toolbar.setVisibility(z ? 0 : 8);
        }
        if (z) {
            WebViewToolbar toolbar2 = getToolbar();
            if (toolbar2 != null) {
                toolbar2.y();
            }
            WebViewToolbar toolbar3 = getToolbar();
            if (toolbar3 != null) {
                toolbar3.setOnStartIconClickListener(new com.yandex.plus.home.analytics.evgen.c(0, this.i, u.class, "closeTopDeeplink", "closeTopDeeplink()V", 0, 23));
            }
        }
    }

    public static com.yandex.plus.home.feature.webviews.internal.home.contract.c v(k kVar) {
        com.yandex.plus.home.feature.webviews.internal.home.contract.d dVar = kVar.h;
        WebViewContainer webViewContainer = kVar.getWebViewContainer();
        g gVar = kVar.a;
        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, kVar.i, u.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0, 20);
        q qVar = new q(2, kVar.i, u.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0, 25);
        com.yandex.passport.internal.ui.bouncer.roundabout.k kVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.k(26, kVar);
        g gVar2 = kVar.a;
        q qVar2 = new q(2, gVar2, g.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0, 26);
        com.yandex.plus.core.network.ssl.a aVar2 = gVar2.y0;
        j jVar = kVar.u;
        j jVar2 = kVar.v;
        dVar.getClass();
        webViewContainer.getClass();
        gVar.getClass();
        aVar2.getClass();
        jVar.getClass();
        jVar2.getClass();
        boolean z = dVar.a;
        boolean z2 = dVar.b;
        com.yandex.plus.home.feature.webviews.internal.f fVar = dVar.f;
        Function0 function0 = dVar.g;
        w wVar = dVar.e;
        long j = dVar.c;
        com.yandex.plus.home.feature.webviews.internal.home.contract.b bVar = dVar.d;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        return new com.yandex.plus.home.feature.webviews.internal.home.contract.c(z, z2, webViewContainer, gVar, fVar, function0, gVar, aVar, qVar, kVar2, qVar2, aVar2, wVar, j, jVar, jVar2, bVar, dVar.h);
    }

    public static com.yandex.plus.home.feature.webviews.internal.purchase.pay.f w(k kVar, com.yandex.plus.core.strings.a aVar) {
        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.f(kVar.c, kVar.getNativePayButton(), kVar.a, kVar.d, kVar.e, aVar);
    }

    public static com.yandex.plus.home.feature.webviews.internal.purchase.pay.g x(k kVar) {
        return new com.yandex.plus.home.feature.webviews.internal.purchase.pay.g(kVar.getHostPayContainer());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ezc, kotlin.jvm.functions.Function0] */
    public static com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c y(k kVar) {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a aVar = kVar.j;
        ViewGroup acqSdkButtonSectionContainer = kVar.getAcqSdkButtonSectionContainer();
        s sVar = (s) aVar;
        sVar.getClass();
        acqSdkButtonSectionContainer.getClass();
        return new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c(acqSdkButtonSectionContainer, (ezc) sVar.d, (com.yandex.plus.bdui.plus.content.controller.f) sVar.b, (com.yandex.plus.acquisition.adapter.internal.controller.b) sVar.c, (wxm) sVar.e, (o) sVar.a, (com.yandex.plus.home.plaque.plugin.internal.proxy.a) sVar.f, (y) sVar.g);
    }

    public static com.yandex.plus.home.feature.webviews.internal.b z(k kVar, com.yandex.plus.home.feature.webviews.internalapi.animation.a aVar) {
        ViewGroup errorContainer = kVar.getErrorContainer();
        com.yandex.plus.home.api.webview.b bVar = kVar.f;
        com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar = kVar.g;
        return new com.yandex.plus.home.feature.webviews.internal.b(kVar, aVar, new com.yandex.plus.home.feature.webviews.internal.error.b(errorContainer, bVar, cVar, new com.yandex.plus.home.analytics.evgen.c(0, kVar.a, g.class, "onRetryClick", "onRetryClick()V", 0, 22)), cVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void a() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onPause()");
        getWebViewController().a();
        this.a.d0();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void b() {
        g gVar = this.a;
        gVar.getClass();
        gVar.l0(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void c(String str) {
        getWebViewController().k();
        com.yandex.plus.home.feature.webviews.internal.webview.f.p(getWebViewController());
        com.yandex.plus.home.feature.webviews.internal.b loadingController = getLoadingController();
        String j = getWebViewController().j();
        loadingController.getClass();
        j.getClass();
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) loadingController.c).b(loadingController.a());
        com.yandex.plus.home.feature.webviews.internalapi.animation.a aVar = loadingController.a;
        ViewGroup a = loadingController.a();
        com.yandex.plus.home.animation.a aVar2 = (com.yandex.plus.home.animation.a) aVar;
        aVar2.getClass();
        a.getClass();
        aVar2.a.m(a);
        loadingController.b.b(j, true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void d(v1 v1Var) {
        v1Var.getClass();
        com.yandex.plus.home.feature.webviews.internal.home.contract.c webViewController = getWebViewController();
        webViewController.getClass();
        ((com.yandex.plus.home.feature.webviews.internal.home.contract.a) webViewController.u.getValue()).C(v1Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void dismiss() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "dismiss()");
        ((t) this.i).k();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final boolean e() {
        g gVar = this.a;
        gVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onBackPressed()", null);
        f fVar = gVar.F0;
        fVar.getClass();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "onBackPressed()", null);
        fVar.n(null);
        fVar.m(null);
        if (!getWebViewController().g()) {
            return false;
        }
        getWebViewController().e();
        return true;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void f(int i) {
        getView().performHapticFeedback(i);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void g(String str) {
        str.getClass();
        getWebViewController().s(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    @NotNull
    public View getView() {
        return this.k;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void h(String str) {
        ((t) this.i).s(new com.yandex.plus.home.feature.webviews.internal.serviceinfo.b(getWebViewController().h(), str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void i() {
        g gVar = this.a;
        gVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onHasStoppedBeingOverlapped()", null);
        gVar.l0(new u1());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void j() {
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.c.a();
        View view = ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) nativePayButtonViewController.q.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void k() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) this.a.I0.getValue()).a();
        hostPayContainer.addView(null);
        getHostPayAnimationController().a();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void l() {
        g gVar = this.a;
        gVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onHasStartedBeingOverlapped()", null);
        gVar.l0(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r1());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void m(com.yandex.plus.home.pay.a aVar) {
        aVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.getClass();
        nativePayButtonViewController.d(false);
        nativePayButtonViewController.b().setText(nativePayButtonViewController.c(aVar));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void n(String str, List list) {
        str.getClass();
        list.getClass();
        com.yandex.plus.home.feature.webviews.internal.home.contract.c webViewController = getWebViewController();
        List<com.yandex.plus.home.feature.webviews.internal.network.b> list2 = list;
        int a = tah.a(v75.o(list2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (com.yandex.plus.home.feature.webviews.internal.network.b bVar : list2) {
            linkedHashMap.put(bVar.a, bVar.b);
        }
        webViewController.n(str, linkedHashMap);
        com.yandex.plus.home.feature.webviews.internal.webview.f.p(getWebViewController());
        getLoadingController().b();
        getHostPayContainer().setVisibility(8);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void o(com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a aVar) {
        aVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f.e(getNativePayButtonViewController(), aVar.b, aVar.c, aVar.d, aVar.e, aVar.a, aVar.f, 64);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.a aVar = com.yandex.plus.core.analytics.logging.a.c;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "onAttachedToWindow()", null);
        g gVar = this.a;
        gVar.getClass();
        gVar.f(this);
        gVar.v.v();
        com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "attachView()", null);
        evj evjVar = gVar.C0;
        int i = 1;
        evjVar.a = true;
        evjVar.c();
        gVar.F0.h();
        boolean z = gVar.I;
        com.yandex.plus.bdui.plus.content.controller.f fVar = gVar.x;
        if (z) {
            com.yandex.plus.bdui.flex.ui.a.i(fVar.l("home"), gVar.l(), new laq(gVar, continuation, 10));
        } else {
            com.yandex.plus.bdui.flex.ui.a.i(fVar.k("home"), gVar.l(), new laq(gVar, continuation, 11));
        }
        com.yandex.plus.bdui.flex.ui.a.i(zsd.b0(new com.yandex.passport.internal.t(gVar.u.a.h, 26)), gVar.l(), new ow1(gVar, (Continuation) null, 14));
        x97.y(gVar.l(), null, null, new e(gVar, continuation, i), 3);
        com.yandex.plus.home.feature.webviews.internal.bridge.g gVar2 = (com.yandex.plus.home.feature.webviews.internal.bridge.g) gVar.E0.getValue();
        com.yandex.plus.bdui.flex.ui.a.j((com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b) gVar2.a.a, gVar.l(), new com.yandex.passport.internal.ui.social.i(gVar2, continuation, 15));
        gVar.h0().a(new com.yandex.plus.bdui.plus.webview.navigation.a(27));
        gVar.z.f(gVar.C);
        getWebViewController().setAudioMuted(false);
        ((com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) getAcqSdkButtonSectionContainerViewController()).b();
        getLoadingController().b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onDetachedFromWindow()", null);
        this.a.h();
        com.yandex.plus.home.feature.webviews.internal.purchase.pay.f nativePayButtonViewController = getNativePayButtonViewController();
        nativePayButtonViewController.c.a();
        View view = ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.g) nativePayButtonViewController.q.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
        ((com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.c) getAcqSdkButtonSectionContainerViewController()).a();
        com.yandex.plus.home.feature.webviews.internal.b loadingController = getLoadingController();
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) loadingController.c).b(loadingController.a());
        com.yandex.plus.home.feature.webviews.internalapi.animation.a aVar = loadingController.a;
        ViewGroup a = loadingController.a();
        com.yandex.plus.home.animation.a aVar2 = (com.yandex.plus.home.animation.a) aVar;
        aVar2.getClass();
        a.getClass();
        aVar2.a.m(a);
        loadingController.b.a(true);
        getWebViewController().setAudioMuted(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onResume() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "onResume()");
        getWebViewController().onResume();
        this.a.f0();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onStop() {
        g gVar = this.a;
        gVar.getClass();
        gVar.l0(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void p() {
        ViewGroup hostPayContainer = getHostPayContainer();
        hostPayContainer.removeAllViews();
        hostPayContainer.setVisibility(8);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void q() {
        if (getSslErrorViewStub().getParent() != null) {
            getSslErrorViewStub().inflate();
            r1.E(getToArticleButton(), new i(0, this));
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void r() {
        getTopSpacerView().setVisibility(4);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void s() {
        getWebViewController().q(new u6(24), false);
        com.yandex.plus.home.feature.webviews.internal.b loadingController = getLoadingController();
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) loadingController.c).b(loadingController.a());
        com.yandex.plus.home.feature.webviews.internalapi.animation.a aVar = loadingController.a;
        ViewGroup a = loadingController.a();
        com.yandex.plus.home.animation.a aVar2 = (com.yandex.plus.home.animation.a) aVar;
        aVar2.getClass();
        a.getClass();
        aVar2.a.m(a);
        loadingController.b.a(true);
        g gVar = this.a;
        gVar.v.q(gVar.F0.g);
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.a aVar3 = com.yandex.plus.core.analytics.logging.a.c;
        com.yandex.plus.core.analytics.logging.e.e(aVar3, bVar, "onContentShowed()", null);
        if (!gVar.z0) {
            gVar.z0 = true;
            gVar.o.a.a(com.yandex.plus.home.api.state.a.a);
        }
        com.yandex.plus.core.analytics.logging.e.e(aVar3, bVar, "autoTriggerSettingIfPresent()", null);
        gVar.h.getClass();
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, "autoTriggerSettingIfPresent() settingId is null and newValue is null", null);
        gVar.z.a(gVar.C);
        WebView webView = getWebViewContainer().getWebView();
        this.b.getClass();
        com.yandex.plus.home.feature.webviews.internal.accessibility.b.a(webView);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void t() {
        getTopSpacerView().setVisibility(0);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.home.a
    public final void u() {
        getNativePayButtonViewController().d(false);
    }
}
