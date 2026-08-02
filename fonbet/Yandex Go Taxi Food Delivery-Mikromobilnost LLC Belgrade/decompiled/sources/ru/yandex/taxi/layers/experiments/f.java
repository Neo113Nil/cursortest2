package ru.yandex.taxi.layers.experiments;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f {
    public final rqo a;

    public f(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LayersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1 layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1;
        Object obj;
        int i;
        LayersObjectsAnimationParamsExperiment layersObjectsAnimationParamsExperiment;
        if (continuationImpl instanceof LayersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1) {
            layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1 = (LayersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1) continuationImpl;
            int i2 = layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.label = i2 - Integer.MIN_VALUE;
                obj = layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LayersObjectsAnimationParamsExperiment.Companion.getClass();
                    t1b0 e = ((jbh) this.a).e(LayersObjectsAnimationParamsExperiment.d);
                    layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.label = 1;
                    obj = e.b(layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1);
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
                if (!((LayersObjectsAnimationParamsExperiment) obj).b) {
                    obj = null;
                }
                layersObjectsAnimationParamsExperiment = (LayersObjectsAnimationParamsExperiment) obj;
                if (layersObjectsAnimationParamsExperiment == null) {
                    return layersObjectsAnimationParamsExperiment.c;
                }
                return null;
            }
        }
        layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1 = new LayersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1(this, continuationImpl);
        obj = layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersObjectsAnimationParamsExperimentProvider$getAnimationParamsOrNull$1.label;
        if (i != 0) {
        }
        if (!((LayersObjectsAnimationParamsExperiment) obj).b) {
        }
        layersObjectsAnimationParamsExperiment = (LayersObjectsAnimationParamsExperiment) obj;
        if (layersObjectsAnimationParamsExperiment == null) {
        }
    }
}
