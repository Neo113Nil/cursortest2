package ru.yandex.taxi.logistics.deliveries.order;

import defpackage.bjz;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u501;
import defpackage.w201;
import defpackage.zuj0;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes14.dex */
public final class c implements u501 {
    public final f a;
    public final tt2 b;
    public final ru.yandex.taxi.delivery.b c;
    public final zuj0 d;

    public c(f fVar, tt2 tt2Var, ru.yandex.taxi.delivery.b bVar, zuj0 zuj0Var) {
        this.a = fVar;
        this.b = tt2Var;
        this.c = bVar;
        this.d = zuj0Var;
    }

    @Override // defpackage.u501
    public final tpr a(w201 w201Var) {
        return new rol0(new LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1(this, (bjz) w201Var, null));
    }
}
