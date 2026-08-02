package ru.yandex.taxi.experiments;

import defpackage.h1s;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class f implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ h1s b;

    public f(kotlinx.coroutines.flow.internal.g gVar, h1s h1sVar) {
        this.a = gVar;
        this.b = h1sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1 forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1) {
            forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1 = (ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1) continuation;
            int i2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.L$0 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.L$1 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.L$2 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(eVar, forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1) == coroutineSingletons) {
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
        forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1 = new ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
