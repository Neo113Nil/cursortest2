package ru.yandex.taxi.superapp.address;

import com.yandex.go.address.models.Address;
import defpackage.jqr;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.uk10;
import defpackage.vh70;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class i {
    public final ru.yandex.taxi.superapp.orders.multi.a a;
    public final ru.yandex.taxi.search.suggest.i b;
    public final uk10 c;
    public final com.yandex.go.route.interactor.b d;
    public final ru.yandex.taxi.preorder.source.domain.a e;

    public i(ru.yandex.taxi.superapp.orders.multi.a aVar, ru.yandex.taxi.search.suggest.i iVar, uk10 uk10Var, com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.preorder.source.domain.a aVar2) {
        this.a = aVar;
        this.b = iVar;
        this.c = uk10Var;
        this.d = bVar;
        this.e = aVar2;
    }

    public static final vh70 a(i iVar, Address address) {
        if (!((Boolean) ((t1b0) iVar.c.a).c()).booleanValue()) {
            return vh70.e;
        }
        return new vh70(vh70.d, address.D1(), OrderAddressViewModel$State.DEFAULT);
    }

    public final tpr b() {
        return com.yandex.go.coroutines.b.d(new h(new jqr(this.b.j(RoutePointType.POINT_A, false), new OrderAddressInteractor$observeAddressState$1(this, null), 3), this), new OrderAddressInteractor$observeAddressState$3(this, null));
    }
}
