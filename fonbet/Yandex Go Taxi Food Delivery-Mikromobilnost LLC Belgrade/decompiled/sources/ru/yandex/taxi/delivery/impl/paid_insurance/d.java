package ru.yandex.taxi.delivery.impl.paid_insurance;

import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.hit;
import defpackage.qv10;
import defpackage.tje;
import defpackage.ygi;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class d {
    public final ygi a;
    public final cne0 b;
    public final r0 c;
    public final r0 d;

    public d(ygi ygiVar, hit hitVar, dne0 dne0Var) {
        this.a = ygiVar;
        this.b = dne0Var.a("ru.yandex.taxi.deliveryPaidInsuranceRepository");
        r0 c = bvf0.c(Boolean.FALSE);
        this.c = c;
        this.d = c;
        tje.N(hitVar.a, null, null, new DeliveryPaidInsuranceRepositoryImpl$1(this, null), 3);
    }

    public final void a(boolean z) {
        this.b.u("KEY_DELIVERY_PAID_INSURANCE_STATE", z);
        qv10.B(z, this.c, null);
    }
}
