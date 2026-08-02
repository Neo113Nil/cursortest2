package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.t;
import defpackage.pjc;
import defpackage.x0q;

/* loaded from: classes5.dex */
public final class f extends c {
    public final com.yandex.plus.home.plaque.feature.internal.presentation.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlinx.coroutines.a aVar, com.yandex.plus.acquisition.sdk.common.api.di.b bVar, p pVar, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar, p pVar2, com.yandex.plus.bdui.plus.content.controller.f fVar2, com.yandex.plus.home.plaque.feature.internal.presentation.b bVar2) {
        super(aVar, bVar, pVar, fVar, cVar, pVar2);
        aVar.getClass();
        fVar2.getClass();
        this.k = bVar2;
        com.yandex.plus.bdui.flex.ui.a.j(new t((x0q) fVar2.b, 28), this.f, new d(this, null, 0));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c
    public final pjc d() {
        return (com.yandex.passport.common.mvi.d) this.k.d;
    }
}
