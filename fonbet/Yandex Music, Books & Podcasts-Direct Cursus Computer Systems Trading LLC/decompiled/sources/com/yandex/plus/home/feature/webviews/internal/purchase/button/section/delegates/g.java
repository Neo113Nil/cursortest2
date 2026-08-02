package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.yandex.passport.internal.flags.experiments.p;
import defpackage.dkn;
import defpackage.pjc;

/* loaded from: classes5.dex */
public final class g extends c {
    public final com.yandex.plus.home.plaque.feature.internal.presentation.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlinx.coroutines.a aVar, com.yandex.plus.acquisition.sdk.common.api.di.b bVar, p pVar, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar, p pVar2, com.yandex.plus.home.plaque.feature.internal.presentation.b bVar2) {
        super(aVar, bVar, pVar, fVar, cVar, pVar2);
        aVar.getClass();
        this.k = bVar2;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c
    public final pjc d() {
        return (dkn) this.k.f;
    }
}
