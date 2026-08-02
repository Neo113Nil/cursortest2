package ru.yandex.taxi.logistics.payment_method_selector.requirement;

import defpackage.ebx0;
import defpackage.iei;
import defpackage.tpr;
import defpackage.wt90;
import defpackage.wti;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.logistics.payment_method_selector.c;

/* loaded from: classes5.dex */
public final class a implements ebx0 {
    public final wti a;
    public final iei b;
    public final e c;
    public final wt90 d;
    public final c e;

    public a(wti wtiVar, iei ieiVar, e eVar, wt90 wt90Var, c cVar) {
        this.a = wtiVar;
        this.b = ieiVar;
        this.c = eVar;
        this.d = wt90Var;
        this.e = cVar;
    }

    @Override // defpackage.ebx0
    public final tpr a(tpr tprVar) {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(this.d.b, this.b.a(), this.c.a(), this.e.j, new PayOnDeliveryBadgeInteractor$badgesFlow$1(this, null)));
    }

    public final tpr b() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.m(this.d.b, this.b.a(), this.c.a(), this.e.j, new PayOnDeliveryBadgeInteractor$badgesFlow$1(this, null)));
    }
}
