package com.yandex.plus.home.feature.webviews.internal.smart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.uri.w;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.b6e;
import defpackage.btf;
import defpackage.ern;
import defpackage.evj;
import defpackage.f1d;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.laq;
import defpackage.s9f;
import defpackage.tah;
import defpackage.v75;
import defpackage.yxm;
import defpackage.zne;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class i extends LinearLayout implements com.yandex.plus.home.feature.webviews.internal.container.c, j {
    public static final /* synthetic */ s9f[] r = {new yxm(i.class, "topSpacerView", "getTopSpacerView()Landroid/view/View;", 0), f1d.c(ern.a, i.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new yxm(i.class, "progressBarLayout", "getProgressBarLayout()Landroid/view/ViewGroup;", 0), new yxm(i.class, "errorLayout", "getErrorLayout()Landroid/view/ViewGroup;", 0)};
    public final e a;
    public final com.yandex.plus.home.feature.webviews.internal.accessibility.b b;
    public final com.yandex.plus.resources.core.a c;
    public final com.yandex.plus.home.feature.webviews.internalapi.toolbar.a d;
    public final com.yandex.plus.home.api.webview.b e;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c f;
    public final com.yandex.plus.home.feature.webviews.internal.smart.contract.d g;
    public final u h;
    public final i i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final com.yandex.plus.bdui.plus.content.controller.f k;
    public final com.yandex.plus.bdui.plus.content.controller.f l;
    public final com.yandex.plus.bdui.plus.content.controller.f m;
    public final jyr n;
    public final jyr o;
    public final l p;
    public final jyr q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, @NotNull e eVar, @NotNull com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar, @NotNull com.yandex.plus.home.feature.webviews.internal.uri.i iVar, @NotNull com.yandex.plus.resources.core.a aVar, @NotNull com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar2, com.yandex.plus.home.api.webview.c cVar, @NotNull com.yandex.plus.home.api.webview.b bVar2, @NotNull com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar2, @NotNull zne zneVar, @NotNull com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar3, @NotNull com.yandex.plus.home.feature.webviews.internal.smart.contract.d dVar, @NotNull u uVar) {
        super(context);
        int i;
        context.getClass();
        eVar.getClass();
        bVar.getClass();
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        cVar2.getClass();
        zneVar.getClass();
        aVar3.getClass();
        dVar.getClass();
        uVar.getClass();
        this.a = eVar;
        this.b = bVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = bVar2;
        this.f = cVar2;
        this.g = dVar;
        this.h = uVar;
        this.i = this;
        this.j = new com.yandex.plus.bdui.plus.content.controller.f(new g(this, 0));
        this.k = new com.yandex.plus.bdui.plus.content.controller.f(new g(this, 1));
        this.l = new com.yandex.plus.bdui.plus.content.controller.f(new g(this, 2));
        this.m = new com.yandex.plus.bdui.plus.content.controller.f(new g(this, 3));
        this.n = btf.b(new f(this, 0));
        this.o = btf.b(new f(this, 1));
        this.p = new l(this);
        this.q = btf.b(new f(this, 2));
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            i = R.layout.plus_sdk_web_view_smart_card;
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            i = R.layout.plus_sdk_web_view_smart_full;
        }
        r1.p(this, i, true);
        setOrientation(1);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "PlusSmartWebView.applyInsets(" + zneVar + ')', null);
        View topSpacerView = getTopSpacerView();
        ViewGroup.LayoutParams layoutParams = topSpacerView.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        layoutParams.height = aVar3.b <= 0 ? zneVar.b : 0;
        topSpacerView.setLayoutParams(layoutParams);
        ViewGroup errorLayout = getErrorLayout();
        errorLayout.setPadding(zneVar.a, errorLayout.getPaddingTop(), zneVar.c, zneVar.d);
        bVar.b(getWebViewContainer().getWebView());
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.m.g(r[3]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.error.b getErrorViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.error.b) this.o.getValue();
    }

    private final ViewGroup getProgressBarLayout() {
        return (ViewGroup) this.l.g(r[2]);
    }

    private final com.yandex.plus.home.feature.webviews.internal.toolbar.c getToolbarController() {
        return (com.yandex.plus.home.feature.webviews.internal.toolbar.c) this.n.getValue();
    }

    private final View getTopSpacerView() {
        return (View) this.j.g(r[0]);
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.k.g(r[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.plus.home.feature.webviews.internal.smart.contract.c getWebViewController() {
        return (com.yandex.plus.home.feature.webviews.internal.smart.contract.c) this.q.getValue();
    }

    public static com.yandex.plus.home.feature.webviews.internal.smart.contract.c j(i iVar) {
        com.yandex.plus.home.feature.webviews.internal.smart.contract.d dVar = iVar.g;
        WebViewContainer webViewContainer = iVar.getWebViewContainer();
        e eVar = iVar.a;
        com.yandex.plus.home.feature.webviews.internal.simple.d dVar2 = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, iVar.h, u.class, "getMultipleContents", "getMultipleContents(Lkotlin/jvm/functions/Function1;)V", 0, 6);
        h hVar = new h(2, iVar.h, u.class, "requestPermissions", "requestPermissions(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", 0, 0);
        k kVar = new k(29, iVar);
        h hVar2 = new h(2, iVar.a, e.class, "handleUrlLoading", "handleUrlLoading(Lcom/yandex/plus/webview/core/WebViewController;Lcom/yandex/plus/webview/core/resource/PlusWebResourceRequest;)Z", 0, 1);
        com.yandex.plus.home.feature.webviews.internal.simple.d dVar3 = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, iVar.getToolbarController(), com.yandex.plus.home.feature.webviews.internal.toolbar.c.class, "update", "update(Lcom/yandex/plus/home/feature/webviews/internalapi/toolbar/WebViewToolbarData;)V", 0, 7);
        com.yandex.plus.core.network.ssl.a aVar = eVar.F;
        l lVar = iVar.p;
        dVar.getClass();
        webViewContainer.getClass();
        aVar.getClass();
        lVar.getClass();
        boolean z = dVar.a;
        boolean z2 = dVar.b;
        com.yandex.plus.home.feature.webviews.internal.f fVar = dVar.f;
        Function0 function0 = dVar.g;
        w wVar = dVar.e;
        long j = dVar.c;
        com.yandex.plus.home.feature.webviews.internal.smart.contract.b bVar = dVar.d;
        com.yandex.plus.home.feature.webviews.internalapi.a aVar2 = com.yandex.plus.home.feature.webviews.internalapi.a.a;
        return new com.yandex.plus.home.feature.webviews.internal.smart.contract.c(z, z2, webViewContainer, eVar, fVar, function0, eVar, dVar2, hVar, kVar, dVar3, hVar2, aVar, wVar, j, lVar, bVar, dVar.h);
    }

    public static Unit k(i iVar) {
        com.yandex.plus.home.feature.webviews.internal.accessibility.b bVar = iVar.b;
        WebView webView = iVar.getWebViewContainer().getWebView();
        bVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.accessibility.b.a(webView);
        return Unit.a;
    }

    public static com.yandex.plus.home.feature.webviews.internal.error.b m(i iVar) {
        return new com.yandex.plus.home.feature.webviews.internal.error.b(iVar.getErrorLayout(), iVar.e, iVar.f, new com.yandex.plus.home.analytics.evgen.c(0, iVar.a, e.class, "onRetryClick", "onRetryClick()V", 0, 25));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void a() {
        getWebViewController().a();
        this.a.d0();
        getWebViewController().setAudioMuted(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void b() {
        e eVar = this.a;
        eVar.getClass();
        eVar.j0(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void c(String str) {
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.f).b(getProgressBarLayout());
        com.yandex.plus.home.feature.webviews.internal.webview.f.p(getWebViewController());
        getErrorViewController().b(getWebViewController().j(), true);
        getToolbarController().a(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.q(getWebViewController()));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void d(v1 v1Var) {
        v1Var.getClass();
        com.yandex.plus.home.feature.webviews.internal.smart.contract.c webViewController = getWebViewController();
        webViewController.getClass();
        ((com.yandex.plus.home.feature.webviews.internal.smart.contract.a) webViewController.u.getValue()).C(v1Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void dismiss() {
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "dismiss()");
        ((t) this.h).k();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final boolean e() {
        if (!getWebViewController().g()) {
            return false;
        }
        getWebViewController().e();
        return true;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void f(int i) {
        getView().performHapticFeedback(i);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void g(String str) {
        str.getClass();
        com.yandex.plus.core.analytics.logging.e.d(com.yandex.plus.core.analytics.logging.b.b, "sendMessage() url=" + str);
        getWebViewController().s(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    @NotNull
    public View getView() {
        return this.i;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void h(String str) {
        ((t) this.h).s(new com.yandex.plus.home.feature.webviews.internal.serviceinfo.b(getWebViewController().h(), str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void i() {
        e eVar = this.a;
        eVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onHasStoppedBeingOverlapped()", null);
        eVar.j0(new u1());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void l() {
        e eVar = this.a;
        eVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.b;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.c, bVar, "onHasStartedBeingOverlapped()", null);
        eVar.j0(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r1());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void n(String str, List list) {
        str.getClass();
        list.getClass();
        com.yandex.plus.home.feature.webviews.internal.smart.contract.c webViewController = getWebViewController();
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
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.f).c(getProgressBarLayout(), new u6(25));
        getErrorViewController().a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.a;
        eVar.getClass();
        eVar.f(this);
        eVar.h.v();
        evj evjVar = eVar.I;
        evjVar.a = true;
        evjVar.c();
        eVar.K.h();
        String str = eVar.g.e;
        if (str == null) {
            str = "smart";
        }
        boolean z = eVar.B;
        com.yandex.plus.bdui.plus.content.controller.f fVar = eVar.x;
        Continuation continuation = null;
        if (z) {
            com.yandex.plus.bdui.flex.ui.a.i(fVar.l(str), eVar.l(), new laq(eVar, continuation, 12));
        } else {
            com.yandex.plus.bdui.flex.ui.a.i(fVar.k(str), eVar.l(), new laq(eVar, continuation, 13));
        }
        eVar.z.f(eVar.A);
        getToolbarController().a(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.q(getWebViewController()));
        getWebViewController().setAudioMuted(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.h();
        getWebViewController().setAudioMuted(true);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onResume() {
        getWebViewController().onResume();
        this.a.f0();
        getWebViewController().setAudioMuted(false);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.container.c
    public final void onStop() {
        e eVar = this.a;
        eVar.getClass();
        eVar.j0(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c());
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.smart.j
    public final void q() {
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.f).b(getProgressBarLayout());
        getErrorViewController().a(false);
        getWebViewController().q(new f(this, 3), true);
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
