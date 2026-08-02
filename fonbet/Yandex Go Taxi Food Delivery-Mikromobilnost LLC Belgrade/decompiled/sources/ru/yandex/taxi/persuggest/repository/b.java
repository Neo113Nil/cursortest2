package ru.yandex.taxi.persuggest.repository;

import defpackage.av0;
import defpackage.cvw;
import defpackage.f2t;
import defpackage.gci0;
import defpackage.hay0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hay0 hay0Var, av0 av0Var, ContinuationImpl continuationImpl) {
        TaxiServiceAvailabilityRepositoryKt$awaitLoadingState$1 taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1;
        int i;
        if (continuationImpl instanceof TaxiServiceAvailabilityRepositoryKt$awaitLoadingState$1) {
            taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1 = (TaxiServiceAvailabilityRepositoryKt$awaitLoadingState$1) continuationImpl;
            int i2 = taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gci0 gci0Var = ((f2t) hay0Var.a).g;
                    TaxiServiceAvailabilityRepositoryKt$awaitLoadingState$2 taxiServiceAvailabilityRepositoryKt$awaitLoadingState$2 = new TaxiServiceAvailabilityRepositoryKt$awaitLoadingState$2(2, av0Var, cvw.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/yandex/taxi/persuggest/repository/models/GeoSuggestLoadingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.L$0 = null;
                    taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.L$1 = null;
                    taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(gci0Var, taxiServiceAvailabilityRepositoryKt$awaitLoadingState$2, taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1 = new TaxiServiceAvailabilityRepositoryKt$awaitLoadingState$1(continuationImpl);
        Object obj2 = taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiServiceAvailabilityRepositoryKt$awaitLoadingState$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
