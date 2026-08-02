package com.yandex.plus.pay.ui.yb.web.internal.di;

import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.pay.internal.d;
import com.yandex.plus.pay.ui.core.internal.di.g;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class c {
    public final com.yandex.plus.pay.ui.webview.paymentwidget.ui.c a;
    public final com.yandex.plus.log.api.b b;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b c;
    public final com.yandex.plus.core.dispatcher.b d;
    public final g e;
    public final com.yandex.plus.pay.ui.design.api.api.a f;
    public final jyr g;

    public c(i iVar, com.yandex.plus.pay.ui.webview.paymentwidget.ui.c cVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar2, com.yandex.plus.core.dispatcher.b bVar3, g gVar, com.yandex.plus.pay.ui.design.api.api.a aVar) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        gVar.getClass();
        aVar.getClass();
        this.a = cVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = bVar3;
        this.e = gVar;
        this.f = aVar;
        this.g = btf.b(new d(12, iVar, this));
    }
}
