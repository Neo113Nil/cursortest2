package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.internal.di.y;
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
import defpackage.ncs;
import defpackage.nme;
import defpackage.s9f;
import defpackage.sy6;
import defpackage.t75;
import defpackage.ybf;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/ui/form/e;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class e extends o {
    public static final /* synthetic */ s9f[] o = {new yxm(e.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0), f1d.c(ern.a, e.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0), new yxm(e.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0)};
    public final jyr g;
    public final ybf h;
    public final com.yandex.passport.internal.core.accounts.h i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;
    public com.yandex.plus.webview.internal.f l;
    public final jyr m;
    public String n;

    public e() {
        super(R.layout.pay_sdk_fragment_debug_report);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.form.a
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
                        s9f[] s9fVarArr = e.o;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(eVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o2 = ((com.yandex.plus.di.d) it.next()).o();
                            if (o2 instanceof com.yandex.plus.pay.ui.core.debug.internal.common.di.b) {
                                return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) o2;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.internal.common.di.b.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr2 = e.o;
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) eVar.g.getValue();
                        bVar.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(bVar, 2))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.form.a
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
                        s9f[] s9fVarArr = e.o;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(eVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o2 = ((com.yandex.plus.di.d) it.next()).o();
                            if (o2 instanceof com.yandex.plus.pay.ui.core.debug.internal.common.di.b) {
                                return (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) o2;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.core.debug.internal.common.di.b.class, l);
                        return null;
                    default:
                        s9f[] s9fVarArr2 = e.o;
                        com.yandex.plus.pay.ui.core.debug.internal.common.di.b bVar = (com.yandex.plus.pay.ui.core.debug.internal.common.di.b) eVar.g.getValue();
                        bVar.getClass();
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.core.debug.internal.common.di.a(bVar, 2))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a = btf.a(bwf.c, new ncs(16, new ncs(15, this)));
        this.h = new ybf(ern.a(j.class), new sy6(a, 24), function0, new sy6(a, 25));
        this.i = new com.yandex.passport.internal.core.accounts.h(new c(this, i), new d(this, i));
        this.j = new com.yandex.passport.internal.core.accounts.h(new c(this, i2), new d(this, i2));
        int i3 = 2;
        this.k = new com.yandex.passport.internal.core.accounts.h(new c(this, i3), new d(this, i3));
        this.m = btf.b(new com.yandex.plus.pay.internal.model.a(23));
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        this.l = null;
        super.onDestroy();
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
        s9f[] s9fVarArr = o;
        r1.E((ImageButton) this.i.x(s9fVarArr[0]), new com.yandex.plus.home.feature.webviews.internal.home.i(3, this));
        WebViewContainer x = x();
        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(t75.c((com.yandex.plus.pay.ui.core.debug.internal.ui.form.web.a) this.m.getValue()));
        jyr jyrVar = this.g;
        com.yandex.plus.core.network.ssl.a a = ((com.yandex.plus.pay.ui.core.debug.internal.common.di.b) jyrVar.getValue()).a.b().a("ReportForm");
        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.pay.ui.core.debug.internal.common.di.b) jyrVar.getValue()).d).getClass();
        com.yandex.plus.webview.api.c cVar = new com.yandex.plus.webview.api.c(x, h, a, false, com.yandex.plus.core.dispatcher.a.c, com.yandex.plus.pay.ui.core.debug.internal.common.a.a);
        cVar.j = new m(24, new m(6, this));
        cVar.m = false;
        cVar.p = com.yandex.plus.webview.api.e.a;
        cVar.o = new y((View) this.j.x(s9fVarArr[1]), x());
        this.l = cVar.a();
        x().getWebView().getSettings().setDomStorageEnabled(false);
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(((j) this.h.getValue()).m, getViewLifecycleOwner().getLifecycle(), lyf.d), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(this, (Continuation) null, 16));
    }

    public final WebViewContainer x() {
        return (WebViewContainer) this.k.x(o[2]);
    }
}
