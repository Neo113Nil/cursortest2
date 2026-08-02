package ru.yandex.taxi.order;

import defpackage.bz70;
import defpackage.hbp0;
import defpackage.m20;

/* loaded from: classes6.dex */
public final class j implements m20 {
    public final /* synthetic */ bz70 a;

    public j(bz70 bz70Var) {
        this.a = bz70Var;
    }

    @Override // defpackage.m20
    public final void b() {
        bz70 bz70Var = this.a;
        hbp0.e(bz70Var.d, null, null, new OrderListOverlayStateProvider$start$1$onActiveOrderListChanged$1(bz70Var, null), 3);
    }
}
