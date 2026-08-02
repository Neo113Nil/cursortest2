package ru.yandex.taxi.systemrequeirements.location;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;

    public k(m0 m0Var) {
        this.a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1 locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1) {
            locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1 = (LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1) continuation;
            int i2 = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.L$0 = null;
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.L$1 = null;
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.L$2 = null;
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(jVar, locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1) == coroutineSingletons) {
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
        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1 = new LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1(this, continuation);
        Object obj2 = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
