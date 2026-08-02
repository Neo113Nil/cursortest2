package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.l;
import com.yandex.plus.pay.ui.webview.paymentwidget.domain.e;
import com.yandex.plus.pay.ui.webview.paymentwidget.domain.f;
import com.yandex.plus.pay.ui.webview.paymentwidget.domain.g;
import com.yandex.plus.pay.ui.webview.paymentwidget.domain.h;
import com.yandex.plus.webview.api.contract.i;
import com.yandex.plus.webview.api.contract.j;
import com.yandex.plus.webview.api.contract.k;
import defpackage.a4g;
import defpackage.b6e;
import defpackage.ca8;
import defpackage.dq7;
import defpackage.f1d;
import defpackage.gld;
import defpackage.hrg;
import defpackage.j5h;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.vdr;
import defpackage.wqr;
import defpackage.x97;
import defpackage.z7o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d extends com.yandex.plus.webview.api.contract.a implements a, j, i, com.yandex.plus.webview.api.security.a, com.yandex.plus.webview.api.security.b, com.yandex.plus.webview.api.a, com.yandex.plus.webview.core.i {
    public static final List r = t75.c("/android_asset/");
    public final /* synthetic */ k e;
    public final Function0 f;
    public final long g;
    public final long h;
    public final com.yandex.plus.log.api.b i;
    public final b j;
    public final com.yandex.plus.pay.ui.webview.common.diagnostic.a k;
    public final com.yandex.plus.pay.ui.common.internal.web.a l;
    public final com.yandex.plus.pay.ui.common.internal.web.b m;
    public final List n;
    public String o;
    public final wqr p;
    public final tf6 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function0 function0, long j, long j2, com.yandex.plus.log.api.b bVar, b bVar2, com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar, com.yandex.plus.pay.ui.common.internal.web.a aVar2, com.yandex.plus.pay.ui.common.internal.web.b bVar3, List list, com.yandex.plus.webview.api.contract.message.d dVar, kotlinx.coroutines.a aVar3) {
        super(dVar, null, aVar3);
        bVar.getClass();
        aVar.getClass();
        list.getClass();
        aVar3.getClass();
        this.e = new k();
        this.f = function0;
        this.g = j;
        this.h = j2;
        this.i = bVar;
        this.j = bVar2;
        this.k = aVar;
        this.l = aVar2;
        this.m = bVar3;
        this.n = list;
        wqr n = a4g.n();
        this.p = n;
        dq7 dq7Var = ca8.a;
        this.q = gld.e(j5h.a.plus(n));
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractImpl", "WebView loaded url successfully");
        }
        this.j.a();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        y(i, str, str2, str3, "ssl", z);
        this.l.d(i, str, str2, str3, z);
        if (z) {
            this.j.b("ssl");
        }
    }

    @Override // com.yandex.plus.webview.api.contract.c
    public final int e(Context context) {
        context.getClass();
        return com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_primaryBlockColor);
    }

    @Override // com.yandex.plus.webview.api.security.a
    public final boolean f(com.yandex.plus.webview.core.resource.c cVar) {
        Object t7oVar;
        cVar.getClass();
        if (!(cVar instanceof com.yandex.plus.webview.core.resource.a)) {
            if (cVar instanceof com.yandex.plus.webview.core.resource.b) {
                return true;
            }
            b6e.s();
            return false;
        }
        com.yandex.plus.webview.core.resource.a aVar = (com.yandex.plus.webview.core.resource.a) cVar;
        int ordinal = aVar.c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                b6e.s();
                return false;
            }
            Uri uri = aVar.a;
            if (kotlin.text.c.o(uri.getScheme(), "file", true)) {
                String path = uri.getPath();
                if (path != null) {
                    List list = r;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (kotlin.text.c.v(path, (String) it.next(), false)) {
                            }
                        }
                    }
                }
                return false;
            }
            try {
                r7o r7oVar = z7o.b;
                t7oVar = uri.getHost();
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            String str = (String) t7oVar;
            if (str == null) {
                return false;
            }
            List list2 = this.n;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.d((String) it2.next(), str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.yandex.plus.webview.api.contract.a, com.yandex.plus.webview.api.contract.d
    public final void g() {
        gld.L(this.q, null);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.a
    @JavascriptInterface
    public String getToken() {
        return (String) this.f.invoke();
    }

    @Override // com.yandex.plus.webview.api.contract.i
    public final void i() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractImpl", "Message timeout!");
        }
        this.j.y("Message timeout!");
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        y(i, str, str2, str3, "other", z);
        this.l.k(i, str, str2, str3, z);
        if (z) {
            this.j.b("other");
        }
    }

    @Override // com.yandex.plus.webview.api.security.b
    public final void o(com.yandex.plus.webview.core.resource.a aVar) {
        this.m.o(aVar);
        this.j.b("Domain " + aVar.a.getHost() + " is not allowed");
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.a
    @JavascriptInterface
    public void onEvent(@NotNull String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractImpl", "onEvent: ".concat(str));
        }
        onMessage(str);
    }

    @Override // com.yandex.plus.webview.api.security.b
    public final void p(com.yandex.plus.webview.core.resource.a aVar) {
        this.m.getClass();
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return this.e.b();
    }

    @Override // com.yandex.plus.webview.api.a
    public final void s(String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractImpl", "WebView started url loading: ".concat(str));
        }
        this.o = str;
        x97.y(this.q, null, null, new com.yandex.plus.experiments.impl.cache.b(this, str, null, 13), 3);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        y(i, str, str2, str3, "http", z);
        this.l.u(i, str, str2, str3, z);
        if (z) {
            this.j.b("http");
        }
    }

    @Override // com.yandex.plus.webview.api.contract.a
    public final void x(com.yandex.plus.webview.api.contract.message.d dVar) {
        dVar.getClass();
        dVar.c(f.class, new l(1, this, d.class, "handleStartedMessage", "handleStartedMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Started;)V", 0, 11));
        int i = 0;
        int i2 = 1;
        dVar.c(com.yandex.plus.pay.ui.webview.paymentwidget.domain.c.class, new l(i2, this, d.class, "handleLoadedMessage", "handleLoadedMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Loaded;)V", i, 12));
        dVar.c(g.class, new l(i2, this, d.class, "handleSuccessMessage", "handleSuccessMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Success;)V", i, 13));
        dVar.c(com.yandex.plus.pay.ui.webview.paymentwidget.domain.i.class, new l(i2, this, d.class, "handleYbOpenCardSuccessMessage", "handleYbOpenCardSuccessMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$YbOpenCardSuccess;)V", i, 14));
        dVar.c(com.yandex.plus.pay.ui.webview.paymentwidget.domain.a.class, new l(i2, this, d.class, "handleCloseMessage", "handleCloseMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Close;)V", i, 15));
        dVar.c(com.yandex.plus.pay.ui.webview.paymentwidget.domain.b.class, new l(i2, this, d.class, "handleErrorMessage", "handleErrorMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Error;)V", i, 16));
        dVar.c(com.yandex.plus.pay.ui.webview.paymentwidget.domain.d.class, new l(i2, this, d.class, "handleNeedAuthMessage", "handleNeedAuthMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$NeedAuth;)V", i, 17));
        dVar.c(e.class, new l(i2, this, d.class, "handleOpenUriMessage", "handleOpenUriMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$OpenUri;)V", i, 18));
        dVar.c(h.class, new l(i2, this, d.class, "handleUnknownMessage", "handleUnknownMessage(Lcom/yandex/plus/pay/ui/webview/paymentwidget/domain/WebPaymentWidgetMessage$Unknown;)V", i, 19));
    }

    public final void y(int i, String str, String str2, String str3, String str4, boolean z) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar)) {
            String k = ouj.k('\"', "URL \"", str);
            if (!z) {
                k = hrg.r("resource \"", str2, "\" for ", k);
            }
            StringBuilder m = f1d.m("WebView couldn't load ", k, " because of ", str4, " error: errorCode=");
            m.append(i);
            m.append(", description=");
            m.append(str3);
            m.append('!');
            bVar.c(aVar, "WebPaymentWidgetContractImpl", m.toString());
        }
    }
}
