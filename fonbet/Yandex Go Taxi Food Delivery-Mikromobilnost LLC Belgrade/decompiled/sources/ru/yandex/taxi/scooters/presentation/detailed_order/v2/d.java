package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.sls;
import defpackage.tje;
import defpackage.zuo0;
import defpackage.zy11;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements sls {
    public final /* synthetic */ e a;
    public final /* synthetic */ zuo0 b;

    public /* synthetic */ d(e eVar, zuo0 zuo0Var) {
        this.a = eVar;
        this.b = zuo0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e eVar = this.a;
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$tryToCancelRidingTogetherSlowdownAndPurgeStateFlow$1(eVar, this.b, null), 3);
        return zy11.a;
    }
}
