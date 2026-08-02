package com.yandex.plus.pay.ui.webview.paymentwidget.ui;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g;
import com.yandex.plus.pay.ui.webview.paymentwidget.domain.k;
import defpackage.xz0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c {
    public final Function0 a;
    public final k b;
    public final g c;
    public final com.yandex.plus.log.api.b d;
    public final kotlinx.coroutines.a e;
    public final kotlinx.coroutines.a f;

    public c(Function0 function0, k kVar, g gVar, com.yandex.plus.log.api.b bVar, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2) {
        kVar.getClass();
        gVar.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = function0;
        this.b = kVar;
        this.c = gVar;
        this.d = bVar;
        this.e = aVar;
        this.f = aVar2;
    }

    public final d a(String str, long j, long j2, b bVar) {
        str.getClass();
        g gVar = this.c;
        com.yandex.plus.pay.ui.webview.common.diagnostic.a a = gVar.a(str);
        com.yandex.plus.pay.ui.webview.common.diagnostic.a a2 = gVar.a(str);
        com.yandex.plus.pay.ui.common.internal.web.a aVar = new com.yandex.plus.pay.ui.common.internal.web.a(a);
        com.yandex.plus.webview.api.contract.message.d dVar = new com.yandex.plus.webview.api.contract.message.d(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(21, this), this.f);
        return new d(this.a, j, j2, this.d, bVar, a2, aVar, new com.yandex.plus.pay.ui.common.internal.web.b(a), xz0.X(com.yandex.plus.pay.ui.webview.paymentwidget.a.a), dVar, this.e);
    }
}
