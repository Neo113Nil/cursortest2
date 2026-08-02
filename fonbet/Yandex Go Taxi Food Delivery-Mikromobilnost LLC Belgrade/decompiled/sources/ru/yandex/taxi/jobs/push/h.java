package ru.yandex.taxi.jobs.push;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.z8x;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;

/* loaded from: classes9.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public h(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ToggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1 toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ToggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1) {
            toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1 = (ToggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ToggleJobsExperiment.a aVar = ((ToggleJobsExperiment) obj).c;
                    this.b.getClass();
                    z8x h = j.h(aVar);
                    toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.L$0 = null;
                    toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.L$1 = null;
                    toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.L$2 = null;
                    toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.L$3 = null;
                    toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h, toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1 = new ToggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toggleJobsExperimentRepositoryImpl$getPushAckStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
