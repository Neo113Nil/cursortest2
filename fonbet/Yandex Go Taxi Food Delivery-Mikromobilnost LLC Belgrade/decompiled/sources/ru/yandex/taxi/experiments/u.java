package ru.yandex.taxi.experiments;

import defpackage.jbh;
import defpackage.jl40;
import defpackage.nm21;
import defpackage.ny61;
import defpackage.qm21;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class u {
    public final t1b0 a;

    public u(rqo rqoVar) {
        qm21.Companion.getClass();
        this.a = ((jbh) rqoVar).e(qm21.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserFingerprintExperimentRepository$collectionConfig$1 userFingerprintExperimentRepository$collectionConfig$1;
        int i;
        if (continuationImpl instanceof UserFingerprintExperimentRepository$collectionConfig$1) {
            userFingerprintExperimentRepository$collectionConfig$1 = (UserFingerprintExperimentRepository$collectionConfig$1) continuationImpl;
            int i2 = userFingerprintExperimentRepository$collectionConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userFingerprintExperimentRepository$collectionConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userFingerprintExperimentRepository$collectionConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userFingerprintExperimentRepository$collectionConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userFingerprintExperimentRepository$collectionConfig$1.label = 1;
                    obj = this.a.b(userFingerprintExperimentRepository$collectionConfig$1);
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
                qm21 qm21Var = (qm21) obj;
                qm21.Companion.getClass();
                boolean z = jl40.l(qm21Var, qm21.d) && qm21Var.b;
                return new nm21(z, !z && qm21Var.c);
            }
        }
        userFingerprintExperimentRepository$collectionConfig$1 = new UserFingerprintExperimentRepository$collectionConfig$1(this, continuationImpl);
        Object obj2 = userFingerprintExperimentRepository$collectionConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userFingerprintExperimentRepository$collectionConfig$1.label;
        if (i != 0) {
        }
        qm21 qm21Var2 = (qm21) obj2;
        qm21.Companion.getClass();
        if (jl40.l(qm21Var2, qm21.d)) {
        }
        return new nm21(z, !z && qm21Var2.c);
    }
}
