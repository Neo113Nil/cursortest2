package ru.yandex.taxi.masstransit.experiment;

import defpackage.as30;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class e {
    public final a a;
    public final t1b0 b;

    public e(rqo rqoVar, a aVar) {
        this.a = aVar;
        as30.Companion.getClass();
        this.b = ((jbh) rqoVar).e(new as30(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.a.a(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1 mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1;
        int i;
        if (continuationImpl instanceof MtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1) {
            mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1 = (MtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1) continuationImpl;
            int i2 = mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label = 2;
                Object b = this.b.b(mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1 = new MtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1(this, continuationImpl);
        Object obj2 = mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label;
        if (i != 0) {
        }
        mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1.label = 2;
        Object b2 = this.b.b(mtPaymentsUniversalCheckoutExperimentRepository$getExperiment$1);
        if (b2 != coroutineSingletons2) {
        }
    }
}
