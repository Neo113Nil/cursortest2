package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.n;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.a37;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
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
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/silent/e;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class e extends o {
    public static final /* synthetic */ s9f[] m = {new yxm(e.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), f1d.c(ern.a, e.class, "loadingView", "getLoadingView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/loading/PlusPayPaymentLoadingView;", 0)};
    public final jyr g;
    public final ybf h;
    public final com.yandex.passport.internal.core.accounts.h i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public String k;
    public com.yandex.plus.webview.internal.f l;

    public e() {
        super(R.layout.pay_sdk_fragment_tarifficator_silent);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.a
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
                        s9f[] s9fVarArr = e.m;
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
                    default:
                        s9f[] s9fVarArr2 = e.m;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(l.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) eVar.g.getValue()).b, 5))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.a
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
                        s9f[] s9fVarArr = e.m;
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
                    default:
                        s9f[] s9fVarArr2 = e.m;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(l.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) eVar.g.getValue()).b, 5))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(6, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(5, this)));
        this.h = new ybf(ern.a(l.class), new n(a, 28), function0, new n(a, 29));
        this.i = new com.yandex.passport.internal.core.accounts.h(new c(this, 0), new d(this, 0));
        this.j = new com.yandex.passport.internal.core.accounts.h(new c(this, 1), new d(this, 1));
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        this.l = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        com.yandex.plus.webview.internal.f fVar = this.l;
        if (fVar != null) {
            fVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        com.yandex.plus.webview.internal.f fVar = this.l;
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
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(18, this));
        WebViewContainer x = x();
        jyr jyrVar = this.g;
        com.yandex.plus.pay.ui.webview.confirmation.c cVar = (com.yandex.plus.pay.ui.webview.confirmation.c) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.E0.getValue();
        t requireActivity = requireActivity();
        requireActivity.getClass();
        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c(cVar.a(requireActivity, new com.yandex.plus.home.plaque.plugin.internal.proxy.a(18, this))));
        com.yandex.plus.core.network.ssl.a a = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.t.a("TarifficatorSilentPayment3DSWebView");
        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.i).getClass();
        com.yandex.plus.webview.internal.f a2 = new com.yandex.plus.webview.api.c(x, h, a, false, com.yandex.plus.core.dispatcher.a.c, ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.g).a();
        this.l = a2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b bVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b((PlusPayPaymentLoadingView) this.j.x(m[1]));
        ViewGroup.LayoutParams layoutParams = x().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = x().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = x().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = x().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        b bVar2 = new b(this, i, i2, i3, i4, bVar, 0);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(bVar2, aVar);
        dVar.b(view);
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(((l) this.h.getValue()).v, getViewLifecycleOwner().getLifecycle(), lyf.d), com.yandex.plus.bdui.plus.analytics.b.n(this), new a37(this, bVar, a2, (Continuation) null));
    }

    public final WebViewContainer x() {
        return (WebViewContainer) this.i.x(m[0]);
    }
}
