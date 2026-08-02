package ru.yandex.taxi.logistics.care.impl.experiments;

import defpackage.i3y;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.xn3;
import defpackage.xs8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final i3y a;

    public a(rqo rqoVar) {
        this.a = kotlin.a.a(new xn3(rqoVar, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeliveryCareCookiesUpdaterExperimentProvider$isEnabled$1 deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1;
        int i;
        if (continuationImpl instanceof DeliveryCareCookiesUpdaterExperimentProvider$isEnabled$1) {
            deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1 = (DeliveryCareCookiesUpdaterExperimentProvider$isEnabled$1) continuationImpl;
            int i2 = deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.a.getValue();
                    deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.label = 1;
                    obj = t1b0Var.b(deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1);
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
                return Boolean.valueOf(((xs8) obj).b);
            }
        }
        deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1 = new DeliveryCareCookiesUpdaterExperimentProvider$isEnabled$1(this, continuationImpl);
        Object obj2 = deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareCookiesUpdaterExperimentProvider$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((xs8) obj2).b);
    }
}
