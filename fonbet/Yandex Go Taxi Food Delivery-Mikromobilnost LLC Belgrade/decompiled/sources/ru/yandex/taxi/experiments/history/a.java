package ru.yandex.taxi.experiments.history;

import defpackage.b660;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final t1b0 a;

    public a(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(b660.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NewOrderHistoryExperimentProvider$newHistoryUrl$2 newOrderHistoryExperimentProvider$newHistoryUrl$2;
        Object obj;
        int i;
        b660 b660Var;
        if (continuationImpl instanceof NewOrderHistoryExperimentProvider$newHistoryUrl$2) {
            newOrderHistoryExperimentProvider$newHistoryUrl$2 = (NewOrderHistoryExperimentProvider$newHistoryUrl$2) continuationImpl;
            int i2 = newOrderHistoryExperimentProvider$newHistoryUrl$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                newOrderHistoryExperimentProvider$newHistoryUrl$2.label = i2 - Integer.MIN_VALUE;
                obj = newOrderHistoryExperimentProvider$newHistoryUrl$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = newOrderHistoryExperimentProvider$newHistoryUrl$2.label;
                if (i != 0) {
                    b.b(obj);
                    newOrderHistoryExperimentProvider$newHistoryUrl$2.label = 1;
                    obj = this.a.b(newOrderHistoryExperimentProvider$newHistoryUrl$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (evu0.J(((b660) obj).b)) {
                    obj = null;
                }
                b660Var = (b660) obj;
                if (b660Var == null) {
                    return b660Var.b;
                }
                return null;
            }
        }
        newOrderHistoryExperimentProvider$newHistoryUrl$2 = new NewOrderHistoryExperimentProvider$newHistoryUrl$2(this, continuationImpl);
        obj = newOrderHistoryExperimentProvider$newHistoryUrl$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = newOrderHistoryExperimentProvider$newHistoryUrl$2.label;
        if (i != 0) {
        }
        if (evu0.J(((b660) obj).b)) {
        }
        b660Var = (b660) obj;
        if (b660Var == null) {
        }
    }
}
