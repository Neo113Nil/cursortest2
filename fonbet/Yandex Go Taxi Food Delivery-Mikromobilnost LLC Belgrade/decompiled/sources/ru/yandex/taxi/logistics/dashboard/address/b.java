package ru.yandex.taxi.logistics.dashboard.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.b4i;
import defpackage.k41;
import defpackage.qu;
import defpackage.sy60;
import defpackage.w511;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class b implements k41, sy60 {
    public final /* synthetic */ c a;
    public final /* synthetic */ PointType b;

    public b(c cVar, PointType pointType) {
        this.a = cVar;
        this.b = pointType;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.k41
    public final void d(Address address) {
        c cVar = this.a;
        com.yandex.go.route.interactor.b bVar = cVar.F;
        int i = b4i.a[this.b.ordinal()];
        if (i == 1) {
            bVar.m(new ZoneAddress(address, (Zone) null), null);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            bVar.l(address);
        }
        cVar.r(DeliveryDashboardAddressPickerRouter$mapListenerForAddressPickerRouter$1$onAddressPicked$1.b);
    }
}
