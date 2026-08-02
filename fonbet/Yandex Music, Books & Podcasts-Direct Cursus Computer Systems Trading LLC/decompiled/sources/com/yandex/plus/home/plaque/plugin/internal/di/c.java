package com.yandex.plus.home.plaque.plugin.internal.di;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w4;
import com.yandex.plus.home.repository.api.model.plusstate.e;
import com.yandex.plus.home.repository.api.model.plusstate.f;
import defpackage.b6e;
import defpackage.btf;
import defpackage.fkn;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class c {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public c(com.yandex.plus.core.imageloader.b bVar, fkn fknVar, com.yandex.plus.home.plaque.animator.internal.utils.a aVar, com.yandex.plus.log.api.b bVar2) {
        bVar2.getClass();
        this.a = btf.b(new w4(23));
        this.b = btf.b(new w4(24));
        this.c = btf.b(new w4(25));
    }

    public static final String a(c cVar, f fVar) {
        if (fVar instanceof com.yandex.plus.home.repository.api.model.plusstate.b) {
            return "Frozen";
        }
        if (fVar instanceof com.yandex.plus.home.repository.api.model.plusstate.c) {
            return "HasPlus";
        }
        if (fVar instanceof com.yandex.plus.home.repository.api.model.plusstate.d) {
            return "NoPlus";
        }
        if (fVar instanceof e) {
            return "Unauthorized";
        }
        b6e.s();
        return null;
    }

    public com.yandex.plus.log.api.b b() {
        return (com.yandex.plus.log.api.b) this.a.getValue();
    }

    public c(d dVar) {
        this.a = btf.b(new com.yandex.plus.home.graphql.configuration.a(12));
        this.b = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(12, dVar));
        this.c = btf.b(new com.yandex.plus.bdui.content.b(25, dVar, this));
    }

    public c() {
        this.a = btf.b(new com.yandex.plus.pay.internal.model.a(this));
        this.b = btf.b(new com.yandex.plus.paymentsdk.api.d(0, this));
        this.c = btf.b(new com.yandex.plus.paymentsdk.api.d(1, this));
    }
}
