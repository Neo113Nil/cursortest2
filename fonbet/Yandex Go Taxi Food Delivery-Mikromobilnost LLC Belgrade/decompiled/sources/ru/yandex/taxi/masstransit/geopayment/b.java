package ru.yandex.taxi.masstransit.geopayment;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tu30;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes6.dex */
public final class b {
    public final com.yandex.go.zone.interactors.b a;
    public final po21 b;
    public final tu30 c;

    public b(com.yandex.go.zone.interactors.b bVar, po21 po21Var, tu30 tu30Var) {
        this.a = bVar;
        this.b = po21Var;
        this.c = tu30Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:18|19))(3:20|21|22))(5:25|26|27|15|16))(7:28|29|(5:31|(2:33|(1:35))|36|(5:38|(1:40)|27|15|16)(2:41|(1:43)(2:44|22))|24)|45|36|(0)(0)|24)))|50|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r9 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        defpackage.jst.e.g("BleGeoPayment:ZoneFetch", "BleGeoPayment", defpackage.g8e.o("fetchZoneOrGetCache: failed — ", r8.getMessage()), r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e A[Catch: Exception -> 0x00a2, CancellationException -> 0x00b9, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00b9, Exception -> 0x00a2, blocks: (B:13:0x002e, B:14:0x009f, B:21:0x0041, B:22:0x0090, B:26:0x0049, B:27:0x0079, B:29:0x0050, B:31:0x005a, B:33:0x0062, B:35:0x0066, B:38:0x006e, B:41:0x007c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[Catch: Exception -> 0x00a2, CancellationException -> 0x00b9, TryCatch #2 {CancellationException -> 0x00b9, Exception -> 0x00a2, blocks: (B:13:0x002e, B:14:0x009f, B:21:0x0041, B:22:0x0090, B:26:0x0049, B:27:0x0079, B:29:0x0050, B:31:0x005a, B:33:0x0062, B:35:0x0066, B:38:0x006e, B:41:0x007c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MasstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1 masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1;
        int i;
        String str;
        com.yandex.go.zone.interactors.b bVar;
        if (continuationImpl instanceof MasstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1) {
            masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1 = (MasstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1) continuationImpl;
            int i2 = masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ZoneAddress zoneAddress = this.c.a().a;
                    if (zoneAddress != null) {
                        str = zoneAddress.a.getZoneName();
                        if (str == null) {
                            Zone zone = zoneAddress.b;
                            if (zone != null) {
                                str = zone.a;
                            }
                        }
                        com.yandex.go.zone.interactors.b bVar2 = this.a;
                        if (str == null) {
                            masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                            masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label = 1;
                            obj = bVar2.a(str, masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1);
                            if (obj == coroutineSingletons) {
                            }
                            return zy11.a;
                        }
                        po21 po21Var = this.b;
                        masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                        masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$1 = bVar2;
                        masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label = 2;
                        Object h = ((e) po21Var).h(masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1);
                        if (h != coroutineSingletons) {
                            obj = h;
                            bVar = bVar2;
                            masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                            masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$1 = null;
                            masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label = 3;
                            obj = bVar.c((mo21) obj, masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1);
                        }
                        return coroutineSingletons;
                    }
                    str = null;
                    com.yandex.go.zone.interactors.b bVar22 = this.a;
                    if (str == null) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                bVar = (com.yandex.go.zone.interactors.b) masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$1;
                kotlin.b.b(obj);
                masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$0 = null;
                masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.L$1 = null;
                masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label = 3;
                obj = bVar.c((mo21) obj, masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1);
            }
        }
        masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1 = new MasstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1(this, continuationImpl);
        Object obj2 = masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitBleGeoPaymentZoneFetcher$fetchZoneOrGetCache$1.label;
        if (i != 0) {
        }
    }
}
