package ru.yandex.taxi.linked_order.provider;

import defpackage.czo0;
import defpackage.hbp0;
import defpackage.wl40;

/* loaded from: classes6.dex */
public final class h {
    public final com.yandex.go.superapp.order.multi.old.provider.g a;
    public wl40 b = wl40.j;
    public final hbp0 c = new hbp0(new czo0(14), "", null);

    public h(com.yandex.go.superapp.order.multi.old.provider.g gVar) {
        this.a = gVar;
    }

    public final void a() {
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new LastActiveLinkedOrderRepository$attach$1(this, null), 3);
    }
}
