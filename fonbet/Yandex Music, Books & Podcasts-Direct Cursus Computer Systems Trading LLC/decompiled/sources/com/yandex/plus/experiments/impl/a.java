package com.yandex.plus.experiments.impl;

import com.yandex.plus.bdui.plus.checkout.h;
import com.yandex.plus.core.graphql.daily.progress.s;
import com.yandex.plus.experiments.api.b;
import com.yandex.plus.experiments.api.cache.c;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes4.dex */
public final class a {
    public final b a;
    public final jyr b = btf.b(new h(21, this));
    public final jyr c = btf.b(new s(17, this));

    public a(b bVar) {
        this.a = bVar;
    }

    public final com.yandex.plus.experiments.impl.providers.h a(com.yandex.plus.experiments.api.providers.a aVar, c cVar, c cVar2) {
        aVar.getClass();
        b bVar = this.a;
        return new com.yandex.plus.experiments.impl.providers.h(bVar.b, bVar.c, bVar.d, (com.yandex.plus.experiments.impl.mappers.a) this.c.getValue(), aVar, cVar, cVar2, bVar.i);
    }
}
