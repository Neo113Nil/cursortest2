package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.laq;
import defpackage.lyf;
import defpackage.nme;
import defpackage.qpj;
import defpackage.s9f;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/topup/d;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class d extends o {
    public static final /* synthetic */ s9f[] m = {new yxm(d.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0), f1d.c(ern.a, d.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0)};
    public final jyr g;
    public final ybf h;
    public final com.yandex.passport.internal.core.accounts.h i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public String k;
    public com.yandex.plus.webview.internal.f l;

    public d() {
        super(R.layout.pay_sdk_fragment_tarifficator_topup);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a
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
                        s9f[] s9fVarArr = d.m;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(dVar);
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
                        s9f[] s9fVarArr2 = d.m;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(h.class), new j(dVar.x().b, 3))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.a
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
                        s9f[] s9fVarArr = d.m;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(dVar);
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
                        s9f[] s9fVarArr2 = d.m;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(h.class), new j(dVar.x().b, 3))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(10, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(9, this)));
        this.h = new ybf(ern.a(h.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.c(a, 4), function0, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.c(a, 5));
        this.i = new com.yandex.passport.internal.core.accounts.h(new b(this, 0), new c(this, 0));
        this.j = new com.yandex.passport.internal.core.accounts.h(new b(this, 1), new c(this, 1));
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
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.core.insets.j jVar = com.yandex.plus.core.insets.j.c;
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(jVar, aVar);
        dVar.b(view);
        WebView webView = z().getWebView();
        Context context = view.getContext();
        context.getClass();
        webView.setBackgroundColor(com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_primaryBlockColor));
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(20, this));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(y().q, getViewLifecycleOwner().getLifecycle(), lyf.d), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(this, (Continuation) null, 25));
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d x() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.g.getValue();
    }

    public final h y() {
        return (h) this.h.getValue();
    }

    public final WebViewContainer z() {
        return (WebViewContainer) this.j.x(m[1]);
    }
}
