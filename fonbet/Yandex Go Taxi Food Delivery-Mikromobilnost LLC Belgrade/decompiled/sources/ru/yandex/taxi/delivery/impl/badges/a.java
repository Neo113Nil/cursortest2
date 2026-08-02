package ru.yandex.taxi.delivery.impl.badges;

import defpackage.ogi;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.logistics.payment_method_selector.requirement.a a;
    public final ogi b;

    public a(ru.yandex.taxi.logistics.payment_method_selector.requirement.a aVar, ogi ogiVar) {
        this.a = aVar;
        this.b = ogiVar;
    }

    public final m0 a() {
        return new m0(this.a.b(), ((ru.yandex.taxi.delivery.impl.paid_insurance.requirement.a) this.b).b(), new DeliverySummaryBadgesInteractorImpl$badgesFlow$1(3, null));
    }
}
