package ru.yandex.taxi.experiments;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.h1s;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h1s b;

    public g(vpr vprVar, h1s h1sVar) {
        this.a = vprVar;
        this.b = h1sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1 forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1) {
            forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1 = (ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1) continuation;
            int i2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(this.b.b.b() && ((TaxiOrder) obj).V().f(SimpleBooleanExperiment.FORCED_LIVE_LOCATION));
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.L$0 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.L$1 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.L$2 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.L$3 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1 = new ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
