package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.b2k;
import defpackage.chn0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ chn0 b;

    public c(b2k b2kVar, chn0 chn0Var) {
        this.a = b2kVar;
        this.b = chn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1 scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1) {
            scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1 = (ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1) continuation;
            int i2 = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.L$0 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.L$1 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.L$2 = null;
                    scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1 = new ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
