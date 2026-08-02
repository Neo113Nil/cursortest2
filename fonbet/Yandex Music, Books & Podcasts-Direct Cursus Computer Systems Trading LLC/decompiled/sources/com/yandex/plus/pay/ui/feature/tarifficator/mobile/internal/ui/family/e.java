package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.n;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.laq;
import defpackage.lyf;
import defpackage.nme;
import defpackage.nyf;
import defpackage.qpj;
import defpackage.s9f;
import defpackage.t75;
import defpackage.wxf;
import defpackage.ybf;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/family/e;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class e extends o {
    public static final /* synthetic */ s9f[] p = {new yxm(e.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), f1d.c(ern.a, e.class, "progressView", "getProgressView()Landroid/view/View;", 0), new yxm(e.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new yxm(e.class, "skipButton", "getSkipButton()Landroid/widget/Button;", 0)};
    public final jyr g;
    public final ybf h;
    public final ybf i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final com.yandex.passport.internal.core.accounts.h m;
    public String n;
    public com.yandex.plus.webview.internal.f o;

    public e() {
        super(R.layout.pay_sdk_fragment_tarifficator_family);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                e eVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = e.p;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(eVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = e.p;
                        return eVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = e.p;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(eVar.x().b, 1))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = e.p;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(eVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = e.p;
                        return eVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = e.p;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(eVar.x().b, 1))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        b bVar = new b(this, 0);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(1, bVar));
        this.h = new ybf(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new n(a, 20), function0, new n(a, 21));
        final int i3 = 2;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.a
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = e.p;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(eVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = e.p;
                        return eVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = e.p;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(eVar.x().b, 1))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a2 = btf.a(bwfVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(2, new b(this, 1)));
        this.i = new ybf(ern.a(j.class), new n(a2, 22), function02, new n(a2, 23));
        this.j = new com.yandex.passport.internal.core.accounts.h(new c(this, 0), new d(this, 0));
        this.k = new com.yandex.passport.internal.core.accounts.h(new c(this, 1), new d(this, 1));
        this.l = new com.yandex.passport.internal.core.accounts.h(new c(this, 2), new d(this, 2));
        this.m = new com.yandex.passport.internal.core.accounts.h(new c(this, 3), new d(this, 3));
    }

    public final WebViewContainer A() {
        return (WebViewContainer) this.l.x(p[2]);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        this.o = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        com.yandex.plus.webview.internal.f fVar = this.o;
        if (fVar != null) {
            fVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        com.yandex.plus.webview.internal.f fVar = this.o;
        if (fVar != null) {
            fVar.onResume();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(16, this));
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.core.insets.j jVar = com.yandex.plus.core.insets.j.c;
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(jVar, aVar);
        dVar.b(view);
        WebView webView = A().getWebView();
        Context context = view.getContext();
        context.getClass();
        webView.setBackgroundColor(com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_primaryBlockColor));
        s9f[] s9fVarArr = p;
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.i iVar = new com.yandex.plus.pay.ui.core.mobile.view.toolbar.i((PlusPayToolbarView) this.j.x(s9fVarArr[0]), x().a.q, x().a.j, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, z(), j.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0, 4));
        r1.E(y(), new com.yandex.plus.home.feature.webviews.internal.home.i(8, this));
        WebViewContainer A = A();
        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(((com.yandex.plus.pay.ui.webview.family.ui.c) x().a.D0.getValue()).a(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(17, this))));
        com.yandex.plus.core.network.ssl.a a = x().a.t.a("TarifficatorFamilyInvite");
        ((com.yandex.plus.core.dispatcher.a) x().a.i).getClass();
        com.yandex.plus.webview.api.c cVar = new com.yandex.plus.webview.api.c(A, h, a, false, com.yandex.plus.core.dispatcher.a.c, x().a.g);
        com.yandex.plus.webview.api.request.b bVar = (com.yandex.plus.webview.api.request.b) x().a.G.getValue();
        bVar.getClass();
        cVar.l = bVar;
        cVar.o = new y((View) this.k.x(s9fVarArr[1]), A());
        cVar.m = false;
        z();
        cVar.n = 15000L;
        com.yandex.plus.webview.internal.f a2 = cVar.a();
        this.o = a2;
        fkn fknVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a) this.h.getValue()).k;
        nyf lifecycle = getViewLifecycleOwner().getLifecycle();
        lyf lyfVar = lyf.d;
        Continuation continuation = null;
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(fknVar, lifecycle, lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.c(iVar, null, 1));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(z().t, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.b(this, a2, continuation, 3));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(z().r, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(this, continuation, 22));
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d x() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.g.getValue();
    }

    public final Button y() {
        return (Button) this.m.x(p[3]);
    }

    public final j z() {
        return (j) this.i.getValue();
    }
}
