package com.yandex.plus.bdui.plus.checkout;

import com.yandex.plus.home.internal.di.y;
import defpackage.btf;
import defpackage.jyr;
import defpackage.os;

/* loaded from: classes4.dex */
public final class m implements com.yandex.plus.bdui.plus.e {
    public final jyr a;

    public m(com.yandex.plus.pay.ui.core.api.common.a aVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar2, y yVar, com.yandex.plus.bdui.plus.checkout.action.a aVar3, com.yandex.plus.log.api.b bVar2) {
        this.a = btf.b(new os(aVar, bVar, aVar2, yVar, aVar3, bVar2, 5));
    }

    @Override // com.yandex.plus.bdui.plus.e
    public final com.yandex.plus.bdui.plus.content.j a(com.yandex.plus.bdui.failure.d dVar) {
        dVar.getClass();
        return new com.yandex.plus.bdui.plus.content.j(dVar);
    }

    public final com.yandex.plus.bdui.content.c b() {
        return (com.yandex.plus.bdui.content.c) this.a.getValue();
    }
}
