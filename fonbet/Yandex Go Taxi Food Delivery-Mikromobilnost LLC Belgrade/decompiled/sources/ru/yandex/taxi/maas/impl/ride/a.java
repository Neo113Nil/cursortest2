package ru.yandex.taxi.maas.impl.ride;

import com.yandex.go.address.models.Address;
import defpackage.jst;
import defpackage.m000;
import defpackage.pv0;
import defpackage.qu;
import defpackage.r71;
import defpackage.unr0;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class a implements r71 {
    public final /* synthetic */ b a;
    public final /* synthetic */ m000 b;

    public a(b bVar, m000 m000Var) {
        this.a = bVar;
        this.b = m000Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.l51
    public final void a1(pv0 pv0Var) {
        b bVar = this.a;
        com.yandex.go.coroutines.b.g(bVar.o(), null, null, new MaasRideRouterImpl$onDestinationAddressPicked$1(bVar, pv0Var, this.b, null), 3);
    }

    @Override // defpackage.l51
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        unr0.z(jst.e, "pointOnMap() is configured to be disabled");
    }

    @Override // defpackage.r71
    public final void o(String str) {
        unr0.z(jst.e, "onDeeplinkClicked() is configured to be disbled");
    }

    @Override // defpackage.r71
    public final void q() {
        unr0.z(jst.e, "onAddressPicked() is configured to be disbled");
    }
}
