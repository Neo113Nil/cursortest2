package ru.yandex.taxi.masstransit.experiment;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d0 b;

    public z(vpr vprVar, d0 d0Var) {
        this.a = vprVar;
        this.b = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1 transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TransportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1) {
            transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1 = (TransportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1) continuation;
            int i2 = transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TransportOnSummaryExperiment transportOnSummaryExperiment = (TransportOnSummaryExperiment) obj;
                    if (!transportOnSummaryExperiment.b) {
                        transportOnSummaryExperiment = null;
                    }
                    if (transportOnSummaryExperiment == null) {
                        transportOnSummaryExperiment = this.b.b;
                    }
                    transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.L$0 = null;
                    transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.L$1 = null;
                    transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.L$2 = null;
                    transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.L$3 = null;
                    transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(transportOnSummaryExperiment, transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1 = new TransportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportOnSummaryExperimentRepository$experimentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
