package ru.yandex.taxi.masstransit.orders;

import com.yandex.go.masstransit.sdk.order.impl.orders.k;
import defpackage.lz60;
import defpackage.qy2;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.am.m;

/* loaded from: classes9.dex */
public final class b implements lz60 {
    public final tse a;
    public final k b;
    public final m c;
    public final qy2 d;

    public b(tse tseVar, k kVar, m mVar, qy2 qy2Var) {
        this.a = tseVar;
        this.b = kVar;
        this.c = mVar;
        this.d = qy2Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        if (this.d.b()) {
            tje.N(this.a, null, null, new MasstransitOrdersActivityListener$onLargestContentfulPaint$1(this, null), 3);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "MasstransitOrdersActivityListener";
    }
}
