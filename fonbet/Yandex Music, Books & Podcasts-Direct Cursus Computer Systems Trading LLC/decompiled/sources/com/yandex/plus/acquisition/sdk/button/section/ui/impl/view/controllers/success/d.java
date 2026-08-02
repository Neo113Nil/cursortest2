package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success;

import com.yandex.passport.common.network.n;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f;
import defpackage.mw3;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class d extends mw3 {
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a h;
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a i;
    public final n j;
    public final LinkedHashMap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.c cVar, com.yandex.plus.acquisition.sdk.pay.impl.b bVar, com.yandex.plus.core.strings.a aVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar2, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar3, n nVar) {
        super(fVar, cVar, bVar, aVar);
        cVar.getClass();
        aVar.getClass();
        this.h = aVar2;
        this.i = aVar3;
        this.j = nVar;
        this.k = new LinkedHashMap();
    }

    @Override // defpackage.mw3
    public final void g() {
        super.g();
        this.k.clear();
    }
}
