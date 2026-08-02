package ru.yandex.taxi.requirements.repository;

import defpackage.hqj0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ hqj0 b;

    public g(tpr tprVar, hqj0 hqj0Var) {
        this.a = tprVar;
        this.b = hqj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1 requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1) {
            requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1 = (RequirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1) continuation;
            int i2 = requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.L$0 = null;
                    requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.L$1 = null;
                    requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.L$2 = null;
                    requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1 = new RequirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsV2ExperimentRepository$experimentFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
