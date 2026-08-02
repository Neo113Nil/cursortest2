package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.arf;
import defpackage.b6e;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fe0;
import defpackage.fkn;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.laq;
import defpackage.lyf;
import defpackage.ncs;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/checkout/q;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class q extends androidx.fragment.app.o {
    public static final /* synthetic */ s9f[] s = {new yxm(q.class, "progressView", "getProgressView()Landroid/view/View;", 0), f1d.c(ern.a, q.class, "checkoutContentView", "getCheckoutContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/CheckoutContentView;", 0), new yxm(q.class, "paymentLoadingView", "getPaymentLoadingView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", 0), new yxm(q.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0)};
    public final jyr g;
    public final ybf h;
    public final ybf i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final com.yandex.passport.internal.core.accounts.h m;
    public String n;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j o;
    public com.yandex.plus.webview.internal.f p;
    public boolean q;
    public v r;

    public q() {
        super(R.layout.pay_sdk_fragment_tarifficator_checkout);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.i
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                q qVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = q.s;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(qVar);
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
                        s9f[] s9fVarArr2 = q.s;
                        return qVar.y().f();
                    default:
                        s9f[] s9fVarArr3 = q.s;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(h0.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(qVar.y().b, 6))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.i
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                q qVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = q.s;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(qVar);
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
                        s9f[] s9fVarArr2 = q.s;
                        return qVar.y().f();
                    default:
                        s9f[] s9fVarArr3 = q.s;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(h0.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(qVar.y().b, 6))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        m mVar = new m(this, 0);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new ncs(21, mVar));
        this.h = new ybf(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new n(a, 0), function0, new n(a, 1));
        final int i3 = 2;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.i
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                q qVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = q.s;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(qVar);
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
                        s9f[] s9fVarArr2 = q.s;
                        return qVar.y().f();
                    default:
                        s9f[] s9fVarArr3 = q.s;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(h0.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(qVar.y().b, 6))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a2 = btf.a(bwfVar, new ncs(22, new m(this, 1)));
        this.i = new ybf(ern.a(h0.class), new n(a2, 2), function02, new n(a2, 3));
        this.j = new com.yandex.passport.internal.core.accounts.h(new o(this, 0), new p(this, 0));
        this.k = new com.yandex.passport.internal.core.accounts.h(new o(this, 1), new p(this, 1));
        this.l = new com.yandex.passport.internal.core.accounts.h(new o(this, 2), new p(this, 2));
        this.m = new com.yandex.passport.internal.core.accounts.h(new o(this, 3), new p(this, 3));
    }

    public final h0 A() {
        return (h0) this.i.getValue();
    }

    public final WebViewContainer B() {
        return (WebViewContainer) this.m.x(s[3]);
    }

    public final void D() {
        v vVar;
        if (!this.q || (vVar = this.r) == null || (vVar instanceof t)) {
            return;
        }
        if (!(vVar instanceof s) && !(vVar instanceof u) && !(vVar instanceof r)) {
            b6e.s();
            return;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.e) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c) y().a.L0.getValue());
        com.yandex.plus.log.api.b bVar = eVar.e;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PerformanceSessionImpl", "onShowFirstScreen()");
        }
        eVar.a((com.yandex.plus.core.benchmark.l) eVar.f.getValue());
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar = this.o;
        if (jVar != null) {
            fe0 fe0Var = jVar.G;
            ViewTreeObserver viewTreeObserver = jVar.F;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(fe0Var);
            } else {
                jVar.a.getViewTreeObserver().removeOnScrollChangedListener(fe0Var);
            }
        }
        this.o = null;
        this.p = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        com.yandex.plus.webview.internal.f fVar = this.p;
        if (fVar != null) {
            fVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        com.yandex.plus.webview.internal.f fVar = this.p;
        if (fVar != null) {
            fVar.onResume();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        this.q = true;
        D();
    }

    @Override // androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        this.q = false;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new com.yandex.plus.home.feature.webviews.internal.stories.m(11, this));
        int i = 0;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j(x(), new com.yandex.plus.home.feature.webviews.internal.webview.a(1, A(), h0.class, "onPaymentMethodClick", "onPaymentMethodClick(Ljava/lang/String;)V", 0, 29), new l(1, A(), h0.class, "onPaymentPromoCardClick", "onPaymentPromoCardClick(Ljava/lang/String;)V", 0, i), new l(1, A(), h0.class, "onMailingAdsAgreementStatusChanged", "onMailingAdsAgreementStatusChanged(Z)V", i, 1), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, A(), h0.class, "onPaymentButtonClick", "onPaymentButtonClick()V", 0, 23), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, A(), h0.class, "onCloseButtonClick", "onCloseButtonClick()V", 0, 24), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, A(), h0.class, "onLegalTextShown", "onLegalTextShown()V", 0, 25), new com.yandex.plus.home.feature.webviews.internal.smart.h(2, A(), h0.class, "onOnsaleSelectedChanged", "onOnsaleSelectedChanged(Ljava/lang/String;Z)V", 0, 4), new l(1, A(), h0.class, "onOfferSwitchSelectedChanged", "onOfferSwitchSelectedChanged(Z)V", 0, 2), y().a.j, y().a.q);
        this.o = jVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b((BottomSheetLoadingView) this.l.x(s[2]));
        ViewGroup.LayoutParams layoutParams = B().getLayoutParams();
        Continuation continuation = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = B().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = B().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i4 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = B().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i5 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        j jVar2 = new j(this, i2, i3, i4, i5, jVar, bVar);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(jVar2, aVar);
        dVar.b(view);
        WebViewContainer B = B();
        com.yandex.plus.pay.ui.webview.confirmation.c cVar = (com.yandex.plus.pay.ui.webview.confirmation.c) y().a.E0.getValue();
        androidx.fragment.app.t requireActivity = requireActivity();
        requireActivity.getClass();
        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(cVar.a(requireActivity, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(16, this))));
        com.yandex.plus.core.network.ssl.a a = y().a.t.a("TarifficatorCheckoutPayment3DSWebView");
        ((com.yandex.plus.core.dispatcher.a) y().a.i).getClass();
        com.yandex.plus.webview.internal.f a2 = new com.yandex.plus.webview.api.c(B, h, a, false, com.yandex.plus.core.dispatcher.a.c, y().a.g).a();
        this.p = a2;
        fkn fknVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a) this.h.getValue()).k;
        nyf lifecycle = getViewLifecycleOwner().getLifecycle();
        lyf lyfVar = lyf.d;
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(fknVar, lifecycle, lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(jVar, continuation, 17));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(A().K, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new k(this, jVar, bVar, a2, null, 0));
    }

    public final CheckoutContentView x() {
        return (CheckoutContentView) this.k.x(s[1]);
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d y() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.g.getValue();
    }

    public final View z() {
        return (View) this.j.x(s[0]);
    }
}
