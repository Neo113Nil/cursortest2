package com.yandex.passport.data.network;

import defpackage.i5f;
import defpackage.l3o;
import defpackage.zzq;

/* loaded from: classes4.dex */
public final class d9 implements com.yandex.passport.data.network.core.e {
    public final com.yandex.passport.common.a a;

    public d9(com.yandex.passport.common.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // com.yandex.passport.data.network.core.e
    public final com.yandex.passport.common.network.i g(l3o l3oVar) {
        l3oVar.getClass();
        if (l3oVar.d == 304) {
            throw com.yandex.passport.data.exceptions.k.a;
        }
        String q = com.yandex.plus.pay.ui.core.b.q(l3oVar);
        i5f i5fVar = com.yandex.passport.data.network.core.q.a;
        i5fVar.getClass();
        return com.yandex.plus.core.network.api.utils.a.x((com.yandex.passport.common.network.i) i5fVar.b(com.yandex.passport.common.network.i.Companion.serializer(c9.Companion.serializer(), com.yandex.passport.common.network.u.Companion.serializer()), q), new zzq(24, q, l3oVar, this));
    }
}
