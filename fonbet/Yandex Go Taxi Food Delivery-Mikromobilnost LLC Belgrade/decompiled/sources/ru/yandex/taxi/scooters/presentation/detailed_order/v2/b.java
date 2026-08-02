package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.chn0;
import defpackage.ea90;
import defpackage.lrj0;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.vpr;
import defpackage.x6p0;
import defpackage.xgn0;
import defpackage.y6p0;
import defpackage.ygn0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ chn0 b;

    public b(vpr vprVar, chn0 chn0Var) {
        this.a = vprVar;
        this.b = chn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        if (r8.emit(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1 scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        x6p0 x6p0Var;
        if (continuation instanceof ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1) {
            scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1 = (ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1) continuation;
            int i2 = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label;
                chn0 chn0Var = this.b;
                Object obj3 = xgn0.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zuo0 zuo0Var = (zuo0) obj;
                    vprVar = this.a;
                    if (zuo0Var != null && ((zuo0Var instanceof lrj0) || (zuo0Var instanceof ea90))) {
                        y6p0 y6p0Var = chn0Var.g;
                        r7p0 number = zuo0Var.getNumber();
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$0 = null;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$1 = null;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$2 = null;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$3 = null;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$4 = vprVar;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$5 = null;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$6 = null;
                        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label = 1;
                        obj2 = ((com.yandex.go.scooters.misc.vehicle_actual_photo.domain.a) y6p0Var).a(number, scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1);
                    }
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$0 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$1 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$2 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$3 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$4 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$5 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$6 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                x6p0Var = (x6p0) obj2;
                if (x6p0Var != null) {
                    obj3 = new ygn0(x6p0Var, chn0Var.a.d());
                }
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$0 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$1 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$2 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$3 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$4 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$5 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$6 = null;
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label = 2;
            }
        }
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1 = new ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label;
        chn0 chn0Var2 = this.b;
        Object obj32 = xgn0.a;
        if (i != 0) {
        }
        x6p0Var = (x6p0) obj22;
        if (x6p0Var != null) {
        }
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$0 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$1 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$2 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$3 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$4 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$5 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.L$6 = null;
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$2$1.label = 2;
    }
}
