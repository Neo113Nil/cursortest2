package ru.yandex.taxi.altpins.order;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.taxi.order.models.api.objects.OriginalRequest;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.cwa1;
import defpackage.e02;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.gz1;
import defpackage.ief;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qy1;
import defpackage.rf00;
import defpackage.ry1;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ty1;
import defpackage.uyj;
import defpackage.zbd;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public final class e implements ty1 {
    public final tt2 a;
    public final ru.yandex.taxi.altpins.models.a b;
    public final e02 c;

    public e(tt2 tt2Var, ru.yandex.taxi.altpins.models.a aVar, e02 e02Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = e02Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0137 A[LOOP:0: B:13:0x0131->B:15:0x0137, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, gz1 gz1Var, ContinuationImpl continuationImpl) {
        AltpinDestinationOnMapInteractor$mapState$1 altpinDestinationOnMapInteractor$mapState$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        OrderStatusInfo orderStatusInfo;
        boolean z;
        OrderStatusInfo.AlternativeDestination alternativeDestination;
        ru.yandex.taxi.altpins.models.a aVar;
        Object obj2;
        List d;
        int i2;
        rf00 rf00Var;
        qy1 qy1Var;
        OrderStatusInfo.AlternativeDestination alternativeDestination2;
        Iterator it;
        eVar.getClass();
        ru.yandex.taxi.altpins.models.a aVar2 = eVar.b;
        if (continuationImpl instanceof AltpinDestinationOnMapInteractor$mapState$1) {
            altpinDestinationOnMapInteractor$mapState$1 = (AltpinDestinationOnMapInteractor$mapState$1) continuationImpl;
            int i3 = altpinDestinationOnMapInteractor$mapState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                altpinDestinationOnMapInteractor$mapState$1.label = i3 - Integer.MIN_VALUE;
                AltpinDestinationOnMapInteractor$mapState$1 altpinDestinationOnMapInteractor$mapState$12 = altpinDestinationOnMapInteractor$mapState$1;
                obj = altpinDestinationOnMapInteractor$mapState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = altpinDestinationOnMapInteractor$mapState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderStatusInfo = gz1Var.a;
                    DriveState driveState = gz1Var.b;
                    int i4 = (driveState == DriveState.TRANSPORTING || driveState == DriveState.COMPLETE) ? 1 : 0;
                    z = gz1Var.e;
                    if (z || !gz1Var.d || i4 == 0) {
                        return ry1.e;
                    }
                    alternativeDestination = orderStatusInfo.j0;
                    if (alternativeDestination == null) {
                        return ry1.e;
                    }
                    altpinDestinationOnMapInteractor$mapState$12.L$0 = null;
                    altpinDestinationOnMapInteractor$mapState$12.L$1 = orderStatusInfo;
                    altpinDestinationOnMapInteractor$mapState$12.L$2 = alternativeDestination;
                    altpinDestinationOnMapInteractor$mapState$12.I$0 = i4;
                    altpinDestinationOnMapInteractor$mapState$12.Z$0 = z;
                    altpinDestinationOnMapInteractor$mapState$12.label = 1;
                    rf00 rf00Var2 = alternativeDestination.b.b;
                    if (rf00Var2 == null) {
                        obj2 = qy1.f;
                        aVar = aVar2;
                    } else {
                        OriginalRequest originalRequest = orderStatusInfo.f;
                        Address address = (originalRequest == null || (d = originalRequest.d()) == null) ? null : (Address) kotlin.collections.a.b0(d);
                        ief iefVar = orderStatusInfo.K;
                        fef h = iefVar != null ? gwk0.h(iefVar) : null;
                        if (address == null || h == null) {
                            aVar = aVar2;
                            obj2 = qy1.f;
                        } else {
                            fef fefVar = h;
                            aVar = aVar2;
                            obj2 = aVar.e(rf00Var2, address, fefVar, false, altpinDestinationOnMapInteractor$mapState$12);
                        }
                    }
                    if (obj2 != coroutineSingletons) {
                        i2 = i4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qy1Var = (qy1) altpinDestinationOnMapInteractor$mapState$12.L$3;
                    alternativeDestination2 = (OrderStatusInfo.AlternativeDestination) altpinDestinationOnMapInteractor$mapState$12.L$2;
                    kotlin.b.b(obj);
                    qy1 qy1Var2 = (qy1) obj;
                    List list = alternativeDestination2.d;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(cwa1.d((zzs) it.next()));
                    }
                    return new ry1(qy1Var, qy1Var2, null, new WalkingRouteUiState(arrayList, alternativeDestination2.c, 0.0f, null, null, null, null, HProv.PP_SAME_MEDIA));
                }
                boolean z2 = altpinDestinationOnMapInteractor$mapState$12.Z$0;
                i2 = altpinDestinationOnMapInteractor$mapState$12.I$0;
                OrderStatusInfo.AlternativeDestination alternativeDestination3 = (OrderStatusInfo.AlternativeDestination) altpinDestinationOnMapInteractor$mapState$12.L$2;
                orderStatusInfo = (OrderStatusInfo) altpinDestinationOnMapInteractor$mapState$12.L$1;
                kotlin.b.b(obj);
                z = z2;
                alternativeDestination = alternativeDestination3;
                obj2 = obj;
                aVar = aVar2;
                qy1 qy1Var3 = (qy1) obj2;
                altpinDestinationOnMapInteractor$mapState$12.L$0 = null;
                altpinDestinationOnMapInteractor$mapState$12.L$1 = null;
                altpinDestinationOnMapInteractor$mapState$12.L$2 = alternativeDestination;
                altpinDestinationOnMapInteractor$mapState$12.L$3 = qy1Var3;
                altpinDestinationOnMapInteractor$mapState$12.I$0 = i2;
                altpinDestinationOnMapInteractor$mapState$12.Z$0 = z;
                altpinDestinationOnMapInteractor$mapState$12.label = 2;
                OrderStatusInfo.AlternativeDestination.Point point = alternativeDestination.a;
                rf00Var = point.b;
                if (rf00Var != null) {
                    obj = qy1.f;
                } else {
                    zgc0 zgc0Var = PlainAddress.Companion;
                    zzs zzsVar = point.a;
                    zgc0Var.getClass();
                    PlainAddress a = zgc0.a(zzsVar);
                    ief iefVar2 = orderStatusInfo.K;
                    fef h2 = iefVar2 != null ? gwk0.h(iefVar2) : null;
                    obj = h2 != null ? aVar.e(rf00Var, a, h2, false, altpinDestinationOnMapInteractor$mapState$12) : qy1.f;
                }
                if (obj != coroutineSingletons) {
                    qy1Var = qy1Var3;
                    alternativeDestination2 = alternativeDestination;
                    qy1 qy1Var22 = (qy1) obj;
                    List list2 = alternativeDestination2.d;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    return new ry1(qy1Var, qy1Var22, null, new WalkingRouteUiState(arrayList2, alternativeDestination2.c, 0.0f, null, null, null, null, HProv.PP_SAME_MEDIA));
                }
                return coroutineSingletons;
            }
        }
        altpinDestinationOnMapInteractor$mapState$1 = new AltpinDestinationOnMapInteractor$mapState$1(eVar, continuationImpl);
        AltpinDestinationOnMapInteractor$mapState$1 altpinDestinationOnMapInteractor$mapState$122 = altpinDestinationOnMapInteractor$mapState$1;
        obj = altpinDestinationOnMapInteractor$mapState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = altpinDestinationOnMapInteractor$mapState$122.label;
        if (i != 0) {
        }
        qy1 qy1Var32 = (qy1) obj2;
        altpinDestinationOnMapInteractor$mapState$122.L$0 = null;
        altpinDestinationOnMapInteractor$mapState$122.L$1 = null;
        altpinDestinationOnMapInteractor$mapState$122.L$2 = alternativeDestination;
        altpinDestinationOnMapInteractor$mapState$122.L$3 = qy1Var32;
        altpinDestinationOnMapInteractor$mapState$122.I$0 = i2;
        altpinDestinationOnMapInteractor$mapState$122.Z$0 = z;
        altpinDestinationOnMapInteractor$mapState$122.label = 2;
        OrderStatusInfo.AlternativeDestination.Point point2 = alternativeDestination.a;
        rf00Var = point2.b;
        if (rf00Var != null) {
        }
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final tpr b(o2y0 o2y0Var) {
        tpr t = kotlinx.coroutines.flow.e.t(new d(kotlinx.coroutines.flow.e.s(new b(o2y0Var.a()), new zbd(15)), this));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
