package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import ru.yandex.taxi.masstransit.main.router.b;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class to30 implements kc30 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public to30(PointType pointType, b bVar, Address address) {
        this.b = pointType;
        this.c = bVar;
        this.w = address;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        PointType pointType = this.b;
        Object obj = this.w;
        switch (i) {
            case 0:
                Address address = (Address) obj;
                if (pointType == PointType.SOURCE && address != null) {
                    ((wu30) ((b) this.c).G.get()).i(new ZoneAddress(address, 2));
                    break;
                }
                break;
            default:
                ru.yandex.taxi.masstransit.stop.router.b.U((ru.yandex.taxi.masstransit.stop.router.b) obj, pointType);
                break;
        }
    }

    @Override // defpackage.kc30
    public final void d(Address address) {
        int i = this.a;
        PointType pointType = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                h3y h3yVar = bVar.G;
                int i2 = so30.a[pointType.ordinal()];
                if (i2 == 1) {
                    ((wu30) h3yVar.get()).i(new ZoneAddress(address, 2));
                    break;
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    ((wu30) h3yVar.get()).d(address);
                    bVar.r(new pi30(9));
                    break;
                }
            default:
                ru.yandex.taxi.masstransit.stop.router.b bVar2 = (ru.yandex.taxi.masstransit.stop.router.b) this.w;
                int i3 = a240.a[((lc30) obj).a.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        w511.b();
                        break;
                    } else {
                        ((wu30) bVar2.K.get()).d(address);
                    }
                }
                ru.yandex.taxi.masstransit.stop.router.b.U(bVar2, pointType);
                break;
        }
    }

    public to30(lc30 lc30Var, ru.yandex.taxi.masstransit.stop.router.b bVar, PointType pointType) {
        this.c = lc30Var;
        this.w = bVar;
        this.b = pointType;
    }
}
