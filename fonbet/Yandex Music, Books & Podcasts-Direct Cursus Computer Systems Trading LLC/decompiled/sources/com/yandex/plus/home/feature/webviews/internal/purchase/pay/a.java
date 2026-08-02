package com.yandex.plus.home.feature.webviews.internal.purchase.pay;

import defpackage.jyr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class a {
    public final com.yandex.plus.home.api.config.a a;
    public final Function0 b;
    public final com.yandex.plus.home.analytics.payment.c c;

    public a(com.yandex.plus.home.api.config.a aVar, Function1 function1, Function0 function0, Function0 function02, String str, Function0 function03, com.yandex.plus.home.analytics.payment.e eVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar, com.yandex.plus.home.analytics.payment.c cVar, boolean z) {
        aVar.getClass();
        str.getClass();
        eVar.getClass();
        cVar.getClass();
        this.a = aVar;
        this.b = function02;
        this.c = cVar;
    }

    public final void a() {
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.c;
        String str = "provideHostBuyView() bundle=" + this.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
        this.c.a(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a.c, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c.b, "Host has not provided view");
    }
}
