package ru.yandex.taxi.masstransit.geopayment.repository;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ d b;

    public c(b2k b2kVar, d dVar) {
        this.a = b2kVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1 mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1) {
            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1 = (MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1) continuation;
            int i2 = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.L$0 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.L$1 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.L$2 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1) == coroutineSingletons) {
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
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1 = new MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1(this, continuation);
        Object obj2 = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
