package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
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
import defpackage.ncs;
import defpackage.nme;
import defpackage.nyf;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/contacts/g;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class g extends o {
    public static final /* synthetic */ s9f[] q = {new yxm(g.class, "root", "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), f1d.c(ern.a, g.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new yxm(g.class, "progressView", "getProgressView()Landroid/view/View;", 0), new yxm(g.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new yxm(g.class, "skipButton", "getSkipButton()Landroid/widget/Button;", 0)};
    public final jyr g;
    public final ybf h;
    public final ybf i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final com.yandex.passport.internal.core.accounts.h m;
    public final com.yandex.passport.internal.core.accounts.h n;
    public String o;
    public com.yandex.plus.webview.internal.f p;

    public g() {
        super(R.layout.pay_sdk_fragment_tarifficator_contacts);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                g gVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = g.q;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(gVar);
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
                        s9f[] s9fVarArr2 = g.q;
                        return gVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = g.q;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(gVar.x().b, 12))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = g.q;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(gVar);
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
                        s9f[] s9fVarArr2 = g.q;
                        return gVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = g.q;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(gVar.x().b, 12))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        d dVar = new d(this, 0);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new ncs(25, dVar));
        this.h = new ybf(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new n(a, 8), function0, new n(a, 9));
        final int i3 = 2;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.a
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = g.q;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(gVar);
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
                        s9f[] s9fVarArr2 = g.q;
                        return gVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = g.q;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(gVar.x().b, 12))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a2 = btf.a(bwfVar, new ncs(26, new d(this, 1)));
        this.i = new ybf(ern.a(k.class), new n(a2, 10), function02, new n(a2, 11));
        this.j = new com.yandex.passport.internal.core.accounts.h(new f(this, 0), new e(this, 1));
        this.k = new com.yandex.passport.internal.core.accounts.h(new f(this, 1), new e(this, 2));
        this.l = new com.yandex.passport.internal.core.accounts.h(new f(this, 2), new e(this, 3));
        this.m = new com.yandex.passport.internal.core.accounts.h(new f(this, 3), new e(this, 4));
        this.n = new com.yandex.passport.internal.core.accounts.h(new f(this, 4), new e(this, 0));
    }

    public final WebViewContainer A() {
        return (WebViewContainer) this.m.x(q[3]);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
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
        WebViewContainer A = A();
        com.yandex.plus.core.insets.d dVar2 = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.bdui.plus.checkout.i iVar = new com.yandex.plus.bdui.plus.checkout.i(1, this);
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.b();
        dVar2.b.put(iVar, aVar2);
        dVar2.b(A);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(13, this));
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.i iVar2 = new com.yandex.plus.pay.ui.core.mobile.view.toolbar.i((PlusPayToolbarView) this.k.x(q[1]), x().a.q, x().a.j, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k(0, z(), k.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0, 29));
        WebView webView = A().getWebView();
        Context context = view.getContext();
        context.getClass();
        webView.setBackgroundColor(com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_primaryBlockColor));
        r1.E(y(), new com.yandex.plus.home.feature.webviews.internal.home.i(7, this));
        fkn fknVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a) this.h.getValue()).k;
        nyf lifecycle = getViewLifecycleOwner().getLifecycle();
        lyf lyfVar = lyf.d;
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(fknVar, lifecycle, lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new c(iVar2, null, 0));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(z().q, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(this, (Continuation) null, 19));
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d x() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.g.getValue();
    }

    public final Button y() {
        return (Button) this.n.x(q[4]);
    }

    public final k z() {
        return (k) this.i.getValue();
    }
}
