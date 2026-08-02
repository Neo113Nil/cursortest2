package ru.yandex.taxi.map_common.map.experiment;

import defpackage.jbh;
import defpackage.jk00;
import defpackage.ny61;
import defpackage.rqo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes9.dex */
public final class a {
    public final q a;

    public a(rqo rqoVar) {
        this.a = ((jbh) rqoVar).d(jk00.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MapKitDataSaverModeExperimentRepository$isFeatureEnabled$1 mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1;
        int i;
        if (continuationImpl instanceof MapKitDataSaverModeExperimentRepository$isFeatureEnabled$1) {
            mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1 = (MapKitDataSaverModeExperimentRepository$isFeatureEnabled$1) continuationImpl;
            int i2 = mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.label = 1;
                    obj = this.a.b(mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1);
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
                return Boolean.valueOf(((jk00) obj).b);
            }
        }
        mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1 = new MapKitDataSaverModeExperimentRepository$isFeatureEnabled$1(this, continuationImpl);
        Object obj2 = mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitDataSaverModeExperimentRepository$isFeatureEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((jk00) obj2).b);
    }
}
