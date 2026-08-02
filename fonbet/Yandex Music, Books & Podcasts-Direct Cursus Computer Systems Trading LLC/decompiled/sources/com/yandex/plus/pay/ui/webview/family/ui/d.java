package com.yandex.plus.pay.ui.webview.family.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.l;
import com.yandex.plus.pay.ui.webview.family.domain.e;
import com.yandex.plus.pay.ui.webview.family.domain.f;
import com.yandex.plus.webview.api.contract.i;
import com.yandex.plus.webview.api.contract.j;
import com.yandex.plus.webview.api.contract.k;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.ouj;
import defpackage.vdr;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d extends com.yandex.plus.webview.api.contract.a implements a, j, i, com.yandex.plus.webview.core.i {
    public final /* synthetic */ k e;
    public final com.yandex.plus.log.api.b f;
    public final b g;
    public final com.yandex.plus.pay.ui.common.internal.web.a h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.yandex.plus.log.api.b bVar, b bVar2, com.yandex.plus.pay.ui.common.internal.web.a aVar, com.yandex.plus.webview.api.contract.message.d dVar, kotlinx.coroutines.a aVar2, boolean z) {
        super(dVar, null, aVar2);
        bVar.getClass();
        aVar2.getClass();
        this.e = new k();
        this.f = bVar;
        this.g = bVar2;
        this.h = aVar;
        this.i = z;
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        this.g.a();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        y(i, str, str2, str3, "ssl", z);
        this.h.d(i, str, str2, str3, z);
        if (z) {
            this.g.b("ssl");
        }
    }

    @Override // com.yandex.plus.webview.api.contract.c
    public final int e(Context context) {
        context.getClass();
        return com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_primaryBlockColor);
    }

    @Override // com.yandex.plus.webview.api.contract.i
    public final void i() {
        this.g.c();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        y(i, str, str2, str3, "unexpected", z);
        this.h.k(i, str, str2, str3, z);
        if (z) {
            this.g.b("other");
        }
    }

    @Override // com.yandex.plus.webview.api.contract.a, com.yandex.plus.webview.api.javascript.a
    @JavascriptInterface
    public void onMessage(@NotNull String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.f;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractImpl", "onMessage: ".concat(str));
        }
        super.onMessage(str);
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return this.e.b();
    }

    @Override // com.yandex.plus.webview.api.a
    public final void s(String str) {
        com.yandex.plus.webview.core.d w;
        str.getClass();
        if (!this.i || (w = w()) == null) {
            return;
        }
        w.b("document.addEventListener(\"DOMContentLoaded\", function() {\n    document.body.style.setProperty(\"background\", \"transparent\", \"important\");\n});");
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        y(i, str, str2, str3, "http", z);
        this.h.u(i, str, str2, str3, z);
        if (z) {
            this.g.b("http");
        }
    }

    @Override // com.yandex.plus.webview.api.contract.a
    public final void x(com.yandex.plus.webview.api.contract.message.d dVar) {
        dVar.getClass();
        dVar.c(com.yandex.plus.pay.ui.webview.family.domain.c.class, new l(1, this, d.class, "handleReadyMessage", "handleReadyMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$Ready;)V", 0, 6));
        int i = 0;
        int i2 = 1;
        dVar.c(com.yandex.plus.pay.ui.webview.family.domain.d.class, new l(i2, this, d.class, "handleReadyForMessagingMessage", "handleReadyForMessagingMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$ReadyForMessaging;)V", i, 7));
        dVar.c(e.class, new l(i2, this, d.class, "handleSendMetricsMessage", "handleSendMetricsMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$SendMetrics;)V", i, 8));
        dVar.c(com.yandex.plus.pay.ui.webview.family.domain.b.class, new l(i2, this, d.class, "handleOpenNativeSharingMessage", "handleOpenNativeSharingMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$OpenNativeSharing;)V", i, 9));
        dVar.c(f.class, new l(i2, this, d.class, "handleUnknownMessage", "handleUnknownMessage(Lcom/yandex/plus/pay/ui/webview/family/domain/FamilyWebMessage$Unknown;)V", i, 10));
    }

    public final void y(int i, String str, String str2, String str3, String str4, boolean z) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.f;
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
            bVar.c(aVar, "FamilyContractImpl", m.toString());
        }
    }
}
