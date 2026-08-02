package ru.yandex.taxi.masstransit.overlay.onmap;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Vehicle;
import defpackage.ah00;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y110;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x0062, B:14:0x0066, B:23:0x0042), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y110 y110Var, String str, ContinuationImpl continuationImpl) {
        StopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1 stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1;
        int i;
        Vehicle vehicle;
        try {
            if (continuationImpl instanceof StopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1) {
                stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1 = (StopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1) continuationImpl;
                int i2 = stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (str.length() != 0) {
                            List singletonList = Collections.singletonList(str);
                            y110Var.getClass();
                            ru.yandex.taxi.masstransit.datasource.source.b bVar = new ru.yandex.taxi.masstransit.datasource.source.b(new kotlinx.coroutines.flow.g(singletonList), y110Var);
                            stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.L$0 = null;
                            stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.L$1 = null;
                            stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.label = 1;
                            obj = kotlinx.coroutines.flow.e.A(bVar, stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    vehicle = (Vehicle) obj;
                    if (vehicle != null) {
                        return vehicle.getPosition();
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            vehicle = (Vehicle) obj;
            if (vehicle != null) {
            }
            return null;
        } catch (Exception e) {
            jst.e.k(e, "Error while getting a vehicle data");
            return null;
        }
        stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1 = new StopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1(continuationImpl);
        Object obj2 = stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1.label;
    }

    public static Object b(ah00 ah00Var, tt2 tt2Var, Point point, Point point2, float f, ContinuationImpl continuationImpl) {
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new StopVehicleMapFocusKt$focusStopAndVehicleOnMap$2(point, point2, ah00Var, f, 13.0f, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
