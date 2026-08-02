package ru.yandex.taxi.delivery.impl.paid_insurance;

import defpackage.ahi;
import defpackage.cne0;
import defpackage.dhi;
import defpackage.ehi;
import defpackage.i3y;
import defpackage.if9;
import defpackage.tje;
import defpackage.yvf0;
import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;

/* loaded from: classes5.dex */
public final class e extends dhi {
    public final yvf0 D;
    public final c E;
    public final i3y F = kotlin.a.a(new ehi(this, 0));
    public final ehi G = new ehi(this, 1);

    public e(if9 if9Var, c cVar) {
        this.D = if9Var;
        this.E = cVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ahi ahiVar = (ahi) obj;
        tje.N(o(), null, null, new DeliveryPaidInsuranceRouterImpl$onLaunch$1(this, ahiVar, null), 3);
        if (ahiVar.a == PaidInsuranceScreenSource.ORDER_BUTTON) {
            cne0 cne0Var = this.E.d.b;
            cne0Var.p(cne0Var.i("KEY_DELIVERY_PAID_INSURANCE_SCREEN_SHOW_COUNT", 0) + 1, "KEY_DELIVERY_PAID_INSURANCE_SCREEN_SHOW_COUNT");
        }
    }
}
