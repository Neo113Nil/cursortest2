package ru.yandex.taxi;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ e b;

    public b(kotlinx.coroutines.flow.n nVar, e eVar) {
        this.a = nVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1 pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1;
        int i;
        if (continuation instanceof PinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1) {
            pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1 = (PinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1) continuation;
            int i2 = pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.L$0 = null;
                    pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.L$1 = null;
                    pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.L$2 = null;
                    pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1) == coroutineSingletons) {
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
        pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1 = new PinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1(this, continuation);
        Object obj2 = pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinAbsenceFeatureProviderImpl$flowExperiment$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
