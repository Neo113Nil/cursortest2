package ru.yandex.taxi.masstransit.datasource.source;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y110;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.g;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ y110 b;

    public b(g gVar, y110 y110Var) {
        this.a = gVar;
        this.b = y110Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MassTransitVehiclesDataSource$getVehicles$$inlined$map$1$1 massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1;
        int i;
        if (continuation instanceof MassTransitVehiclesDataSource$getVehicles$$inlined$map$1$1) {
            massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1 = (MassTransitVehiclesDataSource$getVehicles$$inlined$map$1$1) continuation;
            int i2 = massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.L$0 = null;
                    massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.L$1 = null;
                    massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.L$2 = null;
                    massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1) == coroutineSingletons) {
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
        massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1 = new MassTransitVehiclesDataSource$getVehicles$$inlined$map$1$1(this, continuation);
        Object obj2 = massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitVehiclesDataSource$getVehicles$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
