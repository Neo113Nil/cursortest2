package ru.yandex.taxi.delivery.impl.paid_insurance.requirement;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ogi;
import defpackage.rgi;
import defpackage.tpr;
import defpackage.ygi;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.delivery.impl.paid_insurance.b;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;

/* loaded from: classes5.dex */
public final class a implements ogi {
    public final d a;
    public final rgi b;
    public final ygi c;

    public a(d dVar, rgi rgiVar, ygi ygiVar) {
        this.a = dVar;
        this.b = rgiVar;
        this.c = ygiVar;
    }

    @Override // defpackage.ebx0
    public final tpr a(tpr tprVar) {
        return e.t(new m0(this.a.d, new b(((k) this.c.a).j.b()), new DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1(this, null)));
    }

    public final tpr b() {
        return e.t(new m0(this.a.d, new b(((k) this.c.a).j.b()), new DeliveryPaidInsuranceBadgeInteractorImpl$badgesFlow$1(this, null)));
    }
}
