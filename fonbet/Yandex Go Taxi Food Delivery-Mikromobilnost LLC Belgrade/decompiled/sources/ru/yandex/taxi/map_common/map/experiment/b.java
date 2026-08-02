package ru.yandex.taxi.map_common.map.experiment;

import com.adjust.sdk.Constants;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.nbj;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class b {
    public final nbj a;
    public final t1b0 b;

    public b(nbj nbjVar, rqo rqoVar) {
        this.a = nbjVar;
        this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.ENABLE_MAP_MODELS_OPTIMIZATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MapModelsOptimizationExperimentRepository$isModelsEnabled$1 mapModelsOptimizationExperimentRepository$isModelsEnabled$1;
        int i;
        if (continuationImpl instanceof MapModelsOptimizationExperimentRepository$isModelsEnabled$1) {
            mapModelsOptimizationExperimentRepository$isModelsEnabled$1 = (MapModelsOptimizationExperimentRepository$isModelsEnabled$1) continuationImpl;
            int i2 = mapModelsOptimizationExperimentRepository$isModelsEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapModelsOptimizationExperimentRepository$isModelsEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapModelsOptimizationExperimentRepository$isModelsEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapModelsOptimizationExperimentRepository$isModelsEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapModelsOptimizationExperimentRepository$isModelsEnabled$1.label = 1;
                    obj = this.b.b(mapModelsOptimizationExperimentRepository$isModelsEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.valueOf(!jl40.l(((com.yandex.go.performance_class.a) this.a).d(), Constants.LOW));
            }
        }
        mapModelsOptimizationExperimentRepository$isModelsEnabled$1 = new MapModelsOptimizationExperimentRepository$isModelsEnabled$1(this, continuationImpl);
        Object obj2 = mapModelsOptimizationExperimentRepository$isModelsEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapModelsOptimizationExperimentRepository$isModelsEnabled$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
