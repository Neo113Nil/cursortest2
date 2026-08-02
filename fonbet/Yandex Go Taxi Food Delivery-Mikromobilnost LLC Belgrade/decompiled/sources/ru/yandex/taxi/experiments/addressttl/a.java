package ru.yandex.taxi.experiments.addressttl;

import defpackage.i800;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final t1b0 a;

    public a(rqo rqoVar) {
        i800.Companion.getClass();
        this.a = ((jbh) rqoVar).e(i800.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MainScreenAddressTtlExperimentProvider$addressTtlMin$1 mainScreenAddressTtlExperimentProvider$addressTtlMin$1;
        int i;
        if (continuationImpl instanceof MainScreenAddressTtlExperimentProvider$addressTtlMin$1) {
            mainScreenAddressTtlExperimentProvider$addressTtlMin$1 = (MainScreenAddressTtlExperimentProvider$addressTtlMin$1) continuationImpl;
            int i2 = mainScreenAddressTtlExperimentProvider$addressTtlMin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenAddressTtlExperimentProvider$addressTtlMin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenAddressTtlExperimentProvider$addressTtlMin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenAddressTtlExperimentProvider$addressTtlMin$1.label;
                if (i != 0) {
                    b.b(obj);
                    mainScreenAddressTtlExperimentProvider$addressTtlMin$1.label = 1;
                    obj = this.a.b(mainScreenAddressTtlExperimentProvider$addressTtlMin$1);
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
                return new Integer(((i800) obj).c);
            }
        }
        mainScreenAddressTtlExperimentProvider$addressTtlMin$1 = new MainScreenAddressTtlExperimentProvider$addressTtlMin$1(this, continuationImpl);
        Object obj2 = mainScreenAddressTtlExperimentProvider$addressTtlMin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenAddressTtlExperimentProvider$addressTtlMin$1.label;
        if (i != 0) {
        }
        return new Integer(((i800) obj2).c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MainScreenAddressTtlExperimentProvider$isEnabled$1 mainScreenAddressTtlExperimentProvider$isEnabled$1;
        int i;
        if (continuationImpl instanceof MainScreenAddressTtlExperimentProvider$isEnabled$1) {
            mainScreenAddressTtlExperimentProvider$isEnabled$1 = (MainScreenAddressTtlExperimentProvider$isEnabled$1) continuationImpl;
            int i2 = mainScreenAddressTtlExperimentProvider$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenAddressTtlExperimentProvider$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenAddressTtlExperimentProvider$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenAddressTtlExperimentProvider$isEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    mainScreenAddressTtlExperimentProvider$isEnabled$1.label = 1;
                    obj = this.a.b(mainScreenAddressTtlExperimentProvider$isEnabled$1);
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
                return Boolean.valueOf(((i800) obj).b);
            }
        }
        mainScreenAddressTtlExperimentProvider$isEnabled$1 = new MainScreenAddressTtlExperimentProvider$isEnabled$1(this, continuationImpl);
        Object obj2 = mainScreenAddressTtlExperimentProvider$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenAddressTtlExperimentProvider$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((i800) obj2).b);
    }
}
