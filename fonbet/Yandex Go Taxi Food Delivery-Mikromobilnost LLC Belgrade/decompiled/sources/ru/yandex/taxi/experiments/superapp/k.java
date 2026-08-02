package ru.yandex.taxi.experiments.superapp;

import defpackage.jbh;
import defpackage.k5w0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class k {
    public final t1b0 a;

    public k(rqo rqoVar) {
        k5w0.Companion.getClass();
        this.a = ((jbh) rqoVar).e(k5w0.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1 superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1;
        int i;
        if (continuationImpl instanceof SuperAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1) {
            superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1 = (SuperAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1) continuationImpl;
            int i2 = superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.label = 1;
                    obj = this.a.b(superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1);
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
                return Boolean.valueOf(((k5w0) obj).b);
            }
        }
        superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1 = new SuperAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1(this, continuationImpl);
        Object obj2 = superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppOptimizationsExperimentRepositoryImpl$shouldPrefetchStartAppDocument$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((k5w0) obj2).b);
    }
}
