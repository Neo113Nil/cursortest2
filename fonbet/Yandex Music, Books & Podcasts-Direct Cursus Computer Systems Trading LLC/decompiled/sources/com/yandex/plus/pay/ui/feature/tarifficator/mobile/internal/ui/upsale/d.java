package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.UpsaleContentView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fe0;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.lyf;
import defpackage.nme;
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
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/upsale/d;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class d extends o {
    public static final /* synthetic */ s9f[] o = {new yxm(d.class, "progressView", "getProgressView()Landroid/view/View;", 0), f1d.c(ern.a, d.class, "upsaleContentView", "getUpsaleContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/upsale/UpsaleContentView;", 0), new yxm(d.class, "paymentLoadingView", "getPaymentLoadingView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", 0), new yxm(d.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0)};
    public final jyr g;
    public final ybf h;
    public final com.yandex.passport.internal.core.accounts.h i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c m;
    public com.yandex.plus.webview.internal.f n;

    public d() {
        super(R.layout.pay_sdk_fragment_tarifficator_upsale);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = d.o;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(dVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o2 = ((com.yandex.plus.di.d) it.next()).o();
                            if (o2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o2;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr2 = d.o;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(m.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(dVar.x().b, 11))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = d.o;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(dVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o2 = ((com.yandex.plus.di.d) it.next()).o();
                            if (o2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o2;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr2 = d.o;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(m.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(dVar.x().b, 11))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(12, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(11, this)));
        this.h = new ybf(ern.a(m.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.c(a, 6), function0, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.c(a, 7));
        this.i = new com.yandex.passport.internal.core.accounts.h(new b(this, 0), new c(this, 0));
        this.j = new com.yandex.passport.internal.core.accounts.h(new b(this, 1), new c(this, 1));
        this.k = new com.yandex.passport.internal.core.accounts.h(new b(this, 2), new c(this, 2));
        this.l = new com.yandex.passport.internal.core.accounts.h(new b(this, 3), new c(this, 3));
    }

    public final WebViewContainer A() {
        return (WebViewContainer) this.l.x(o[3]);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar = this.m;
        if (cVar != null) {
            fe0 fe0Var = cVar.r;
            ViewTreeObserver viewTreeObserver = cVar.q;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(fe0Var);
            } else {
                cVar.a.getViewTreeObserver().removeOnScrollChangedListener(fe0Var);
            }
        }
        this.m = null;
        this.n = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        com.yandex.plus.webview.internal.f fVar = this.n;
        if (fVar != null) {
            fVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        com.yandex.plus.webview.internal.f fVar = this.n;
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
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new com.yandex.plus.home.feature.webviews.internal.stories.m(21, this));
        s9f[] s9fVarArr = o;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c((UpsaleContentView) this.j.x(s9fVarArr[1]), x().a.j, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, z(), m.class, "onAcceptUpsale", "onAcceptUpsale()V", 0, 11), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, z(), m.class, "onRejectUpsale", "onRejectUpsale()V", 0, 12), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, z(), m.class, "onLegalTextShown", "onLegalTextShown()V", 0, 13));
        this.m = cVar;
        WebViewContainer A = A();
        com.yandex.plus.pay.ui.webview.confirmation.c cVar2 = (com.yandex.plus.pay.ui.webview.confirmation.c) x().a.E0.getValue();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(cVar2.a(requireActivity, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(19, this))));
        com.yandex.plus.core.network.ssl.a a = x().a.t.a("TarifficatorUpsale3DSWebView");
        ((com.yandex.plus.core.dispatcher.a) x().a.i).getClass();
        com.yandex.plus.webview.internal.f a2 = new com.yandex.plus.webview.api.c(A, h, a, false, com.yandex.plus.core.dispatcher.a.c, x().a.g).a();
        this.n = a2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.b((BottomSheetLoadingView) this.k.x(s9fVarArr[2]));
        ViewGroup.LayoutParams layoutParams = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.j jVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.j(this, i, i2, i3, i4, bVar, cVar);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(jVar, aVar);
        dVar.b(view);
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(z().z, getViewLifecycleOwner().getLifecycle(), lyf.d), com.yandex.plus.bdui.plus.analytics.b.n(this), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.k(this, cVar, bVar, a2, null, 1));
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d x() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.g.getValue();
    }

    public final View y() {
        return (View) this.i.x(o[0]);
    }

    public final m z() {
        return (m) this.h.getValue();
    }
}
