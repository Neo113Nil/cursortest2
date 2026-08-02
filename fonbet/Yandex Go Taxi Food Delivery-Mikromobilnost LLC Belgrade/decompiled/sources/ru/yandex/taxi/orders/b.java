package ru.yandex.taxi.orders;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.xsa0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final t1b0 a;

    public b(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(xsa0.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1 pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1;
        int i;
        if (continuationImpl instanceof PendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1) {
            pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1 = (PendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1) continuationImpl;
            int i2 = pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.label = 1;
                    obj = this.a.b(pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1);
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
                return Boolean.valueOf(((xsa0) obj).d);
            }
        }
        pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1 = new PendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1(this, continuationImpl);
        Object obj2 = pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pendingOrdersExperimentRepositoryImpl$shouldAwaitOnStartup$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((xsa0) obj2).d);
    }
}
