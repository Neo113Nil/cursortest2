package ru.yandex.taxi.logistics.dashboard;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.model.Zone;
import defpackage.ftx;
import defpackage.ny61;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final b a;
    public final com.yandex.go.route.interactor.b b;
    public final ftx c;

    public a(b bVar, com.yandex.go.route.interactor.b bVar2, ftx ftxVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = ftxVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:16|17))(5:18|(3:20|(1:22)|(3:24|(2:28|(1:30)(1:31))|13))|32|(3:26|28|(0)(0))|13)|12|13))|34|6|7|(0)(0)|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeliveryDashboardStartInteractor$onDashboardStart$1 deliveryDashboardStartInteractor$onDashboardStart$1;
        int i;
        int i2;
        Address h;
        Address address;
        if (continuationImpl instanceof DeliveryDashboardStartInteractor$onDashboardStart$1) {
            deliveryDashboardStartInteractor$onDashboardStart$1 = (DeliveryDashboardStartInteractor$onDashboardStart$1) continuationImpl;
            int i3 = deliveryDashboardStartInteractor$onDashboardStart$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                deliveryDashboardStartInteractor$onDashboardStart$1.label = i3 - Integer.MIN_VALUE;
                Object obj = deliveryDashboardStartInteractor$onDashboardStart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryDashboardStartInteractor$onDashboardStart$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.route.interactor.b bVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bVar.c().h() != null) {
                        ZoneAddress zoneAddress = bVar.c().a;
                        if ((zoneAddress != null ? zoneAddress.b : null) == null) {
                            i2 = 1;
                            if (i2 != 0 && (h = bVar.c().h()) != null) {
                                b bVar2 = this.a;
                                String zoneName = h.getZoneName();
                                zzs B = h.B();
                                deliveryDashboardStartInteractor$onDashboardStart$1.L$0 = h;
                                deliveryDashboardStartInteractor$onDashboardStart$1.I$0 = i2;
                                deliveryDashboardStartInteractor$onDashboardStart$1.label = 1;
                                obj = bVar2.d(zoneName, B, deliveryDashboardStartInteractor$onDashboardStart$1);
                                if (obj != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                address = h;
                            }
                            return zy11Var;
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                        b bVar22 = this.a;
                        String zoneName2 = h.getZoneName();
                        zzs B2 = h.B();
                        deliveryDashboardStartInteractor$onDashboardStart$1.L$0 = h;
                        deliveryDashboardStartInteractor$onDashboardStart$1.I$0 = i2;
                        deliveryDashboardStartInteractor$onDashboardStart$1.label = 1;
                        obj = bVar22.d(zoneName2, B2, deliveryDashboardStartInteractor$onDashboardStart$1);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                address = (Address) deliveryDashboardStartInteractor$onDashboardStart$1.L$0;
                kotlin.b.b(obj);
                Zone zone = (Zone) obj;
                bVar.m(new ZoneAddress(address, zone), null);
                this.c.a.l(zone);
                return zy11Var;
            }
        }
        deliveryDashboardStartInteractor$onDashboardStart$1 = new DeliveryDashboardStartInteractor$onDashboardStart$1(this, continuationImpl);
        Object obj2 = deliveryDashboardStartInteractor$onDashboardStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryDashboardStartInteractor$onDashboardStart$1.label;
        zy11 zy11Var2 = zy11.a;
        com.yandex.go.route.interactor.b bVar3 = this.b;
        if (i != 0) {
        }
        Zone zone2 = (Zone) obj2;
        bVar3.m(new ZoneAddress(address, zone2), null);
        this.c.a.l(zone2);
        return zy11Var2;
    }
}
