package ru.yandex.taxi.superapp.orders.multi;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.dd61;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.svd0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes10.dex */
public final class a {
    public final svd0 a;
    public final ru.yandex.taxi.location.user.c b;
    public final com.yandex.go.route.interactor.c c;
    public final com.yandex.go.zone.interactors.b d;

    public a(svd0 svd0Var, ru.yandex.taxi.location.user.c cVar, com.yandex.go.route.interactor.c cVar2, com.yandex.go.zone.interactors.b bVar) {
        this.a = svd0Var;
        this.b = cVar;
        this.c = cVar2;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r1 == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AddressOnMultiorderInteractor$provideActualSourceAddress$1 addressOnMultiorderInteractor$provideActualSourceAddress$1;
        int i;
        if (continuationImpl instanceof AddressOnMultiorderInteractor$provideActualSourceAddress$1) {
            addressOnMultiorderInteractor$provideActualSourceAddress$1 = (AddressOnMultiorderInteractor$provideActualSourceAddress$1) continuationImpl;
            int i2 = addressOnMultiorderInteractor$provideActualSourceAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressOnMultiorderInteractor$provideActualSourceAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressOnMultiorderInteractor$provideActualSourceAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressOnMultiorderInteractor$provideActualSourceAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ZoneAddress zoneAddress = this.c.c().a;
                    if (zoneAddress != null) {
                        return zoneAddress;
                    }
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    addressOnMultiorderInteractor$provideActualSourceAddress$1.L$0 = null;
                    addressOnMultiorderInteractor$provideActualSourceAddress$1.label = 1;
                    obj = this.b.a(routePointType, addressOnMultiorderInteractor$provideActualSourceAddress$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((dd61) obj).a();
                    }
                    kotlin.b.b(obj);
                }
                pv0 pv0Var = new pv0((Address) obj, null, null, null, null, null, null, null, 1022);
                addressOnMultiorderInteractor$provideActualSourceAddress$1.L$0 = null;
                addressOnMultiorderInteractor$provideActualSourceAddress$1.L$1 = null;
                addressOnMultiorderInteractor$provideActualSourceAddress$1.label = 2;
                obj = ((ru.yandex.taxi.preorder.source.sourcepointzone.a) this.a).a(pv0Var, true, addressOnMultiorderInteractor$provideActualSourceAddress$1);
            }
        }
        addressOnMultiorderInteractor$provideActualSourceAddress$1 = new AddressOnMultiorderInteractor$provideActualSourceAddress$1(this, continuationImpl);
        Object obj2 = addressOnMultiorderInteractor$provideActualSourceAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressOnMultiorderInteractor$provideActualSourceAddress$1.label;
        if (i != 0) {
        }
        pv0 pv0Var2 = new pv0((Address) obj2, null, null, null, null, null, null, null, 1022);
        addressOnMultiorderInteractor$provideActualSourceAddress$1.L$0 = null;
        addressOnMultiorderInteractor$provideActualSourceAddress$1.L$1 = null;
        addressOnMultiorderInteractor$provideActualSourceAddress$1.label = 2;
        obj2 = ((ru.yandex.taxi.preorder.source.sourcepointzone.a) this.a).a(pv0Var2, true, addressOnMultiorderInteractor$provideActualSourceAddress$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AddressOnMultiorderInteractor$provideActualSourceAddressWithZone$1 addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1;
        int i;
        ZoneAddress zoneAddress;
        Address address;
        if (continuationImpl instanceof AddressOnMultiorderInteractor$provideActualSourceAddressWithZone$1) {
            addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1 = (AddressOnMultiorderInteractor$provideActualSourceAddressWithZone$1) continuationImpl;
            int i2 = addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.label = 1;
                    obj = a(addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        address = (Address) addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.L$1;
                        kotlin.b.b(obj);
                        return new ZoneAddress(address, (Zone) obj);
                    }
                    kotlin.b.b(obj);
                }
                zoneAddress = (ZoneAddress) obj;
                if (zoneAddress.b == null) {
                    return zoneAddress;
                }
                Address address2 = zoneAddress.a;
                String zoneName = address2.getZoneName();
                zzs B = address2.B();
                addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.L$0 = null;
                addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.L$1 = address2;
                addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.label = 2;
                Object d = this.d.d(zoneName, B, addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1);
                if (d != obj2) {
                    obj = d;
                    address = address2;
                    return new ZoneAddress(address, (Zone) obj);
                }
                return obj2;
            }
        }
        addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1 = new AddressOnMultiorderInteractor$provideActualSourceAddressWithZone$1(this, continuationImpl);
        Object obj3 = addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressOnMultiorderInteractor$provideActualSourceAddressWithZone$1.label;
        if (i != 0) {
        }
        zoneAddress = (ZoneAddress) obj3;
        if (zoneAddress.b == null) {
        }
    }
}
