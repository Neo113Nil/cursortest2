package ru.yandex.taxi.logistics.sdk.management.storage;

import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c {
    public final ru.yandex.taxi.logistics.sdk.dashboard.storage.c a;

    public c(ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DashboardBusinessStateInteractor$isEnabled$1 dashboardBusinessStateInteractor$isEnabled$1;
        int i;
        if (continuationImpl instanceof DashboardBusinessStateInteractor$isEnabled$1) {
            dashboardBusinessStateInteractor$isEnabled$1 = (DashboardBusinessStateInteractor$isEnabled$1) continuationImpl;
            int i2 = dashboardBusinessStateInteractor$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardBusinessStateInteractor$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dashboardBusinessStateInteractor$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardBusinessStateInteractor$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dashboardBusinessStateInteractor$isEnabled$1.label = 1;
                    obj = this.a.b(dashboardBusinessStateInteractor$isEnabled$1);
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
                return Boolean.valueOf(obj != null);
            }
        }
        dashboardBusinessStateInteractor$isEnabled$1 = new DashboardBusinessStateInteractor$isEnabled$1(this, continuationImpl);
        Object obj2 = dashboardBusinessStateInteractor$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardBusinessStateInteractor$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }
}
