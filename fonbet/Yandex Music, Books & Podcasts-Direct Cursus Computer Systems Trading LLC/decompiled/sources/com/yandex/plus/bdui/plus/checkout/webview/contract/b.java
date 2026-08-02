package com.yandex.plus.bdui.plus.checkout.webview.contract;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.plus.checkout.h;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.webview.q;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.webview.paymentwidget.ui.c;
import com.yandex.plus.webview.internal.f;
import defpackage.btf;
import defpackage.gld;
import defpackage.jyr;
import defpackage.mxr;
import defpackage.q5b;
import defpackage.tf6;
import defpackage.vdr;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b implements com.yandex.plus.pay.ui.webview.paymentwidget.ui.a, com.yandex.plus.webview.api.a {
    public final q a;
    public final com.yandex.plus.pay.ui.core.api.domain.a b;
    public final y c;
    public final com.yandex.plus.log.api.b d;
    public final tf6 e;
    public final q5b f;
    public final jyr g;
    public final jyr h;

    public b(q qVar, c cVar, o oVar, com.yandex.plus.pay.ui.core.api.domain.a aVar, kotlinx.coroutines.a aVar2, y yVar, com.yandex.plus.log.api.b bVar) {
        qVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        yVar.getClass();
        bVar.getClass();
        this.a = qVar;
        this.b = aVar;
        this.c = yVar;
        this.d = bVar;
        this.e = gld.e(aVar2);
        this.f = q5b.a;
        this.g = btf.b(new h(2, this));
        this.h = btf.b(new p(4, cVar, this, oVar));
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        com.yandex.plus.pay.ui.core.mobile.haptic.a aVar = Intrinsics.d((String) this.g.getValue(), "success") ? com.yandex.plus.pay.ui.core.mobile.haptic.a.a : null;
        if (aVar != null) {
            this.a.d.post(new com.yandex.passport.internal.interaction.c(9, this, aVar));
        }
    }

    public final com.yandex.plus.pay.ui.webview.paymentwidget.ui.a d() {
        return (com.yandex.plus.pay.ui.webview.paymentwidget.ui.a) this.h.getValue();
    }

    @Override // com.yandex.plus.webview.api.contract.c
    public final int e(Context context) {
        context.getClass();
        return d().e(context);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.a
    @JavascriptInterface
    public String getToken() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.d;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "getToken()");
        }
        return d().getToken();
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final Object l(mxr mxrVar) {
        return d().l(mxrVar);
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.a
    @JavascriptInterface
    public void onEvent(@NotNull String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.d;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onEvent(); message = ".concat(str));
        }
        d().onEvent(str);
    }

    @Override // com.yandex.plus.webview.api.javascript.a
    @JavascriptInterface
    public void onMessage(@NotNull String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.d;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "onMessage(); message = ".concat(str));
        }
        d().onMessage(str);
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return d().q();
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final q5b r() {
        return this.f;
    }

    @Override // com.yandex.plus.webview.api.javascript.b
    @JavascriptInterface
    /* renamed from: sendMessage, reason: merged with bridge method [inline-methods] */
    public void v(@NotNull Unit unit) {
        unit.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.d;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebPaymentWidgetContractWrapper", "sendMessage()");
        }
        d().v(unit);
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void t(f fVar, com.yandex.passport.legacy.lx.f fVar2) {
        d().t(fVar, fVar2);
    }
}
