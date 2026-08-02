package ru.yandex.taxi.experiments;

import defpackage.ny61;
import defpackage.t1b0;
import defpackage.w96;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public interface q extends t1b0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object e(q qVar, Continuation continuation) {
        PersistentTypedBooleanExperimentProvider$isEnabled$1 persistentTypedBooleanExperimentProvider$isEnabled$1;
        int i;
        if (continuation instanceof PersistentTypedBooleanExperimentProvider$isEnabled$1) {
            persistentTypedBooleanExperimentProvider$isEnabled$1 = (PersistentTypedBooleanExperimentProvider$isEnabled$1) continuation;
            int i2 = persistentTypedBooleanExperimentProvider$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                persistentTypedBooleanExperimentProvider$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = persistentTypedBooleanExperimentProvider$isEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = persistentTypedBooleanExperimentProvider$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    persistentTypedBooleanExperimentProvider$isEnabled$1.L$0 = null;
                    persistentTypedBooleanExperimentProvider$isEnabled$1.label = 1;
                    obj = qVar.b(persistentTypedBooleanExperimentProvider$isEnabled$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((w96) obj).h());
            }
        }
        persistentTypedBooleanExperimentProvider$isEnabled$1 = new PersistentTypedBooleanExperimentProvider$isEnabled$1(qVar, continuation);
        Object obj3 = persistentTypedBooleanExperimentProvider$isEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = persistentTypedBooleanExperimentProvider$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((w96) obj3).h());
    }

    default Object f(Continuation continuation) {
        return e(this, continuation);
    }
}
