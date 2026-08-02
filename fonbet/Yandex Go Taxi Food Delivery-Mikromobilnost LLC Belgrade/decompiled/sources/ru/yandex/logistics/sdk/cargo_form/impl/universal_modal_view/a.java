package ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.st2;
import defpackage.tje;
import defpackage.wi3;

/* loaded from: classes9.dex */
public final class a implements wi3 {
    public final com.yandex.delivery.utils.storage.impl.b a;
    public final ike b;

    public a(com.yandex.delivery.utils.storage.impl.b bVar, st2 st2Var) {
        this.a = bVar;
        this.b = bvf0.a(st2Var.b);
    }

    @Override // defpackage.wi3
    public final void a() {
        tje.N(this.b, null, null, new ModalViewAuthListener$onUnauthorized$1(this, null), 3);
    }
}
