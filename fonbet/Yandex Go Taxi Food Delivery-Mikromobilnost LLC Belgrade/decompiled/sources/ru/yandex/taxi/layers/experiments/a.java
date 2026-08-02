package ru.yandex.taxi.layers.experiments;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.zxx;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final rqo a;

    public a(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LayersClusterizationParametersExperimentProvider$isEnabled$1 layersClusterizationParametersExperimentProvider$isEnabled$1;
        int i;
        if (continuationImpl instanceof LayersClusterizationParametersExperimentProvider$isEnabled$1) {
            layersClusterizationParametersExperimentProvider$isEnabled$1 = (LayersClusterizationParametersExperimentProvider$isEnabled$1) continuationImpl;
            int i2 = layersClusterizationParametersExperimentProvider$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersClusterizationParametersExperimentProvider$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = layersClusterizationParametersExperimentProvider$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersClusterizationParametersExperimentProvider$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zxx.Companion.getClass();
                    t1b0 e = ((jbh) this.a).e(zxx.d);
                    layersClusterizationParametersExperimentProvider$isEnabled$1.label = 1;
                    obj = e.b(layersClusterizationParametersExperimentProvider$isEnabled$1);
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
                return Boolean.valueOf(((zxx) obj).b);
            }
        }
        layersClusterizationParametersExperimentProvider$isEnabled$1 = new LayersClusterizationParametersExperimentProvider$isEnabled$1(this, continuationImpl);
        Object obj2 = layersClusterizationParametersExperimentProvider$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersClusterizationParametersExperimentProvider$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((zxx) obj2).b);
    }
}
